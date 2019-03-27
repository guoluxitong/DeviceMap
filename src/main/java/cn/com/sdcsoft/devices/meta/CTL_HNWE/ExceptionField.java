package cn.com.sdcsoft.devices.meta.CTL_HNWE;

/**
 * Created by jialiang on 2018/4/19.
 */

public class ExceptionField extends cn.com.sdcsoft.devices.meta.ExceptionField{
    @Override
    public boolean  haveValue(byte... bytes) {
        value  = bytes[0] & 0xFF; ;
        return true;
    }
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
}
