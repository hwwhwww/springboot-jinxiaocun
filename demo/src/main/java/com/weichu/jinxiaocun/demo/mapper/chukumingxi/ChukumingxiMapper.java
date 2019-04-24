package com.weichu.jinxiaocun.demo.mapper.chukumingxi;
import com.weichu.jinxiaocun.demo.bean.Chukumingxi;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ChukumingxiMapper {

	public Chukumingxi getChukumingxiById(@Param(value = "id") Long id)throws Exception;

	public List<Chukumingxi>	getChukumingxiListByMap(Map<String,Object> param)throws Exception;

	public Integer getChukumingxiCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertChukumingxi(Chukumingxi chukumingxi)throws Exception;

	public Integer updateChukumingxi(Chukumingxi chukumingxi)throws Exception;

	public Integer deleteChukumingxiById(@Param(value = "id") Long id)throws Exception;

}
