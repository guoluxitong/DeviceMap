package cn.com.sdcsoft.devices.meta.CTL_HNWE;

public class OpenCloseField extends cn.com.sdcsoft.devices.meta.OpenCloseField {
    @Override
    public boolean haveValue(byte... bytes) {
        value = bytes[0] & 0xFF;

        int i = 1 << bit;
        if ((i & value) == i) {
            value = 1;
        } else {
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
