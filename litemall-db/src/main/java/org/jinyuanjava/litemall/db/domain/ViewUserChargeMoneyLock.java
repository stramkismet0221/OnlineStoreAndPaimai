package org.jinyuanjava.litemall.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class ViewUserChargeMoneyLock {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_user_charge_money_lock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_user_charge_money_lock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.lock_type
     *
     * @mbg.generated
     */
    private String lockType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.rule_mx_id
     *
     * @mbg.generated
     */
    private Integer ruleMxId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.goods_name
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.lock_money
     *
     * @mbg.generated
     */
    private BigDecimal lockMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.lock_time
     *
     * @mbg.generated
     */
    private LocalDateTime lockTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.unlock_time
     *
     * @mbg.generated
     */
    private LocalDateTime unlockTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.lock_to_pay_time
     *
     * @mbg.generated
     */
    private LocalDateTime lockToPayTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.offer_id
     *
     * @mbg.generated
     */
    private Integer offerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.tenant_id
     *
     * @mbg.generated
     */
    private Integer tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.user_create_id
     *
     * @mbg.generated
     */
    private Integer userCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.user_modify_id
     *
     * @mbg.generated
     */
    private Integer userModifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.op_create_id
     *
     * @mbg.generated
     */
    private Integer opCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.op_modify_id
     *
     * @mbg.generated
     */
    private Integer opModifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.order_sn
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.user_phone
     *
     * @mbg.generated
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_user_charge_money_lock.user_nickname
     *
     * @mbg.generated
     */
    private String userNickname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.id
     *
     * @return the value of view_user_charge_money_lock.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.id
     *
     * @param id the value for view_user_charge_money_lock.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.user_id
     *
     * @return the value of view_user_charge_money_lock.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.user_id
     *
     * @param userId the value for view_user_charge_money_lock.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.lock_type
     *
     * @return the value of view_user_charge_money_lock.lock_type
     *
     * @mbg.generated
     */
    public String getLockType() {
        return lockType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.lock_type
     *
     * @param lockType the value for view_user_charge_money_lock.lock_type
     *
     * @mbg.generated
     */
    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.rule_mx_id
     *
     * @return the value of view_user_charge_money_lock.rule_mx_id
     *
     * @mbg.generated
     */
    public Integer getRuleMxId() {
        return ruleMxId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.rule_mx_id
     *
     * @param ruleMxId the value for view_user_charge_money_lock.rule_mx_id
     *
     * @mbg.generated
     */
    public void setRuleMxId(Integer ruleMxId) {
        this.ruleMxId = ruleMxId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.goods_name
     *
     * @return the value of view_user_charge_money_lock.goods_name
     *
     * @mbg.generated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.goods_name
     *
     * @param goodsName the value for view_user_charge_money_lock.goods_name
     *
     * @mbg.generated
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.lock_money
     *
     * @return the value of view_user_charge_money_lock.lock_money
     *
     * @mbg.generated
     */
    public BigDecimal getLockMoney() {
        return lockMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.lock_money
     *
     * @param lockMoney the value for view_user_charge_money_lock.lock_money
     *
     * @mbg.generated
     */
    public void setLockMoney(BigDecimal lockMoney) {
        this.lockMoney = lockMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.lock_time
     *
     * @return the value of view_user_charge_money_lock.lock_time
     *
     * @mbg.generated
     */
    public LocalDateTime getLockTime() {
        return lockTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.lock_time
     *
     * @param lockTime the value for view_user_charge_money_lock.lock_time
     *
     * @mbg.generated
     */
    public void setLockTime(LocalDateTime lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.unlock_time
     *
     * @return the value of view_user_charge_money_lock.unlock_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUnlockTime() {
        return unlockTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.unlock_time
     *
     * @param unlockTime the value for view_user_charge_money_lock.unlock_time
     *
     * @mbg.generated
     */
    public void setUnlockTime(LocalDateTime unlockTime) {
        this.unlockTime = unlockTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.lock_to_pay_time
     *
     * @return the value of view_user_charge_money_lock.lock_to_pay_time
     *
     * @mbg.generated
     */
    public LocalDateTime getLockToPayTime() {
        return lockToPayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.lock_to_pay_time
     *
     * @param lockToPayTime the value for view_user_charge_money_lock.lock_to_pay_time
     *
     * @mbg.generated
     */
    public void setLockToPayTime(LocalDateTime lockToPayTime) {
        this.lockToPayTime = lockToPayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.order_id
     *
     * @return the value of view_user_charge_money_lock.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.order_id
     *
     * @param orderId the value for view_user_charge_money_lock.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.offer_id
     *
     * @return the value of view_user_charge_money_lock.offer_id
     *
     * @mbg.generated
     */
    public Integer getOfferId() {
        return offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.offer_id
     *
     * @param offerId the value for view_user_charge_money_lock.offer_id
     *
     * @mbg.generated
     */
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.add_time
     *
     * @return the value of view_user_charge_money_lock.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.add_time
     *
     * @param addTime the value for view_user_charge_money_lock.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.update_time
     *
     * @return the value of view_user_charge_money_lock.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.update_time
     *
     * @param updateTime the value for view_user_charge_money_lock.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.deleted
     *
     * @return the value of view_user_charge_money_lock.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.deleted
     *
     * @param deleted the value for view_user_charge_money_lock.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.tenant_id
     *
     * @return the value of view_user_charge_money_lock.tenant_id
     *
     * @mbg.generated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.tenant_id
     *
     * @param tenantId the value for view_user_charge_money_lock.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.user_create_id
     *
     * @return the value of view_user_charge_money_lock.user_create_id
     *
     * @mbg.generated
     */
    public Integer getUserCreateId() {
        return userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.user_create_id
     *
     * @param userCreateId the value for view_user_charge_money_lock.user_create_id
     *
     * @mbg.generated
     */
    public void setUserCreateId(Integer userCreateId) {
        this.userCreateId = userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.user_modify_id
     *
     * @return the value of view_user_charge_money_lock.user_modify_id
     *
     * @mbg.generated
     */
    public Integer getUserModifyId() {
        return userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.user_modify_id
     *
     * @param userModifyId the value for view_user_charge_money_lock.user_modify_id
     *
     * @mbg.generated
     */
    public void setUserModifyId(Integer userModifyId) {
        this.userModifyId = userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.op_create_id
     *
     * @return the value of view_user_charge_money_lock.op_create_id
     *
     * @mbg.generated
     */
    public Integer getOpCreateId() {
        return opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.op_create_id
     *
     * @param opCreateId the value for view_user_charge_money_lock.op_create_id
     *
     * @mbg.generated
     */
    public void setOpCreateId(Integer opCreateId) {
        this.opCreateId = opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.op_modify_id
     *
     * @return the value of view_user_charge_money_lock.op_modify_id
     *
     * @mbg.generated
     */
    public Integer getOpModifyId() {
        return opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.op_modify_id
     *
     * @param opModifyId the value for view_user_charge_money_lock.op_modify_id
     *
     * @mbg.generated
     */
    public void setOpModifyId(Integer opModifyId) {
        this.opModifyId = opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.order_sn
     *
     * @return the value of view_user_charge_money_lock.order_sn
     *
     * @mbg.generated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.order_sn
     *
     * @param orderSn the value for view_user_charge_money_lock.order_sn
     *
     * @mbg.generated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.user_phone
     *
     * @return the value of view_user_charge_money_lock.user_phone
     *
     * @mbg.generated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.user_phone
     *
     * @param userPhone the value for view_user_charge_money_lock.user_phone
     *
     * @mbg.generated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.user_name
     *
     * @return the value of view_user_charge_money_lock.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.user_name
     *
     * @param userName the value for view_user_charge_money_lock.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_user_charge_money_lock.user_nickname
     *
     * @return the value of view_user_charge_money_lock.user_nickname
     *
     * @mbg.generated
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_user_charge_money_lock.user_nickname
     *
     * @param userNickname the value for view_user_charge_money_lock.user_nickname
     *
     * @mbg.generated
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_charge_money_lock
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", lockType=").append(lockType);
        sb.append(", ruleMxId=").append(ruleMxId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", lockMoney=").append(lockMoney);
        sb.append(", lockTime=").append(lockTime);
        sb.append(", unlockTime=").append(unlockTime);
        sb.append(", lockToPayTime=").append(lockToPayTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", offerId=").append(offerId);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", userCreateId=").append(userCreateId);
        sb.append(", userModifyId=").append(userModifyId);
        sb.append(", opCreateId=").append(opCreateId);
        sb.append(", opModifyId=").append(opModifyId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userName=").append(userName);
        sb.append(", userNickname=").append(userNickname);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_charge_money_lock
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ViewUserChargeMoneyLock other = (ViewUserChargeMoneyLock) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getLockType() == null ? other.getLockType() == null : this.getLockType().equals(other.getLockType()))
            && (this.getRuleMxId() == null ? other.getRuleMxId() == null : this.getRuleMxId().equals(other.getRuleMxId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getLockMoney() == null ? other.getLockMoney() == null : this.getLockMoney().equals(other.getLockMoney()))
            && (this.getLockTime() == null ? other.getLockTime() == null : this.getLockTime().equals(other.getLockTime()))
            && (this.getUnlockTime() == null ? other.getUnlockTime() == null : this.getUnlockTime().equals(other.getUnlockTime()))
            && (this.getLockToPayTime() == null ? other.getLockToPayTime() == null : this.getLockToPayTime().equals(other.getLockToPayTime()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOfferId() == null ? other.getOfferId() == null : this.getOfferId().equals(other.getOfferId()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getUserCreateId() == null ? other.getUserCreateId() == null : this.getUserCreateId().equals(other.getUserCreateId()))
            && (this.getUserModifyId() == null ? other.getUserModifyId() == null : this.getUserModifyId().equals(other.getUserModifyId()))
            && (this.getOpCreateId() == null ? other.getOpCreateId() == null : this.getOpCreateId().equals(other.getOpCreateId()))
            && (this.getOpModifyId() == null ? other.getOpModifyId() == null : this.getOpModifyId().equals(other.getOpModifyId()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserNickname() == null ? other.getUserNickname() == null : this.getUserNickname().equals(other.getUserNickname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_charge_money_lock
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getLockType() == null) ? 0 : getLockType().hashCode());
        result = prime * result + ((getRuleMxId() == null) ? 0 : getRuleMxId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getLockMoney() == null) ? 0 : getLockMoney().hashCode());
        result = prime * result + ((getLockTime() == null) ? 0 : getLockTime().hashCode());
        result = prime * result + ((getUnlockTime() == null) ? 0 : getUnlockTime().hashCode());
        result = prime * result + ((getLockToPayTime() == null) ? 0 : getLockToPayTime().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOfferId() == null) ? 0 : getOfferId().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getUserCreateId() == null) ? 0 : getUserCreateId().hashCode());
        result = prime * result + ((getUserModifyId() == null) ? 0 : getUserModifyId().hashCode());
        result = prime * result + ((getOpCreateId() == null) ? 0 : getOpCreateId().hashCode());
        result = prime * result + ((getOpModifyId() == null) ? 0 : getOpModifyId().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserNickname() == null) ? 0 : getUserNickname().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_charge_money_lock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table view_user_charge_money_lock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        userId("user_id", "userId", "INTEGER", false),
        lockType("lock_type", "lockType", "VARCHAR", false),
        ruleMxId("rule_mx_id", "ruleMxId", "INTEGER", false),
        goodsName("goods_name", "goodsName", "VARCHAR", false),
        lockMoney("lock_money", "lockMoney", "DECIMAL", false),
        lockTime("lock_time", "lockTime", "TIMESTAMP", false),
        unlockTime("unlock_time", "unlockTime", "TIMESTAMP", false),
        lockToPayTime("lock_to_pay_time", "lockToPayTime", "TIMESTAMP", false),
        orderId("order_id", "orderId", "INTEGER", false),
        offerId("offer_id", "offerId", "INTEGER", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false),
        tenantId("tenant_id", "tenantId", "INTEGER", false),
        userCreateId("user_create_id", "userCreateId", "INTEGER", false),
        userModifyId("user_modify_id", "userModifyId", "INTEGER", false),
        opCreateId("op_create_id", "opCreateId", "INTEGER", false),
        opModifyId("op_modify_id", "opModifyId", "INTEGER", false),
        orderSn("order_sn", "orderSn", "VARCHAR", false),
        userPhone("user_phone", "userPhone", "VARCHAR", false),
        userName("user_name", "userName", "VARCHAR", false),
        userNickname("user_nickname", "userNickname", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_user_charge_money_lock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}