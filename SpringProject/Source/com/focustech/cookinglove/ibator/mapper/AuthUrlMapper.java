package com.focustech.cookinglove.ibator.mapper;

import com.focustech.cookinglove.ibator.domain.AuthUrl;
import com.focustech.cookinglove.ibator.domain.AuthUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUrlMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int countByExample(AuthUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByExample(AuthUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByPrimaryKey(Long recId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insert(AuthUrl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insertSelective(AuthUrl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	List<AuthUrl> selectByExample(AuthUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	AuthUrl selectByPrimaryKey(Long recId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExampleSelective(@Param("record") AuthUrl record,
			@Param("example") AuthUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExample(@Param("record") AuthUrl record,
			@Param("example") AuthUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKeySelective(AuthUrl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_url
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKey(AuthUrl record);
}