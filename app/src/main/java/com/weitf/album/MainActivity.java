package com.weitf.album;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.weitf.album.photo.TakePhotoActivity;
import com.weitf.album.photo.ThumbBean;

import java.util.List;

import pub.devrel.easypermissions.EasyPermissions;

/**
 * .::::.
 * .::::::::.
 * :::::::::::  FUCK YOU
 * ..:::::::::::'
 * '::::::::::::'
 * .::::::::::
 * '::::::::::::::..
 * ..::::::::::::.
 * ``::::::::::::::::
 * ::::``:::::::::'        .:::.
 * ::::'   ':::::'       .::::::::.
 * .::::'      ::::     .:::::::'::::.
 * .:::'       :::::  .:::::::::' ':::::.
 * .::'        :::::.:::::::::'      ':::::.
 * .::'         ::::::::::::::'         ``::::.
 * ...:::           ::::::::::::'              ``::.
 * ```` ':.          ':::::::::'                  ::::..
 * '.:::::'                    ':'````..
 */
public class MainActivity extends TakePhotoActivity implements EasyPermissions.PermissionCallbacks {
    ImageView imgPhoto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        methodRequiresTwoPermission();
        findViewById(R.id.camerBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePhotoFromCamera();
            }
        });
        findViewById(R.id.albumBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePhotoFromAlbum();
            }
        });
        imgPhoto = (ImageView) findViewById(R.id.imgPhoto);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void doGetThumb(ThumbBean thumBean) {
        if (thumBean != null) {
            imgPhoto.setImageBitmap(thumBean.getBitmap());
        }
    }

    private void methodRequiresTwoPermission() {
        String[] perms = {android.Manifest.permission.CAMERA, android.Manifest.permission.READ_EXTERNAL_STORAGE, android.Manifest.permission.WRITE_EXTERNAL_STORAGE};
        if (EasyPermissions.hasPermissions(this, perms)) {

        } else {
            EasyPermissions.requestPermissions(this, "camera_and_read_storage", 1010, perms);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    /**
     * 下面两个方法是实现EasyPermissions的EasyPermissions.PermissionCallbacks接口
     * 分别返回授权成功和失败的权限
     *
     * @param requestCode
     * @param perms
     */
    @Override
    public void onPermissionsGranted(int requestCode, List<String> perms) {
        Log.i(TAG, "获取成功的权限" + perms);
        takePhotoFromCamera();
    }

    @Override
    public void onPermissionsDenied(int requestCode, List<String> perms) {
        Log.i(TAG, "获取失败的权限" + perms);
    }
}
