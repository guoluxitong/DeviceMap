package cn.com.sdcsoft.devices.meta.CTL_NJZJ;

/**
 * Created by jialiang on 2018/4/19.
 */

public class BaseInfoField extends cn.com.sdcsoft.devices.meta.BaseInfoField {

    @Override
    public boolean haveValue(byte... bytes) {
        value = bytes[1] & 0xFF;
        return 0xFF != value;
    }

    @Override
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
}
