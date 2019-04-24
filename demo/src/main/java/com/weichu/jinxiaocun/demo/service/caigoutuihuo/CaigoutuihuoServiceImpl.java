package com.weichu.jinxiaocun.demo.service.caigoutuihuo;
import com.weichu.jinxiaocun.demo.mapper.caigoutuihuo.CaigoutuihuoMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoutuihuo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaigoutuihuoServiceImpl implements CaigoutuihuoService {

    @Resource
    private CaigoutuihuoMapper caigoutuihuoMapper;

    public Caigoutuihuo getCaigoutuihuoById(Long id)throws Exception{
        return caigoutuihuoMapper.getCaigoutuihuoById(id);
    }

    public List<Caigoutuihuo>	getCaigoutuihuoListByMap(Map<String,Object> param)throws Exception{
        return caigoutuihuoMapper.getCaigoutuihuoListByMap(param);
    }

    public Integer getCaigoutuihuoCountByMap(Map<String,Object> param)throws Exception{
        return caigoutuihuoMapper.getCaigoutuihuoCountByMap(param);
    }

    public Integer itriptxAddCaigoutuihuo(Caigoutuihuo caigoutuihuo)throws Exception{
            return caigoutuihuoMapper.insertCaigoutuihuo(caigoutuihuo);
    }

    public Integer itriptxModifyCaigoutuihuo(Caigoutuihuo caigoutuihuo)throws Exception{
        return caigoutuihuoMapper.updateCaigoutuihuo(caigoutuihuo);
    }

    public Integer itriptxDeleteCaigoutuihuoById(Long id)throws Exception{
        return caigoutuihuoMapper.deleteCaigoutuihuoById(id);
    }


}
