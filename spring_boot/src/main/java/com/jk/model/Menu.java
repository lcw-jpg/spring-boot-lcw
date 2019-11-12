package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {

    private static final long serialVersionUID = 3797829027174376926L;

    private Integer id;

    private String text;

    private String url;

    private Integer pid;


    private List<Menu> children;


    private boolean checked = false;

    private String te;

    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }


}
