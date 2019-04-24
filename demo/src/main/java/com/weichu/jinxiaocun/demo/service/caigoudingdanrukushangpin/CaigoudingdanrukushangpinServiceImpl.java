package com.weichu.jinxiaocun.demo.service.caigoudingdanrukushangpin;
import com.weichu.jinxiaocun.demo.mapper.caigoudingdanrukushangpin.CaigoudingdanrukushangpinMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanrukushangpin;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class CaigoudingdanrukushangpinServiceImpl implements CaigoudingdanrukushangpinService {

    @Resource
    private CaigoudingdanrukushangpinMapper caigoudingdanrukushangpinMapper;

    public Caigoudingdanrukushangpin getCaigoudingdanrukushangpinById(Long id)throws Exception{
        return caigoudingdanrukushangpinMapper.getCaigoudingdanrukushangpinById(id);
    }

    public List<Caigoudingdanrukushangpin>	getCaigoudingdanrukushangpinListByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanrukushangpinMapper.getCaigoudingdanrukushangpinListByMap(param);
    }

    public Integer getCaigoudingdanrukushangpinCountByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanrukushangpinMapper.getCaigoudingdanrukushangpinCountByMap(param);
    }

    public Integer itriptxAddCaigoudingdanrukushangpin(Caigoudingdanrukushangpin caigoudingdanrukushangpin)throws Exception{
            caigoudingdanrukushangpin.setCreationDate(new Date());
            return caigoudingdanrukushangpinMapper.insertCaigoudingdanrukushangpin(caigoudingdanrukushangpin);
    }

    public Integer itriptxModifyCaigoudingdanrukushangpin(Caigoudingdanrukushangpin caigoudingdanrukushangpin)throws Exception{
        caigoudingdanrukushangpin.setModifyDate(new Date());
        return caigoudingdanrukushangpinMapper.updateCaigoudingdanrukushangpin(caigoudingdanrukushangpin);
    }

    public Integer itriptxDeleteCaigoudingdanrukushangpinById(Long id)throws Exception{
        return caigoudingdanrukushangpinMapper.deleteCaigoudingdanrukushangpinById(id);
    }


}
