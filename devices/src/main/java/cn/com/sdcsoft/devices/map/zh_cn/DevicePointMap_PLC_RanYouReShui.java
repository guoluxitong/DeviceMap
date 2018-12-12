package cn.com.sdcsoft.devices.map.zh_cn;


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
        map.put("_addshuibeng", ByteField.Init(new DeviceField(), "_addshuibeng", 0, 0, "给水泵", false));
        map.put("_xunhuanbeng", ByteField.Init(new DeviceField(), "_xunhuanbeng", 0, 0, "循环泵", false));
            //#endregion

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "运行小时数", "时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "系统状态",PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new PowerField(), SdcSoftDevice.KEY_POINT_POWER, 0, 0, "燃料",DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 0, 0, "介质",DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "水位状态",DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "燃烧器状态",PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 35, 4, "出水温度", "℃"));
        map.put("mo_huishuiwendu", ByteField.Init(new MockField(), "mo_huishuiwendu", 39, 4, "回水温度", "℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 43, 4, "排烟温度", "℃"));
        map.put("mo_chushuiyali", ByteField.Init(new MockField(), "mo_chushuiyali", 47, 4, "出水压力", "Mpa"));
        map.put("mo_huishuiyali", ByteField.Init(new MockField(), "mo_huishuiyali", 51, 4, "回水压力", "Mpa"));
        map.put("mo_yacha", ByteField.Init(new MockField(), "mo_yacha", 55, 4, "压差", "Mpa"));
        map.put("mo_lengningqijinyanwendu", ByteField.Init(new MockField(), "mo_lengningqijinyanwendu", 59, 4, "冷凝器进烟温度", "℃"));
        map.put("mo_lengningqijinyanyali", ByteField.Init(new MockField(), "mo_lengningqijinyanyali", 63, 4, "冷凝器进烟压力", "Pa"));
        map.put("mo_jienengqijinyanwendu", ByteField.Init(new MockField(), "mo_jienengqijinyanwendu", 67, 4, "节能器进烟温度", "℃"));
        map.put("mo_jienengqijinyanyali", ByteField.Init(new MockField(), "mo_jienengqijinyanyali", 71, 4, "节能器进烟压力", "Pa"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 75, 4, "炉膛温度", "℃"));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 79, 4, "炉膛压力", "Pa"));
        map.put("mo_kongyuqijinyanwendu", ByteField.Init(new MockField(), "mo_kongyuqijinyanwendu", 83, 4, "空预器进烟温度", "℃"));
        map.put("mo_kongyuqijinyanyali", ByteField.Init(new MockField(), "mo_kongyuqijinyanyali", 87, 4, "空预器进烟压力", "Pa"));
        map.put("mo_kongyuqijinfengwendu", ByteField.Init(new MockField(), "mo_kongyuqijinfengwendu", 91, 4, "空预器进风温度", "℃"));
        map.put("mo_kongyuqijinfengyali", ByteField.Init(new MockField(), "mo_kongyuqijinfengyali", 95, 4, "空预器进风压力", "Kpa"));
        map.put("mo_kongyuqichufengwendu", ByteField.Init(new MockField(), "mo_kongyuqichufengwendu", 99, 4, "空预器出风温度", "℃"));
        map.put("mo_zhufengjipinlüfankui", ByteField.Init(new MockField(), "mo_zhufengjipinlüfankui", 103, 4, "主风机频率反馈", "Hz"));
        map.put("mo_xunhuanfengjipinlüfankui", ByteField.Init(new MockField(), "mo_xunhuanfengjipinlüfankui", 107, 4, "循环风机频率反馈", "Hz"));
        map.put("mo_addshuibengpinlüfankui", ByteField.Init(new MockField(), "mo_addshuibengpinlüfankui", 111, 4, "补水泵频率反馈", "Hz"));
        map.put("mo_shiwaiwendu", ByteField.Init(new MockField(), "mo_shiwaiwendu", 115, 4, "室外温度", "℃"));
        map.put("mo_xunhuanbeng1pinlüfankui", ByteField.Init(new MockField(), "mo_xunhuanbeng1pinlüfankui", 119, 4, "循环泵1频率反馈", "Hz"));
        map.put("mo_xunhuanbeng2pinlüfankui", ByteField.Init(new MockField(), "mo_xunhuanbeng2pinlüfankui", 123, 4, "循环泵2频率反馈", "Hz"));

        map.put("se_qiluwendusheding", ByteField.Init(new SettingField(), "se_qiluwendusheding", 248, 4, "启炉温度设定", "℃"));
        map.put("se_mubiaowendusheding", ByteField.Init(new SettingField(), "se_mubiaowendusheding", 252, 4, "目标温度设定", "℃"));
        map.put("se_tingluwendusheding", ByteField.Init(new SettingField(), "se_tingluwendusheding", 256, 4, "停炉温度设定", "℃"));
        map.put("se_yalidisheding", ByteField.Init(new SettingField(), "se_yalidisheding", 260, 4, "压力低设定", "Mpa"));
        map.put("se_yaligaosheding", ByteField.Init(new SettingField(), "se_yaligaosheding", 264, 4, "压力高设定", "Mpa"));
        map.put("se_paiyanwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_paiyanwenduchaogaobaojingsheding", 268, 4, "排烟温度超高报警设定", "℃"));
        map.put("se_chukouwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_chukouwenduchaogaobaojingsheding", 272, 4, "出口温度超高报警设定", "℃"));
        map.put("se_yalichaogaobaojingsheding", ByteField.Init(new SettingField(), "se_yalichaogaobaojingsheding", 276, 4, "压力超高报警设定", "Mpa"));
        map.put("se_yalichaodibaojingsheding", ByteField.Init(new SettingField(), "se_yalichaodibaojingsheding", 280, 4, "压力超低报警设定", "Mpa"));


        map.put("de_ranshaoqiqiting", ByteField.Init(new DeviceField(), "de_ranshaoqiqiting", 368, 2, "燃烧器", PLC_Common_ValueMaps.coms_ranshaoqi_status));
        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 370, 2, "1#补水泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 372, 2, "1#补水泵", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 374, 2, "2#补水泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 376, 2, "2#补水泵", DevicePointMap.coms_start_stop));
        map.put("de_1_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_auto", 378, 2, "1#循环泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_start_stop", 380, 2, "1#循环泵", DevicePointMap.coms_start_stop));
        map.put("de_2_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_auto", 382, 2, "2#循环泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_start_stop", 384, 2, "2#循环泵", DevicePointMap.coms_start_stop));


        map.put("ex_lubichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_lubichaowenbaojing", 448, 2, "炉壁超温报警", 0));
        map.put("ex_chushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiguzhang", 448, 2, "出水温度传感器故障", 1));
        map.put("ex_huishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiwenduchuanganqiguzhang", 448, 2, "回水温度传感器故障", 2));
        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 448, 2, "排烟温度传感器故障", 3));
        map.put("ex_wendushedingcuowubaojing", ByteField.Init(new ExceptionField(), "ex_wendushedingcuowubaojing", 448, 2, "温度设定错误报警", 4));
        map.put("ex_xunhuanbengliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengliansuoduankaibaojing", 448, 2, "循环泵连锁断开报警", 5));
        map.put("ex_waibuliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuoduankaibaojing", 448, 2, "外部连锁断开报警", 6));
        map.put("ex_chushuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiyalibiansongqiguzhang", 448, 2, "出水压力变送器故障", 7));

        map.put("ex_ranshaojiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaojiguzhang", 448, 2, "燃烧器故障", 8));
        map.put("ex_ranqixielou", ByteField.Init(new ExceptionField(), "ex_ranqixielou", 448, 2, "燃气泄漏", 9));
        map.put("ex_ranqiyaliyichang", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichang", 448, 2, "燃气压力异常", 10));
        map.put("ex_yalichaogaobaojing", ByteField.Init(new ExceptionField(), "ex_yalichaogaobaojing", 448, 2, "压力超高报警", 11));
        map.put("ex_yalichaodibaojing", ByteField.Init(new ExceptionField(), "ex_yalichaodibaojing", 448, 2, "压力超低报警", 12));
        map.put("ex_paiyanwenduchaogaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchaogaobaojing", 448, 2, "排烟温度超高报警", 13));
        map.put("ex_chushuiwenduchaogaobaojing", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchaogaobaojing", 448, 2, "出水温度超高报警", 14));
        map.put("ex_queshuibaohubaojing", ByteField.Init(new ExceptionField(), "ex_queshuibaohubaojing", 448, 2, "缺水保护报警", 15));

        map.put("ex_huishuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiyalibiansongqiguzhang", 450, 2, "回水压力变送器故障", 8));


    }
}
