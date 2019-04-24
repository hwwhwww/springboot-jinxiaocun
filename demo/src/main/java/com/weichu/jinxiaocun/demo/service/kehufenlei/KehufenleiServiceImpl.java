package com.weichu.jinxiaocun.demo.service.kehufenlei;
import com.weichu.jinxiaocun.demo.mapper.kehufenlei.KehufenleiMapper;
import com.weichu.jinxiaocun.demo.bean.Kehufenlei;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class KehufenleiServiceImpl implements KehufenleiService {

    @Resource
    private KehufenleiMapper kehufenleiMapper;

    public Kehufenlei getKehufenleiById(Long id)throws Exception{
        return kehufenleiMapper.getKehufenleiById(id);
    }

    public List<Kehufenlei>	getKehufenleiListByMap(Map<String,Object> param)throws Exception{
        return kehufenleiMapper.getKehufenleiListByMap(param);
    }

    public Integer getKehufenleiCountByMap(Map<String,Object> param)throws Exception{
        return kehufenleiMapper.getKehufenleiCountByMap(param);
    }

    public Integer itriptxAddKehufenlei(Kehufenlei kehufenlei)throws Exception{
            kehufenlei.setCreationDate(new Date());
            return kehufenleiMapper.insertKehufenlei(kehufenlei);
    }

    public Integer itriptxModifyKehufenlei(Kehufenlei kehufenlei)throws Exception{
        kehufenlei.setModifyDate(new Date());
        return kehufenleiMapper.updateKehufenlei(kehufenlei);
    }

    public Integer itriptxDeleteKehufenleiById(Long id)throws Exception{
        return kehufenleiMapper.deleteKehufenleiById(id);
    }


}
