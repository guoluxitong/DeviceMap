package cn.com.sdcsoft.devices.meta.CTL_NJZJ_485;

import cn.com.sdcsoft.devices.meta.DeviceField;

public class RanShaoQiField extends DeviceField {

    @Override
    public boolean haveValue(byte... bytes) {
        value = bytes[1] & 0xFF | (bytes[0] & 0xFF) << 8;

        if (0x7FFF != value) {
            value = bytes[1] & 0xFF;
            return true;
        }
        return false;
    }

    @Override
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);

        return super.getValueString();
    }
}
