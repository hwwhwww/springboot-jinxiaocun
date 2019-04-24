package com.weichu.jinxiaocun.demo.mapper.ziyuanJs;
import com.weichu.jinxiaocun.demo.bean.ZiyuanJs;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ZiyuanJsMapper {

	public ZiyuanJs getZiyuanJsById(@Param(value = "id") Long id)throws Exception;

	public List<ZiyuanJs>	getZiyuanJsListByMap(Map<String,Object> param)throws Exception;

	public Integer getZiyuanJsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertZiyuanJs(ZiyuanJs ziyuanJs)throws Exception;

	public Integer updateZiyuanJs(ZiyuanJs ziyuanJs)throws Exception;

	public Integer deleteZiyuanJsById(@Param(value = "id") Long id)throws Exception;

}
