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
public class DevicePointMap_PLC_RanYouZhenKong extends DevicePointMap {

    public static final String Key = "PLC_RanYouZhenKong";

    public DevicePointMap_PLC_RanYouZhenKong() {
        /**
         * 计算属性（不显示）
         */
        map.put("_xunhuanbeng", ByteField.Init(new CountField(), "_xunhuanbeng", "Circulating Pump"));
        map.put("_addshuibeng", ByteField.Init(new CountField(), "_addshuibeng", "Feed water pump"));
        map.put("_zhenkongbeng", ByteField.Init(new CountField(), "_zhenkongbeng", "Vacuum pump"));


        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "Running Hours", "Hour"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "Running Days", "Day"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "System State",PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "Fuel ",0,DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "Medium",4,DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "Water Level State",DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "Burner State",PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_remeishuiwendu", ByteField.Init(new MockField(), "mo_remeishuiwendu", 35, 4, " Hot Medium Water Temperature", "℃"));
        map.put("mo_zhenkongyali", ByteField.Init(new MockField(), "mo_zhenkongyali", 39, 4, "Vacuum Pressure", "Kpa"));
        map.put("mo_jinyanwendu", ByteField.Init(new MockField(), "mo_jinyanwendu", 43, 4, "Inlet Flue Gas Temperature", "℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 47, 4, "Discharged Flue Gas Temperature", "℃"));
        map.put("mo_shiwaiwendu", ByteField.Init(new MockField(), "mo_shiwaiwendu", 51, 4, "Outdoor Temperature ", "℃"));
        map.put("mo_cainuanchushuiwendu", ByteField.Init(new MockField(), "mo_cainuanchushuiwendu", 55, 4, "Outdoor Temperature", "℃"));
        map.put("mo_cainuanhuishuiwendu", ByteField.Init(new MockField(), "mo_cainuanhuishuiwendu", 59, 4, "Heating Return Water Temperature ", "℃"));
        map.put("mo_cainuanchushuiyali", ByteField.Init(new MockField(), "mo_cainuanchushuiyali", 63, 4, "Heating output Water Pressure", "Mpa"));
        map.put("mo_cainuanhuishuiyali", ByteField.Init(new MockField(), "mo_cainuanhuishuiyali", 67, 4, " Heating Return Water Pressure", "Mpa"));
        map.put("mo_shenghuochushuiwendu", ByteField.Init(new MockField(), "mo_shenghuochushuiwendu", 71, 4, "Domesic Outlet Water Temperature", "℃"));
        map.put("mo_shenghuohuishuiwendu", ByteField.Init(new MockField(), "mo_shenghuohuishuiwendu", 75, 4, "Domestic Return Water Temperature ", "℃"));
        map.put("mo_shenghuochushuiyali", ByteField.Init(new MockField(), "mo_shenghuochushuiyali", 79, 4, "Domestic Outlet Water Pressure ", "Mpa"));
        map.put("mo_shenghuohuishuiyali", ByteField.Init(new MockField(), "mo_shenghuohuishuiyali", 83, 4, "Domestic Return Water Pressure", "Mpa"));

        map.put("se_qiluwendusheding", ByteField.Init(new SettingField(), "se_qiluwendusheding", 111, 4, "Boiler Start Temperature Setting", "℃"));
        map.put("se_mubiaowendusheding", ByteField.Init(new SettingField(), "se_mubiaowendusheding", 115, 4, "Target Temperature Setting", "℃"));
        map.put("se_tingluwendusheding", ByteField.Init(new SettingField(), "se_tingluwendusheding", 119, 4, "Boiler Shutdown Temperature Setting", "℃"));
        map.put("se_zhenkongyalidisheding", ByteField.Init(new SettingField(), "se_zhenkongyalidisheding", 123, 4, "Low Vocuum Pressure Setting", "KPa"));
        map.put("se_zhenkongyaligaosheding", ByteField.Init(new SettingField(), "se_zhenkongyaligaosheding", 127, 4, "High Vocuum Pressure Setting ", "KPa"));
        map.put("se_paiyanwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_paiyanwenduchaogaobaojingsheding", 131, 4, "Ultrahigh Discharged Flue Gas Temperature Alarm Setting ", "℃"));
        map.put("se_chukouwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_chukouwenduchaogaobaojingsheding", 135, 4, "Ultrahigh Hot Medium Water Temperature Alarm Setting ", "℃"));
        map.put("se_zhenkongyalichaogaobaojingsheding", ByteField.Init(new SettingField(), "se_zhenkongyalichaogaobaojingsheding", 139, 4, "Ultrahigh Vocuum Pressure Alarm Setting", "KPa"));

        map.put("de_ranshaojiqiting", ByteField.Init(new DeviceField(), "de_ranshaojiqiting", 163, 2, "Burner On-off",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_auto", 165, 2, "1# Circulating Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_start_stop", 167, 2, "1#Circulating Pump On/Off",DevicePointMap.coms_start_stop));
        map.put("de_2_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_auto", 169, 2, "2#Circulating Pump Manual/ Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_start_stop", 171, 2, "2#Circulating Pump Manual/ Automatic", DevicePointMap.coms_start_stop));
        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 173, 2, "1#Make-up Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 175, 2, "1#Make-up Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 177, 2, "2# Make-up Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 179, 2, "2# Make-up Pump On/Off ", DevicePointMap.coms_start_stop));
        map.put("de_zhenkongbeng_auto", ByteField.Init(new DeviceField(), "de_zhenkongbeng_auto", 181, 2, " Make-up Pump On/Off",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_zhenkongbeng_start_stop", ByteField.Init(new DeviceField(), "de_zhenkongbeng_start_stop", 183, 2, "Vocuum Pump On/Off", DevicePointMap.coms_start_stop));
//1  1、2部分在点位表里顺序颠倒
        map.put("ex_lubichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_lubichaowenbaojing", 203, 2, "Furnace Wall Over temperature Alarm", 0));
        map.put("ex_remeishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_remeishuiwenduchuanganqiguzhang", 203, 2, " Hot Medium Water Temperature Transmitter Failture", 1));
        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 203, 2, "Discharged Flue Gas Temperature Transmitter Failture", 2));
        map.put("ex_cainuanchushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_cainuanchushuiwenduchuanganqiguzhang", 203, 2, "Heating Outlet Water Temperature Transmitter Failure", 3));
        map.put("ex_shenghuochushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shenghuochushuiwenduchuanganqiguzhang", 203, 2, "Domestic Outlet Water Temperature Transmitter Failure", 4));
        map.put("ex_wendushedingcuowubaojing", ByteField.Init(new ExceptionField(), "ex_wendushedingcuowubaojing", 203, 2, "Temperature Setting Error Alarm", 5));
        map.put("ex_xunhuanbengliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengliansuoduankaibaojing", 203, 2, "Circulating Pump Interlock Break Alarm", 6));
        map.put("ex_waibuliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuoduankaibaojing", 203, 2, "External Interlock Break Alarm", 7));
//2
        map.put("ex_ranshaojiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaojiguzhang", 203, 2, "Vocuum Pump On/Off", 8));
        map.put("ex_ranqixielou", ByteField.Init(new ExceptionField(), "ex_ranqixielou", 203, 2, " Gas Leakage", 9));
        map.put("ex_ranqiyaliyichang", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichang", 203, 2, "Gas Pressure Abnormity", 10));
        map.put("ex_luneiyaligaobaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_luneiyaligaobaojingshedingzhi", 203, 2, "（设定值）Boiler High Pressure Alarm ( Setting Value)", 11));
        map.put("ex_luneiyaligaobaojingyalikaiguan", ByteField.Init(new ExceptionField(), "ex_luneiyaligaobaojingyalikaiguan", 203, 2, "（压力开关） Boiler High Pressure Alarm ( Pressure Switch)", 12));
        map.put("ex_paiyanwenduchaogaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchaogaobaojing", 203, 2, " Ultrahigh Temperature Discharged Flue Gas Alarm", 13));
        map.put("ex_remeishuiwenduchaogaobaojing", ByteField.Init(new ExceptionField(), "ex_remeishuiwenduchaogaobaojing", 203, 2, "Ultrahigh Hot Medium Water Temperature Alarm", 14));
        map.put("ex_queshuibaohubaojing", ByteField.Init(new ExceptionField(), "ex_queshuibaohubaojing", 203, 2, "Water Shortage Protection Alarm", 15));

    }
}
