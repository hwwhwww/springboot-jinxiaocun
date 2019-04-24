package com.weichu.jinxiaocun.demo.service.denglujilu;
import com.weichu.jinxiaocun.demo.bean.Denglujilu;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface DenglujiluService {

    public Denglujilu getDenglujiluById(Long id)throws Exception;

    public List<Denglujilu>	getDenglujiluListByMap(Map<String,Object> param)throws Exception;

    public Integer getDenglujiluCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddDenglujilu(Denglujilu denglujilu)throws Exception;

    public Integer itriptxModifyDenglujilu(Denglujilu denglujilu)throws Exception;

    public Integer itriptxDeleteDenglujiluById(Long id)throws Exception;

}
