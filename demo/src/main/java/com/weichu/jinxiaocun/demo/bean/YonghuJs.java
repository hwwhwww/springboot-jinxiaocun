package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   用户角色关联表
*/
public class YonghuJs implements Serializable {
        //序号
        private Integer yjId;
        //用户ID
        private Integer yhId;
        //角色ID
        private Integer jsId;
        //get set 方法
        public void setYjId (Integer  yjId){
            this.yjId=yjId;
        }
        public  Integer getYjId(){
            return this.yjId;
        }
        public void setYhId (Integer  yhId){
            this.yhId=yhId;
        }
        public  Integer getYhId(){
            return this.yhId;
        }
        public void setJsId (Integer  jsId){
            this.jsId=jsId;
        }
        public  Integer getJsId(){
            return this.jsId;
        }
}
