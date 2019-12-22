package com.haoke.yang.bean;

import java.util.Date;

public class Contract {
    private Integer id;

    private Integer houseid;

    private Integer customerid;

    private Integer renttime;

    private Double rentmoney;

    private Double middlemoney;

    private String middlepeople;

    private Date date;

    private String img;

    private Date createtime;

    private Date upatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getRenttime() {
        return renttime;
    }

    public void setRenttime(Integer renttime) {
        this.renttime = renttime;
    }

    public Double getRentmoney() {
        return rentmoney;
    }

    public void setRentmoney(Double rentmoney) {
        this.rentmoney = rentmoney;
    }

    public Double getMiddlemoney() {
        return middlemoney;
    }

    public void setMiddlemoney(Double middlemoney) {
        this.middlemoney = middlemoney;
    }

    public String getMiddlepeople() {
        return middlepeople;
    }

    public void setMiddlepeople(String middlepeople) {
        this.middlepeople = middlepeople == null ? null : middlepeople.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpatetime() {
        return upatetime;
    }

    public void setUpatetime(Date upatetime) {
        this.upatetime = upatetime;
    }
}