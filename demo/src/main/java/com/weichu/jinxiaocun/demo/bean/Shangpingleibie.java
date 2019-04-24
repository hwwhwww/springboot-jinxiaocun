package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   商品类别表
*/
public class Shangpingleibie implements Serializable {
        //序号
        private Integer splbId;
        //商品类别名称
        private String splbName;
        //get set 方法
            public void setSplbId (Integer  splbId){
                this.splbId=splbId;
            }
            public  Integer getSplbId(){
                return this.splbId;
            }
            public void setSplbName (String  splbName){
                this.splbName=splbName;
            }
            public  String getSplbName(){
                return this.splbName;
            }
}
