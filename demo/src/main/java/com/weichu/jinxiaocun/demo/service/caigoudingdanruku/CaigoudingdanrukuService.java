package com.weichu.jinxiaocun.demo.service.caigoudingdanruku;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanruku;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoudingdanrukuService {

    public Caigoudingdanruku getCaigoudingdanrukuById(Long id)throws Exception;

    public List<Caigoudingdanruku>	getCaigoudingdanrukuListByMap(Map<String,Object> param)throws Exception;

    public Integer getCaigoudingdanrukuCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoudingdanruku(Caigoudingdanruku caigoudingdanruku)throws Exception;

    public Integer itriptxModifyCaigoudingdanruku(Caigoudingdanruku caigoudingdanruku)throws Exception;

    public Integer itriptxDeleteCaigoudingdanrukuById(Long id)throws Exception;

}
