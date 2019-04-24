package com.weichu.jinxiaocun.demo.service.rukumingxi;
import com.weichu.jinxiaocun.demo.bean.Rukumingxi;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface RukumingxiService {

    public Rukumingxi getRukumingxiById(Long id)throws Exception;

    public List<Rukumingxi>	getRukumingxiListByMap(Map<String,Object> param)throws Exception;

    public Integer getRukumingxiCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddRukumingxi(Rukumingxi rukumingxi)throws Exception;

    public Integer itriptxModifyRukumingxi(Rukumingxi rukumingxi)throws Exception;

    public Integer itriptxDeleteRukumingxiById(Long id)throws Exception;

}
