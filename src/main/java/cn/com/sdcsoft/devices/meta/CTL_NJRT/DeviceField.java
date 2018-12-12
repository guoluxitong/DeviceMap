package cn.com.sdcsoft.devices.meta.CTL_NJRT;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

public class DeviceField extends OpenCloseField {
    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(SdcSoftDevice.KEY_DEVICE);
    }
}
