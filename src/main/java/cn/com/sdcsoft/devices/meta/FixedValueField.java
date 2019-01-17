package cn.com.sdcsoft.devices.meta;


/**
 * 值恒定的点位，一般为燃料与介质
 */
public class FixedValueField extends BaseInfoField {
    protected int value;

    @Override
    public Object getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public boolean haveValue(byte... bytes) {
        return true;
    }

    @Override
    public String getValueString() {
        if (null != valueMap)
            return valueMap.get(value);
        return super.getValueString();
    }
}