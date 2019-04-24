package com.weichu.jinxiaocun.demo.service.yuangong;
import com.weichu.jinxiaocun.demo.mapper.yuangong.YuangongMapper;
import com.weichu.jinxiaocun.demo.bean.Yuangong;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class YuangongServiceImpl implements YuangongService {

    @Resource
    private YuangongMapper yuangongMapper;

    public Yuangong getYuangongById(Long id)throws Exception{
        return yuangongMapper.getYuangongById(id);
    }

    public List<Yuangong>	getYuangongListByMap(Map<String,Object> param)throws Exception{
        return yuangongMapper.getYuangongListByMap(param);
    }

    public Integer getYuangongCountByMap(Map<String,Object> param)throws Exception{
        return yuangongMapper.getYuangongCountByMap(param);
    }

    public Integer itriptxAddYuangong(Yuangong yuangong)throws Exception{
            yuangong.setCreationDate(new Date());
            return yuangongMapper.insertYuangong(yuangong);
    }

    public Integer itriptxModifyYuangong(Yuangong yuangong)throws Exception{
        yuangong.setModifyDate(new Date());
        return yuangongMapper.updateYuangong(yuangong);
    }

    public Integer itriptxDeleteYuangongById(Long id)throws Exception{
        return yuangongMapper.deleteYuangongById(id);
    }


}
