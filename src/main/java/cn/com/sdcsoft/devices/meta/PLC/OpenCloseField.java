package cn.com.sdcsoft.devices.meta.PLC;

public class OpenCloseField extends cn.com.sdcsoft.devices.meta.OpenCloseField {
    @Override
    public boolean haveValue(byte... bytes) {
        value = (bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF;

        int i = 1 << bit;
        if ((i & value) == i) {
            value = 1;
            return true;
        } else {
            value = 0;
            return false;
        }
    }
}
