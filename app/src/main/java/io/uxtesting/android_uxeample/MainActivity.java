package io.uxtesting.android_uxeample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import io.uxtesting.UXTesting;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String defaultUrl = "https://tw.yahoo.com/";

        SearchView searchView = (SearchView) findViewById(R.id.sv_url);
        searchView.setSubmitButtonEnabled(false);
        searchView.setQuery(defaultUrl, false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if (s.substring(0, 7).equals("http://") && s.substring(0, 8).equals("https://")) {
                    s = "http://" + s;
                }
                ((WebView)findViewById(R.id.wv_content)).loadUrl(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        WebView webViewContent = (WebView)findViewById(R.id.wv_content);
        webViewContent.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webViewContent.loadUrl(defaultUrl);

    }

    @Override
    public void onResume() {
        super.onResume();
        // Add this line only when you have to support version below API 14
        UXTesting.onResume(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        // Add this line only when you have to support version below API 14
        UXTesting.onPause();
    }

}
