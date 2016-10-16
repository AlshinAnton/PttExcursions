package ru.turpattaya.pttexcursions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class ExcursionDetail extends AppCompatActivity {

    ViewFlipper viewFlipper;
    TextView pagetitleExcursionDetail;
    TextView contextExcursionDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excursion_detail);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper_excursion_detail);
        pagetitleExcursionDetail = (TextView) findViewById(R.id.excursion_detail_pagetitle);
        contextExcursionDetail = (TextView) findViewById(R.id.excursion_detail_context);


    }
}
