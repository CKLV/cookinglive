package com.focustech.cookinglove.ibator.mapper;

import com.focustech.cookinglove.ibator.domain.Role;
import com.focustech.cookinglove.ibator.domain.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int countByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByPrimaryKey(Long roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insert(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insertSelective(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	List<Role> selectByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	Role selectByPrimaryKey(Long roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExampleSelective(@Param("record") Role record,
			@Param("example") RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExample(@Param("record") Role record,
			@Param("example") RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKeySelective(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKey(Role record);
}