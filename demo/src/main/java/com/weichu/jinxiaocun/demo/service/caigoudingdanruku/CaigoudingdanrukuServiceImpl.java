package com.weichu.jinxiaocun.demo.service.caigoudingdanruku;
import com.weichu.jinxiaocun.demo.comment.DateUtil;
import com.weichu.jinxiaocun.demo.mapper.caigoudingdanruku.CaigoudingdanrukuMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanruku;
import com.weichu.jinxiaocun.demo.mapper.caigoudingdanrukushangpin.CaigoudingdanrukushangpinMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaigoudingdanrukuServiceImpl implements CaigoudingdanrukuService {

    @Resource
    private CaigoudingdanrukuMapper caigoudingdanrukuMapper;

    @Resource
    private CaigoudingdanrukushangpinMapper caigoudingdanrukushangpinMapper;

    public List<Caigoudingdanruku> chaXun(Integer id, Integer gysId, String rqYi, String rqEr) {
//        String yi=null;
//        String er=null;
//        if(rqYi!=null){
//            yi= DateUtil.getDefaultTime2DateStr(rqYi)     ;
//        }
//        if(rqEr!=null){
//            er=DateUtil.getDefaultTime2DateStr(rqEr);
//        }
        return caigoudingdanrukuMapper.chaXun( id,  gysId,  rqYi,  rqEr);
    }

    public Caigoudingdanruku getCaigoudingdanrukuById(Long id)throws Exception{
        return caigoudingdanrukuMapper.getCaigoudingdanrukuById(id);
    }

    public List<Caigoudingdanruku>	getCaigoudingdanrukuListByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanrukuMapper.getCaigoudingdanrukuListByMap(param);
    }

    public Integer getCaigoudingdanrukuCountByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanrukuMapper.getCaigoudingdanrukuCountByMap(param);
    }

    public Integer itriptxAddCaigoudingdanruku(Caigoudingdanruku caigoudingdanruku)throws Exception{
            return caigoudingdanrukuMapper.insertCaigoudingdanruku(caigoudingdanruku);
    }

    public Integer itriptxModifyCaigoudingdanruku(Caigoudingdanruku caigoudingdanruku)throws Exception{
        return caigoudingdanrukuMapper.updateCaigoudingdanruku(caigoudingdanruku);
    }

    public Integer itriptxDeleteCaigoudingdanrukuById(String ids)throws Exception{
        String[] split = ids.trim().split(",");
        caigoudingdanrukushangpinMapper.deleteCaigoudingdanrukushangpinById(split);
        return caigoudingdanrukuMapper.deleteCaigoudingdanrukuById(split);
    }


}
