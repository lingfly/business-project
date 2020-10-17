package com.github.quick.spring.boot.business.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.quick.spring.boot.business.dao.entity.ProductGoods;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductGoodsMapper extends BaseMapper<ProductGoods> {
    int updateBatch(List<ProductGoods> list);

    int updateBatchSelective(List<ProductGoods> list);

    int batchInsert(@Param("list") List<ProductGoods> list);

    int insertOrUpdate(ProductGoods record);

    int insertOrUpdateSelective(ProductGoods record);
}