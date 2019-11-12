package com.jk.model;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = -4175485990821009863L;

    private Integer cid;

    private String cname;

    private String ctype;

    private Integer cprice;

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

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public Integer getCprice() {
        return cprice;
    }

    public void setCprice(Integer cprice) {
        this.cprice = cprice;
    }
}