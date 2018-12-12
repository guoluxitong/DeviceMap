package cn.com.sdcsoft.devices.meta.PLC;

/**
 * @author doudou
 * 基本信息类
 */
public class BaseInfoField extends cn.com.sdcsoft.devices.meta.BaseInfoField {
    @Override
    public boolean haveValue(byte... bytes) {
        value = ((bytes[0] & 0xFF) << 8) | (bytes[1] & 0xFF);

        return value != 0x7FFF;
    }

    @Override
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
}
