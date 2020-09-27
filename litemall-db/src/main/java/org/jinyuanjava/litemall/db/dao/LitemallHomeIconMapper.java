package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.LitemallHomeIcon;
import org.jinyuanjava.litemall.db.domain.LitemallHomeIconExample;

public interface LitemallHomeIconMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    long countByExample(LitemallHomeIconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallHomeIconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    int insert(LitemallHomeIcon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    int insertSelective(LitemallHomeIcon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallHomeIcon selectOneByExample(LitemallHomeIconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallHomeIcon selectOneByExampleSelective(@Param("example") LitemallHomeIconExample example, @Param("selective") LitemallHomeIcon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallHomeIcon> selectByExampleSelective(@Param("example") LitemallHomeIconExample example, @Param("selective") LitemallHomeIcon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    List<LitemallHomeIcon> selectByExample(LitemallHomeIconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallHomeIcon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallHomeIcon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    LitemallHomeIcon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallHomeIcon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallHomeIcon record, @Param("example") LitemallHomeIconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallHomeIcon record, @Param("example") LitemallHomeIconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallHomeIcon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallHomeIcon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallHomeIconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_home_icon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}