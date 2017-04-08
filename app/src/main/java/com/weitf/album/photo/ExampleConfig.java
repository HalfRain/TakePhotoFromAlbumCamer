package com.weitf.album.photo;

import android.os.Environment;

/**
 * Created by weitf
 * Email:weitengfei0212@gmail.com
 * On 2017/4/7.
 * 描述：
 */

public class ExampleConfig {
    public static final String SDCARD_PATH = Environment.getExternalStorageDirectory().toString();
    public static final String BASE_NAME = "CamerAlbum";
    public static final String BASE_DIR_NAME = "/" + BASE_NAME + "/";
    public static final String PIC_NAME = "PIC_FILE";
    public static final String PIC_DIR_NAME = BASE_DIR_NAME + PIC_NAME + "/";
}
