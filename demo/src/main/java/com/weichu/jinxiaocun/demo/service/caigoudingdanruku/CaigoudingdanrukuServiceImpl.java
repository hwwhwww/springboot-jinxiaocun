package com.weichu.jinxiaocun.demo.service.caigoudingdanruku;
import com.weichu.jinxiaocun.demo.mapper.caigoudingdanruku.CaigoudingdanrukuMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanruku;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaigoudingdanrukuServiceImpl implements CaigoudingdanrukuService {

    @Resource
    private CaigoudingdanrukuMapper caigoudingdanrukuMapper;

    public Caigoudingdanruku getCaigoudingdanrukuById(Long id)throws Exception{
        return caigoudingdanrukuMapper.getCaigoudingdanrukuById(id);
    }

    public List<Caigoudingdanruku>	getCaigoudingdanrukuListByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanrukuMapper.getCaigoudingdanrukuListByMap(param);
    }

    public Integer getCaigoudingdanrukuCountByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanrukuMapper.getCaigoudingdanrukuCountByMap(param);
    }

    public Integer itriptxAddCaigoudingdanruku(Caigoudingdanruku caigoudingdanruku)throws Exception{
            return caigoudingdanrukuMapper.insertCaigoudingdanruku(caigoudingdanruku);
    }

    public Integer itriptxModifyCaigoudingdanruku(Caigoudingdanruku caigoudingdanruku)throws Exception{
        return caigoudingdanrukuMapper.updateCaigoudingdanruku(caigoudingdanruku);
    }

    public Integer itriptxDeleteCaigoudingdanrukuById(Long id)throws Exception{
        return caigoudingdanrukuMapper.deleteCaigoudingdanrukuById(id);
    }


}
