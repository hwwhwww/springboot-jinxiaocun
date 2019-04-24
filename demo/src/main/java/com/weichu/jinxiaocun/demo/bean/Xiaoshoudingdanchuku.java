package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Xiaoshoudingdanchuku implements Serializable {
        //序号
        private Integer xsddckId;
        //日期
        private Date xsddckRq;
        //审核人
        private String xsddckShr;
        //出库单编号
        private String xsddckBh;
        //审核标志
        private String xsddckShbz;
        //备注
        private String xsddcBz;
        //连接销售员id
        private Integer xsyId;
        //连接审核表id
        private Integer sgId;
        //仓库id
        private Integer ckId;
        //连接销售订单商品id
        private Integer xsddspId;
        //get set 方法
        public void setXsddckId (Integer  xsddckId){
            this.xsddckId=xsddckId;
        }
        public  Integer getXsddckId(){
            return this.xsddckId;
        }
        public void setXsddckRq (Date  xsddckRq){
            this.xsddckRq=xsddckRq;
        }
        public  Date getXsddckRq(){
            return this.xsddckRq;
        }
        public void setXsddckShr (String  xsddckShr){
            this.xsddckShr=xsddckShr;
        }
        public  String getXsddckShr(){
            return this.xsddckShr;
        }
        public void setXsddckBh (String  xsddckBh){
            this.xsddckBh=xsddckBh;
        }
        public  String getXsddckBh(){
            return this.xsddckBh;
        }
        public void setXsddckShbz (String  xsddckShbz){
            this.xsddckShbz=xsddckShbz;
        }
        public  String getXsddckShbz(){
            return this.xsddckShbz;
        }
        public void setXsddcBz (String  xsddcBz){
            this.xsddcBz=xsddcBz;
        }
        public  String getXsddcBz(){
            return this.xsddcBz;
        }
        public void setXsyId (Integer  xsyId){
            this.xsyId=xsyId;
        }
        public  Integer getXsyId(){
            return this.xsyId;
        }
        public void setSgId (Integer  sgId){
            this.sgId=sgId;
        }
        public  Integer getSgId(){
            return this.sgId;
        }
        public void setCkId (Integer  ckId){
            this.ckId=ckId;
        }
        public  Integer getCkId(){
            return this.ckId;
        }
        public void setXsddspId (Integer  xsddspId){
            this.xsddspId=xsddspId;
        }
        public  Integer getXsddspId(){
            return this.xsddspId;
        }
}
