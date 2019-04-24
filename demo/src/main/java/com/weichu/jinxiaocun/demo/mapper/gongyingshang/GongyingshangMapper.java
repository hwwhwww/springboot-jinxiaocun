package com.weichu.jinxiaocun.demo.mapper.gongyingshang;
import com.weichu.jinxiaocun.demo.bean.Gongyingshang;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface GongyingshangMapper {

	public Gongyingshang getGongyingshangById(@Param(value = "id") Long id)throws Exception;

	public List<Gongyingshang>	getGongyingshangListByMap(Map<String,Object> param)throws Exception;

	public Integer getGongyingshangCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGongyingshang(Gongyingshang gongyingshang)throws Exception;

	public Integer updateGongyingshang(Gongyingshang gongyingshang)throws Exception;

	public Integer deleteGongyingshangById(@Param(value = "id") Long id)throws Exception;

}
