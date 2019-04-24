package com.weichu.jinxiaocun.demo.mapper.shangpingchuku;
import com.weichu.jinxiaocun.demo.bean.Shangpingchuku;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ShangpingchukuMapper {

	public Shangpingchuku getShangpingchukuById(@Param(value = "id") Long id)throws Exception;

	public List<Shangpingchuku>	getShangpingchukuListByMap(Map<String,Object> param)throws Exception;

	public Integer getShangpingchukuCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertShangpingchuku(Shangpingchuku shangpingchuku)throws Exception;

	public Integer updateShangpingchuku(Shangpingchuku shangpingchuku)throws Exception;

	public Integer deleteShangpingchukuById(@Param(value = "id") Long id)throws Exception;

}
