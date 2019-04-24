package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   资源角色关联表
*/
public class ZiyuanJs implements Serializable {
        //序号
        private Integer zjId;
        //资源ID
        private Integer zyId;
        //角色ID
        private Integer jsId;
        //get set 方法
        public void setZjId (Integer  zjId){
            this.zjId=zjId;
        }
        public  Integer getZjId(){
            return this.zjId;
        }
        public void setZyId (Integer  zyId){
            this.zyId=zyId;
        }
        public  Integer getZyId(){
            return this.zyId;
        }
        public void setJsId (Integer  jsId){
            this.jsId=jsId;
        }
        public  Integer getJsId(){
            return this.jsId;
        }
}
