package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoushenqing implements Serializable {
        //采购申请单id
        private Integer cgsqId;
        //流水号（按当前日期加上当第几张表）
        private String cgsqXh;
        //采购员id
        private Integer ygId;
        //申请日期
        private Date cgsqRq;
        //期限
        private Date cgsqQx;
        //审核情况
        private Integer cgsqSh;
        //总金额
        private double cgsqZje;
        //备注
        private String cgsqBz;
        //get set 方法
        public void setCgsqId (Integer  cgsqId){
            this.cgsqId=cgsqId;
        }
        public  Integer getCgsqId(){
            return this.cgsqId;
        }
        public void setCgsqXh (String  cgsqXh){
            this.cgsqXh=cgsqXh;
        }
        public  String getCgsqXh(){
            return this.cgsqXh;
        }
        public void setYgId (Integer  ygId){
            this.ygId=ygId;
        }
        public  Integer getYgId(){
            return this.ygId;
        }
        public void setCgsqRq (Date  cgsqRq){
            this.cgsqRq=cgsqRq;
        }
        public  Date getCgsqRq(){
            return this.cgsqRq;
        }
        public void setCgsqQx (Date  cgsqQx){
            this.cgsqQx=cgsqQx;
        }
        public  Date getCgsqQx(){
            return this.cgsqQx;
        }
        public void setCgsqSh (Integer  cgsqSh){
            this.cgsqSh=cgsqSh;
        }
        public  Integer getCgsqSh(){
            return this.cgsqSh;
        }
        public void setCgsqZje (double  cgsqZje){
            this.cgsqZje=cgsqZje;
        }
        public  double getCgsqZje(){
            return this.cgsqZje;
        }
        public void setCgsqBz (String  cgsqBz){
            this.cgsqBz=cgsqBz;
        }
        public  String getCgsqBz(){
            return this.cgsqBz;
        }
}
