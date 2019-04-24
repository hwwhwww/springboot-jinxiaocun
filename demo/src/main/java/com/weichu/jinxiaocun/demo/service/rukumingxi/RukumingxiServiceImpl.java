package com.weichu.jinxiaocun.demo.service.rukumingxi;
import com.weichu.jinxiaocun.demo.mapper.rukumingxi.RukumingxiMapper;
import com.weichu.jinxiaocun.demo.bean.Rukumingxi;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class RukumingxiServiceImpl implements RukumingxiService {

    @Resource
    private RukumingxiMapper rukumingxiMapper;

    public Rukumingxi getRukumingxiById(Long id)throws Exception{
        return rukumingxiMapper.getRukumingxiById(id);
    }

    public List<Rukumingxi>	getRukumingxiListByMap(Map<String,Object> param)throws Exception{
        return rukumingxiMapper.getRukumingxiListByMap(param);
    }

    public Integer getRukumingxiCountByMap(Map<String,Object> param)throws Exception{
        return rukumingxiMapper.getRukumingxiCountByMap(param);
    }

    public Integer itriptxAddRukumingxi(Rukumingxi rukumingxi)throws Exception{
            return rukumingxiMapper.insertRukumingxi(rukumingxi);
    }

    public Integer itriptxModifyRukumingxi(Rukumingxi rukumingxi)throws Exception{
        return rukumingxiMapper.updateRukumingxi(rukumingxi);
    }

    public Integer itriptxDeleteRukumingxiById(Long id)throws Exception{
        return rukumingxiMapper.deleteRukumingxiById(id);
    }


}
