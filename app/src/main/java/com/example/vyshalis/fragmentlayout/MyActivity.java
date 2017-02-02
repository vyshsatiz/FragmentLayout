package com.example.vyshalis.fragmentlayout;

/**
 * Created by vijisat on 29-01-2017.
 */

import android.app.Activity;
import android.os.Bundle;



public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for fragment_layout.xml
        setContentView(R.layout.activity_my);
    }
}
