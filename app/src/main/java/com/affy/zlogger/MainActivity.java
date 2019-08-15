package com.affy.zlogger;

import android.app.Activity;
import android.os.Bundle;

import com.affy.zlogger.test.R;

public class MainActivity extends Activity {
    private volatile int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("Hello ZLogger!");
        }
        ZLogger.d("Hello ZLogger!");
        mCount = 0;
        while (mCount < 10) {
            mCount++;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ZLogger.d("thread : " + mCount + sb.toString());
                }
            }).start();
        }
    }
}
