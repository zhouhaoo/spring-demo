package com.zhouhaoo.spring.domain;

import java.io.Serializable;
import java.util.Date;

public class Products implements Serializable {
    private Integer pid;

    private String pname;

    private Double price;

    private Integer pnum;

    private Integer cno;

    private Date pdata;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Date getPdata() {
        return pdata;
    }

    public void setPdata(Date pdata) {
        this.pdata = pdata;
    }
}