package cn.com.sdcsoft.devices.map;

import cn.com.sdcsoft.devices.meta.ByteField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by jialiang on 2018/4/20.
 */

public abstract class DevicePointMap {
    protected HashMap<String, ByteField> map = new HashMap();
    protected List<String> commandsMapKeys = new ArrayList<String>();

    public HashMap<String, ByteField> getPointMap() {
        return map;
    }

    public Object[] getCommandsMapKeys() {
        return commandsMapKeys.toArray();
    }

    public static HashMap<Integer, String> coms_media ;
    public static HashMap<Integer, String> coms_power ;
}
