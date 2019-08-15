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
        ZLogger.t("fei").d("Hello ZLogger!");
        //mCount = 0;
        //while (mCount < 10) {
        //    mCount++;
        //    new Thread(new Runnable() {
        //        @Override
        //        public void run() {
        //            ZLogger.d(mCount + " thread : " + sb.toString());
        //        }
        //    }).start();}

        ZLogger.getPrinter().getSettings().logLevel(LogLevel.NONE);
        ZLogger.d("no log");
        ZLogger.getPrinter().getSettings().logLevel(LogLevel.FULL).methodCount(1).hideThreadInfo();
        ZLogger.d("has log");
    }
}
