package com.weichu.jinxiaocun.demo.service.diaobamingxi;
import com.weichu.jinxiaocun.demo.mapper.diaobamingxi.DiaobamingxiMapper;
import com.weichu.jinxiaocun.demo.bean.Diaobamingxi;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DiaobamingxiServiceImpl implements DiaobamingxiService {

    @Resource
    private DiaobamingxiMapper diaobamingxiMapper;

    public Diaobamingxi getDiaobamingxiById(Long id)throws Exception{
        return diaobamingxiMapper.getDiaobamingxiById(id);
    }

    public List<Diaobamingxi>	getDiaobamingxiListByMap(Map<String,Object> param)throws Exception{
        return diaobamingxiMapper.getDiaobamingxiListByMap(param);
    }

    public Integer getDiaobamingxiCountByMap(Map<String,Object> param)throws Exception{
        return diaobamingxiMapper.getDiaobamingxiCountByMap(param);
    }

    public Integer itriptxAddDiaobamingxi(Diaobamingxi diaobamingxi)throws Exception{
            return diaobamingxiMapper.insertDiaobamingxi(diaobamingxi);
    }

    public Integer itriptxModifyDiaobamingxi(Diaobamingxi diaobamingxi)throws Exception{
        return diaobamingxiMapper.updateDiaobamingxi(diaobamingxi);
    }

    public Integer itriptxDeleteDiaobamingxiById(Long id)throws Exception{
        return diaobamingxiMapper.deleteDiaobamingxiById(id);
    }


}
