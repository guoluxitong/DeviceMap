package cn.com.sdcsoft.devices.entity;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;
//import groovy.lang.GroovyShell;
//import groovy.lang.Script;
//import org.codehaus.groovy.control.CompilerConfiguration;
import java.io.Serializable;
//import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.HashMap;

//extends Script

public abstract class Command implements Serializable {
    /**
     * 时间型Min-Max Value的取值
     */

    public static final int INT_VALUE = 1;
    public static final int FLOAT_VALUE = 2;
    public static final int FLOAT_MAP_VALUE = 3;
    public static final int TIME_VALUE = 4;
    public static final int OPEN_CLOSE_VALUE = 5;
    public static final int SYSTEM_VALUE = 6;

    public Command(){

    }

    protected String name;
    protected String address;
    protected String valueString;
    protected String value;

    public void setModbusNo(String modbusNo) {
        this.modbusNo = modbusNo;
    }

    protected String getModbusNo() {
        return modbusNo;
    }

    private String modbusNo;
    public void setUnit(String unit) {
        this.unit = unit;
    }

    protected String unit;

    public void setTitle(String title) {
        this.title = title;
    }

    protected String title;
    protected String action = "06";
    protected int valueType = INT_VALUE;
    protected boolean valueIsSet = false;

    public void setMaxValue(Object maxValue) {
        this.maxValue = maxValue;
    }

    public void setMinValue(Object minValue) {
        this.minValue = minValue;
    }

    protected Object maxValue, minValue;

    public void setScript(String script) {
        this.script = script;
    }

    protected String script;

    // = String.format("%02d%s%s",device.getModbusNo(), action,address)
    public void setAddress(String address) {
        this.address = address;
    }

    public int getValueType() {
        return valueType;
    }

    public Object getMaxValue() {
        return maxValue;
    }

    public Object getMinValue() {
        return minValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //this.title = name;
    }

    public void initValue(Object... values) {
        handleValue(values);
    }

    public void setValue(Object... values) throws Exception{
        if(null == values)
            return;
        if(null == values[0])
            return;
        handleValue(values);
        valueIsSet = true;
    }

    public String getValueString() {
        return valueString;
    }

    public String getTitle() {
        return title;
    }

    public String getUnit() {
        return unit;
    }

    public abstract void handleValue(Object... value);

    public abstract String convertToString();

    public String getCommandString() {
        if (valueIsSet) {
            valueIsSet = false;
            String str = convertToString();
            valueString = "";
            return str.toUpperCase();
        }
        return "";
    }

    //@Contract("null -> !null")
    public static byte[] toBytes(String str) {
        if (str != null && str.length() != 0) {
            byte[] bytes = new byte[str.length() / 2];
            for (int i = 0; i < str.length() / 2; i++) {
                String subStr = str.substring(i * 2, i * 2 + 2);
                bytes[i] = (byte) Integer.parseInt(subStr, 16);
            }
            return bytes;
        }
        return new byte[0];
    }

    public static int hexStringToInteger(String hexString) {
        return Integer.valueOf(hexString, 16);
    }

    public static String integerToHexString(int x) {
        return String.format("%04x", x);
    }

    public static byte[] intToBytes4(int n) {
        byte[] b = new byte[4];
        for (int i = 0; i < 4; i++) {
            b[i] = (byte) (n >> (24 - i * 8));
        }
        return b;
    }

    //    @Override
//    public Object run() {
//        return null;
//    }
    private void initCommand(String name, String address, Object maxValue, Object minValue) throws Exception {
        this.setName(name);
        this.setAddress(address);
        this.setMinValue(minValue);
        this.setMaxValue(maxValue);
    }

    public void initCommand(String name, String address, Object maxValue, Object minValue, Object value) throws Exception {
        initCommand(name, address, maxValue, minValue);
        this.initValue(value);
    }

    protected Object evalScriptText(String valueString) throws Exception {
        Object obj = null;
//        CompilerConfiguration cfg = new CompilerConfiguration();
//        cfg.setScriptBaseClass(Command.class.getName());
//        GroovyShell shell = new GroovyShell(cfg);
//        shell.setVariable("valueString", valueString);
//        shell.setVariable("result","");
//
//
//        Script script = shell.parse(this.script);
//        script.run();
//
//        obj = shell.getVariable("result");
//        script = null;
//        shell = null;

        return obj;
    }
}