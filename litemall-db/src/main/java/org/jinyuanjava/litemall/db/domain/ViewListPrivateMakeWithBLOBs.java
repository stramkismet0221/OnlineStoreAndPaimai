package org.jinyuanjava.litemall.db.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class ViewListPrivateMakeWithBLOBs extends ViewListPrivateMake {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_list_private_make.gallery
     *
     * @mbg.generated
     */
    private String gallery;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_list_private_make.detail
     *
     * @mbg.generated
     */
    private String detail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_list_private_make.gallery
     *
     * @return the value of view_list_private_make.gallery
     *
     * @mbg.generated
     */
    public String getGallery() {
        return gallery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_list_private_make.gallery
     *
     * @param gallery the value for view_list_private_make.gallery
     *
     * @mbg.generated
     */
    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_list_private_make.detail
     *
     * @return the value of view_list_private_make.detail
     *
     * @mbg.generated
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_list_private_make.detail
     *
     * @param detail the value for view_list_private_make.detail
     *
     * @mbg.generated
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_list_private_make
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gallery=").append(gallery);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_list_private_make
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
        ViewListPrivateMakeWithBLOBs other = (ViewListPrivateMakeWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsSn() == null ? other.getGoodsSn() == null : this.getGoodsSn().equals(other.getGoodsSn()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getIsOnSale() == null ? other.getIsOnSale() == null : this.getIsOnSale().equals(other.getIsOnSale()))
            && (this.getSortOrder() == null ? other.getSortOrder() == null : this.getSortOrder().equals(other.getSortOrder()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getShareUrl() == null ? other.getShareUrl() == null : this.getShareUrl().equals(other.getShareUrl()))
            && (this.getIsNew() == null ? other.getIsNew() == null : this.getIsNew().equals(other.getIsNew()))
            && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getCounterPrice() == null ? other.getCounterPrice() == null : this.getCounterPrice().equals(other.getCounterPrice()))
            && (this.getRetailPrice() == null ? other.getRetailPrice() == null : this.getRetailPrice().equals(other.getRetailPrice()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getComId() == null ? other.getComId() == null : this.getComId().equals(other.getComId()))
            && (this.getComName() == null ? other.getComName() == null : this.getComName().equals(other.getComName()))
            && (this.getIfStoreBiggerZero() == null ? other.getIfStoreBiggerZero() == null : this.getIfStoreBiggerZero().equals(other.getIfStoreBiggerZero()))
            && (this.getUsedRange() == null ? other.getUsedRange() == null : this.getUsedRange().equals(other.getUsedRange()))
            && (this.getAuthorId() == null ? other.getAuthorId() == null : this.getAuthorId().equals(other.getAuthorId()))
            && (this.getOrdernumber() == null ? other.getOrdernumber() == null : this.getOrdernumber().equals(other.getOrdernumber()))
            && (this.getGoodsProductId() == null ? other.getGoodsProductId() == null : this.getGoodsProductId().equals(other.getGoodsProductId()))
            && (this.getGoodsProductSpecifications() == null ? other.getGoodsProductSpecifications() == null : this.getGoodsProductSpecifications().equals(other.getGoodsProductSpecifications()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getDefaultProductId() == null ? other.getDefaultProductId() == null : this.getDefaultProductId().equals(other.getDefaultProductId()))
            && (this.getIfXuni() == null ? other.getIfXuni() == null : this.getIfXuni().equals(other.getIfXuni()))
            && (this.getIfTicket() == null ? other.getIfTicket() == null : this.getIfTicket().equals(other.getIfTicket()))
            && (this.getIfListGoods() == null ? other.getIfListGoods() == null : this.getIfListGoods().equals(other.getIfListGoods()))
            && (this.getGallery() == null ? other.getGallery() == null : this.getGallery().equals(other.getGallery()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_list_private_make
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsSn() == null) ? 0 : getGoodsSn().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getIsOnSale() == null) ? 0 : getIsOnSale().hashCode());
        result = prime * result + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getShareUrl() == null) ? 0 : getShareUrl().hashCode());
        result = prime * result + ((getIsNew() == null) ? 0 : getIsNew().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getCounterPrice() == null) ? 0 : getCounterPrice().hashCode());
        result = prime * result + ((getRetailPrice() == null) ? 0 : getRetailPrice().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getComId() == null) ? 0 : getComId().hashCode());
        result = prime * result + ((getComName() == null) ? 0 : getComName().hashCode());
        result = prime * result + ((getIfStoreBiggerZero() == null) ? 0 : getIfStoreBiggerZero().hashCode());
        result = prime * result + ((getUsedRange() == null) ? 0 : getUsedRange().hashCode());
        result = prime * result + ((getAuthorId() == null) ? 0 : getAuthorId().hashCode());
        result = prime * result + ((getOrdernumber() == null) ? 0 : getOrdernumber().hashCode());
        result = prime * result + ((getGoodsProductId() == null) ? 0 : getGoodsProductId().hashCode());
        result = prime * result + ((getGoodsProductSpecifications() == null) ? 0 : getGoodsProductSpecifications().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getDefaultProductId() == null) ? 0 : getDefaultProductId().hashCode());
        result = prime * result + ((getIfXuni() == null) ? 0 : getIfXuni().hashCode());
        result = prime * result + ((getIfTicket() == null) ? 0 : getIfTicket().hashCode());
        result = prime * result + ((getIfListGoods() == null) ? 0 : getIfListGoods().hashCode());
        result = prime * result + ((getGallery() == null) ? 0 : getGallery().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table view_list_private_make
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        goodsId("goods_id", "goodsId", "INTEGER", false),
        goodsSn("goods_sn", "goodsSn", "VARCHAR", false),
        name("name", "name", "VARCHAR", true),
        categoryId("category_id", "categoryId", "INTEGER", false),
        brandId("brand_id", "brandId", "INTEGER", false),
        keywords("keywords", "keywords", "VARCHAR", false),
        brief("brief", "brief", "VARCHAR", false),
        isOnSale("is_on_sale", "isOnSale", "TINYINT", false),
        sortOrder("sort_order", "sortOrder", "SMALLINT", false),
        picUrl("pic_url", "picUrl", "VARCHAR", false),
        shareUrl("share_url", "shareUrl", "VARCHAR", false),
        isNew("is_new", "isNew", "TINYINT", false),
        isHot("is_hot", "isHot", "TINYINT", false),
        unit("unit", "unit", "VARCHAR", false),
        counterPrice("counter_price", "counterPrice", "DECIMAL", false),
        retailPrice("retail_price", "retailPrice", "DECIMAL", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "TINYINT", false),
        comId("com_id", "comId", "INTEGER", false),
        comName("com_name", "comName", "VARCHAR", false),
        ifStoreBiggerZero("if_store_bigger_zero", "ifStoreBiggerZero", "TINYINT", false),
        usedRange("used_range", "usedRange", "VARCHAR", false),
        authorId("author_id", "authorId", "INTEGER", false),
        ordernumber("ordernumber", "ordernumber", "TINYINT", false),
        goodsProductId("goods_product_id", "goodsProductId", "INTEGER", false),
        goodsProductSpecifications("goods_product_specifications", "goodsProductSpecifications", "VARCHAR", false),
        goodsName("goods_name", "goodsName", "VARCHAR", false),
        defaultProductId("default_product_id", "defaultProductId", "INTEGER", false),
        ifXuni("if_xuni", "ifXuni", "TINYINT", false),
        ifTicket("if_ticket", "ifTicket", "TINYINT", false),
        ifListGoods("if_list_goods", "ifListGoods", "TINYINT", false),
        gallery("gallery", "gallery", "LONGVARCHAR", false),
        detail("detail", "detail", "LONGVARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_list_private_make
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
         * This method corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_list_private_make
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_list_private_make
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
         * This method corresponds to the database table view_list_private_make
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
