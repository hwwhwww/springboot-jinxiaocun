package com.weichu.jinxiaocun.demo.mapper.shangping;
import com.weichu.jinxiaocun.demo.bean.Shangping;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ShangpingMapper {

	public Shangping getShangpingById(@Param(value = "id") Long id)throws Exception;

	public List<Shangping>	getShangpingListByMap(Map<String,Object> param)throws Exception;

	public Integer getShangpingCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertShangping(Shangping shangping)throws Exception;

	public Integer updateShangping(Shangping shangping)throws Exception;

	public Integer deleteShangpingById(@Param(value = "id") Long id)throws Exception;

}
