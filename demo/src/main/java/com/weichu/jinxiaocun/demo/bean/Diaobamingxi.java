package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   调拨明细表
*/
public class Diaobamingxi implements Serializable {
        //序号
        private Integer dbmxId;
        //调拨单号
        private String dbmxDh;
        //商品id
        private Integer spId;
        //名称
        private String dbmxName;
        //计量单位id
        private Integer dwId;
        //单价
        private double dbmxDj;
        //数量
        private Integer dbmxSl;
        //总金额
        private double dbmxZje;
        //备注
        private String dbmxBz;
        //get set 方法
        public void setDbmxId (Integer  dbmxId){
            this.dbmxId=dbmxId;
        }
        public  Integer getDbmxId(){
            return this.dbmxId;
        }
        public void setDbmxDh (String  dbmxDh){
            this.dbmxDh=dbmxDh;
        }
        public  String getDbmxDh(){
            return this.dbmxDh;
        }
        public void setSpId (Integer  spId){
            this.spId=spId;
        }
        public  Integer getSpId(){
            return this.spId;
        }
        public void setDbmxName (String  dbmxName){
            this.dbmxName=dbmxName;
        }
        public  String getDbmxName(){
            return this.dbmxName;
        }
        public void setDwId (Integer  dwId){
            this.dwId=dwId;
        }
        public  Integer getDwId(){
            return this.dwId;
        }
        public void setDbmxDj (double  dbmxDj){
            this.dbmxDj=dbmxDj;
        }
        public  double getDbmxDj(){
            return this.dbmxDj;
        }
        public void setDbmxSl (Integer  dbmxSl){
            this.dbmxSl=dbmxSl;
        }
        public  Integer getDbmxSl(){
            return this.dbmxSl;
        }
        public void setDbmxZje (double  dbmxZje){
            this.dbmxZje=dbmxZje;
        }
        public  double getDbmxZje(){
            return this.dbmxZje;
        }
        public void setDbmxBz (String  dbmxBz){
            this.dbmxBz=dbmxBz;
        }
        public  String getDbmxBz(){
            return this.dbmxBz;
        }
}
