package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   供应商管理表
*/
public class Gongyingshang implements Serializable {
        //序号
        private Integer gysId;
        //客户分类ID
        private Integer khflId;
        //供应商名称
        private String gysName;
        //电话
        private String gysDh;
        //邮箱
        private String gysYx;
        //联系人
        private String gysLxr;
        //供应商地址
        private String gysDz;
        //供应商描述
        private String gysMs;
        //get set 方法
        public void setGysId (Integer  gysId){
            this.gysId=gysId;
        }
        public  Integer getGysId(){
            return this.gysId;
        }
        public void setKhflId (Integer  khflId){
            this.khflId=khflId;
        }
        public  Integer getKhflId(){
            return this.khflId;
        }
        public void setGysName (String  gysName){
            this.gysName=gysName;
        }
        public  String getGysName(){
            return this.gysName;
        }
        public void setGysDh (String  gysDh){
            this.gysDh=gysDh;
        }
        public  String getGysDh(){
            return this.gysDh;
        }
        public void setGysYx (String  gysYx){
            this.gysYx=gysYx;
        }
        public  String getGysYx(){
            return this.gysYx;
        }
        public void setGysLxr (String  gysLxr){
            this.gysLxr=gysLxr;
        }
        public  String getGysLxr(){
            return this.gysLxr;
        }
        public void setGysDz (String  gysDz){
            this.gysDz=gysDz;
        }
        public  String getGysDz(){
            return this.gysDz;
        }
        public void setGysMs (String  gysMs){
            this.gysMs=gysMs;
        }
        public  String getGysMs(){
            return this.gysMs;
        }
}
