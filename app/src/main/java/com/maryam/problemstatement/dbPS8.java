package com.maryam.problemstatement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbPS8 extends SQLiteOpenHelper {
    public dbPS8(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "Credential", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table user(userId Integer Primary Key autoincrement , phoneNumber text , password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists user ");
        onCreate(sqLiteDatabase);
    }

    public Boolean addUser(String phNo ,String password){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues cv =new ContentValues();
        cv.put("phoneNumber" , phNo);
        cv.put("password" , password);
        long result = sqLiteDatabase.insert("user" , null , cv);
        if (result == -1){
            return false;
        }
        else{
            return true;
        }
//        sqLiteDatabase.close();
    }

    public boolean chkuserName(String phoneNumber){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("Select * from user where phoneNumber =?", new String[]{phoneNumber});
        if (cursor.getCount() >0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean chkUsernamePassword(String phoneNumber , String password ){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("Select * from user where phoneNumber = ? and password = ?" , new String[]{phoneNumber , password});
        if (cursor.getCount() > 0){
            return  true;
        }
        else{
            return false;
        }
    }




}
