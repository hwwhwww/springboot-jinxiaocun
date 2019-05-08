package com.weichu.jinxiaocun.demo.mapper.caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqing;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface CaigoudingdanMapper {

	public Integer zuiDaZhi();

	public List<Caigoudingdan> chaXunMeiYou(@Param(value = "id") Integer id);

	public Caigoudingdan getCaigoudingdanById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoudingdan>	getCaigoudingdanListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoudingdanCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception;

	public Integer updateCaigoudingdan(Caigoudingdan caigoudingdan)throws Exception;


	public List<Caigoudingdan> chaXun(@Param("id")Integer id,
									  @Param("gysId")Integer gysId,
									  @Param("rqYi")String rqYi,
									  @Param("rqEr")String rqEr);

		public Integer deleteCaigoudingdanById(@Param("ids")String[] ids)throws Exception;
     public  List<Caigoushenqing> getCaiGouShengQingList();
}
