package com.affy.zlogger;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/**
 * Created by ZhangFei on 2017/3/9.
 */

public class FileUtils {

    public static File getFileByPath(String filePath) {
        return (filePath == null || filePath.trim().length() == 0) ? null : new File(filePath);
    }

    public static boolean createOrExistsFile(String filePath) {
        return createOrExistsFile(getFileByPath(filePath));
    }

    public static boolean createOrExistsFile(File file) {
        if (file == null) return false;
        if (file.exists()) return file.isFile();
        if (!createOrExistsDir(file.getParentFile())) return false;
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean createOrExistsDir(File file) {
        return file != null && (file.exists() ? file.isDirectory() : file.mkdirs());
    }

    public static void closeIO(Closeable... closeables) {
        if (closeables == null) return;
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
