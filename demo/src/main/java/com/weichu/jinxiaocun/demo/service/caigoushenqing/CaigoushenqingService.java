package com.weichu.jinxiaocun.demo.service.caigoushenqing;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqing;
import org.apache.ibatis.annotations.Param;

import java.util.*;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoushenqingService {
    public List<Caigoushenqing> weiYinYong(Integer id);
    public Caigoushenqing getCaigoushenqingById(Long id)throws Exception;

    public List<Caigoushenqing>	getCaigoushenqingListByMap(Map<String,Object> param)throws Exception;
    public List<Caigoushenqing> chaXun(@Param("id")Integer id, @Param("rqYi")String rqYi,
                                      @Param("rqEr") String rqEr);
    public Integer getCaigoushenqingCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception;

    public Integer itriptxModifyCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception;

    public Integer itriptxDeleteCaigoushenqingById(String id)throws Exception;

    public List<Caigoushenqing> getCaiGouShengQingList(String cgsqId);
}
