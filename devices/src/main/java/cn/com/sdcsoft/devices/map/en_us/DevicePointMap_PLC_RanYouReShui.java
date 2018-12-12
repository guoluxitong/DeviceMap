package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.PLC.*;

/**
 * @author doudou
 * 初始化数据
 */
public class DevicePointMap_PLC_RanYouReShui extends DevicePointMap {
    public static final String Key = "PLC_RanYouReShui";


    public DevicePointMap_PLC_RanYouReShui()
    {
        /**
         * 计算属性（不显示）
         */
        map.put("_addshuibeng", ByteField.Init(new DeviceField(), "_addshuibeng", 0, 0, "Make-up Pump", false));
        map.put("_xunhuanbeng", ByteField.Init(new DeviceField(), "_xunhuanbeng", 0, 0, "Circulating Pump", false));
            //#endregion

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "Running Hours", "时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "Running Days", "天"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "System State",PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new PowerField(), SdcSoftDevice.KEY_POINT_POWER, 0, 0, "Fuel",DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 0, 0, "Medium",DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "Water Level State",DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "Burner State",PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 35, 4, "Outlet Water Temperature", "℃"));
        map.put("mo_huishuiwendu", ByteField.Init(new MockField(), "mo_huishuiwendu", 39, 4, "Return Water Temperature", "℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 43, 4, "Discharged Flue Gas Temperature", "℃"));
        map.put("mo_chushuiyali", ByteField.Init(new MockField(), "mo_chushuiyali", 47, 4, "Outlet Water Pressure", "Mpa"));
        map.put("mo_huishuiyali", ByteField.Init(new MockField(), "mo_huishuiyali", 51, 4, "Return Water Pressure", "Mpa"));
        map.put("mo_yacha", ByteField.Init(new MockField(), "mo_yacha", 55, 4, "Differential Pressure", "Mpa"));
        map.put("mo_lengningqijinyanwendu", ByteField.Init(new MockField(), "mo_lengningqijinyanwendu", 59, 4, "Condenser Inlet Flue Gas Temperature", "℃"));
        map.put("mo_lengningqijinyanyali", ByteField.Init(new MockField(), "mo_lengningqijinyanyali", 63, 4, "Condenser Inlet Flue Gas Pressure", "Pa"));
        map.put("mo_jienengqijinyanwendu", ByteField.Init(new MockField(), "mo_jienengqijinyanwendu", 67, 4, "Economizer Inlet Flue Gas Temperature", "℃"));
        map.put("mo_jienengqijinyanyali", ByteField.Init(new MockField(), "mo_jienengqijinyanyali", 71, 4, "Economizser Inlet Flue Gas Pressure", "Pa"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 75, 4, "Furnace Temperature", "℃"));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 79, 4, "Furnace Pressure", "Pa"));
        map.put("mo_kongyuqijinyanwendu", ByteField.Init(new MockField(), "mo_kongyuqijinyanwendu", 83, 4, "Air Pre-heater Inlet Flue Gas Temperature", "℃"));
        map.put("mo_kongyuqijinyanyali", ByteField.Init(new MockField(), "mo_kongyuqijinyanyali", 87, 4, "Air Pre-heater Inlet Flue Gas Pressure", "Pa"));
        map.put("mo_kongyuqijinfengwendu", ByteField.Init(new MockField(), "mo_kongyuqijinfengwendu", 91, 4, "Air Pre-heater Inlet Air Temperature", "℃"));
        map.put("mo_kongyuqijinfengyali", ByteField.Init(new MockField(), "mo_kongyuqijinfengyali", 95, 4, "Air Pre-heater Inlet Air Pressure", "Kpa"));
        map.put("mo_kongyuqichufengwendu", ByteField.Init(new MockField(), "mo_kongyuqichufengwendu", 99, 4, "Air Pre-heater Outlet Air Temperature", "℃"));
        map.put("mo_zhufengjipinlüfankui", ByteField.Init(new MockField(), "mo_zhufengjipinlüfankui", 103, 4, "Main Blower Frequency Feedback", "Hz"));
        map.put("mo_xunhuanfengjipinlüfankui", ByteField.Init(new MockField(), "mo_xunhuanfengjipinlüfankui", 107, 4, "Circulating Blower Frequency Feedback", "Hz"));
        map.put("mo_addshuibengpinlüfankui", ByteField.Init(new MockField(), "mo_addshuibengpinlüfankui", 111, 4, "Make-up Pump Feedback", "Hz"));
        map.put("mo_shiwaiwendu", ByteField.Init(new MockField(), "mo_shiwaiwendu", 115, 4, "Outdoor Temperature", "℃"));
        map.put("mo_xunhuanbeng1pinlüfankui", ByteField.Init(new MockField(), "mo_xunhuanbeng1pinlüfankui", 119, 4, "Circulating Pump 1 Frequency Feedback", "Hz"));
        map.put("mo_xunhuanbeng2pinlüfankui", ByteField.Init(new MockField(), "mo_xunhuanbeng2pinlüfankui", 123, 4, "Circulating Pump 2 Frequency Feedback", "Hz"));

        map.put("se_qiluwendusheding", ByteField.Init(new SettingField(), "se_qiluwendusheding", 248, 4, "Boiler Start Temperature Setting", "℃"));
        map.put("se_mubiaowendusheding", ByteField.Init(new SettingField(), "se_mubiaowendusheding", 252, 4, "Target Temperature Setting", "℃"));
        map.put("se_tingluwendusheding", ByteField.Init(new SettingField(), "se_tingluwendusheding", 256, 4, "Boiler Shutdown Temperature Setting", "℃"));
        map.put("se_yalidisheding", ByteField.Init(new SettingField(), "se_yalidisheding", 260, 4, "Low Pressure Setting", "Mpa"));
        map.put("se_yaligaosheding", ByteField.Init(new SettingField(), "se_yaligaosheding", 264, 4, "High Pressure Setting", "Mpa"));
        map.put("se_paiyanwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_paiyanwenduchaogaobaojingsheding", 268, 4, "Ultrahigh Discharged Flue Gas Temperature Setting ", "℃"));
        map.put("se_chukouwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_chukouwenduchaogaobaojingsheding", 272, 4, "Ultrahigh Outlet Temperature Alarm Setting", "℃"));
        map.put("se_yalichaogaobaojingsheding", ByteField.Init(new SettingField(), "se_yalichaogaobaojingsheding", 276, 4, "Ultrahigh Pressure Alarm Setting", "Mpa"));
        map.put("se_yalichaodibaojingsheding", ByteField.Init(new SettingField(), "se_yalichaodibaojingsheding", 280, 4, "Ultralow Pressure Alarm Setting", "Mpa"));


        map.put("de_ranshaoqiqiting", ByteField.Init(new DeviceField(), "de_ranshaoqiqiting", 368, 2, "Burner On-off", PLC_Common_ValueMaps.coms_ranshaoqi_status));
        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 370, 2, "Make-up Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 372, 2, "Make-up Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 374, 2, "Make-up Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 376, 2, "Make-up Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_1_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_auto", 378, 2, "Circulating Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_start_stop", 380, 2, "Circulating Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_2_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_auto", 382, 2, "Circulating Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_start_stop", 384, 2, "Circulating Pump On/Off", DevicePointMap.coms_start_stop));


        map.put("ex_lubichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_lubichaowenbaojing", 448, 2, "Furnace Wall Over Temperature Alarm", 0));
        map.put("ex_chushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiguzhang", 448, 2, "Outlet Water Temperature Transmitter Failure", 1));
        map.put("ex_huishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiwenduchuanganqiguzhang", 448, 2, "Return Water Temperature Transmitter Failure", 2));
        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 448, 2, "Discharged Flue Gas Temperature Transmitter Failure", 3));
        map.put("ex_wendushedingcuowubaojing", ByteField.Init(new ExceptionField(), "ex_wendushedingcuowubaojing", 448, 2, "Temperature Setting Error Alarm", 4));
        map.put("ex_xunhuanbengliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengliansuoduankaibaojing", 448, 2, "Circulating Pump Interlock Break Alarm", 5));
        map.put("ex_waibuliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuoduankaibaojing", 448, 2, "External Interlock Break Alarm", 6));
        map.put("ex_chushuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiyalibiansongqiguzhang", 448, 2, "Outlet Water Pressure Transmitter Failure", 7));

        map.put("ex_ranshaojiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaojiguzhang", 448, 2, "Burner Failure", 8));
        map.put("ex_ranqixielou", ByteField.Init(new ExceptionField(), "ex_ranqixielou", 448, 2, "Gas Leakage", 9));
        map.put("ex_ranqiyaliyichang", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichang", 448, 2, "Gas Pressure Abnormity", 10));
        map.put("ex_yalichaogaobaojing", ByteField.Init(new ExceptionField(), "ex_yalichaogaobaojing", 448, 2, "Ultrahigh Pressure Alarm", 11));
        map.put("ex_yalichaodibaojing", ByteField.Init(new ExceptionField(), "ex_yalichaodibaojing", 448, 2, "Ultralow Pressure Alarm", 12));
        map.put("ex_paiyanwenduchaogaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchaogaobaojing", 448, 2, "Ultrahigh Discharged Flue Gas Temperature Alarm", 13));
        map.put("ex_chushuiwenduchaogaobaojing", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchaogaobaojing", 448, 2, "Ultrahigh Outlet Water Temperature Alarm", 14));
        map.put("ex_queshuibaohubaojing", ByteField.Init(new ExceptionField(), "ex_queshuibaohubaojing", 448, 2, "Water Shortage Protection Alarm", 15));

        map.put("ex_huishuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiyalibiansongqiguzhang", 450, 2, "Return Water Pressure Transmitter Failure", 8));


    }
}
