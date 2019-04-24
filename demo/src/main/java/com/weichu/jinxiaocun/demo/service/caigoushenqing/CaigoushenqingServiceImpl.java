package com.weichu.jinxiaocun.demo.service.caigoushenqing;
import com.weichu.jinxiaocun.demo.mapper.caigoushenqing.CaigoushenqingMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqing;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class CaigoushenqingServiceImpl implements CaigoushenqingService {

    @Resource
    private CaigoushenqingMapper caigoushenqingMapper;

    public Caigoushenqing getCaigoushenqingById(Long id)throws Exception{
        return caigoushenqingMapper.getCaigoushenqingById(id);
    }

    public List<Caigoushenqing>	getCaigoushenqingListByMap(Map<String,Object> param)throws Exception{
        return caigoushenqingMapper.getCaigoushenqingListByMap(param);
    }

    public Integer getCaigoushenqingCountByMap(Map<String,Object> param)throws Exception{
        return caigoushenqingMapper.getCaigoushenqingCountByMap(param);
    }

    public Integer itriptxAddCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception{
            caigoushenqing.setCreationDate(new Date());
            return caigoushenqingMapper.insertCaigoushenqing(caigoushenqing);
    }

    public Integer itriptxModifyCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception{
        caigoushenqing.setModifyDate(new Date());
        return caigoushenqingMapper.updateCaigoushenqing(caigoushenqing);
    }

    public Integer itriptxDeleteCaigoushenqingById(Long id)throws Exception{
        return caigoushenqingMapper.deleteCaigoushenqingById(id);
    }


}
