package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   客户表
*/
public class Kehu implements Serializable {
        //序号
        private Integer khId;
        //客户名称
        private String khName;
        //客户邮箱
        private String khYx;
        //客户电话
        private String khDh;
        //客户分类ID
        private Integer khflId;
        //get set 方法
        public void setKhId (Integer  khId){
            this.khId=khId;
        }
        public  Integer getKhId(){
            return this.khId;
        }
        public void setKhName (String  khName){
            this.khName=khName;
        }
        public  String getKhName(){
            return this.khName;
        }
        public void setKhYx (String  khYx){
            this.khYx=khYx;
        }
        public  String getKhYx(){
            return this.khYx;
        }
        public void setKhDh (String  khDh){
            this.khDh=khDh;
        }
        public  String getKhDh(){
            return this.khDh;
        }
        public void setKhflId (Integer  khflId){
            this.khflId=khflId;
        }
        public  Integer getKhflId(){
            return this.khflId;
        }
}
