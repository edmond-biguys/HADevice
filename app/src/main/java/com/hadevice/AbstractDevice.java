package com.hadevice;

import java.util.Map;

/**
 * Created by cjj on 16/10/20.
 */
public abstract class AbstractDevice {

    public int deviceId;//设备Id
    public int ability;//设备网络连接能力
    public Map<String, Object> command;//执行命令


    public AbstractOperator mOperator;


}
