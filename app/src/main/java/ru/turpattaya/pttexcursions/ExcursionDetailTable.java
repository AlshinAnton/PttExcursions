package ru.turpattaya.pttexcursions;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by MSI on 13.10.2016.
 */

public class ExcursionDetailTable {
    public static final String TABLE_EXCURSIONDETAIL = "ExcursionDetailTable";
    public static final String COLUMN_EXCURSIONDETAIL_ID = "_id";
    public static final String COLUMN_EXCURSIONDETAIL_EXCURSIONID = "excursionid";
    public static final String COLUMN_EXCURSIONDETAIL_URL = "url";

    public static void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    public static void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
