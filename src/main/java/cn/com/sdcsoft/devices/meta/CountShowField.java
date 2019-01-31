package cn.com.sdcsoft.devices.meta;

import cn.com.sdcsoft.devices.map.DevicePointMap;

/**
 * 需要计算并显示点位
 */
public class CountShowField extends ByteField {
    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    /**
     * 分组Key
     */

    private String groupKey;

    @Override
    public Object getValue() {
        return 0;
    }

    @Override
    public boolean haveValue(byte... bytes) {
        return true;
    }
    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(groupKey);
    }

}
