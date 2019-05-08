package com.weichu.jinxiaocun.demo.service.caigoushenqingshangping;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqingshangping;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoushenqingshangpingService {

    public Integer tianJia(@Param("cgsqloyeeList")List<Caigoushenqingshangping> cgsqloyeeList);
    public Integer xiuGai(@Param("list")List<Caigoushenqingshangping> list);

    public Caigoushenqingshangping getCaigoushenqingshangpingById(Long id)throws Exception;

    public List<Caigoushenqingshangping>	getCaigoushenqingshangpingListByMap(Map<String,Object> param)throws Exception;

    public Integer getCaigoushenqingshangpingCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoushenqingshangping(Caigoushenqingshangping caigoushenqingshangping)throws Exception;

    public Integer itriptxModifyCaigoushenqingshangping(Caigoushenqingshangping caigoushenqingshangping)throws Exception;

    public Integer itriptxDeleteCaigoushenqingshangpingById(String[] ids)throws Exception;

    public List<Caigoushenqingshangping> getCaigoushanpinxsList(String cgsqId);
}
