package com.weichu.jinxiaocun.demo.config;

import com.weichu.jinxiaocun.demo.component.security.*;
import com.weichu.jinxiaocun.demo.service.yonghu.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Autowired
    CustomMetadataSource metadataSource;

    @Autowired
    UrlAccessDecisionManager urlAccessDecisionManager;

    @Autowired
    AuthenticationAccessDeniedHandler deniedHandler;

    @Autowired
    CustomAuthenticationFailureHandler authenticationFailureHandler;

    @Autowired
    CustomAuthenticationSuccessHandler authenticationSuccessHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/*.html")
                .antMatchers("/css/**")
                .antMatchers("/fonts/**")
                .antMatchers("/img/**")
                .antMatchers("/js/**")
                .antMatchers("/login_p");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {

                    @Override
                    public <O extends FilterSecurityInterceptor> O postProcess(O o) {
                        o.setSecurityMetadataSource(metadataSource);
                        o.setAccessDecisionManager(urlAccessDecisionManager);
                        return o;
                    }

                })
                .and()
                .formLogin()
                .loginPage("/login_p")
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .failureHandler(authenticationFailureHandler)
                .successHandler(authenticationSuccessHandler)
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .csrf()
                .disable()
                .exceptionHandling()
                .accessDeniedHandler(deniedHandler);
    }

}
