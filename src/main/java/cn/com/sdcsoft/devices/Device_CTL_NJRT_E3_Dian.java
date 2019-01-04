package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Element;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Device_CTL_NJRT_E3_Dian extends Device_CTL {
    public static final String KEY_POINT_RAN_SHAO_QI = "_jiarezu";
    private static final String KEY_POINT_Add_SHUI_BENG = "_addshuibeng";
    private static final String KEY_POINT_Add_SHUI_BENG_1 = "oc_1_addshuibeng_start_stop";
    private static final String KEY_POINT_Add_SHUI_BENG_2 = "oc_2_addshuibeng_start_stop";


    /**
     * T2控制器 bytes数据传递方式为高位在前，低位在后的模式传输到服务器
     * 在java程序中也按照高位在前低位在后的模式处理
     * @param field
     * @param bytes
     */
    @Override
    public void handleByteField(ByteField field, byte[] bytes) {
        if (field.haveValue(bytes[field.getStartIndex()], bytes[field.getStartIndex()+1])) {
            this.addField(field);
        }
    }
    @Override
    public String handleDeviceNo(byte[] bytes) {
        return "";
    }


    @Override
    public int getMode() {
        return 0;
    }

    protected int getPowerInfo() {
        int count = getJiaReZuCount();
        return count;
    }

    protected int getJiaReZuCount(){
        int count = 0;
        for (String key : getOpenCloseFields().keySet())
        {
            if (key.contains("jiarezu"))
            {
                count +=  (Integer)getOpenCloseFields().get(key).getValue();
            }
        }
        return count;
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
        return list;
    }

    @Override
    public List<Element> getFan() {
        return Collections.emptyList();
    }
}
