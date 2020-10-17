package com.github.quick.spring.boot.business.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

@TableName(value = "product_goods")
public class ProductGoods implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商铺id
     */
    @TableField(value = "shop_id")
    private Long shopId;

    /**
     * 商品名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 第一类型
     */
    @TableField(value = "first_type")
    private String firstType;

    /**
     * 第二类型
     */
    @TableField(value = "second_type")
    private String secondType;

    /**
     * 商品图片
     */
    @TableField(value = "pic")
    private String pic;

    /**
     * 商品描述
     */
    @TableField(value = "`describe`")
    private String describe;

    /**
     * 商品单位 份、个
     */
    @TableField(value = "unit")
    private String unit;

    /**
     * 商品规格，大份、中份、小份。
     */
    @TableField(value = "specifications")
    private String specifications;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SHOP_ID = "shop_id";

    public static final String COL_NAME = "name";

    public static final String COL_FIRST_TYPE = "first_type";

    public static final String COL_SECOND_TYPE = "second_type";

    public static final String COL_PIC = "pic";

    public static final String COL_DESCRIBE = "describe";

    public static final String COL_UNIT = "unit";

    public static final String COL_SPECIFICATIONS = "specifications";

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商铺id
     *
     * @return shop_id - 商铺id
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * 设置商铺id
     *
     * @param shopId 商铺id
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取第一类型
     *
     * @return first_type - 第一类型
     */
    public String getFirstType() {
        return firstType;
    }

    /**
     * 设置第一类型
     *
     * @param firstType 第一类型
     */
    public void setFirstType(String firstType) {
        this.firstType = firstType;
    }

    /**
     * 获取第二类型
     *
     * @return second_type - 第二类型
     */
    public String getSecondType() {
        return secondType;
    }

    /**
     * 设置第二类型
     *
     * @param secondType 第二类型
     */
    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }

    /**
     * 获取商品图片
     *
     * @return pic - 商品图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置商品图片
     *
     * @param pic 商品图片
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取商品描述
     *
     * @return describe - 商品描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置商品描述
     *
     * @param describe 商品描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 获取商品单位 份、个
     *
     * @return unit - 商品单位 份、个
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置商品单位 份、个
     *
     * @param unit 商品单位 份、个
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取商品规格，大份、中份、小份。
     *
     * @return specifications - 商品规格，大份、中份、小份。
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * 设置商品规格，大份、中份、小份。
     *
     * @param specifications 商品规格，大份、中份、小份。
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }
}