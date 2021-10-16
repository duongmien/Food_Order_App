package com.myfistapp.login_form;

public class ClassGioHang {

    private String ten;
    private double gia;
    private int sl, hinh;

    public ClassGioHang(String ten, double gia, int sl, int hinh) {
        this.ten = ten;
        this.gia = gia;
        this.sl = sl;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
