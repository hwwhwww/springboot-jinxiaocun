package com.weichu.jinxiaocun.demo.mapper.juese;
import com.weichu.jinxiaocun.demo.bean.Juese;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface JueseMapper {

	public Juese getJueseById(@Param(value = "id") Long id)throws Exception;

	public List<Juese>	getJueseListByMap(Map<String,Object> param)throws Exception;

	public Integer getJueseCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertJuese(Juese juese)throws Exception;

	public Integer updateJuese(Juese juese)throws Exception;

	public Integer deleteJueseById(@Param(value = "id") Long id)throws Exception;

}
