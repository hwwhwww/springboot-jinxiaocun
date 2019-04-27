package com.weichu.jinxiaocun.demo.service.yonghu;

import com.weichu.jinxiaocun.demo.bean.Yonghu;
import com.weichu.jinxiaocun.demo.mapper.yonghu.YonghuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl  implements UserDetailsService {

    @Autowired
    YonghuMapper yonghuMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Yonghu yonghu = yonghuMapper.loadUserByUsername(s);
        if (yonghu == null) {
            throw new UsernameNotFoundException("用户名不能为空");
        }
        return yonghu;
    }

}
