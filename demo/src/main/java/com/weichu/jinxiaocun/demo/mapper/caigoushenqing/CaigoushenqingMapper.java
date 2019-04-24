package com.weichu.jinxiaocun.demo.mapper.caigoushenqing;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqing;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface CaigoushenqingMapper {

	public Caigoushenqing getCaigoushenqingById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoushenqing>	getCaigoushenqingListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoushenqingCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception;

	public Integer updateCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception;

	public Integer deleteCaigoushenqingById(@Param(value = "id") Long id)throws Exception;

}
