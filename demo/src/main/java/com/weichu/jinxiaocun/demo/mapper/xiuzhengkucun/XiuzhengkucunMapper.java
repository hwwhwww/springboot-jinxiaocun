package com.weichu.jinxiaocun.demo.mapper.xiuzhengkucun;
import com.weichu.jinxiaocun.demo.bean.Xiuzhengkucun;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface XiuzhengkucunMapper {

	public Xiuzhengkucun getXiuzhengkucunById(@Param(value = "id") Long id)throws Exception;

	public List<Xiuzhengkucun>	getXiuzhengkucunListByMap(Map<String,Object> param)throws Exception;

	public Integer getXiuzhengkucunCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertXiuzhengkucun(Xiuzhengkucun xiuzhengkucun)throws Exception;

	public Integer updateXiuzhengkucun(Xiuzhengkucun xiuzhengkucun)throws Exception;

	public Integer deleteXiuzhengkucunById(@Param(value = "id") Long id)throws Exception;

}
