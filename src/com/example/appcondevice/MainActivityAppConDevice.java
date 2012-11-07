package com.example.appcondevice;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivityAppConDevice extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_app_con_device);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_activity_app_con_device, menu);
        return true;
    }
}
