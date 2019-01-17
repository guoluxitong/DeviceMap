package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.FixedValueField;
import cn.com.sdcsoft.devices.meta.PLC.*;

/**
 *
 * 初始化数据
 */
public class DevicePointMap_PLC_RanMeiZhengQi extends DevicePointMap {

    public static final String Key = "PLC_RanMeiZhengQi";

    public DevicePointMap_PLC_RanMeiZhengQi()
    {
        /**
         * 计算属性（不显示）
         */
        map.put("_addshuibeng", ByteField.Init(new CountField(), "_addshuibeng","Water Feeding Pump"));
        map.put("_chuanyangbeng", ByteField.Init(new CountField(), "_chuanyangbeng","De-aerator Water Pump"));
        map.put("_gufengfan", ByteField.Init(new CountField(), "_gufengfan",  "FD Fan"));
        map.put("_yinfengfan", ByteField.Init(new CountField(), "_yinfengfan", "ID Fan"));
        map.put("_lupaifan", ByteField.Init(new CountField(), "_lupaifan", "Chain Grate"));
        map.put("_chuzhafan", ByteField.Init(new CountField(), "_chuzhafan", "Slag Remover"));


        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "Running Hours", "时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "Running Days", "天"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "System State",PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "Fuel",2,DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA,  "Medium",1,DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "Water Level State",DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "Burner State",PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 35, 4, "Steam Pressure", "MPa"));
        map.put("mo_guoluyewei", ByteField.Init(new MockField(), "mo_guoluyewei", 39, 4, "Boiler Water Level", "mm"));
        map.put("mo_zhengqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhengqishunshiliuliang", 43, 4, "Steam Instantaneous Flow Rate", "T/h"));
        map.put("mo_bushuishunshiliuliang", ByteField.Init(new MockField(), "mo_bushuishunshiliuliang", 47, 4, "Make-up Water Instantaneous Flow Rate", "m³/h"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 51, 4, "Furnace Temperature", "℃"));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 55, 4, "Furnace Pressure", "Pa"));
        map.put("mo_shengmeiqijinkouyanwen", ByteField.Init(new MockField(), "mo_shengmeiqijinkouyanwen", 59, 4, "Economizer Inlet Flus Gas Temperature", "℃"));
        map.put("mo_zuizhongpaiyanwendu", ByteField.Init(new MockField(), "mo_zuizhongpaiyanwendu", 63, 4, "Discharged Flus Gas Temperature", "℃"));
        map.put("mo_zhengqileijiliuliang", ByteField.Init(new MockField(), "mo_zhengqileijiliuliang", 67, 4, "Steam  Integrated Flow Rate", "T"));
        map.put("mo_bushuileijiliuliang", ByteField.Init(new MockField(), "mo_bushuileijiliuliang", 71, 4, "Make-up Integrated Flow Rate", "m³"));
        map.put("mo_shengmeiqijinshuiwendu", ByteField.Init(new MockField(), "mo_shengmeiqijinshuiwendu", 75, 4, "Economizer Inlet Water Temperature", "℃"));
        map.put("mo_shengmeiqichushuiwendu", ByteField.Init(new MockField(), "mo_shengmeiqichushuiwendu", 79, 4, "Economizer Outlet Water Temperature", "℃"));
        map.put("mo_bushuiwendu", ByteField.Init(new MockField(), "mo_bushuiwendu", 83, 4, "Make-up Water Temperature", "℃"));
        map.put("mo_paiyanyali", ByteField.Init(new MockField(), "mo_paiyanyali", 87, 4, "Discharged Flue Gas Pressure", "Pa"));
        map.put("mo_addshuibengpinlvfankui", ByteField.Init(new MockField(), "mo_addshuibengpinlvfankui", 91, 4, "Water Feeding Pump Frequency Feedback", "Hz"));
        map.put("mo_yinfengjipinlvfankui", ByteField.Init(new MockField(), "mo_yinfengjipinlvfankui", 95, 4, "ID Fan Frequency Feedback", "Hz"));
        map.put("mo_gufengjipinlvfankui", ByteField.Init(new MockField(), "mo_gufengjipinlvfankui", 99, 4, "FD Fan Frequency Feedback", "Hz"));
        map.put("mo_ruanshuixiangyewei", ByteField.Init(new MockField(), "mo_ruanshuixiangyewei", 103, 4, "Soft Water Tank Water Level", "%"));
        map.put("mo_guorezhengqiyali", ByteField.Init(new MockField(), "mo_guorezhengqiyali", 107, 4, "Super-heated Steam Pressure", "MPa"));
        map.put("mo_chuyangqiyewei", ByteField.Init(new MockField(), "mo_chuyangqiyewei", 111, 4, "De-aerator Water Level", "%"));
        map.put("mo_guoreqichukouyanwen", ByteField.Init(new MockField(), "mo_guoreqichukouyanwen", 115, 4, "Super-heater Outlet Flue Gas Temperature", "℃"));
        map.put("mo_guoreqizhengqiwendu", ByteField.Init(new MockField(), "mo_guoreqizhengqiwendu", 119, 4, "Super-heater Steam Temperature", "℃"));
        map.put("mo_baohezhengqiwendu", ByteField.Init(new MockField(), "mo_baohezhengqiwendu", 123, 4, "Saturated Steam Temperature", "℃"));
        map.put("mo_yureqijinyanwendu", ByteField.Init(new MockField(), "mo_yureqijinyanwendu", 127, 4, "Ai Pre-heater Inlet Flue Gas Temperature", "℃"));
        map.put("mo_yureqijinyanyali", ByteField.Init(new MockField(), "mo_yureqijinyanyali", 131, 4, "Air Pre-heater Inlet Flue Gas Pressure", "Pa"));
        map.put("mo_chuyangqiwendu", ByteField.Init(new MockField(), "mo_chuyangqiwendu", 135, 4, "De-aerator Temperature", "℃"));
        map.put("mo_chuyangqiyali", ByteField.Init(new MockField(), "mo_chuyangqiyali", 139, 4, "De-aerator Pressure", "KPa"));
        map.put("mo_chuyangbengpinlvfankui", ByteField.Init(new MockField(), "mo_chuyangbengpinlvfankui", 143, 4, "De-aerator Water Pump Frequency Feedback", "Hz"));
        map.put("mo_bushuidiandongfafankui", ByteField.Init(new MockField(), "mo_bushuidiandongfafankui", 147, 4, "Make-up Electric Valve Feedback", "%"));
        map.put("mo_jianwenshuidiandongfafankui", ByteField.Init(new MockField(), "mo_jianwenshuidiandongfafankui", 151, 4, "Attemperating Water Electric Valve Feedback", "%"));
        map.put("mo_chuyangjiarediandongfafankui", ByteField.Init(new MockField(), "mo_chuyangjiarediandongfafankui", 155, 4, "De-aerator Heating Electric Valve Feedback", "%"));
        map.put("mo_zhaoqiyali", ByteField.Init(new MockField(), "mo_zhaoqiyali", 159, 4, "Biogas Pressure", "kPa"));
        map.put("mo_lutangchukouyanwen", ByteField.Init(new MockField(), "mo_lutangchukouyanwen", 163, 4, "Furnace Outlet Flue Gas Temperature", "℃"));
        map.put("mo_kongyuqichukouyanwen", ByteField.Init(new MockField(), "mo_kongyuqichukouyanwen", 167, 4, "Air Pre-heater Outlet Flue Gas Temperature", "℃"));
        map.put("mo_shengmeiqichukouyanwen", ByteField.Init(new MockField(), "mo_shengmeiqichukouyanwen", 171, 4, "Economizer Outlet Flus Gas Temperature", "℃"));



        map.put("se_qiluyalisheding", ByteField.Init(new SettingField(), "se_qiluyalisheding", 248, 4, "Boiler Start Pressure Setting ", "MPa"));
        map.put("se_mubiaoyalisheding", ByteField.Init(new SettingField(), "se_mubiaoyalisheding", 252, 4, "Boiler target Pressure Setting", "MPa"));
        map.put("se_tingluyalisheding", ByteField.Init(new SettingField(), "se_tingluyalisheding", 256, 4, "Bolier Shutdown Pressure Setting ", "MPa"));
        map.put("se_chaoyabaojingyalisheding", ByteField.Init(new SettingField(), "se_chaoyabaojingyalisheding", 260, 4, "Over-pressure Alarm Pressure Setting", "MPa"));
        map.put("se_paiyanchaowenbaojing", ByteField.Init(new SettingField(), "se_paiyanchaowenbaojing", 264, 4, "Flue Gas Over-temperature Alarm", "℃"));
        map.put("se_guolushuiweimubiaosheding", ByteField.Init(new SettingField(), "se_guolushuiweimubiaosheding", 268, 4, "Boiler Water Level Setting ", "mm"));
        map.put("se_guolushuiweijigaobaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijigaobaojingsheding", 272, 4, "Boiler Extrem Water Level Alarm Setting ", "mm"));
        map.put("se_guolutingbengshuiweisheding", ByteField.Init(new SettingField(), "se_guolutingbengshuiweisheding", 276, 4, "Boiler Water Pump Shutdown Water Level Setting", "mm"));
        map.put("se_guoluqibengshuiweisheding", ByteField.Init(new SettingField(), "se_guoluqibengshuiweisheding", 280, 4, "Boiler Water Pump Start Water Level Setting", "mm"));
        map.put("se_guolushuiweijidibaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijidibaojingsheding", 284, 4, "Boiler Extrem Low Water Level Alarm Setting", "mm"));
        map.put("se_guolushuiweishoudonggeisu", ByteField.Init(new SettingField(), "se_guolushuiweishoudonggeisu", 288, 4, "Manual Boiler Water Level Feeding", "%"));

        map.put("de_yinfeng_auto", ByteField.Init(new DeviceField(), "de_yinfeng_auto", 368, 2, "ID Fan Manual/ Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_yinfengji_start_stop", ByteField.Init(new DeviceField(), "de_1_yinfengji_start_stop", 370, 2, "ID Fan Start/ Stop", DevicePointMap.coms_start_stop));
        map.put("de_gufeng_auto", ByteField.Init(new DeviceField(), "de_gufeng_auto", 372, 2, "FD Fan Manual/ Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_gufengji_start_stop", ByteField.Init(new DeviceField(), "de_1_gufengji_start_stop", 374, 2, "FD Fan Start/ Stop", DevicePointMap.coms_start_stop));
        map.put("de_lupai_auto", ByteField.Init(new DeviceField(), "de_lupai_auto", 376, 2, "Chain Grate Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_lupai_start_stop", ByteField.Init(new DeviceField(), "de_lupai_start_stop", 378, 2, "Chain Grate Start/Stop", DevicePointMap.coms_start_stop));
        map.put("de_chuzha_auto", ByteField.Init(new DeviceField(), "de_chuzha_auto", 380, 2, "Slag Removing Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_chuzha_start_stop", ByteField.Init(new DeviceField(), "de_chuzha_start_stop", 382, 2, "Slag Removing Start/Stop", DevicePointMap.coms_start_stop));
        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 384, 2, "Water Feeding Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 386, 2, "Water Feeding Pump Start/Stop", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 388, 2, "Water Feeding Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 390, 2, "Water Feeding Pump Start/Stop", DevicePointMap.coms_start_stop));
        map.put("de_1_chuyangbeng_auto", ByteField.Init(new DeviceField(), "de_1_chuyangbeng_auto", 392, 2, "De-aerator Water Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_chuyangbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_chuyangbeng_start_stop", 394, 2, "De-aerator Water Pump Start/Stop", DevicePointMap.coms_start_stop));
        map.put("de_2_chuyangbeng_auto", ByteField.Init(new DeviceField(), "de_2_chuyangbeng_auto", 396, 2, "De-aerator Water Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_chuyangbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_chuyangbeng_start_stop", 398, 2, "De-aerator Water Pump Start/Stop", DevicePointMap.coms_start_stop));

        map.put("ex_shuiweijidibaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_shedingzhi", 448, 2, "Extrem Low Water Level( Setting Value)", 0));
        map.put("ex_shuiweijigaobaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_shedingzhi", 448, 2, "Extrem High Water Level Alarm( Setting Value)", 1));
        map.put("ex_chaoyabaojing_yalikaiguan", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_yalikaiguan", 448, 2, "Over-pressure Alarm( Pressure Switch)", 2));
        map.put("ex_chaoyabaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_shedingzhi", 448, 2, "Over-pressure Alarm(Setting Value)", 3));
        map.put("ex_paiyanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanchaowenbaojing", 448, 2, "Flue Gas Over-temperature Alarm", 4));
        map.put("ex_ruanshuixiangqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_ruanshuixiangqueshuibaojing", 448, 2, "Soft Water Tank Water Shortage Alarm", 5));
        map.put("ex_shuidianjiluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuidianjiluojicuobaojing", 448, 2, "Water Electrode Logic Failure Alarm", 6));
        map.put("ex_yalibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiguzhangbaojing", 448, 2, "Pressure Transmitter Failure Alarm", 7));

        map.put("ex_yinfengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengjibianpinqiguzhang", 448, 2, "ID Fan Frequency Converter Failure", 8));
        map.put("ex_gufengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengjibianpinqiguzhang", 448, 2, "FD Fan Frequency Converter Failure", 9));
        map.put("ex_lupaibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_lupaibianpinqiguzhang", 448, 2, "Chain Grate Frequency Converter Failure", 10));
        map.put("ex_chuzhabianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuzhabianpinqiguzhang", 448, 2, "Slag Remover Frequency Converter Failure", 11));
        map.put("ex_jishuibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuibianpinqiguzhang", 448, 2, "Water Feeding Pump Frequency Converter Failure", 12));
        map.put("ex_shuiweiweidibaojing", ByteField.Init(new ExceptionField(), "ex_shuiweiweidibaojing", 448, 2, "Dangerous Low Water Level Alarm (Electrode)", 13));
        map.put("ex_shuiweijidibaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_dianji", 448, 2, "Extrem Low Water Level( Electrode)", 14));
        map.put("ex_shuiweijigaobaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_dianji", 448, 2, "Extrem High Water Level Alarm( Setting Value)", 15));


        map.put("ex_shuiweibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_shuiweibiansongqiguzhangbaojing", 450, 2, "Water level Transmitter Failure Alarm", 8));
        map.put("ex_paiyanwenduchuanganqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhangbaojing", 450, 2, "Flue Gas Temperature Sensor Failure Alarm", 9));
        map.put("ex_chuyangqiqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqiqueshuibaojing", 450, 2, "De-aerator Water Shortage Alarm", 10));
        map.put("ex_chuyangqigaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqigaoshuiweibaojing", 450, 2, "High De-aerator Water Level Alarm", 11));

    }
}
