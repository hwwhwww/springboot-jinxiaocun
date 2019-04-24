package com.weichu.jinxiaocun.demo.service.xiaoshoudingdanchuku;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoudingdanchuku;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface XiaoshoudingdanchukuService {

    public Xiaoshoudingdanchuku getXiaoshoudingdanchukuById(Long id)throws Exception;

    public List<Xiaoshoudingdanchuku>	getXiaoshoudingdanchukuListByMap(Map<String,Object> param)throws Exception;

    public Integer getXiaoshoudingdanchukuCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddXiaoshoudingdanchuku(Xiaoshoudingdanchuku xiaoshoudingdanchuku)throws Exception;

    public Integer itriptxModifyXiaoshoudingdanchuku(Xiaoshoudingdanchuku xiaoshoudingdanchuku)throws Exception;

    public Integer itriptxDeleteXiaoshoudingdanchukuById(Long id)throws Exception;

}
