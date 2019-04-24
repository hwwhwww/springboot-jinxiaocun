package com.weichu.jinxiaocun.demo.service.shangpingchuku;
import com.weichu.jinxiaocun.demo.bean.Shangpingchuku;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface ShangpingchukuService {

    public Shangpingchuku getShangpingchukuById(Long id)throws Exception;

    public List<Shangpingchuku>	getShangpingchukuListByMap(Map<String,Object> param)throws Exception;

    public Integer getShangpingchukuCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddShangpingchuku(Shangpingchuku shangpingchuku)throws Exception;

    public Integer itriptxModifyShangpingchuku(Shangpingchuku shangpingchuku)throws Exception;

    public Integer itriptxDeleteShangpingchukuById(Long id)throws Exception;

}
