package cn.com.sdcsoft.devices.entity;

import cn.com.sdcsoft.devices.SdcSoftDevice;


public class TimeCommand extends IntCommand {
    public TimeCommand() {
        this.valueType = Command.TIME_VALUE;
        this.script = "strs = valueString.split(':');" +
                "reslut = integerToHexString(strs[0].toInteger()*60+strs[1].toInteger());";
    }

    @Override
    public void handleValue(Object... values){
        //value = evalScriptText(valueString).toString();
        //String[] strs = values.toString().split(":");
        //this.value =integerToHexString(Integer.parseInt(strs[0])*60+Integer.parseInt(strs[1]));
        int h = (Integer) values[0];
        int m = (Integer) values[1];
        valueString = String.format("%02d:%02d", h, m);
        this.value = integerToHexString(h * 60 + m);
    }
    /**
     * NJZJ IP设备时间计算 Groovy,仅仅计算出value即可
     * "strs = valueString.split(':');" +
     * "value = integerToHexString(strs[0].toInteger()*60+strs[1].toInteger());"
     */
}
