package com.weichu.jinxiaocun.demo.mapper.xiaoshoudingdanshangping;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoudingdanshangping;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface XiaoshoudingdanshangpingMapper {

	public Xiaoshoudingdanshangping getXiaoshoudingdanshangpingById(@Param(value = "id") Long id)throws Exception;

	public List<Xiaoshoudingdanshangping>	getXiaoshoudingdanshangpingListByMap(Map<String,Object> param)throws Exception;

	public Integer getXiaoshoudingdanshangpingCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertXiaoshoudingdanshangping(Xiaoshoudingdanshangping xiaoshoudingdanshangping)throws Exception;

	public Integer updateXiaoshoudingdanshangping(Xiaoshoudingdanshangping xiaoshoudingdanshangping)throws Exception;

	public Integer deleteXiaoshoudingdanshangpingById(@Param(value = "id") Long id)throws Exception;

}
