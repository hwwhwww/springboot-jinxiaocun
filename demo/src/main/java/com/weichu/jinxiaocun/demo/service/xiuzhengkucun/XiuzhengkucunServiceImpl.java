package com.weichu.jinxiaocun.demo.service.xiuzhengkucun;
import com.weichu.jinxiaocun.demo.mapper.xiuzhengkucun.XiuzhengkucunMapper;
import com.weichu.jinxiaocun.demo.bean.Xiuzhengkucun;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class XiuzhengkucunServiceImpl implements XiuzhengkucunService {

    @Resource
    private XiuzhengkucunMapper xiuzhengkucunMapper;

    public Xiuzhengkucun getXiuzhengkucunById(Long id)throws Exception{
        return xiuzhengkucunMapper.getXiuzhengkucunById(id);
    }

    public List<Xiuzhengkucun>	getXiuzhengkucunListByMap(Map<String,Object> param)throws Exception{
        return xiuzhengkucunMapper.getXiuzhengkucunListByMap(param);
    }

    public Integer getXiuzhengkucunCountByMap(Map<String,Object> param)throws Exception{
        return xiuzhengkucunMapper.getXiuzhengkucunCountByMap(param);
    }

    public Integer itriptxAddXiuzhengkucun(Xiuzhengkucun xiuzhengkucun)throws Exception{
            xiuzhengkucun.setCreationDate(new Date());
            return xiuzhengkucunMapper.insertXiuzhengkucun(xiuzhengkucun);
    }

    public Integer itriptxModifyXiuzhengkucun(Xiuzhengkucun xiuzhengkucun)throws Exception{
        xiuzhengkucun.setModifyDate(new Date());
        return xiuzhengkucunMapper.updateXiuzhengkucun(xiuzhengkucun);
    }

    public Integer itriptxDeleteXiuzhengkucunById(Long id)throws Exception{
        return xiuzhengkucunMapper.deleteXiuzhengkucunById(id);
    }


}
