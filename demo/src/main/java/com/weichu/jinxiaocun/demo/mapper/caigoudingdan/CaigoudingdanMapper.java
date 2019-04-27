package com.weichu.jinxiaocun.demo.mapper.caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqing;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface CaigoudingdanMapper {

	public Caigoudingdan getCaigoudingdanById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoudingdan>	getCaigoudingdanListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoudingdanCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception;

	public Integer updateCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception;

	public Integer deleteCaigoudingdanById(@Param(value = "id") Long id)throws Exception;
     public  List<Caigoushenqing> getCaiGouShengQingList();
}
