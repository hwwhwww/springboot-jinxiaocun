package com.weichu.jinxiaocun.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @ResponseBody
    @RequestMapping("/login_p")
    public String login() {
        return "<script>location.href='/login.html';</script>";
    }


}
