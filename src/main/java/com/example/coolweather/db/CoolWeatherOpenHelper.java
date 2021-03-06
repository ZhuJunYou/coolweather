package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/3/5.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public static final String CREATE_PROVINCE="create table Province("
            //Province建表
            +"id integer primary key autoincrement,"
            +"province_name text,"
            +"province_code text)";
             //City建表
    public static final String CREATE_CITY="create table City("
                     +"id integer primary key autoincrement,"
                     +"city_name text,"
                     +"city_code text,"
                     +"province_id integer)";
            //County建表
    public static final String CREATE_COUNTY="create table County("
                    +"id integer primary key autoincrement,"
                    +"county_name text,"
                    +"county_code text"
                    +"city_id integer)";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
