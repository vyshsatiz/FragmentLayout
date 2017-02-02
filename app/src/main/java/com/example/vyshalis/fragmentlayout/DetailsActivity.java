package com.example.vyshalis.fragmentlayout;

/**
 * Created by vijisat on 29-01-2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Check if the device is in landscape mode
        if (getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {
            // If the screen is now in landscape mode, we can show the
            // dialog in-line with the list so we don't need this activity.
            finish();
            return;
        }

        // Check if we have any hero data saved
        if (savedInstanceState == null) {

            // If not then create the DetailsFragment
            DetailsFragment details = new DetailsFragment();

            // Get the Bundle of key value pairs and assign them to the DetailsFragment
            details.setArguments(getIntent().getExtras());

            // Add the details Fragment
            getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
        }
    }
}