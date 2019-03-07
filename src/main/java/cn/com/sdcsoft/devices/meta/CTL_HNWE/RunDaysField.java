package cn.com.sdcsoft.devices.meta.CTL_HNWE;

import java.math.BigInteger;

/**
 * Created by jialiang on 2018/4/19.
 */

public class RunDaysField extends BaseInfoField {

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
