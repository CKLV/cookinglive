package com.focustech.cookinglove.ibator.mapper;

import com.focustech.cookinglove.defined.domain.ArticleDefinedDomain;
import com.focustech.cookinglove.ibator.domain.Article;
import com.focustech.cookinglove.ibator.domain.ArticleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ArticleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int countByExample(ArticleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByExample(ArticleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByPrimaryKey(Long articleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insert(Article record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insertSelective(Article record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	List<Article> selectByExampleWithBLOBs(ArticleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	List<Article> selectByExample(ArticleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	Article selectByPrimaryKey(Long articleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExampleSelective(@Param("record") Article record,
			@Param("example") ArticleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExampleWithBLOBs(@Param("record") Article record,
			@Param("example") ArticleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExample(@Param("record") Article record,
			@Param("example") ArticleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKeySelective(Article record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKeyWithBLOBs(Article record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKey(Article record);
	
	/**
	 * 查询文章列表
	 * @param map
	 * @return
	 */
	List<ArticleDefinedDomain> selectArticleList(Map<String, Object> map);
}