package com.weichu.jinxiaocun.demo.service.caigoufukuandan;

import com.weichu.jinxiaocun.demo.bean.Caigoufukuandan;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CaigoufukuandanService {

    public List<Caigoufukuandan> chaXun(@Param("rqYi") Date rqYi,
                                        @Param("rqEr")Date rqEr);

    public Integer xiuGai(Caigoufukuandan caigoufukuandan);

    public Integer tianJia(Caigoufukuandan caigoufukuandan);

    public Integer shanChu(@Param("id")Integer id);

    public Caigoufukuandan chaXunDan(@Param("id")Integer id);
}
