package com.weichu.jinxiaocun.demo.mapper.kehufenlei;
import com.weichu.jinxiaocun.demo.bean.Kehufenlei;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface KehufenleiMapper {

	public Kehufenlei getKehufenleiById(@Param(value = "id") Long id)throws Exception;

	public List<Kehufenlei>	getKehufenleiListByMap(Map<String,Object> param)throws Exception;

	public Integer getKehufenleiCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertKehufenlei(Kehufenlei kehufenlei)throws Exception;

	public Integer updateKehufenlei(Kehufenlei kehufenlei)throws Exception;

	public Integer deleteKehufenleiById(@Param(value = "id") Long id)throws Exception;

}
