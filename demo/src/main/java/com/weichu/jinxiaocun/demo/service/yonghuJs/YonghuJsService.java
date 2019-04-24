package com.weichu.jinxiaocun.demo.service.yonghuJs;
import com.weichu.jinxiaocun.demo.bean.YonghuJs;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface YonghuJsService {

    public YonghuJs getYonghuJsById(Long id)throws Exception;

    public List<YonghuJs>	getYonghuJsListByMap(Map<String,Object> param)throws Exception;

    public Integer getYonghuJsCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddYonghuJs(YonghuJs yonghuJs)throws Exception;

    public Integer itriptxModifyYonghuJs(YonghuJs yonghuJs)throws Exception;

    public Integer itriptxDeleteYonghuJsById(Long id)throws Exception;

}
