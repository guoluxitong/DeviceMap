package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_CTL_NJRT_E3_DianReShui extends Device_CTL_NJRT_E3_Dian {

    public Device_CTL_NJRT_E3_DianReShui() {
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
        int count = getJiaReZuCount();
        field.setValue(count);
        list.add(field);


        list.add(getUiItem(this.getMockFields(), "mo_chushuiwendu"));
        list.add(getUiItem(this.getMockFields(), "mo_huishuiwendu"));

        return list;
    }

}
