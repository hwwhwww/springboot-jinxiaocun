package com.weichu.jinxiaocun.demo.component.security;
import com.weichu.jinxiaocun.demo.bean.Juese;
import com.weichu.jinxiaocun.demo.bean.Ziyuan;
import com.weichu.jinxiaocun.demo.service.ziyuan.ZiyuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

@Component
public class CustomMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Autowired
    ZiyuanService ziyuanService;

    AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        try {
            List<Ziyuan> ziyuanList = ziyuanService.allZiYuan();
            for (Ziyuan ziyuan : ziyuanList) {
                if (antPathMatcher.match(ziyuan.getZyUrl(), requestUrl) && ziyuan.getJueses().size() > 0) {
                    List<Juese> jueses = ziyuan.getJueses();
                    int size = jueses.size();
                    String[] values = new String[size];
                    for (int i = 0; i < size; i++) {
                        values[i] = jueses.get(i).getJsName();
                    }
                    return SecurityConfig.createList(values);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }

}
