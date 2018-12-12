package cn.com.sdcsoft.devices.map;


import cn.com.sdcsoft.devices.meta.ByteField;

import java.util.HashMap;


/**
 * Created by jialiang on 2018/4/20.
 */

public abstract class DevicePointMap {
    protected HashMap<String, ByteField> map = new HashMap();

    public HashMap<String, ByteField> getPointMap() {
        return map;
    }

    public static HashMap<Integer, String> coms_media ;
    public static HashMap<Integer, String> coms_power ;
}
