package com.weichu.jinxiaocun.demo.service.chukumingxi;
import com.weichu.jinxiaocun.demo.mapper.chukumingxi.ChukumingxiMapper;
import com.weichu.jinxiaocun.demo.bean.Chukumingxi;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ChukumingxiServiceImpl implements ChukumingxiService {

    @Resource
    private ChukumingxiMapper chukumingxiMapper;

    public Chukumingxi getChukumingxiById(Long id)throws Exception{
        return chukumingxiMapper.getChukumingxiById(id);
    }

    public List<Chukumingxi>	getChukumingxiListByMap(Map<String,Object> param)throws Exception{
        return chukumingxiMapper.getChukumingxiListByMap(param);
    }

    public Integer getChukumingxiCountByMap(Map<String,Object> param)throws Exception{
        return chukumingxiMapper.getChukumingxiCountByMap(param);
    }

    public Integer itriptxAddChukumingxi(Chukumingxi chukumingxi)throws Exception{
            return chukumingxiMapper.insertChukumingxi(chukumingxi);
    }

    public Integer itriptxModifyChukumingxi(Chukumingxi chukumingxi)throws Exception{
        return chukumingxiMapper.updateChukumingxi(chukumingxi);
    }

    public Integer itriptxDeleteChukumingxiById(Long id)throws Exception{
        return chukumingxiMapper.deleteChukumingxiById(id);
    }


}
