package com.weichu.jinxiaocun.demo.controller.ziliao;


import com.weichu.jinxiaocun.demo.bean.Kuwei;
import com.weichu.jinxiaocun.demo.bean.Shangping;
import com.weichu.jinxiaocun.demo.service.kuwei.KuweiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ziliao")
public class chankiguanli {
    @Resource
    private KuweiService kuweiService;
    //查询
    @RequestMapping("/chankuguanl")
    public String shanpleibie(Model model){
        Map<String, Object> a = new HashMap<String, Object>();

        List<Kuwei> dwList = new ArrayList<Kuwei>();
        try {
            dwList = kuweiService.getKuweiListByMap(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("dwList",dwList);
        return "chankuguanl";
    }

}
