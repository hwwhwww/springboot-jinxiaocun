package com.weichu.jinxiaocun.demo.service.diaobamingxi;
import com.weichu.jinxiaocun.demo.bean.Diaobamingxi;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface DiaobamingxiService {

    public Diaobamingxi getDiaobamingxiById(Long id)throws Exception;

    public List<Diaobamingxi>	getDiaobamingxiListByMap(Map<String,Object> param)throws Exception;

    public Integer getDiaobamingxiCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddDiaobamingxi(Diaobamingxi diaobamingxi)throws Exception;

    public Integer itriptxModifyDiaobamingxi(Diaobamingxi diaobamingxi)throws Exception;

    public Integer itriptxDeleteDiaobamingxiById(Long id)throws Exception;

}
