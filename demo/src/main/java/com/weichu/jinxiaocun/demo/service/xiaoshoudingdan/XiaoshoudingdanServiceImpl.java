package com.weichu.jinxiaocun.demo.service.xiaoshoudingdan;
import com.weichu.jinxiaocun.demo.mapper.xiaoshoudingdan.XiaoshoudingdanMapper;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoudingdan;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class XiaoshoudingdanServiceImpl implements XiaoshoudingdanService {

    @Resource
    private XiaoshoudingdanMapper xiaoshoudingdanMapper;

    public Xiaoshoudingdan getXiaoshoudingdanById(Long id)throws Exception{
        return xiaoshoudingdanMapper.getXiaoshoudingdanById(id);
    }

    public List<Xiaoshoudingdan>	getXiaoshoudingdanListByMap(Map<String,Object> param)throws Exception{
        return xiaoshoudingdanMapper.getXiaoshoudingdanListByMap(param);
    }

    public Integer getXiaoshoudingdanCountByMap(Map<String,Object> param)throws Exception{
        return xiaoshoudingdanMapper.getXiaoshoudingdanCountByMap(param);
    }

    public Integer itriptxAddXiaoshoudingdan(Xiaoshoudingdan xiaoshoudingdan)throws Exception{
            xiaoshoudingdan.setCreationDate(new Date());
            return xiaoshoudingdanMapper.insertXiaoshoudingdan(xiaoshoudingdan);
    }

    public Integer itriptxModifyXiaoshoudingdan(Xiaoshoudingdan xiaoshoudingdan)throws Exception{
        xiaoshoudingdan.setModifyDate(new Date());
        return xiaoshoudingdanMapper.updateXiaoshoudingdan(xiaoshoudingdan);
    }

    public Integer itriptxDeleteXiaoshoudingdanById(Long id)throws Exception{
        return xiaoshoudingdanMapper.deleteXiaoshoudingdanById(id);
    }


}
