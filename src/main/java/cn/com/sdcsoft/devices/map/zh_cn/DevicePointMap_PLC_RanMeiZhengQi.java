package cn.com.sdcsoft.devices.map.zh_cn;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.PLC.*;

/**
 * @author doudou
 * 初始化数据
 */
public class DevicePointMap_PLC_RanMeiZhengQi extends DevicePointMap {

    public static final String Key = "PLC_RanMeiZhengQi";

    public DevicePointMap_PLC_RanMeiZhengQi()
    {
        /**
         * 计算属性（不显示）
         */
        map.put("_addshuibeng", ByteField.Init(new DeviceField(), "_addshuibeng", 0, 0, "给水泵", false));
        map.put("_chuanyangbeng", ByteField.Init(new DeviceField(), "_chuanyangbeng", 0, 0, "除氧泵", false));
        map.put("_gufengfan", ByteField.Init(new DeviceField(), "_gufengfan", 0, 0, "鼓风", false));
        map.put("_yinfengfan", ByteField.Init(new DeviceField(), "_yinfengfan", 0, 0, "引风", false));
        map.put("_lupaifan", ByteField.Init(new DeviceField(), "_lupaifan", 0, 0, "炉排", false));
        map.put("_chuzhafan", ByteField.Init(new DeviceField(), "_chuzhafan", 0, 0, "出渣", false));


        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "运行小时数", "时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "系统状态",PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new PowerField(), SdcSoftDevice.KEY_POINT_POWER, 2, 0, "燃料",DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 1, 0, "介质",DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "水位状态",DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "燃烧器状态",PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 35, 4, "蒸汽压力", "MPa"));
        map.put("mo_guoluyewei", ByteField.Init(new MockField(), "mo_guoluyewei", 39, 4, "锅炉液位", "mm"));
        map.put("mo_zhengqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhengqishunshiliuliang", 43, 4, "蒸汽瞬时流量", "T/h"));
        map.put("mo_bushuishunshiliuliang", ByteField.Init(new MockField(), "mo_bushuishunshiliuliang", 47, 4, "补水瞬时流量", "m³/h"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 51, 4, "炉膛温度", "℃"));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 55, 4, "炉膛压力", "Pa"));
        map.put("mo_shengmeiqijinkouyanwen", ByteField.Init(new MockField(), "mo_shengmeiqijinkouyanwen", 59, 4, "省煤器进口烟温", "℃"));
        map.put("mo_zuizhongpaiyanwendu", ByteField.Init(new MockField(), "mo_zuizhongpaiyanwendu", 63, 4, "最终排烟温度", "℃"));
        map.put("mo_zhengqileijiliuliang", ByteField.Init(new MockField(), "mo_zhengqileijiliuliang", 67, 4, "蒸汽累计流量", "T"));
        map.put("mo_bushuileijiliuliang", ByteField.Init(new MockField(), "mo_bushuileijiliuliang", 71, 4, "补水累计流量", "m³"));
        map.put("mo_shengmeiqijinshuiwendu", ByteField.Init(new MockField(), "mo_shengmeiqijinshuiwendu", 75, 4, "省煤器进水温度", "℃"));
        map.put("mo_shengmeiqichushuiwendu", ByteField.Init(new MockField(), "mo_shengmeiqichushuiwendu", 79, 4, "省煤器出水温度", "℃"));
        map.put("mo_bushuiwendu", ByteField.Init(new MockField(), "mo_bushuiwendu", 83, 4, "补水温度", "℃"));
        map.put("mo_paiyanyali", ByteField.Init(new MockField(), "mo_paiyanyali", 87, 4, "排烟压力", "Pa"));
        map.put("mo_addshuibengpinlvfankui", ByteField.Init(new MockField(), "mo_addshuibengpinlvfankui", 91, 4, "给水泵频率反馈", "Hz"));
        map.put("mo_yinfengjipinlvfankui", ByteField.Init(new MockField(), "mo_yinfengjipinlvfankui", 95, 4, "引风机频率反馈", "Hz"));
        map.put("mo_gufengjipinlvfankui", ByteField.Init(new MockField(), "mo_gufengjipinlvfankui", 99, 4, "鼓风机频率反馈", "Hz"));
        map.put("mo_ruanshuixiangyewei", ByteField.Init(new MockField(), "mo_ruanshuixiangyewei", 103, 4, "软水箱液位", "%"));
        map.put("mo_guorezhengqiyali", ByteField.Init(new MockField(), "mo_guorezhengqiyali", 107, 4, "过热蒸汽压力", "MPa"));
        map.put("mo_chuyangqiyewei", ByteField.Init(new MockField(), "mo_chuyangqiyewei", 111, 4, "除氧器液位", "%"));
        map.put("mo_guoreqichukouyanwen", ByteField.Init(new MockField(), "mo_guoreqichukouyanwen", 115, 4, "过热器出口烟温", "℃"));
        map.put("mo_guoreqizhengqiwendu", ByteField.Init(new MockField(), "mo_guoreqizhengqiwendu", 119, 4, "过热器蒸汽温度", "℃"));
        map.put("mo_baohezhengqiwendu", ByteField.Init(new MockField(), "mo_baohezhengqiwendu", 123, 4, "饱和蒸汽温度", "℃"));
        map.put("mo_yureqijinyanwendu", ByteField.Init(new MockField(), "mo_yureqijinyanwendu", 127, 4, "预热器进烟温度", "℃"));
        map.put("mo_yureqijinyanyali", ByteField.Init(new MockField(), "mo_yureqijinyanyali", 131, 4, "预热器进烟压力", "Pa"));
        map.put("mo_chuyangqiwendu", ByteField.Init(new MockField(), "mo_chuyangqiwendu", 135, 4, "除氧器温度", "℃"));
        map.put("mo_chuyangqiyali", ByteField.Init(new MockField(), "mo_chuyangqiyali", 139, 4, "除氧器压力", "KPa"));
        map.put("mo_chuyangbengpinlvfankui", ByteField.Init(new MockField(), "mo_chuyangbengpinlvfankui", 143, 4, "除氧泵频率反馈", "Hz"));
        map.put("mo_bushuidiandongfafankui", ByteField.Init(new MockField(), "mo_bushuidiandongfafankui", 147, 4, "补水电动阀反馈", "%"));
        map.put("mo_jianwenshuidiandongfafankui", ByteField.Init(new MockField(), "mo_jianwenshuidiandongfafankui", 151, 4, "减温水电动阀反馈", "%"));
        map.put("mo_chuyangjiarediandongfafankui", ByteField.Init(new MockField(), "mo_chuyangjiarediandongfafankui", 155, 4, "除氧加热电动阀反馈", "%"));
        map.put("mo_zhaoqiyali", ByteField.Init(new MockField(), "mo_zhaoqiyali", 159, 4, "沼气压力", "kPa"));
        map.put("mo_lutangchukouyanwen", ByteField.Init(new MockField(), "mo_lutangchukouyanwen", 163, 4, "炉膛出口烟温", "℃"));
        map.put("mo_kongyuqichukouyanwen", ByteField.Init(new MockField(), "mo_kongyuqichukouyanwen", 167, 4, "空预器出口烟温", "℃"));
        map.put("mo_shengmeiqichukouyanwen", ByteField.Init(new MockField(), "mo_shengmeiqichukouyanwen", 171, 4, "省煤器出口烟温", "℃"));



        map.put("se_qiluyalisheding", ByteField.Init(new SettingField(), "se_qiluyalisheding", 248, 4, "启炉压力设定", "MPa"));
        map.put("se_mubiaoyalisheding", ByteField.Init(new SettingField(), "se_mubiaoyalisheding", 252, 4, "目标压力设定", "MPa"));
        map.put("se_tingluyalisheding", ByteField.Init(new SettingField(), "se_tingluyalisheding", 256, 4, "停炉压力设定", "MPa"));
        map.put("se_chaoyabaojingyalisheding", ByteField.Init(new SettingField(), "se_chaoyabaojingyalisheding", 260, 4, "超压报警压力设定", "MPa"));
        map.put("se_paiyanchaowenbaojing", ByteField.Init(new SettingField(), "se_paiyanchaowenbaojing", 264, 4, "排烟超温报警", "℃"));
        map.put("se_guolushuiweimubiaosheding", ByteField.Init(new SettingField(), "se_guolushuiweimubiaosheding", 268, 4, "锅炉水位目标设定", "mm"));
        map.put("se_guolushuiweijigaobaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijigaobaojingsheding", 272, 4, "锅炉水位极高报警设定", "mm"));
        map.put("se_guolutingbengshuiweisheding", ByteField.Init(new SettingField(), "se_guolutingbengshuiweisheding", 276, 4, "锅炉停泵水位设定", "mm"));
        map.put("se_guoluqibengshuiweisheding", ByteField.Init(new SettingField(), "se_guoluqibengshuiweisheding", 280, 4, "锅炉启泵水位设定", "mm"));
        map.put("se_guolushuiweijidibaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijidibaojingsheding", 284, 4, "锅炉水位极低报警设定", "mm"));
        map.put("se_guolushuiweishoudonggeisu", ByteField.Init(new SettingField(), "se_guolushuiweishoudonggeisu", 288, 4, "锅炉水位手动给速", "%"));

        map.put("de_yinfeng_auto", ByteField.Init(new DeviceField(), "de_yinfeng_auto", 368, 2, "引风",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_yinfengji_start_stop", ByteField.Init(new DeviceField(), "de_1_yinfengji_start_stop", 370, 2, "引风", DevicePointMap.coms_start_stop));
        map.put("de_gufeng_auto", ByteField.Init(new DeviceField(), "de_gufeng_auto", 372, 2, "鼓风",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_gufengji_start_stop", ByteField.Init(new DeviceField(), "de_1_gufengji_start_stop", 374, 2, "鼓风", DevicePointMap.coms_start_stop));
        map.put("de_lupai_auto", ByteField.Init(new DeviceField(), "de_lupai_auto", 376, 2, "炉排",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_lupai_start_stop", ByteField.Init(new DeviceField(), "de_lupai_start_stop", 378, 2, "炉排", DevicePointMap.coms_start_stop));
        map.put("de_chuzha_auto", ByteField.Init(new DeviceField(), "de_chuzha_auto", 380, 2, "除渣",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_chuzha_start_stop", ByteField.Init(new DeviceField(), "de_chuzha_start_stop", 382, 2, "除渣", DevicePointMap.coms_start_stop));
        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 384, 2, "1#给水泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 386, 2, "1#给水泵", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 388, 2, "2#给水泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 390, 2, "2#给水泵", DevicePointMap.coms_start_stop));
        map.put("de_1_chuyangbeng_auto", ByteField.Init(new DeviceField(), "de_1_chuyangbeng_auto", 392, 2, "1#除氧泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_chuyangbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_chuyangbeng_start_stop", 394, 2, "1#除氧泵", DevicePointMap.coms_start_stop));
        map.put("de_2_chuyangbeng_auto", ByteField.Init(new DeviceField(), "de_2_chuyangbeng_auto", 396, 2, "2#除氧泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_chuyangbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_chuyangbeng_start_stop", 398, 2, "2#除氧泵", DevicePointMap.coms_start_stop));

        map.put("ex_shuiweijidibaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_shedingzhi", 448, 2, "水位极低报警（设定值）", 0));
        map.put("ex_shuiweijigaobaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_shedingzhi", 448, 2, "水位极高报警（设定值）", 1));
        map.put("ex_chaoyabaojing_yalikaiguan", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_yalikaiguan", 448, 2, "超压报警（压力开关）", 2));
        map.put("ex_chaoyabaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_shedingzhi", 448, 2, "超压报警（设定值）", 3));
        map.put("ex_paiyanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanchaowenbaojing", 448, 2, "排烟超温报警", 4));
        map.put("ex_ruanshuixiangqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_ruanshuixiangqueshuibaojing", 448, 2, "软水箱缺水报警", 5));
        map.put("ex_shuidianjiluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuidianjiluojicuobaojing", 448, 2, "水电极逻辑错报警", 6));
        map.put("ex_yalibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiguzhangbaojing", 448, 2, "压力变送器故障报警", 7));

        map.put("ex_yinfengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengjibianpinqiguzhang", 448, 2, "引风机变频器故障", 8));
        map.put("ex_gufengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengjibianpinqiguzhang", 448, 2, "鼓风机变频器故障", 9));
        map.put("ex_lupaibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_lupaibianpinqiguzhang", 448, 2, "炉排变频器故障", 10));
        map.put("ex_chuzhabianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuzhabianpinqiguzhang", 448, 2, "除渣变频器故障", 11));
        map.put("ex_jishuibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuibianpinqiguzhang", 448, 2, "给水变频器故障", 12));
        map.put("ex_shuiweiweidibaojing", ByteField.Init(new ExceptionField(), "ex_shuiweiweidibaojing", 448, 2, "水位危低报警（电极）", 13));
        map.put("ex_shuiweijidibaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_dianji", 448, 2, "水位极低报警（电极）", 14));
        map.put("ex_shuiweijigaobaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_dianji", 448, 2, "水位极高报警（电极）", 15));


        map.put("ex_shuiweibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_shuiweibiansongqiguzhangbaojing", 450, 2, "水位变送器故障报警", 8));
        map.put("ex_paiyanwenduchuanganqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhangbaojing", 450, 2, "排烟温度传感器故障报警", 9));
        map.put("ex_chuyangqiqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqiqueshuibaojing", 450, 2, "除氧器缺水报警", 10));
        map.put("ex_chuyangqigaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqigaoshuiweibaojing", 450, 2, "除氧器高水位报警", 11));

    }
}
