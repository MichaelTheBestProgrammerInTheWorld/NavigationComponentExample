package com.michaelmagdy.navigationcomponentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.michaelmagdy.navigationcomponentexample.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity
        implements SecondFragment.OnFragmentInteractionListener,
        ThirdFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {

        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
