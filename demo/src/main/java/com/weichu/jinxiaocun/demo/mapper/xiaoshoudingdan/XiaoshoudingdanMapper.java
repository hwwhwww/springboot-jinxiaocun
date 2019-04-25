package com.weichu.jinxiaocun.demo.mapper.xiaoshoudingdan;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoudingdan;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface XiaoshoudingdanMapper {

	public Xiaoshoudingdan getXiaoshoudingdanById(@Param(value = "id") Long id)throws Exception;

	public List<Xiaoshoudingdan>	getXiaoshoudingdanListByMap(Map<String, Object> param)throws Exception;

	public Integer getXiaoshoudingdanCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertXiaoshoudingdan(Xiaoshoudingdan xiaoshoudingdan)throws Exception;

	public Integer updateXiaoshoudingdan(Xiaoshoudingdan xiaoshoudingdan)throws Exception;

	public Integer deleteXiaoshoudingdanById(@Param(value = "id") Long id)throws Exception;

}
