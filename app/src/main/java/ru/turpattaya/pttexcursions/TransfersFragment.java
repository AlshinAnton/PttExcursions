package ru.turpattaya.pttexcursions;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.turpattaya.pttexcursions.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TransfersFragment extends Fragment {


    public TransfersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transfers, container, false);
    }

}
