package com.weichu.jinxiaocun.demo.service.chukumingxi;
import com.weichu.jinxiaocun.demo.bean.Chukumingxi;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface ChukumingxiService {

    public Chukumingxi getChukumingxiById(Long id)throws Exception;

    public List<Chukumingxi>	getChukumingxiListByMap(Map<String,Object> param)throws Exception;

    public Integer getChukumingxiCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddChukumingxi(Chukumingxi chukumingxi)throws Exception;

    public Integer itriptxModifyChukumingxi(Chukumingxi chukumingxi)throws Exception;

    public Integer itriptxDeleteChukumingxiById(Long id)throws Exception;

}
