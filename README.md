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
	    compile 'org.bytedeco:javacv:0.11'
	    compile (name:'uxtestingsdk', ext:'aar')
	}
	```

3. Initial your app key in Custom Application
	```java
	import io.uxtesting.UXTesting;

	public class CustomApplication extends Application {
	    @Override
	    public void onCreate() {
	        super.onCreate();
	        UXTesting.Init(this, "YOUR_APP_KEY");
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
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
    <uses-feature android:name="android.hardware.camera"  android:required="false" />
    <uses-feature android:name="android.hardware.camera.autofocus" android:required="false" />
    <uses-feature android:name="android.hardware.camera.front" android:required="false" />
	```

5. Add `UXTService` to `AndroidManifest.xml`
	```xml
	<service android:enabled="true" android:name="io.uxtesting.UXTestingService" />
	```

6. (Optional) If you have to support version below API 14, add following code in every Activity
	```java
	@Override
	public void onResume() {
	    super.onResume();
	    UXTesting.onResume(this);
	}

	@Override
	public void onPause() {
	    super.onPause();
	    UXTesting.onPause();
	}
	```

7. Run your application.

8. Shake to start your recording.

9. Shake to end your recording. 

10. Go to [UXTesting Website](http://www.uxtesting.io/apps/) to view the results with your account.

<br>


# License

THE BEER-WARE LICENSE

As long as you retain this notice you can do whatever you want with this stuff. If we meet some day, and you think this stuff is worth it, you can buy me a beer in return.