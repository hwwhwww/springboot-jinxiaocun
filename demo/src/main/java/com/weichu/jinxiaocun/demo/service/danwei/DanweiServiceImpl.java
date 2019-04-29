package com.weichu.jinxiaocun.demo.service.danwei;
import com.weichu.jinxiaocun.demo.mapper.danwei.DanweiMapper;
import com.weichu.jinxiaocun.demo.bean.Danwei;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DanweiServiceImpl implements DanweiService {

    @Resource
    private DanweiMapper danweiMapper;

    public Danwei getDanweiById(Long id)throws Exception{
        return danweiMapper.getDanweiById(id);
    }

    public List<Danwei>	getDanweiListByMap(Map<String,Object> param)throws Exception{
        return danweiMapper.getDanweiListByMap(param);
    }

    public Integer getDanweiCountByMap(Map<String,Object> param)throws Exception{
        return danweiMapper.getDanweiCountByMap(param);
    }

    public Integer itriptxAddDanwei(Danwei danwei)throws Exception{
            return danweiMapper.itriptxAddDanwei(danwei);
    }

    public Integer itriptxModifyDanwei(Danwei danwei)throws Exception{
        return danweiMapper.itriptxModifyDanwei(danwei);
    }

    public Integer itriptxDeleteDanweiById(Long id)throws Exception{
        return danweiMapper.itriptxDeleteDanweiById(id);
    }


}
