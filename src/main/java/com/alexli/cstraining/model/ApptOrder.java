package com.alexli.cstraining.model;

import java.io.Serializable;
import java.util.Date;

public class ApptOrder implements Serializable {

    private Integer aoId;//预约订单唯一区分编号
    private String aoServe;//预约信息显示的预约服务内容
    private String aoHospId;//预约信息显示的就诊医院id
    private String aoTel;//陪诊师电话
    private Integer aoUserId;//发起订单的用户（患者）
    private Integer aoEscortId;//该订单的陪诊师
    private String aoAddr;//陪诊师与用户（患者）的商议接送地址（输入）
    private String aoReqr;//预约信息显示的用户（患者）的其他需求（输入）
    private Float aoPrice;//订单信息显示的应付金额（也就是预约金额）
    private Date aoCtime;//订单创建时间
    private Date aoStime;//预约就诊时间
    private Boolean aoDelete;//订单状态，0为启用，1为未启用


    private static final long serialVersionUID = 1L;

    public Integer getAoId() {
        return aoId;
    }

    public void setAoId(Integer aoId) {
        this.aoId = aoId;
    }

    public String getAoServe() {
        return aoServe;
    }

    public void setAoServe(String aoServe) {
        this.aoServe = aoServe;
    }



    public String getAoTel() {
        return aoTel;
    }

    public void setAoTel(String aoTel) {
        this.aoTel = aoTel;
    }

    public Integer getAoUserId() {
        return aoUserId;
    }

    public void setAoUserId(Integer aoUserId) {
        this.aoUserId = aoUserId;
    }

    public Integer getAoEscortId() {
        return aoEscortId;
    }

    public void setAoEscortId(Integer aoEscortId) {
        this.aoEscortId = aoEscortId;
    }

    public String getAoAddr() {
        return aoAddr;
    }

    public void setAoAddr(String aoAddr) {
        this.aoAddr = aoAddr;
    }

    public String getAoReqr() {
        return aoReqr;
    }

    public void setAoReqr(String aoReqr) {
        this.aoReqr = aoReqr;
    }

    public Float getAoPrice() {
        return aoPrice;
    }

    public void setAoPrice(Float aoPrice) {
        this.aoPrice = aoPrice;
    }

    public Boolean getAoDelete() {
        return aoDelete;
    }

    public void setAoDelete(Boolean aoDelete) {
        this.aoDelete = aoDelete;
    }

    public String getAoHospId() {
        return aoHospId;
    }

    public void setAoHospId(String aoHospId) {
        this.aoHospId = aoHospId;
    }

    public Date getAoCtime() {
        return aoCtime;
    }

    public void setAoCtime(Date aoCtime) {
        this.aoCtime = aoCtime;
    }

    public Date getAoStime() {
        return aoStime;
    }

    public void setAoStime(Date aoStime) {
        this.aoStime = aoStime;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", aoId=" + aoId +
                ", aoServe=" + aoServe +
                ", aoHosp=" + aoHospId +
                ", aoTel=" + aoTel +
                ", aoUserId=" + aoUserId +
                ", aoEscortId=" + aoEscortId +
                ", aoAddr=" + aoAddr +
                ", aoReqr=" + aoReqr +
                ", aoPrice=" + aoPrice +
                ", aoCtime=" + aoCtime +
                ", aoStime=" + aoStime +
                ", aoDelete=" + aoDelete +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}