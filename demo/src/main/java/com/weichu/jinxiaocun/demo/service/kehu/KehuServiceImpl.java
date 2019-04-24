package com.weichu.jinxiaocun.demo.service.kehu;
import com.weichu.jinxiaocun.demo.mapper.kehu.KehuMapper;
import com.weichu.jinxiaocun.demo.bean.Kehu;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class KehuServiceImpl implements KehuService {

    @Resource
    private KehuMapper kehuMapper;

    public Kehu getKehuById(Long id)throws Exception{
        return kehuMapper.getKehuById(id);
    }

    public List<Kehu>	getKehuListByMap(Map<String,Object> param)throws Exception{
        return kehuMapper.getKehuListByMap(param);
    }

    public Integer getKehuCountByMap(Map<String,Object> param)throws Exception{
        return kehuMapper.getKehuCountByMap(param);
    }

    public Integer itriptxAddKehu(Kehu kehu)throws Exception{
            return kehuMapper.insertKehu(kehu);
    }

    public Integer itriptxModifyKehu(Kehu kehu)throws Exception{
        return kehuMapper.updateKehu(kehu);
    }

    public Integer itriptxDeleteKehuById(Long id)throws Exception{
        return kehuMapper.deleteKehuById(id);
    }


}
