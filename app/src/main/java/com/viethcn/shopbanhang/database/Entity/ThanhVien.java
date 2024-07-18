package com.viethcn.shopbanhang.database.Entity;

public class ThanhVien {
    //ThanhVien(matv integer primary key autoincrement, hoten text, namsinh text )

    private int matv;
    private String hoten, namsinh;

    public ThanhVien(int matv, String hoten, String namsinh) {
        this.matv = matv;
        this.hoten = hoten;
        this.namsinh = namsinh;
    }

    //MaTV
    public int getMatv() {
        return matv;
    }
    public void setMatv(int matv) {
        this.matv = matv;
    }

    //HoTen
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    //NamSinh
    public String getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }
}
