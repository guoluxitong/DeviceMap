package cn.com.sdcsoft.devices.meta.CTL_NJZJ;

import java.math.BigInteger;

/**
 * Created by jialiang on 2018/4/20.
 */

public class StartStopField extends cn.com.sdcsoft.devices.meta.StartStopField {

    @Override
    public boolean haveValue(byte... bytes) {
        value = new BigInteger(bytes).intValue();
        return 0x7FFF != value;
    }

    @Override
    public String getValueString() {
        return String.format("%02d:%02d",value / 60,value % 60);
    }
}
