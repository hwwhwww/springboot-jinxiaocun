package com.weichu.jinxiaocun.demo.service.yonghuJs;
import com.weichu.jinxiaocun.demo.mapper.yonghuJs.YonghuJsMapper;
import com.weichu.jinxiaocun.demo.bean.YonghuJs;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class YonghuJsServiceImpl implements YonghuJsService {

    @Resource
    private YonghuJsMapper yonghuJsMapper;

    public YonghuJs getYonghuJsById(Long id)throws Exception{
        return yonghuJsMapper.getYonghuJsById(id);
    }

    public List<YonghuJs>	getYonghuJsListByMap(Map<String,Object> param)throws Exception{
        return yonghuJsMapper.getYonghuJsListByMap(param);
    }

    public Integer getYonghuJsCountByMap(Map<String,Object> param)throws Exception{
        return yonghuJsMapper.getYonghuJsCountByMap(param);
    }

    public Integer itriptxAddYonghuJs(YonghuJs yonghuJs)throws Exception{
            return yonghuJsMapper.insertYonghuJs(yonghuJs);
    }

    public Integer itriptxModifyYonghuJs(YonghuJs yonghuJs)throws Exception{
        return yonghuJsMapper.updateYonghuJs(yonghuJs);
    }

    public Integer itriptxDeleteYonghuJsById(Long id)throws Exception{
        return yonghuJsMapper.deleteYonghuJsById(id);
    }


}
