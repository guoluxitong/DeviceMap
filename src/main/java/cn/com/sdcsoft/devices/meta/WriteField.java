package cn.com.sdcsoft.devices.meta;

/**
 * 仅支持写入不支持显示的点位
 */
public class WriteField extends ByteField {

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {

    }

    @Override
    public DeviceFieldForUI getDeviceFieldForUI()
    {
        return null;
    }

    @Override
    public Object getValue() {
        return 0;
    }

    @Override
    public boolean haveValue(byte... bytes) {
        return true;
    }
}
