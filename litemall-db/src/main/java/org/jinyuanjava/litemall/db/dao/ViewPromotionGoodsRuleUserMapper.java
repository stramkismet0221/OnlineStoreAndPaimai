package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.ViewPromotionGoodsRuleUser;
import org.jinyuanjava.litemall.db.domain.ViewPromotionGoodsRuleUserExample;

public interface ViewPromotionGoodsRuleUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     */
    long countByExample(ViewPromotionGoodsRuleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     */
    int deleteByExample(ViewPromotionGoodsRuleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     */
    int insert(ViewPromotionGoodsRuleUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     */
    int insertSelective(ViewPromotionGoodsRuleUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewPromotionGoodsRuleUser selectOneByExample(ViewPromotionGoodsRuleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewPromotionGoodsRuleUser selectOneByExampleSelective(@Param("example") ViewPromotionGoodsRuleUserExample example, @Param("selective") ViewPromotionGoodsRuleUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ViewPromotionGoodsRuleUser> selectByExampleSelective(@Param("example") ViewPromotionGoodsRuleUserExample example, @Param("selective") ViewPromotionGoodsRuleUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     */
    List<ViewPromotionGoodsRuleUser> selectByExample(ViewPromotionGoodsRuleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewPromotionGoodsRuleUser record, @Param("example") ViewPromotionGoodsRuleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewPromotionGoodsRuleUser record, @Param("example") ViewPromotionGoodsRuleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rule_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ViewPromotionGoodsRuleUserExample example);
}