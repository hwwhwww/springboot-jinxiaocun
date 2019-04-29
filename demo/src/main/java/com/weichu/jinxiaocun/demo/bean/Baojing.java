package com.weichu.jinxiaocun.demo.bean;

public class Baojing {

    private Integer id;
    private Integer spId;
    private Integer Shang;
    private Integer Xia;
    private Integer kwId;
    private String leiBie;

    private String kwName;

    public String getKwName() {
        return kwName;
    }

    public void setKwName(String kwName) {
        this.kwName = kwName;
    }

    public String getLeiBie() {
        return leiBie;
    }

    public void setLeiBie(String leiBie) {
        this.leiBie = leiBie;
    }

    private Shangping shangping;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getShang() {
        return Shang;
    }

    public void setShang(Integer shang) {
        Shang = shang;
    }

    public Integer getXia() {
        return Xia;
    }

    public void setXia(Integer xia) {
        Xia = xia;
    }

    public Integer getKwId() {
        return kwId;
    }

    public void setKwId(Integer kwId) {
        this.kwId = kwId;
    }

    public Shangping getShangping() {
        return shangping;
    }

    public void setShangping(Shangping shangping) {
        this.shangping = shangping;
    }
}
