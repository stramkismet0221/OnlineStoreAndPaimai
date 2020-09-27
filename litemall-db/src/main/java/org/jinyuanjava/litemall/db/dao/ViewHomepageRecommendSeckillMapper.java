package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.ViewHomepageRecommendSeckill;
import org.jinyuanjava.litemall.db.domain.ViewHomepageRecommendSeckillExample;
import org.jinyuanjava.litemall.db.domain.ViewHomepageRecommendSeckillWithBLOBs;

public interface ViewHomepageRecommendSeckillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     */
    long countByExample(ViewHomepageRecommendSeckillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     */
    int deleteByExample(ViewHomepageRecommendSeckillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     */
    int insert(ViewHomepageRecommendSeckillWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     */
    int insertSelective(ViewHomepageRecommendSeckillWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewHomepageRecommendSeckill selectOneByExample(ViewHomepageRecommendSeckillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewHomepageRecommendSeckillWithBLOBs selectOneByExampleSelective(@Param("example") ViewHomepageRecommendSeckillExample example, @Param("selective") ViewHomepageRecommendSeckillWithBLOBs.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewHomepageRecommendSeckillWithBLOBs selectOneByExampleWithBLOBs(ViewHomepageRecommendSeckillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ViewHomepageRecommendSeckillWithBLOBs> selectByExampleSelective(@Param("example") ViewHomepageRecommendSeckillExample example, @Param("selective") ViewHomepageRecommendSeckillWithBLOBs.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     */
    List<ViewHomepageRecommendSeckillWithBLOBs> selectByExampleWithBLOBs(ViewHomepageRecommendSeckillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     */
    List<ViewHomepageRecommendSeckill> selectByExample(ViewHomepageRecommendSeckillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewHomepageRecommendSeckillWithBLOBs record, @Param("example") ViewHomepageRecommendSeckillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ViewHomepageRecommendSeckillWithBLOBs record, @Param("example") ViewHomepageRecommendSeckillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewHomepageRecommendSeckill record, @Param("example") ViewHomepageRecommendSeckillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_homepage_recommend_seckill
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ViewHomepageRecommendSeckillExample example);
}