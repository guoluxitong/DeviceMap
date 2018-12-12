package cn.com.sdcsoft.devices.meta.CTL_NJZJ_485;

/**
 * Created by jialiang on 2018/4/19.
 */

public class ExceptionField extends cn.com.sdcsoft.devices.meta.ExceptionField {
    @Override
    public boolean haveValue(byte... bytes) {
        value = bytes[1] & 0xFF | (bytes[0] & 0xFF) << 8;
//        if(this.getTitle().equals("关键参数异常")){
//            System.out.println("");
//        }
        if(0x7FFF == value)
            return false ;
        return 0x5555 != value;
    }
}