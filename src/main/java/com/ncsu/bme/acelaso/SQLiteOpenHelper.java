package com.ncsu.bme.acelaso;

/*
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
*/
/**
 * Created by Michael on 4/23/2015.
 *//*

public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ACELASO-DB.db";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

 @Override
    public void onCreate(SQLiteDatabase db) {
     String CREATE_TABLE_TEMP = "CREATE TABLE " + DBConstants.DATABASE_TABLE  + "("
             + DBConstants.KEY_ID  + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
             + DBConstants.TEMP + " INTEGER, "
             + DBConstants.TIMESTAMP + " TIMESTAMP )";
     db.execSQL(CREATE_TABLE_TEMP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed, all data will be gone!!!
        db.execSQL("DROP TABLE IF EXISTS " + DBConstants.DATABASE_TABLE);

        // Create tables again
        onCreate(db);

    }


}
*/
