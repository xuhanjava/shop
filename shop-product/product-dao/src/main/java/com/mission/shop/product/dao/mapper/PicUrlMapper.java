package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.PicUrl;
import com.mission.shop.product.dao.model.PicUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicUrlMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int countByExample(PicUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int deleteByExample(PicUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int insert(PicUrl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int insertSelective(PicUrl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	List<PicUrl> selectByExample(PicUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	PicUrl selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int updateByExampleSelective(@Param("record") PicUrl record,
			@Param("example") PicUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int updateByExample(@Param("record") PicUrl record,
			@Param("example") PicUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int updateByPrimaryKeySelective(PicUrl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pic_url
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int updateByPrimaryKey(PicUrl record);
}