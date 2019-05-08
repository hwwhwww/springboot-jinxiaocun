package com.weichu.jinxiaocun.demo.mapper.caigoutuihuoshangpin;
import com.weichu.jinxiaocun.demo.bean.Caigoutuihuoshangpin;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface CaigoutuihuoshangpinMapper {

	public Caigoutuihuoshangpin getCaigoutuihuoshangpinById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoutuihuoshangpin>	getCaigoutuihuoshangpinListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoutuihuoshangpinCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoutuihuoshangpin(Caigoutuihuoshangpin caigoutuihuoshangpin)throws Exception;

	public Integer updateCaigoutuihuoshangpin(Caigoutuihuoshangpin caigoutuihuoshangpin)throws Exception;

	public Integer deleteCaigoutuihuoshangpinById(@Param(value = "ids") String[] ids)throws Exception;

}
