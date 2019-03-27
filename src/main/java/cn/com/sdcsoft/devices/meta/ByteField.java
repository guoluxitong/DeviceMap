package cn.com.sdcsoft.devices.meta;

import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.IntCommand;


import java.util.HashMap;

/**
 * Created by jialiang on 2018/4/19.
 */
public abstract class ByteField extends CommandField{
    protected int startIndex;
    private int bytesLength, baseNumber;
    protected int bit;
    private boolean needFormat = false;
    protected HashMap<Integer, String> valueMap;

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

    /**
    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    protected boolean show = true;

**/

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

    @Override
    protected Command createCommandAndInitValue() {
        IntCommand cmd = new IntCommand();
        cmd.initValue(getValue());
        return cmd;
    }

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
        if (getTitle().equals("报警")){
            fieldForUI.setTitle(getValueString());
        }else{
            fieldForUI.setTitle(getTitle());
        }
        fieldForUI.setValue(getValue());
        fieldForUI.setValueString(getValueString());
        fieldForUI.setNeedFormat(needFormat);
        fieldForUI.setUnit(getUnit());
        return fieldForUI;
    }

    public DeviceFieldForUI getDeviceFieldForUI(Object value)
    {
        DeviceFieldForUI fieldForUI = new DeviceFieldForUI();
        setDeviceFieldForUIKey(fieldForUI);
        fieldForUI.setName(getName());
        if (getTitle().equals("报警")){
            fieldForUI.setTitle(getValueString());
        }else{
            fieldForUI.setTitle(getTitle());
        }
        fieldForUI.setValue(value);
        fieldForUI.setValueString(getValueString());
        fieldForUI.setNeedFormat(needFormat);
        fieldForUI.setUnit(getUnit());
        return fieldForUI;
    }
    /**
     * 添加计算并显示的点位
     * @param groupKey 点位分组Key
     * @param field
     * @param name
     * @param title
     * @return
     */
    public static ByteField Init(String groupKey, CountShowField field, String name, String title)
    {
        field.setName(name);
        field.setTitle(title);
        field.setGroupKey(groupKey);
        return field;
    }
    public static ByteField Init(String groupKey, CountShowField field, String name, String title,String unit)
    {
        Init(groupKey,field,name,title);
        field.setUnit(unit);
        return field;
    }

    /**
     * 添加计算不显示的点位
     * @param field
     * @param name
     * @param title
     * @return
     */
    public static ByteField Init(CountField field, String name, String title)
    {
        field.setName(name);
        field.setTitle(title);
        return field;
    }

    /**
     * 添加固定值点位
     * @param field
     * @param name
     * @param title
     * @param value
     * @param valueMap
     * @return
     */
    public static ByteField Init(FixedValueField field, String name, String title,int value, HashMap<Integer, String> valueMap)
    {
        field.setName(name);
        field.setTitle(title);
        field.setValue(value);
        field.setValueMap(valueMap);
        return field;
    }

    /**
     * 添加普通显示点位
     * @param field
     * @param name
     * @param startIndex
     * @param bytesLength
     * @param title
     * @return
     */
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

    private static void initCommandInfo(ByteField field,String cmdGroupKey,String address,Object minValue,Object maxValue){
        field.setCommandGroupKey(cmdGroupKey);
        field.setAddress(address);
        field.setMinValue(minValue);
        field.setMaxValue(maxValue);
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, HashMap<Integer, String> valueMap,
    String cmdGroupKey,String address,Object minValue,Object maxValue) {
        Init(field, name, startIndex, bytesLength, title,valueMap);
        initCommandInfo(field,cmdGroupKey,address,minValue,maxValue);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, String unit) {
        Init(field, name, startIndex, bytesLength, title);
        field.setUnit(unit);
        return field;
    }
    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, String unit,
                                 String cmdGroupKey, String address,Object minValue,Object maxValue) {
        Init(field, name, startIndex, bytesLength, title,unit);
        initCommandInfo(field,cmdGroupKey,address,minValue,maxValue);
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

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, int bit, HashMap<Integer, String> valueMap,
                                String cmdGroupKey, String address,Object minValue,Object maxValue) {
        Init(field, name, startIndex, bytesLength, title,bit,valueMap);
        initCommandInfo(field,cmdGroupKey,address,minValue,maxValue);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, String unit, int baseNumber) {
        Init(field, name, startIndex, bytesLength, title, unit);
        field.setBaseNumber(baseNumber);
        return field;
    }

}
