package com.weichu.jinxiaocun.demo.bean;

import java.io.Serializable;
import java.util.List;

/**
 *  资源表
 */
public class Ziyuan implements Serializable {
    //序号
    private Integer zyId;
    //url地址
    private String zyUrl;
    //名称
    private String zyName;
    //父级ID
    private Integer zyFlId;
    //状态
    private Integer zyZt;

    private List<Juese> jueses;

    //get set 方法
    public void setZyId(Integer zyId) {
        this.zyId = zyId;
    }

    public Integer getZyId() {
        return this.zyId;
    }

    public void setZyUrl(String zyUrl) {
        this.zyUrl = zyUrl;
    }

    public String getZyUrl() {
        return this.zyUrl;
    }

    public void setZyName(String zyName) {
        this.zyName = zyName;
    }

    public String getZyName() {
        return this.zyName;
    }

    public void setZyFlId(Integer zyFlId) {
        this.zyFlId = zyFlId;
    }

    public Integer getZyFlId() {
        return this.zyFlId;
    }

    public void setZyZt(Integer zyZt) {
        this.zyZt = zyZt;
    }

    public Integer getZyZt() {
        return this.zyZt;
    }

    public List<Juese> getJueses() {
        return jueses;
    }

    public void setJueses(List<Juese> jueses) {
        this.jueses = jueses;
    }

}
