package com.weichu.jinxiaocun.demo.mapper.caigoufukuandan;

import com.weichu.jinxiaocun.demo.bean.Caigoufukuandan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaigoufukuandanMapper {

    public List<Caigoufukuandan> chaXun(@Param("rqYi")String rqYi,
                                        @Param("rqEr")String rqEr);

    public Integer xiuGai(Caigoufukuandan caigoufukuandan);

    public Integer tianJia(Caigoufukuandan caigoufukuandan);

    public Integer shanChu(@Param("id")Integer id);

    public Caigoufukuandan chaXunDan(@Param("id")Integer id);
}
