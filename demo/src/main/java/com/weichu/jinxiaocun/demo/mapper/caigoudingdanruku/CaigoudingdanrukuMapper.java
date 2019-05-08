package com.weichu.jinxiaocun.demo.mapper.caigoudingdanruku;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdan;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanruku;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface CaigoudingdanrukuMapper {

	public List<Caigoudingdanruku> chaXun(@Param("id")Integer id,
									  @Param("gysId")Integer gysId,
									  @Param("rqYi")String rqYi,
									  @Param("rqEr")String rqEr);

	public Caigoudingdanruku getCaigoudingdanrukuById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoudingdanruku>	getCaigoudingdanrukuListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoudingdanrukuCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoudingdanruku(Caigoudingdanruku caigoudingdanruku)throws Exception;

	public Integer updateCaigoudingdanruku(Caigoudingdanruku caigoudingdanruku)throws Exception;

	public Integer deleteCaigoudingdanrukuById(@Param(value = "ids") String[] ids)throws Exception;

}
