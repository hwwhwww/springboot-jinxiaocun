package com.weichu.jinxiaocun.demo.service.shangping;
import com.weichu.jinxiaocun.demo.bean.Baojing;
import com.weichu.jinxiaocun.demo.bean.Shangpingleibie;
import com.weichu.jinxiaocun.demo.mapper.baojing.BaoJingMapper;
import com.weichu.jinxiaocun.demo.mapper.shangping.ShangpingMapper;
import com.weichu.jinxiaocun.demo.bean.Shangping;
import com.weichu.jinxiaocun.demo.mapper.shangpingleibie.ShangpingleibieMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ShangpingServiceImpl implements ShangpingService {

    @Resource
    private ShangpingMapper shangpingMapper;

    @Resource
    private BaoJingMapper baoJingMapper;

    @Override
    public Integer tianJia(Integer shang, Integer xia, Integer kId, Integer spId) {
       return baoJingMapper.tianJia(shang,xia,kId,spId);
    }

    @Override
    public Integer xiuGai(Integer shang, Integer xia, Integer kId, Integer spId) {
        return baoJingMapper.xiuGai(shang,xia,kId,spId);
    }

    /**
     * 显示每个仓库的商品上下限
     * @param id
     * @return
     */
    public List<Baojing> chaXun(Integer id) {
        try {
            baoJingMapper.chaXun(id);
            List<Baojing> baojingList= baoJingMapper.chaXun(id);
            List<Shangping>list=shangpingMapper.getShangpingListByMap(null);
            List<Baojing> baojingList1=new ArrayList<>();
//          for (int i=0;i<baojingList.size();i++){
//              baojingList1.add(baojingList.get(i));
//          }
//            for (int i=0;i<list.size();i++){
//                for (int j=0;j<baojingList.size();j++){
//                    Shangping shangping=list.get(i);
//                    if(list.get(i).getSpId()==baojingList.get(j).getSpId()){
//                        Baojing baojing=new Baojing();
//                        baojing.setShang(baojingList.get(j).getShang());
//                        baojing.setXia(baojingList.get(j).getXia());
//                        baojing.setShangping(shangping);
//                        baojingList1.add(baojing);
//                        break;
//                    }
//                        Baojing baojing=new Baojing();
//                        baojing.setShang(0);
//                        baojing.setXia(0);
//                        baojing.setShangping(shangping);
//                        baojingList1.add(baojing);
//                }
//            }
            for (int i=0;i<list.size();i++){
                if(baojingList.size()==0){
                    Shangping shangping=list.get(i);
                    Baojing baojing=new Baojing();
                    baojing.setShangping(shangping);
                    baojing.setShang(0);
                    baojing.setXia(0);
                    baojingList1.add(baojing);
                }
                for (int j=0;j<baojingList.size();j++){
                    Shangping shangping=list.get(i);
                    Baojing baojing=new Baojing();
                    baojing.setShangping(shangping);
//                    if(baojingList.get(j).getShang()!=null){
//                        baojing.setShang(baojingList.get(i).getShang());
//                    }
//                    if(baojingList.get(j).getXia()!=null){
//                        baojing.setXia(baojingList.get(i).getXia());
//                    }
                        baojing.setShang(0);
                        baojing.setXia(0);
//                    if(list.get(i).getSpId()==baojingList.get(j).getSpId()){
//                     continue;
//                    }
                    baojingList1.add(baojing);
                    break;
                }
            }
            for (int h=0;h<baojingList1.size();h++){
                for (int j=0;j< baojingList.size();j++){
                    if(baojingList1.get(h).getShangping().getSpId()==baojingList.get(j).getSpId()){
                        baojingList1.get(h).setShang( baojingList.get(j).getShang());
                        baojingList1.get(h).setXia( baojingList.get(j).getXia());
                    }
                }
            }
            return baojingList1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Shangping getShangpingById(Long id)throws Exception{
        return shangpingMapper.getShangpingById(id);
    }



    public List<Shangping>	getShangpingListByMap(Map<String,Object> param)throws Exception{
        return shangpingMapper.getShangpingListByMap(param);
    }

    public Integer getShangpingCountByMap(Map<String,Object> param)throws Exception{
        return shangpingMapper.getShangpingCountByMap(param);
    }

    public Integer itriptxAddShangping(Shangping shangping)throws Exception{
            return shangpingMapper.insertShangping(shangping);
    }

    public Integer itriptxModifyShangping(Shangping shangping)throws Exception{
        return shangpingMapper.updateShangping(shangping);
    }

    public Integer itriptxDeleteShangpingById(Long id)throws Exception{
        return shangpingMapper.deleteShangpingById(id);
    }


}
