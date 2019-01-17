package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Device_PLC_RanYou extends Device_PLC {


    public static final String KEY_POINT_RAN_SHAO_QI_STATUS = "ba_ranshaoqizhuangtai";

    @Override
    protected int getPowerInfo()
    {
        return (Integer) getBaseInfoFields().get(KEY_POINT_RAN_SHAO_QI_STATUS).getValue();
    }
}