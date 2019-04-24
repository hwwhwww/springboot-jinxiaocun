package com.weichu.jinxiaocun.demo.service.ziyuanJs;
import com.weichu.jinxiaocun.demo.mapper.ziyuanJs.ZiyuanJsMapper;
import com.weichu.jinxiaocun.demo.bean.ZiyuanJs;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class ZiyuanJsServiceImpl implements ZiyuanJsService {

    @Resource
    private ZiyuanJsMapper ziyuanJsMapper;

    public ZiyuanJs getZiyuanJsById(Long id)throws Exception{
        return ziyuanJsMapper.getZiyuanJsById(id);
    }

    public List<ZiyuanJs>	getZiyuanJsListByMap(Map<String,Object> param)throws Exception{
        return ziyuanJsMapper.getZiyuanJsListByMap(param);
    }

    public Integer getZiyuanJsCountByMap(Map<String,Object> param)throws Exception{
        return ziyuanJsMapper.getZiyuanJsCountByMap(param);
    }

    public Integer itriptxAddZiyuanJs(ZiyuanJs ziyuanJs)throws Exception{
            ziyuanJs.setCreationDate(new Date());
            return ziyuanJsMapper.insertZiyuanJs(ziyuanJs);
    }

    public Integer itriptxModifyZiyuanJs(ZiyuanJs ziyuanJs)throws Exception{
        ziyuanJs.setModifyDate(new Date());
        return ziyuanJsMapper.updateZiyuanJs(ziyuanJs);
    }

    public Integer itriptxDeleteZiyuanJsById(Long id)throws Exception{
        return ziyuanJsMapper.deleteZiyuanJsById(id);
    }


}
