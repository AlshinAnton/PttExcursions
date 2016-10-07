package ru.turpattaya.pttexcursions.fragment;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import ru.turpattaya.pttexcursions.MySQLiteHelper;
import ru.turpattaya.pttexcursions.R;
import ru.turpattaya.pttexcursions.TaxiAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class TaxiFragment extends Fragment {


    public TaxiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_taxi, container, false);

        ListView list = (ListView) view.findViewById(R.id.list_taxi);

        MySQLiteHelper helper = new MySQLiteHelper(getContext());

        Cursor cursor = helper.getReadableDatabase().query(
                TaxiTable.TABLE_TAXI,
                null,
                null,
                null,
                null,
                null,
                null
        );

        TaxiAdapter adapter = new TaxiAdapter(getContext(), cursor);

        list.setAdapter(adapter);

        return view;
    }
}


