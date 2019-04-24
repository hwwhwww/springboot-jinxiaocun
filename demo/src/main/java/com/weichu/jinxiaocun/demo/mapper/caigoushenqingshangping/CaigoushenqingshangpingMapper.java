package com.weichu.jinxiaocun.demo.mapper.caigoushenqingshangping;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqingshangping;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface CaigoushenqingshangpingMapper {

	public Caigoushenqingshangping getCaigoushenqingshangpingById(@Param(value = "id") Long id)throws Exception;

	public List<Caigoushenqingshangping>	getCaigoushenqingshangpingListByMap(Map<String,Object> param)throws Exception;

	public Integer getCaigoushenqingshangpingCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCaigoushenqingshangping(Caigoushenqingshangping caigoushenqingshangping)throws Exception;

	public Integer updateCaigoushenqingshangping(Caigoushenqingshangping caigoushenqingshangping)throws Exception;

	public Integer deleteCaigoushenqingshangpingById(@Param(value = "id") Long id)throws Exception;

}
