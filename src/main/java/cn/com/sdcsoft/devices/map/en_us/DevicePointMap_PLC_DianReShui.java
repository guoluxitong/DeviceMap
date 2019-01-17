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
public class DevicePointMap_PLC_DianReShui extends DevicePointMap {
    public static final String Key = "PLC_DianReShui";

    public DevicePointMap_PLC_DianReShui() {
        /**
         * 计算属性（不显示）
         */
        map.put("_addshuibeng", ByteField.Init(new CountField(), "_addshuibeng",  "Make-up Pump"));
        map.put("_xunhuanbeng", ByteField.Init(new CountField(), "_xunhuanbeng", "Circulating Pump"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "Running Hours", "时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "Running Days", "天"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "System State", PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER,  "Fuel", 1,DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA,  "Medium", 0,DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "Water Level State", DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "Burner State", PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 35, 4, "Outlet Water Temperature", "℃"));
        map.put("mo_huishuiwendu", ByteField.Init(new MockField(), "mo_huishuiwendu", 39, 4, "Return Water Temperature", "℃"));
        map.put("mo_chushuiyali", ByteField.Init(new MockField(), "mo_chushuiyali", 43, 4, "Outlet Water Pressure", "Mpa"));
        map.put("mo_huishuiyali", ByteField.Init(new MockField(), "mo_huishuiyali", 47, 4, "Return Water Pressure", "Mpa"));
        map.put("mo_qidongjiarezushu", ByteField.Init(new MockField(), "mo_qidongjiarezushu", 79, 4, "Heating Blocks Starting Quantity", "组"));
        map.put("mo_qidongjiarezushubaifenbi", ByteField.Init(new MockField(), "mo_qidongjiarezushubaifenbi", 83, 4, "Heating Blocks Starting Percentage", "%"));

        map.put("se_chaowenbaojingsheding", ByteField.Init(new SettingField(), "se_chaowenbaojingsheding", 127, 4, "Over-temperature Alarm Setting", "℃"));
        map.put("se_shiyongjiarezushusheding", ByteField.Init(new SettingField(), "se_shiyongjiarezushusheding", 131, 4, "Qty of Heating Blocks in Service Setting", "组"));
        map.put("se_touqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_touqiejiangeshijiansheding", 135, 4, "Switching Interval Setting ", "S"));
        map.put("se_kuaiqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_kuaiqiejiangeshijiansheding", 139, 4, "Quick Switching Interval Setting", "S"));
        map.put("se_tingluwendusheding", ByteField.Init(new SettingField(), "se_tingluwendusheding", 143, 4, "Boiler Shutdown Temperature Setting", "℃"));
        map.put("se_shiyongwendusheding", ByteField.Init(new SettingField(), "se_shiyongwendusheding", 147, 4, "Operation Temperature Setting", "℃"));
        map.put("se_qiluwendusheding", ByteField.Init(new SettingField(), "se_qiluwendusheding", 151, 4, "Boiler Starting Temperature Setting", "℃"));
        map.put("se_yalidibaojingsheding", ByteField.Init(new SettingField(), "se_yalidibaojingsheding", 155, 4, "Low Pressure Alarm Setting", "Mpa"));
        map.put("se_yaligaobaojingsheding", ByteField.Init(new SettingField(), "se_yaligaobaojingsheding", 159, 4, "High Pressure Alarm Setting", "Mpa"));
        map.put("se_qibengyalisheding", ByteField.Init(new SettingField(), "se_qibengyalisheding", 163, 4, "Pump-on Pressure Setting", "Mpa"));
        map.put("se_tingbengyalisheding", ByteField.Init(new SettingField(), "se_tingbengyalisheding", 167, 4, "Pump-off Pressure Setting", "Mpa"));
        map.put("se_xunhuanbengshangxianwendusheding", ByteField.Init(new SettingField(), "se_xunhuanbengshangxianwendusheding", 171, 4, "Circulating Pump Upper Limit Setting", "℃"));
        map.put("se_xunhuanbengxiaxianwendusheding", ByteField.Init(new SettingField(), "se_xunhuanbengxiaxianwendusheding", 175, 4, "Circulating Pump Lower Limit Setting", "℃"));


        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 199, 2, "Make-up Pump", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 201, 2, "Make-up Pump On-off", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 203, 2, "Make-up Pump", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 205, 2, "Make-up Pump On-off", DevicePointMap.coms_start_stop));
        map.put("de_baojingshuchuzhishi", ByteField.Init(new DeviceField(), "de_baojingshuchuzhishi", 207, 2, "Alarm Output Indication", coms_open_close));
        map.put("de_1_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_auto", 209, 2, "Circulating Pump", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_start_stop", 211, 2, "Circulating Pump On-off", DevicePointMap.coms_start_stop));
        map.put("de_2_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_auto", 213, 2, "Circulating Pump", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_start_stop", 215, 2, "Circulating Pump On-off", DevicePointMap.coms_start_stop));

        map.put("ex_shuiweijidibaojing（dianji）", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing（dianji）", 233, 2, "Extrem Low Water Level Alarm( Electrode)", 8));
        map.put("ex_xitongchaoyabaojing（shedingzhi）", ByteField.Init(new ExceptionField(), "ex_xitongchaoyabaojing（shedingzhi）", 233, 2, "System Over-pressure Alarm(Setting Value)", 9));
        map.put("ex_xitongyalidibaojing（shedingzhi）", ByteField.Init(new ExceptionField(), "ex_xitongyalidibaojing（shedingzhi）", 233, 2, "System Low pressure Alarm ( Setting Value)", 10));
        map.put("ex_xitongchaoyabaojing（dianjiedianyalibiao）", ByteField.Init(new ExceptionField(), "ex_xitongchaoyabaojing（dianjiedianyalibiao）", 233, 2, "System Over-pressure Alarm( Electro Connecting Pressure Gauge)", 11));
        map.put("ex_xitongyalidibaojing（dianjiedianyalibiao）", ByteField.Init(new ExceptionField(), "ex_xitongyalidibaojing（dianjiedianyalibiao）", 233, 2, "SystemLow pressure Alarm( Electro Connecting Pressure Gauge)", 12));
        map.put("ex_chushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiguzhang", 233, 2, "Outlet Temperature Sensor Failure", 13));
        map.put("ex_huishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiwenduchuanganqiguzhang）", 233, 2, "Return Water Temperature Sensor Failure", 14));
        map.put("ex_chushuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiyalibiansongqiguzhang", 233, 2, "Outlet Water Pressure Transmitter Failure", 15));
        map.put("ex_huishuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiyalibiansongqiguzhang", 233, 2, "Return Water Pressure transmitter Failure", 0));
        map.put("ex_lubichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_lubichaowenbaojing", 233, 2, "Furnace Wall Over-temperature Alarm", 1));
        map.put("ex_waibuliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuoduankaibaojing", 233, 2, "External Interlock Break Alarm", 2));
        map.put("ex_xunhuanbengliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengliansuoduankaibaojing", 233, 2, "Circulating Pump Interlock Break Alarm", 3));
        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 233, 2, "Electric Leakage Alarm", 4));
        map.put("ex_qianyabaojing", ByteField.Init(new ExceptionField(), "ex_qianyabaojing", 233, 2, "Undervoltage Alarm", 5));
        map.put("ex_chushuichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_chushuichaowenbaojing", 233, 2, "Outlet Water Over-temperature Alarm", 6));
        map.put("ex_wendushedingcuowubaojing", ByteField.Init(new ExceptionField(), "ex_wendushedingcuowubaojing", 233, 2, "Temperature Setting Error Alarm", 7));
        map.put("ex_Axiangguoliubaojing", ByteField.Init(new ExceptionField(), "ex_Axiangguoliubaojing", 235, 2, "A Phase Over-current Alarm", 8));
        map.put("ex_Bxiangguoliubaojing", ByteField.Init(new ExceptionField(), "ex_Bxiangguoliubaojing", 235, 2, "B Phase Over-current Alarm", 9));
        map.put("ex_Cxiangguoliubaojing", ByteField.Init(new ExceptionField(), "ex_Cxiangguoliubaojing", 235, 2, "C Phase Over-current Alarm", 10));


        map.put("oc_1#jiarezu", ByteField.Init(new OpenCloseField(), "oc_1#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_2#jiarezu", ByteField.Init(new OpenCloseField(), "oc_2#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_3#jiarezu", ByteField.Init(new OpenCloseField(), "oc_3#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_4#jiarezu", ByteField.Init(new OpenCloseField(), "oc_4#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_5#jiarezu", ByteField.Init(new OpenCloseField(), "oc_5#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_6#jiarezu", ByteField.Init(new OpenCloseField(), "oc_6#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_7#jiarezu", ByteField.Init(new OpenCloseField(), "oc_7#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_8#jiarezu", ByteField.Init(new OpenCloseField(), "oc_8#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_9#jiarezu", ByteField.Init(new OpenCloseField(), "oc_9#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_10#jiarezu", ByteField.Init(new OpenCloseField(), "oc_10#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_11#jiarezu", ByteField.Init(new OpenCloseField(), "oc_11#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_12#jiarezu", ByteField.Init(new OpenCloseField(), "oc_12#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_13#jiarezu", ByteField.Init(new OpenCloseField(), "oc_13#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_14#jiarezu", ByteField.Init(new OpenCloseField(), "oc_14#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_15#jiarezu", ByteField.Init(new OpenCloseField(), "oc_15#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_16#jiarezu", ByteField.Init(new OpenCloseField(), "oc_16#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_17#jiarezu", ByteField.Init(new OpenCloseField(), "oc_17#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_18#jiarezu", ByteField.Init(new OpenCloseField(), "oc_18#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_19#jiarezu", ByteField.Init(new OpenCloseField(), "oc_19#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_20#jiarezu", ByteField.Init(new OpenCloseField(), "oc_20#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_21#jiarezu", ByteField.Init(new OpenCloseField(), "oc_21#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_22#jiarezu", ByteField.Init(new OpenCloseField(), "oc_22#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_23#jiarezu", ByteField.Init(new OpenCloseField(), "oc_23#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_24#jiarezu", ByteField.Init(new OpenCloseField(), "oc_24#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_25#jiarezu", ByteField.Init(new OpenCloseField(), "oc_25#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_26#jiarezu", ByteField.Init(new OpenCloseField(), "oc_26#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_27#jiarezu", ByteField.Init(new OpenCloseField(), "oc_27#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_28#jiarezu", ByteField.Init(new OpenCloseField(), "oc_28#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_29#jiarezu", ByteField.Init(new OpenCloseField(), "oc_29#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_30#jiarezu", ByteField.Init(new OpenCloseField(), "oc_30#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_31#jiarezu", ByteField.Init(new OpenCloseField(), "oc_31#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_32#jiarezu", ByteField.Init(new OpenCloseField(), "oc_32#jiarezu", 239, 2, "Heating Block Feedback", 1));
    }
}