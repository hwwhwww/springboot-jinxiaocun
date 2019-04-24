package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   员工表
*/
public class Yuangong implements Serializable {
        //序号
        private Integer ygId;
        //员工姓名
        private String ygName;
        //身份证
        private String ygSfz;
        //籍贯
        private String ygGj;
        //员工地址
        private String ygDz;
        //电话
        private String ygDh;
        //代码
        private String ygDm;
        //get set 方法
        public void setYgId (Integer  ygId){
            this.ygId=ygId;
        }
        public  Integer getYgId(){
            return this.ygId;
        }
        public void setYgName (String  ygName){
            this.ygName=ygName;
        }
        public  String getYgName(){
            return this.ygName;
        }
        public void setYgSfz (String  ygSfz){
            this.ygSfz=ygSfz;
        }
        public  String getYgSfz(){
            return this.ygSfz;
        }
        public void setYgGj (String  ygGj){
            this.ygGj=ygGj;
        }
        public  String getYgGj(){
            return this.ygGj;
        }
        public void setYgDz (String  ygDz){
            this.ygDz=ygDz;
        }
        public  String getYgDz(){
            return this.ygDz;
        }
        public void setYgDh (String  ygDh){
            this.ygDh=ygDh;
        }
        public  String getYgDh(){
            return this.ygDh;
        }
        public void setYgDm (String  ygDm){
            this.ygDm=ygDm;
        }
        public  String getYgDm(){
            return this.ygDm;
        }
}
