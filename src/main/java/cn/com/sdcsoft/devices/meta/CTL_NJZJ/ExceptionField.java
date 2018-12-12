package cn.com.sdcsoft.devices.meta.CTL_NJZJ;

/**
 * Created by jialiang on 2018/4/19.
 */

public class ExceptionField extends cn.com.sdcsoft.devices.meta.ExceptionField {
    @Override
    public boolean haveValue(byte... bytes) {
        value =  bytes[1] ;
        return value > 0;
    }
}
