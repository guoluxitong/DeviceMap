package cn.com.sdcsoft.devices.meta.PLC;

/**
 * Created by jialiang on 2018/4/20.
 */

public class DeviceField extends cn.com.sdcsoft.devices.meta.DeviceField {

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
