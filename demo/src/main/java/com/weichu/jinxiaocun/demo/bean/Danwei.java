package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   计量单位表
*/
public class Danwei implements Serializable {
        //序号
        private Integer dwId;
        //单位名称
        private String dwName;
        //get set 方法
            public void setDwId (Integer  dwId){
                this.dwId=dwId;
            }
            public  Integer getDwId(){
                return this.dwId;
            }
            public void setDwName (String  dwName){
                this.dwName=dwName;
            }
            public  String getDwName(){
                return this.dwName;
            }
}
