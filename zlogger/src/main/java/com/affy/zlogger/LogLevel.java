package com.affy.zlogger;

public enum LogLevel {

    /**
     * Prints all logs
     */
    FULL,

    /**
     * No log will be printed
     */
    NONE,
    /**
     * {@code Log.v}
     */
    VERBOSE,
    /**
     * {@code Log.d}
     */
    DEBUG,
    /**
     * {@code Log.i}
     */
    INFO,
    /**
     * {@code Log.w}
     */
    WARN,
    /**
     * {@code Log.e}
     */
    ERROR,
    /**
     * {@code Log.wtf}
     */
    ASSERT
}
