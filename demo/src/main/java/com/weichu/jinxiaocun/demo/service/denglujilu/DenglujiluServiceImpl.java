package com.weichu.jinxiaocun.demo.service.denglujilu;
import com.weichu.jinxiaocun.demo.mapper.denglujilu.DenglujiluMapper;
import com.weichu.jinxiaocun.demo.bean.Denglujilu;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DenglujiluServiceImpl implements DenglujiluService {

    @Resource
    private DenglujiluMapper denglujiluMapper;

    public Denglujilu getDenglujiluById(Long id)throws Exception{
        return denglujiluMapper.getDenglujiluById(id);
    }

    public List<Denglujilu>	getDenglujiluListByMap(Map<String,Object> param)throws Exception{
        return denglujiluMapper.getDenglujiluListByMap(param);
    }

    public Integer getDenglujiluCountByMap(Map<String,Object> param)throws Exception{
        return denglujiluMapper.getDenglujiluCountByMap(param);
    }

    public Integer itriptxAddDenglujilu(Denglujilu denglujilu)throws Exception{
            return denglujiluMapper.insertDenglujilu(denglujilu);
    }

    public Integer itriptxModifyDenglujilu(Denglujilu denglujilu)throws Exception{
        return denglujiluMapper.updateDenglujilu(denglujilu);
    }

    public Integer itriptxDeleteDenglujiluById(Long id)throws Exception{
        return denglujiluMapper.deleteDenglujiluById(id);
    }


}
