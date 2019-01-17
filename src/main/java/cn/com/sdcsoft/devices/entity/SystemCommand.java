package cn.com.sdcsoft.devices.entity;

import cn.com.sdcsoft.devices.SdcSoftDevice;

import java.io.Serializable;

public class SystemCommand extends IntCommand implements Serializable {
    public SystemCommand(){
        this.valueType = SYSTEM_VALUE;
        valueIsSet  = false;
    }
}
