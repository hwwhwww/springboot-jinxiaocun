package com.weichu.jinxiaocun.demo.service.caigoudingdanshangping;
import com.weichu.jinxiaocun.demo.mapper.caigoudingdanshangping.CaigoudingdanshangpingMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanshangping;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaigoudingdanshangpingServiceImpl implements CaigoudingdanshangpingService {

    @Resource
    private CaigoudingdanshangpingMapper caigoudingdanshangpingMapper;

    @Override
    public Integer shanChu(Integer id,Integer spId) {
        return caigoudingdanshangpingMapper.shanChu(id,spId);
    }

    public Caigoudingdanshangping getCaigoudingdanshangpingById(Long id)throws Exception{
        return caigoudingdanshangpingMapper.getCaigoudingdanshangpingById(id);
    }

    public List<Caigoudingdanshangping>	getCaigoudingdanshangpingListByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanshangpingMapper.getCaigoudingdanshangpingListByMap(param);
    }

    public Integer getCaigoudingdanshangpingCountByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanshangpingMapper.getCaigoudingdanshangpingCountByMap(param);
    }

    public Integer itriptxAddCaigoudingdanshangping(Caigoudingdanshangping caigoudingdanshangping)throws Exception{
            return caigoudingdanshangpingMapper.insertCaigoudingdanshangping(caigoudingdanshangping);
    }

    public Integer itriptxModifyCaigoudingdanshangping(Caigoudingdanshangping caigoudingdanshangping)throws Exception{
        return caigoudingdanshangpingMapper.updateCaigoudingdanshangping(caigoudingdanshangping);
    }

    public Integer itriptxDeleteCaigoudingdanshangpingById(String[] id)throws Exception{
        return caigoudingdanshangpingMapper.deleteCaigoudingdanshangpingById(id);
    }


}
