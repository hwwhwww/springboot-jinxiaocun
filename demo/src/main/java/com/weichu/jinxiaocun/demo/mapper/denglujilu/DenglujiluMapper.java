package com.weichu.jinxiaocun.demo.mapper.denglujilu;
import com.weichu.jinxiaocun.demo.bean.Denglujilu;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface DenglujiluMapper {

	public Denglujilu getDenglujiluById(@Param(value = "id") Long id)throws Exception;

	public List<Denglujilu>	getDenglujiluListByMap(Map<String,Object> param)throws Exception;

	public Integer getDenglujiluCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDenglujilu(Denglujilu denglujilu)throws Exception;

	public Integer updateDenglujilu(Denglujilu denglujilu)throws Exception;

	public Integer deleteDenglujiluById(@Param(value = "id") Long id)throws Exception;

}
