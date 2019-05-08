package com.weichu.jinxiaocun.demo.service.caigoutuihuo;
import com.weichu.jinxiaocun.demo.bean.Caigoutuihuo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoutuihuoService {

    public Caigoutuihuo getCaigoutuihuoById(Long id)throws Exception;

    public List<Caigoutuihuo>	getCaigoutuihuoListByMap(Map<String,Object> param)throws Exception;

    public Integer getCaigoutuihuoCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoutuihuo(Caigoutuihuo caigoutuihuo)throws Exception;

    public Integer itriptxModifyCaigoutuihuo(Caigoutuihuo caigoutuihuo)throws Exception;

    public Integer itriptxDeleteCaigoutuihuoById(String ids)throws Exception;

    public List<Caigoutuihuo> chaXun(Map<String,Object> map);

    public Caigoutuihuo chaXunDan(@Param("id")Integer id);

}
