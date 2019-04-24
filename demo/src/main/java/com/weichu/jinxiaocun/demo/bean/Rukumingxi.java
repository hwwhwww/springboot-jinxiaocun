package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   入库明细表
*/
public class Rukumingxi implements Serializable {
        //序号
        private Integer rkmxId;
        //商品入库编号
        private String rkmxBh;
        //商品编号
        private Integer spId;
        //商品名称
        private String rkmxSpmc;
        //计量单位
        private Integer dwId;
        //单价
        private double rkmxDj;
        //数量
        private Integer rkmxSl;
        //总金额
        private double rkmxZje;
        //备注
        private String rkmxBz;
        //get set 方法
        public void setRkmxId (Integer  rkmxId){
            this.rkmxId=rkmxId;
        }
        public  Integer getRkmxId(){
            return this.rkmxId;
        }
        public void setRkmxBh (String  rkmxBh){
            this.rkmxBh=rkmxBh;
        }
        public  String getRkmxBh(){
            return this.rkmxBh;
        }
        public void setSpId (Integer  spId){
            this.spId=spId;
        }
        public  Integer getSpId(){
            return this.spId;
        }
        public void setRkmxSpmc (String  rkmxSpmc){
            this.rkmxSpmc=rkmxSpmc;
        }
        public  String getRkmxSpmc(){
            return this.rkmxSpmc;
        }
        public void setDwId (Integer  dwId){
            this.dwId=dwId;
        }
        public  Integer getDwId(){
            return this.dwId;
        }
        public void setRkmxDj (double  rkmxDj){
            this.rkmxDj=rkmxDj;
        }
        public  double getRkmxDj(){
            return this.rkmxDj;
        }
        public void setRkmxSl (Integer  rkmxSl){
            this.rkmxSl=rkmxSl;
        }
        public  Integer getRkmxSl(){
            return this.rkmxSl;
        }
        public void setRkmxZje (double  rkmxZje){
            this.rkmxZje=rkmxZje;
        }
        public  double getRkmxZje(){
            return this.rkmxZje;
        }
        public void setRkmxBz (String  rkmxBz){
            this.rkmxBz=rkmxBz;
        }
        public  String getRkmxBz(){
            return this.rkmxBz;
        }
}
