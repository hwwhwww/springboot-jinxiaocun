package com.weichu.jinxiaocun.demo.service.ziyuan;
import com.weichu.jinxiaocun.demo.mapper.ziyuan.ZiyuanMapper;
import com.weichu.jinxiaocun.demo.bean.Ziyuan;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ZiyuanServiceImpl implements ZiyuanService {

    @Resource
    private ZiyuanMapper ziyuanMapper;

    public Ziyuan getZiyuanById(Long id)throws Exception{
        return ziyuanMapper.getZiyuanById(id);
    }

    public List<Ziyuan>	getZiyuanListByMap(Map<String,Object> param)throws Exception{
        return ziyuanMapper.getZiyuanListByMap(param);
    }

    public Integer getZiyuanCountByMap(Map<String,Object> param)throws Exception{
        return ziyuanMapper.getZiyuanCountByMap(param);
    }

    public Integer itriptxAddZiyuan(Ziyuan ziyuan)throws Exception{
            return ziyuanMapper.insertZiyuan(ziyuan);
    }

    public Integer itriptxModifyZiyuan(Ziyuan ziyuan)throws Exception{
        return ziyuanMapper.updateZiyuan(ziyuan);
    }

    public Integer itriptxDeleteZiyuanById(Long id)throws Exception{
        return ziyuanMapper.deleteZiyuanById(id);
    }


}
