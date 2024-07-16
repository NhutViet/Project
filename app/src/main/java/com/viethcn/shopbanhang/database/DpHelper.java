package com.viethcn.shopbanhang.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DpHelper extends SQLiteOpenHelper {
    public DpHelper(Context context) {
        super(context,"DUANMAU",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dbThuThu = "create table THUTHU(matt text primary key, hoten text, matkhau text)";
        db.execSQL(dbThuThu) ;
        String dbThanhVien = "create table THANHVIEN(matv integer primary key autoincrement )";


        Log.d("test", "test");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
