package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   客户分类表
*/
public class Kehufenlei implements Serializable {
        //序号
        private Integer khflId;
        //客户名称
        private String khflName;
        //get set 方法
            public void setKhflId (Integer  khflId){
                this.khflId=khflId;
            }
            public  Integer getKhflId(){
                return this.khflId;
            }
            public void setKhflName (String  khflName){
                this.khflName=khflName;
            }
            public  String getKhflName(){
                return this.khflName;
            }
}
