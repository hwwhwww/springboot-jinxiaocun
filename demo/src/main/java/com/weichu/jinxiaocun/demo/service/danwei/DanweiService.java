package com.weichu.jinxiaocun.demo.service.danwei;
import com.weichu.jinxiaocun.demo.bean.Danwei;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface DanweiService {

    public Danwei getDanweiById(Long id)throws Exception;

    public List<Danwei>	getDanweiListByMap(Map<String,Object> param)throws Exception;

    public Integer getDanweiCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddDanwei(Danwei danwei)throws Exception;

    public Integer itriptxModifyDanwei(Danwei danwei)throws Exception;

    public Integer itriptxDeleteDanweiById(Long id)throws Exception;

}
