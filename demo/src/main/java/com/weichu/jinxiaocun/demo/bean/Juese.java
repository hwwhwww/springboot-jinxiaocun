package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   角色表
*/
public class Juese implements Serializable {
        //序号
        private Integer jsId;
        //英文名
        private String jsName;
        //角色名称
        private String jsNameZh;
        //get set 方法
        public void setJsId (Integer  jsId){
            this.jsId=jsId;
        }
        public  Integer getJsId(){
            return this.jsId;
        }
        public void setJsName (String  jsName){
            this.jsName=jsName;
        }
        public  String getJsName(){
            return this.jsName;
        }
        public void setJsNameZh (String  jsNameZh){
            this.jsNameZh=jsNameZh;
        }
        public  String getJsNameZh(){
            return this.jsNameZh;
        }
}
