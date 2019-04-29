package com.weichu.jinxiaocun.demo.bean;
import java.io.Serializable;
import java.util.Date;
/***
*   商品表
*/
public class Shangping implements Serializable {
        //序号
        private Integer spId;
        //商品的数量
        private Integer spSl;
        //商品编号
        private String spBh;
        //商品名称
        private String spName;
        //商品类别Id
        private Integer splbId;

    public String getSplbName() {
        return splbName;
    }

    public void setSplbName(String splbName) {
        this.splbName = splbName;
    }

    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    private  String splbName;
    private  String dwName;
    //单位Id
        private Integer dwId;

        //采购单价
        private double spCgdj;
        //销售订单
        private double spXsdj;
        //备注
        private String spBz;

        //get set 方法
        public void setSpId (Integer  spId){
            this.spId=spId;
        }
        public  Integer getSpId(){
            return this.spId;
        }
        public void setSpSl (Integer  spSl){
            this.spSl=spSl;
        }
        public  Integer getSpSl(){
            return this.spSl;
        }
        public void setSpBh (String  spBh){
            this.spBh=spBh;
        }
        public  String getSpBh(){
            return this.spBh;
        }
        public void setSpName (String  spName){
            this.spName=spName;
        }
        public  String getSpName(){
            return this.spName;
        }
        public void setSplbId (Integer  splbId){
            this.splbId=splbId;
        }
        public  Integer getSplbId(){
            return this.splbId;
        }
        public void setDwId (Integer  dwId){
            this.dwId=dwId;
        }
        public  Integer getDwId(){
            return this.dwId;
        }
        public void setSpCgdj (double  spCgdj){
            this.spCgdj=spCgdj;
        }
        public  double getSpCgdj(){
            return this.spCgdj;
        }
        public void setSpXsdj (double  spXsdj){
            this.spXsdj=spXsdj;
        }
        public  double getSpXsdj(){
            return this.spXsdj;
        }
        public void setSpBz (String  spBz){
            this.spBz=spBz;
        }
        public  String getSpBz(){
            return this.spBz;
        }
}
