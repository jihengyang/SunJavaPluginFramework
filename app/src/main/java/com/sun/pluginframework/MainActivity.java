package com.sun.pluginframework;

import android.content.Intent;
import android.os.Bundle;
import android.taobao.atlas.runtime.BundleIniter;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View homeBtn = findViewById(R.id.home_btn);
        homeBtn.setOnClickListener(v -> {
            BundleIniter.initBundle("com.sun.textdetail", null);
            switchToActivity("com.sun.textdetail.TextDetailActivity");
        });
    }

    public void switchToActivity(String activityName) {
        Intent intent = new Intent();
        intent.setClassName(getBaseContext(), activityName);
        startActivity(intent);
    }
}