package com.weichu.jinxiaocun.demo.service.caigoufukuandan;

import com.weichu.jinxiaocun.demo.bean.Caigoufukuandan;
import com.weichu.jinxiaocun.demo.comment.DateUtil;
import com.weichu.jinxiaocun.demo.mapper.caigoufukuandan.CaigoufukuandanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CaigoufukuandanServiceImpl implements  CaigoufukuandanService {
    @Resource
    CaigoufukuandanMapper caigoufukuandanMapper;

    @Override
    public List<Caigoufukuandan> chaXun(Date rqYi, Date rqEr) {
        String yi=null;
        String er=null;
        if(rqYi!=null){
            yi= DateUtil.getDefaultTime2DateStr(rqYi)     ;
        }
        if(rqEr!=null){
            er=DateUtil.getDefaultTime2DateStr(rqEr);
        }
        return caigoufukuandanMapper.chaXun(
                yi,er
        );
    }

    @Override
    public Integer xiuGai(Caigoufukuandan caigoufukuandan) {
        return null;
    }

    @Override
    public Integer tianJia(Caigoufukuandan caigoufukuandan) {
        return null;
    }

    @Override
    public Integer shanChu(Integer id) {
        return caigoufukuandanMapper.shanChu(id);
    }

    @Override
    public Caigoufukuandan chaXunDan(Integer id) {
        return caigoufukuandanMapper.chaXunDan(id);
    }
}
