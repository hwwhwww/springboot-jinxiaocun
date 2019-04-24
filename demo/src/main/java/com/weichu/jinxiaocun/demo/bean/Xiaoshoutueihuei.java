package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Xiaoshoutueihuei implements Serializable {
        //序号
        private Integer id;
        //退回单编号
        private String xsthId;
        //退回日期
        private Date xsthRq;
        //退回客户
        private String xsthKh;
        //操作员
        private String xsthZzy;
        //备注
        private String xsthBz;
        //连接客户id
        private Integer khId;
        //连接销售员id
        private Integer xsyId;
        //get set 方法
        public void setId (Integer  id){
            this.id=id;
        }
        public  Integer getId(){
            return this.id;
        }
        public void setXsthId (String  xsthId){
            this.xsthId=xsthId;
        }
        public  String getXsthId(){
            return this.xsthId;
        }
        public void setXsthRq (Date  xsthRq){
            this.xsthRq=xsthRq;
        }
        public  Date getXsthRq(){
            return this.xsthRq;
        }
        public void setXsthKh (String  xsthKh){
            this.xsthKh=xsthKh;
        }
        public  String getXsthKh(){
            return this.xsthKh;
        }
        public void setXsthZzy (String  xsthZzy){
            this.xsthZzy=xsthZzy;
        }
        public  String getXsthZzy(){
            return this.xsthZzy;
        }
        public void setXsthBz (String  xsthBz){
            this.xsthBz=xsthBz;
        }
        public  String getXsthBz(){
            return this.xsthBz;
        }
        public void setKhId (Integer  khId){
            this.khId=khId;
        }
        public  Integer getKhId(){
            return this.khId;
        }
        public void setXsyId (Integer  xsyId){
            this.xsyId=xsyId;
        }
        public  Integer getXsyId(){
            return this.xsyId;
        }
}
