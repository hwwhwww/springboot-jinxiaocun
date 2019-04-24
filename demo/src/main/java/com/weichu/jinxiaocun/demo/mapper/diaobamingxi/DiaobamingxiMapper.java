package com.weichu.jinxiaocun.demo.mapper.diaobamingxi;
import com.weichu.jinxiaocun.demo.bean.Diaobamingxi;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface DiaobamingxiMapper {

	public Diaobamingxi getDiaobamingxiById(@Param(value = "id") Long id)throws Exception;

	public List<Diaobamingxi>	getDiaobamingxiListByMap(Map<String,Object> param)throws Exception;

	public Integer getDiaobamingxiCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDiaobamingxi(Diaobamingxi diaobamingxi)throws Exception;

	public Integer updateDiaobamingxi(Diaobamingxi diaobamingxi)throws Exception;

	public Integer deleteDiaobamingxiById(@Param(value = "id") Long id)throws Exception;

}
