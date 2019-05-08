package com.weichu.jinxiaocun.demo.mapper.zijinzhanghao;

import com.weichu.jinxiaocun.demo.bean.Zijinzhanghao;

import java.util.List;

public interface ZijinzhanghaoMapper {

    public Integer xiuGai(Zijinzhanghao zijinzhanghao);

    public Integer shanChu(Integer id);

    public Integer tianJia(Zijinzhanghao zijinzhanghao);

    public List<Zijinzhanghao> chaXun();
}
