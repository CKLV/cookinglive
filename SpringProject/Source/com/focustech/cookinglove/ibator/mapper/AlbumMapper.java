package com.focustech.cookinglove.ibator.mapper;

import com.focustech.cookinglove.ibator.domain.Album;
import com.focustech.cookinglove.ibator.domain.AlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int countByExample(AlbumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByExample(AlbumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByPrimaryKey(Long recId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insert(Album record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insertSelective(Album record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	List<Album> selectByExample(AlbumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	Album selectByPrimaryKey(Long recId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExampleSelective(@Param("record") Album record,
			@Param("example") AlbumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExample(@Param("record") Album record,
			@Param("example") AlbumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKeySelective(Album record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKey(Album record);
}