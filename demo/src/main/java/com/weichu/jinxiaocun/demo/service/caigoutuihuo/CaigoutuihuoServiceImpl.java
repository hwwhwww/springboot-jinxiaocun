package com.weichu.jinxiaocun.demo.service.caigoutuihuo;
import com.weichu.jinxiaocun.demo.bean.Caigoutuihuoshangpin;
import com.weichu.jinxiaocun.demo.mapper.caigoutuihuo.CaigoutuihuoMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoutuihuo;
import com.weichu.jinxiaocun.demo.mapper.caigoutuihuoshangpin.CaigoutuihuoshangpinMapper;
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

    @Resource
    private CaigoutuihuoshangpinMapper caigoutuihuoshangpinMapper;

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

    public Integer itriptxDeleteCaigoutuihuoById(String ids)throws Exception{
        String[] split = ids.trim().split(",");
        caigoutuihuoshangpinMapper.deleteCaigoutuihuoshangpinById(split);
        return caigoutuihuoMapper.deleteCaigoutuihuoById(split);
    }

    @Override
    public List<Caigoutuihuo> chaXun(Map<String, Object> map) {
        return caigoutuihuoMapper.chaXun(map);
    }

    @Override
    public Caigoutuihuo chaXunDan(Integer id) {
        return caigoutuihuoMapper.chaXunDan(id);
    }


}
