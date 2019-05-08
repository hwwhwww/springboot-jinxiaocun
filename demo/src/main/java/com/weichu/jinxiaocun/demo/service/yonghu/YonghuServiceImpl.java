//package com.weichu.jinxiaocun.demo.service.yonghu;
//
//import com.weichu.jinxiaocun.demo.bean.Yonghu;
//import com.weichu.jinxiaocun.demo.mapper.yonghu.YonghuMapper;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class YonghuServiceImpl implements YonghuService {
//
//    @Resource
//    private YonghuMapper yonghuMapper;
//
//    public Yonghu getYonghuById(Long id)throws Exception{
//        return yonghuMapper.getYonghuById(id);
//    }
//
//    public List<Yonghu>	getYonghuListByMap(Map<String,Object> param)throws Exception{
//        return yonghuMapper.getYonghuListByMap(param);
//    }
//
//    public Integer getYonghuCountByMap(Map<String,Object> param)throws Exception{
//        return yonghuMapper.getYonghuCountByMap(param);
//    }
//
//    public Integer itriptxAddYonghu(Yonghu yonghu)throws Exception{
//            return yonghuMapper.insertYonghu(yonghu);
//    }
//
//    public Integer itriptxModifyYonghu(Yonghu yonghu)throws Exception{
//        return yonghuMapper.updateYonghu(yonghu);
//    }
//
//    public Integer itriptxDeleteYonghuById(Long id)throws Exception{
//        return yonghuMapper.deleteYonghuById(id);
//    }
//
//}
