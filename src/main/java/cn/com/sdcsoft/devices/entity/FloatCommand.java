package cn.com.sdcsoft.devices.entity;


import cn.com.sdcsoft.devices.SdcSoftDevice;


import java.io.Serializable;
import java.text.DecimalFormat;

/**
 * 浮点型点位
 * 一个浮点型点位占4个字节，Modbus Rtu协议06一次只操作有一个字，因此该类型点位需要2条Modbus命令来完成
 */

public class FloatCommand extends Command implements Serializable {
    DecimalFormat decimalFormat=new DecimalFormat(".00");
    public FloatCommand(){

    }
    public FloatCommand(SdcSoftDevice device) {
        super(device);
        action = "10";
        valueType = FLOAT_VALUE;
    }

    @Override
    public void handleValue(Object... values){
        Float f = (Float)values[0];
        valueString = decimalFormat.format(f);
        byte[] data = intToBytes4(Float.floatToIntBits(f));
        this.value = String.format("%02x%02x%02x%02x",data[0],data[1],data[2],data[3]);
    }

    @Override
    public String convertToString() {
        String baseStr =String.format(
                "%s%s%s000204%s",
                String.format("%02x",device.getModbusNo()),
                action,
                address,
                value);
        byte[] data = toBytes(baseStr);
        return String.format("%s%s",baseStr , CRC16Util.getCrc(CRC16Util.calcCrc16(data)));
    }

    /**
     * address2 = integerToHexString(hexStringToInteger(address)+1)
     * deviceNo+action+address2+
     */
}
