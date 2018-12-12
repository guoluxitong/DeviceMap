package cn.com.sdcsoft.devices.meta.CTL_NJRT;

/**
 * Created by jialiang on 2018/4/19.
 */

public class BaseInfoField extends cn.com.sdcsoft.devices.meta.BaseInfoField {

    @Override
    public boolean haveValue(byte... bytes) {
        value = (bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF;
        return true;
    }

    @Override
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
}
