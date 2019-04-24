package com.weichu.jinxiaocun.demo.mapper.caigoutuihuo;
import com.weichu.jinxiaocun.demo.bean.Caigoutuihuo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface CaigoutuihuoMapper {

	public Caigoutuihuo getCaigoutuihuoById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoutuihuo>	getCaigoutuihuoListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoutuihuoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoutuihuo(Caigoutuihuo caigoutuihuo)throws Exception;

	public Integer updateCaigoutuihuo(Caigoutuihuo caigoutuihuo)throws Exception;

	public Integer deleteCaigoutuihuoById(@Param(value = "id") Long id)throws Exception;

}
