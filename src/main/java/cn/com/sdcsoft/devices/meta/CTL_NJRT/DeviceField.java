package cn.com.sdcsoft.devices.meta.CTL_NJRT;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import static cn.com.sdcsoft.devices.map.DevicePointMap.KEY_DEVICE;

public class DeviceField extends OpenCloseField {
    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(KEY_DEVICE);
    }

    @Override
    public Object getValue() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
}
