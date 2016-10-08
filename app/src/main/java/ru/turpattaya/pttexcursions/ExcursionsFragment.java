package ru.turpattaya.pttexcursions;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class ExcursionsFragment extends Fragment {


    public ExcursionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_excursions, container, false);

        ListView list = (ListView) view.findViewById(R.id.list_excursion);

        MySQLiteHelper helper = new MySQLiteHelper(getContext());

        Cursor cursor = helper.getReadableDatabase().query(
                ExcursionTable.TABLE_EXCURSION,
                null,
                null,
                null,
                null,
                null,
                null
        );

        ExcursionAdapter adapter = new ExcursionAdapter(getContext(), cursor);

        list.setAdapter(adapter);

        return view;
    }

}
