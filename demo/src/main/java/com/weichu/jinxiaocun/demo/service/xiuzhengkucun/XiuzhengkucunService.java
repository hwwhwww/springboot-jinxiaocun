package com.weichu.jinxiaocun.demo.service.xiuzhengkucun;
import com.weichu.jinxiaocun.demo.bean.Xiuzhengkucun;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface XiuzhengkucunService {

    public Xiuzhengkucun getXiuzhengkucunById(Long id)throws Exception;

    public List<Xiuzhengkucun>	getXiuzhengkucunListByMap(Map<String,Object> param)throws Exception;

    public Integer getXiuzhengkucunCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddXiuzhengkucun(Xiuzhengkucun xiuzhengkucun)throws Exception;

    public Integer itriptxModifyXiuzhengkucun(Xiuzhengkucun xiuzhengkucun)throws Exception;

    public Integer itriptxDeleteXiuzhengkucunById(Long id)throws Exception;

}
