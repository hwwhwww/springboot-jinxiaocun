package com.weichu.jinxiaocun.demo.service.shangping;
import com.weichu.jinxiaocun.demo.mapper.shangping.ShangpingMapper;
import com.weichu.jinxiaocun.demo.bean.Shangping;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ShangpingServiceImpl implements ShangpingService {

    @Resource
    private ShangpingMapper shangpingMapper;

    public Shangping getShangpingById(Long id)throws Exception{
        return shangpingMapper.getShangpingById(id);
    }

    public List<Shangping>	getShangpingListByMap(Map<String,Object> param)throws Exception{
        return shangpingMapper.getShangpingListByMap(param);
    }

    public Integer getShangpingCountByMap(Map<String,Object> param)throws Exception{
        return shangpingMapper.getShangpingCountByMap(param);
    }

    public Integer itriptxAddShangping(Shangping shangping)throws Exception{
            return shangpingMapper.itriptxAddShangping(shangping);
    }

    public Integer itriptxModifyShangping(Shangping shangping)throws Exception{
        return shangpingMapper.updateShangping(shangping);
    }

    public Integer itriptxDeleteShangpingById(Long id)throws Exception{
        return shangpingMapper.itriptxDeleteShangpingById(id);
    }


}
