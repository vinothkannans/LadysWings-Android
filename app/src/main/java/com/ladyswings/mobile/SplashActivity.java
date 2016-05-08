package com.ladyswings.mobile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.thefinestartist.finestwebview.FinestWebView;

/**
 * Created by Vinoth on 8-5-16.
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new FinestWebView.Builder(this)
                .backPressToClose(false)
                .show("http://ladyswings.com/community/forum.php?styleid=135");
        finish();
    }
}
