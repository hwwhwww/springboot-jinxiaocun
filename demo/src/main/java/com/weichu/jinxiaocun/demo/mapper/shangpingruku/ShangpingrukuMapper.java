package com.weichu.jinxiaocun.demo.mapper.shangpingruku;
import com.weichu.jinxiaocun.demo.bean.Shangpingruku;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ShangpingrukuMapper {

	public Shangpingruku getShangpingrukuById(@Param(value = "id") Long id)throws Exception;

	public List<Shangpingruku>	getShangpingrukuListByMap(Map<String,Object> param)throws Exception;

	public Integer getShangpingrukuCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertShangpingruku(Shangpingruku shangpingruku)throws Exception;

	public Integer updateShangpingruku(Shangpingruku shangpingruku)throws Exception;

	public Integer deleteShangpingrukuById(@Param(value = "id") Long id)throws Exception;

}
