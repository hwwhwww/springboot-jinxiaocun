package com.weichu.jinxiaocun.demo.service.gongyingshang;
import com.weichu.jinxiaocun.demo.bean.Gongyingshang;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface GongyingshangService {

    public Gongyingshang getGongyingshangById(Long id)throws Exception;

    public List<Gongyingshang>	getGongyingshangListByMap(Map<String,Object> param)throws Exception;

    public Integer getGongyingshangCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddGongyingshang(Gongyingshang gongyingshang)throws Exception;

    public Integer itriptxModifyGongyingshang(Gongyingshang gongyingshang)throws Exception;

    public Integer itriptxDeleteGongyingshangById(Long id)throws Exception;

}
