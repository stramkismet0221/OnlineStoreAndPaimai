package org.jinyuanjava.litemall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallArticleList {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_article_list
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_article_list
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.class_id
     *
     * @mbg.generated
     */
    private Integer classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.class_name
     *
     * @mbg.generated
     */
    private String className;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.class_path
     *
     * @mbg.generated
     */
    private String classPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.author
     *
     * @mbg.generated
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.pub_date
     *
     * @mbg.generated
     */
    private LocalDateTime pubDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.sort_order
     *
     * @mbg.generated
     */
    private Integer sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.tenant_id
     *
     * @mbg.generated
     */
    private Integer tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.user_create_id
     *
     * @mbg.generated
     */
    private Integer userCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.user_modify_id
     *
     * @mbg.generated
     */
    private Integer userModifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.op_create_id
     *
     * @mbg.generated
     */
    private Integer opCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.op_modify_id
     *
     * @mbg.generated
     */
    private Integer opModifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_article_list.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.id
     *
     * @return the value of litemall_article_list.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.id
     *
     * @param id the value for litemall_article_list.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.class_id
     *
     * @return the value of litemall_article_list.class_id
     *
     * @mbg.generated
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.class_id
     *
     * @param classId the value for litemall_article_list.class_id
     *
     * @mbg.generated
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.class_name
     *
     * @return the value of litemall_article_list.class_name
     *
     * @mbg.generated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.class_name
     *
     * @param className the value for litemall_article_list.class_name
     *
     * @mbg.generated
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.class_path
     *
     * @return the value of litemall_article_list.class_path
     *
     * @mbg.generated
     */
    public String getClassPath() {
        return classPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.class_path
     *
     * @param classPath the value for litemall_article_list.class_path
     *
     * @mbg.generated
     */
    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.title
     *
     * @return the value of litemall_article_list.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.title
     *
     * @param title the value for litemall_article_list.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.author
     *
     * @return the value of litemall_article_list.author
     *
     * @mbg.generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.author
     *
     * @param author the value for litemall_article_list.author
     *
     * @mbg.generated
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.pub_date
     *
     * @return the value of litemall_article_list.pub_date
     *
     * @mbg.generated
     */
    public LocalDateTime getPubDate() {
        return pubDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.pub_date
     *
     * @param pubDate the value for litemall_article_list.pub_date
     *
     * @mbg.generated
     */
    public void setPubDate(LocalDateTime pubDate) {
        this.pubDate = pubDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.sort_order
     *
     * @return the value of litemall_article_list.sort_order
     *
     * @mbg.generated
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.sort_order
     *
     * @param sortOrder the value for litemall_article_list.sort_order
     *
     * @mbg.generated
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.add_time
     *
     * @return the value of litemall_article_list.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.add_time
     *
     * @param addTime the value for litemall_article_list.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.update_time
     *
     * @return the value of litemall_article_list.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.update_time
     *
     * @param updateTime the value for litemall_article_list.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.deleted
     *
     * @return the value of litemall_article_list.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.deleted
     *
     * @param deleted the value for litemall_article_list.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.tenant_id
     *
     * @return the value of litemall_article_list.tenant_id
     *
     * @mbg.generated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.tenant_id
     *
     * @param tenantId the value for litemall_article_list.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.user_create_id
     *
     * @return the value of litemall_article_list.user_create_id
     *
     * @mbg.generated
     */
    public Integer getUserCreateId() {
        return userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.user_create_id
     *
     * @param userCreateId the value for litemall_article_list.user_create_id
     *
     * @mbg.generated
     */
    public void setUserCreateId(Integer userCreateId) {
        this.userCreateId = userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.user_modify_id
     *
     * @return the value of litemall_article_list.user_modify_id
     *
     * @mbg.generated
     */
    public Integer getUserModifyId() {
        return userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.user_modify_id
     *
     * @param userModifyId the value for litemall_article_list.user_modify_id
     *
     * @mbg.generated
     */
    public void setUserModifyId(Integer userModifyId) {
        this.userModifyId = userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.op_create_id
     *
     * @return the value of litemall_article_list.op_create_id
     *
     * @mbg.generated
     */
    public Integer getOpCreateId() {
        return opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.op_create_id
     *
     * @param opCreateId the value for litemall_article_list.op_create_id
     *
     * @mbg.generated
     */
    public void setOpCreateId(Integer opCreateId) {
        this.opCreateId = opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.op_modify_id
     *
     * @return the value of litemall_article_list.op_modify_id
     *
     * @mbg.generated
     */
    public Integer getOpModifyId() {
        return opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.op_modify_id
     *
     * @param opModifyId the value for litemall_article_list.op_modify_id
     *
     * @mbg.generated
     */
    public void setOpModifyId(Integer opModifyId) {
        this.opModifyId = opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_article_list.content
     *
     * @return the value of litemall_article_list.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_article_list.content
     *
     * @param content the value for litemall_article_list.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_article_list
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
        sb.append(", classId=").append(classId);
        sb.append(", className=").append(className);
        sb.append(", classPath=").append(classPath);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append(", pubDate=").append(pubDate);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", userCreateId=").append(userCreateId);
        sb.append(", userModifyId=").append(userModifyId);
        sb.append(", opCreateId=").append(opCreateId);
        sb.append(", opModifyId=").append(opModifyId);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_article_list
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
        LitemallArticleList other = (LitemallArticleList) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
            && (this.getClassPath() == null ? other.getClassPath() == null : this.getClassPath().equals(other.getClassPath()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getPubDate() == null ? other.getPubDate() == null : this.getPubDate().equals(other.getPubDate()))
            && (this.getSortOrder() == null ? other.getSortOrder() == null : this.getSortOrder().equals(other.getSortOrder()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getUserCreateId() == null ? other.getUserCreateId() == null : this.getUserCreateId().equals(other.getUserCreateId()))
            && (this.getUserModifyId() == null ? other.getUserModifyId() == null : this.getUserModifyId().equals(other.getUserModifyId()))
            && (this.getOpCreateId() == null ? other.getOpCreateId() == null : this.getOpCreateId().equals(other.getOpCreateId()))
            && (this.getOpModifyId() == null ? other.getOpModifyId() == null : this.getOpModifyId().equals(other.getOpModifyId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_article_list
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getClassPath() == null) ? 0 : getClassPath().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getPubDate() == null) ? 0 : getPubDate().hashCode());
        result = prime * result + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getUserCreateId() == null) ? 0 : getUserCreateId().hashCode());
        result = prime * result + ((getUserModifyId() == null) ? 0 : getUserModifyId().hashCode());
        result = prime * result + ((getOpCreateId() == null) ? 0 : getOpCreateId().hashCode());
        result = prime * result + ((getOpModifyId() == null) ? 0 : getOpModifyId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_article_list
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_article_list
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        classId("class_id", "classId", "INTEGER", false),
        className("class_name", "className", "VARCHAR", false),
        classPath("class_path", "classPath", "VARCHAR", false),
        title("title", "title", "VARCHAR", false),
        author("author", "author", "VARCHAR", false),
        pubDate("pub_date", "pubDate", "TIMESTAMP", false),
        sortOrder("sort_order", "sortOrder", "INTEGER", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false),
        tenantId("tenant_id", "tenantId", "INTEGER", false),
        userCreateId("user_create_id", "userCreateId", "INTEGER", false),
        userModifyId("user_modify_id", "userModifyId", "INTEGER", false),
        opCreateId("op_create_id", "opCreateId", "INTEGER", false),
        opModifyId("op_modify_id", "opModifyId", "INTEGER", false),
        content("content", "content", "LONGVARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_article_list
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
         * This method corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_article_list
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_article_list
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
         * This method corresponds to the database table litemall_article_list
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