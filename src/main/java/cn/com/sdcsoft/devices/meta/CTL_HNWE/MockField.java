package cn.com.sdcsoft.devices.meta.CTL_HNWE;

import java.math.BigInteger;

/**
 * Created by jialiang on 2018/4/19.
 */

public class MockField extends cn.com.sdcsoft.devices.meta.MockField {
    @Override
    public boolean haveValue(byte... bytes) {
        BigInteger i = new BigInteger(bytes);
        if(0x8000 ==Math.abs(i.intValue()) ) {
            return false;
        }
       if(getBaseNumber() > 0){
           this.value =Math.abs(i.intValue()/getBaseNumber()) ;
        }
       else
       { this.value =Math.abs( i.intValue());}
               return true;
        }
        }
