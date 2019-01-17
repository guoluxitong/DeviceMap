package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.Element;
import cn.com.sdcsoft.devices.map.DevicePointMap;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CommandField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.*;

import static cn.com.sdcsoft.devices.map.DevicePointMap.*;

/**
 * Created by jialiang on 2018/4/19.
 * 锅炉设备必需要有燃料和介质两个点位，这两个点位并不需要在byte[]中
 */

public abstract class SdcSoftDevice implements Serializable {
    public static final int POWER_MEDIA_VALUE_NULL = -1;
    public static final String KEY_POINT_SYSTEM_STATUS = "o_system_status";
    public static final String KEY_POINT_POWER = "o_power";
    public static final String KEY_POINT_MEDIA = "o_media";
    public static final String KEY_POINT_RUN_LIFE = "ba_yunxingshijian";
    public static final String KEY_POINT_RUN_DAYS = "ba_yunxingtianshu";
    public static final String KEY_POINT_RUN_HOURS = "ba_yunxingxiaoshishu";


    public static final int Style_Horizontal = 0;
    public static final int Style_Vertical = 1;

    private HashMap<String, ArrayList<DeviceFieldForUI>> fieldMap = new HashMap<String, ArrayList<DeviceFieldForUI>>();

    public SdcSoftDevice() {
        fieldMap.put(KEY_BASE, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_EXCEPTION, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_MOCK, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_SETTING, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_DEVICE, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_START_STOP, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_OPEN_CLOSE, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_Count_Fields, new ArrayList<DeviceFieldForUI>());
    }

    private String deviceNo;
    private String nickName;
    private String deviceType;
    private Map<String, ArrayList<Command>> commandsMap;

    /**
     * 初始命令分组集合
     * 提供点位表中定义的命令集合传入接口
     */
    private void initCommandsMapKeys(Map<String, ArrayList<Command>> map){
        commandsMap = map;
    }

    public int getModbusNo() {
        return modbusNo;
    }

    public void setModbusNo(int modbusNo) {
        this.modbusNo = modbusNo;
    }

    /**
     * Modbus 设备编号
     */
    private int modbusNo = 1;

    /**
     * 设备字节长度
     */
    protected int BYTE_ARRAY_LENGTH;

    public int getDeviceBytesLength() {
        return BYTE_ARRAY_LENGTH;
    }

    public HashMap<String, ArrayList<DeviceFieldForUI>> getFieldMap() {
        return fieldMap;
    }

    public void setFieldMap(HashMap<String, ArrayList<DeviceFieldForUI>> fieldMap) {
        this.fieldMap = fieldMap;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    private void addCommand(String cmdGroupKey,Command cmd){
        if(commandsMap.containsKey(cmdGroupKey)){
            commandsMap.get(cmdGroupKey).add(cmd);
        }
    }
    /**
     * 添加数据点位
     * @param field meta数据点位对象
     */
    void addField(@NotNull ByteField field) {
        //需要剔除纯控制程序点位
        addField(field.getDeviceFieldForUI());
        //处理保护执行命令的点位
        if(null != field.getCommand()){
            addCommand(field.getCommandGroupKey(),field.getCommand());
        }
    }

    /**
     * 添加纯命令点位
     * @param field meta命令点位对象
     */
    private void addField(CommandField field) {
        addCommand(field.getCommandGroupKey(),field.getCommand());
    }

    private void addField(DeviceFieldForUI field) {
        if(null == field)
            return;
        if (fieldMap.containsKey(field.getKey()))
            fieldMap.get(field.getKey()).add(field);
    }

    public List<DeviceFieldForUI> getFieldsByGroupKey(String key) {
        if (fieldMap.containsKey(key))
            return fieldMap.get(key);
        return null;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public HashMap<String, DeviceFieldForUI> getBaseInfoFields() {
        return getFieldsMap((KEY_BASE));
    }

    public HashMap<String, DeviceFieldForUI> getDeviceFields() {
        return getFieldsMap((KEY_DEVICE));
    }

    public HashMap<String, DeviceFieldForUI> getExceptionFields() {
        return getFieldsMap((KEY_EXCEPTION));
    }

    public HashMap<String, DeviceFieldForUI> getMockFields() {
        return getFieldsMap((KEY_MOCK));
    }

    public HashMap<String, DeviceFieldForUI> getSettingFields() {
        return getFieldsMap((KEY_SETTING));
    }

    public HashMap<String, DeviceFieldForUI> getStartStopFields() {
        return getFieldsMap((KEY_START_STOP));
    }

    public HashMap<String, DeviceFieldForUI> getOpenCloseFields() {
        return getFieldsMap((KEY_OPEN_CLOSE));
    }

    HashMap<String, DeviceFieldForUI> getCountFields() {
        return getFieldsMap(KEY_Count_Fields);
    }

    protected DeviceFieldForUI getUiItem(HashMap<String, DeviceFieldForUI> map, String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }

    public int getExceptionCount() {
        return fieldMap.get(KEY_EXCEPTION).size();
    }

    private HashMap<String, DeviceFieldForUI> getFieldsMap(String fieldsGroupKey) {
        HashMap<String, DeviceFieldForUI> map = new HashMap<String, DeviceFieldForUI>();
        List<DeviceFieldForUI> list = fieldMap.get(fieldsGroupKey);
        for (DeviceFieldForUI deviceFieldForUI : list) {
            map.put(deviceFieldForUI.getName(), deviceFieldForUI);
        }
        return map;
    }

    public abstract void handleByteField(ByteField field, byte[] bytes);

    public abstract String handleDeviceNo(byte[] bytes);

    public abstract List<DeviceFieldForUI> getDeviceFocusFields();

    /**
     * 获取设备系统状态
     *
     * @return
     */
    public DeviceFieldForUI getDeviceStatus() {
        return getBaseInfoFields().get(KEY_POINT_SYSTEM_STATUS);
    }



    public void setPowerVal(int powerVal) {
        this.powerVal = powerVal;
    }


    public void setMediaVal(int mediaVal) {
        this.mediaVal = mediaVal;
    }

    protected int powerVal = POWER_MEDIA_VALUE_NULL, mediaVal = POWER_MEDIA_VALUE_NULL;


    private DeviceFieldForUI powerUI, mediaUI;

    /**
     * 获取设备燃料
     */
    public DeviceFieldForUI getPower() {
        return powerUI;
    }

    /**
     * 获取设备介质
     */
    public DeviceFieldForUI getMedia() {
        return mediaUI;
    }


    /**
     * 获取设备模式，可用于确定设备类型
     */
    public abstract int getMode();


    protected abstract int getPowerInfo();


    /**
     * 获取炉子元素信息
     */
    public Element getStoveElement() {
        return getStoveElement((Integer) getPower().getValue(), (Integer) getMedia().getValue());
    }

    /**
     * 获取炉子元素信息
     */
    private Element getStoveElement(int powerVal, int mediaVal) {
        getPower().setValue(powerVal);
        Element element = new Element();
        element.setPrefix(Element.Prefix_Stove);
        element.setTitle("锅炉");
        element.SetValues(Element.Index_A_Power, powerVal, mediaVal, Style_Horizontal, getPowerInfo());
        return element;
    }

    /**
     * 获取泵元素集合
     */
    public abstract List<Element> getBeng();

    /**
     * 获取风扇元素集合
     */
    public abstract List<Element> getFan();

    public boolean validateFalse(int bytesLength) {
        return BYTE_ARRAY_LENGTH > bytesLength;
    }

    /**
     * 设备命令集合
     */
    public Map<String,ArrayList<Command>> getCommands() {
        String modbusNoString = String.format("%02x",getModbusNo());
        for (ArrayList<Command> cmds : commandsMap.values()){
            for (Command cmd : cmds){
                cmd.setModbusNo(modbusNoString);
            }
        }
        return commandsMap;
    }

    protected class MyArrayList<E> extends ArrayList<E> {
        @Override
        public boolean add(E e) {
            return null == e || super.add(e);
        }
    }

    protected interface Media {
        int ReShui = 0;
        int ZhengQi = 1;
        int DaoReYou = 2;
        int ReFeng = 3;
        int ZhenKong = 4;
    }

    protected interface Power {
        int YouQi = 0;
        int Dian = 1;
        int Mei = 2;
        int ShengWuZhi = 3;
        int YuRe = 30;
    }

    public static class DeviceAdapterUtil {
        private static final String DEVICE_POWER_MEDIA_MAP_PACKAGE_PATH = "cn.com.sdcsoft.devices.map.%sDevicePointMap";
        private static final String STRING_FORMAT_DEVICE_MAP_PACKAGE_PATH = "cn.com.sdcsoft.devices.map.%sDevicePointMap_%s";
        private static final String STRING_FORMAT_DEVICE_PACKAGE_PATH = "cn.com.sdcsoft.devices.Device_%s";
        private static ArrayList<SdcSoftDevice> devices;
        private static HashMap<String, DevicePointMap> maps;

        private static String getMediaString(int key) {
            if (coms_media.containsKey(key)) {
                return coms_media.get(key);
            }
            return null;
        }

        private static String getPowerString(int key) {
            if (coms_power.containsKey(key)) {
                return coms_power.get(key);
            }
            return null;
        }

        private static String locale = null;

        static {
            devices = new ArrayList<SdcSoftDevice>(10);
            maps = new HashMap<String, DevicePointMap>(5);
        }

        public static void initLocale(String localeName){
            locale = getLocaleString(localeName);
        }

        @Contract("null -> !null")
        private static String getLocaleString(String localeName) {
            return null == localeName ? "zh_cn." : String.format("%s.", localeName.replace('-', '_'));
        }


        /**
         * 预加载设备列表，仅适合设备数量较少的应用使用（手机APP）。
         * 对于展示成百上千的设备而言，不应进行设备预加载操作。         *
         */
        public static SdcSoftDevice putDevices(String typeName, String deviceNo, int powerVal, int mediaVal) throws Exception {
            SdcSoftDevice device = putDevice(typeName, locale);
            device.setDeviceNo(deviceNo);
            device.setPowerVal(powerVal);
            device.setMediaVal(mediaVal);
            return device;
        }

        private static SdcSoftDevice putDevice(String typeName, String LocaleName) throws Exception {
            Class deviceClazz = Class.forName(String.format(Locale.CHINA, STRING_FORMAT_DEVICE_PACKAGE_PATH, typeName));
            if (!maps.containsKey(typeName)) {
                Class mapClazz = Class.forName(String.format(Locale.CHINA, STRING_FORMAT_DEVICE_MAP_PACKAGE_PATH, LocaleName, typeName));
                DevicePointMap devicePointMap = (DevicePointMap) mapClazz.newInstance();
                maps.put(typeName, devicePointMap);
            }
            SdcSoftDevice device = (SdcSoftDevice) deviceClazz.newInstance();
            device.setDeviceType(typeName);
            //初始化commandMap，将点位表中定义的命令集合传入Device对象同时设备命令多语言定义移植到点位表中
            device.initCommandsMapKeys(maps.get(typeName).getCommandsMap());
            devices.add(device);
            return device;
        }

        public static void clearDevicesType() {
            devices.clear();
            maps.clear();
        }

        /**
         * 获得设备列表的所有设备数据信
         * */
        public static List<SdcSoftDevice> getDevicesByByte(byte[] bytes) throws Exception {
            if (devices.size() < 1) {
                throw new Exception("请先执行DeviceAdapterUtil.putDevices方法，放入准备用于解析的设备信息。");
            }
            int byteStartIndex = 0;
            for (SdcSoftDevice device : devices) {
                initDevice(device, bytes, byteStartIndex);
                byteStartIndex += device.getDeviceBytesLength();
            }
            return devices;
        }

        /**
         *  replace by <code>getDeviceByByte(byte[] bytes, SdcSoftDevice device)</code>
         */
        @Deprecated
        public static SdcSoftDevice getDeviceByByte(byte[] bytes, String typeName) {
            return getDeviceByByte(bytes, typeName, SdcSoftDevice.POWER_MEDIA_VALUE_NULL, SdcSoftDevice.POWER_MEDIA_VALUE_NULL);
        }
        public static SdcSoftDevice getDeviceByByte(byte[] bytes, SdcSoftDevice device) {
            if(null != device){
                initDevice(device,bytes,0);
            }
            return device;
        }
        private static SdcSoftDevice getDeviceByByte(byte[] bytes, String typeName, int powerVal, int mediaVal) {
            SdcSoftDevice device = null;
            try {
                Class clazz = Class.forName(String.format(Locale.CHINA, STRING_FORMAT_DEVICE_PACKAGE_PATH, typeName));
                device = (SdcSoftDevice) clazz.newInstance();
                if (device.validateFalse(bytes.length)) {
                    return null;
                }
                device.handleDeviceNo(bytes);
                clazz = Class.forName(String.format(Locale.CHINA, STRING_FORMAT_DEVICE_MAP_PACKAGE_PATH, locale, typeName));
                DevicePointMap devicePointMap = (DevicePointMap) clazz.newInstance();

                if (devicePointMap == null)
                    return null;
                for (String key : devicePointMap.getPointMap().keySet()) {
                    ByteField f = devicePointMap.getPointMap().get(key);
                    device.handleByteField(f, bytes);
                }
                device.setPowerVal(powerVal);
                device.setMediaVal(mediaVal);
                handlerDevice(device);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return device;
        }
        private static void initDevice(SdcSoftDevice device, byte[] bytes, int byteStartIndex) {
            initDevice(device, bytes, byteStartIndex, SdcSoftDevice.POWER_MEDIA_VALUE_NULL, SdcSoftDevice.POWER_MEDIA_VALUE_NULL);
        }
        private static void initDevice(@NotNull SdcSoftDevice device, @NotNull byte[] bytes, int byteStartIndex, int powerVal, int mediaVal) {
            int endIndex = byteStartIndex + device.getDeviceBytesLength();
            byte[] current;
           //校验数据长度有效性
            if (bytes.length < endIndex)
                return;
            else if(bytes.length > device.getDeviceBytesLength()){
                //byte 数组裁剪

                current = new byte[device.getDeviceBytesLength()];
                for (int i = 0, j = byteStartIndex; j < endIndex; i++, j++) {
                    current[i] = bytes[j];
                }
            }else {
                current = bytes;
            }

            //填充设备信息
            DevicePointMap devicePointMap = maps.get(device.getDeviceType());
            device.handleDeviceNo(current);
            for (String key : devicePointMap.getPointMap().keySet()) {
                if(key.equals("_xunhuanbeng")){
                    System.out.println("fdsa");
                }
                ByteField f = devicePointMap.getPointMap().get(key);
                device.handleByteField(f, current);
            }

            device.setPowerVal(powerVal);
            device.setMediaVal(mediaVal);
            handlerDevice(device);
        }
        private static void handlerDevice(@NotNull SdcSoftDevice device) {
            DeviceFieldForUI powerUI = device.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_POWER);
            DeviceFieldForUI MediaUI = device.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_MEDIA);

            device.powerUI = powerUI;
            device.mediaUI  = MediaUI;

            if (device.powerVal != SdcSoftDevice.POWER_MEDIA_VALUE_NULL &&
                    device.mediaVal != SdcSoftDevice.POWER_MEDIA_VALUE_NULL) {
                //设备中需要显示的点位都必须出现在点位表中，即使同过header传递的点位也必需在点位表中设置。
                //只有出现在点位表中的点位才能进行多语言转换，如燃料。如果“燃料”不在点位表中添加，则“燃料”
                // 的多语言翻译无法在程序中确认。
                device.powerUI.setValue(device.powerVal);
                device.powerUI.setValueString(getPowerString(device.powerVal));

                device.mediaUI.setValue(device.mediaVal);
                device.mediaUI.setValueString(getMediaString(device.mediaVal));
            }else{
                device.powerVal = (Integer)  device.powerUI.getValue();
                device.mediaVal = (Integer)  device.mediaUI.getValue();
            }
        }
    }
}
