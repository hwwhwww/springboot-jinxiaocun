package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   仓库库存表
*/
public class Kucun implements Serializable {
        //序号
        private Integer kcId;
        //商品id
        private Integer spId;
        //库位id
        private Integer kwId;
        //get set 方法
            public void setKcId (Integer  kcId){
                this.kcId=kcId;
            }
            public  Integer getKcId(){
                return this.kcId;
            }
            public void setSpId (Integer  spId){
                this.spId=spId;
            }
            public  Integer getSpId(){
                return this.spId;
            }
            public void setKwId (Integer  kwId){
                this.kwId=kwId;
            }
            public  Integer getKwId(){
                return this.kwId;
            }
}
