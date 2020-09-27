package org.jinyuanjava.litemall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallUserFormid {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.formId
     *
     * @mbg.generated
     */
    private String formid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.isprepay
     *
     * @mbg.generated
     */
    private Boolean isprepay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.useAmount
     *
     * @mbg.generated
     */
    private Integer useamount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.expire_time
     *
     * @mbg.generated
     */
    private LocalDateTime expireTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.openId
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.tenant_id
     *
     * @mbg.generated
     */
    private Integer tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.user_create_id
     *
     * @mbg.generated
     */
    private Integer userCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.user_modify_id
     *
     * @mbg.generated
     */
    private Integer userModifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.op_create_id
     *
     * @mbg.generated
     */
    private Integer opCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_formid.op_modify_id
     *
     * @mbg.generated
     */
    private Integer opModifyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.id
     *
     * @return the value of litemall_user_formid.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.id
     *
     * @param id the value for litemall_user_formid.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.formId
     *
     * @return the value of litemall_user_formid.formId
     *
     * @mbg.generated
     */
    public String getFormid() {
        return formid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.formId
     *
     * @param formid the value for litemall_user_formid.formId
     *
     * @mbg.generated
     */
    public void setFormid(String formid) {
        this.formid = formid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.isprepay
     *
     * @return the value of litemall_user_formid.isprepay
     *
     * @mbg.generated
     */
    public Boolean getIsprepay() {
        return isprepay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.isprepay
     *
     * @param isprepay the value for litemall_user_formid.isprepay
     *
     * @mbg.generated
     */
    public void setIsprepay(Boolean isprepay) {
        this.isprepay = isprepay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.useAmount
     *
     * @return the value of litemall_user_formid.useAmount
     *
     * @mbg.generated
     */
    public Integer getUseamount() {
        return useamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.useAmount
     *
     * @param useamount the value for litemall_user_formid.useAmount
     *
     * @mbg.generated
     */
    public void setUseamount(Integer useamount) {
        this.useamount = useamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.expire_time
     *
     * @return the value of litemall_user_formid.expire_time
     *
     * @mbg.generated
     */
    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.expire_time
     *
     * @param expireTime the value for litemall_user_formid.expire_time
     *
     * @mbg.generated
     */
    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.openId
     *
     * @return the value of litemall_user_formid.openId
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.openId
     *
     * @param openid the value for litemall_user_formid.openId
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.add_time
     *
     * @return the value of litemall_user_formid.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.add_time
     *
     * @param addTime the value for litemall_user_formid.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.update_time
     *
     * @return the value of litemall_user_formid.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.update_time
     *
     * @param updateTime the value for litemall_user_formid.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.deleted
     *
     * @return the value of litemall_user_formid.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.deleted
     *
     * @param deleted the value for litemall_user_formid.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.tenant_id
     *
     * @return the value of litemall_user_formid.tenant_id
     *
     * @mbg.generated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.tenant_id
     *
     * @param tenantId the value for litemall_user_formid.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.user_create_id
     *
     * @return the value of litemall_user_formid.user_create_id
     *
     * @mbg.generated
     */
    public Integer getUserCreateId() {
        return userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.user_create_id
     *
     * @param userCreateId the value for litemall_user_formid.user_create_id
     *
     * @mbg.generated
     */
    public void setUserCreateId(Integer userCreateId) {
        this.userCreateId = userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.user_modify_id
     *
     * @return the value of litemall_user_formid.user_modify_id
     *
     * @mbg.generated
     */
    public Integer getUserModifyId() {
        return userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.user_modify_id
     *
     * @param userModifyId the value for litemall_user_formid.user_modify_id
     *
     * @mbg.generated
     */
    public void setUserModifyId(Integer userModifyId) {
        this.userModifyId = userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.op_create_id
     *
     * @return the value of litemall_user_formid.op_create_id
     *
     * @mbg.generated
     */
    public Integer getOpCreateId() {
        return opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.op_create_id
     *
     * @param opCreateId the value for litemall_user_formid.op_create_id
     *
     * @mbg.generated
     */
    public void setOpCreateId(Integer opCreateId) {
        this.opCreateId = opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_formid.op_modify_id
     *
     * @return the value of litemall_user_formid.op_modify_id
     *
     * @mbg.generated
     */
    public Integer getOpModifyId() {
        return opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_formid.op_modify_id
     *
     * @param opModifyId the value for litemall_user_formid.op_modify_id
     *
     * @mbg.generated
     */
    public void setOpModifyId(Integer opModifyId) {
        this.opModifyId = opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
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
        sb.append(", formid=").append(formid);
        sb.append(", isprepay=").append(isprepay);
        sb.append(", useamount=").append(useamount);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", openid=").append(openid);
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
     * This method corresponds to the database table litemall_user_formid
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
        LitemallUserFormid other = (LitemallUserFormid) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFormid() == null ? other.getFormid() == null : this.getFormid().equals(other.getFormid()))
            && (this.getIsprepay() == null ? other.getIsprepay() == null : this.getIsprepay().equals(other.getIsprepay()))
            && (this.getUseamount() == null ? other.getUseamount() == null : this.getUseamount().equals(other.getUseamount()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
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
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFormid() == null) ? 0 : getFormid().hashCode());
        result = prime * result + ((getIsprepay() == null) ? 0 : getIsprepay().hashCode());
        result = prime * result + ((getUseamount() == null) ? 0 : getUseamount().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
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
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        formid("formId", "formid", "VARCHAR", false),
        isprepay("isprepay", "isprepay", "BIT", false),
        useamount("useAmount", "useamount", "INTEGER", false),
        expireTime("expire_time", "expireTime", "TIMESTAMP", false),
        openid("openId", "openid", "VARCHAR", false),
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
         * This field corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_formid
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
         * This method corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_formid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_formid
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
         * This method corresponds to the database table litemall_user_formid
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