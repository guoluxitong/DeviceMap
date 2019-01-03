package cn.com.sdcsoft.devices.meta;

import cn.com.sdcsoft.devices.entity.Command;

/**
 * 命令点位
 */
public abstract class CommandField extends PointField {
    /**
     * 485内存地址
     */
    protected String address;
    protected Object maxValue,minValue;
    protected String commandGroupKey;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Object maxValue) {
        this.maxValue = maxValue;
    }

    public Object getMinValue() {
        return minValue;
    }

    public void setMinValue(Object minValue) {
        this.minValue = minValue;
    }

    public String getCommandGroupKey() {
        return commandGroupKey;
    }

    public void setCommandGroupKey(String commandGroupKey) {
        this.commandGroupKey = commandGroupKey;
    }

    /**
     * 获取写入命令
     * @return
     */
    public Command getCommand() {
        if(null == getAddress() || getAddress().length() < 4)
            return null;

        Command cmd = createCommandAndInitValue();
        cmd.setAddress(getAddress());
        cmd.setUnit(getUnit());
        cmd.setTitle(getTitle());
        cmd.setMinValue(getMinValue());
        cmd.setMaxValue(getMaxValue());
        return cmd;
    }

    protected abstract Command createCommandAndInitValue();

}
