package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Element;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class Device_CTL_HNWE_485 extends Device_CTL_HNWE {
    public Device_CTL_HNWE_485(){
        BYTE_ARRAY_LENGTH = 58;
    }
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();
        list.add(getUiItem(this.getMockFields(), "mo_CHgongshuiwendu"));
        list.add(getUiItem(this.getMockFields(), "mo_CHhuishuiwendu"));
        list.add(getUiItem(this.getMockFields(), "mo_OTCwendu"));
        return list;
    }
}
