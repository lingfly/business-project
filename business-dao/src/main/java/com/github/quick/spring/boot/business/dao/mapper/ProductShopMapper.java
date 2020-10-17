package com.github.quick.spring.boot.business.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.business.dao.entity.ProductShop;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductShopMapper extends BaseMapper<ProductShop> {
    int updateBatch(List<ProductShop> list);

    int updateBatchSelective(List<ProductShop> list);

    int batchInsert(@Param("list") List<ProductShop> list);

    int insertOrUpdate(ProductShop record);

    int insertOrUpdateSelective(ProductShop record);
}