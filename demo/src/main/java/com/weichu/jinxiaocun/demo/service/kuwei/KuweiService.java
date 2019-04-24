package com.weichu.jinxiaocun.demo.service.kuwei;
import com.weichu.jinxiaocun.demo.bean.Kuwei;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface KuweiService {

    public Kuwei getKuweiById(Long id)throws Exception;

    public List<Kuwei>	getKuweiListByMap(Map<String,Object> param)throws Exception;

    public Integer getKuweiCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddKuwei(Kuwei kuwei)throws Exception;

    public Integer itriptxModifyKuwei(Kuwei kuwei)throws Exception;

    public Integer itriptxDeleteKuweiById(Long id)throws Exception;

}
