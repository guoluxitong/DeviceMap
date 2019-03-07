package cn.com.sdcsoft.devices.meta.CTL_HNWE;

import java.math.BigInteger;

public class DeviceField extends cn.com.sdcsoft.devices.meta.DeviceField {
    @Override
        public boolean haveValue(byte... bytes) {
        BigInteger i = new BigInteger(bytes);
        if(0x7FFF == i.intValue()){
            value = 1;
        }
        if(0x0000 == i.intValue()){
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


