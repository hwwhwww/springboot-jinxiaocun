package com.weichu.jinxiaocun.demo.service.shangpingleibie;
import com.weichu.jinxiaocun.demo.bean.Shangpingleibie;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface ShangpingleibieService {

    public Shangpingleibie getShangpingleibieById(Long id)throws Exception;

    public List<Shangpingleibie>	getShangpingleibieListByMap(Map<String,Object> param)throws Exception;

    public Integer getShangpingleibieCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddShangpingleibie(Shangpingleibie shangpingleibie)throws Exception;

    public Integer itriptxModifyShangpingleibie(Shangpingleibie shangpingleibie)throws Exception;

    public Integer itriptxDeleteShangpingleibieById(Long id)throws Exception;

}
