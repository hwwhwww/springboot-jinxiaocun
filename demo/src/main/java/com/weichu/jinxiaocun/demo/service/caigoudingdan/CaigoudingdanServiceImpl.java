package com.weichu.jinxiaocun.demo.service.caigoudingdan;
import com.weichu.jinxiaocun.demo.mapper.caigoudingdan.CaigoudingdanMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdan;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaigoudingdanServiceImpl implements CaigoudingdanService {

    @Resource
    private CaigoudingdanMapper caigoudingdanMapper;

    public Caigoudingdan getCaigoudingdanById(Long id)throws Exception{
        return caigoudingdanMapper.getCaigoudingdanById(id);
    }

    public List<Caigoudingdan>	getCaigoudingdanListByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanMapper.getCaigoudingdanListByMap(param);
    }

    public Integer getCaigoudingdanCountByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanMapper.getCaigoudingdanCountByMap(param);
    }

    public Integer itriptxAddCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception{
            return caigoudingdanMapper.insertCaigoudingdan(caigoudingdan);
    }

    public Integer itriptxModifyCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception{
        return caigoudingdanMapper.updateCaigoudingdan(caigoudingdan);
    }

    public Integer itriptxDeleteCaigoudingdanById(Long id)throws Exception{
        return caigoudingdanMapper.deleteCaigoudingdanById(id);
    }


}
