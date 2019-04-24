package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   用户登录记录表
*/
public class Denglujilu implements Serializable {
        //序号
        private Integer dlId;
        //用户名
        private String dlYhm;
        //时间
        private Date dlSj;
        //登录IP
        private String dlIP;
        //get set 方法
            public void setDlId (Integer  dlId){
                this.dlId=dlId;
            }
            public  Integer getDlId(){
                return this.dlId;
            }
            public void setDlYhm (String  dlYhm){
                this.dlYhm=dlYhm;
            }
            public  String getDlYhm(){
                return this.dlYhm;
            }
            public void setDlSj (Date  dlSj){
                this.dlSj=dlSj;
            }
            public  Date getDlSj(){
                return this.dlSj;
            }
            public void setDlIP (String  dlIP){
                this.dlIP=dlIP;
            }
            public  String getDlIP(){
                return this.dlIP;
            }
}
