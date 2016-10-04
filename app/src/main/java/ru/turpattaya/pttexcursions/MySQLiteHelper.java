package ru.turpattaya.pttexcursions;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import ru.turpattaya.pttexcursions.fragment.ExcursionTable;

/**
 * Created by MSI on 04.10.2016.
 */

public class MySQLiteHelper extends SQLiteOpenHelper {

    private static final String EXCURSIONS_DATABASE = "tourptt.sqlite";
    private static final int EXCURSIONS_DB_VERSION = 1;

    public MySQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, EXCURSIONS_DATABASE, factory, EXCURSIONS_DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        ExcursionTable.onCreate(sqLiteDatabase);

        @Override
        public void onUpgrade (SQLiteDatabase sqLiteDatabase,int i, int i1){
            ExcursionTable.onUpgrade(sqLiteDatabase, i, i1);
        }
    }
}
