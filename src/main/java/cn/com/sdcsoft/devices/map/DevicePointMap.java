package cn.com.sdcsoft.devices.map;

import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CommandField;

import java.util.*;


/**
 * Created by jialiang on 2018/4/20.
 */

public abstract class DevicePointMap {
    public static final String KEY_BASE = "baseInfo";
    public static final String KEY_RUN = "runInfo";
    public static final String KEY_EXCEPTION = "exceptionInfo";
    public static final String KEY_MOCK = "mockInfo";
    public static final String KEY_SETTING = "settingInfo";
    public static final String KEY_START_STOP = "startStopInfo";
    public static final String KEY_DEVICE = "deviceInfo";
    public static final String KEY_OPEN_CLOSE = "openclose";
    /**
     * 计算属性的KEY
     */
    public static final String KEY_Count_Fields = "countfields";

    public static final String KEY_POINT_SYSTEM_STATUS = "o_system_status";
    public static final String KEY_POINT_POWER = "o_power";
    public static final String KEY_POINT_MEDIA = "o_media";
    public static final String KEY_POINT_RUN_LIFE = "ba_yunxingshijian";
    public static final String KEY_POINT_RUN_DAYS = "ba_yunxingtianshu";
    public static final String KEY_POINT_RUN_HOURS = "ba_yunxingxiaoshishu";


    protected HashMap<String, ByteField> map = new HashMap<String, ByteField>();

    protected LinkedHashMap<String,ArrayList<CommandField>> commandsMap = new LinkedHashMap<String, ArrayList<CommandField>>();
    public HashMap<String, ByteField> getPointMap() {
        return map;
    }
    public Map<String, ArrayList<Command>> getCommandsMap() {
        LinkedHashMap<String,ArrayList<Command>> tempMap = new LinkedHashMap<String, ArrayList<Command>>(commandsMap.size());
        for(String key: commandsMap.keySet()){
            ArrayList<Command> list = null;
            if(null != commandsMap.get(key)){
                list = new ArrayList<Command>(commandsMap.get(key).size());
                for(CommandField field : commandsMap.get(key)){
                    list.add(field.getCommand());
                }
            }else {
                list = new ArrayList<Command>(10);
            }
            tempMap.put(key,list);
        }
        return tempMap;
    }


    public static HashMap<Integer, String> coms_media ;
    public static HashMap<Integer, String> coms_power ;
}
