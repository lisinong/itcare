package com.alexli.cstraining.model;

import java.io.Serializable;

public class Hosp implements Serializable {

    private Integer hospId;//医院的唯一区分编号
    private String hospName;//医院的名称
    private String hospLv;//医院的评级，如三甲等
    private String hospClf;//医院的分类，如综合病院等
    private String hospIntro;//医院的介绍，存文件名
    private String hospImg;//医院的图片，存文件名
    private String hospReg;//医院所处的片区
    private Boolean hospDelete;//医院状态，0为启用，1为未启用

    private static final long serialVersionUID = 1L;

    public Integer getHospId() {
        return hospId;
    }

    public void setHospId(Integer hospId) {
        this.hospId = hospId;
    }

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public String getHospLv() {
        return hospLv;
    }

    public void setHospLv(String hospLv) {
        this.hospLv = hospLv;
    }

    public String getHospClf() {
        return hospClf;
    }

    public void setHospClf(String hospClf) {
        this.hospClf = hospClf;
    }

    public String getHospIntro() {
        return hospIntro;
    }

    public void setHospIntro(String hospIntro) {
        this.hospIntro = hospIntro;
    }

    public String getHospImg() {
        return hospImg;
    }

    public void setHospImg(String hospImg) {
        this.hospImg = hospImg;
    }

    public String getHospReg() {
        return hospReg;
    }

    public void setHospReg(String hospReg) {
        this.hospReg = hospReg;
    }

    public Boolean getHospDelete() {
        return hospDelete;
    }

    public void setHospDelete(Boolean hospDelete) {
        this.hospDelete = hospDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospId=").append(hospId);
        sb.append(", hospName=").append(hospName);
        sb.append(", hospLv=").append(hospLv);
        sb.append(", hospClf=").append(hospClf);
        sb.append(", hospIntro=").append(hospIntro);
        sb.append(", hospImg=").append(hospImg);
        sb.append(", hospReg=").append(hospReg);
        sb.append(", hospDelete=").append(hospDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}