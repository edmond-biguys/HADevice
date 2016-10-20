package com.hadevice;

import java.util.Map;

/**
 * Created by cjj on 16/10/20.
 */
public class CameraA extends BaseCamera {

    public CameraA() {
        // mOperator的实例化

    }


    public void record(Map<String, Object> command) {
        System.out.print("this is CameraA!");
//        mOperator
    }
}
