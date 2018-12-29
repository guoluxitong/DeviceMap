package cn.com.sdcsoft.devices.meta;

import cn.com.sdcsoft.devices.SdcSoftDevice;

/**
 * 需要计算的点位
 */
public class CountField extends ByteField {
    int value = 0;

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(SdcSoftDevice.KEY_Count_Fields);
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public boolean haveValue(byte... bytes) {
        return true;
    }
}
