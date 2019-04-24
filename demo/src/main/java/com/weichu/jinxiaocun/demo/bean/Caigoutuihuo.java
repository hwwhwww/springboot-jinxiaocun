package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoutuihuo implements Serializable {
        //退货id
        private Integer cgthId;
        //退货编号
        private String cgthBh;
        //仓库表id外键
        private Integer kwId;
        //退货日期
        private Date cgthThrq;
        //退款日期
        private Date cgthTkrq;
        //总金额
        private double cgthZje;
        //备注
        private String cgthBz;
        //get set 方法
            public void setCgthId (Integer  cgthId){
                this.cgthId=cgthId;
            }
            public  Integer getCgthId(){
                return this.cgthId;
            }
            public void setCgthBh (String  cgthBh){
                this.cgthBh=cgthBh;
            }
            public  String getCgthBh(){
                return this.cgthBh;
            }
            public void setKwId (Integer  kwId){
                this.kwId=kwId;
            }
            public  Integer getKwId(){
                return this.kwId;
            }
            public void setCgthThrq (Date  cgthThrq){
                this.cgthThrq=cgthThrq;
            }
            public  Date getCgthThrq(){
                return this.cgthThrq;
            }
            public void setCgthTkrq (Date  cgthTkrq){
                this.cgthTkrq=cgthTkrq;
            }
            public  Date getCgthTkrq(){
                return this.cgthTkrq;
            }
            public void setCgthZje (double  cgthZje){
                this.cgthZje=cgthZje;
            }
            public  double getCgthZje(){
                return this.cgthZje;
            }
            public void setCgthBz (String  cgthBz){
                this.cgthBz=cgthBz;
            }
            public  String getCgthBz(){
                return this.cgthBz;
            }
}
