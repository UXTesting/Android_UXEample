package io.uxtesting.android_uxeample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import io.uxtesting.uxtestingsdk.UXTFramework;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume() {
        super.onResume();
        // Add this line only when you have to support version below API 14
        UXTFramework.onResume(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        // Add this line only when you have to support version below API 14
        UXTFramework.onPause();
    }

}
