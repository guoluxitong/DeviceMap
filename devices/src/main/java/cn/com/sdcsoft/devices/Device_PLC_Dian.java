package cn.com.sdcsoft.devices;


import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.HashMap;

public abstract class Device_PLC_Dian extends Device_PLC {

    private static final String KEY_POINT_JIA_RE_ZU = "mo_qidongjiarezushu";

    @Override
    protected int getPowerInfo() {
        HashMap<String, DeviceFieldForUI> map = getMockFields();
        if (map.containsKey(KEY_POINT_JIA_RE_ZU))
            return ((Float) map.get(KEY_POINT_JIA_RE_ZU).getValue()).intValue() > 0 ? 1 : 0;
        return 0;
    }
}
