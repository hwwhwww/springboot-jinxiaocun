package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoushenqingshangping implements Serializable {
        //采购申请表id
        private Integer cgsqspId;
        //采购申请表id外键
        private Integer cgsqId;
        //商品表id外键
        private Integer spId;
        //采购数量
        private Integer cgsqspSl;
        //采购物品的价格
        private double cgsqspJg;
        //总价
        private double cgsqspZg;
        //是否开发票
        private Integer cgsqspKp;
        //备注
        private String cgsqspBz;
        //get set 方法
        public void setCgsqspId (Integer  cgsqspId){
            this.cgsqspId=cgsqspId;
        }
        public  Integer getCgsqspId(){
            return this.cgsqspId;
        }
        public void setCgsqId (Integer  cgsqId){
            this.cgsqId=cgsqId;
        }
        public  Integer getCgsqId(){
            return this.cgsqId;
        }
        public void setSpId (Integer  spId){
            this.spId=spId;
        }
        public  Integer getSpId(){
            return this.spId;
        }
        public void setCgsqspSl (Integer  cgsqspSl){
            this.cgsqspSl=cgsqspSl;
        }
        public  Integer getCgsqspSl(){
            return this.cgsqspSl;
        }
        public void setCgsqspJg (double  cgsqspJg){
            this.cgsqspJg=cgsqspJg;
        }
        public  double getCgsqspJg(){
            return this.cgsqspJg;
        }
        public void setCgsqspZg (double  cgsqspZg){
            this.cgsqspZg=cgsqspZg;
        }
        public  double getCgsqspZg(){
            return this.cgsqspZg;
        }
        public void setCgsqspKp (Integer  cgsqspKp){
            this.cgsqspKp=cgsqspKp;
        }
        public  Integer getCgsqspKp(){
            return this.cgsqspKp;
        }
        public void setCgsqspBz (String  cgsqspBz){
            this.cgsqspBz=cgsqspBz;
        }
        public  String getCgsqspBz(){
            return this.cgsqspBz;
        }
}
