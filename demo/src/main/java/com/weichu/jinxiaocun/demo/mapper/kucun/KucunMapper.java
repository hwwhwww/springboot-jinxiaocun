package com.weichu.jinxiaocun.demo.mapper.kucun;
import com.weichu.jinxiaocun.demo.bean.Kucun;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface KucunMapper {

	public Kucun getKucunById(@Param(value = "id") Long id)throws Exception;

	public List<Kucun>	getKucunListByMap(Map<String,Object> param)throws Exception;

	public Integer getKucunCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertKucun(Kucun kucun)throws Exception;

	public Integer updateKucun(Kucun kucun)throws Exception;

	public Integer deleteKucunById(@Param(value = "id") Long id)throws Exception;

}
