package com.weichu.jinxiaocun.demo.service.caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdan;
import org.apache.ibatis.annotations.Param;

import java.util.*;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoudingdanService {

    public Integer zuiDaZhi();

    public List<Caigoudingdan> chaXunMeiYou(Integer id);

    public Caigoudingdan getCaigoudingdanById(Long id)throws Exception;

    public List<Caigoudingdan>	getCaigoudingdanListByMap(Map<String,Object> param)throws Exception;

    public Integer getCaigoudingdanCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception;

    public Integer itriptxModifyCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception;

    public Integer itriptxDeleteCaigoudingdanById(String id)throws Exception;

    public List<Caigoudingdan> chaXun(@Param("id")Integer id,
                                      @Param("gysId")Integer gysId,
                                      @Param("rqYi")String rqYi,
                                      @Param("rqEr")String rqEr);
}
