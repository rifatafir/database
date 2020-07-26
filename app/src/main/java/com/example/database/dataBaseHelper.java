package com.example.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class dataBaseHelper extends SQLiteOpenHelper {

    public static final String database_name = "Student.db"
    public static final String table_name = "Student_table"
    public static final String col_1 = "ID"
    public static final String col_2 = "name"
    public static final String col_3 = "surname"
    public static final String col_4 = "marks"

            public dataBaseHelper(Contex contex){
        super(contex, database_name, null, 1 );
            }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
