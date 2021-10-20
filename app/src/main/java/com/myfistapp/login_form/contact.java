package com.myfistapp.login_form;

public class contact {
    private int hinh;
    private String ten;
    public contact(int hinh, String ten){
        this.hinh = hinh;
        this.ten = ten;
    }
    public int getHinh(){
        return  hinh;
    }
    public void setHinh(int hinh){
        this.hinh = hinh;
    }
    public String getTen(){
        return  ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }

}
