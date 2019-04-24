package com.weichu.jinxiaocun.demo.mapper.yuangong;
import com.weichu.jinxiaocun.demo.bean.Yuangong;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface YuangongMapper {

	public Yuangong getYuangongById(@Param(value = "id") Long id)throws Exception;

	public List<Yuangong>	getYuangongListByMap(Map<String,Object> param)throws Exception;

	public Integer getYuangongCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertYuangong(Yuangong yuangong)throws Exception;

	public Integer updateYuangong(Yuangong yuangong)throws Exception;

	public Integer deleteYuangongById(@Param(value = "id") Long id)throws Exception;

}
