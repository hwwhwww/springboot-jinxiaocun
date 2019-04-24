package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   出库明细表
*/
public class Chukumingxi implements Serializable {
        //序号
        private Integer ckmxId;
        //商品出库编号
        private String ckmxBh;
        //商品编号
        private Integer spId;
        //商品名称
        private String ckmxSpmc;
        //计量单位
        private Integer dwId;
        //单价
        private double ckmxDj;
        //数量
        private Integer ckmxSl;
        //总金额
        private double ckmxZje;
        //备注
        private String ckmxBz;
        //get set 方法
        public void setCkmxId (Integer  ckmxId){
            this.ckmxId=ckmxId;
        }
        public  Integer getCkmxId(){
            return this.ckmxId;
        }
        public void setCkmxBh (String  ckmxBh){
            this.ckmxBh=ckmxBh;
        }
        public  String getCkmxBh(){
            return this.ckmxBh;
        }
        public void setSpId (Integer  spId){
            this.spId=spId;
        }
        public  Integer getSpId(){
            return this.spId;
        }
        public void setCkmxSpmc (String  ckmxSpmc){
            this.ckmxSpmc=ckmxSpmc;
        }
        public  String getCkmxSpmc(){
            return this.ckmxSpmc;
        }
        public void setDwId (Integer  dwId){
            this.dwId=dwId;
        }
        public  Integer getDwId(){
            return this.dwId;
        }
        public void setCkmxDj (double  ckmxDj){
            this.ckmxDj=ckmxDj;
        }
        public  double getCkmxDj(){
            return this.ckmxDj;
        }
        public void setCkmxSl (Integer  ckmxSl){
            this.ckmxSl=ckmxSl;
        }
        public  Integer getCkmxSl(){
            return this.ckmxSl;
        }
        public void setCkmxZje (double  ckmxZje){
            this.ckmxZje=ckmxZje;
        }
        public  double getCkmxZje(){
            return this.ckmxZje;
        }
        public void setCkmxBz (String  ckmxBz){
            this.ckmxBz=ckmxBz;
        }
        public  String getCkmxBz(){
            return this.ckmxBz;
        }
}
