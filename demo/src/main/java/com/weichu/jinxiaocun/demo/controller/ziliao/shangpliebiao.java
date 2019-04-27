package com.weichu.jinxiaocun.demo.controller.ziliao;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weichu.jinxiaocun.demo.bean.Danwei;
import com.weichu.jinxiaocun.demo.bean.Shangpingleibie;
import com.weichu.jinxiaocun.demo.service.shangpingleibie.ShangpingleibieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ziliao")
public class shangpliebiao {
    @Autowired
    ShangpingleibieService shangpingleibieService;

    /**
     * 分页过程
     * @return
     */
/*    @ResponseBody
    @RequestMapping("/zhi")
    public PageInfo chuxian(){
        Map<String,Object> map=new HashMap<String, Object>();
        PageHelper.startPage(1,2);
        try {
            List<Shangpingleibie> list= shangpingleibieService.getShangpingleibieListByMap(map);
            PageInfo<Shangpingleibie> pageInfo = new PageInfo<Shangpingleibie>(list);
            return pageInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
    //查询
    @RequestMapping("/shanpleibie")
    public String shanpleibie(Integer splb_id, String splb_name, Model model,Integer pageNo){

        if(pageNo==null){
            pageNo=1;
        }
        Map<String, Object> a = new HashMap<String, Object>();
        PageHelper.startPage(pageNo,2);
        if(splb_id!=null&&splb_id!=0){
            a.put("splb_id",splb_id);
        } if(splb_name!=null){
            a.put("splb_name",splb_name);
        }
        List<Shangpingleibie> dwList = new ArrayList<Shangpingleibie>();
        try {
            dwList = shangpingleibieService.getShangpingleibieListByMap(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        PageInfo<Shangpingleibie> pageInfo = new PageInfo<Shangpingleibie>(dwList);
        model.addAttribute("pageInfo",pageInfo);
        return "shanpleibie";
    }
}
