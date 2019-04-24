package com.weichu.jinxiaocun.demo.service.juese;
import com.weichu.jinxiaocun.demo.bean.Juese;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface JueseService {

    public Juese getJueseById(Long id)throws Exception;

    public List<Juese>	getJueseListByMap(Map<String,Object> param)throws Exception;

    public Integer getJueseCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddJuese(Juese juese)throws Exception;

    public Integer itriptxModifyJuese(Juese juese)throws Exception;

    public Integer itriptxDeleteJueseById(Long id)throws Exception;

}
