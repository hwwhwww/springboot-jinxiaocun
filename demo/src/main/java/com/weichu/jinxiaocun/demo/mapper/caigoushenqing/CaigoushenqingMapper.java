package com.weichu.jinxiaocun.demo.mapper.caigoushenqing;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.Map;

@Mapper
public interface CaigoushenqingMapper {

	public List<Caigoushenqing> weiYinYong(@Param("id") Integer id);

	public Caigoushenqing getCaigoushenqingById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoushenqing>	getCaigoushenqingListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoushenqingCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception;
	public List<Caigoushenqing> chaXun(@Param("id")Integer id, @Param("rqYi")String rqYi,
									  @Param("rqEr")String rqEr);
	public Integer updateCaigoushenqing(Caigoushenqing caigoushenqing)throws Exception;

	public Integer deleteCaigoushenqingById(@Param(value = "ids") String[] ids)throws Exception;

	public List<Caigoushenqing> getCaiGouShengQingList(@Param(value = "cgsqId")String cgsqId);
}
