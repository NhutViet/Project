package com.viethcn.shopbanhang.database.Entity;

public class ThuThu {
    //THUTHU(matt text, hoten text, matkhau text)
    private String matt, hoten, matkhau;

    public ThuThu(String matt, String hoten, String matkhau) {
        this.matt = matt;
        this.hoten = hoten;
        this.matkhau = matkhau;
    }

    //Matt
    public String getMatt() {
        return matt;
    }
    public void setMatt(String matt) {
        this.matt = matt;
    }

    //Hoten
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    //Matkhau
    public String getMatkhau() {
        return matkhau;
    }
    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
}
