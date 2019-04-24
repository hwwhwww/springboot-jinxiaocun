package com.weichu.jinxiaocun.demo.service.kehufenlei;
import com.weichu.jinxiaocun.demo.bean.Kehufenlei;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface KehufenleiService {

    public Kehufenlei getKehufenleiById(Long id)throws Exception;

    public List<Kehufenlei>	getKehufenleiListByMap(Map<String,Object> param)throws Exception;

    public Integer getKehufenleiCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddKehufenlei(Kehufenlei kehufenlei)throws Exception;

    public Integer itriptxModifyKehufenlei(Kehufenlei kehufenlei)throws Exception;

    public Integer itriptxDeleteKehufenleiById(Long id)throws Exception;

}
