package com.weichu.jinxiaocun.demo.service.kuwei;
import com.weichu.jinxiaocun.demo.mapper.kuwei.KuweiMapper;
import com.weichu.jinxiaocun.demo.bean.Kuwei;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class KuweiServiceImpl implements KuweiService {

    @Resource
    private KuweiMapper kuweiMapper;

    public Kuwei getKuweiById(Long id)throws Exception{
        return kuweiMapper.getKuweiById(id);
    }

    public List<Kuwei>	getKuweiListByMap(Map<String,Object> param)throws Exception{
        return kuweiMapper.getKuweiListByMap(param);
    }

    public Integer getKuweiCountByMap(Map<String,Object> param)throws Exception{
        return kuweiMapper.getKuweiCountByMap(param);
    }

    public Integer itriptxAddKuwei(Kuwei kuwei)throws Exception{
            kuwei.setCreationDate(new Date());
            return kuweiMapper.insertKuwei(kuwei);
    }

    public Integer itriptxModifyKuwei(Kuwei kuwei)throws Exception{
        kuwei.setModifyDate(new Date());
        return kuweiMapper.updateKuwei(kuwei);
    }

    public Integer itriptxDeleteKuweiById(Long id)throws Exception{
        return kuweiMapper.deleteKuweiById(id);
    }


}
