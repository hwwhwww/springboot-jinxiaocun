package com.weichu.jinxiaocun.demo.mapper.kehu;
import com.weichu.jinxiaocun.demo.bean.Kehu;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface KehuMapper {

	public Kehu getKehuById(@Param(value = "id") Long id)throws Exception;

	public List<Kehu>	getKehuListByMap(Map<String,Object> param)throws Exception;

	public Integer getKehuCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertKehu(Kehu kehu)throws Exception;

	public Integer updateKehu(Kehu kehu)throws Exception;

	public Integer deleteKehuById(@Param(value = "id") Long id)throws Exception;

}
