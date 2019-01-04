package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

import static cn.com.sdcsoft.devices.map.DevicePointMap.KEY_START_STOP;

/**
 * Created by jialiang on 2018/4/20.
 */

public abstract class StartStopField extends ByteField {

    protected int value;
    @Override
    public Object getValue() {
        //return String.format("%2d:%2d",hour,minute);
        return value;
    }

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(KEY_START_STOP);
    }

}
