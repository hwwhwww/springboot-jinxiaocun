package com.weichu.jinxiaocun.demo.mapper.danwei;
import com.weichu.jinxiaocun.demo.bean.Danwei;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface DanweiMapper {

	public Danwei getDanweiById(@Param(value = "dwId") Long id)throws Exception;

	public List<Danwei>	getDanweiListByMap(Map<String,Object> param)throws Exception;

	public Integer getDanweiCountByMap(Map<String,Object> param)throws Exception;

	public Integer itriptxAddDanwei(Danwei danwei)throws Exception;

	public Integer itriptxModifyDanwei(Danwei danwei)throws Exception;

	public Integer itriptxDeleteDanweiById(@Param(value = "id") Long id)throws Exception;

}
