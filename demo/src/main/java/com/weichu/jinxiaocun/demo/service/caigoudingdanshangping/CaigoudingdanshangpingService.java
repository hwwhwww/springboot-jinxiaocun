package com.weichu.jinxiaocun.demo.service.caigoudingdanshangping;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanshangping;
import org.omg.CORBA.INTERNAL;

import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoudingdanshangpingService {

    public Integer shanChu(Integer id, Integer spId);

    public Caigoudingdanshangping getCaigoudingdanshangpingById(Long id)throws Exception;

    public List<Caigoudingdanshangping>	getCaigoudingdanshangpingListByMap(Map<String,Object> param)throws Exception;

    public Integer getCaigoudingdanshangpingCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoudingdanshangping(Caigoudingdanshangping caigoudingdanshangping)throws Exception;

    public Integer itriptxModifyCaigoudingdanshangping(Caigoudingdanshangping caigoudingdanshangping)throws Exception;

    public Integer itriptxDeleteCaigoudingdanshangpingById(String[] id)throws Exception;

}
