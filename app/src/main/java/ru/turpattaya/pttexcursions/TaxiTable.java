package ru.turpattaya.pttexcursions;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by MSI on 07.10.2016.
 */

public class TaxiTable {

    public static final String TABLE_TAXI = "TaxiTable";
    public static final String COLOMN_TAXI_ID = "_id";
    public static final String COLOMN_TAXI_WHEREFROM = "wherefrom";
    public static final String COLOMN_TAXI_DESTINATION = "destination";
    public static final String COLOMN_TAXI_PRICESMALCAR = "priceSmalCar";
    public static final String COLOMN_TAXI_PRICEINOVACAR = "priceInovaCar";
    public static final String COLOMN_TAXI_PRICEMINIBUSCAR = "priceMinibusCar";

    public static void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    public static void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

}
