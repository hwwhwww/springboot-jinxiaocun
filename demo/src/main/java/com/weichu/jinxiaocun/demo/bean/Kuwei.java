package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   仓库表
*/
public class Kuwei implements Serializable {
        //序号
        private Integer kwId;
        //仓库名称
        private String kwName;
        //创建时间
        private Date kwSj;
        //仓库位置
        private String kwDz;
        //仓库区域
        private String kwQy;
        //员工id
        private Integer ygId;

    public String getYuangongName() {
        return yuangongName;
    }

    public void setYuangongName(String yuangongName) {
        this.yuangongName = yuangongName;
    }

    private  String yuangongName;
        //get set 方法
        public void setKwId (Integer  kwId){
            this.kwId=kwId;
        }
        public  Integer getKwId(){
            return this.kwId;
        }
        public void setKwName (String  kwName){
            this.kwName=kwName;
        }
        public  String getKwName(){
            return this.kwName;
        }
        public void setKwSj (Date  kwSj){
            this.kwSj=kwSj;
        }
        public  Date getKwSj(){
            return this.kwSj;
        }
        public void setKwDz (String  kwDz){
            this.kwDz=kwDz;
        }
        public  String getKwDz(){
            return this.kwDz;
        }
        public void setKwQy (String  kwQy){
            this.kwQy=kwQy;
        }
        public  String getKwQy(){
            return this.kwQy;
        }
        public void setYgId (Integer  ygId){
            this.ygId=ygId;
        }
        public  Integer getYgId(){
            return this.ygId;
        }
}
