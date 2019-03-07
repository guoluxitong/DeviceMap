package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Element;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;
import cn.com.sdcsoft.devices.SdcSoftDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Device_CTL_HNWE extends Device_CTL {
    /*@param field
     @param bytes */
    @Override
    public void handleByteField(ByteField field, byte[] bytes) {
      if (field.getBytesLength()==1){
        if (field.haveValue(bytes[field.getStartIndex()])){
            this.addField(field);
        }
      }else{
            if (field.haveValue(bytes[field.getStartIndex()],bytes[field.getStartIndex()+1])) {
                this.addField(field);}
        }
    }
    @Override
    public String handleDeviceNo(byte[] bytes) {
        return "";
    }
    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();
        list.add(getUiItem(this.getMockFields(), "mo_CHgongshuiwendu"));
        list.add(getUiItem(this.getMockFields(), "mo_CHhuishuiwendu"));
        list.add(getUiItem(this.getMockFields(), "mo_OTCwendu"));
        return list;
    }
    @Override
    public int getMode() {
        return 0;
    }
    protected int getPowerInfo() {
        return 0;
    }
    @Override
    public List<Element> getBeng() {
        return Collections.emptyList();
    }
    @Override
    public List<Element> getFan() {
        return Collections.emptyList();
    }
}
