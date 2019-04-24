package com.weichu.jinxiaocun.demo.service.gongyingshang;
import com.weichu.jinxiaocun.demo.mapper.gongyingshang.GongyingshangMapper;
import com.weichu.jinxiaocun.demo.bean.Gongyingshang;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class GongyingshangServiceImpl implements GongyingshangService {

    @Resource
    private GongyingshangMapper gongyingshangMapper;

    public Gongyingshang getGongyingshangById(Long id)throws Exception{
        return gongyingshangMapper.getGongyingshangById(id);
    }

    public List<Gongyingshang>	getGongyingshangListByMap(Map<String,Object> param)throws Exception{
        return gongyingshangMapper.getGongyingshangListByMap(param);
    }

    public Integer getGongyingshangCountByMap(Map<String,Object> param)throws Exception{
        return gongyingshangMapper.getGongyingshangCountByMap(param);
    }

    public Integer itriptxAddGongyingshang(Gongyingshang gongyingshang)throws Exception{
            gongyingshang.setCreationDate(new Date());
            return gongyingshangMapper.insertGongyingshang(gongyingshang);
    }

    public Integer itriptxModifyGongyingshang(Gongyingshang gongyingshang)throws Exception{
        gongyingshang.setModifyDate(new Date());
        return gongyingshangMapper.updateGongyingshang(gongyingshang);
    }

    public Integer itriptxDeleteGongyingshangById(Long id)throws Exception{
        return gongyingshangMapper.deleteGongyingshangById(id);
    }


}
