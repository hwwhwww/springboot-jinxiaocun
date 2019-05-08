package com.weichu.jinxiaocun.demo.service.caigoufukuandanshangpin;

import com.weichu.jinxiaocun.demo.bean.Caigoufukuandanshangpin;
import com.weichu.jinxiaocun.demo.mapper.caigoufukuandanshangpin.CaigoufukuandanshangpinMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CaigoufukuandanshangpinServiceImpl implements CaigoufukuandanshangpinService {

    @Resource
    CaigoufukuandanshangpinMapper caigoufukuandanshangpinMapper;

    @Override
    public Integer xiuGai(Caigoufukuandanshangpin caigoufukuandanshangpin) {
        return caigoufukuandanshangpinMapper.xiuGai(caigoufukuandanshangpin);
    }

    @Override
    public Integer tianJia(Caigoufukuandanshangpin caigoufukuandanshangpin) {
        return caigoufukuandanshangpinMapper.tianJia(caigoufukuandanshangpin);
    }
}
