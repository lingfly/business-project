package com.github.quick.spring.boot.business.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
    * 在售商品
    */
@TableName(value = "product_goods_sale")
public class ProductGoodsSale implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品id
     */
    @TableField(value = "goods_id")
    private Long goodsId;

    /**
     * 最小购买数量
     */
    @TableField(value = "min_quantity")
    private Integer minQuantity;

    /**
     * 最大购买数量
     */
    @TableField(value = "max_quantity")
    private Integer maxQuantity;

    /**
     * 当日库存
     */
    @TableField(value = "`size`")
    private Integer size;

    /**
     * 冻结数量
     */
    @TableField(value = "`freeze`")
    private Integer freeze;

    /**
     * 开始售卖时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 结束售卖时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_GOODS_ID = "goods_id";

    public static final String COL_MIN_QUANTITY = "min_quantity";

    public static final String COL_MAX_QUANTITY = "max_quantity";

    public static final String COL_SIZE = "size";

    public static final String COL_FREEZE = "freeze";

    public static final String COL_START_TIME = "start_time";

    public static final String COL_END_TIME = "end_time";

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
     * 获取商品id
     *
     * @return goods_id - 商品id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品id
     *
     * @param goodsId 商品id
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取最小购买数量
     *
     * @return min_quantity - 最小购买数量
     */
    public Integer getMinQuantity() {
        return minQuantity;
    }

    /**
     * 设置最小购买数量
     *
     * @param minQuantity 最小购买数量
     */
    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    /**
     * 获取最大购买数量
     *
     * @return max_quantity - 最大购买数量
     */
    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * 设置最大购买数量
     *
     * @param maxQuantity 最大购买数量
     */
    public void setMaxQuantity(Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    /**
     * 获取当日库存
     *
     * @return size - 当日库存
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 设置当日库存
     *
     * @param size 当日库存
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 获取冻结数量
     *
     * @return freeze - 冻结数量
     */
    public Integer getFreeze() {
        return freeze;
    }

    /**
     * 设置冻结数量
     *
     * @param freeze 冻结数量
     */
    public void setFreeze(Integer freeze) {
        this.freeze = freeze;
    }

    /**
     * 获取开始售卖时间
     *
     * @return start_time - 开始售卖时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始售卖时间
     *
     * @param startTime 开始售卖时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束售卖时间
     *
     * @return end_time - 结束售卖时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束售卖时间
     *
     * @param endTime 结束售卖时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}