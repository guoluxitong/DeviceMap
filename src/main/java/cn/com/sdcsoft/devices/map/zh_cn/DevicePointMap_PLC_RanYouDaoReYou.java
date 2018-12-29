package cn.com.sdcsoft.devices.map.zh_cn;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.FixedValueField;
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
        map.put("_zhuyoubeng", ByteField.Init(new CountField(), "_zhuyoubeng",  "注油泵"));
        map.put("_xunhuanbeng", ByteField.Init(new CountField(), "_xunhuanbeng",  "循环泵"));



        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "运行小时数"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "运行天数"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "系统状态", PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER,"燃料", 0,DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "介质", 2,DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "水位状态", DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "燃烧器状态", PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_jinkouwendu", ByteField.Init(new MockField(), "mo_jinkouwendu", 35, 4, "进口温度", "℃"));
        map.put("mo_chukouwendu", ByteField.Init(new MockField(), "mo_chukouwendu", 39, 4, "出口温度", "℃"));
        map.put("mo_gaoweiyoucaowendu", ByteField.Init(new MockField(), "mo_gaoweiyoucaowendu", 43, 4, "高位油槽温度", "℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 47, 4, "排烟温度", "℃"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 51, 4, "炉膛温度", "℃"));
        map.put("mo_lutangchukouwendu", ByteField.Init(new MockField(), "mo_lutangchukouwendu", 55, 4, "炉膛出口温度", "℃"));
        map.put("mo_kongyuqianwendu", ByteField.Init(new MockField(), "mo_kongyuqianwendu", 59, 4, "空预前温度", "℃"));
        map.put("mo_kongyuhouwendu", ByteField.Init(new MockField(), "mo_kongyuhouwendu", 63, 4, "空预后温度", "℃"));
        map.put("mo_jinkouyali", ByteField.Init(new MockField(), "mo_jinkouyali", 67, 4, "进口压力", "MPa"));
        map.put("mo_chukouyali", ByteField.Init(new MockField(), "mo_chukouyali", 71, 4, "出口压力", "MPa"));
        map.put("mo_danqiyali", ByteField.Init(new MockField(), "mo_danqiyali", 75, 4, "氮气压力", "kPa"));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 79, 4, "炉膛压力", "kPa"));
        map.put("mo_gaoweiyoucaowei", ByteField.Init(new MockField(), "mo_gaoweiyoucaowei", 83, 4, "高位槽油位", "%"));
        map.put("mo_chuyouguanyouwei", ByteField.Init(new MockField(), "mo_chuyouguanyouwei", 87, 4, "储油罐油位", "%"));
        map.put("mo_liuliangceliang", ByteField.Init(new MockField(), "mo_liuliangceliang", 91, 4, "流量测量", "m³/h"));
        map.put("mo_diandongtiaojiefashuchu", ByteField.Init(new MockField(), "mo_diandongtiaojiefashuchu", 95, 4, "电动调节阀输出", "%"));
        map.put("mo_bianpinqipinlvshuchu", ByteField.Init(new MockField(), "mo_bianpinqipinlvshuchu", 99, 4, "变频器频率输出", "Hz"));

        map.put("se_chukouwenduqiluwendusheding", ByteField.Init(new SettingField(), "se_chukouwenduqiluwendusheding", 111, 4, "出口温度起炉温度设定", "℃"));
        map.put("se_chukouwendubitiaowendusheding", ByteField.Init(new SettingField(), "se_chukouwendubitiaowendusheding", 115, 4, "出口温度比调温度设定", "℃"));
        map.put("se_chukouwendutingluwendusheding", ByteField.Init(new SettingField(), "se_chukouwendutingluwendusheding", 119, 4, "出口温度停炉温度设定", "℃"));
        map.put("se_chukouwenduchaogaobaojingwendusheding", ByteField.Init(new SettingField(), "se_chukouwenduchaogaobaojingwendusheding", 123, 4, "出口温度超高报警温度设定", "℃"));
        map.put("se_paiyanwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_paiyanwenduchaogaobaojingsheding", 127, 4, "排烟温度超高报警设定", "℃"));
        map.put("se_gaoweicaoyouweidisheding", ByteField.Init(new SettingField(), "se_gaoweicaoyouweidisheding", 131, 4, "高位槽油位低设定", "%"));
        map.put("se_gaoweicaoyouweigaosheding", ByteField.Init(new SettingField(), "se_gaoweicaoyouweigaosheding", 135, 4, "高位槽油位高设定", "%"));
        map.put("se_anquanyouwensheding", ByteField.Init(new SettingField(), "se_anquanyouwensheding", 139, 4, "安全油温设定", "℃"));
        map.put("se_fengjiqidongshijiansheding", ByteField.Init(new SettingField(), "se_fengjiqidongshijiansheding", 143, 4, "风机启动时间设定", "S"));
        map.put("se_fengjiqidongpinlvsheding", ByteField.Init(new SettingField(), "se_fengjiqidongpinlvsheding", 147, 4, "风机启动频率设定", "Hz"));
        map.put("se_fengjiyunxingpinlvsheding", ByteField.Init(new SettingField(), "se_fengjiyunxingpinlvsheding", 151, 4, "风机运行频率设定", "Hz"));
        map.put("se_jinchukouyachagaobaojingsheding", ByteField.Init(new SettingField(), "se_jinchukouyachagaobaojingsheding", 155, 4, "进出口压差高报警设定", "MPa"));
        map.put("se_jinchukouyachadibaojingsheding", ByteField.Init(new SettingField(), "se_jinchukouyachadibaojingsheding", 159, 4, "进出口压差低报警设定", "MPa"));
        map.put("se_liuliangxiaxianbaojing", ByteField.Init(new SettingField(), "se_liuliangxiaxianbaojing", 163, 4, "流量下限报警", "m³/h"));
        map.put("se_liuliangjidibaojing", ByteField.Init(new SettingField(), "se_liuliangjidibaojing", 167, 4, "流量极低报警", "m³/h"));
        map.put("se_danqiyalidisheding", ByteField.Init(new SettingField(), "se_danqiyalidisheding", 171, 4, "氮气压力低设定", "kPa"));
        map.put("se_danqiyaligaosheding", ByteField.Init(new SettingField(), "se_danqiyaligaosheding", 175, 4, "氮气压力高设定", "kPa"));
        map.put("se_diandongfashoudongkaidusheding", ByteField.Init(new SettingField(), "se_diandongfashoudongkaidusheding", 179, 4, "电动阀手动开度设定", "%"));

        map.put("de_1_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_auto", 203, 2, "1#循环泵", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_start_stop", 205, 2, "1#循环泵", DevicePointMap.coms_start_stop));
        map.put("de_2_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_auto", 207, 2, "2#循环泵", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_start_stop", 209, 2, "2#循环泵", DevicePointMap.coms_start_stop));
        map.put("de_3_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_3_xunhuanbeng_auto", 211, 2, "3#循环泵", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_3_xunhuanbeng_start_stop", ByteField.Init(new DeviceField(), "de_3_xunhuanbeng_start_stop", 213, 2, "3#循环泵", DevicePointMap.coms_start_stop));
        map.put("de_zhuyoubeng_auto", ByteField.Init(new DeviceField(), "de_zhuyoubeng_auto", 215, 2, "注油泵", PLC_Common_ValueMaps.coms_atuo));
        map.put("de_zhuyoubeng_start_stop", ByteField.Init(new DeviceField(), "de_zhuyoubeng_start_stop", 217, 2, "注油泵", DevicePointMap.coms_start_stop));

        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 229, 2, "燃烧器故障", 8));
        map.put("ex_ranqixielou", ByteField.Init(new ExceptionField(), "ex_ranqixielou", 229, 2, "燃气泄漏", 9));
        map.put("ex_ranqiyaliyichang", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichang", 229, 2, "燃气压力异常", 10));
        map.put("ex_fengjiguzhang", ByteField.Init(new ExceptionField(), "ex_fengjiguzhang", 229, 2, "风机故障", 11));
        map.put("ex_1_xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "xunhuanbengguzhang", 229, 2, "1#循环泵故障", 12));
        map.put("ex_2_xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "xunhuanbengguzhang", 229, 2, "2#循环泵故障", 13));
        map.put("ex_3_xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "xunhuanbengguzhang", 229, 2, "3#循环泵故障", 14));
        map.put("ex_zhuyoubengguzhang", ByteField.Init(new ExceptionField(), "ex_zhuyoubengguzhang", 229, 2, "注油泵故障", 15));
        map.put("ex_jinchukouyachachaogao", ByteField.Init(new ExceptionField(), "ex_jinchukouyachachaogao", 229, 2, "进出口压差超高", 0));
        map.put("ex_jinchukouyachachaodi", ByteField.Init(new ExceptionField(), "ex_jinchukouyachachaodi", 229, 2, "进出口压差超低", 1));
        map.put("ex_paiyanwenduchaogao", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchaogao", 229, 2, "排烟温度超高", 2));
        map.put("ex_chukouwenduchaogao", ByteField.Init(new ExceptionField(), "ex_chukouwenduchaogao", 229, 2, "出口温度超高", 3));
        map.put("ex_liuliangxiaxianbaojing", ByteField.Init(new ExceptionField(), "ex_liuliangxiaxianbaojing", 229, 2, "流量下限报警", 4));
        map.put("ex_liuliangjidibaojing", ByteField.Init(new ExceptionField(), "ex_liuliangjidibaojing", 229, 2, "流量极低报警", 5));
        map.put("ex_queyoubaojingfuqiu", ByteField.Init(new ExceptionField(), "ex_queyoubaojingfuqiu", 229, 2, "缺油报警（浮球）", 6));
        map.put("ex_chuyouwenduchuanganqibaojing", ByteField.Init(new ExceptionField(), "ex_chuyouwenduchuanganqibaojing", 229, 2, "出油温度传感器故障", 7));

        map.put("ex_huiyouwenduchuanganqibaojing", ByteField.Init(new ExceptionField(), "ex_huiyouwenduchuanganqibaojing", 231, 2, "回油温度传感器故障", 8));
        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 231, 2, "排烟温度传感器故障", 9));
        map.put("ex_xunhuanbengliansuoguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanbengliansuoguzhang", 231, 2, "循环泵连锁故障", 10));
        map.put("ex_wendushedingcuowuguzhang", ByteField.Init(new ExceptionField(), "ex_wendushedingcuowuguzhang", 231, 2, "温度设定错误故障", 11));
        map.put("ex_gaoweiyoucaoyouweidibaojing", ByteField.Init(new ExceptionField(), "ex_gaoweiyoucaoyouweidibaojing", 231, 2, "高位油槽油位低报警", 12));
        map.put("ex_gaoweiyoucaoyouweigaobaojing", ByteField.Init(new ExceptionField(), "ex_gaoweiyoucaoyouweigaobaojing", 231, 2, "高位油槽油位高报警", 13));
        map.put("ex_1_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_1_zhiguanchaowenbaojing", 231, 2, "1#支管超温报警", 14));
        map.put("ex_2_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_2_zhiguanchaowenbaojing", 231, 2, "2#支管超温报警", 15));
        map.put("ex_3_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_3_zhiguanchaowenbaojing", 231, 2, "3#支管超温报警", 0));
        map.put("ex_4_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_4_zhiguanchaowenbaojing", 231, 2, "4#支管超温报警", 1));
        map.put("ex_5_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_5_zhiguanchaowenbaojing", 231, 2, "5#支管超温报警", 2));
        map.put("ex_6_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_6_zhiguanchaowenbaojing", 231, 2, "6#支管超温报警", 3));
        map.put("ex_7_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_7_zhiguanchaowenbaojing", 231, 2, "7#支管超温报警", 4));
        map.put("ex_8_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_8_zhiguanchaowenbaojing", 231, 2, "8#支管超温报警", 5));
        map.put("ex_9_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_9_zhiguanchaowenbaojing", 231, 2, "9#支管超温报警", 6));
        map.put("ex_10_zhiguanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_10_zhiguanchaowenbaojing", 231, 2, "10#支管超温报警", 7));
        map.put("ex_plcguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_plcguzhangbaojing", 233, 2, "PLC故障报警", 8));
    }
}
