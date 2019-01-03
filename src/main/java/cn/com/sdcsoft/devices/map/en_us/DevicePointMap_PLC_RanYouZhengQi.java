package cn.com.sdcsoft.devices.map.en_us;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.FixedValueField;
import cn.com.sdcsoft.devices.meta.PLC.*;

/**
 * @author doudou
 * 初始化数据
 */
public class DevicePointMap_PLC_RanYouZhengQi extends DevicePointMap {
    public static final String Key = "PLC_RanYouZhengQi";

    public DevicePointMap_PLC_RanYouZhengQi() {

        /**
         * 计算属性（不显示）
         */
        map.put("_addshuibeng", ByteField.Init(new CountField(), "_addshuibeng", "Water Feeding Pump"));
        map.put("_jienengbeng", ByteField.Init(new CountField(), "_jienengbeng","Energy-Saving Pump"));
        map.put("_chuanyangbeng", ByteField.Init(new CountField(), "_chuanyangbeng", "De-aerator Pump"));
        map.put("_zhaoqifan", ByteField.Init(new CountField(), "_zhaoqifan", "Biogas Blower"));
    

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "Running Hours", "Hour"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "Running Days", "Day "));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "System State", PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER,  " Fuel",0, DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, " Medium", 1,DevicePointMap.coms_media));

        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "Water Level State", DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "Burner State", PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 35, 4, " Steam Pressure", "MPa"));
        map.put("mo_guorezhengqiyali", ByteField.Init(new MockField(), "mo_guorezhengqiyali", 39, 4, " Super-heated Steam Pressure", "MPa"));
        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 43, 4, "Steam Temperature", "℃"));
        map.put("mo_guorezhengqiwendu", ByteField.Init(new MockField(), "mo_guorezhengqiwendu", 47, 4, "Super-heated Steam Temperature", "℃"));
        map.put("mo_guolushuiwei", ByteField.Init(new MockField(), "mo_guolushuiwei", 51, 4, "Boiler Water Level", ""));
        map.put("mo_zhengqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhengqishunshiliuliang", 55, 4, "Steam Instantaneous Flow Rate", "m?/h"));
        map.put("mo_bushuishunshiliuliang", ByteField.Init(new MockField(), "mo_bushuishunshiliuliang", 59, 4, "Make-up Water Instantaneous Flow Rate", "m?/h"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 63, 4, "Furnace Temperature", "℃"));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 67, 4, "Furnace Pressure  ", "MPa"));
        map.put("mo_lengningqijinkouyanwen", ByteField.Init(new MockField(), "mo_lengningqijinkouyanwen", 71, 4, "Condenser Inlet Flue Gas Temperature", "℃"));
        map.put("mo_lengningqijinkouyanya", ByteField.Init(new MockField(), "mo_lengningqijinkouyanya", 75, 4, "Condenser Inlet Flue Gas Pressure", "kPa"));
        map.put("mo_jienengqijinkouyanwen", ByteField.Init(new MockField(), "mo_jienengqijinkouyanwen", 79, 4, "Economizer Inlet Flue Gas Temperature", "℃"));
        map.put("mo_jienengqijinkouyanya", ByteField.Init(new MockField(), "mo_jienengqijinkouyanya", 83, 4, " Economizer Inlet Flue Gas Pressure", "kPa"));
        map.put("mo_zhengqileijiliuliang", ByteField.Init(new MockField(), "mo_zhengqileijiliuliang", 87, 4, " Steam  Integrated Flow Rate", "m?/h"));
        map.put("mo_bushuileijiliuliang", ByteField.Init(new MockField(), "mo_bushuileijiliuliang", 91, 4, " Make-up Integrated Flow Rate", "m?/h"));
        map.put("mo_kongyuqijinyanwendu", ByteField.Init(new MockField(), "mo_kongyuqijinyanwendu", 95, 4, "Aire Pre-heater Inlet Flue Gas Temperature", "℃"));
        map.put("mo_kongyuqijinyanyali", ByteField.Init(new MockField(), "mo_kongyuqijinyanyali", 99, 4, "Air Pre-heater Inlet Flue Gas Pressure", "kPa"));
        map.put("mo_zuizhongpaiyanwendu", ByteField.Init(new MockField(), "mo_zuizhongpaiyanwendu", 103, 4, "Discharged Flue Gas Temperature", "℃"));
        map.put("mo_zuizhongpaiyanyali", ByteField.Init(new MockField(), "mo_zuizhongpaiyanyali", 107, 4, "Discharged Flue Gas Pressure", "MPa"));
        map.put("mo_lengningqijinshuiwendu", ByteField.Init(new MockField(), "mo_lengningqijinshuiwendu", 111, 4, "Condenser Inlet Water Temperature", "℃"));
        map.put("mo_lengningqichushuiwendu", ByteField.Init(new MockField(), "mo_lengningqichushuiwendu", 115, 4, " Condenser Outlet Water Temperature", "℃"));
        map.put("mo_jienengqijinshuiwendu", ByteField.Init(new MockField(), "mo_jienengqijinshuiwendu", 119, 4, "Economizer Inlet Water Temperature", "℃"));
        map.put("mo_jienengqichushuiwendu", ByteField.Init(new MockField(), "mo_jienengqichushuiwendu", 123, 4, "Economizer Outlet Water Temperature", "℃"));
        map.put("mo_lengningqichushuiyali", ByteField.Init(new MockField(), "mo_lengningqichushuiyali", 127, 4, " Condenser Outlet Water Pressure", "MPa"));
        map.put("mo_jienengqichushuiyali", ByteField.Init(new MockField(), "mo_jienengqichushuiyali", 131, 4, "Economizer Outlet Water Pressure", "MPa"));
        map.put("mo_addshuibengpinlüfankui", ByteField.Init(new MockField(), "mo_addshuibengpinlüfankui", 135, 4, "Make-up Pump Frequency Feedback", ""));
        map.put("mo_ruanshuixiangyewei", ByteField.Init(new MockField(), "mo_ruanshuixiangyewei", 139, 4, "Soft Water Tank Water Level", "mm"));
        map.put("mo_chuyangqiyewei", ByteField.Init(new MockField(), "mo_chuyangqiyewei", 143, 4, "De-aeraor Water Level", "mm"));
        map.put("mo_chuyangqiwendu", ByteField.Init(new MockField(), "mo_chuyangqiwendu", 147, 4, "De-aerator Temperature", "℃"));
        map.put("mo_bushuidiandongfafankui", ByteField.Init(new MockField(), "mo_bushuidiandongfafankui", 151, 4, "Make-up Electric Valve Feedback", ""));
        map.put("mo_guoreqijiangwendiandongfafankui", ByteField.Init(new MockField(), "mo_guoreqijiangwendiandongfafankui", 155, 4, " Superheater Attemperating Electric Valve Feedback", ""));
        map.put("mo_zhufengjipinlüfankui", ByteField.Init(new MockField(), "mo_zhufengjipinlüfankui", 159, 4, "Main Blower Frequency Feedback", ""));
        map.put("mo_xunhuanfengjipinlüfankui", ByteField.Init(new MockField(), "mo_xunhuanfengjipinlüfankui", 163, 4, " Circulating Blower Frequency Feedback", ""));
        map.put("mo_kongyuqijinfengwendu", ByteField.Init(new MockField(), "mo_kongyuqijinfengwendu", 167, 4, "Air Pre-heater Inlet Air Temperature", "℃"));
        map.put("mo_kongyuqijinfengyali", ByteField.Init(new MockField(), "mo_kongyuqijinfengyali", 171, 4, " Air pre-heater Inlet Air Pressure", "MPa"));
        map.put("mo_kongyuqichufengwendu", ByteField.Init(new MockField(), "mo_kongyuqichufengwendu", 175, 4, " Air Pre-heater Outlet Air Temperature", "℃"));
        map.put("mo_kongyuqichufengyali", ByteField.Init(new MockField(), "mo_kongyuqichufengyali", 179, 4, "Air Pre-heater Outlet Air Pressure", "MPa"));
        map.put("mo_zhaoqiyali", ByteField.Init(new MockField(), "mo_zhaoqiyali", 183, 4, "沼气压力", "KPa"));
        map.put("mo_zhaoqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhaoqishunshiliuliang", 187, 4, "Methane instantaneous flow rate", "m?/h"));
        map.put("mo_zhaoqileijiliuliang", ByteField.Init(new MockField(), "mo_zhaoqileijiliuliang", 191, 4, "Cumulative flow of Biogas", "m?/h"));
        map.put("mo_zhaoqifengjipinlvfankui", ByteField.Init(new MockField(), "mo_zhaoqifengjipinlvfankui", 195, 4, "Frequency feedback of biogas blower", "Hz"));


        map.put("se_qiluyalisheding", ByteField.Init(new SettingField(), "se_qiluyalisheding", 248, 4, "Boiler Start Pressure Setting", "MPa"));
        map.put("se_mubiaoyalisheding", ByteField.Init(new SettingField(), "se_mubiaoyalisheding", 252, 4, "Target Pressure Setting", "MPa"));
        map.put("se_tingluyalisheding", ByteField.Init(new SettingField(), "se_tingluyalisheding", 256, 4, "Boiler Stop Pressure Setting", "MPa"));
        map.put("se_chaoyabaojingyalisheding", ByteField.Init(new SettingField(), "se_chaoyabaojingyalisheding", 260, 4, "Overpressure Alarm Setting ", "MPa"));
        map.put("se_paiyanchaowenbaojing", ByteField.Init(new SettingField(), "se_paiyanchaowenbaojing", 264, 4, "Discharged Flue Gas Over temperature Alarm", "℃"));
        map.put("se_guolushuiweimubiaosheding", ByteField.Init(new SettingField(), "se_guolushuiweimubiaosheding", 268, 4, "Boiler Water Level Target Setting", "mm"));
        map.put("se_guolushuiweijigaobaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijigaobaojingsheding", 272, 4, "Extrem High Boiler Water Level Setting", "mm"));
        map.put("se_guolushuiweijidibaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijidibaojingsheding", 276, 4, "Extrem Low Boiler Water Level Alarm Setting", "mm"));
        map.put("se_addshuibengshoudongpinlüsheding", ByteField.Init(new SettingField(), "se_addshuibengshoudongpinlüsheding", 280, 4, " Feeding Water Pump Manual Frequency Setting", "Hz"));
        map.put("se_chuyangqibushuimubiaosheding", ByteField.Init(new SettingField(), "se_chuyangqibushuimubiaosheding", 284, 4, "De-aerator Make-up Water Target Setting ", "mm"));
        map.put("se_chuyangqijigaobaojingsheding", ByteField.Init(new SettingField(), "se_chuyangqijigaobaojingsheding", 288, 4, "Extrem High Water Level Alarm Setting of De-aerator", "mm"));
        map.put("se_chuyangqitingbengyeweisheding", ByteField.Init(new SettingField(), "se_chuyangqitingbengyeweisheding", 292, 4, "Pump-stop Level Setting of De-aerator", "mm"));
        map.put("se_chuyangqiqibengyeweisheding", ByteField.Init(new SettingField(), "se_chuyangqiqibengyeweisheding", 296, 4, "Pump-Start Level Setting of De-aerator", "mm"));
        map.put("se_chuyangqijidibaojingsheding", ByteField.Init(new SettingField(), "se_chuyangqijidibaojingsheding", 300, 4, "Extrem Low Water Level  Alarm Setting of De-aerator", "mm"));
        map.put("se_chuyangqibushuishoudonggeisu", ByteField.Init(new SettingField(), "se_chuyangqibushuishoudonggeisu", 304, 4, "Manual De-aerator Make-up", "Hz"));
        map.put("se_zhaoqiyalimubiaosheding", ByteField.Init(new SettingField(), "se_zhaoqiyalimubiaosheding", 308, 4, "Biogas Pressure Target Setting ", "KPa"));


        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 368, 2, " One# Make-up Pump Manual/Automatic ", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 370, 2, "One#Make-up Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 372, 2, "Two# Make-up Pump Manual/Automatic ", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 374, 2, "Two# Make-up Pump ON/IOff ", DevicePointMap.coms_start_stop));
        map.put("de_1_jienengbeng_auto", ByteField.Init(new DeviceField(), "de_1_jienengbeng_auto", 376, 2, "One# Energy-saving Pump Manual/Automatic", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_jienengbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_jienengbeng_start_stop", 378, 2, "One# Energy-saving Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_2_jienengbeng_auto", ByteField.Init(new DeviceField(), "de_2_jienengbeng_auto", 380, 2, "Two# Energy-saving Pump Manual/Automatic", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_jienengbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_jienengbeng_start_stop", 382, 2, "2#Energy-saving Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_1_chuyangbeng_auto", ByteField.Init(new DeviceField(), "de_1_chuyangbeng_auto", 384, 2, "One# De-aerator Pump Manual/Automatic", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_chuyangbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_chuyangbeng_start_stop", 386, 2, "1#De-aerator Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_2_chuyangbeng_auto", ByteField.Init(new DeviceField(), "de_2_chuyangbeng_auto", 388, 2, "Two# De-aerator Pump Manual/Automatic", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_chuyangbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_chuyangbeng_start_stop", 390, 2, "Two#De-aerator Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_baojingshuchuzhishi", ByteField.Init(new DeviceField(), "de_baojingshuchuzhishi", 392, 2, "Alarm Output Indication", DevicePointMap.coms_open_close));
        map.put("de_1_zhaoqifengji_auto", ByteField.Init(new DeviceField(), "de_1_zhaoqifengji_auto", 394, 2, "One# Biogas Blower Manual/Automatic", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_zhaoqifengji_start_stop", ByteField.Init(new DeviceField(), "de_1_zhaoqifengji_start_stop", 396, 2, "One# Biogas Blower Start/Stop", DevicePointMap.coms_start_stop));
        map.put("de_2_zhaoqifengji_auto", ByteField.Init(new DeviceField(), "de_2_zhaoqifengji_auto", 398, 2, "2#Biogas Blower Manual/Automatic", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_zhaoqifengji_start_stop", ByteField.Init(new DeviceField(), "de_2_zhaoqifengji_start_stop", 400, 2, "2#Biogas Blower Start/Stop", DevicePointMap.coms_start_stop));

        map.put("ex_chaoyabaojingyalikaiguan", ByteField.Init(new ExceptionField(), "ex_chaoyabaojingyalikaiguan", 448, 2, "Overpressure Alarm (Pressure Switch)", 0));
        map.put("ex_chaoyabaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojingshedingzhi", 448, 2, "Overpressure Alarm( Setting Value)", 1));
        map.put("ex_paiyanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanchaowenbaojing", 448, 2, "Discharged Flue Gas Over temperature Alarm", 2));
        map.put("ex_ruanshuixiangqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_ruanshuixiangqueshuibaojing", 448, 2, "Soft Water Tank Water Shortage Alarm", 3));
        map.put("ex_shuidianjiluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuidianjiluojicuobaojing", 448, 2, " Electrode Logic Error Alarm", 4));
        map.put("ex_yalibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiguzhangbaojing", 448, 2, "Pressure Transmitter Failure Alarm", 5));
        map.put("ex_shuiweibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_shuiweibiansongqiguzhangbaojing", 448, 2, "Water Level Transmitter Failure Alarm ", 6));
        map.put("ex_paiyanwenduchuanganqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhangbaojing", 448, 2, "Discharged Flue Gas Temperature Transmitter Failure Alarm", 7));

        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 448, 2, "Burner Failure", 8));
        map.put("ex_ranqixielou", ByteField.Init(new ExceptionField(), "ex_ranqixielou", 448, 2, "Gas Leakage", 9));
        map.put("ex_ranqiyaliyichang", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichang", 448, 2, "Gas Pressure Abnormity", 10));
        map.put("ex_shuiweiweidibaojingdianji", ByteField.Init(new ExceptionField(), "ex_shuiweiweidibaojingdianji", 448, 2, "Dangerous Low Water Level Alarm (Electrode)", 11));
        map.put("ex_shuiweijidibaojingdianji", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojingdianji", 448, 2, "Extrem Low Water Level Alarm( Electrode)", 12));
        map.put("ex_shuiweijigaobaojingdianji", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojingdianji", 448, 2, "Extrem High Water Level Alarm( Electrode)", 13));
        map.put("ex_shuiweijidibaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojingshedingzhi", 448, 2, " Extrem Low Water Level Alarm( Setting Value)", 14));
        map.put("ex_shuiweijigaobaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojingshedingzhi", 448, 2, "Extrem High Water Level Alarm( Setting Value)", 15));

        map.put("ex_addshuibeng1guzhang", ByteField.Init(new ExceptionField(), "ex_addshuibeng1guzhang", 450, 2, "Water Feeding Pump 1 Failure", 0));
        map.put("ex_addshuibeng2guzhang", ByteField.Init(new ExceptionField(), "ex_addshuibeng2guzhang", 450, 2, "Water Feeding Pump 2 Failure", 1));
        map.put("ex_zhaoqifengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhaoqifengjibianpinqiguzhang", 450, 2, "沼气风机变频器故障", 2));

        map.put("ex_chuyangqiqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqiqueshuibaojing", 450, 2, "De-aerator Water Shortage Alarm", 8));
        map.put("ex_chuyangqigaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqigaoshuiweibaojing", 450, 2, "De-aerator High Water Level Alarm", 9));
        map.put("ex_addshuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_addshuibengbianpinqiguzhang", 450, 2, "Water Feeding Pump Frequency Converter Failure", 10));
        map.put("ex_chuyangbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuyangbengbianpinqiguzhang", 450, 2, "De-aerator Pump Frequency Converter Failure", 11));
        map.put("ex_zhufengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhufengjibianpinqiguzhang", 450, 2, "Main Blower Frequency Converter Failure", 12));
        map.put("ex_xunhuanfengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanfengjibianpinqiguzhang", 450, 2, "Circulating Blower Frequency Converter Failure", 13));
        map.put("ex_jienengbeng1guzhang", ByteField.Init(new ExceptionField(), "ex_jienengbeng1guzhang", 450, 2, "Energy-Saving Pump 1 Failure", 14));
        map.put("ex_jienengbeng2guzhang", ByteField.Init(new ExceptionField(), "ex_jienengbeng2guzhang", 450, 2, "Energy-Saving Pump 2 Failure", 15));

    }
}
