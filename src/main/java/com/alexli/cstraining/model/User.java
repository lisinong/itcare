package com.alexli.cstraining.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;//陪诊师的唯一区分编号
    private String userPwd;//登录后台密码
    private String userName;//陪诊师的真实姓名
    private String userImg;//陪诊师的头像
    private String userTel;//陪诊师的手机号
    private String userMail;//陪诊师的邮箱
    private String userIdn;//陪诊师的身份证号
    private String userWx;//陪诊师的微信号
    private String userQq;//陪诊师的QQ号
    private Date userTime;//账号的注册时间
    private String userDelete;//账号状态，0为启用，1为未启用


    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserIdn() {
        return userIdn;
    }

    public void setUserIdn(String userIdn) {
        this.userIdn = userIdn;
    }

    public String getUserWx() {
        return userWx;
    }

    public void setUserWx(String userWx) {
        this.userWx = userWx;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public Date getUserTime() {
        return userTime;
    }

    public void setUserTime(Date userTime) {
        this.userTime = userTime;
    }

    public String getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(String userDelete) {
        this.userDelete = userDelete;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", userId=" + userId +
                ", userPwd=" + userPwd +
                ", userName=" + userName +
                ", userImg=" + userImg +
                ", userTel=" + userTel +
                ", userMail=" + userMail +
                ", userIdn=" + userIdn +
                ", userWx=" + userWx +
                ", userQq=" + userQq +
                ", userTime=" + userTime +
                ", userDelete=" + userDelete +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}