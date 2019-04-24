package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   修正库存报表
*/
public class Xiuzhengkucun implements Serializable {
        //序号
        private Integer xzkcId;
        //盘点单据号
        private String xzkcDjh;
        //商品id
        private Integer spId;
        //盘点名称
        private String xzkcName;
        //盘点仓库
        private Integer kwId;
        //盘点前数量
        private double xzkcQsl;
        //盘点时数量
        private double xzkcSsl;
        //盈亏数量
        private double xzkcYksl;
        //成本单价
        private double xzkcCbdj;
        //盈亏金额
        private double xzkcYkje;
        //创建人
        private String xzkcCjr;
        //创建日期
        private Date xzkcCjsj;
        //get set 方法
        public void setXzkcId (Integer  xzkcId){
            this.xzkcId=xzkcId;
        }
        public  Integer getXzkcId(){
            return this.xzkcId;
        }
        public void setXzkcDjh (String  xzkcDjh){
            this.xzkcDjh=xzkcDjh;
        }
        public  String getXzkcDjh(){
            return this.xzkcDjh;
        }
        public void setSpId (Integer  spId){
            this.spId=spId;
        }
        public  Integer getSpId(){
            return this.spId;
        }
        public void setXzkcName (String  xzkcName){
            this.xzkcName=xzkcName;
        }
        public  String getXzkcName(){
            return this.xzkcName;
        }
        public void setKwId (Integer  kwId){
            this.kwId=kwId;
        }
        public  Integer getKwId(){
            return this.kwId;
        }
        public void setXzkcQsl (double  xzkcQsl){
            this.xzkcQsl=xzkcQsl;
        }
        public  double getXzkcQsl(){
            return this.xzkcQsl;
        }
        public void setXzkcSsl (double  xzkcSsl){
            this.xzkcSsl=xzkcSsl;
        }
        public  double getXzkcSsl(){
            return this.xzkcSsl;
        }
        public void setXzkcYksl (double  xzkcYksl){
            this.xzkcYksl=xzkcYksl;
        }
        public  double getXzkcYksl(){
            return this.xzkcYksl;
        }
        public void setXzkcCbdj (double  xzkcCbdj){
            this.xzkcCbdj=xzkcCbdj;
        }
        public  double getXzkcCbdj(){
            return this.xzkcCbdj;
        }
        public void setXzkcYkje (double  xzkcYkje){
            this.xzkcYkje=xzkcYkje;
        }
        public  double getXzkcYkje(){
            return this.xzkcYkje;
        }
        public void setXzkcCjr (String  xzkcCjr){
            this.xzkcCjr=xzkcCjr;
        }
        public  String getXzkcCjr(){
            return this.xzkcCjr;
        }
        public void setXzkcCjsj (Date  xzkcCjsj){
            this.xzkcCjsj=xzkcCjsj;
        }
        public  Date getXzkcCjsj(){
            return this.xzkcCjsj;
        }
}
