package com.weichu.jinxiaocun.demo.service.shangpingchuku;
import com.weichu.jinxiaocun.demo.mapper.shangpingchuku.ShangpingchukuMapper;
import com.weichu.jinxiaocun.demo.bean.Shangpingchuku;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class ShangpingchukuServiceImpl implements ShangpingchukuService {

    @Resource
    private ShangpingchukuMapper shangpingchukuMapper;

    public Shangpingchuku getShangpingchukuById(Long id)throws Exception{
        return shangpingchukuMapper.getShangpingchukuById(id);
    }

    public List<Shangpingchuku>	getShangpingchukuListByMap(Map<String,Object> param)throws Exception{
        return shangpingchukuMapper.getShangpingchukuListByMap(param);
    }

    public Integer getShangpingchukuCountByMap(Map<String,Object> param)throws Exception{
        return shangpingchukuMapper.getShangpingchukuCountByMap(param);
    }

    public Integer itriptxAddShangpingchuku(Shangpingchuku shangpingchuku)throws Exception{
            shangpingchuku.setCreationDate(new Date());
            return shangpingchukuMapper.insertShangpingchuku(shangpingchuku);
    }

    public Integer itriptxModifyShangpingchuku(Shangpingchuku shangpingchuku)throws Exception{
        shangpingchuku.setModifyDate(new Date());
        return shangpingchukuMapper.updateShangpingchuku(shangpingchuku);
    }

    public Integer itriptxDeleteShangpingchukuById(Long id)throws Exception{
        return shangpingchukuMapper.deleteShangpingchukuById(id);
    }


}
