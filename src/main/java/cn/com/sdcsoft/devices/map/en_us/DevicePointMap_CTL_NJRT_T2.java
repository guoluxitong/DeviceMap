package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;

import static cn.com.sdcsoft.devices.map.en_us.DevicePointMap.CTL_NJRT_Common_ValueMaps.*;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_NJRT_T2 extends DevicePointMap {
    public static final String Key = "CTL_NJRT_T2";


    public DevicePointMap_CTL_NJRT_T2() {

        map.put("_ranshaoqi", ByteField.Init(new BaseInfoField(), "_ranshaoqi", 0, 0, "Burner"));
        map.put("_addshuibeng", ByteField.Init(new BaseInfoField(), "_addshuibeng", 0, 0, "Water Feeding Pump"));
        map.put("_lengningbeng", ByteField.Init(new BaseInfoField(), "_lengningbeng", 0, 0, "Condensation Pump"));

        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "System State", coms_status));
        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "Running Time"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 0, 0, "Running Days", "Day"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 0, 0, "Running Hours", "Hour"));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_POWER, 87, 2, "Fuel Type", coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_MEDIA, 89, 2, "Medium Type", coms_media));

        map.put("oc_ranshaoqiqitingkongzhi", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiqitingkongzhi", 9, 2, "Burner on-off Control", 0, coms_start_stop));
        map.put("oc_ranshaoqifuhetiaojie", ByteField.Init(new OpenCloseField(), "oc_ranshaoqifuhetiaojie", 9, 2, "Burner Load Adjustment", 1, coms_start_stop));
        map.put("oc_1_addshuibeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_1_addshuibeng_start_stop", 9, 2, "Water Feeding Pump(On Duty)Control", 3, coms_start_stop));
        map.put("oc_2_addshuibeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_2_addshuibeng_start_stop", 9, 2, "Water Feeding Pump(Back-up)Control", 4, coms_start_stop));
        map.put("oc_1_lengningxunhuanbeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_1_lengningxunhuanbeng_start_stop", 9, 2, "Condensing Circulating Pump Control", 5, coms_start_stop));
        map.put("oc_baojingshuchu", ByteField.Init(new OpenCloseField(), "oc_baojingshuchu", 9, 2, "Alarm Signaling Operation", 6, coms_start_stop));

        map.put("oc_jishuibengzhubei", ByteField.Init(new OpenCloseField(), "oc_jishuibengzhubei", 49, 2, "Water Feeding Pump On Duty/Back-up", 0, coms_master));
        map.put("oc_jishuibengshouzi", ByteField.Init(new OpenCloseField(), "oc_jishuibengshouzi", 49, 2, "Water Feeding Pump Manual/Automatic", 1, coms_atuo));
        map.put("oc_jienengxunhuanbengshouzi", ByteField.Init(new OpenCloseField(), "oc_jienengxunhuanbengshouzi", 49, 2, "Energy-saving Circulating Pump Manual/Automatic", 3, coms_master));

        map.put("ex_shuiweichuanganqicut", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqicut", 45, 2, "Water Level Transmitter Open Circuit", 3));
        map.put("ex_shuiweichuanganqishort", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqishort", 45, 2, "Water Level Transmitter Short Circuit", 4));
        map.put("ex_jixiandishuiweibaojingdianliu", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojingdianliu", 45, 2, "Extreme Low Water Level Alarm(Electric Current)", 5));
        map.put("ex_gaoshuiweibaojingdianliu", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojingdianliu", 45, 2, "High Water Level Alarm( Electric Current)", 6));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "High Discharged Flue Gas Temperature Alarm", 7));
        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "Extreme Low Water Level Alarm", 8));
        map.put("ex_shuiweidianjiluojicuo", ByteField.Init(new ExceptionField(), "ex_shuiweidianjiluojicuo", 45, 2, "Water-level Electrode Logic Error", 9));
        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 45, 2, "Low Water Level Alarm", 10));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "High Water Level Alarm", 11));
        map.put("ex_bianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhang", 45, 2, "Frequency Converter Failure", 12));
        map.put("ex_chaoyabaojingkongzhiqi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojingkongzhiqi", 45, 2, "Overpressure Alarm( Controller)", 13));
        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 45, 2, "Low Gas Pressure Alarm", 14));
        map.put("ex_ranqiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaligaobaojing", 45, 2, "High Gas Pressure Alarm", 15));
        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 47, 2, "Gas Leakage Alarm", 0));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 47, 2, "Burner Failure", 1));

        map.put("mo_lengningqiyanwen", ByteField.Init(new MockField(), "mo_lengningqiyanwen", 13, 2, "Condenser Flue Gas Temperature", "℃"));
        map.put("mo_jishuiwendu", ByteField.Init(new MockField(), "mo_jishuiwendu", 15, 2, "Feeding Water Temperature", "℃"));
        map.put("mo_shuiweixinhao", ByteField.Init(new MockField(), "mo_shuiweixinhao", 19, 2, "Water Level", "%"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 21, 2, "Discharged Flue Gas Temperature", "℃"));
        map.put("mo_jienengqiyanwen", ByteField.Init(new MockField(), "mo_jienengqiyanwen", 23, 2, "Economizer Flue Gas Temperature", "℃"));
    }
}
