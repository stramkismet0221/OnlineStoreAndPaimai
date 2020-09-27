package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.LitemallGoodsRecommend;
import org.jinyuanjava.litemall.db.domain.LitemallGoodsRecommendExample;

public interface LitemallGoodsRecommendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    long countByExample(LitemallGoodsRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallGoodsRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    int insert(LitemallGoodsRecommend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    int insertSelective(LitemallGoodsRecommend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGoodsRecommend selectOneByExample(LitemallGoodsRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGoodsRecommend selectOneByExampleSelective(@Param("example") LitemallGoodsRecommendExample example, @Param("selective") LitemallGoodsRecommend.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallGoodsRecommend> selectByExampleSelective(@Param("example") LitemallGoodsRecommendExample example, @Param("selective") LitemallGoodsRecommend.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    List<LitemallGoodsRecommend> selectByExample(LitemallGoodsRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGoodsRecommend selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallGoodsRecommend.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    LitemallGoodsRecommend selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGoodsRecommend selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallGoodsRecommend record, @Param("example") LitemallGoodsRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallGoodsRecommend record, @Param("example") LitemallGoodsRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallGoodsRecommend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallGoodsRecommend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallGoodsRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}