package com.weichu.jinxiaocun.demo.service.kucun;
import com.weichu.jinxiaocun.demo.mapper.kucun.KucunMapper;
import com.weichu.jinxiaocun.demo.bean.Kucun;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class KucunServiceImpl implements KucunService {

    @Resource
    private KucunMapper kucunMapper;

    public Kucun getKucunById(Long id)throws Exception{
        return kucunMapper.getKucunById(id);
    }

    public List<Kucun>	getKucunListByMap(Map<String,Object> param)throws Exception{
        return kucunMapper.getKucunListByMap(param);
    }

    public Integer getKucunCountByMap(Map<String,Object> param)throws Exception{
        return kucunMapper.getKucunCountByMap(param);
    }

    public Integer itriptxAddKucun(Kucun kucun)throws Exception{
            return kucunMapper.insertKucun(kucun);
    }

    public Integer itriptxModifyKucun(Kucun kucun)throws Exception{
        return kucunMapper.updateKucun(kucun);
    }

    public Integer itriptxDeleteKucunById(Long id)throws Exception{
        return kucunMapper.deleteKucunById(id);
    }


}
