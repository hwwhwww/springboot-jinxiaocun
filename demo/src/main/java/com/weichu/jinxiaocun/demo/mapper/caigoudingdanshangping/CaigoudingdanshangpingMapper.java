package com.weichu.jinxiaocun.demo.mapper.caigoudingdanshangping;
import com.weichu.jinxiaocun.demo.bean.Caigoudingdanshangping;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface CaigoudingdanshangpingMapper {



	public Integer shanChu(@Param("id")Integer id,
						   @Param("spId")Integer spId);

	public Integer tianJia(@Param("list")List<Caigoudingdanshangping> list);

	public Integer xiuGai(@Param("list")List<Caigoudingdanshangping> list);

	public Caigoudingdanshangping getCaigoudingdanshangpingById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoudingdanshangping>	getCaigoudingdanshangpingListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoudingdanshangpingCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoudingdanshangping(Caigoudingdanshangping caigoudingdanshangping)throws Exception;

	public Integer updateCaigoudingdanshangping(Caigoudingdanshangping caigoudingdanshangping)throws Exception;

	public Integer deleteCaigoudingdanshangpingById( @Param("ids")String[] ids)throws Exception;

}
