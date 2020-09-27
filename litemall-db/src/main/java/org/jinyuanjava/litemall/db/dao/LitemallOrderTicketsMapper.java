package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.LitemallOrderTickets;
import org.jinyuanjava.litemall.db.domain.LitemallOrderTicketsExample;

public interface LitemallOrderTicketsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    long countByExample(LitemallOrderTicketsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallOrderTicketsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    int insert(LitemallOrderTickets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    int insertSelective(LitemallOrderTickets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallOrderTickets selectOneByExample(LitemallOrderTicketsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallOrderTickets selectOneByExampleSelective(@Param("example") LitemallOrderTicketsExample example, @Param("selective") LitemallOrderTickets.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallOrderTickets> selectByExampleSelective(@Param("example") LitemallOrderTicketsExample example, @Param("selective") LitemallOrderTickets.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    List<LitemallOrderTickets> selectByExample(LitemallOrderTicketsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallOrderTickets selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallOrderTickets.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    LitemallOrderTickets selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallOrderTickets selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallOrderTickets record, @Param("example") LitemallOrderTicketsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallOrderTickets record, @Param("example") LitemallOrderTicketsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallOrderTickets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallOrderTickets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallOrderTicketsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_tickets
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}