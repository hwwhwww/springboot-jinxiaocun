package com.weichu.jinxiaocun.demo.service.shangpingruku;
import com.weichu.jinxiaocun.demo.bean.Shangpingruku;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface ShangpingrukuService {

    public Shangpingruku getShangpingrukuById(Long id)throws Exception;

    public List<Shangpingruku>	getShangpingrukuListByMap(Map<String,Object> param)throws Exception;

    public Integer getShangpingrukuCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddShangpingruku(Shangpingruku shangpingruku)throws Exception;

    public Integer itriptxModifyShangpingruku(Shangpingruku shangpingruku)throws Exception;

    public Integer itriptxDeleteShangpingrukuById(Long id)throws Exception;

}
