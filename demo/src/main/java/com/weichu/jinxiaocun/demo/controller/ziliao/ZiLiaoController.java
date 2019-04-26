package com.weichu.jinxiaocun.demo.controller.ziliao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weichu.jinxiaocun.demo.bean.Shangpingleibie;
import com.weichu.jinxiaocun.demo.service.shangpingleibie.ShangpingleibieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ziliao")
public class ZiLiaoController {

    @Autowired
    ShangpingleibieService shangpingleibieService;

    /**
     * 分页过程
     * @return
     */
    @ResponseBody
    @RequestMapping("/zhi")
    public PageInfo chuxian(){
        Map<String,Object> map=new HashMap<>();
        PageHelper.startPage(1,2);
        try {
            List<Shangpingleibie> list= shangpingleibieService.getShangpingleibieListByMap(map);
            PageInfo<Shangpingleibie> pageInfo = new PageInfo<Shangpingleibie>(list);
           return pageInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
