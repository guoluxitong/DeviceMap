package cn.com.sdcsoft.devices.entity;

import cn.com.sdcsoft.devices.SdcSoftDevice;

import java.io.Serializable;


public class IntCommand extends Command implements Serializable {

    public IntCommand(){
        valueType = Command.INT_VALUE;
    }

    @Override
    public void handleValue(Object... values) {
        Integer i = 0;
        if(values[0] instanceof Integer){
            i = (Integer)values[0];
        }else if(values[0] instanceof Float)
        {
            float x = (Float)values[0];
            i = (int)x;
        }
        valueString = i.toString();
        this.value = String.format("%04x",i);
    }

    @Override
    public String convertToString() {
        String baseStr =String.format(
                "%02x%s%s%s",
                getModbusNo(),
                action,
                address,
                value);
        byte[] data = toBytes(baseStr);
        return String.format("%s%s0000000000",baseStr , CRC16Util.getCrc(CRC16Util.calcCrc16(data)));
    }
}
