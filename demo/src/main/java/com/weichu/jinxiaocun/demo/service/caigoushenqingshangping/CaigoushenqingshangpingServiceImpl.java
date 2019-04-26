package com.weichu.jinxiaocun.demo.service.caigoushenqingshangping;
import com.weichu.jinxiaocun.demo.mapper.caigoushenqingshangping.CaigoushenqingshangpingMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqingshangping;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaigoushenqingshangpingServiceImpl implements CaigoushenqingshangpingService {

    @Resource
    private CaigoushenqingshangpingMapper caigoushenqingshangpingMapper;

    public Caigoushenqingshangping getCaigoushenqingshangpingById(Long id)throws Exception{
        return caigoushenqingshangpingMapper.getCaigoushenqingshangpingById(id);
    }

    public List<Caigoushenqingshangping>	getCaigoushenqingshangpingListByMap(Map<String,Object> param)throws Exception{
        return caigoushenqingshangpingMapper.getCaigoushenqingshangpingListByMap(param);
    }

    public Integer getCaigoushenqingshangpingCountByMap(Map<String,Object> param)throws Exception{
        return caigoushenqingshangpingMapper.getCaigoushenqingshangpingCountByMap(param);
    }

    public Integer itriptxAddCaigoushenqingshangping(Caigoushenqingshangping caigoushenqingshangping)throws Exception{
            return caigoushenqingshangpingMapper.insertCaigoushenqingshangping(caigoushenqingshangping);
    }

    public Integer itriptxModifyCaigoushenqingshangping(Caigoushenqingshangping caigoushenqingshangping)throws Exception{
        return caigoushenqingshangpingMapper.updateCaigoushenqingshangping(caigoushenqingshangping);
    }

    public Integer itriptxDeleteCaigoushenqingshangpingById(Long id)throws Exception{
        return caigoushenqingshangpingMapper.deleteCaigoushenqingshangpingById(id);
    }

    @Override
    public List<Caigoushenqingshangping> getCaigoushanpinxsList(String cgsqId) {
        return caigoushenqingshangpingMapper.getCaigoushanpinxsList(cgsqId);
    }


}
