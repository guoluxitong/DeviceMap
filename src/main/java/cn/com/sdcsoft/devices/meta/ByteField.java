package cn.com.sdcsoft.devices.meta;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.IntCommand;

import java.util.HashMap;

/**
 * Created by jialiang on 2018/4/19.
 */

public abstract class ByteField {
    private String name;
    private String unit;
    private String title;
    protected int startIndex;
    private int bytesLength, baseNumber;
    protected int bit;
    private boolean needFormat = false;
    protected HashMap<Integer, String> valueMap;

    public String getCommandKey() {
        return commandKey;
    }

    public void setCommandKey(String commandKey) {
        this.commandKey = commandKey;
    }

    /**
     * 写命令的Key
     */

    public Command getCommand() {
        IntCommand cmd = new IntCommand();
        cmd.setAddress(this.address);
        cmd.setMaxValue(this.maxValue);
        cmd.setMinValue(this.minValue);
        cmd.initValue(getValue());
        cmd.setTitle(this.getTitle());
        cmd.setUnit(this.getUnit());
        return cmd;
    }

    protected String commandKey;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 485内存地址
     */
    protected String address;

    protected Object maxValue,minValue;

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    protected boolean show = true;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return null == unit ? "" : unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public int getBytesLength() {
        return bytesLength;
    }

    public void setBytesLength(Integer bytesLength) {
        this.bytesLength = bytesLength;
    }

    public int getBaseNumber() {
        return baseNumber;
    }

    public void setBaseNumber(int baseNumber) {
        this.baseNumber = baseNumber;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    public void setValueMap(HashMap<Integer, String> valueMap) {
        this.valueMap = valueMap;
    }

    public abstract void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI);

    public abstract Object getValue();

    public String getValueBitString(){
        return String.format("%d",getValue());
    }
    public abstract boolean haveValue(byte... bytes);

    public String getValueString() {
        if (bytesLength > 0){//bytesLength>0表示点位在数据中真实存储
//            return String.format("%s%s",getValue().toString(), getUnit());
            return String.format("%s%s",getValueBitString(), getUnit());
        }
        //点位并不真实存在，而又其他点位计算而来。如NJRT_T2的运行天数和小时数 由运行总时间计算得出
        needFormat = true;
        return String.format("%%s%s", getUnit());
    }

//    public String getValueString() {
//        return String.format("%%s%s", getValue().toString(), getUnit());
//    }

    protected void setUIKey(){

    }
    public DeviceFieldForUI getDeviceFieldForUI()
    {
        DeviceFieldForUI fieldForUI = new DeviceFieldForUI();
        if(bytesLength < 1)//如果是要计算的点位对象
        {
            if (isShow())//如果要显示，则该点位对象为其类型所对应的key，该计算点位将包含在SdcsoftDevice对应的List集合中
            {
                setDeviceFieldForUIKey(fieldForUI);
            }
            else //如果无需显示，则该点位对象的key设置为SdcSoftDevice.KEY_Count_Fields，该点位将包含在该key对应的SdcsoftDevice的List集合中
            {
                fieldForUI.setKey(SdcSoftDevice.KEY_Count_Fields);
            }
        }
        else
        {
            setDeviceFieldForUIKey(fieldForUI);
        }
        fieldForUI.setName(getName());
        fieldForUI.setTitle(getTitle());
        fieldForUI.setValue(getValue());
        fieldForUI.setValueString(getValueString());
        fieldForUI.setNeedFormat(needFormat);
        fieldForUI.setUnit(getUnit());
        return fieldForUI;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title) {
        field.setName(name);
        field.setStartIndex(startIndex);
        field.setBytesLength(bytesLength);
        field.setTitle(title);
        return field;
    }

    /// <summary>
    /// 添加计算点位，isShow确定点位是否用来显示，默认为true
    /// </summary>
    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title,boolean isShow)
    {
        field.setName(name);
        field.setStartIndex(startIndex);
        field.setBytesLength(bytesLength);
        field.setTitle(title);
        field.show = isShow;
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, HashMap<Integer, String> valueMap) {
        Init(field, name, startIndex, bytesLength, title);
        field.setValueMap(valueMap);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, String unit) {
        Init(field, name, startIndex, bytesLength, title);
        field.setUnit(unit);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, int bit) {
        Init(field, name, startIndex, bytesLength, title);
        field.setBit(bit);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, int bit, HashMap<Integer, String> valueMap) {
        Init(field, name, startIndex, bytesLength, title,bit);
        field.setValueMap(valueMap);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, String unit, int baseNumber) {
        Init(field, name, startIndex, bytesLength, title, unit);
        field.setBaseNumber(baseNumber);
        return field;
    }

}
