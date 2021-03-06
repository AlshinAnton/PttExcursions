package ru.turpattaya.pttexcursions;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

/**
 * Created by MSI on 13.10.2016.
 */

public class ExcursionDetailAdapter extends CursorAdapter {

    public ExcursionDetailAdapter(Context context, Cursor c) {
        super(context, c,0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View row = LayoutInflater.from(context).inflate(R.layout.activity_excursion_detail, viewGroup, false);

        ViewHolder holder = new ViewHolder();
        holder.viewFlipper = (ViewFlipper) row.findViewById(R.id.viewFlipper_excursion_detail);
        holder.pagetitleExcursionDetail = (TextView) row.findViewById(R.id.excursion_detail_pagetitle);
        holder.contentExcursionDetail = (TextView) row.findViewById(R.id.excursion_detail_context);
        row.setTag(holder);
        return row;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ViewHolder holder = (ViewHolder) view.getTag();
        populateViewDetailExcursion(holder, cursor, context);
    }

    private void populateViewDetailExcursion(ViewHolder holder, Cursor cursor, Context context) {
        holder.pagetitleExcursionDetail.setText(cursor.getString(cursor.getColumnIndex(ExcursionTable.COLUMN_EXCURSION_PAGETITLE)));
        holder.contentExcursionDetail.setText(cursor.getString(cursor.getColumnIndex(ExcursionTable.COLUMN_EXCURSION_CONTENT)));
        String url = cursor.getString(cursor.getColumnIndex(ExcursionDetailTable.COLUMN_EXCURSIONDETAIL_URL));
        if (!TextUtils.isEmpty(url)) {
            Picasso.with(context).load(url).fit().centerCrop().into((Target) holder.viewFlipper);
        }
    }
}
