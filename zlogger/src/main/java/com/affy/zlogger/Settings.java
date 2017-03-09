package com.affy.zlogger;

import android.content.Context;
import android.os.Environment;

import java.io.File;

public final class Settings {

    private int methodCount = 2;
    private boolean showThreadInfo = true;
    private int methodOffset = 0;
    private LogAdapter logAdapter;

    //save log to local
    private boolean mCache2Local = false;
    //cache path
    private String mCachePath;

    /**
     * Determines to how logs will be printed
     */
    private LogLevel logLevel = LogLevel.FULL;

    public Settings hideThreadInfo() {
        showThreadInfo = false;
        return this;
    }

    public Settings methodCount(int methodCount) {
        if (methodCount < 0) {
            methodCount = 0;
        }
        this.methodCount = methodCount;
        return this;
    }

    public Settings logLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    public Settings methodOffset(int offset) {
        this.methodOffset = offset;
        return this;
    }

    public Settings logAdapter(LogAdapter logAdapter) {
        this.logAdapter = logAdapter;
        return this;
    }

    public Settings cache2Local(Context context, boolean flag) {
        if (flag) {
            if (context == null) return this;
            try {
                if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
                    mCachePath = context.getExternalCacheDir().getPath() + File.separator + "log" + File.separator;
                } else {
                    mCachePath = context.getCacheDir().getPath() + File.separator + "log" + File.separator;
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("need permission:android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
        this.mCache2Local = flag;
        return this;
    }

    public Settings cachePath(String path) {
        this.mCachePath = path;
        return this;
    }

    public boolean isCache2Local() {
        return mCache2Local;
    }

    public String getCachePath() {
        return mCachePath;
    }

    public int getMethodCount() {
        return methodCount;
    }

    public boolean isShowThreadInfo() {
        return showThreadInfo;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public int getMethodOffset() {
        return methodOffset;
    }

    public LogAdapter getLogAdapter() {
        if (logAdapter == null) {
            logAdapter = new AndroidLogAdapter();
        }
        return logAdapter;
    }

    public void reset() {
        methodCount = 2;
        methodOffset = 0;
        showThreadInfo = true;
        logLevel = LogLevel.FULL;
    }
}
