package com.github.quick.spring.boot.business.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

@TableName(value = "product_shop")
public class ProductShop implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商铺名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 门脸照片
     */
    @TableField(value = "face_pic")
    private String facePic;

    /**
     * 室内照片
     */
    @TableField(value = "indoor_pics")
    private String indoorPics;

    /**
     * 营业执照
     */
    @TableField(value = "business_license")
    private String businessLicense;

    /**
     * 食品许可证
     */
    @TableField(value = "food_license")
    private String foodLicense;

    /**
     * 是否通过
     */
    @TableField(value = "`check`")
    private Byte check;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_ADDRESS = "address";

    public static final String COL_FACE_PIC = "face_pic";

    public static final String COL_INDOOR_PICS = "indoor_pics";

    public static final String COL_BUSINESS_LICENSE = "business_license";

    public static final String COL_FOOD_LICENSE = "food_license";

    public static final String COL_CHECK = "check";

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
     * 获取商铺名称
     *
     * @return name - 商铺名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商铺名称
     *
     * @param name 商铺名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取门脸照片
     *
     * @return face_pic - 门脸照片
     */
    public String getFacePic() {
        return facePic;
    }

    /**
     * 设置门脸照片
     *
     * @param facePic 门脸照片
     */
    public void setFacePic(String facePic) {
        this.facePic = facePic;
    }

    /**
     * 获取室内照片
     *
     * @return indoor_pics - 室内照片
     */
    public String getIndoorPics() {
        return indoorPics;
    }

    /**
     * 设置室内照片
     *
     * @param indoorPics 室内照片
     */
    public void setIndoorPics(String indoorPics) {
        this.indoorPics = indoorPics;
    }

    /**
     * 获取营业执照
     *
     * @return business_license - 营业执照
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * 设置营业执照
     *
     * @param businessLicense 营业执照
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * 获取食品许可证
     *
     * @return food_license - 食品许可证
     */
    public String getFoodLicense() {
        return foodLicense;
    }

    /**
     * 设置食品许可证
     *
     * @param foodLicense 食品许可证
     */
    public void setFoodLicense(String foodLicense) {
        this.foodLicense = foodLicense;
    }

    /**
     * 获取是否通过
     *
     * @return check - 是否通过
     */
    public Byte getCheck() {
        return check;
    }

    /**
     * 设置是否通过
     *
     * @param check 是否通过
     */
    public void setCheck(Byte check) {
        this.check = check;
    }
}