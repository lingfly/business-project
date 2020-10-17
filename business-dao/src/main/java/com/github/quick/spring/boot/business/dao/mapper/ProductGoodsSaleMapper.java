package com.github.quick.spring.boot.business.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.business.dao.entity.ProductGoodsSale;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductGoodsSaleMapper extends BaseMapper<ProductGoodsSale> {
    int updateBatch(List<ProductGoodsSale> list);

    int updateBatchSelective(List<ProductGoodsSale> list);

    int batchInsert(@Param("list") List<ProductGoodsSale> list);

    int insertOrUpdate(ProductGoodsSale record);

    int insertOrUpdateSelective(ProductGoodsSale record);
}