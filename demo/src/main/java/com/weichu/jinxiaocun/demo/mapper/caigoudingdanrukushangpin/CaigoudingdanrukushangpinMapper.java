package com.weichu.jinxiaocun.demo.mapper.caigoudingdanrukushangpin;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanrukushangpin;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface CaigoudingdanrukushangpinMapper {

	public Caigoudingdanrukushangpin getCaigoudingdanrukushangpinById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoudingdanrukushangpin>	getCaigoudingdanrukushangpinListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoudingdanrukushangpinCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoudingdanrukushangpin(Caigoudingdanrukushangpin caigoudingdanrukushangpin)throws Exception;

	public Integer updateCaigoudingdanrukushangpin(Caigoudingdanrukushangpin caigoudingdanrukushangpin)throws Exception;

	public Integer deleteCaigoudingdanrukushangpinById(@Param(value = "ids") String[] ids)throws Exception;

}
