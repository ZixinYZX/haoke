package com.haoke.yang.bean;

import java.util.Date;

public class Customer {
    private Integer id;

    private String name;

    private String sex;

    private String idcard;

    private String tel;

    private String address;

    private Integer customerneedid;

    private Date createtime;

    private Date updatetime;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getCustomerneedid() {
        return customerneedid;
    }

    public void setCustomerneedid(Integer customerneedid) {
        this.customerneedid = customerneedid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", idcard='" + idcard + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", customerneedid=" + customerneedid +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }
}