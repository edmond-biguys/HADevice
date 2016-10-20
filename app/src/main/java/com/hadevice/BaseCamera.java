package com.hadevice;

import java.util.Map;

/**
 * Created by cjj on 16/10/20.
 */
public class BaseCamera extends AbstractDevice{

    public BaseCamera() {

        mOperator = new AbstractOperator() {
            @Override
            void startConfig() {

            }

            @Override
            void stopConfig() {

            }

            public void record(Map<String, Object> command) {

            }
        };



    }

    void record(Map<String, Object> command){};
    void photograph(){};
    void move(int action){};


}
