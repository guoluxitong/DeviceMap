package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Element;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public abstract class Device_PLC extends SdcSoftDevice {
    protected static final String KEY_POINT_Add_SHUI_BENG = "_addshuibeng";
    protected static final String KEY_POINT_Add_SHUI_BENG_1 = "de_1_addshuibeng_start_stop";
    protected static final String KEY_POINT_Add_SHUI_BENG_2 = "de_2_addshuibeng_start_stop";


    protected static final String KEY_POINT_XUN_HUAN_BENG = "_xunhuanbeng";
    protected static final String KEY_POINT_XUN_HUAN_BENG_1 = "de_1_xunhuanbeng_start_stop";
    protected static final String KEY_POINT_XUN_HUAN_BENG_2 = "de_2_xunhuanbeng_start_stop";
    protected static final String KEY_POINT_XUN_HUAN_BENG_3 = "de_3_xunhuanbeng_start_stop";

    protected static final String KEY_POINT_CHU_YANG_BENG = "_chuanyangbeng";
    protected static final String KEY_POINT_CHU_YANG_BENG_1 = "de_1_chuyangbeng_start_stop";
    protected static final String KEY_POINT_CHU_YANG_BENG_2 = "de_2_chuyangbeng_start_stop";

    protected static final String KEY_POINT_ZHU_YOU_BENG = "_zhuyoubeng";
    protected static final String KEY_POINT_ZHU_YOU_BENG_1 = "de_zhuyoubeng_start_stop";

    protected static final String KEY_POINT_ZHEN_KONG_BENG = "_zhenkongbeng";
    protected static final String KEY_POINT_ZHEN_KONG_BENG_1 = "de_zhenkongbeng_start_stop";

    protected static final String KEY_POINT_JIE_NENG_BENG = "_jienengbeng";
    protected static final String KEY_POINT_JIE_NENG_BENG_1 = "de_1_jienengbeng_start_stop";
    protected static final String KEY_POINT_JIE_NENG_BENG_2 = "de_2_jienengbeng_start_stop";

    protected static final String KEY_POINT_ZHAO_QI_FAN = "_zhaoqifan";
    protected static final String KEY_POINT_ZHAO_QI_FAN_1 = "de_1_zhaoqifengji_start_stop";
    protected static final String KEY_POINT_ZHAO_QI_FAN_2 = "de_1_zhaoqifengji_start_stop";

    protected static final String KEY_POINT_GU_FENG_FAN = "_gufengfan";
    protected static final String KEY_POINT_GU_FENG_FAN_1 = "de_1_gufengji_start_stop";

    protected static final String KEY_POINT_YIN_FENG_FAN = "_yinfengfan";
    protected static final String KEY_POINT_YIN_FENG_FAN_1 = "de_1_yinfengji_start_stop";

    protected static final String KEY_POINT_LU_PAI_FAN = "_lupaifan";
    protected static final String KEY_POINT_LU_PAI_FAN_1 = "de_lupai_start_stop";

    protected static final String KEY_POINT_CHU_ZHA_FAN = "_chuzhafan";
    protected static final String KEY_POINT_CHU_ZHA_FAN_1 = "de_chuzha_start_stop";


    @Override
    public void handleByteField(ByteField field, byte[] bytes) {
        switch (field.getBytesLength()) {
            case 0:
            case 2:
                if (field.haveValue(bytes[field.getStartIndex()], bytes[field.getStartIndex() + 1])) {
                    this.AddField(field.getDeviceFieldForUI());
                }
                break;
            case 4:
                if (field.haveValue(bytes[field.getStartIndex()], bytes[field.getStartIndex() + 1], bytes[field.getStartIndex() + 2], bytes[field.getStartIndex() + 3])) {
                    this.AddField(field.getDeviceFieldForUI());
                }
                break;
        }
    }

    @Override
    public String handleDeviceNo(byte[] bytes) {
        String deviceNo = String.format("%1$010d", new BigInteger(new byte[]{bytes[5], bytes[6], bytes[7], bytes[8]}).intValue());
        setDeviceNo(deviceNo);
        return deviceNo;
    }

    @Override
    public int getMode() {
        return 0;
    }

    @Override
    public List<Element> getBeng() {
        ArrayList<Element> list = new ArrayList<Element>();

        if (getCountFields().containsKey(KEY_POINT_Add_SHUI_BENG)) {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_Add_SHUI_BENG);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Beng);
            DeviceFieldForUI d1 = null, d2 = null;

            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_Add_SHUI_BENG_1)) {
                d1 = getDeviceFields().get(KEY_POINT_Add_SHUI_BENG_1);
                count = 1;
            }
            if (getDeviceFields().containsKey(KEY_POINT_Add_SHUI_BENG_2)) {
                d2 = getDeviceFields().get(KEY_POINT_Add_SHUI_BENG_2);
                count += 2;
            }
            int v1 = 0, v2 = 0;
            switch (count) {
                case 1:
                    v1 = (Integer) (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v1);
                    list.add(element);
                    break;
                case 2:
                    v2 = (Integer) d2.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v2);
                    list.add(element);
                    break;
                case 3:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    v2 = (Integer) d2.getValue() > 0 ? 2 : 0;
                    element.SetValues(Element.Index_Beng_Count, 2, v1 + v2);
                    list.add(element);
                    break;
            }
        }

        if (getCountFields().containsKey(KEY_POINT_XUN_HUAN_BENG)) {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_XUN_HUAN_BENG);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Beng);
            DeviceFieldForUI d1 = null, d2 = null, d3 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_XUN_HUAN_BENG_1)) {
                d1 = getDeviceFields().get(KEY_POINT_XUN_HUAN_BENG_1);
                count = 1;
            }
            if (getDeviceFields().containsKey(KEY_POINT_XUN_HUAN_BENG_2)) {
                d2 = getDeviceFields().get(KEY_POINT_XUN_HUAN_BENG_2);
                count += 2;
            }
            if (getDeviceFields().containsKey(KEY_POINT_XUN_HUAN_BENG_3)) {
                d3 = getDeviceFields().get(KEY_POINT_XUN_HUAN_BENG_3);
                count += 4;
            }
            int v1 = 0, v2 = 0, v3 = 0;
            switch (count) {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v1);
                    list.add(element);
                    break;
                case 2:
                    v2 = (Integer) d2.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v2);
                    list.add(element);
                    break;
                case 3:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    v2 = (Integer) d2.getValue() > 0 ? 2 : 0;
                    element.SetValues(Element.Index_Beng_Count, 2, v1 + v2);
                    list.add(element);
                    break;
                case 4:
                    v2 = (Integer) d2.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v2);
                    list.add(element);
                    break;
                case 5:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    v3 = (Integer) d3.getValue() > 0 ? 4 : 0;
                    element.SetValues(Element.Index_Beng_Count, 2, v1 + v3);
                    list.add(element);
                    break;
                case 6:
                    v2 = (Integer) d2.getValue() > 0 ? 2 : 0;
                    v3 = (Integer) d3.getValue() > 0 ? 4 : 0;
                    element.SetValues(Element.Index_Beng_Count, 2, v2 + v3);
                    list.add(element);
                    break;
                case 7:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    v2 = (Integer) d2.getValue() > 0 ? 2 : 0;
                    v3 = (Integer) d3.getValue() > 0 ? 4 : 0;
                    element.SetValues(Element.Index_Beng_Count, 3, v1 + v2 + v3);
                    list.add(element);
                    break;
            }
        }

        if (getCountFields().containsKey(KEY_POINT_CHU_YANG_BENG)) {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_CHU_YANG_BENG);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Beng);
            DeviceFieldForUI d1 = null, d2 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_CHU_YANG_BENG_1)) {
                d1 = getDeviceFields().get(KEY_POINT_CHU_YANG_BENG_1);
                count = 1;
            }
            if (getDeviceFields().containsKey(KEY_POINT_CHU_YANG_BENG_2)) {
                d2 = getDeviceFields().get(KEY_POINT_CHU_YANG_BENG_2);
                count += 2;
            }
            int v1 = 0, v2 = 0;
            switch (count) {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v1);
                    list.add(element);
                    break;
                case 2:
                    v2 = (Integer) d2.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v2);
                    list.add(element);
                    break;
                case 3:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    v2 = (Integer) d2.getValue() > 0 ? 2 : 0;
                    element.SetValues(Element.Index_Beng_Count, 2, v1 + v2);
                    list.add(element);
                    break;
            }
        }

        if (getCountFields().containsKey(KEY_POINT_ZHU_YOU_BENG)) {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_ZHU_YOU_BENG);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Beng);
            DeviceFieldForUI d1 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_ZHU_YOU_BENG_1)) {
                d1 = getDeviceFields().get(KEY_POINT_ZHU_YOU_BENG_1);
                count = 1;
            }

            int v1 = 0;
            switch (count) {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v1);
                    list.add(element);
                    break;
            }
        }

        if (getCountFields().containsKey(KEY_POINT_JIE_NENG_BENG)) {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_JIE_NENG_BENG);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Beng);
            DeviceFieldForUI d1 = null, d2 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_JIE_NENG_BENG_1)) {
                d1 = getDeviceFields().get(KEY_POINT_JIE_NENG_BENG_1);
                count = 1;
            }
            if (getDeviceFields().containsKey(KEY_POINT_JIE_NENG_BENG_2)) {
                d2 = getDeviceFields().get(KEY_POINT_JIE_NENG_BENG_2);
                count += 2;
            }
            int v1 = 0, v2 = 0;
            switch (count) {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v1);
                    list.add(element);
                    break;
                case 2:
                    v2 = (Integer) d2.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Beng_Count, 1, v2);
                    list.add(element);
                    break;
                case 3:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    v2 = (Integer) d2.getValue() > 0 ? 2 : 0;
                    element.SetValues(Element.Index_Beng_Count, 2, v1 + v2);
                    list.add(element);
                    break;
            }
        }

        if (getCountFields().containsKey(KEY_POINT_ZHEN_KONG_BENG)) {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_ZHEN_KONG_BENG);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Beng);
            DeviceFieldForUI d1 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_ZHEN_KONG_BENG_1)) {
                d1 = getDeviceFields().get(KEY_POINT_ZHEN_KONG_BENG_1);
                count = 1;
            }

            int v1 = 0;
            switch (count) {
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
        ArrayList<Element> list = new ArrayList<Element>();

        if (getCountFields().containsKey(KEY_POINT_GU_FENG_FAN)) {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_GU_FENG_FAN);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Fan);

            DeviceFieldForUI d1 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_GU_FENG_FAN_1)) {
                d1 = getDeviceFields().get(KEY_POINT_GU_FENG_FAN_1);
                count = 1;
            }
            int v1 = 0;
            switch (count) {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Fan_Count, 1, v1);
                    list.add(element);
                    break;
            }
        }

        if (getCountFields().containsKey(KEY_POINT_YIN_FENG_FAN)) {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_YIN_FENG_FAN);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Fan);
            DeviceFieldForUI d1 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_YIN_FENG_FAN_1)) {
                d1 = getDeviceFields().get(KEY_POINT_YIN_FENG_FAN_1);
                count = 1;
            }
            int v1 = 0;
            switch (count) {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Fan_Count, 1, v1);
                    list.add(element);
                    break;
            }
        }
        if (getCountFields().containsKey(KEY_POINT_ZHAO_QI_FAN)) {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_ZHAO_QI_FAN);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Fan);
            DeviceFieldForUI d1 = null, d2 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_ZHAO_QI_FAN_1)) {
                d1 = getDeviceFields().get(KEY_POINT_ZHAO_QI_FAN_1);
                count = 1;
            }
            if (getDeviceFields().containsKey(KEY_POINT_ZHAO_QI_FAN_2)) {
                d2 = getDeviceFields().get(KEY_POINT_ZHAO_QI_FAN_2);
                count += 2;
            }
            int v1 = 0, v2 = 0;
            switch (count) {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Fan_Count, 1, v1);
                    list.add(element);
                    break;
                case 2:
                    v2 = (Integer) d2.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Fan_Count, 1, v2);
                    list.add(element);
                    break;
                case 3:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    v2 = (Integer) d2.getValue() > 0 ? 2 : 0;
                    element.SetValues(Element.Index_Fan_Count, 2, v1 + v2);
                    list.add(element);
                    break;
            }
        }
        if (getCountFields().containsKey(KEY_POINT_LU_PAI_FAN))
        {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_LU_PAI_FAN);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Fan);
            DeviceFieldForUI d1 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_LU_PAI_FAN_1))
            {
                d1 = getDeviceFields().get(KEY_POINT_LU_PAI_FAN_1);
                count = 1;
            }
            int v1 = 0;
            switch (count)
            {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Fan_Count, 1, v1);
                    list.add(element);
                    break;
            }
        }

        if (getCountFields().containsKey(KEY_POINT_CHU_ZHA_FAN))
        {
            DeviceFieldForUI deviceFieldForUI = getCountFields().get(KEY_POINT_CHU_ZHA_FAN);
            Element element = new Element();
            element.setTitle(deviceFieldForUI.getTitle());
            element.setPrefix(Element.Prefix_Fan);

            DeviceFieldForUI d1 = null;
            int count = 0;
            if (getDeviceFields().containsKey(KEY_POINT_CHU_ZHA_FAN_1))
            {
                d1 = getDeviceFields().get(KEY_POINT_CHU_ZHA_FAN_1);
                count = 1;
            }
            int v1 = 0;
            switch (count)
            {
                case 1:
                    v1 = (Integer) d1.getValue() > 0 ? 1 : 0;
                    element.SetValues(Element.Index_Fan_Count, 1, v1);
                    list.add(element);
                    break;
            }
        }
        return list;
    }
}
