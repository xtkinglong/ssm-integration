package com.zx.bean;

public class ZxUser {
    private Integer id;
    private String zxName;
    private String zxAge;
    private Integer addressNum;

    public ZxUser() {
    }

    public ZxUser(Integer id, String zxName, String zxAge, Integer addressNum) {
        this.id = id;
        this.zxName = zxName;
        this.zxAge = zxAge;
        this.addressNum = addressNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZxName() {
        return zxName;
    }

    public void setZxName(String zxName) {
        this.zxName = zxName;
    }

    public String getZxAge() {
        return zxAge;
    }

    public void setZxAge(String zxAge) {
        this.zxAge = zxAge;
    }

    public Integer getAddressNum() {
        return addressNum;
    }

    public void setAddressNum(Integer addressNum) {
        this.addressNum = addressNum;
    }

    @Override
    public String toString() {
        return "ZxUser{" +
                "id=" + id +
                ", zxName='" + zxName + '\'' +
                ", zxAge='" + zxAge + '\'' +
                ", addressNum=" + addressNum +
                '}';
    }
}
