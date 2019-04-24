package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoutuihuoshangpin implements Serializable {
        //退货商品表id
        private Integer cgthspId;
        //采购退货表id外键
        private Integer cgthId;
        //商品表id
        private Integer spId;
        //退货商品数量
        private Integer cgthspSl;
        //当前金额
        private double cgthspJe;
        //总价
        private double cgthspZj;
        //是否开发票
        private Integer cgthspFp;
        //get set 方法
        public void setCgthspId (Integer  cgthspId){
            this.cgthspId=cgthspId;
        }
        public  Integer getCgthspId(){
            return this.cgthspId;
        }
        public void setCgthId (Integer  cgthId){
            this.cgthId=cgthId;
        }
        public  Integer getCgthId(){
            return this.cgthId;
        }
        public void setSpId (Integer  spId){
            this.spId=spId;
        }
        public  Integer getSpId(){
            return this.spId;
        }
        public void setCgthspSl (Integer  cgthspSl){
            this.cgthspSl=cgthspSl;
        }
        public  Integer getCgthspSl(){
            return this.cgthspSl;
        }
        public void setCgthspJe (double  cgthspJe){
            this.cgthspJe=cgthspJe;
        }
        public  double getCgthspJe(){
            return this.cgthspJe;
        }
        public void setCgthspZj (double  cgthspZj){
            this.cgthspZj=cgthspZj;
        }
        public  double getCgthspZj(){
            return this.cgthspZj;
        }
        public void setCgthspFp (Integer  cgthspFp){
            this.cgthspFp=cgthspFp;
        }
        public  Integer getCgthspFp(){
            return this.cgthspFp;
        }
}
