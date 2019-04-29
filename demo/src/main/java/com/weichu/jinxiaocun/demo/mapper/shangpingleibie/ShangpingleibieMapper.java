package com.weichu.jinxiaocun.demo.mapper.shangpingleibie;
import com.weichu.jinxiaocun.demo.bean.Shangpingleibie;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ShangpingleibieMapper {

	public Shangpingleibie getShangpingleibieById(@Param(value = "id") Long id)throws Exception;

	public List<Shangpingleibie>	getShangpingleibieListByMap(Map<String,Object> param)throws Exception;

	public Integer getShangpingleibieCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertShangpingleibie(Shangpingleibie shangpingleibie)throws Exception;

	public Integer updateShangpingleibie(Shangpingleibie shangpingleibie)throws Exception;

	public Integer itriptxDeleteShangpingleibieById(@Param(value = "id") Long id)throws Exception;

}
