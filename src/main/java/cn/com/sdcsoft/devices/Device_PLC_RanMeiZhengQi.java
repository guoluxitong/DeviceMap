package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_PLC_RanMeiZhengQi extends Device_PLC {
    public Device_PLC_RanMeiZhengQi() {
        BYTE_ARRAY_LENGTH = 490;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();

        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS));
        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS));

        if (this.getBaseInfoFields().containsKey("mo_zhengqiyali")) {
            list.add(this.getBaseInfoFields().get("mo_zhengqiyali"));
        } else {
            list.add(getUiItem(this.getMockFields(),"ba_guoluyalizhuangtai"));
        }
        list.add(getUiItem(this.getMockFields(),"mo_zuizhongpaiyanwendu"));
        list.add(getUiItem(this.getBaseInfoFields(),"ba_shuiweizhuangtai"));

        return list;
    }
    private static final String KEY_POINT_YIN_FENG_JI = KEY_POINT_YIN_FENG_FAN_1;

    @Override
    protected int getPowerInfo() {
        return (Integer) getDeviceFields().get(KEY_POINT_YIN_FENG_JI).getValue()>0x7F?1:0;
    }
}
