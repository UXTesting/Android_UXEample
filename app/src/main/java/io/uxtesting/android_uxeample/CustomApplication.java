package io.uxtesting.android_uxeample;

import android.app.Application;

import io.uxtesting.uxtestingsdk.UXTFramework;

/**
 * Created by Morshues on 15/4/14.
 */
public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UXTFramework.Init(this, "MY_APP_KEY", false);
    }

}
