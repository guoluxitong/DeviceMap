package cn.com.sdcsoft.devices.meta;

import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.IntCommand;
import org.jetbrains.annotations.NotNull;

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

    protected abstract void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI);

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

    public DeviceFieldForUI getDeviceFieldForUI()
    {
        DeviceFieldForUI fieldForUI = new DeviceFieldForUI();
        setDeviceFieldForUIKey(fieldForUI);
        fieldForUI.setName(getName());
        fieldForUI.setTitle(getTitle());
        fieldForUI.setValue(getValue());
        fieldForUI.setValueString(getValueString());
        fieldForUI.setNeedFormat(needFormat);
        fieldForUI.setUnit(getUnit());
        return fieldForUI;
    }

    /// <summary>
    /// 添加计算并显示的点位
    /// </summary>
    public static ByteField Init(@NotNull String groupKey, CountShowField field, String name, String title)
    {
        field.setName(name);
        field.setTitle(title);
        field.groupKey = groupKey;
        return field;
    }
    public static ByteField Init(@NotNull String groupKey, CountShowField field, String name, String title,String unit)
    {
        Init(groupKey,field,name,title);
        field.setUnit(unit);
        return field;
    }

    /// <summary>
    /// 添加计算不显示的点位
    /// </summary>
    public static ByteField Init(CountField field, String name, String title)
    {
        field.setName(name);
        field.setTitle(title);
        return field;
    }

    /// <summary>
    /// 添加计算不显示的点位
    /// </summary>
    public static ByteField Init(FixedValueField field, String name, String title,int value, HashMap<Integer, String> valueMap)
    {
        field.setName(name);
        field.setTitle(title);
        field.setValue(value);
        field.setValueMap(valueMap);
        return field;
    }


    /// <summary>
    /// 添加显示点位
    /// </summary>
    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title)
    {
        field.setName(name);
        field.setStartIndex(startIndex);
        field.setBytesLength(bytesLength);
        field.setTitle(title);
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
