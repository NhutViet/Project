package com.viethcn.shopbanhang.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.viethcn.shopbanhang.database.DbHelper;
import com.viethcn.shopbanhang.model.PhieuMuon;

import java.util.ArrayList;

public class PhieuMuonDAO {

    DbHelper dbHelper;

    public PhieuMuonDAO(Context context) {
        dbHelper = new DbHelper(context);
    }

    public ArrayList<PhieuMuon> getDSPhieuMuon() {
        ArrayList<PhieuMuon> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT pm.mapm,  pm.matv, tv.hoten , pm.tendangnhap,  nd.hoten ,  pm.masach,  sc.tensach, pm.ngay,  pm.trasach,  pm.tienthue FROM PHIEUMUON pm JOIN THANHVIEN tv ON pm.matv = tv.matv JOIN NGUOIDUNG nd ON pm.tendangnhap = nd.tendangnhap JOIN  SACH sc ON pm.masach = sc.masach order by pm.mapm desc", null);
        if (cursor.getCount() != 0 ) {
            cursor.moveToFirst();
            do {
                list.add(new PhieuMuon(cursor.getInt(0), cursor.getInt(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getString(6), cursor.getString(7), cursor.getInt(8), cursor.getInt(9)));

            }while (cursor.moveToNext());
        }

        return list;
    }

    public boolean thayDoiTrangThai(int mapm) {
        SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("trasach", 1);
        long check = sqLiteDatabase.update("PHIEUMUON", contentValues, "mapm = ?", new String[]{String.valueOf(mapm)});
        if (check == -1) {
            return false;
        }else {
            return true;
        }
    }

    public boolean ThemPhieuMuon(PhieuMuon phieuMuon) {
        SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //(mapm integer PRIMARY KEY autoincrement, matv integer references THANHVIEN(matv), tendangnhap TEXT references NGUOIDUNG(tendangnhap), masach integer references SACH(masach), ngay text, trasach integer, tienthue integer
        contentValues.put("matv", phieuMuon.getMatv());
        contentValues.put("tendangnhap", phieuMuon.getTendangnhap());
        contentValues.put("masach", phieuMuon.getMasach());
        contentValues.put("ngay", phieuMuon.getNgay());
        contentValues.put("trasach", phieuMuon.getTrasach());
        contentValues.put("tienthue", phieuMuon.getTienthue());

        long check = sqLiteDatabase.insert("PHIEUMUON", null, contentValues);
        if (check == -1) {
            return false;
        }else {
            return true;
        }
    }



}
