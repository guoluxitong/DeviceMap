package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

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
        fieldForUI.setKey(SdcSoftDevice.KEY_START_STOP);
    }

}
