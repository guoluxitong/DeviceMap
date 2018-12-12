package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_PLC_RanYouZhengQi extends Device_PLC_RanYou {
    public Device_PLC_RanYouZhengQi()
    {
        BYTE_ARRAY_LENGTH = 490;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();

        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS));
        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS));

        list.add(getUiItem(this.getBaseInfoFields(),"ba_shuiweizhuangtai"));
        list.add(getUiItem(this.getMockFields(),"mo_zuizhongpaiyanwendu"));

        if(this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")){
            list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
        }else{
            list.add(getUiItem(this.getMockFields(),"mo_zhengqiyali"));
        }

        return list;
    }
}

