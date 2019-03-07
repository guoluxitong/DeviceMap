package cn.com.sdcsoft.devices.meta.CTL_HNWE;

import java.math.BigInteger;

/**
 * Created by jialiang on 2018/4/19.
 */

public class DemandField extends BaseInfoField {

    public boolean haveValue(byte... bytes) {
        BigInteger i = new BigInteger(bytes);
        if(0x7F == i.intValue()){
            value = 1;
        }
        if(0x00 == i.intValue()) {
            value = 0;
        }
        return true;
    }
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
}
