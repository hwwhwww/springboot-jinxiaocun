package com.weichu.jinxiaocun.demo.service.ziyuan;

import com.weichu.jinxiaocun.demo.bean.Ziyuan;

import java.util.List;
import java.util.Map;

/**
* Created by shang-pc on 2015/11/7.
*/
public interface ZiyuanService {

    List<Ziyuan> allZiYuan();

    public Ziyuan getZiyuanById(Long id)throws Exception;

    public List<Ziyuan>	getZiyuanListByMap(Map<String, Object> param)throws Exception;

    public Integer getZiyuanCountByMap(Map<String, Object> param)throws Exception;

    public Integer itriptxAddZiyuan(Ziyuan ziyuan)throws Exception;

    public Integer itriptxModifyZiyuan(Ziyuan ziyuan)throws Exception;

    public Integer itriptxDeleteZiyuanById(Long id)throws Exception;

}
