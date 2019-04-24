package com.weichu.jinxiaocun.demo.service.xiaoshoudingdanshangping;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoudingdanshangping;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface XiaoshoudingdanshangpingService {

    public Xiaoshoudingdanshangping getXiaoshoudingdanshangpingById(Long id)throws Exception;

    public List<Xiaoshoudingdanshangping>	getXiaoshoudingdanshangpingListByMap(Map<String,Object> param)throws Exception;

    public Integer getXiaoshoudingdanshangpingCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddXiaoshoudingdanshangping(Xiaoshoudingdanshangping xiaoshoudingdanshangping)throws Exception;

    public Integer itriptxModifyXiaoshoudingdanshangping(Xiaoshoudingdanshangping xiaoshoudingdanshangping)throws Exception;

    public Integer itriptxDeleteXiaoshoudingdanshangpingById(Long id)throws Exception;

}
