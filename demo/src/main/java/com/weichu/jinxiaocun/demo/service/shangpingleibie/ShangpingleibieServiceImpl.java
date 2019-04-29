package com.weichu.jinxiaocun.demo.service.shangpingleibie;
import com.weichu.jinxiaocun.demo.mapper.shangpingleibie.ShangpingleibieMapper;
import com.weichu.jinxiaocun.demo.bean.Shangpingleibie;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ShangpingleibieServiceImpl implements ShangpingleibieService {

    @Resource
    private ShangpingleibieMapper shangpingleibieMapper;

    public Shangpingleibie getShangpingleibieById(Long id)throws Exception{
        return shangpingleibieMapper.getShangpingleibieById(id);
    }

    public List<Shangpingleibie>	getShangpingleibieListByMap(Map<String,Object> param)throws Exception{
        return shangpingleibieMapper.getShangpingleibieListByMap(param);
    }

    public Integer getShangpingleibieCountByMap(Map<String,Object> param)throws Exception{
        return shangpingleibieMapper.getShangpingleibieCountByMap(param);
    }

    public Integer itriptxAddShangpingleibie(Shangpingleibie shangpingleibie)throws Exception{
            return shangpingleibieMapper.insertShangpingleibie(shangpingleibie);
    }

    public Integer itriptxModifyShangpingleibie(Shangpingleibie shangpingleibie)throws Exception{
        return shangpingleibieMapper.updateShangpingleibie(shangpingleibie);
    }

    public Integer itriptxDeleteShangpingleibieById(Long id)throws Exception{
        return shangpingleibieMapper.itriptxDeleteShangpingleibieById(id);
    }


}
