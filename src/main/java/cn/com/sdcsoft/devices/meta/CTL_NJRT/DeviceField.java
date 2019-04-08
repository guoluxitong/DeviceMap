package cn.com.sdcsoft.devices.meta.CTL_NJRT;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.SystemCommand;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import static cn.com.sdcsoft.devices.map.DevicePointMap.KEY_DEVICE;

public class DeviceField extends OpenCloseField {
    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(KEY_DEVICE);
    }

    @Override
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
    public Command getCommand() {
        SystemCommand cmd = new SystemCommand();
        cmd.setAddress(this.address);
        cmd.setMaxValue(this.maxValue);
        cmd.setMinValue(this.minValue);
        cmd.initValue(value);
        cmd.setTitle(this.getTitle());
        return cmd;
    }
}
