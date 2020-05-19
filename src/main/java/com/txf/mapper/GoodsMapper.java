package com.txf.mapper;

import com.txf.pojo.Goods;

import java.util.List;

public interface GoodsMapper {

    List<Goods> selectAll();

    int count();
}
