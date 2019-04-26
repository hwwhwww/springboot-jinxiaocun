package com.weichu.jinxiaocun.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {



    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/chukumingxi")
    public String chukumingxi(){
        return "chukumingxi";
    }
    @RequestMapping("/diaobomingxi")
    public String diaobomingxi(){
        return "diaobomingxi";
    }
    @RequestMapping("/kucunchaxun")
    public String kucunchaxun(){
        return "kucunchaxun";
    }
    @RequestMapping("/kucunshangpingbaojing")
    public String kucunshangpingbaojing(){
        return "kucunshangpingbaojing";
    }
    @RequestMapping("/rukumingxi")
    public String rukumingxi(){
        return "rukumingxi";
    }

    @RequestMapping("/caigoushenqin")
    public String caigoushenqin(){
        return "caigoushenqin";
    }
    @RequestMapping("/caigoudingdan")
    public String caigoudingdan(){
        return "caigoudingdan";
    }
    @RequestMapping("/caigoudindangruku")
    public String caigoudindangruku(){
        return "caigoudindangruku";
    }
    @RequestMapping("/caigoudindangtuihuo")
    public String caigoudindangtuihuo(){
        return "caigoudindangtuihuo";
    }


    @RequestMapping("/ruku")
    public String ruku(){
        return "ruku";
    }
    @RequestMapping("/chuku")
    public String chuku(){
        return "chuku";
    }
    @RequestMapping("/diaobo")
    public String diaobo(){
        return "diaobo";
    }


    @RequestMapping("/chankuguanl")
    public String chankuguanl(){
        return "chankuguanl";
    }
    @RequestMapping("/cuqikuc")
    public String cuqikuc(){
        return "cuqikuc";
    }
    @RequestMapping("/gysh")
    public String gysh(){
        return "gysh";
    }
    @RequestMapping("/jiliandwei")
    public String jiliandwei(){
        return "jiliandwei";
    }
    @RequestMapping("/kehui")
    public String kehui(){
        return "kehui";
    }
    @RequestMapping("/kehuizhil")
    public String kehuizhil(){
        return "kehuizhil";
    }
    @RequestMapping("/shangpguanli")
    public String shangpguanli(){
        return "shangpguanli";
    }
    @RequestMapping("/shanpleibie")
    public String shanpleibie(){
        return "shanpleibie";
    }

}
