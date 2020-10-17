package com.github.quick.spring.boot.business.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
    * 商铺评价
    */
@TableName(value = "product_shop_evaluate")
public class ProductShopEvaluate implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "shop_id")
    private Long shopId;

    /**
     * 服务等级
     */
    @TableField(value = "service_grade")
    private Short serviceGrade;

    /**
     * 描述等级
     */
    @TableField(value = "describe_grade")
    private Short describeGrade;

    /**
     * 价格等级
     */
    @TableField(value = "price_grade")
    private Short priceGrade;

    /**
     * 详情
     */
    @TableField(value = "content")
    private String content;

    /**
     * 消费者id
     */
    @TableField(value = "consumer_id")
    private Long consumerId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SHOP_ID = "shop_id";

    public static final String COL_SERVICE_GRADE = "service_grade";

    public static final String COL_DESCRIBE_GRADE = "describe_grade";

    public static final String COL_PRICE_GRADE = "price_grade";

    public static final String COL_CONTENT = "content";

    public static final String COL_CONSUMER_ID = "consumer_id";

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
     * @return shop_id
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取服务等级
     *
     * @return service_grade - 服务等级
     */
    public Short getServiceGrade() {
        return serviceGrade;
    }

    /**
     * 设置服务等级
     *
     * @param serviceGrade 服务等级
     */
    public void setServiceGrade(Short serviceGrade) {
        this.serviceGrade = serviceGrade;
    }

    /**
     * 获取描述等级
     *
     * @return describe_grade - 描述等级
     */
    public Short getDescribeGrade() {
        return describeGrade;
    }

    /**
     * 设置描述等级
     *
     * @param describeGrade 描述等级
     */
    public void setDescribeGrade(Short describeGrade) {
        this.describeGrade = describeGrade;
    }

    /**
     * 获取价格等级
     *
     * @return price_grade - 价格等级
     */
    public Short getPriceGrade() {
        return priceGrade;
    }

    /**
     * 设置价格等级
     *
     * @param priceGrade 价格等级
     */
    public void setPriceGrade(Short priceGrade) {
        this.priceGrade = priceGrade;
    }

    /**
     * 获取详情
     *
     * @return content - 详情
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置详情
     *
     * @param content 详情
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取消费者id
     *
     * @return consumer_id - 消费者id
     */
    public Long getConsumerId() {
        return consumerId;
    }

    /**
     * 设置消费者id
     *
     * @param consumerId 消费者id
     */
    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }
}