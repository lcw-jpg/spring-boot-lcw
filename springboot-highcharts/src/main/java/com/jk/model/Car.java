package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class Car implements Serializable {

    private static final long serialVersionUID = -4815127435093618850L;
    private Integer cid;

    private String cname;

    private Date ctime;

    private Integer cprice;

    private String curl;

    private String ctype;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getCprice() {
        return cprice;
    }

    public void setCprice(Integer cprice) {
        this.cprice = cprice;
    }

    public String getCurl() {
        return curl;
    }

    public void setCurl(String curl) {
        this.curl = curl == null ? null : curl.trim();
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", ctime=" + ctime +
                ", cprice=" + cprice +
                ", curl='" + curl + '\'' +
                ", ctype='" + ctype + '\'' +
                '}';
    }
}