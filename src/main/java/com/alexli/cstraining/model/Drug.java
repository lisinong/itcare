package com.alexli.cstraining.model;

import java.io.Serializable;

public class Drug implements Serializable {

    private Integer drugId;//药品的唯一区分编号
    private String drugName;//药品的名称
    private String drugDosage;//药品的剂量
    private float drugPrice;//药品的价格
    private String drugLv;//药品的等级，如OTC等
    private String drugClf;//药品的分类\
    private String drugIntro;//药品的图片或pdf介绍
    private String drugImg;//药品的图片
    private Byte drugLimit;//该药品一般情况下的购买限制
    private Boolean drugDelete;//药品状态，0为启用，1为未启用

    private static final long serialVersionUID = 1L;
    public String getDrugDosage() {
        return drugDosage;
    }

    public void setDrugDosage(String drugDosage) {
        this.drugDosage = drugDosage;
    }

    public float getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(float drugPrice) {
        this.drugPrice = drugPrice;
    }
    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugLv() {
        return drugLv;
    }

    public void setDrugLv(String drugLv) {
        this.drugLv = drugLv;
    }

    public String getDrugClf() {
        return drugClf;
    }

    public void setDrugClf(String drugClf) {
        this.drugClf = drugClf;
    }

    public String getDrugIntro() {
        return drugIntro;
    }

    public void setDrugIntro(String drugIntro) {
        this.drugIntro = drugIntro;
    }

    public String getDrugImg() {
        return drugImg;
    }

    public void setDrugImg(String drugImg) {
        this.drugImg = drugImg;
    }

    public Byte getDrugLimit() {
        return drugLimit;
    }

    public void setDrugLimit(Byte drugLimit) {
        this.drugLimit = drugLimit;
    }

    public Boolean getDrugDelete() {
        return drugDelete;
    }

    public void setDrugDelete(Boolean drugDelete) {
        this.drugDelete = drugDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drugId=").append(drugId);
        sb.append(", drugName=").append(drugName);
        sb.append(", drugLv=").append(drugLv);
        sb.append(", drugClf=").append(drugClf);
        sb.append(", drugIntro=").append(drugIntro);
        sb.append(", drugImg=").append(drugImg);
        sb.append(", drugLimit=").append(drugLimit);
        sb.append(", drugDelete=").append(drugDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}