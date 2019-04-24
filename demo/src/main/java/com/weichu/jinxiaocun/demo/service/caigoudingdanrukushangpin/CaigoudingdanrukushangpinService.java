package com.weichu.jinxiaocun.demo.service.caigoudingdanrukushangpin;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanrukushangpin;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoudingdanrukushangpinService {

    public Caigoudingdanrukushangpin getCaigoudingdanrukushangpinById(Long id)throws Exception;

    public List<Caigoudingdanrukushangpin>	getCaigoudingdanrukushangpinListByMap(Map<String,Object> param)throws Exception;

    public Integer getCaigoudingdanrukushangpinCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoudingdanrukushangpin(Caigoudingdanrukushangpin caigoudingdanrukushangpin)throws Exception;

    public Integer itriptxModifyCaigoudingdanrukushangpin(Caigoudingdanrukushangpin caigoudingdanrukushangpin)throws Exception;

    public Integer itriptxDeleteCaigoudingdanrukushangpinById(Long id)throws Exception;

}
