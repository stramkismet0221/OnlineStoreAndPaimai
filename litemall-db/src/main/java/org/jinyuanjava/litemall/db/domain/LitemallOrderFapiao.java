package org.jinyuanjava.litemall.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallOrderFapiao {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_order_fapiao
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_order_fapiao
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.fapiao_type
     *
     * @mbg.generated
     */
    private String fapiaoType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.taxno
     *
     * @mbg.generated
     */
    private String taxno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.telphone
     *
     * @mbg.generated
     */
    private String telphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.bank
     *
     * @mbg.generated
     */
    private String bank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.bank_no
     *
     * @mbg.generated
     */
    private String bankNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.tenant_id
     *
     * @mbg.generated
     */
    private Integer tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.user_create_id
     *
     * @mbg.generated
     */
    private Integer userCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.user_modify_id
     *
     * @mbg.generated
     */
    private Integer userModifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.op_create_id
     *
     * @mbg.generated
     */
    private Integer opCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_order_fapiao.op_modify_id
     *
     * @mbg.generated
     */
    private Integer opModifyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.id
     *
     * @return the value of litemall_order_fapiao.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.id
     *
     * @param id the value for litemall_order_fapiao.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.order_id
     *
     * @return the value of litemall_order_fapiao.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.order_id
     *
     * @param orderId the value for litemall_order_fapiao.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.fapiao_type
     *
     * @return the value of litemall_order_fapiao.fapiao_type
     *
     * @mbg.generated
     */
    public String getFapiaoType() {
        return fapiaoType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.fapiao_type
     *
     * @param fapiaoType the value for litemall_order_fapiao.fapiao_type
     *
     * @mbg.generated
     */
    public void setFapiaoType(String fapiaoType) {
        this.fapiaoType = fapiaoType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.name
     *
     * @return the value of litemall_order_fapiao.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.name
     *
     * @param name the value for litemall_order_fapiao.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.taxno
     *
     * @return the value of litemall_order_fapiao.taxno
     *
     * @mbg.generated
     */
    public String getTaxno() {
        return taxno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.taxno
     *
     * @param taxno the value for litemall_order_fapiao.taxno
     *
     * @mbg.generated
     */
    public void setTaxno(String taxno) {
        this.taxno = taxno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.address
     *
     * @return the value of litemall_order_fapiao.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.address
     *
     * @param address the value for litemall_order_fapiao.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.telphone
     *
     * @return the value of litemall_order_fapiao.telphone
     *
     * @mbg.generated
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.telphone
     *
     * @param telphone the value for litemall_order_fapiao.telphone
     *
     * @mbg.generated
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.bank
     *
     * @return the value of litemall_order_fapiao.bank
     *
     * @mbg.generated
     */
    public String getBank() {
        return bank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.bank
     *
     * @param bank the value for litemall_order_fapiao.bank
     *
     * @mbg.generated
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.bank_no
     *
     * @return the value of litemall_order_fapiao.bank_no
     *
     * @mbg.generated
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.bank_no
     *
     * @param bankNo the value for litemall_order_fapiao.bank_no
     *
     * @mbg.generated
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.money
     *
     * @return the value of litemall_order_fapiao.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.money
     *
     * @param money the value for litemall_order_fapiao.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.add_time
     *
     * @return the value of litemall_order_fapiao.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.add_time
     *
     * @param addTime the value for litemall_order_fapiao.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.update_time
     *
     * @return the value of litemall_order_fapiao.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.update_time
     *
     * @param updateTime the value for litemall_order_fapiao.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.deleted
     *
     * @return the value of litemall_order_fapiao.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.deleted
     *
     * @param deleted the value for litemall_order_fapiao.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.tenant_id
     *
     * @return the value of litemall_order_fapiao.tenant_id
     *
     * @mbg.generated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.tenant_id
     *
     * @param tenantId the value for litemall_order_fapiao.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.user_create_id
     *
     * @return the value of litemall_order_fapiao.user_create_id
     *
     * @mbg.generated
     */
    public Integer getUserCreateId() {
        return userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.user_create_id
     *
     * @param userCreateId the value for litemall_order_fapiao.user_create_id
     *
     * @mbg.generated
     */
    public void setUserCreateId(Integer userCreateId) {
        this.userCreateId = userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.user_modify_id
     *
     * @return the value of litemall_order_fapiao.user_modify_id
     *
     * @mbg.generated
     */
    public Integer getUserModifyId() {
        return userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.user_modify_id
     *
     * @param userModifyId the value for litemall_order_fapiao.user_modify_id
     *
     * @mbg.generated
     */
    public void setUserModifyId(Integer userModifyId) {
        this.userModifyId = userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.op_create_id
     *
     * @return the value of litemall_order_fapiao.op_create_id
     *
     * @mbg.generated
     */
    public Integer getOpCreateId() {
        return opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.op_create_id
     *
     * @param opCreateId the value for litemall_order_fapiao.op_create_id
     *
     * @mbg.generated
     */
    public void setOpCreateId(Integer opCreateId) {
        this.opCreateId = opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_order_fapiao.op_modify_id
     *
     * @return the value of litemall_order_fapiao.op_modify_id
     *
     * @mbg.generated
     */
    public Integer getOpModifyId() {
        return opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_order_fapiao.op_modify_id
     *
     * @param opModifyId the value for litemall_order_fapiao.op_modify_id
     *
     * @mbg.generated
     */
    public void setOpModifyId(Integer opModifyId) {
        this.opModifyId = opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_fapiao
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
        sb.append(", orderId=").append(orderId);
        sb.append(", fapiaoType=").append(fapiaoType);
        sb.append(", name=").append(name);
        sb.append(", taxno=").append(taxno);
        sb.append(", address=").append(address);
        sb.append(", telphone=").append(telphone);
        sb.append(", bank=").append(bank);
        sb.append(", bankNo=").append(bankNo);
        sb.append(", money=").append(money);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", userCreateId=").append(userCreateId);
        sb.append(", userModifyId=").append(userModifyId);
        sb.append(", opCreateId=").append(opCreateId);
        sb.append(", opModifyId=").append(opModifyId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_fapiao
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
        LitemallOrderFapiao other = (LitemallOrderFapiao) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getFapiaoType() == null ? other.getFapiaoType() == null : this.getFapiaoType().equals(other.getFapiaoType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTaxno() == null ? other.getTaxno() == null : this.getTaxno().equals(other.getTaxno()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getTelphone() == null ? other.getTelphone() == null : this.getTelphone().equals(other.getTelphone()))
            && (this.getBank() == null ? other.getBank() == null : this.getBank().equals(other.getBank()))
            && (this.getBankNo() == null ? other.getBankNo() == null : this.getBankNo().equals(other.getBankNo()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getUserCreateId() == null ? other.getUserCreateId() == null : this.getUserCreateId().equals(other.getUserCreateId()))
            && (this.getUserModifyId() == null ? other.getUserModifyId() == null : this.getUserModifyId().equals(other.getUserModifyId()))
            && (this.getOpCreateId() == null ? other.getOpCreateId() == null : this.getOpCreateId().equals(other.getOpCreateId()))
            && (this.getOpModifyId() == null ? other.getOpModifyId() == null : this.getOpModifyId().equals(other.getOpModifyId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_fapiao
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getFapiaoType() == null) ? 0 : getFapiaoType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTaxno() == null) ? 0 : getTaxno().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getTelphone() == null) ? 0 : getTelphone().hashCode());
        result = prime * result + ((getBank() == null) ? 0 : getBank().hashCode());
        result = prime * result + ((getBankNo() == null) ? 0 : getBankNo().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getUserCreateId() == null) ? 0 : getUserCreateId().hashCode());
        result = prime * result + ((getUserModifyId() == null) ? 0 : getUserModifyId().hashCode());
        result = prime * result + ((getOpCreateId() == null) ? 0 : getOpCreateId().hashCode());
        result = prime * result + ((getOpModifyId() == null) ? 0 : getOpModifyId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_fapiao
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_order_fapiao
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        orderId("order_id", "orderId", "INTEGER", false),
        fapiaoType("fapiao_type", "fapiaoType", "VARCHAR", false),
        name("name", "name", "VARCHAR", true),
        taxno("taxno", "taxno", "VARCHAR", false),
        address("address", "address", "VARCHAR", false),
        telphone("telphone", "telphone", "VARCHAR", false),
        bank("bank", "bank", "VARCHAR", false),
        bankNo("bank_no", "bankNo", "VARCHAR", false),
        money("money", "money", "DECIMAL", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false),
        tenantId("tenant_id", "tenantId", "INTEGER", false),
        userCreateId("user_create_id", "userCreateId", "INTEGER", false),
        userModifyId("user_modify_id", "userModifyId", "INTEGER", false),
        opCreateId("op_create_id", "opCreateId", "INTEGER", false),
        opModifyId("op_modify_id", "opModifyId", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_fapiao
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
         * This method corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_fapiao
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_fapiao
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
         * This method corresponds to the database table litemall_order_fapiao
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