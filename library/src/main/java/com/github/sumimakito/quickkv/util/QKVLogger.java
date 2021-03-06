/**
 * QucikKV
 * Copyright (c) 2014-2015 Sumi Makito
 * Licensed under Apache License 2.0.
 *
 * @author sumimakito<sumimakito@hotmail.com>
 * @version 1.0.0
 */

package com.github.sumimakito.quickkv.util;

import android.util.Log;

import com.github.sumimakito.quickkv.QKVConfig;

public class QKVLogger {
    public static void log(String level, String msg) {
        if (QKVConfig.DEBUG) {
            if (level.equals("i")) {
                Log.i(QKVConfig.PUBLIC_LTAG, msg);
            } else if (level.equals("w")) {
                Log.w(QKVConfig.PUBLIC_LTAG, msg);
            }
        }
    }

    public static void ex(Exception e) {
        if (QKVConfig.DEBUG) {
            e.printStackTrace();
        }
    }
}
