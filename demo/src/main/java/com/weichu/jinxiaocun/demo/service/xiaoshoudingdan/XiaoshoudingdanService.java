package com.weichu.jinxiaocun.demo.service.xiaoshoudingdan;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoudingdan;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface XiaoshoudingdanService {

    public Xiaoshoudingdan getXiaoshoudingdanById(Long id)throws Exception;

    public List<Xiaoshoudingdan>	getXiaoshoudingdanListByMap(Map<String, Object> param)throws Exception;

    public Integer getXiaoshoudingdanCountByMap(Map<String, Object> param)throws Exception;

    public Integer itriptxAddXiaoshoudingdan(Xiaoshoudingdan xiaoshoudingdan)throws Exception;

    public Integer itriptxModifyXiaoshoudingdan(Xiaoshoudingdan xiaoshoudingdan)throws Exception;

    public Integer itriptxDeleteXiaoshoudingdanById(Long id)throws Exception;

}
