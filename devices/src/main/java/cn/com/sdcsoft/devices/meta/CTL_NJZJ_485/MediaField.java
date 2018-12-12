package cn.com.sdcsoft.devices.meta.CTL_NJZJ_485;


/**
 * Created by jialiang on 2018/4/19.
 */

public class MediaField extends cn.com.sdcsoft.devices.meta.MediaField {

    @Override
    public boolean haveValue(byte... bytes) {
        value = bytes[1] & 0xFF;
        return true;
    }
}
