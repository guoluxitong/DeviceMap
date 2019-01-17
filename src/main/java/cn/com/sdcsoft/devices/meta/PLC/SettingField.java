package cn.com.sdcsoft.devices.meta.PLC;

import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.FloatCommand;
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

    @Override
    protected Command createCommandAndInitValue() {
        FloatCommand cmd = new FloatCommand();
        cmd.initValue(getValue());
        return cmd;
    }
}
