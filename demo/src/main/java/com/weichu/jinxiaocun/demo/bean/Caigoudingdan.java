package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoudingdan implements Serializable {
        //采购订单id
        private Integer cgddId;
        //订单编号
        private String cgddBh;
        //供应商表id外键
        private Integer gysId;
        //员工表id外键
        private Integer ygId;
        //订单的日期
        private Date cgddDdrq;
        //预计付款日期
        private Date cgddJhrq;
        //计划到货日期
        private Date cgddDhrq;
        //预付款
        private double cgddYfk;
        //仓库表id外键
        private Integer kwId;
        //是否已经入库
        private Integer cgddRk;
        //备注
        private String cgddBz;
        //get set 方法
            public void setCgddId (Integer  cgddId){
                this.cgddId=cgddId;
            }
            public  Integer getCgddId(){
                return this.cgddId;
            }
            public void setCgddBh (String  cgddBh){
                this.cgddBh=cgddBh;
            }
            public  String getCgddBh(){
                return this.cgddBh;
            }
            public void setGysId (Integer  gysId){
                this.gysId=gysId;
            }
            public  Integer getGysId(){
                return this.gysId;
            }
            public void setYgId (Integer  ygId){
                this.ygId=ygId;
            }
            public  Integer getYgId(){
                return this.ygId;
            }
            public void setCgddDdrq (Date  cgddDdrq){
                this.cgddDdrq=cgddDdrq;
            }
            public  Date getCgddDdrq(){
                return this.cgddDdrq;
            }
            public void setCgddJhrq (Date  cgddJhrq){
                this.cgddJhrq=cgddJhrq;
            }
            public  Date getCgddJhrq(){
                return this.cgddJhrq;
            }
            public void setCgddDhrq (Date  cgddDhrq){
                this.cgddDhrq=cgddDhrq;
            }
            public  Date getCgddDhrq(){
                return this.cgddDhrq;
            }
            public void setCgddYfk (double  cgddYfk){
                this.cgddYfk=cgddYfk;
            }
            public  double getCgddYfk(){
                return this.cgddYfk;
            }
            public void setKwId (Integer  kwId){
                this.kwId=kwId;
            }
            public  Integer getKwId(){
                return this.kwId;
            }
            public void setCgddRk (Integer  cgddRk){
                this.cgddRk=cgddRk;
            }
            public  Integer getCgddRk(){
                return this.cgddRk;
            }
            public void setCgddBz (String  cgddBz){
                this.cgddBz=cgddBz;
            }
            public  String getCgddBz(){
                return this.cgddBz;
            }
}
