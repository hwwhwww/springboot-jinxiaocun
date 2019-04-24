package com.weichu.jinxiaocun.demo.service.yuangong;
import com.weichu.jinxiaocun.demo.bean.Yuangong;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface YuangongService {

    public Yuangong getYuangongById(Long id)throws Exception;

    public List<Yuangong>	getYuangongListByMap(Map<String,Object> param)throws Exception;

    public Integer getYuangongCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddYuangong(Yuangong yuangong)throws Exception;

    public Integer itriptxModifyYuangong(Yuangong yuangong)throws Exception;

    public Integer itriptxDeleteYuangongById(Long id)throws Exception;

}
