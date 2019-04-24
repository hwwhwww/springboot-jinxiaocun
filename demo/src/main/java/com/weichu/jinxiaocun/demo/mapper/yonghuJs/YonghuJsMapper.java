package com.weichu.jinxiaocun.demo.mapper.yonghuJs;
import com.weichu.jinxiaocun.demo.bean.YonghuJs;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface YonghuJsMapper {

	public YonghuJs getYonghuJsById(@Param(value = "id") Long id)throws Exception;

	public List<YonghuJs>	getYonghuJsListByMap(Map<String,Object> param)throws Exception;

	public Integer getYonghuJsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertYonghuJs(YonghuJs yonghuJs)throws Exception;

	public Integer updateYonghuJs(YonghuJs yonghuJs)throws Exception;

	public Integer deleteYonghuJsById(@Param(value = "id") Long id)throws Exception;

}
