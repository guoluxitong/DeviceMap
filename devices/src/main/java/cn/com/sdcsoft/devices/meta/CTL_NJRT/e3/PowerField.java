package cn.com.sdcsoft.devices.meta.CTL_NJRT.e3;


/**
 * Created by jialiang on 2018/4/19.
 * 对于E3而言，燃料与介质是固定的。因此燃料与介质的Map点位byteLength为0
 * 此时将startIndex作为燃料或介质的固定数值来使用
 */

public class PowerField extends cn.com.sdcsoft.devices.meta.PowerField {

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
