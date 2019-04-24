package com.weichu.jinxiaocun.demo.service.juese;
import com.weichu.jinxiaocun.demo.mapper.juese.JueseMapper;
import com.weichu.jinxiaocun.demo.bean.Juese;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class JueseServiceImpl implements JueseService {

    @Resource
    private JueseMapper jueseMapper;

    public Juese getJueseById(Long id)throws Exception{
        return jueseMapper.getJueseById(id);
    }

    public List<Juese>	getJueseListByMap(Map<String,Object> param)throws Exception{
        return jueseMapper.getJueseListByMap(param);
    }

    public Integer getJueseCountByMap(Map<String,Object> param)throws Exception{
        return jueseMapper.getJueseCountByMap(param);
    }

    public Integer itriptxAddJuese(Juese juese)throws Exception{
            juese.setCreationDate(new Date());
            return jueseMapper.insertJuese(juese);
    }

    public Integer itriptxModifyJuese(Juese juese)throws Exception{
        juese.setModifyDate(new Date());
        return jueseMapper.updateJuese(juese);
    }

    public Integer itriptxDeleteJueseById(Long id)throws Exception{
        return jueseMapper.deleteJueseById(id);
    }


}
