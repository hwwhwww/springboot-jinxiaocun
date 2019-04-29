package com.weichu.jinxiaocun.demo.controller.ziliao;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weichu.jinxiaocun.demo.bean.Kuwei;
import com.weichu.jinxiaocun.demo.bean.Shangping;
import com.weichu.jinxiaocun.demo.service.kuwei.KuweiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.sql.SQLIntegrityConstraintViolationException;
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
    public String shanpleibie(Model model,@RequestParam(defaultValue = "1") Integer pageIndex){
        Map<String, Object> a = new HashMap<String, Object>();
        PageHelper.startPage(pageIndex,4);
        List<Kuwei> dwList = new ArrayList<Kuwei>();
        try {
            dwList = kuweiService.getKuweiListByMap(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        PageInfo<Kuwei> pageInfo = new PageInfo<Kuwei>(dwList);
        model.addAttribute("pg",pageInfo);
        return "chankuguanl";
    }
    //添加
    @RequestMapping("chankuguanlAdd")
    public String chankuguanlAd(Kuwei kuwei){

        try {
            kuweiService.itriptxAddKuwei(kuwei);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  "redirect:chankuguanl";
    }
    //删除
    @RequestMapping("/chuankuguanlidelete")
    public String chuankuguanlidelete(@RequestParam("kwId")String kwId,Model model){
        int jg = 0;
        try {
            jg = kuweiService.itriptxDeleteKuweiById(Long.parseLong(kwId));
            if (jg > 0) {
                model.addAttribute("msg", "删除成功");

            }
        } catch (SQLIntegrityConstraintViolationException e1)
        {
            model.addAttribute("ex","本地仓库不能删除");
            System.out.println("本地仓库不能删除");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:chankuguanl";
    }

}
