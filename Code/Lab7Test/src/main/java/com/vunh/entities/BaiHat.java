package com.vunh.entities;
public class BaiHat {
    private String id;
    private String ten;
    private String caSi;
    private int doDai;
    private String tenNhacSi ;

    public BaiHat(String id, String ten, String caSi, int doDai, String tenNhacSi) {
        this.id = id;
        this.ten = ten;
        this.caSi = caSi;
        this.doDai = doDai;
        this.tenNhacSi = tenNhacSi;
    }

    public BaiHat() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getDoDai() {
        return doDai;
    }

    public void setDoDai(int doDai) {
        this.doDai = doDai;
    }

    public String getTenNhacSi() {
        return tenNhacSi;
    }

    public void setTenNhacSi(String tenNhacSi) {
        this.tenNhacSi = tenNhacSi;
    }
}
