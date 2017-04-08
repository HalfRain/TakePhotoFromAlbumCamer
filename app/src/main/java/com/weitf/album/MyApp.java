package com.weitf.album;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.blankj.utilcode.util.FileUtils;
import com.weitf.album.photo.ExampleConfig;

/**
 * Created by weitf
 * Email:weitengfei0212@gmail.com
 * On 2017/4/7.
 * 描述：
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FileUtils.createOrExistsDir(ExampleConfig.PIC_DIR_NAME);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
