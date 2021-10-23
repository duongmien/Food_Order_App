package com.myfistapp.login_form;

public class contact {
    private int hinh1, hinh2;
    private String ten1, ten2;
    public contact(int hinh1, String ten1, int hinh2, String ten2){
        this.hinh1 = hinh1;
        this.ten1 = ten1;
        this.hinh2 = hinh2;
        this.ten2 = ten2;
    }
    public int getHinh1(){
        return  hinh1;
    }
    public void setHinh1(int hinh){
        this.hinh1 = hinh1;
    }
    public String getTen1(){
        return  ten1;
    }
    public void setTen1(String ten){
        this.ten1 = ten1;
    }
    public int getHinh2(){
        return  hinh2;
    }
    public void setHinh2(int hinh2){
        this.hinh2 = hinh2;
    }
    public String getTen2(){
        return  ten2;
    }
    public void setTen2(String ten2){
        this.ten2 = ten2;
    }

}
