package com.jk.model;

import java.io.Serializable;

public class Role implements Serializable {
    private static final long serialVersionUID = 6381495772229609507L;

    private Integer rid;

    private String rname;

    private String status;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}