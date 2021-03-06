package com.weichu.jinxiaocun.demo.service.caigoutuihuoshangpin;
import com.weichu.jinxiaocun.demo.mapper.caigoutuihuoshangpin.CaigoutuihuoshangpinMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoutuihuoshangpin;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaigoutuihuoshangpinServiceImpl implements CaigoutuihuoshangpinService {

    @Resource
    private CaigoutuihuoshangpinMapper caigoutuihuoshangpinMapper;

    public Caigoutuihuoshangpin getCaigoutuihuoshangpinById(Long id)throws Exception{
        return caigoutuihuoshangpinMapper.getCaigoutuihuoshangpinById(id);
    }

    public List<Caigoutuihuoshangpin>	getCaigoutuihuoshangpinListByMap(Map<String,Object> param)throws Exception{
        return caigoutuihuoshangpinMapper.getCaigoutuihuoshangpinListByMap(param);
    }

    public Integer getCaigoutuihuoshangpinCountByMap(Map<String,Object> param)throws Exception{
        return caigoutuihuoshangpinMapper.getCaigoutuihuoshangpinCountByMap(param);
    }

    public Integer itriptxAddCaigoutuihuoshangpin(Caigoutuihuoshangpin caigoutuihuoshangpin)throws Exception{
            return caigoutuihuoshangpinMapper.insertCaigoutuihuoshangpin(caigoutuihuoshangpin);
    }

    public Integer itriptxModifyCaigoutuihuoshangpin(Caigoutuihuoshangpin caigoutuihuoshangpin)throws Exception{
        return caigoutuihuoshangpinMapper.updateCaigoutuihuoshangpin(caigoutuihuoshangpin);
    }

    public Integer itriptxDeleteCaigoutuihuoshangpinById(String[] ids)throws Exception{
        return caigoutuihuoshangpinMapper.deleteCaigoutuihuoshangpinById(ids);
    }


}
