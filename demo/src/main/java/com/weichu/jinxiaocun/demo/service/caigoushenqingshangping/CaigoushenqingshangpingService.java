package com.weichu.jinxiaocun.demo.service.caigoushenqingshangping;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqingshangping;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoushenqingshangpingService {

    public Caigoushenqingshangping getCaigoushenqingshangpingById(Long id)throws Exception;

    public List<Caigoushenqingshangping>	getCaigoushenqingshangpingListByMap(Map<String,Object> param)throws Exception;

    public Integer getCaigoushenqingshangpingCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoushenqingshangping(Caigoushenqingshangping caigoushenqingshangping)throws Exception;

    public Integer itriptxModifyCaigoushenqingshangping(Caigoushenqingshangping caigoushenqingshangping)throws Exception;

    public Integer itriptxDeleteCaigoushenqingshangpingById(Long id)throws Exception;

}
