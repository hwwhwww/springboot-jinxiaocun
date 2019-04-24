package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoudingdanrukushangpin implements Serializable {
        //采购订单入库id
        private Integer cgddrkId;
        //采购订单入库id
        private Integer cgddrkspId;
        //商品表id
        private Integer spId;
        //入库数量
        private Integer cgddrkspSl;
        //单价
        private double cgddrkspDj;
        //总价
        private double cgddrkspZj;
        //备注
        private String cgddrkspBz;
        //get set 方法
            public void setCgddrkId (Integer  cgddrkId){
                this.cgddrkId=cgddrkId;
            }
            public  Integer getCgddrkId(){
                return this.cgddrkId;
            }
            public void setCgddrkspId (Integer  cgddrkspId){
                this.cgddrkspId=cgddrkspId;
            }
            public  Integer getCgddrkspId(){
                return this.cgddrkspId;
            }
            public void setSpId (Integer  spId){
                this.spId=spId;
            }
            public  Integer getSpId(){
                return this.spId;
            }
            public void setCgddrkspSl (Integer  cgddrkspSl){
                this.cgddrkspSl=cgddrkspSl;
            }
            public  Integer getCgddrkspSl(){
                return this.cgddrkspSl;
            }
            public void setCgddrkspDj (double  cgddrkspDj){
                this.cgddrkspDj=cgddrkspDj;
            }
            public  double getCgddrkspDj(){
                return this.cgddrkspDj;
            }
            public void setCgddrkspZj (double  cgddrkspZj){
                this.cgddrkspZj=cgddrkspZj;
            }
            public  double getCgddrkspZj(){
                return this.cgddrkspZj;
            }
            public void setCgddrkspBz (String  cgddrkspBz){
                this.cgddrkspBz=cgddrkspBz;
            }
            public  String getCgddrkspBz(){
                return this.cgddrkspBz;
            }
}
