package com.github.quick.spring.boot.business.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.business.dao.entity.ProductShopEvaluate;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductShopEvaluateMapper extends BaseMapper<ProductShopEvaluate> {
    int updateBatch(List<ProductShopEvaluate> list);

    int updateBatchSelective(List<ProductShopEvaluate> list);

    int batchInsert(@Param("list") List<ProductShopEvaluate> list);

    int insertOrUpdate(ProductShopEvaluate record);

    int insertOrUpdateSelective(ProductShopEvaluate record);
}