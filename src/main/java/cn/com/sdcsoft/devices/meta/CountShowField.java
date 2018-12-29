package cn.com.sdcsoft.devices.meta;

/**
 * 需要计算并显示点位
 */
public class CountShowField extends CountField {
    /**
     * 分组Key
     */

    protected String groupKey;

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(groupKey);
    }

}
