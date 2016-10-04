package ru.turpattaya.pttexcursions;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import ru.turpattaya.pttexcursions.fragment.ExcursionTable;


public class ExcursionAdapter extends CursorAdapter {


    public ExcursionAdapter(Context context, Cursor c, boolean flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View row = LayoutInflater.from(context).inflate(R.layout.item_excursion, viewGroup, false);

        ViewHolder holder = new ViewHolder();
        holder.imagePreview = (ImageView) row.findViewById(R.id.image_preview);
        holder.textExcursionPreview = (TextView) row.findViewById(R.id.text_excursion_preview);
        holder.textPricePreview = (TextView) row.findViewById(R.id.text_price_preview);
        populateView(holder, cursor, context);

        row.setTag(holder);

        return row;

    }
    private void populateView(ViewHolder holder, Cursor cursor, Context context)
    {
        holder.textExcursionPreview.setText(cursor.getString(cursor.getColumnIndex(ExcursionTable.COLUMN_EXCURSION_PAGETITLE)));
        holder.textPricePreview.setText(cursor.getString(cursor.getColumnIndex(ExcursionTable.COLUMN_EXCURSION_VALUE)));
        holder.imagePreview.setImageURI(Uri.parse(cursor.getString(cursor.getColumnIndex(ExcursionTable.COLUMN_EXCURSION_URL))));
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ViewHolder holder = (ViewHolder) view.getTag();
        populateView(holder, cursor, context);
    }
}
