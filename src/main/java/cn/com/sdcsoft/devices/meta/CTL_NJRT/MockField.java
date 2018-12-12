package cn.com.sdcsoft.devices.meta.CTL_NJRT;

import java.math.BigInteger;

/**
 * Created by jialiang on 2018/4/19.
 */

public class MockField extends cn.com.sdcsoft.devices.meta.MockField {

    @Override
    public boolean haveValue(byte... bytes) {
        BigInteger i = new BigInteger(bytes);

//        if(0x7FFF == i.intValue())
//            return false;

//        if(getBaseNumber() > 0){
//            this.value = i.floatValue()/getBaseNumber();
//        }
//        else
//            this.value = i.floatValue();
        this.value = i.intValue();
        return true;
    }
}
