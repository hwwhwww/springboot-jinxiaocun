package com.weichu.jinxiaocun.demo.controller.caigou;

import com.weichu.jinxiaocun.demo.bean.Caigoushenqing;
import com.weichu.jinxiaocun.demo.bean.Caigoushenqingshangping;
import com.weichu.jinxiaocun.demo.service.caigoushenqing.CaigoushenqingService;
import com.weichu.jinxiaocun.demo.service.caigoushenqingshangping.CaigoushenqingshangpingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CaiGouController {

    @Autowired
    CaigoushenqingService caigoushenqingService;

    @Autowired
    CaigoushenqingshangpingService CaigoushenqingshangpingService;


    @RequestMapping("/caigoushengqin")
    public String getcaigouminxi(@RequestParam(value = "caigouid",required = false)String caigouid,Model model){
        List<Caigoushenqing> cgsqList=caigoushenqingService.getCaiGouShengQingList(null);
        model.addAttribute("cgsqList",cgsqList);

        return "caigoushenqin";
    }

    @RequestMapping("/caigoushengUpd")
    public String getcgsqsp(@RequestParam(value = "cgsqId")String cgsqId,Model model){
        List<Caigoushenqing> cgsqList=caigoushenqingService.getCaiGouShengQingList(cgsqId);
        model.addAttribute("cgsq",cgsqList.get(0));
        List<Caigoushenqingshangping> cgsqspList=CaigoushenqingshangpingService.getCaigoushanpinxsList(cgsqId);
        model.addAttribute("cgsqspList",cgsqspList);
        return "caigouUpd";
    }

}
