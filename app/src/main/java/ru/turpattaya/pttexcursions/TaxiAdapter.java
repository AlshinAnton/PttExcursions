package ru.turpattaya.pttexcursions;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import ru.turpattaya.pttexcursions.fragment.TaxiTable;


/**
 * Created by MSI on 07.10.2016.
 */

public class TaxiAdapter extends CursorAdapter {

    public TaxiAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View row = LayoutInflater.from(context).inflate(R.layout.item_taxi, viewGroup, false);

        ViewHolder holder = new ViewHolder();
        holder.from_item_taxi = (TextView) row.findViewById(R.id.from_item_taxi);
        holder.where_item_taxi = (TextView) row.findViewById(R.id.where_item_taxi);
        holder.car_item_taxi = (TextView) row.findViewById(R.id.car_item_taxi);
        holder.minivan_item_taxi = (TextView) row.findViewById(R.id.minivan_item_taxi);
        holder.minibus_item_taxi = (TextView) row.findViewById(R.id.minibus_item_taxi);


        row.setTag(holder);

        return row;
    }

    private void populateViewTaxi (ViewHolder holder,  Context context, Cursor cursor) {
        holder.from_item_taxi.setText(cursor.getString(cursor.getColumnIndex(TaxiTable.COLOMN_TAXI_WHEREFROM)));
        holder.where_item_taxi.setText(cursor.getString(cursor.getColumnIndex(TaxiTable.COLOMN_TAXI_DESTINATION)));
        holder.car_item_taxi.setText(cursor.getString(cursor.getColumnIndex(TaxiTable.COLOMN_TAXI_PRICESMALCAR)));
        holder.minivan_item_taxi.setText(cursor.getString(cursor.getColumnIndex(TaxiTable.COLOMN_TAXI_PRICEINOVACAR)));
        holder.minibus_item_taxi.setText(cursor.getString(cursor.getColumnIndex(TaxiTable.COLOMN_TAXI_PRICEMINIBUSCAR)));

    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ViewHolder holder = (ViewHolder) view.getTag();
        populateViewTaxi(holder, context,cursor);
    }
}
