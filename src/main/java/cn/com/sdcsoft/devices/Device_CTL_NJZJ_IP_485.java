package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.List;

public abstract class Device_CTL_NJZJ_IP_485 extends Device_CTL_NJZJ_IP {

    public Device_CTL_NJZJ_IP_485(){
        BYTE_ARRAY_LENGTH = 765;
    }

    /**
     * IPK2控制器 bytes数据 Java 中数据处理统一按照高位在前，低位在后的模式进行传递
     * @param field
     * @param bytes
     */
    @Override
    public void handleByteField(ByteField field, byte[] bytes) {

        if (field.haveValue(bytes[field.getStartIndex()], bytes[field.getStartIndex()+1])) {
            this.AddField(field.getDeviceFieldForUI());
        }
    }
    @Override
    public String handleDeviceNo(byte[] bytes) {
        return "";
    }

    @Override
    public int getMode() {
        return -1;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        List<DeviceFieldForUI> list = super.getDeviceFocusFields();
        Integer i = (Integer)list.get(1).getValue();
        list.get(0).setValue(i/24);
        list.get(1).setValue(i%24);
        return list;
    }
}
