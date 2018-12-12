package cn.com.sdcsoft.devices.meta.CTL_NJZJ;

import java.math.BigInteger;

/**
 * Created by jialiang on 2018/4/19.
 */

public class RunDaysField extends BaseInfoField {
    @Override
    public boolean haveValue(byte... bytes) {
        value = new BigInteger(bytes).intValue();
        return true;
    }
}
