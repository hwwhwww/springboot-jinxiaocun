package com.weichu.jinxiaocun.demo.service.shangping;
import com.weichu.jinxiaocun.demo.bean.Shangping;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface ShangpingService {

    public Shangping getShangpingById(Long id)throws Exception;

    public List<Shangping>	getShangpingListByMap(Map<String,Object> param)throws Exception;

    public Integer getShangpingCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddShangping(Shangping shangping)throws Exception;

    public Integer itriptxModifyShangping(Shangping shangping)throws Exception;

    public Integer itriptxDeleteShangpingById(Long id)throws Exception;

}
