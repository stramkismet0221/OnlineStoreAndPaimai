package org.jinyuanjava.litemall.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallPromotionGoodsRebateRule {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_promotion_goods_rebate_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_promotion_goods_rebate_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.com_id
     *
     * @mbg.generated
     */
    private Integer comId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.com_name
     *
     * @mbg.generated
     */
    private String comName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.rebate
     *
     * @mbg.generated
     */
    private BigDecimal rebate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.begin_date
     *
     * @mbg.generated
     */
    private LocalDateTime beginDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.end_date
     *
     * @mbg.generated
     */
    private LocalDateTime endDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.expire_flag
     *
     * @mbg.generated
     */
    private Boolean expireFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_promotion_goods_rebate_rule.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.id
     *
     * @return the value of litemall_promotion_goods_rebate_rule.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.id
     *
     * @param id the value for litemall_promotion_goods_rebate_rule.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.name
     *
     * @return the value of litemall_promotion_goods_rebate_rule.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.name
     *
     * @param name the value for litemall_promotion_goods_rebate_rule.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.com_id
     *
     * @return the value of litemall_promotion_goods_rebate_rule.com_id
     *
     * @mbg.generated
     */
    public Integer getComId() {
        return comId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.com_id
     *
     * @param comId the value for litemall_promotion_goods_rebate_rule.com_id
     *
     * @mbg.generated
     */
    public void setComId(Integer comId) {
        this.comId = comId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.com_name
     *
     * @return the value of litemall_promotion_goods_rebate_rule.com_name
     *
     * @mbg.generated
     */
    public String getComName() {
        return comName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.com_name
     *
     * @param comName the value for litemall_promotion_goods_rebate_rule.com_name
     *
     * @mbg.generated
     */
    public void setComName(String comName) {
        this.comName = comName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.rebate
     *
     * @return the value of litemall_promotion_goods_rebate_rule.rebate
     *
     * @mbg.generated
     */
    public BigDecimal getRebate() {
        return rebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.rebate
     *
     * @param rebate the value for litemall_promotion_goods_rebate_rule.rebate
     *
     * @mbg.generated
     */
    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.begin_date
     *
     * @return the value of litemall_promotion_goods_rebate_rule.begin_date
     *
     * @mbg.generated
     */
    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.begin_date
     *
     * @param beginDate the value for litemall_promotion_goods_rebate_rule.begin_date
     *
     * @mbg.generated
     */
    public void setBeginDate(LocalDateTime beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.end_date
     *
     * @return the value of litemall_promotion_goods_rebate_rule.end_date
     *
     * @mbg.generated
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.end_date
     *
     * @param endDate the value for litemall_promotion_goods_rebate_rule.end_date
     *
     * @mbg.generated
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.expire_flag
     *
     * @return the value of litemall_promotion_goods_rebate_rule.expire_flag
     *
     * @mbg.generated
     */
    public Boolean getExpireFlag() {
        return expireFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.expire_flag
     *
     * @param expireFlag the value for litemall_promotion_goods_rebate_rule.expire_flag
     *
     * @mbg.generated
     */
    public void setExpireFlag(Boolean expireFlag) {
        this.expireFlag = expireFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.remark
     *
     * @return the value of litemall_promotion_goods_rebate_rule.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.remark
     *
     * @param remark the value for litemall_promotion_goods_rebate_rule.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.add_time
     *
     * @return the value of litemall_promotion_goods_rebate_rule.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.add_time
     *
     * @param addTime the value for litemall_promotion_goods_rebate_rule.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.update_time
     *
     * @return the value of litemall_promotion_goods_rebate_rule.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.update_time
     *
     * @param updateTime the value for litemall_promotion_goods_rebate_rule.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_promotion_goods_rebate_rule.deleted
     *
     * @return the value of litemall_promotion_goods_rebate_rule.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_promotion_goods_rebate_rule.deleted
     *
     * @param deleted the value for litemall_promotion_goods_rebate_rule.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_rebate_rule
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
        sb.append(", name=").append(name);
        sb.append(", comId=").append(comId);
        sb.append(", comName=").append(comName);
        sb.append(", rebate=").append(rebate);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", expireFlag=").append(expireFlag);
        sb.append(", remark=").append(remark);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_rebate_rule
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
        LitemallPromotionGoodsRebateRule other = (LitemallPromotionGoodsRebateRule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getComId() == null ? other.getComId() == null : this.getComId().equals(other.getComId()))
            && (this.getComName() == null ? other.getComName() == null : this.getComName().equals(other.getComName()))
            && (this.getRebate() == null ? other.getRebate() == null : this.getRebate().equals(other.getRebate()))
            && (this.getBeginDate() == null ? other.getBeginDate() == null : this.getBeginDate().equals(other.getBeginDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getExpireFlag() == null ? other.getExpireFlag() == null : this.getExpireFlag().equals(other.getExpireFlag()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_rebate_rule
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getComId() == null) ? 0 : getComId().hashCode());
        result = prime * result + ((getComName() == null) ? 0 : getComName().hashCode());
        result = prime * result + ((getRebate() == null) ? 0 : getRebate().hashCode());
        result = prime * result + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getExpireFlag() == null) ? 0 : getExpireFlag().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_rebate_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_promotion_goods_rebate_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        comId("com_id", "comId", "INTEGER", false),
        comName("com_name", "comName", "VARCHAR", false),
        rebate("rebate", "rebate", "DECIMAL", false),
        beginDate("begin_date", "beginDate", "TIMESTAMP", false),
        endDate("end_date", "endDate", "TIMESTAMP", false),
        expireFlag("expire_flag", "expireFlag", "BIT", false),
        remark("remark", "remark", "VARCHAR", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rebate_rule
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
         * This method corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rebate_rule
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_promotion_goods_rebate_rule
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
         * This method corresponds to the database table litemall_promotion_goods_rebate_rule
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