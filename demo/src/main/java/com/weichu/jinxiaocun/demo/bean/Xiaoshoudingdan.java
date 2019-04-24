package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Xiaoshoudingdan implements Serializable {
        //序号
        private Integer xsddId;
        //订单编号
        private String xsddBh;
        //订单日期
        private Date xsddRq;
        //备注
        private String xsddShbz;
        //审核标志
        private String xsddBz;
        //连接客户id
        private Integer keId;
        //连接销售员id
        private Integer xsyId;
        //连接销售订单商品id
        private Integer xsddspId;
        //get set 方法
        public void setXsddId (Integer  xsddId){
            this.xsddId=xsddId;
        }
        public  Integer getXsddId(){
            return this.xsddId;
        }
        public void setXsddBh (String  xsddBh){
            this.xsddBh=xsddBh;
        }
        public  String getXsddBh(){
            return this.xsddBh;
        }
        public void setXsddRq (Date  xsddRq){
            this.xsddRq=xsddRq;
        }
        public  Date getXsddRq(){
            return this.xsddRq;
        }
        public void setXsddShbz (String  xsddShbz){
            this.xsddShbz=xsddShbz;
        }
        public  String getXsddShbz(){
            return this.xsddShbz;
        }
        public void setXsddBz (String  xsddBz){
            this.xsddBz=xsddBz;
        }
        public  String getXsddBz(){
            return this.xsddBz;
        }
        public void setKeId (Integer  keId){
            this.keId=keId;
        }
        public  Integer getKeId(){
            return this.keId;
        }
        public void setXsyId (Integer  xsyId){
            this.xsyId=xsyId;
        }
        public  Integer getXsyId(){
            return this.xsyId;
        }
        public void setXsddspId (Integer  xsddspId){
            this.xsddspId=xsddspId;
        }
        public  Integer getXsddspId(){
            return this.xsddspId;
        }
}
