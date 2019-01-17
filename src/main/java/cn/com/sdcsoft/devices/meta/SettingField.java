package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

import static cn.com.sdcsoft.devices.map.DevicePointMap.KEY_SETTING; /**
 * Created by jialiang on 2018/4/20.
 */

/**
 * 暂时不起作用，仅标识系统中应有设置参数区
 * 目前设置参数的解析过程与模拟量相同，但并不绝对，因此该类应该保留以备后续扩展
 * 当存在设置参数与模拟量不同的设备时，该类将参与到继承系统中
 */
public abstract class SettingField extends MockField {

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(KEY_SETTING);
    }
}
