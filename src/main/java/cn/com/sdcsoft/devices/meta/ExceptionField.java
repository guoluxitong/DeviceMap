package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

import static cn.com.sdcsoft.devices.map.DevicePointMap.KEY_EXCEPTION;

/**
 * Created by jialiang on 2018/4/19.
 */

public abstract class ExceptionField extends ByteField {
    protected int value;

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(KEY_EXCEPTION);
    }
}
