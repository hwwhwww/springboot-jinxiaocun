package com.weichu.jinxiaocun.demo.service.shangpingruku;
import com.weichu.jinxiaocun.demo.mapper.shangpingruku.ShangpingrukuMapper;
import com.weichu.jinxiaocun.demo.bean.Shangpingruku;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ShangpingrukuServiceImpl implements ShangpingrukuService {

    @Resource
    private ShangpingrukuMapper shangpingrukuMapper;

    public Shangpingruku getShangpingrukuById(Long id)throws Exception{
        return shangpingrukuMapper.getShangpingrukuById(id);
    }

    public List<Shangpingruku>	getShangpingrukuListByMap(Map<String,Object> param)throws Exception{
        return shangpingrukuMapper.getShangpingrukuListByMap(param);
    }

    public Integer getShangpingrukuCountByMap(Map<String,Object> param)throws Exception{
        return shangpingrukuMapper.getShangpingrukuCountByMap(param);
    }

    public Integer itriptxAddShangpingruku(Shangpingruku shangpingruku)throws Exception{
            return shangpingrukuMapper.insertShangpingruku(shangpingruku);
    }

    public Integer itriptxModifyShangpingruku(Shangpingruku shangpingruku)throws Exception{
        return shangpingrukuMapper.updateShangpingruku(shangpingruku);
    }

    public Integer itriptxDeleteShangpingrukuById(Long id)throws Exception{
        return shangpingrukuMapper.deleteShangpingrukuById(id);
    }


}
