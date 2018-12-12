package cn.com.sdcsoft.devices.map.zh_cn.PLC;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.PLC.*;
import cn.com.sdcsoft.devices.meta.PLC.yure.SystemStatusField;

/**
 * @author doudou
 * 初始化数据
 */
public class YuReZhengQi extends Map {
    public static final String Key = "PLC_YuReZhengQi";

    public YuReZhengQi() {
        /**
         * 计算属性（不显示）
         */
        map.put("_addshuibeng", ByteField.Init(new DeviceField(), "_addshuibeng", 0, 0, "给水泵", false));
        map.put("_chuanyangbeng", ByteField.Init(new DeviceField(), "_chuanyangbeng", 0, 0, "除氧泵", false));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 35, 4, "蒸汽压力", "MPa"));
        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 39, 4, "蒸汽温度", "℃"));
        map.put("mo_guoluyewei", ByteField.Init(new MockField(), "mo_guolushuiwei", 43, 4, "锅炉水位", "mm"));
        map.put("mo_zhengqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhengqishunshiliuliang", 47, 4, "蒸汽瞬时流量", "T/H"));
        map.put("mo_bushuishunshiliuliang", ByteField.Init(new MockField(), "mo_bushuishunshiliuliang", 51, 4, "补水瞬时流量", "m³/h"));
        map.put("mo_zhengqileijiliuliang", ByteField.Init(new MockField(), "mo_zhengqileijiliuliang", 55, 4, "蒸汽累计流量", "T"));
        map.put("mo_bushuileijiliuliang", ByteField.Init(new MockField(), "mo_bushuileijiliuliang", 59, 4, "补水累计流量", "m³"));
        map.put("mo_jinyanwendu", ByteField.Init(new MockField(), "mo_jinyanwendu", 63, 4, "进烟温度", "℃"));
        map.put("mo_jinyanyali", ByteField.Init(new MockField(), "mo_jinyanyali", 67, 4, "进烟压力", "Kpa"));
        map.put("mo_chuyanwendu", ByteField.Init(new MockField(), "mo_chuyanwendu", 71, 4, "出烟温度", "℃"));
        map.put("mo_chuyanyali", ByteField.Init(new MockField(), "mo_chuyanyali", 75, 4, "出烟压力", "Kpa"));
        map.put("mo_bushuiwendu", ByteField.Init(new MockField(), "mo_bushuiwendu", 79, 4, "补水温度", "℃"));
        map.put("mo_bushuiyali", ByteField.Init(new MockField(), "mo_bushuiyali", 83, 4, "补水压力", "Mpa"));
        map.put("mo_bushuibengpinlvfankui", ByteField.Init(new MockField(), "mo_bushuibengpinlvfankui", 87, 4, "补水泵频率反馈", "Hz"));
        map.put("mo_chushuibengpinlvfankui", ByteField.Init(new MockField(), "mo_chushuibengpinlvfankui", 91, 4, "除水泵频率反馈", "Hz"));
        map.put("mo_ruanshuixiangyewei", ByteField.Init(new MockField(), "mo_ruanshuixiangyewei", 95, 4, "软水箱液位", "cm"));
        map.put("mo_chuyangqiyewei", ByteField.Init(new MockField(), "mo_chuyangqiyewei", 99, 4, "除氧器液位", "cm"));
        map.put("mo_chuyangqiwendu", ByteField.Init(new MockField(), "mo_chuyangqiwendu", 103, 4, "除氧器温度", "℃"));
        map.put("mo_chuyangqiyali", ByteField.Init(new MockField(), "mo_chuyangqiyali", 107, 4, "除氧器压力", "KPa"));
        map.put("mo_bushuidiandongfafankui", ByteField.Init(new MockField(), "mo_bushuidiandongfafankui", 111, 4, "补水电动阀反馈", "%"));
        map.put("mo_chuyangbushuidiandongfafankui", ByteField.Init(new MockField(), "mo_chuyangbushuidiandongfafankui", 115, 4, "除氧补水电动阀反馈", "%"));
        map.put("mo_chuyangzhengqidiandongfafankui", ByteField.Init(new MockField(), "mo_chuyangzhengqidiandongfafankui", 119, 4, "除氧蒸汽电动阀反馈", "%"));
        map.put("mo_jinyandiandongfafankui", ByteField.Init(new MockField(), "mo_jinyandiandongfafankui", 123, 4, "进烟电动阀反馈", "%"));
        map.put("mo_chuyandiandongfafankui", ByteField.Init(new MockField(), "mo_chuyandiandongfafankui", 127, 4, "出烟电动阀反馈", "%"));
        map.put("mo_guoluzhuzhengqitiaojiefafankui", ByteField.Init(new MockField(), "mo_guoluzhuzhengqitiaojiefafankui", 131, 4, "锅炉主蒸汽调节阀反馈", "%"));
        map.put("mo_shigufangshuidiandongfafankui", ByteField.Init(new MockField(), "mo_shigufangshuidiandongfafankui", 135, 4, "事故放水电动阀反馈", "%"));
        map.put("mo_jinjipaiqidiandongfafankui", ByteField.Init(new MockField(), "mo_jinjipaiqidiandongfafankui", 139, 4, "紧急排气电动阀反馈", "%"));
        map.put("mo_panyanwenduxianshi", ByteField.Init(new MockField(), "mo_panyanwenduxianshi", 143, 4, "排烟温度显示", "℃"));

        map.put("se_chaoyabaojingyalisheding", ByteField.Init(new SettingField(), "se_chaoyabaojingyalisheding", 248, 4, "超压报警压力设定", "MPa"));
        map.put("se_guolushuiweimubiaosheding", ByteField.Init(new SettingField(), "se_guolushuiweimubiaosheding", 252, 4, "锅炉水位目标设定", "mm"));
        map.put("se_guolushuiweijigaobaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijigaobaojingsheding", 256, 4, "锅炉水位极高报警设定", "mm"));
        map.put("se_guolushuiweigaosheding", ByteField.Init(new SettingField(), "se_guolushuiweigaosheding", 260, 4, "锅炉水位高设定", "mm"));
        map.put("se_guolushuiweidisheding", ByteField.Init(new SettingField(), "se_guolushuiweidisheding", 264, 4, "锅炉水位低设定", "mm"));
        map.put("se_guolushuiweijidibaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijidibaojingsheding", 268, 4, "锅炉水位极低报警设定", "mm"));
        map.put("se_jishuibengshoudongpinlvsheding", ByteField.Init(new SettingField(), "se_jishuibengshoudongpinlvsheding", 272, 4, "给水泵手动频率设定", "Hz"));
        map.put("se_chuyangqibushuimubiaosheding", ByteField.Init(new SettingField(), "se_chuyangqibushuimubiaosheding", 276, 4, "除氧器补水目标设定", "mm"));
        map.put("se_chuyangqishuiweijigaobaojingsheding", ByteField.Init(new SettingField(), "se_chuyangqishuiweijigaobaojingsheding", 280, 4, "除氧器水位极高报警设定", "CM"));
        map.put("se_chuyangqitingbengyeweisheding", ByteField.Init(new SettingField(), "se_chuyangqitingbengyeweisheding", 284, 4, "除氧器停泵液位设定", "CM"));
        map.put("se_chuyangqiqibengyeweisheding", ByteField.Init(new SettingField(), "se_chuyangqiqibengyeweisheding", 288, 4, "除氧器启泵液位设定", "CM"));
        map.put("se_chuyangqijidibaojingsheding", ByteField.Init(new SettingField(), "se_chuyangqijidibaojingsheding", 292, 4, "除氧器极低报警设定", "CM"));
        map.put("se_guolushuiweishoudonggeisu", ByteField.Init(new SettingField(), "se_chuyangqibushuishoudonggeisu", 296, 4, "除氧器补水手动给定", "%"));
        map.put("se_jinyandiandongfageiding", ByteField.Init(new SettingField(), "se_jinyandiandongfageiding", 300, 4, "进烟电动阀给定", "%"));
        map.put("se_chuyandiandongfageiding", ByteField.Init(new SettingField(), "se_chuyandiandongfageiding", 304, 4, "出烟电动阀给定", "%"));
        map.put("se_chuyangqizhengqishoudongjiding", ByteField.Init(new SettingField(), "se_chuyangqizhengqishoudongjiding", 308, 4, "除氧器蒸汽手动给定", "%"));
        map.put("se_chuyangqiwendumubiaojiding", ByteField.Init(new SettingField(), "se_chuyangqiwendumubiaojiding", 312, 4, "除氧器温度目标给定", "℃"));
        map.put("se_ruanshuixiangqueshuibaojingsheding", ByteField.Init(new SettingField(), "se_ruanshuixiangqueshuibaojingsheding", 316, 4, "软水箱缺水报警设定", "%"));
        map.put("se_paiyanchaowenbaojingsheding", ByteField.Init(new SettingField(), "se_paiyanchaowenbaojingsheding", 320, 4, "排烟超温报警设定", "℃"));

        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 368, 2, "1#给水泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 370, 2, "1#给水泵", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 372, 2, "2#给水泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 374, 2, "2#给水泵", DevicePointMap.coms_start_stop));
        map.put("de_1_chuyangbeng_auto", ByteField.Init(new DeviceField(), "de_1_chuyangbeng_auto", 376, 2, "1#除氧泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_chuyangbeng_start_stop", ByteField.Init(new DeviceField(), "de_1_chuyangbeng_start_stop", 378, 2, "1#除氧泵", DevicePointMap.coms_start_stop));
        map.put("de_2_chuyangbeng_auto", ByteField.Init(new DeviceField(), "de_2_chuyangbeng_auto", 380, 2, "2#除氧泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_chuyangbeng_start_stop", ByteField.Init(new DeviceField(), "de_2_chuyangbeng_start_stop", 382, 2, "2#除氧泵", DevicePointMap.coms_start_stop));
        map.put("de_baojingshuchuzhishi", ByteField.Init(new DeviceField(), "de_baojingshuchuzhishi", 384, 2, "报警输出指示", DevicePointMap.coms_open_close));

        map.put("ex_shuiweiweidibaojingdianji", ByteField.Init(new ExceptionField(), "ex_shuiweiweidibaojingdianji", 448, 2, "水位危低报警（电极）", 8));
        map.put("ex_shuiweijidibaojingdianji", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojingdianji", 448, 2, "水位极低报警（电极）", 9));
        map.put("ex_shuiweijigaobaojingdianji", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojingdianji", 448, 2, "水位极高报警（电极）", 10));
        map.put("ex_shuiweijidibaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojingshedingzhi", 448, 2, "水位极低报警（设定值）", 11));
        map.put("ex_shuiweijigaobaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojingshedingzhi", 448, 2, "水位极高报警（设定值）", 12));

        map.put("ex_chaoyabaojingyalikaiguan", ByteField.Init(new ExceptionField(), "ex_chaoyabaojingyalikaiguan", 448, 2, "超压报警（压力开关）", 13));
        map.put("ex_chaoyabaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojingshedingzhi", 448, 2, "超压报警（设定值）", 14));
        map.put("ex_paiyanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanchaowenbaojing", 448, 2, "排烟超温报警", 15));
        map.put("ex_ruanshuixiangqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_ruanshuixiangqueshuibaojing", 448, 2, "软水箱缺水报警", 0));
        map.put("ex_shuidianjiluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuidianjiluojicuobaojing", 448, 2, "水电极逻辑错报警", 1));
        map.put("ex_yalibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiguzhangbaojing", 448, 2, "压力变送器故障报警", 2));
        map.put("ex_shuiweibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_shuiweibiansongqiguzhangbaojing", 448, 2, "水位变送器故障报警", 3));
        map.put("ex_paiyanwenduchuanganqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhangbaojing", 448, 2, "排烟温度传感器故障报警", 4));
        map.put("ex_chuyangqiqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqiqueshuibaojing", 448, 2, "除氧器缺水报警", 5));
        map.put("ex_chuyangqigaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqigaoshuiweibaojing", 448, 2, "除氧器高水位报警", 6));
        map.put("ex_addshuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_addshuibengbianpinqiguzhang", 448, 2, "给水泵变频器故障", 7));
        map.put("ex_chuyangbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuyangbengbianpinqiguzhang", 448, 2, "除氧泵变频器故障", 8));

        map.put("ex_bushuibeng1guzhang", ByteField.Init(new ExceptionField(), "ex_bushuibeng1guzhang", 450, 2, "补水泵1故障", 8));
        map.put("ex_bushuibeng2guzhang", ByteField.Init(new ExceptionField(), "ex_bushuibeng2guzhang", 450, 2, "补水泵2故障", 9));
        map.put("ex_chuyangbeng1guzhang", ByteField.Init(new ExceptionField(), "ex_chuyangbeng1guzhang", 450, 2, "除氧泵1故障", 10));
        map.put("ex_chuyangbeng2guzhang", ByteField.Init(new ExceptionField(), "ex_chuyangbeng2guzhang", 450, 2, "除氧泵2故障", 11));
    }
}
