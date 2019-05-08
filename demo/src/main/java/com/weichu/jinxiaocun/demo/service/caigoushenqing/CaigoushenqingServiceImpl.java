package com.weichu.jinxiaocun.demo.service.caigoushenqing;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqingshangping;
import com.weichu.jinxiaocun.demo.comment.DateUtil;
import com.weichu.jinxiaocun.demo.mapper.caigoushenqing.CaigoushenqingMapper;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqing;
import com.weichu.jinxiaocun.demo.mapper.caigoushenqingshangping.CaigoushenqingshangpingMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CaigoushenqingServiceImpl implements CaigoushenqingService {

    @Resource
    private CaigoushenqingMapper caigoushenqingMapper;

    @Resource
    private CaigoushenqingshangpingMapper caigoushenqingshangpingMapper;

    @Override
    public List<Caigoushenqing> weiYinYong(Integer id) {
        return caigoushenqingMapper.weiYinYong(id);
    }

    public Caigoushenqing getCaigoushenqingById(Long id)throws Exception{
        return caigoushenqingMapper.getCaigoushenqingById(id);
    }
    public List<Caigoushenqing> chaXun(Integer id, String rqYi, String rqEr) {
//        String yi=null;
//        String er=null;
//        if(rqYi!=null){
//            yi= DateUtil.getDefaultTime2DateStr(rqYi)     ;
//        }
//        if(rqEr!=null){
//            er=DateUtil.getDefaultTime2DateStr(rqEr);
//        }
        return caigoushenqingMapper.chaXun(id, rqYi ,
                rqEr);
    }
    public List<Caigoushenqing>	getCaigoushenqingListByMap(Map<String,Object> param)throws Exception{
        return caigoushenqingMapper.getCaigoushenqingListByMap(param);
    }

    public Integer getCaigoushenqingCountByMap(Map<String,Object> param)throws Exception{
        return caigoushenqingMapper.getCaigoushenqingCountByMap(param);
    }

    public Integer itriptxAddCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception{
//        caigoushenqing.setCgsqQx(new Date());
//        caigoushenqing.setCgsqRq(new Date());
//        caigoushenqing.setCgsqXh("123123");
//        Caigoushenqingshangping caigoushenqingshangping=new Caigoushenqingshangping();
//        caigoushenqingshangping.setCgsqId(3);
//        List<Caigoushenqingshangping> list=new ArrayList<>();
//        list.add(caigoushenqingshangping);
//        caigoushenqingshangpingMapper.tianJia(list);
        return caigoushenqingMapper.insertCaigoushenqing(caigoushenqing);
    }

    public Integer itriptxModifyCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception{
        caigoushenqing.setCgsqId(1);
        caigoushenqing.setCgsqBz("6.18电商节物质111");
        Caigoushenqingshangping caigoushenqingshangping=new Caigoushenqingshangping();
        caigoushenqingshangping.setCgsqId(1);
        caigoushenqingshangping.setCgsqspKp(33);
        caigoushenqingshangping.setCgsqspId(1);
        Caigoushenqingshangping caigoushenqingshangping1=new Caigoushenqingshangping();
        caigoushenqingshangping1.setCgsqId(2);
        caigoushenqingshangping1.setCgsqspKp(22);
        caigoushenqingshangping1.setCgsqspId(2);
        List<Caigoushenqingshangping> list=new ArrayList<>();
        list.add(caigoushenqingshangping);
        list.add(caigoushenqingshangping1);
        caigoushenqingshangpingMapper.xiuGai(list);
        return caigoushenqingMapper.updateCaigoushenqing(caigoushenqing);
    }

    public Integer itriptxDeleteCaigoushenqingById(String id)throws Exception{
        String[] split = id.trim().split(",");
        caigoushenqingshangpingMapper.deleteCaigoushenqingshangpingById(split);
        return caigoushenqingMapper.deleteCaigoushenqingById(split);
    }

    @Override
    public List<Caigoushenqing> getCaiGouShengQingList(String cgsqId) {
        return caigoushenqingMapper.getCaiGouShengQingList(cgsqId);
    }


}
