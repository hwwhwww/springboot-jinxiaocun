//package com.weichu.jinxiaocun.demo.bean;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Date;
//import java.util.List;
//
///**
// *  用户表
// */
//public class Yonghu implements UserDetails {
//    //序号
//    private Integer yhId;
//    //用户名
//    private String yhYhm;
//    //密码
//    private String yhMm;
//    //姓名
//    private String yhXm;
//    //性别
//    private String yhXb;
//    //电话
//    private String yhDh;
//    //邮箱
//    private String yhYx;
//    //地址
//    private String yhDz;
//    //时间
//    private Date yhSj;
//    //qq
//    private String yhQq;
//    //状态
//    private Integer yhZt;
//    //说明
//    private String yhMs;
//
//    private List<Juese> jueses;
//
//    //get set 方法
//    public void setYhId(Integer yhId) {
//        this.yhId = yhId;
//    }
//
//    public Integer getYhId() {
//        return this.yhId;
//    }
//
//    public void setYhYhm(String yhYhm) {
//        this.yhYhm = yhYhm;
//    }
//
//    public void setYhMm(String yhMm) {
//        this.yhMm = yhMm;
//    }
//
//    public void setYhXm(String yhXm) {
//        this.yhXm = yhXm;
//    }
//
//    public String getYhXm() {
//        return this.yhXm;
//    }
//
//    public void setYhXb(String yhXb) {
//        this.yhXb = yhXb;
//    }
//
//    public String getYhXb() {
//        return this.yhXb;
//    }
//
//    public void setYhDh(String yhDh) {
//        this.yhDh = yhDh;
//    }
//
//    public String getYhDh() {
//        return this.yhDh;
//    }
//
//    public void setYhYx(String yhYx) {
//        this.yhYx = yhYx;
//    }
//
//    public String getYhYx() {
//        return this.yhYx;
//    }
//
//    public void setYhDz(String yhDz) {
//        this.yhDz = yhDz;
//    }
//
//    public String getYhDz() {
//        return this.yhDz;
//    }
//
//    public void setYhSj(Date yhSj) {
//        this.yhSj = yhSj;
//    }
//
//    public Date getYhSj() {
//        return this.yhSj;
//    }
//
//    public void setYhQq(String yhQq) {
//        this.yhQq = yhQq;
//    }
//
//    public String getYhQq() {
//        return this.yhQq;
//    }
//
//    public void setYhZt(Integer yhZt) {
//        this.yhZt = yhZt;
//    }
//
//    public Integer getYhZt() {
//        return this.yhZt;
//    }
//
//    public void setYhMs(String yhMs) {
//        this.yhMs = yhMs;
//    }
//
//    public String getYhMs() {
//        return this.yhMs;
//    }
//
//    public List<Juese> getJueses() {
//        return jueses;
//    }
//
//    public void setJueses(List<Juese> jueses) {
//        this.jueses = jueses;
//    }
//
//    @JsonIgnore
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        for (Juese juese : jueses) {
//            authorities.add(new SimpleGrantedAuthority(juese.getJsName()));
//        }
//        return authorities;
//    }
//
//    @JsonIgnore
//    @Override
//    public String getPassword() {
//        return yhMm;
//    }
//
//    @Override
//    public String getUsername() {
//        return yhYhm;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isEnabled() {
//        return this.yhZt == 1 ? true : false;
//    }
//
//}
