package com.weichu.jinxiaocun.demo.mapper.baojing;

import com.weichu.jinxiaocun.demo.bean.Baojing;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.INTERNAL;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BaoJingMapper {

    List<Baojing> chaXun(@Param("kwId") Integer kwId);
    Integer tianJia(@Param("shang") Integer shang,@Param("xia")Integer xia
            ,@Param("kId") Integer kId,@Param("spId") Integer spId);
    Integer xiuGai(@Param("shang") Integer shang,@Param("xia")Integer xia
            ,@Param("kId") Integer kId,@Param("spId") Integer spId);
}
