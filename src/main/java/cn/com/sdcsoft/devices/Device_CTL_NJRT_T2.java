package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Element;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Device_CTL_NJRT_T2 extends Device_CTL {
    public static final String KEY_POINT_RAN_SHAO_QI = "_ranshaoqi";
    public static final String KEY_POINT_RAN_SHAO_QI_KONGZHI = "oc_ranshaoqiqitingkongzhi";
    public static final String KEY_POINT_RAN_SHAO_QI_STATUS = "oc_ranshaoqifuhetiaojie";

    public static final String KEY_POINT_Add_SHUI_BENG = "_addshuibeng";
    public static final String KEY_POINT_Add_SHUI_BENG_1 = "oc_1_addshuibeng_start_stop";
    public static final String KEY_POINT_Add_SHUI_BENG_2 = "oc_2_addshuibeng_start_stop";

    public static final String KEY_POINT_LENG_NING_BENG = "_lengningbeng";
    public static final String KEY_POINT_LENG_NING_BENG_1 = "oc_1_lengningxunhuanbeng_start_stop";

    public Device_CTL_NJRT_T2(){
        BYTE_ARRAY_LENGTH = 109;
    }
    /**
     * 485点位读取指令
     * 01030010003445D8
     */
    /**
     * T2控制器 bytes数据传递方式为高位在前，低位在后的模式传输到服务器
     * 在java程序中也按照高位在前低位在后的模式处理
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
        String deviceNo = String.format("%d%d%d%d%d%d%d%d%d%d",
                bytes[68],bytes[70],bytes[72],bytes[74],bytes[76],
                bytes[78],bytes[80],bytes[82],bytes[84],bytes[86]);
        setDeviceNo(deviceNo);
        return deviceNo;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();
        Integer i = (Integer)this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_LIFE).getValue();
        DeviceFieldForUI field = this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS);
        field.setValue(i/24);
        list.add(field);
        field = this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS);
        field.setValue(i%24);
        list.add(field);
        list.add(getUiItem(this.getMockFields(),"mo_shuiweixinhao"));
        return list;
    }

    @Override
    public int getMode() {
        return 0;
    }

    protected int getPowerInfo() {
        Integer integer = (Integer)getOpenCloseFields().get(KEY_POINT_RAN_SHAO_QI_KONGZHI).getValue();
        if (integer > 0)
            return (Integer)getOpenCloseFields().get(KEY_POINT_RAN_SHAO_QI_STATUS).getValue();

        return 0;
    }

    @Override
    public List<Element> getBeng() {
        List<Element> list = new ArrayList<Element>();
        if (getCountFields().containsKey(KEY_POINT_Add_SHUI_BENG))
        {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_Add_SHUI_BENG);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Beng);
            
            DeviceFieldForUI d1 = null, d2 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_Add_SHUI_BENG_1))
            {
                d1 = getDeviceFields().get(KEY_POINT_Add_SHUI_BENG_1);
                count = 1;
            }
            if (getDeviceFields().containsKey(KEY_POINT_Add_SHUI_BENG_2))
            {
                d2 = getDeviceFields().get(KEY_POINT_Add_SHUI_BENG_2);
                count += 2;
            }
            int v1 = 0, v2 = 0;
            switch (count)
            {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v1);
                    list.add(element);
                    break;
                case 2:
                    v2 = (Integer)d2.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v2);
                    list.add(element);
                    break;
                case 3:
                    v1 = (Integer)d1.getValue() > 0 ? 1 : 0;
                    v2 = (Integer)d2.getValue() > 0 ? 2 : 0;
                    element.SetValues(Element.Index_Beng_Count, 2, v1 + v2);
                    list.add(element);
                    break;
            }
        }
        if (getCountFields().containsKey(KEY_POINT_LENG_NING_BENG))
        {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_LENG_NING_BENG);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Beng);

            DeviceFieldForUI d1 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_LENG_NING_BENG_1))
            {
                d1 = getDeviceFields().get(KEY_POINT_LENG_NING_BENG_1);
                count = 1;
            }
            int v1 = 0;
            switch (count)
            {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v1);
                    list.add(element);
                    break;
            }
        }
        return list;
    }

    @Override
    public List<Element> getFan() {
        return Collections.emptyList();
    }
}
