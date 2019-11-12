package com.jk.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -7877817102932068830L;
    private Integer userid;
    private String uname;
    private Integer avg;
    private Integer sex;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAvg() {
        return avg;
    }

    public void setAvg(Integer avg) {
        this.avg = avg;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", uname='" + uname + '\'' +
                ", avg=" + avg +
                ", sex=" + sex +
                '}';
    }
}
