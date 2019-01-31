package cn.com.sdcsoft.devices.meta;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.map.DevicePointMap;

/**
 * 需要计算但不显示的点位
 */
public class CountField extends CountShowField {


    @Override
    public DeviceFieldForUI getDeviceFieldForUI() {
        return null;
    }

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(DevicePointMap.KEY_Count_Fields);
    }

    @Override
    public Object getValue() {
        return 0;
    }

    @Override
    public boolean haveValue(byte... bytes) {
        return true;
    }
}
