package com.affy.zlogger;

import android.app.Application;

/**
 * Created by ZhangFei on 2017/3/9.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZLogger.init("affy").methodCount(1).hideThreadInfo().cache2Local(this, true);
        //ZLogger.init("affy").logLevel(LogLevel.NONE);
    }
}
