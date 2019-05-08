package com.weichu.jinxiaocun.demo.service.caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanshangping;
import com.weichu.jinxiaocun.demo.comment.DateUtil;
import com.weichu.jinxiaocun.demo.mapper.caigoudingdan.CaigoudingdanMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdan;
import com.weichu.jinxiaocun.demo.mapper.caigoudingdanshangping.CaigoudingdanshangpingMapper;
import com.weichu.jinxiaocun.demo.service.caigoudingdanshangping.CaigoudingdanshangpingService;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.unit.DataUnit;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaigoudingdanServiceImpl implements CaigoudingdanService {

    @Resource
    private CaigoudingdanMapper caigoudingdanMapper;

    @Resource
    private CaigoudingdanshangpingMapper caigoudingdanshangpingMapper;

    @Override
    public Integer zuiDaZhi() {
        return caigoudingdanMapper.zuiDaZhi();
    }

    @Override
    public List<Caigoudingdan> chaXunMeiYou(Integer id) {
        return caigoudingdanMapper.chaXunMeiYou(id);
    }

    public Caigoudingdan getCaigoudingdanById(Long id)throws Exception{
        return caigoudingdanMapper.getCaigoudingdanById(id);
    }

    public List<Caigoudingdan>	getCaigoudingdanListByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanMapper.getCaigoudingdanListByMap(param);
    }

    public Integer getCaigoudingdanCountByMap(Map<String,Object> param)throws Exception{
        return caigoudingdanMapper.getCaigoudingdanCountByMap(param);
    }




    public Integer itriptxAddCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception{
            return caigoudingdanMapper.insertCaigoudingdan(caigoudingdan);
    }

    public Integer itriptxModifyCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception{
        return caigoudingdanMapper.updateCaigoudingdan(caigoudingdan);
    }

    public Integer itriptxDeleteCaigoudingdanById(String id)throws Exception{
        String[] split = id.trim().split(",");
        caigoudingdanshangpingMapper.deleteCaigoudingdanshangpingById(split);
        return caigoudingdanMapper.deleteCaigoudingdanById(split);
    }

    @Override
    public List<Caigoudingdan> chaXun(Integer id, Integer gysId, String rqYi, String rqEr) {
//        String yi=null;
//        String er=null;
//        if(rqYi!=null){
//            yi= DateUtil.getDefaultTime2DateStr(rqYi)     ;
//        }
//        if(rqEr!=null){
//            er=DateUtil.getDefaultTime2DateStr(rqEr);
//        }
        return caigoudingdanMapper.chaXun(id,gysId,rqYi,rqEr);
    }


}
