package com.cx.nsfw.user.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by cxspace on 16-8-23.
 */
public class User implements Serializable{

    private String id;

    private String dept;

    private String account;

    private String name;

    private String password;

    //图片相对路径
    private String headImg;

    private boolean gender;

    private String state;

    private String mobile;

    private String email;

    private Date birthday;

    private String memo;

    //用户状态

    //有效
    public static String USER_STATE_VALID = "1";

    //无效
    public static String USER_STATE_INVALID = "0";


    public User() {
    }

    public User(String account, Date birthday,
                String dept, String email,
                boolean gender, String headImg,
                String id, String memo,
                String mobile, String name,
                String password, String state)
    {
        this.account = account;
        this.birthday = birthday;
        this.dept = dept;
        this.email = email;
        this.gender = gender;
        this.headImg = headImg;
        this.id = id;
        this.memo = memo;
        this.mobile = mobile;
        this.name = name;
        this.password = password;
        this.state = state;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}