package com.affy.zlogger;

import android.app.Activity;
import android.os.Bundle;
import com.affy.zlogger.test.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ZLogger.d("Hello ZLogger!");
    }
}
