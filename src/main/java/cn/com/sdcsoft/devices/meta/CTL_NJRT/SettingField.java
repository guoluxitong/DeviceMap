package cn.com.sdcsoft.devices.meta.CTL_NJRT;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.MockField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import static cn.com.sdcsoft.devices.map.DevicePointMap.KEY_SETTING;

/**
 * Created by jialiang on 2018/4/20.
 */

public class SettingField extends MockField {
    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(KEY_SETTING);
    }
    public boolean haveValue(byte... bytes) {
        value = (bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF;
        return true;
    }

    @Override
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
}
