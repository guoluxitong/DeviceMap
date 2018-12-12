package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

/**
 * Created by jialiang on 2018/4/20.
 */

public abstract class DeviceField extends ByteField {

    protected int value = 0;

    @Override
    public Object getValue() {
//        return String.format(Locale.CHINA,"%s %d",sb.toString(),value);
        //return String.format(Locale.CHINA,"%s",sb.toString());
        return value;
    }

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(SdcSoftDevice.KEY_DEVICE);
    }
}
