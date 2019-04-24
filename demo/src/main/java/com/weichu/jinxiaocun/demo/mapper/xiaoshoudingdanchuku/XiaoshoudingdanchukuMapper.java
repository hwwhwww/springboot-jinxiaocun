package com.weichu.jinxiaocun.demo.mapper.xiaoshoudingdanchuku;
import com.weichu.jinxiaocun.demo.bean.Xiaoshoudingdanchuku;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface XiaoshoudingdanchukuMapper {

	public Xiaoshoudingdanchuku getXiaoshoudingdanchukuById(@Param(value = "id") Long id)throws Exception;

	public List<Xiaoshoudingdanchuku>	getXiaoshoudingdanchukuListByMap(Map<String, Object> param)throws Exception;

	public Integer getXiaoshoudingdanchukuCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertXiaoshoudingdanchuku(Xiaoshoudingdanchuku xiaoshoudingdanchuku)throws Exception;

	public Integer updateXiaoshoudingdanchuku(Xiaoshoudingdanchuku xiaoshoudingdanchuku)throws Exception;

	public Integer deleteXiaoshoudingdanchukuById(@Param(value = "id") Long id)throws Exception;

}
