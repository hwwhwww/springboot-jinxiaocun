package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoudingdanruku implements Serializable {
        //采购订单入库id
        private Integer cgddrkId;
        //采购订单入库编号
        private String cgddrkBh;
        //成功订单表id
        private Integer cgddId;
        //员工表id
        private Integer ygId;
        //仓库表id
        private Integer kwId;
        //入库日期
        private Date cgddrkRq;
        //总金额
        private double cgddrkZje;
        //get set 方法
            public void setCgddrkId (Integer  cgddrkId){
                this.cgddrkId=cgddrkId;
            }
            public  Integer getCgddrkId(){
                return this.cgddrkId;
            }
            public void setCgddrkBh (String  cgddrkBh){
                this.cgddrkBh=cgddrkBh;
            }
            public  String getCgddrkBh(){
                return this.cgddrkBh;
            }
            public void setCgddId (Integer  cgddId){
                this.cgddId=cgddId;
            }
            public  Integer getCgddId(){
                return this.cgddId;
            }
            public void setYgId (Integer  ygId){
                this.ygId=ygId;
            }
            public  Integer getYgId(){
                return this.ygId;
            }
            public void setKwId (Integer  kwId){
                this.kwId=kwId;
            }
            public  Integer getKwId(){
                return this.kwId;
            }
            public void setCgddrkRq (Date  cgddrkRq){
                this.cgddrkRq=cgddrkRq;
            }
            public  Date getCgddrkRq(){
                return this.cgddrkRq;
            }
            public void setCgddrkZje (double  cgddrkZje){
                this.cgddrkZje=cgddrkZje;
            }
            public  double getCgddrkZje(){
                return this.cgddrkZje;
            }
}
