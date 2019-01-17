package cn.com.sdcsoft.devices.meta.CTL_NJZJ;


import cn.com.sdcsoft.devices.SdcSoftDevice;
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
}
