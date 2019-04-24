package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoudingdanshangping implements Serializable {
        //采购订单表的id外键
        private Integer cgddId;
        //商品表id外键
        private Integer spId;
        //采购数量
        private Integer cgddspSl;
        //采购物品的价格
        private double cgddspJg;
        //总价
        private double cgddspZg;
        //是否开发票
        private Integer cgddspFp;
        //备注
        private String cgddspBz;
        //get set 方法
            public void setCgddId (Integer  cgddId){
                this.cgddId=cgddId;
            }
            public  Integer getCgddId(){
                return this.cgddId;
            }
            public void setSpId (Integer  spId){
                this.spId=spId;
            }
            public  Integer getSpId(){
                return this.spId;
            }
            public void setCgddspSl (Integer  cgddspSl){
                this.cgddspSl=cgddspSl;
            }
            public  Integer getCgddspSl(){
                return this.cgddspSl;
            }
            public void setCgddspJg (double  cgddspJg){
                this.cgddspJg=cgddspJg;
            }
            public  double getCgddspJg(){
                return this.cgddspJg;
            }
            public void setCgddspZg (double  cgddspZg){
                this.cgddspZg=cgddspZg;
            }
            public  double getCgddspZg(){
                return this.cgddspZg;
            }
            public void setCgddspFp (Integer  cgddspFp){
                this.cgddspFp=cgddspFp;
            }
            public  Integer getCgddspFp(){
                return this.cgddspFp;
            }
            public void setCgddspBz (String  cgddspBz){
                this.cgddspBz=cgddspBz;
            }
            public  String getCgddspBz(){
                return this.cgddspBz;
            }
}
