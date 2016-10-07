package ru.turpattaya.pttexcursions;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


import ru.turpattaya.pttexcursions.fragment.ExcursionTable;

/**
 * Created by MSI on 04.10.2016.
 */

public class MySQLiteHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "tourptt.sqlite";
    private static final int DATABASE_VERSION = 1;

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        ExcursionTable.onUpgrade(sqLiteDatabase, i, i1);
    }
}

