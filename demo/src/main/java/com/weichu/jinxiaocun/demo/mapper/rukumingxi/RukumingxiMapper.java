package com.weichu.jinxiaocun.demo.mapper.rukumingxi;
import com.weichu.jinxiaocun.demo.bean.Rukumingxi;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface RukumingxiMapper {

	public Rukumingxi getRukumingxiById(@Param(value = "id") Long id)throws Exception;

	public List<Rukumingxi>	getRukumingxiListByMap(Map<String,Object> param)throws Exception;

	public Integer getRukumingxiCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertRukumingxi(Rukumingxi rukumingxi)throws Exception;

	public Integer updateRukumingxi(Rukumingxi rukumingxi)throws Exception;

	public Integer deleteRukumingxiById(@Param(value = "id") Long id)throws Exception;

}
