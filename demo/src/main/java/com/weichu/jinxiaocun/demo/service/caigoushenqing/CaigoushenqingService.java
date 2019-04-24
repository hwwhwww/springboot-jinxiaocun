package com.weichu.jinxiaocun.demo.service.caigoushenqing;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqing;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoushenqingService {

    public Caigoushenqing getCaigoushenqingById(Long id)throws Exception;

    public List<Caigoushenqing>	getCaigoushenqingListByMap(Map<String,Object> param)throws Exception;

    public Integer getCaigoushenqingCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception;

    public Integer itriptxModifyCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception;

    public Integer itriptxDeleteCaigoushenqingById(Long id)throws Exception;

}
