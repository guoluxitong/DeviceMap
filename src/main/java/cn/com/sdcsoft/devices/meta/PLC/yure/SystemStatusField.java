package cn.com.sdcsoft.devices.meta.PLC.yure;

public class SystemStatusField extends cn.com.sdcsoft.devices.meta.BaseInfoField{
    @Override
    public boolean haveValue(byte... bytes) {
        value = startIndex;
        return true;
    }

    @Override
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
}
