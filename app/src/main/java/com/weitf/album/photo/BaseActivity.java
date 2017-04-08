package com.weitf.album.photo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by weitf
 * Email:weitengfei0212@gmail.com
 * On 2017/4/7.
 * 描述：
 */
public abstract class BaseActivity extends AppCompatActivity {
    public Context context;
    public static final String TAG = "default_tag";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());//把设置布局文件的操作交给继承的子类
        context = this;
    }
    /**
     * 返回当前Activity布局文件的id
     * @return
     */
    abstract protected int getLayoutResId();
}
