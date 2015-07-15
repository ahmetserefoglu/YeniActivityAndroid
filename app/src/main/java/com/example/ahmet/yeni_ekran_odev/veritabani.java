package com.example.ahmet.yeni_ekran_odev;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ahmet on 23.12.2014.
 */
public class veritabani extends SQLiteOpenHelper {
    private static String dbadi="ogrenci";
    private static  int versiyon=1;
    public veritabani(Context c){ super(c,dbadi,null,versiyon) ; }
    @Override

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE kullanici (id integer autoincrement primary key,kullaniciadi text,sifre text,yetki integer);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table kullanici");
        onCreate(db);

    }
}