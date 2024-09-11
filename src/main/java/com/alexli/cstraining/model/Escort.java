package com.alexli.cstraining.model;

import java.io.Serializable;
import java.util.Date;

public class Escort implements Serializable {

    private Integer escortId;//陪诊师的唯一区分编号
    private String escortPwd;//登录后台密码
    private String escortName;//陪诊师的真实姓名
    private String escortImg;//陪诊师的头像
    private String escortTel;//陪诊师的手机号
    private String escortMail;//陪诊师的邮箱
    private String escortIdn;//陪诊师的身份证号
    private String escortWx;//陪诊师的微信号
    private String escortQq;//陪诊师的QQ号
    private Date escortTime;//账号的注册时间
    private Boolean escortLv;//权限级别，0为超级管理员，1为普通陪诊师
    private Boolean escortOrder;//接单状态，0位未接单，1为已接单
    private String escortDelete;//账号状态，0为启用，1为未启用

    private static final long serialVersionUID = 1L;

    public Integer getEscortId() {
        return escortId;
    }

    public void setEscortId(Integer escortId) {
        this.escortId = escortId;
    }

    public String getEscortPwd() {
        return escortPwd;
    }

    public void setEscortPwd(String escortPwd) {
        this.escortPwd = escortPwd;
    }

    public String getEscortName() {
        return escortName;
    }

    public void setEscortName(String escortName) {
        this.escortName = escortName;
    }

    public String getEscortImg() {
        return escortImg;
    }

    public void setEscortImg(String escortImg) {
        this.escortImg = escortImg;
    }

    public String getEscortTel() {
        return escortTel;
    }

    public void setEscortTel(String escortTel) {
        this.escortTel = escortTel;
    }

    public String getEscortMail() {
        return escortMail;
    }

    public void setEscortMail(String escortMail) {
        this.escortMail = escortMail;
    }

    public String getEscortIdn() {
        return escortIdn;
    }

    public void setEscortIdn(String escortIdn) {
        this.escortIdn = escortIdn;
    }

    public String getEscortWx() {
        return escortWx;
    }

    public void setEscortWx(String escortWx) {
        this.escortWx = escortWx;
    }

    public String getEscortQq() {
        return escortQq;
    }

    public void setEscortQq(String escortQq) {
        this.escortQq = escortQq;
    }

    public Date getEscortTime() {
        return escortTime;
    }

    public void setEscortTime(Date escortTime) {
        this.escortTime = escortTime;
    }

    public Boolean getEscortLv() {
        return escortLv;
    }

    public void setEscortLv(Boolean escortLv) {
        this.escortLv = escortLv;
    }

    public Boolean getEscortOrder() {
        return escortOrder;
    }

    public void setEscortOrder(Boolean escortOrder) {
        this.escortOrder = escortOrder;
    }

    public String getEscortDelete() {
        return escortDelete;
    }

    public void setEscortDelete(String escortDelete) {
        this.escortDelete = escortDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", escortId=").append(escortId);
        sb.append(", escortPwd=").append(escortPwd);
        sb.append(", escortName=").append(escortName);
        sb.append(", escortImg=").append(escortImg);
        sb.append(", escortTel=").append(escortTel);
        sb.append(", escortMail=").append(escortMail);
        sb.append(", escortIdn=").append(escortIdn);
        sb.append(", escortWx=").append(escortWx);
        sb.append(", escortQq=").append(escortQq);
        sb.append(", escortTime=").append(escortTime);
        sb.append(", escortLv=").append(escortLv);
        sb.append(", escortOrder=").append(escortOrder);
        sb.append(", escortDelete=").append(escortDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}