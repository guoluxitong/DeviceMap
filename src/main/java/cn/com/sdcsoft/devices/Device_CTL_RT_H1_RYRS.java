package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.HashMap;
import java.util.List;

/**
 *
 */
public class Device_CTL_RT_H1_RYRS extends Device_CTL_RT_H1_RY {
    public Device_CTL_RT_H1_RYRS() {
        BYTE_ARRAY_LENGTH = 358;
    }
    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        List<DeviceFieldForUI> list = super.getDeviceFocusFields();
        Integer i = (Integer) this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_LIFE).getValue();
        DeviceFieldForUI field = this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS);
        field.setValue(i/24);
        list.add(field);
        field = this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS);
        field.setValue(i%24);
        list.add(field);

        list.add(getUiItem(this.getMockFields(), "mo_chushuiwendu"));
        list.add(getUiItem(this.getMockFields(), "mo_huishuiwendu"));
        list.add(getUiItem(this.getMockFields(), "mo_paiyanwendu"));
        return list;
    }
}
