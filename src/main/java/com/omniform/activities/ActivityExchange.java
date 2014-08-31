package com.omniform.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.omniform.R;

public class ActivityExchange extends Activity
{

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setTitle("Exchange");
        setContentView(R.layout.layout_exchange);
    }

}

