package com.weichu.jinxiaocun.demo.service.xiaoshoutueihuei;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoutueihuei;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface XiaoshoutueihueiService {

    public Xiaoshoutueihuei getXiaoshoutueihueiById(Long id)throws Exception;

    public List<Xiaoshoutueihuei>	getXiaoshoutueihueiListByMap(Map<String,Object> param)throws Exception;

    public Integer getXiaoshoutueihueiCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddXiaoshoutueihuei(Xiaoshoutueihuei xiaoshoutueihuei)throws Exception;

    public Integer itriptxModifyXiaoshoutueihuei(Xiaoshoutueihuei xiaoshoutueihuei)throws Exception;

    public Integer itriptxDeleteXiaoshoutueihueiById(Long id)throws Exception;

}
