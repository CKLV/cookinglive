package com.focustech.cookinglove.ibator.mapper;

import com.focustech.cookinglove.ibator.domain.AlbumPhoto;
import com.focustech.cookinglove.ibator.domain.AlbumPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumPhotoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int countByExample(AlbumPhotoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByExample(AlbumPhotoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int deleteByPrimaryKey(Long recId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insert(AlbumPhoto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int insertSelective(AlbumPhoto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	List<AlbumPhoto> selectByExample(AlbumPhotoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	AlbumPhoto selectByPrimaryKey(Long recId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExampleSelective(@Param("record") AlbumPhoto record,
			@Param("example") AlbumPhotoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByExample(@Param("record") AlbumPhoto record,
			@Param("example") AlbumPhotoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKeySelective(AlbumPhoto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table album_photo
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	int updateByPrimaryKey(AlbumPhoto record);
}