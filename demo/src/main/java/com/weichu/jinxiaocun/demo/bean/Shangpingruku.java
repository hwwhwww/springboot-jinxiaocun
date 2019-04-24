package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   商品入库表
*/
public class Shangpingruku implements Serializable {
        //序号
        private Integer sprkId;
        //商品入库编号
        private String sprkBh;
        //入库日期
        private Date sprkSj;
        //收入库位id
        private Integer kwId;
        //收货人
        private String sprkSohr;
        //操作员
        private String sprkCzy;
        //审核标志
        private Integer sprkShbz;
        //审核人
        private String sprkShr;
        //审核日期
        private Date sprkShsj;
        //总金额
        private double sprkZje;
        //备注
        private String sprkBz;
        //供应商id
        private Integer gysId;
        //get set 方法
            public void setSprkId (Integer  sprkId){
                this.sprkId=sprkId;
            }
            public  Integer getSprkId(){
                return this.sprkId;
            }
            public void setSprkBh (String  sprkBh){
                this.sprkBh=sprkBh;
            }
            public  String getSprkBh(){
                return this.sprkBh;
            }
            public void setSprkSj (Date  sprkSj){
                this.sprkSj=sprkSj;
            }
            public  Date getSprkSj(){
                return this.sprkSj;
            }
            public void setKwId (Integer  kwId){
                this.kwId=kwId;
            }
            public  Integer getKwId(){
                return this.kwId;
            }
            public void setSprkSohr (String  sprkSohr){
                this.sprkSohr=sprkSohr;
            }
            public  String getSprkSohr(){
                return this.sprkSohr;
            }
            public void setSprkCzy (String  sprkCzy){
                this.sprkCzy=sprkCzy;
            }
            public  String getSprkCzy(){
                return this.sprkCzy;
            }
            public void setSprkShbz (Integer  sprkShbz){
                this.sprkShbz=sprkShbz;
            }
            public  Integer getSprkShbz(){
                return this.sprkShbz;
            }
            public void setSprkShr (String  sprkShr){
                this.sprkShr=sprkShr;
            }
            public  String getSprkShr(){
                return this.sprkShr;
            }
            public void setSprkShsj (Date  sprkShsj){
                this.sprkShsj=sprkShsj;
            }
            public  Date getSprkShsj(){
                return this.sprkShsj;
            }
            public void setSprkZje (double  sprkZje){
                this.sprkZje=sprkZje;
            }
            public  double getSprkZje(){
                return this.sprkZje;
            }
            public void setSprkBz (String  sprkBz){
                this.sprkBz=sprkBz;
            }
            public  String getSprkBz(){
                return this.sprkBz;
            }
            public void setGysId (Integer  gysId){
                this.gysId=gysId;
            }
            public  Integer getGysId(){
                return this.gysId;
            }
}
