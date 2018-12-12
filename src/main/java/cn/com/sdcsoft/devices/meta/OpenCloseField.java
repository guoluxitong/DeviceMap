package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

/**
 * Created by jialiang on 2018/4/19.
 */

public abstract class OpenCloseField extends ByteField {
    protected int value;

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(SdcSoftDevice.KEY_OPEN_CLOSE);
    }
}
