package com.weichu.jinxiaocun.demo.mapper.xiaoshoutueihuei;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoutueihuei;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface XiaoshoutueihueiMapper {

	public Xiaoshoutueihuei getXiaoshoutueihueiById(@Param(value = "id") Long id)throws Exception;

	public List<Xiaoshoutueihuei>	getXiaoshoutueihueiListByMap(Map<String, Object> param)throws Exception;

	public Integer getXiaoshoutueihueiCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertXiaoshoutueihuei(Xiaoshoutueihuei xiaoshoutueihuei)throws Exception;

	public Integer updateXiaoshoutueihuei(Xiaoshoutueihuei xiaoshoutueihuei)throws Exception;

	public Integer deleteXiaoshoutueihueiById(@Param(value = "id") Long id)throws Exception;

}
