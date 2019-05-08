package com.weichu.jinxiaocun.demo.controller.caigou;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.weichu.jinxiaocun.demo.bean.*;
import com.weichu.jinxiaocun.demo.comment.DateUtil;
import com.weichu.jinxiaocun.demo.comment.ExportPaperPdfUtil;
import com.weichu.jinxiaocun.demo.comment.PoiUtil;
import com.weichu.jinxiaocun.demo.mapper.caigoudingdan.CaigoudingdanMapper;
import com.weichu.jinxiaocun.demo.mapper.yuangong.YuangongMapper;
import com.weichu.jinxiaocun.demo.service.caigoudingdan.CaigoudingdanService;
import com.weichu.jinxiaocun.demo.service.caigoudingdanruku.CaigoudingdanrukuService;
import com.weichu.jinxiaocun.demo.service.caigoudingdanshangping.CaigoudingdanshangpingService;
import com.weichu.jinxiaocun.demo.service.caigoufukuandan.CaigoufukuandanService;
import com.weichu.jinxiaocun.demo.service.caigoushenqing.CaigoushenqingService;
import com.weichu.jinxiaocun.demo.service.caigoushenqingshangping.CaigoushenqingshangpingService;
import com.weichu.jinxiaocun.demo.service.caigoutuihuo.CaigoutuihuoService;
import com.weichu.jinxiaocun.demo.service.gongyingshang.GongyingshangService;
import com.weichu.jinxiaocun.demo.service.kuwei.KuweiService;
import com.weichu.jinxiaocun.demo.service.shangping.ShangpingService;
import com.weichu.jinxiaocun.demo.service.yuangong.YuangongService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.unit.DataUnit;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/caigou")
public class CaiGouController {

    @Autowired
    CaigoushenqingService caigoushenqingService;

    @Autowired
    GongyingshangService gongyingshangService;

    @Autowired
    CaigoushenqingshangpingService CaigoushenqingshangpingService;

    @Autowired
    CaigoudingdanrukuService caigoudingdanrukuService;

    @Autowired
    KuweiService kuweiService;

    @Autowired
    CaigoudingdanshangpingService caigoudingdanshangpingService;

    @Autowired
    CaigoutuihuoService caigoutuihuoService;

    @Autowired
    CaigoudingdanService caigoudingdanService;

    @Autowired
    YuangongService yuangongService;

    @Autowired
    ShangpingService shangpingService;

    @Autowired
    CaigoufukuandanService caigoufukuandanService;

    @RequestMapping("/caiGouShenQingPDF")
    public void downloadPdf(HttpServletRequest request, HttpServletResponse response, Model model){
        try {
            List<Caigoushenqing> Partitions = caigoushenqingService.chaXun(null,null,null);
            String title = "采购申请";
            String[] rowsName = new String[] {"流水号","申请日期","采购人","期限","审核状态","备注"};
            List<Object[]> dataList = new ArrayList<>();
            Object[] objs = null;
            for(int i=0; i<Partitions.size();i++) {
                Caigoushenqing main = Partitions.get(i);
                objs = new Object[rowsName.length];
                objs[0] = main.getCgsqXh();
                objs[1] = DateUtil.getDefaultTime2DateStr(main.getCgsqRq());
                objs[2] = main.getYuangong().getYgName();
                objs[3] = DateUtil.getDefaultTime2DateStr(main.getCgsqRq());
                objs[4] = main.getCgsqSh();
                objs[5] = main.getCgsqBz();
                dataList.add(objs);
            }
            ExportPaperPdfUtil e=new ExportPaperPdfUtil();
            ByteArrayOutputStream baos=e.simplePDF(title, rowsName, dataList);
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment; filename="+"caigoushenqing"+DateUtil.yueNianRi(new Date())+".pdf");
            response.setContentLength(baos.size());
            OutputStream out = response.getOutputStream();
            baos.writeTo(out);
            out.flush();
            out.close();
        } catch (Exception e) {
// TODO: handle exception
        }
    }
    
    /**
     * 采购申请POI
     * @param response
     * @throws Exception
     */
    @RequestMapping("/caiGouShenQingPOI")
    public void outPartitionExcel(HttpServletResponse response) throws Exception {
        List<Caigoushenqing> Partitions = caigoushenqingService.chaXun(null,null,null);
        String title = "采购申请";
        String[] rowsName = new String[] {"流水号","申请日期","采购人","期限","审核状态","备注"};
        List<Object[]> dataList = new ArrayList<>();
        Object[] objs = null;
        for(int i=0; i<Partitions.size();i++) {
            Caigoushenqing main = Partitions.get(i);
            objs = new Object[rowsName.length];
            objs[0] = main.getCgsqXh();
            objs[1] = DateUtil.getDefaultTime2DateStr(main.getCgsqRq());
            objs[2] = main.getYuangong().getYgName();
            objs[3] = DateUtil.getDefaultTime2DateStr(main.getCgsqRq());
            objs[4] = main.getCgsqSh();
            objs[5] = main.getCgsqBz();
            objs[6] = main.getCgsqXh();
            dataList.add(objs);
        }
        PoiUtil ex = new PoiUtil(title, rowsName, dataList);
        ex.export(response);
    }

    @RequestMapping("/caigoushengqin")
    public String getcaigouminxi(@RequestParam(value = "caigouid", required = false
    ) String caigouid, Model model) {
        List<Caigoushenqing> cgsqList = caigoushenqingService.getCaiGouShengQingList(null);
        model.addAttribute("cgsqList", cgsqList);

        return "caigoushenqin";
    }

    @RequestMapping("/caigoushengUpd/{id}")
    public String getcgsqsp(String id, Model model) {
        List<Caigoushenqing> cgsqList = caigoushenqingService.getCaiGouShengQingList(id);
        model.addAttribute("cgsq", cgsqList.get(0));
        List<Caigoushenqingshangping> cgsqspList = CaigoushenqingshangpingService.getCaigoushanpinxsList(id);
        model.addAttribute("cgsqspList", cgsqspList);
        return "caigouUpd";
    }

    public void riQi(String rqQi,String rqEr){

    }

    @RequestMapping("/caiGouShenQingDel")
    public Object caiGouShenQingDel(String ids) {
        try {
            if (caigoushenqingService.itriptxDeleteCaigoushenqingById(ids) > 0) {
                return "redirect:/caigou/caiGouShenQingSelect";
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        int[] sz1 = (int[]) sz;
//        for (int i=0;i<sz1.length;i++){
//            System.out.println(sz1[i]);
//        }
        return true;
    }
    @RequestMapping("/caiGouShenQingSelect")
    public Object caiGouShenQingSelect(@RequestParam(value = "id", required = false) Integer id,
                                       @RequestParam(value = "rqYi", required = false) String rqYi,
                                       @RequestParam(value = "rqEr", required = false) String rqEr,
                                       @RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex,
                                       Model model) {
        String er = rqEr == null ? DateUtil.getDefaultTime2DateStr(new Date()) : rqEr;
        String yi = rqYi == null ? DateUtil.getZhiJian(new Date()) : rqYi;
        PageHelper.startPage(pageIndex, 5);
        List<Caigoushenqing> list = caigoushenqingService.chaXun(id, yi, er);
        PageInfo<Caigoushenqing> ss = new PageInfo<Caigoushenqing>(list);
        model.addAttribute("pg", ss);
        model.addAttribute("rqYi", yi);
        model.addAttribute("rqEr",er);
        return "caigoushenqin";
    }

    //    public Object tianJia(Caigoushenqing caigoushenqing){
//
//    }
//@ResponseBody
//@RequestMapping("/caiGouChaXun")
//public Object caiGouChaXun(@RequestParam(value = "id",required = false)Integer id,
//                           @RequestParam(value = "gysId",required = false)Integer gysId,
//                     @RequestParam(value = "rqYi",required = false) String rqYi,
//                     @RequestParam(value = "rqEr",required = false)String rqEr,
//                     @RequestParam(value = "pageIndex",required = false,defaultValue = "1")Integer pageIndex){
//    PageHelper.startPage(pageIndex,5);
//    List<Caigoudingdan> list=caigoudingdanService.chaXun(null,gysId,rqYi,rqEr);
//    PageInfo<Caigoudingdan> ss = new PageInfo<Caigoudingdan>(list);
//    return ss;
//}
//    @ResponseBody
//    @RequestMapping("/shanChu")
//    public Object shanChu(Long id) {
//        try {
//            if (caigoushenqingService.itriptxDeleteCaigoushenqingById(id) > 0) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

//    @ResponseBody
    @RequestMapping("/caiGouTuiHuoSelect")
    public String caiGouTuiHuoSelect(@RequestParam(value = "pageIndex", defaultValue = "1", required = false)
                                             Integer pageIndex,
                                     @RequestParam(value = "rqYi", required = false) String rqYi,
                                     @RequestParam(value = "rqEr", required = false) String rqEr,
                                     @RequestParam(value = "gysId", required = false)
                                             Integer gysId,
                                     Model model) {
        String er = rqEr == null ? DateUtil.getDefaultTime2DateStr(new Date()) : rqEr;
        String yi = rqYi == null ? DateUtil.getZhiJian(new Date()) : rqYi;
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(pageIndex, 5);
        map.put("rqYi", yi);
        map.put("rqEr", er);
        map.put("gysId", gysId);
        List<Caigoutuihuo> list = caigoutuihuoService.chaXun(map);
        PageInfo<Caigoutuihuo> ss = new PageInfo<Caigoutuihuo>(list);
        model.addAttribute("pg",ss);
        model.addAttribute("rqYi", yi);
        model.addAttribute("rqEr", er);
        model.addAttribute("gysId", gysId);
        try {
            model.addAttribute("gysList",gongyingshangService.getGongyingshangListByMap(null));
        } catch (Exception e) {
            e.printStackTrace();
        }


        return "caigoudindangtuihuo";
    }

    @RequestMapping("/caiGouTuiHuoDel")
    public String caiGouTuiHuoDel(String ids ) {
        try {
            if (caigoutuihuoService.itriptxDeleteCaigoutuihuoById(ids) > 0) {
                return "redorect:/caigou/caiGouTuiHuoSelect";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/caiGouTuiHuoAdd")
    public String caiGouTuiHuoAdd(String ids,Model model ) {

        return "caigoudindanatuihuoadd";
    }

    @RequestMapping("/caiGouTuiHuoUpd/{id}")
    public String caiGouTuiHuoUpd(Integer id,Model model ) {

        return "caigoudindanatuihouUpd";
    }

//    @ResponseBody
//    @RequestMapping("/caiGouShanChu")
//    public Object caiGouShanChu(Long id) {
//        try {
//            if (caigoudingdanService.itriptxDeleteCaigoudingdanById(id) > 0) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    @GetMapping("/caiGouShenQingAdd")
    public Object caiGouShenQingAdd() {
        return "caigouadd";
    }

//    @PostMapping("/caiGouShenQingAdd")
//    @ResponseBody
//    public Object caiGouShenQingAdd(Caigoushenqing caigoushenqing) {
//        try {
//            if (caigoushenqingService.itriptxAddCaigoushenqing(caigoushenqing) > 0) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
    @PostMapping("/xiuGai")
    @ResponseBody
    public Object xiuGai(Caigoushenqing caigoushenqing) {
        try {
            if (caigoushenqingService.itriptxModifyCaigoushenqing(caigoushenqing) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    @GetMapping("/caiGouDingDanRuKuSelect")
//    @ResponseBody
    public Object caiGouDingDanRuKuSelect(@RequestParam(value = "id", required = false) Integer id,
                                    @RequestParam(value = "gysId", required = false) Integer gysId,
                                    @RequestParam(value = "rqYi", required = false) String rqYi,
                                    @RequestParam(value = "rqEr", required = false) String rqEr,
                                    @RequestParam(value = "pageIndex", required = false, defaultValue = "1")
                                                      Integer pageIndex,
                                          Model model) {
        String er = rqEr == null ? DateUtil.getDefaultTime2DateStr(new Date()) : rqEr;
        String yi = rqYi == null ? DateUtil.getZhiJian(new Date()) : rqYi;
        PageHelper.startPage(pageIndex, 5);
        List<Caigoudingdanruku> list = caigoudingdanrukuService.chaXun(id, gysId, yi, er);
        PageInfo<Caigoudingdanruku> ss = new PageInfo<Caigoudingdanruku>(list);
        model.addAttribute("pg",ss);
        model.addAttribute("gysId",gysId);
        try {
            model.addAttribute("gysList",gongyingshangService.getGongyingshangListByMap(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("rqYi",yi);
        model.addAttribute("rqEr",er);

        return "caigoudindangruku";
    }


//    @GetMapping("/caiGouDingDanRuKuShanChu")
//    @ResponseBody
//    public Object caiGouDingDanRuKuShanChu(@RequestParam("id") Long id) {
//        try {
//            if (caigoudingdanrukuService.itriptxDeleteCaigoudingdanrukuById(id) > 0) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    @PostMapping("/caiGouDingDanRuKuTianJia")
    @ResponseBody
    public Object caiGouDingDanRuKuTianJia(Caigoudingdanruku caigoudingdanruku) {
        try {
            if (caigoudingdanrukuService.itriptxAddCaigoudingdanruku(caigoudingdanruku) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @PostMapping("/caiGouDingDanRuKuXiuGai")
    @ResponseBody
    public Object caiGouDingDanRuKuXiuGai(Caigoudingdanruku caigoudingdanruku) {

        try {
            if (caigoudingdanrukuService.itriptxModifyCaigoudingdanruku(caigoudingdanruku) > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
//    public Object
//    @GetMapping("/yiBuXiuGai")
//    @ResponseBody
//    public Object yiBuXiuGai(Int){
//        try {
//            if(caigoudingdanrukuService.itriptxAddCaigoudingdanruku(caigoudingdanruku)>0){
//                return true;
//            }else{
//                return  false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return true;
//    }

    @GetMapping("/yiBuShanChu")
    @ResponseBody
    public Object yiBuShanChu(Integer id, Integer spId) {
        Map<String, Object> map = new HashMap<>();
        if (caigoudingdanshangpingService.shanChu(id, spId) > 0) {
            map.put("result", true);
        } else {
            map.put("result", false);
        }
        return map;
    }
//
//    @PostMapping("/caiGouDingDanRuKuTianJia")
//    @ResponseBody
//    public Object caiGouDingDanRuKuTianJia(List<Caigoudingdan>){
//
//    }

    @RequestMapping("/caigoudindanarukadd")
    public String caigoudindanarukadd(Model model) {
        try {
            model.addAttribute("caiGouList", caigoudingdanService.chaXunMeiYou(0));
            model.addAttribute("kuWeiList", kuweiService.getKuweiListByMap(null));
            model.addAttribute("yuanGongList", yuangongService.getYuangongListByMap(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "caigoudindanarukadd";
    }

    @RequestMapping("/caigoudindanarukTianJia")
    public String caigoudindanarukTianJia(Model model
            , Caigoudingdanruku caigoudingdanruku) {

        return "caigoudindanarukadd";
    }

    @ResponseBody
    @RequestMapping("/yiBuHuoQu")
    public Object yiBuHuoQu(Integer zhi) {
        Map<String, Object> map = new HashMap<>();
        List<Caigoudingdan> list = caigoudingdanService.chaXunMeiYou(zhi);
        map.put("result", list.get(0).getCaigoudingdanshangpings());
        map.put("name", list.get(0).getGongyingshang().getGysName());
        map.put(" ", list.get(0).getCgddZje());
        return map;
    }

//    @ResponseBody
//    @RequestMapping("/caiGouDingDanRuKuAdd")
//    public Object caiGouDingDanRuKuAdd(@RequestBody Caigoudingdanruku caigoudingdanruku
//            , @RequestBody String data) {
//
//        return null;
//    }


//    @ResponseBody
    @RequestMapping("/caiGouDingDanRuKuAdd")
    public String caiGouDingDanRuKuAdd(Model model) {
        return "caigoudindanarukadd";
    }
    @RequestMapping("/caiGouDingDanRuKuDel")
    public String caiGouDingDanRuKuDel(String ids) {
        try {
            if(caigoudingdanrukuService.itriptxDeleteCaigoudingdanrukuById(ids)>0){
                return "redirect:/caigou/caiGouDingDanRuKuSelect";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @RequestMapping("/caiGouDingDanRuKuUpd/{id}")
    public String caiGouDingDanRuKuUpd(Integer id) {
        return "caigoudindanarukUpd";
    }

//    @ResponseBody
    @GetMapping("/caiGouFuKuanSelect")
    public Object caiGouFuKuanSelect(
            @RequestParam(value = "rqYi", required = false) Date rqYi,
            @RequestParam(value = "rqEr", required = false) Date rqEr,
            @RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer
                    pageIndex
    ) {
        PageHelper.startPage(pageIndex, 5);
        List<Caigoufukuandan> list = caigoufukuandanService.chaXun(rqYi, rqEr);
        PageInfo<Caigoufukuandan> ss = new PageInfo<Caigoufukuandan>(list);
        return ss;
    }

    @ResponseBody
    @GetMapping("/caiGouFuKuanDel")
    public Object caiGouFuKuanDel(
            Integer id
    ) {
        if (caigoufukuandanService.shanChu(id) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("/caiGouDingDanSelect")
    public Object caiGouDingDanSelect(@RequestParam(value = "pageIndex", defaultValue = "1", required = false)
                                              Integer pageIndex,
                                      @RequestParam(value = "rqYi", required = false) String rqYi,
                                      @RequestParam(value = "rqEr", required = false) String rqEr,
                                      @RequestParam(value = "gysId", required = false)
                                              Integer gysId,
                                      Model model) {
        PageHelper.startPage(1, 5);

        String er = rqEr == null ? DateUtil.getDefaultTime2DateStr(new Date()) : rqEr;
        String yi = rqYi == null ? DateUtil.getZhiJian(new Date()) : rqYi;
        caigoudingdanService.chaXun(null, gysId, yi, er);
        List<Caigoudingdan> list = caigoudingdanService.chaXun(null, gysId, yi, er);
        PageInfo<Caigoudingdan> ss = new PageInfo<Caigoudingdan>(list);
        model.addAttribute("pg", ss);
        try {
            model.addAttribute("gysId", gysId);
            model.addAttribute("rqYi", yi);
            model.addAttribute("rqEr", er);
            model.addAttribute("gysList", gongyingshangService.getGongyingshangListByMap(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "caigoudingdan";
    }

    @RequestMapping("/caiGouDingDanDel")
//    @ResponseBody
    public Object caiGouDingDanDel(String ids) {
        try {
            if (caigoudingdanService.itriptxDeleteCaigoudingdanById(ids) > 0) {
                return "redirect:/caigou/caiGouDingDanSelect";
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        int[] sz1 = (int[]) sz;
//        for (int i=0;i<sz1.length;i++){
//            System.out.println(sz1[i]);
//        }
        return true;
    }

    public void gongGong(Model model){
        try {
            model.addAttribute("zuiDaZhi","CGDD"+ DateUtil.yueNianRi(new Date())+"000"+ caigoudingdanService.zuiDaZhi());
            model.addAttribute("gongyingshangList",gongyingshangService.getGongyingshangListByMap(null));
            model.addAttribute("yuangongList",yuangongService.getYuangongListByMap(null));
            model.addAttribute("kuweiList",kuweiService.getKuweiListByMap(null));
            model.addAttribute("riQi",DateUtil.getDefaultTime2DateStr(new Date()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/caiGouDingDanUpd/{id}")
    public String caiGouDingDanUpd(Model model,Integer id){
        model.addAttribute("caiGouDingDan",caigoudingdanService.chaXun(id,null,null,null).get(0));
        this.gongGong(model);
        return "caigoudindanUpd";
    }
    @RequestMapping("/caiGouDingDanAdd")
    public String caiGouDingDanAdd(Model model){
        try {
//            model.addAttribute("shangpingList",shangpingService.chaXun());
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("weiYinYongList",caigoushenqingService.weiYinYong(null));
        this.gongGong(model);
        return "caigoudindanadd";
    }


    @ResponseBody
    @RequestMapping("/yiBuShangPing")
    public Object yiBuShangPing(Integer id){
        Map<String, Object> map = new HashMap<>();
        List<Caigoushenqing> list = caigoushenqingService.weiYinYong(id);
        map.put("result",list.get(0).getCaigoushenqingshangpingList());
        System.out.println(list.get(0).getCaigoushenqingshangpingList().get(0).getCgsqId());
        return map;
    }
}
