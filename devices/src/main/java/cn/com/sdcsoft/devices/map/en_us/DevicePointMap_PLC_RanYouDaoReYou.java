package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.PLC.*;

/**
 * @author doudou
 * 初始化数据
 */
public class DevicePointMap_PLC_RanYouDaoReYou extends DevicePointMap {
    public static final String Key = "PLC_DaoReYou";


    public DevicePointMap_PLC_RanYouDaoReYou() {
        /**
         * 计算属性（不显示）
         */
        map.put("_zhuyoubeng", ByteField.Init(new DeviceField(), "_zhuyoubeng", 0, 0, "Oil Filling Pump", false));
        map.put("_xunhuanbeng", ByteField.Init(new DeviceField(), "_xunhuanbeng", 0, 0, "Circulating Pump", false));



        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "Running Hours"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "Running Days"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "System State", PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new PowerField(), SdcSoftDevice.KEY_POINT_POWER, 0, 0, "Fuel", DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 2, 0, "Medium", DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "Water Level State", DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "Burner State", PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_jinkouwendu", ByteField.Init(new MockField(), "mo_jinkouwendu", 35, 4, "Inlet Temperature", "℃"));
        map.put("mo_chukouwendu", ByteField.Init(new MockField(), "mo_chukouwendu", 39, 4, "Outlet Temperature", "℃"));
        map.put("mo_gaoweiyoucaowendu", ByteField.Init(new MockField(), "mo_gaoweiyoucaowendu", 43, 4, "Head Oil Groove Temperature", "℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 47, 4, "Discharged Flue Gas Temperature", "℃"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 51, 4, "Furnace Temperature", "℃"));
        map.put("mo_lutangchukouwendu", ByteField.Init(new MockField(), "mo_lutangchukouwendu", 55, 4, "Furnace Outlet Temperature", "℃"));
        map.put("mo_kongyuqianwendu", ByteField.Init(new MockField(), "mo_kongyuqianwendu", 59, 4, "Front Side Temperature of Air pre-heater", "℃"));
        map.put("mo_kongyuhouwendu", ByteField.Init(new MockField(), "mo_kongyuhouwendu", 63, 4, "Rear Side temperature of Air pre-heater", "℃"));
        map.put("mo_jinkouyali", ByteField.Init(new MockField(), "mo_jinkouyali", 67, 4, "Inlet Pressure", "MPa"));
        map.put("mo_chukouyali", ByteField.Init(new MockField(), "mo_chukouyali", 71, 4, "Outlet Pressure", "MPa"));
        map.put("mo_danqiyali", ByteField.Init(new MockField(), "mo_danqiyali", 75, 4, "Nitrogen Pressure", "kPa"));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 79, 4, "Furnace Pressure", "kPa"));
        map.put("mo_gaoweiyoucaowei", ByteField.Init(new MockField(), "mo_gaoweiyoucaowei", 83, 4, "Head Tank Oil Level", "%"));
        map.put("mo_chuyouguanyouwei", ByteField.Init(new MockField(), "mo_chuyouguanyouwei", 87, 4, "Oil Level of Oil Tank", "%"));
        map.put("mo_liuliangceliang", ByteField.Init(new MockField(), "mo_liuliangceliang", 91, 4, "Flow Rate Measurement", "m³/h"));
        map.put("mo_diandongtiaojiefashuchu", ByteField.Init(new MockField(), "mo_diandongtiaojiefashuchu", 95, 4, "Electric Regulating Valve Output", "%"));
        map.put("mo_bianpinqipinlvshuchu", ByteField.Init(new MockField(), "mo_bianpinqipinlvshuchu", 99, 4, "Frequency Output of Frequency Converter", "Hz"));

        map.put("se_chukouwenduqiluwendusheding", ByteField.Init(new SettingField(), "se_chukouwenduqiluwendusheding", 111, 4, "Outlet Temperature and Boiler Start Temperature Setting", "℃"));
        map.put("se_chukouwendubitiaowendusheding", ByteField.Init(new SettingField(), "se_chukouwendubitiaowendusheding", 115, 4, "Outlet Temperature and Proportional Control Temperature Setting", "℃"));
        map.put("se_chukouwendutingluwendusheding", ByteField.Init(new SettingField(), "se_chukouwendutingluwendusheding", 119, 4, "Outlet Temperature and Boiler Shutdown Temperature Setting", "℃"));
        map.put("se_chukouwenduchaogaobaojingwendusheding", ByteField.Init(new SettingField(), "se_chukouwenduchaogaobaojingwendusheding", 123, 4, "Extrem High Outlet Temperature Alarm Setting ", "℃"));
        map.put("se_paiyanwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_paiyanwenduchaogaobaojingsheding", 127, 4, "Ultrahigh Discharged Flue Gas Temperature Alarm Setting", "℃"));
        map.put("se_gaoweicaoyouweidisheding", ByteField.Init(new SettingField(), "se_gaoweicaoyouweidisheding", 131, 4, "Low Head Tank Oil Level Setting", "%"));
        map.put("se_gaoweicaoyouweigaosheding", ByteField.Init(new SettingField(), "se_gaoweicaoyouweigaosheding", 135, 4, "High Head Tank Oil Level Setting", "%"));
        map.put("se_anquanyouwensheding", ByteField.Init(new SettingField(), "se_anquanyouwensheding", 139, 4, "Safe Oil Temperature Setting", "℃"));
        map.put("se_fengjiqidongshijiansheding", ByteField.Init(new SettingField(), "se_fengjiqidongshijiansheding", 143, 4, "Blower Start Time Setting", "S"));
        map.put("se_fengjiqidongpinlvsheding", ByteField.Init(new SettingField(), "se_fengjiqidongpinlvsheding", 147, 4, "Blower Start Frequency Setting", "Hz"));
        map.put("se_fengjiyunxingpinlvsheding", ByteField.Init(new SettingField(), "se_fengjiyunxingpinlvsheding", 151, 4, "Blower Operation Frequency Setting", "Hz"));
        map.put("se_jinchukouyachagaobaojingsheding", ByteField.Init(new SettingField(), "se_jinchukouyachagaobaojingsheding", 155, 4, "High Differential Pressure Alarm Setting of Inlet and Outlet", "MPa"));
        map.put("se_jinchukouyachadibaojingsheding", ByteField.Init(new SettingField(), "se_jinchukouyachadibaojingsheding", 159, 4, "Low Differential Pressure Alarm Setting of Inlet and Outlet", "MPa"));
        map.put("se_liuliangxiaxianbaojing", ByteField.Init(new SettingField(), "se_liuliangxiaxianbaojing", 163, 4, "Flow Rate Lower Limit Alarm", "m³/h"));
        map.put("se_liuliangjidibaojing", ByteField.Init(new SettingField(), "se_liuliangjidibaojing", 167, 4, "Extrem Low Flow Rate Alarm", "m³/h"));
        map.put("se_danqiyalidisheding", ByteField.Init(new SettingField(), "se_danqiyalidisheding", 171, 4, "Low Nitrogen Pressure Setting", "kPa"));
        map.put("se_danqiyaligaosheding", ByteField.Init(new SettingField(), "se_danqiyaligaosheding", 175, 4, "High Nitrogen Pressure Setting", "kPa"));
        map.put("se_diandongfashoudongkaidusheding", ByteField.Init(new SettingField(), "se_diandongfashoudongkaidusheding", 179, 4, "Electric Valve Manually Opening Setting ", "%"));

        map.put("de_1_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_auto", 203, 2, "Circulating Pump", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_start_stop", 205, 2, "Circulating Pump", DevicePointMap.coms_start_stop));
        map.put("de_2_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_auto", 207, 2, "Circulating Pump", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_start_stop", 209, 2, "Circulating Pump", DevicePointMap.coms_start_stop));
        map.put("de_3_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_3_xunhuanbeng_auto", 211, 2, "Circulating Pump", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_3_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_3_xunhuanbeng_start_stop", 213, 2, "Circulating Pump", DevicePointMap.coms_start_stop));
        map.put("de_zhuyoubeng_auto", ByteField.Init(new DeviceField(), "de_zhuyoubeng_auto", 215, 2, "Oil Filling Pump", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_zhuyoubeng_start_stop", ByteField.Init(new DeviceField(), "de_zhuyoubeng_start_stop", 217, 2, "Oil Filling Pump", DevicePointMap.coms_start_stop));

        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 229, 2, "Burner Failure", 8));
        map.put("ex_ranqixielou", ByteField.Init(new ExceptionField(), "ex_ranqixielou", 229, 2, "Gas Leakage", 9));
        map.put("ex_ranqiyaliyichang", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichang", 229, 2, "Gas Pressure Abnormity", 10));
        map.put("ex_fengjiguzhang", ByteField.Init(new ExceptionField(), "ex_fengjiguzhang", 229, 2, "Blower Failure", 11));
        map.put("ex_1_xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "xunhuanbengguzhang", 229, 2, "Circulating Pump Failure", 12));
        map.put("ex_2_xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "xunhuanbengguzhang", 229, 2, "Circulating Pump Failure", 13));
        map.put("ex_3_xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "xunhuanbengguzhang", 229, 2, "Circulating Pump Failure", 14));
        map.put("ex_zhuyoubengguzhang", ByteField.Init(new ExceptionField(), "ex_zhuyoubengguzhang", 229, 2, "Oil Filling Pump Failure", 15));
        map.put("ex_jinchukouyachachaogao", ByteField.Init(new ExceptionField(), "ex_jinchukouyachachaogao", 229, 2, "Ultrahigh Inlet and Outlet Differential Pressure", 0));
        map.put("ex_jinchukouyachachaodi", ByteField.Init(new ExceptionField(), "ex_jinchukouyachachaodi", 229, 2, "Ultralow Inlet and Outlet Differential Pressure", 1));
        map.put("ex_paiyanwenduchaogao", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchaogao", 229, 2, "Extrem High Discharged Flue Gas  Temperature", 2));
        map.put("ex_chukouwenduchaogao", ByteField.Init(new ExceptionField(), "ex_chukouwenduchaogao", 229, 2, "Extrem High Outlet Temperature", 3));
        map.put("ex_liuliangxiaxianbaojing", ByteField.Init(new ExceptionField(), "ex_liuliangxiaxianbaojing", 229, 2, "Flow Rate Lower Limit Alarm", 4));
        map.put("ex_liuliangjidibaojing", ByteField.Init(new ExceptionField(), "ex_liuliangjidibaojing", 229, 2, "Extrem Low Flow Rate Alarm", 5));
        map.put("ex_queyoubaojingfuqiu", ByteField.Init(new ExceptionField(), "ex_queyoubaojingfuqiu", 229, 2, "Oil Shortage Alarm( Floating Ball)", 6));
        map.put("ex_chuyouwenduchuanganqibaojing", ByteField.Init(new ExceptionField(), "ex_chuyouwenduchuanganqibaojing", 229, 2, "Outlet Oil Temperature Transmitter Failure", 7));

        map.put("ex_huiyouwenduchuanganqibaojing", ByteField.Init(new ExceptionField(), "ex_huiyouwenduchuanganqibaojing", 231, 2, "Return Oil Temperature Transmitter Failure", 8));
        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 231, 2, "Discharged Flue Gas Temperature Sensor Failure", 9));
        map.put("ex_xunhuanbengliansuoguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanbengliansuoguzhang", 231, 2, "Circulating Pump Interlock Failure", 10));
        map.put("ex_wendushedingcuowuguzhang", ByteField.Init(new ExceptionField(), "ex_wendushedingcuowuguzhang", 231, 2, "Temperature Setting Error", 11));
        map.put("ex_gaoweiyoucaoyouweidibaojing", ByteField.Init(new ExceptionField(), "ex_gaoweiyoucaoyouweidibaojing", 231, 2, "Low Head Tank Oil Level Alarm ", 12));
        map.put("ex_gaoweiyoucaoyouweigaobaojing", ByteField.Init(new ExceptionField(), "ex_gaoweiyoucaoyouweigaobaojing", 231, 2, "High Head Tank Oil Level Alarm", 13));
        map.put("ex_1_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_1_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 14));
        map.put("ex_2_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_2_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 15));
        map.put("ex_3_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_3_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 0));
        map.put("ex_4_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_4_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 1));
        map.put("ex_5_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_5_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 2));
        map.put("ex_6_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_6_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 3));
        map.put("ex_7_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_7_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 4));
        map.put("ex_8_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_8_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 5));
        map.put("ex_9_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_9_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 6));
        map.put("ex_10_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_10_zhiguanchaowenbaojing", 231, 2, "Branch Pipe Over-Temperature Alarm", 7));
        map.put("ex_plcguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_plcguzhangbaojing", 233, 2, "PLC Failure Alarm", 8));
    }
}
