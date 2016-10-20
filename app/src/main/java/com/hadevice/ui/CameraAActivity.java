package com.hadevice.ui;

import android.app.Activity;
import android.os.Bundle;

import com.hadevice.CameraA;

/**
 * Created by cjj on 16/10/20.
 */
public class CameraAActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CameraA cameraA = new CameraA();
        cameraA.record();
    }
}
