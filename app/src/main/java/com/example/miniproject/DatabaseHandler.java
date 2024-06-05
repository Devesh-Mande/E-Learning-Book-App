package com.example.miniproject;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final String dname="Student Database";
    public static SQLiteDatabase sqdb;

    public DatabaseHandler(@Nullable Context context) {
        super(context, dname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query= "create table student_info(Username,password,confirmpassword)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public  void opendb()
    {
        sqdb= getWritableDatabase();
    }
    public void closedb()
    {
        sqdb.close();
    }



    public static void insertvalues(String UserName,String Pass,String ConfirmPass )
    {
        ContentValues cv= new ContentValues();
        cv.put("Username",UserName);
        cv.put("password",Pass);
        cv.put("confirmpassword",ConfirmPass);
        sqdb.insert("student_info",null,cv);
    }


}
