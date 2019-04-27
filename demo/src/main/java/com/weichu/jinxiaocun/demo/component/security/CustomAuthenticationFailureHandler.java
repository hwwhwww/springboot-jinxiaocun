package com.weichu.jinxiaocun.demo.component.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        Map<String, Object> map = new HashMap<>();
        map.put("loginState", "false");
        if (e instanceof BadCredentialsException || e instanceof UsernameNotFoundException) {
            map.put("msg", "账号名或者密码输入错误！");
        } else if (e instanceof LockedException) {
            map.put("msg", "账户被锁定，请联系管理员！");
        } else if (e instanceof CredentialsExpiredException) {
            map.put("msg", "密码过期，请联系管理员！");
        } else if (e instanceof AccountExpiredException) {
            map.put("msg", "账户过期，请联系管理员！");
        } else if (e instanceof DisabledException) {
            map.put("msg", "账户被禁用，请联系管理员！");
        } else {
            map.put("msg", "登陆失败！");
        }
        ObjectMapper om = new ObjectMapper();
        PrintWriter out = response.getWriter();
        out.write(om.writeValueAsString(map));
        out.flush();
        out.close();
    }

}
