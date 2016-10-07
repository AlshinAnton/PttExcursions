package ru.turpattaya.pttexcursions.fragment;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by MSI on 04.10.2016.
 */

public class ExcursionTable {
    public static final String TABLE_EXCURSION = "ExcursionTable";
    public static final String COLUMN_EXCURSION_ID = "_id";
    public static final String COLUMN_EXCURSION_PAGETITLE = "pagetitle";
    public static final String COLUMN_EXCURSION_INTROTEXT = "introtext";
    public static final String COLUMN_EXCURSION_CONTENT = "content";
    public static final String COLUMN_EXCURSION_VALUE = "value";
    public static final String COLUMN_EXCURSION_URL = "url";

    public static void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    public static void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
