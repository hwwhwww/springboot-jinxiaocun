package com.weichu.jinxiaocun.demo.mapper.kuwei;
import com.weichu.jinxiaocun.demo.bean.Kuwei;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface KuweiMapper {

	public Kuwei getKuweiById(@Param(value = "id") Long id)throws Exception;

	public List<Kuwei>	getKuweiListByMap(Map<String,Object> param)throws Exception;

	public Integer getKuweiCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertKuwei(Kuwei kuwei)throws Exception;

	public Integer updateKuwei(Kuwei kuwei)throws Exception;

	public Integer deleteKuweiById(@Param(value = "id") Long id)throws Exception;

}
