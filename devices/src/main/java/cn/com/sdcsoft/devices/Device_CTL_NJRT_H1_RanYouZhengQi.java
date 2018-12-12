package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static cn.com.sdcsoft.devices.Device_CTL_NJRT_T2.KEY_POINT_Add_SHUI_BENG;
/**
 * Created by 田斌 on 2018/12/10 0010.
 */
public class Device_CTL_NJRT_H1_RanYouZhengQi extends Device_CTL_NJRT_H1_RanYou {
    public Device_CTL_NJRT_H1_RanYouZhengQi() {
        BYTE_ARRAY_LENGTH = 57;
    }
    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();
        Integer i = (Integer) this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_LIFE).getValue();
        DeviceFieldForUI field = this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS);
        field.setValue(i / 24);
        list.add(field);
        field = this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS);
        field.setValue(i % 24);
        list.add(field);

        field = getCountFields().get(KEY_POINT_RAN_SHAO_QI);
        list.add(field);

        list.add(getUiItem(this.getMockFields(), "mo_zhengqiyali"));
        return list;
    }
}
