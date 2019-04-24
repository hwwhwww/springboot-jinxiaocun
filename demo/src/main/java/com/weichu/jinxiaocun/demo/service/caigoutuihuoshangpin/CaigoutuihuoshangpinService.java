package com.weichu.jinxiaocun.demo.service.caigoutuihuoshangpin;
import com.weichu.jinxiaocun.demo.bean.Caigoutuihuoshangpin;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface CaigoutuihuoshangpinService {

    public Caigoutuihuoshangpin getCaigoutuihuoshangpinById(Long id)throws Exception;

    public List<Caigoutuihuoshangpin>	getCaigoutuihuoshangpinListByMap(Map<String,Object> param)throws Exception;

    public Integer getCaigoutuihuoshangpinCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddCaigoutuihuoshangpin(Caigoutuihuoshangpin caigoutuihuoshangpin)throws Exception;

    public Integer itriptxModifyCaigoutuihuoshangpin(Caigoutuihuoshangpin caigoutuihuoshangpin)throws Exception;

    public Integer itriptxDeleteCaigoutuihuoshangpinById(Long id)throws Exception;

}
