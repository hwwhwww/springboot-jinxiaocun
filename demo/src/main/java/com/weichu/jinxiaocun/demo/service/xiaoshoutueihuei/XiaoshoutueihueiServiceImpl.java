package com.weichu.jinxiaocun.demo.service.xiaoshoutueihuei;
import com.weichu.jinxiaocun.demo.mapper.xiaoshoutueihuei.XiaoshoutueihueiMapper;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoutueihuei;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class XiaoshoutueihueiServiceImpl implements XiaoshoutueihueiService {

    @Resource
    private XiaoshoutueihueiMapper xiaoshoutueihueiMapper;

    public Xiaoshoutueihuei getXiaoshoutueihueiById(Long id)throws Exception{
        return xiaoshoutueihueiMapper.getXiaoshoutueihueiById(id);
    }

    public List<Xiaoshoutueihuei>	getXiaoshoutueihueiListByMap(Map<String,Object> param)throws Exception{
        return xiaoshoutueihueiMapper.getXiaoshoutueihueiListByMap(param);
    }

    public Integer getXiaoshoutueihueiCountByMap(Map<String,Object> param)throws Exception{
        return xiaoshoutueihueiMapper.getXiaoshoutueihueiCountByMap(param);
    }

    public Integer itriptxAddXiaoshoutueihuei(Xiaoshoutueihuei xiaoshoutueihuei)throws Exception{
            xiaoshoutueihuei.setCreationDate(new Date());
            return xiaoshoutueihueiMapper.insertXiaoshoutueihuei(xiaoshoutueihuei);
    }

    public Integer itriptxModifyXiaoshoutueihuei(Xiaoshoutueihuei xiaoshoutueihuei)throws Exception{
        xiaoshoutueihuei.setModifyDate(new Date());
        return xiaoshoutueihueiMapper.updateXiaoshoutueihuei(xiaoshoutueihuei);
    }

    public Integer itriptxDeleteXiaoshoutueihueiById(Long id)throws Exception{
        return xiaoshoutueihueiMapper.deleteXiaoshoutueihueiById(id);
    }


}
