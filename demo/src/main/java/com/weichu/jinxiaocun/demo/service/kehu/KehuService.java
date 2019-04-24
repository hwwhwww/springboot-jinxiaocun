package com.weichu.jinxiaocun.demo.service.kehu;
import com.weichu.jinxiaocun.demo.bean.Kehu;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface KehuService {

    public Kehu getKehuById(Long id)throws Exception;

    public List<Kehu>	getKehuListByMap(Map<String,Object> param)throws Exception;

    public Integer getKehuCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddKehu(Kehu kehu)throws Exception;

    public Integer itriptxModifyKehu(Kehu kehu)throws Exception;

    public Integer itriptxDeleteKehuById(Long id)throws Exception;

}
