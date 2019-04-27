package com.weichu.jinxiaocun.demo.mapper.ziyuan;

import com.weichu.jinxiaocun.demo.bean.Ziyuan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ZiyuanMapper {

	List<Ziyuan> allZiYuan();

	public Ziyuan getZiyuanById(@Param(value = "id") Long id)throws Exception;

	public List<Ziyuan>	getZiyuanListByMap(Map<String, Object> param)throws Exception;

	public Integer getZiyuanCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertZiyuan(Ziyuan ziyuan)throws Exception;

	public Integer updateZiyuan(Ziyuan ziyuan)throws Exception;

	public Integer deleteZiyuanById(@Param(value = "id") Long id)throws Exception;

}
