package com.focustech.cookinglove.ibator.mapper;

import com.focustech.cookinglove.ibator.domain.RoleResource;
import com.focustech.cookinglove.ibator.domain.RoleResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleResourceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int countByExample(RoleResourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByExample(RoleResourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByPrimaryKey(Long recId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insert(RoleResource record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insertSelective(RoleResource record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	List<RoleResource> selectByExample(RoleResourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	RoleResource selectByPrimaryKey(Long recId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExampleSelective(@Param("record") RoleResource record,
			@Param("example") RoleResourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExample(@Param("record") RoleResource record,
			@Param("example") RoleResourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKeySelective(RoleResource record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKey(RoleResource record);
}