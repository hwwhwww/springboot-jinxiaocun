package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Xiaoshoudingdanshangping implements Serializable {
        //id
        private Integer xsddspId;
        //连接销售订单id
        private Integer xsdhId;
        //连接商品编号id
        private Integer spId;
        //数量
        private Integer xsddspSl;
        //价格
        private double xsddspJg;
        //get set 方法
            public void setXsddspId (Integer  xsddspId){
                this.xsddspId=xsddspId;
            }
            public  Integer getXsddspId(){
                return this.xsddspId;
            }
            public void setXsdhId (Integer  xsdhId){
                this.xsdhId=xsdhId;
            }
            public  Integer getXsdhId(){
                return this.xsdhId;
            }
            public void setSpId (Integer  spId){
                this.spId=spId;
            }
            public  Integer getSpId(){
                return this.spId;
            }
            public void setXsddspSl (Integer  xsddspSl){
                this.xsddspSl=xsddspSl;
            }
            public  Integer getXsddspSl(){
                return this.xsddspSl;
            }
            public void setXsddspJg (double  xsddspJg){
                this.xsddspJg=xsddspJg;
            }
            public  double getXsddspJg(){
                return this.xsddspJg;
            }
}
