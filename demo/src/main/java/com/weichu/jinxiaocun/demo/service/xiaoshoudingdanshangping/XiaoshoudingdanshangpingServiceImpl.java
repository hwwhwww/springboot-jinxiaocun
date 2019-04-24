package com.weichu.jinxiaocun.demo.service.xiaoshoudingdanshangping;
import com.weichu.jinxiaocun.demo.mapper.xiaoshoudingdanshangping.XiaoshoudingdanshangpingMapper;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoudingdanshangping;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class XiaoshoudingdanshangpingServiceImpl implements XiaoshoudingdanshangpingService {

    @Resource
    private XiaoshoudingdanshangpingMapper xiaoshoudingdanshangpingMapper;

    public Xiaoshoudingdanshangping getXiaoshoudingdanshangpingById(Long id)throws Exception{
        return xiaoshoudingdanshangpingMapper.getXiaoshoudingdanshangpingById(id);
    }

    public List<Xiaoshoudingdanshangping>	getXiaoshoudingdanshangpingListByMap(Map<String,Object> param)throws Exception{
        return xiaoshoudingdanshangpingMapper.getXiaoshoudingdanshangpingListByMap(param);
    }

    public Integer getXiaoshoudingdanshangpingCountByMap(Map<String,Object> param)throws Exception{
        return xiaoshoudingdanshangpingMapper.getXiaoshoudingdanshangpingCountByMap(param);
    }

    public Integer itriptxAddXiaoshoudingdanshangping(Xiaoshoudingdanshangping xiaoshoudingdanshangping)throws Exception{
            return xiaoshoudingdanshangpingMapper.insertXiaoshoudingdanshangping(xiaoshoudingdanshangping);
    }

    public Integer itriptxModifyXiaoshoudingdanshangping(Xiaoshoudingdanshangping xiaoshoudingdanshangping)throws Exception{
        return xiaoshoudingdanshangpingMapper.updateXiaoshoudingdanshangping(xiaoshoudingdanshangping);
    }

    public Integer itriptxDeleteXiaoshoudingdanshangpingById(Long id)throws Exception{
        return xiaoshoudingdanshangpingMapper.deleteXiaoshoudingdanshangpingById(id);
    }


}
