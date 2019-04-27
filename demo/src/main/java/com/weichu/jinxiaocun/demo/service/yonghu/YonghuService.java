package com.weichu.jinxiaocun.demo.service.yonghu;

import com.weichu.jinxiaocun.demo.bean.Yonghu;

import java.util.List;
import java.util.Map;

/**
* Created by shang-pc on 2015/11/7.
*/
public interface YonghuService {

    public Yonghu getYonghuById(Long id)throws Exception;

    public List<Yonghu>	getYonghuListByMap(Map<String, Object> param)throws Exception;

    public Integer getYonghuCountByMap(Map<String, Object> param)throws Exception;

    public Integer itriptxAddYonghu(Yonghu yonghu)throws Exception;

    public Integer itriptxModifyYonghu(Yonghu yonghu)throws Exception;

    public Integer itriptxDeleteYonghuById(Long id)throws Exception;

}
