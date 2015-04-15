# Android_UXEample
UXTesting Android Example Pject
<br>


# How to use

1. Put uxtestingsdk.aar in library folder

2. Add following library in your `build.gradle` setting
```java
repositories {
    flatDir {
        dirs 'libs'
    }
}

dependencies {
    compile 'org.bytedeco:javacv:0.10'
    compile (name:'uxtestingsdk', ext:'aar')
}
```

3. Initial your app key in Custom Application
```java
import io.uxtesting.uxtestingsdk.UXTFramework;

public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UXTFramework.Init(this, "YOUR_APP_KEY", false);
    }
}
```

4. Add permissions to `AndroidManifest.xml`
```xml
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
```

5. Add `UXTService` to `AndroidManifest.xml`
```xml
    <service android:enabled="true" android:name="io.uxtesting.uxtestingsdk.UXTService" />
```

* If you have to support version below API 14, add following code in every Activity
```java
    @Override
    public void onResume() {
        super.onResume();
        UXTFramework.onResume(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        UXTFramework.onPause();
    }
```

6. Run your application.

7. Shake to start your recording.

8. Shake to end your recording. 

9. Go to [UXTesting Website](http://www.uxtesting.io/apps/) to view the results with your account.

<br>


# License

THE BEER-WARE LICENSE

As long as you retain this notice you can do whatever you want with this stuff. If we meet some day, and you think this stuff is worth it, you can buy me a beer in return.