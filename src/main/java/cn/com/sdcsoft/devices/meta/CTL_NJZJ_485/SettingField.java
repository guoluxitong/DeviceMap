package cn.com.sdcsoft.devices.meta.CTL_NJZJ_485;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

/**
 * Created by jialiang on 2018/4/20.
 */

public class SettingField extends MockField {
    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(SdcSoftDevice.KEY_SETTING);
    }

}
