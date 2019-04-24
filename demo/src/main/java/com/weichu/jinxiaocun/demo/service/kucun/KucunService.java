package com.weichu.jinxiaocun.demo.service.kucun;
import com.weichu.jinxiaocun.demo.bean.Kucun;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface KucunService {

    public Kucun getKucunById(Long id)throws Exception;

    public List<Kucun>	getKucunListByMap(Map<String,Object> param)throws Exception;

    public Integer getKucunCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddKucun(Kucun kucun)throws Exception;

    public Integer itriptxModifyKucun(Kucun kucun)throws Exception;

    public Integer itriptxDeleteKucunById(Long id)throws Exception;

}
