package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

/**
 * Created by jialiang on 2018/4/19.
 */

public abstract class MockField extends ByteField {
    protected float value;
    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public String getValueBitString(){
        return String.format("%.2f",getValue());
    }
    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(SdcSoftDevice.KEY_MOCK);
    }
}
