package cn.com.sdcsoft.devices.entity;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;
import cn.com.sdcsoft.devices.utils.CRC16Util;

import java.util.ArrayList;
import java.util.HashMap;

public class Command {
    /**
     * 时间型Min-Max Value的取值
     */
    public static final int INT_VALUE = 1;
    public static final int FLOAT_VALUE = 2;
    public static final int TIME_VALUE = 3;

    private Command(){

    }
    private String name, cmdPart,value,unit,title;
    private int valueType = INT_VALUE,maxValue,minValue;
    private SdcSoftDevice device;


    void setCmdPart(String cmdPart){
        this.cmdPart = String.format("%02d%s",device.getModbusNo(),cmdPart);
    }

    public int getValueType(){
        return valueType;
    }
    public int getMaxValue() {
        return maxValue;
    }

    void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String valueString){
        if(TIME_VALUE == valueType){
            String[] strs = valueString.split(":");
            value = String.format("%04x",Integer.parseInt(strs[0])*60+Integer.parseInt(strs[1]));
        }else {
            value = String.format("%04x",Integer.parseInt(valueString));
        }
        cmdPart += value;
    }

    private void setFieldsByDeviceUiFields() throws Exception {
        if(null == device)
            throw new Exception("need to set one instance of SdcSoftDevice for the command");

        HashMap<String,ArrayList<DeviceFieldForUI>> map = device.getFieldMap();
        for(String key : map.keySet()){
            for (DeviceFieldForUI ui : map.get(key))
            {
                if(ui.getName().equals(this.name)){
                    title = ui.getTitle();
                    unit = ui.getUnit();
                }
            }
        }
    }

    public String getTitle() throws Exception {
        if(null == title || title.length() == 0){
            setFieldsByDeviceUiFields();
        }
        return title;
    }

    public String getUnit() throws Exception {
        if(null == unit || unit.length() == 0){
            setFieldsByDeviceUiFields();
        }
        return title;
    }

    public String getCommandString(){
        if(cmdPart.length() != 12)
            return "";
        byte[] data = toBytes(cmdPart);
        return  cmdPart + CRC16Util.getCrc(CRC16Util.calcCrc16(data));
    }

    private byte[] toBytes(String str) {
        if(str == null || str.trim().equals("")) {
            return new byte[0];
        }

        byte[] bytes = new byte[str.length() / 2];
        for(int i = 0; i < str.length() / 2; i++) {
            String subStr = str.substring(i * 2, i * 2 + 2);
            bytes[i] = (byte) Integer.parseInt(subStr, 16);
        }

        return bytes;
    }

    public static Command getInstance(
            SdcSoftDevice device, String name, String cmdPart,int valueType, int minValue, int maxValue
    ){
        Command command = new Command();
        command.device = device;
        command.name = name;
        command.valueType = valueType;
        command.minValue = minValue;
        command.maxValue = maxValue;
        command.setCmdPart(cmdPart);
        return command;
    }
}
