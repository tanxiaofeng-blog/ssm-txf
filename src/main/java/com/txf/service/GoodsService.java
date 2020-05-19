package com.txf.service;

import com.txf.mapper.GoodsMapper;
import com.txf.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class GoodsService {
@Autowired
    GoodsMapper goodsMapper;

    public List<Goods> selectAll() {
        return goodsMapper.selectAll();

    }

    public int count() {
        return goodsMapper.count();
    }
}

