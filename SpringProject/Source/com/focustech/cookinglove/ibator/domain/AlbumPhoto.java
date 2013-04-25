package com.focustech.cookinglove.ibator.domain;

public class AlbumPhoto {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column album_photo.rec_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private Long recId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column album_photo.album_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private Long albumId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column album_photo.pic_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private Long picId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column album_photo.order_weight
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private Integer orderWeight;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column album_photo.rec_id
	 * @return  the value of album_photo.rec_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Long getRecId() {
		return recId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column album_photo.rec_id
	 * @param recId  the value for album_photo.rec_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setRecId(Long recId) {
		this.recId = recId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column album_photo.album_id
	 * @return  the value of album_photo.album_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Long getAlbumId() {
		return albumId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column album_photo.album_id
	 * @param albumId  the value for album_photo.album_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column album_photo.pic_id
	 * @return  the value of album_photo.pic_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Long getPicId() {
		return picId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column album_photo.pic_id
	 * @param picId  the value for album_photo.pic_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setPicId(Long picId) {
		this.picId = picId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column album_photo.order_weight
	 * @return  the value of album_photo.order_weight
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Integer getOrderWeight() {
		return orderWeight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column album_photo.order_weight
	 * @param orderWeight  the value for album_photo.order_weight
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setOrderWeight(Integer orderWeight) {
		this.orderWeight = orderWeight;
	}
}