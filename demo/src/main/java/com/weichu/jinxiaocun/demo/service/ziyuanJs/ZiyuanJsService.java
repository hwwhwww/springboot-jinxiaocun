package com.weichu.jinxiaocun.demo.service.ziyuanJs;
import com.weichu.jinxiaocun.demo.bean.ZiyuanJs;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface ZiyuanJsService {

    public ZiyuanJs getZiyuanJsById(Long id)throws Exception;

    public List<ZiyuanJs>	getZiyuanJsListByMap(Map<String,Object> param)throws Exception;

    public Integer getZiyuanJsCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddZiyuanJs(ZiyuanJs ziyuanJs)throws Exception;

    public Integer itriptxModifyZiyuanJs(ZiyuanJs ziyuanJs)throws Exception;

    public Integer itriptxDeleteZiyuanJsById(Long id)throws Exception;

}
