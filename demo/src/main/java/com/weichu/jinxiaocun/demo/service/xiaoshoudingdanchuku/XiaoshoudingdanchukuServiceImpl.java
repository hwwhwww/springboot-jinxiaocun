package com.weichu.jinxiaocun.demo.service.xiaoshoudingdanchuku;
import com.weichu.jinxiaocun.demo.mapper.xiaoshoudingdanchuku.XiaoshoudingdanchukuMapper;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoudingdanchuku;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class XiaoshoudingdanchukuServiceImpl implements XiaoshoudingdanchukuService {

    @Resource
    private XiaoshoudingdanchukuMapper xiaoshoudingdanchukuMapper;

    public Xiaoshoudingdanchuku getXiaoshoudingdanchukuById(Long id)throws Exception{
        return xiaoshoudingdanchukuMapper.getXiaoshoudingdanchukuById(id);
    }

    public List<Xiaoshoudingdanchuku>	getXiaoshoudingdanchukuListByMap(Map<String,Object> param)throws Exception{
        return xiaoshoudingdanchukuMapper.getXiaoshoudingdanchukuListByMap(param);
    }

    public Integer getXiaoshoudingdanchukuCountByMap(Map<String,Object> param)throws Exception{
        return xiaoshoudingdanchukuMapper.getXiaoshoudingdanchukuCountByMap(param);
    }

    public Integer itriptxAddXiaoshoudingdanchuku(Xiaoshoudingdanchuku xiaoshoudingdanchuku)throws Exception{
            xiaoshoudingdanchuku.setCreationDate(new Date());
            return xiaoshoudingdanchukuMapper.insertXiaoshoudingdanchuku(xiaoshoudingdanchuku);
    }

    public Integer itriptxModifyXiaoshoudingdanchuku(Xiaoshoudingdanchuku xiaoshoudingdanchuku)throws Exception{
        xiaoshoudingdanchuku.setModifyDate(new Date());
        return xiaoshoudingdanchukuMapper.updateXiaoshoudingdanchuku(xiaoshoudingdanchuku);
    }

    public Integer itriptxDeleteXiaoshoudingdanchukuById(Long id)throws Exception{
        return xiaoshoudingdanchukuMapper.deleteXiaoshoudingdanchukuById(id);
    }


}
