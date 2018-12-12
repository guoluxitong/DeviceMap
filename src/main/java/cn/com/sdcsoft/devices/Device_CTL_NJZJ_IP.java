package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.Element;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Device_CTL_NJZJ_IP extends Device_CTL {
    private static final String Device_Suffix_Beng = "_beng";
    private static final String Device_Suffix_Fan = "_fan";

    private static final String KEY_POINT_RAN_SHAO_QI = "de_ranshaoqi";
    private static final String KEY_POINT_JIA_RE_ZU = "se_jiarezushu";
    private static final String KEY_POINT_YIN_FENG_JI = "de_yinfengji_fan";

    @Override
    public String handleDeviceNo(byte[] bytes) {
        String deviceNo = new String(bytes, 0, 20);
        String de = deviceNo.substring(deviceNo.length() - 10, deviceNo.length());
        setDeviceNo(de);
        return de;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();

        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS));
        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS));

        if (this.powerVal == Power.Dian) {
            list.add(getUiItem(this.getSettingFields(), "se_jiarezushu"));
            if (this.mediaVal == Media.ReShui) {
                list.add(getUiItem(this.getMockFields(), "mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_rukouwendu"));
                list.add(getUiItem(this.getBaseInfoFields(), "ba_shuixiangshuiweizhuangtai"));
                list.add(getUiItem(this.getBaseInfoFields(), "ba_guolushuiweizhuangtai"));
            } else if (this.mediaVal == Media.DaoReYou) {

            } else if (this.mediaVal ==Media.ReFeng) {

            } else if (this.mediaVal == Media.ZhengQi) {
                list.add(getUiItem(this.getBaseInfoFields(), "ba_guolushuiweizhuangtai"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(), "mo_zhengqiyali"));
                }
            } else if (this.mediaVal == Media.ZhenKong) {

            }
        } else if (this.powerVal== Power.Mei) {
            if (this.mediaVal == Media.ReShui) {
                list.add(getUiItem(this.getMockFields(), "mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_rukouwendu"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(), "mo_zhengqiyali"));
                }

            } else if (this.mediaVal == Media.DaoReYou) {
                list.add(getUiItem(this.getMockFields(), "mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_rukouwendu"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(), "mo_zhengqiyali"));
                }
            } else if (this.mediaVal == Media.ReFeng) {

            } else if (this.mediaVal == Media.ZhengQi) {
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(), "mo_zhengqiyali"));
                }
                list.add(getUiItem(this.getMockFields(), "mo_paiyanwendu"));
                list.add(getUiItem(this.getBaseInfoFields(), "ba_guolushuiweizhuangtai"));

            } else if (this.mediaVal == Media.ZhenKong) {

            }
        } else if (this.powerVal== Power.ShengWuZhi) {
            if (this.mediaVal == Media.ReShui) {

            } else if (this.mediaVal == Media.DaoReYou) {

            } else if (this.mediaVal == Media.ReFeng) {

            } else if (this.mediaVal == Media.ZhengQi) {

            } else if (this.mediaVal == Media.ZhenKong) {

            }
        } else if (this.powerVal== Power.YouQi) {
            if (this.mediaVal == Media.ReShui) {
                list.add(getUiItem(this.getMockFields(), "mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_rukouwendu"));
                list.add(getUiItem(this.getBaseInfoFields(), "ba_guolushuiweizhuangtai"));
                list.add(getUiItem(this.getBaseInfoFields(), "ba_shuixiangshuiweizhuangtai"));
            } else if (this.mediaVal == Media.DaoReYou) {
                list.add(getUiItem(this.getMockFields(), "mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_rukouwendu"));
            } else if (this.mediaVal == Media.ReFeng) {
                list.add(getUiItem(this.getMockFields(), "mo_chukouwendu"));
                list.add(getUiItem(this.getDeviceFields(), "de_ranshaoqi"));
                list.add(getUiItem(this.getDeviceFields(), "de_yinfengji"));
            } else if (this.mediaVal == Media.ZhengQi) {
                list.add(getUiItem(this.getBaseInfoFields(), "ba_guolushuiweizhuangtai"));
                list.add(getUiItem(this.getMockFields(), "mo_paiyanwendu"));

                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(), "mo_zhengqiyali"));
                }

            } else if (this.mediaVal == Media.ZhenKong) {
                list.add(getUiItem(this.getMockFields(), "mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(), "mo_meishuiwendu"));
                list.add(getUiItem(this.getBaseInfoFields(), "ba_guolushuiweizhuangtai"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(), "mo_zhengqiyali"));
                }

            }
        }
        return list;
    }

    @Override
    public int getMode() {
        return (Integer) this.getBaseInfoFields().get("ba_moshibianhao").getValue();
    }

    @Override
    protected int getPowerInfo() {
        if (this.powerVal == Power.Dian) {
            return ((Float) getSettingFields().get(KEY_POINT_JIA_RE_ZU).getValue()).intValue() > 0 ? 1 : 0;
        } else if (this.powerVal == Power.Mei) {
            return (Integer) getDeviceFields().get(KEY_POINT_YIN_FENG_JI).getValue() > 0x7F ? 1 : 0;
        }
        return (Integer) getDeviceFields().get(KEY_POINT_RAN_SHAO_QI).getValue();
    }

    @Override
    public List<Element> getBeng() {
        return getElements(Device_Suffix_Beng, Element.Prefix_Beng, Element.Index_Beng_Count);
    }

    @Override
    public List<Element> getFan() {
        return getElements(Device_Suffix_Fan, Element.Prefix_Fan, Element.Index_Fan_Count);
    }

    private List<Element> getElements(String deviceSuffix, String elementPrefix, int valueIndex) {
        List<Element> list = new ArrayList<Element>();
        for (DeviceFieldForUI device : getDeviceFields().values()) {
            if (device.getName().contains(deviceSuffix)) {
                Element element = new Element();
                element.setTitle(device.getTitle());
                element.setPrefix(elementPrefix);

                int value = (Integer) device.getValue();
                int v = value & 0x80;

                if (0x80 == v) {
                    element.SetValues(valueIndex, 1, 1);
                } else {
                    element.SetValues(valueIndex, 1, 0);
                }
                list.add(element);
            }
        }
        return list;
    }

    @Override
    public List<Command> getCommands() {
        ArrayList<Command> list = new ArrayList<Command>(10);
        if(this.powerVal== Power.Dian) {
            if (this.mediaVal == Media.ReShui) { //电热水
                list.add(
                        Command.getInstance(
                                this,
                                "se_",
                                "060500",
                                50,
                                300)
                );
            }else if(this.mediaVal == Media.ZhenKong){

            }
        }else if(this.powerVal == Power.YouQi){
            if (this.mediaVal == Media.ReShui) { //油气热水

            }
        }else if (this.powerVal == Power.Mei){
            if (this.mediaVal == Media.ReShui) { //燃煤热水

            }
        }
        return list;
    }
}
