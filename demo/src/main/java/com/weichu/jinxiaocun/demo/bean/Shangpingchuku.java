package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   商品出库表
*/
public class Shangpingchuku implements Serializable {
        //序号
        private Integer spckId;
        //商品出库编号
        private String spckBh;
        //出库日期
        private Date spckSj;
        //发出库位ID
        private Integer kwId;
        //发货人
        private String spckFhr;
        //操作员
        private String spckCzy;
        //审核标志
        private Integer spckShbz;
        //审核人
        private String spckShr;
        //审核日期
        private Date spckShsj;
        //总金额
        private double spckZje;
        //备注
        private String spckBz;
        //客户id
        private Integer khId;
        //get set 方法
        public void setSpckId (Integer  spckId){
            this.spckId=spckId;
        }
        public  Integer getSpckId(){
            return this.spckId;
        }
        public void setSpckBh (String  spckBh){
            this.spckBh=spckBh;
        }
        public  String getSpckBh(){
            return this.spckBh;
        }
        public void setSpckSj (Date  spckSj){
            this.spckSj=spckSj;
        }
        public  Date getSpckSj(){
            return this.spckSj;
        }
        public void setKwId (Integer  kwId){
            this.kwId=kwId;
        }
        public  Integer getKwId(){
            return this.kwId;
        }
        public void setSpckFhr (String  spckFhr){
            this.spckFhr=spckFhr;
        }
        public  String getSpckFhr(){
            return this.spckFhr;
        }
        public void setSpckCzy (String  spckCzy){
            this.spckCzy=spckCzy;
        }
        public  String getSpckCzy(){
            return this.spckCzy;
        }
        public void setSpckShbz (Integer  spckShbz){
            this.spckShbz=spckShbz;
        }
        public  Integer getSpckShbz(){
            return this.spckShbz;
        }
        public void setSpckShr (String  spckShr){
            this.spckShr=spckShr;
        }
        public  String getSpckShr(){
            return this.spckShr;
        }
        public void setSpckShsj (Date  spckShsj){
            this.spckShsj=spckShsj;
        }
        public  Date getSpckShsj(){
            return this.spckShsj;
        }
        public void setSpckZje (double  spckZje){
            this.spckZje=spckZje;
        }
        public  double getSpckZje(){
            return this.spckZje;
        }
        public void setSpckBz (String  spckBz){
            this.spckBz=spckBz;
        }
        public  String getSpckBz(){
            return this.spckBz;
        }
        public void setKhId (Integer  khId){
            this.khId=khId;
        }
        public  Integer getKhId(){
            return this.khId;
        }
}
