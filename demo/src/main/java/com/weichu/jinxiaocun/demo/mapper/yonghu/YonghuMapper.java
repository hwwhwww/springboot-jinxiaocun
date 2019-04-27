package com.weichu.jinxiaocun.demo.mapper.yonghu;

import com.weichu.jinxiaocun.demo.bean.Yonghu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface YonghuMapper {

	Yonghu loadUserByUsername(@Param("yhYhm") String yhYhm);

	public Yonghu getYonghuById(@Param(value = "id") Long id)throws Exception;

	public List<Yonghu>	getYonghuListByMap(Map<String, Object> param)throws Exception;

	public Integer getYonghuCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertYonghu(Yonghu yonghu)throws Exception;

	public Integer updateYonghu(Yonghu yonghu)throws Exception;

	public Integer deleteYonghuById(@Param(value = "id") Long id)throws Exception;

}
