package com.focustech.cookinglove.interceptor.mybatis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.crypto.spec.IvParameterSpec;

import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.ExecutorException;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;

import com.focustech.cookinglove.base.Page;
import com.focustech.cookinglove.base.PageContextHandler;
import com.focustech.cookinglove.tool.ReflectHelper;

@Intercepts({@Signature(type=Executor.class,method="query",args={MappedStatement.class,Object.class,RowBounds.class,ResultHandler.class})})
public class PaginationInterceptor implements Interceptor {

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		MappedStatement mappedStatement=(MappedStatement) invocation.getArgs()[0];
		Object parameter=invocation.getArgs()[1];
		RowBounds rowsBounds=(RowBounds) invocation.getArgs()[2];
		ResultHandler resultHandler=(ResultHandler) invocation.getArgs()[3];
		
		BoundSql boundSql=mappedStatement.getBoundSql(parameter);
		if(boundSql==null || boundSql.getSql()==null || "".equals(boundSql.getSql())){
			return null;
		}
		String originalSql=boundSql.getSql().trim();
		Object parameterObject=boundSql.getParameterObject();
		
		Page page=null;
		if(parameterObject!=null){
			page=(Page) ReflectHelper.isPage(parameterObject, "page");
		}
		if(page==null && PageContextHandler.getPage().isPagination()){
			page=PageContextHandler.getPage();
		}
		if(page!=null && page.isPagination()){
			//分页
			int totalRows=page.getTotalRows();
			if(totalRows==0){
				StringBuffer countSql=new StringBuffer();
				countSql.append("select count(1) from (").append(originalSql).append(") t");
				Connection connection=mappedStatement.getConfiguration().getEnvironment().getDataSource().getConnection();
				BoundSql countBS=new BoundSql(mappedStatement.getConfiguration(), countSql.toString(),boundSql.getParameterMappings() , parameterObject);
				PreparedStatement preparedStatement= connection.prepareStatement(countSql.toString());
			}
		}
		
		// TODO Auto-generated method stub
		return null;
	}

	private void setParameters(PreparedStatement preparedStatement,MappedStatement mappedStatement,BoundSql boundSql,Object parameterObject) throws SQLException{
		ErrorContext.instance().activity("setting parameters").object(mappedStatement.getParameterMap().getId());
		List<ParameterMapping> parameterMappings=boundSql.getParameterMappings();
		if(parameterMappings!=null){
			Configuration configuration=mappedStatement.getConfiguration();
			TypeHandlerRegistry typeHandlerRegistry=configuration.getTypeHandlerRegistry();
			MetaObject metaObject=parameterObject==null?null:configuration.newMetaObject(parameterObject);
			for(int i=0;i<parameterMappings.size();i++){
				ParameterMapping parameterMapping=parameterMappings.get(i);
				if(parameterMapping.getMode()!=ParameterMode.OUT){
					Object value;
					String propertyName=parameterMapping.getProperty();
					PropertyTokenizer propertyTokenizer=new PropertyTokenizer(propertyName);
					if(parameterObject==null){
						value=null;
					}else if(typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())){
						value=parameterObject;
					}else if(boundSql.hasAdditionalParameter(propertyName)){
						value=boundSql.getAdditionalParameter(propertyName);
					}else if(propertyName.startsWith(ForEachSqlNode.ITEM_PREFIX) && boundSql.hasAdditionalParameter(propertyTokenizer.getName())){
						value=boundSql.getAdditionalParameter(propertyTokenizer.getName());
						if(value!=null){
							value=configuration.newMetaObject(value).getValue(propertyName.substring(propertyTokenizer.getName().length()));
						}
					}else{
						value=metaObject==null?null:metaObject.getValue(propertyName);
					}
					TypeHandler typeHandler=parameterMapping.getTypeHandler();
					if(typeHandler==null){
						throw new ExecutorException("there was no TypeHandler found for parameter "+propertyName+" of statement "+mappedStatement.getId());
					}
					typeHandler.setParameter(preparedStatement, i+1, value, parameterMapping.getJdbcType());
				}
			}
		}
	}
	
//	 private MappedStatement copyFromMappedStatement(MappedStatement ms,   
//    		 SqlSource newSqlSource) {   
//    		Builder builder = new MappedStatement.Builder(ms.getConfiguration(),   
//    		ms.getId(), newSqlSource, ms.getSqlCommandType());   
//    		builder.resource(ms.getResource());   
//    		builder.fetchSize(ms.getFetchSize());   
//    		builder.statementType(ms.getStatementType());   
//    		builder.keyGenerator(ms.getKeyGenerator());   
//    		builder.keyProperty(ms.getKeyProperty());   
//    		builder.timeout(ms.getTimeout());   
//    		 builder.parameterMap(ms.getParameterMap());   
//    		builder.resultMaps(ms.getResultMaps());   
//    		builder.cache(ms.getCache());   
//    		MappedStatement newMs = builder.build();   
//    		return newMs;   
//    		}   
	
	@Override
	public Object plugin(Object arg0) {
		// TODO Auto-generated method stub
		return Plugin.wrap(arg0, this);
	}

	@Override
	public void setProperties(Properties arg0) {
		// TODO Auto-generated method stub
		
	}

}
