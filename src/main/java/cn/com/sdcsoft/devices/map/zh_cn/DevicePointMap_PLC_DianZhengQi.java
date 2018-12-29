package cn.com.sdcsoft.devices.map.zh_cn;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.FixedValueField;
import cn.com.sdcsoft.devices.meta.PLC.*;

public class DevicePointMap_PLC_DianZhengQi extends DevicePointMap {
    public static final String Key = "PLC_DianZhengQi";

    public DevicePointMap_PLC_DianZhengQi() {

        /**
         * 计算属性（不显示）
         */
        map.put("_addshuibeng", ByteField.Init(new CountField(), "_addshuibeng","给水泵"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "运行小时数", "时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "系统状态",PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "燃料",1,DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA,  "介质",1,DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "水位状态",DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "燃烧器状态",PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 35, 4, "蒸汽压力", "MPa"));
        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 39, 4, "蒸汽温度", "℃"));
        map.put("mo_guolushuiwei", ByteField.Init(new MockField(), "mo_guolushuiwei", 43, 4, "锅炉水位", "mm"));
        map.put("mo_zhengqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhengqishunshiliuliang", 47, 4, "蒸汽瞬时流量", "T/H"));
        map.put("mo_bushuishunshiliuliang", ByteField.Init(new MockField(), "mo_bushuishunshiliuliang", 51, 4, "补水瞬时流量", "T/H"));
        map.put("mo_zhengqileijiliuliang", ByteField.Init(new MockField(), "mo_zhengqileijiliuliang", 55, 4, "蒸汽累计流量", "T"));
        map.put("mo_bushuileijiliuliang", ByteField.Init(new MockField(), "mo_bushuileijiliuliang", 59, 4, "补水累计流量", "T"));
        map.put("mo_jinshuiwendu", ByteField.Init(new MockField(), "mo_jinshuiwendu", 63, 4, "进水温度", "℃"));
        map.put("mo_jinshuiyali", ByteField.Init(new MockField(), "mo_jinshuiyali", 67, 4, "进水压力", "MPa"));
        map.put("mo_addshuibengpinlvfankui", ByteField.Init(new MockField(), "mo_addshuibengpinlvfankui", 71, 4, "给水泵频率反馈", "Hz"));
        map.put("mo_ruanshuixiangyewei", ByteField.Init(new MockField(), "mo_ruanshuixiangyewei", 75, 4, "软水箱液位", "%"));
        map.put("mo_qidongjiarezushu", ByteField.Init(new MockField(), "mo_qidongjiarezushu", 79, 4, "启动加热组数", "组"));
        map.put("mo_qidongjiarezushubaifenbi", ByteField.Init(new MockField(), "mo_qidongjiarezushubaifenbi", 83, 4, "启动加热组数百分比", "%"));

        map.put("se_chaoyabaojingsheding", ByteField.Init(new SettingField(), "se_chaoyabaojingsheding", 127, 4, "超压报警设定", "MPa"));
        map.put("se_shiyongjiarezushusheding", ByteField.Init(new SettingField(), "se_shiyongjiarezushusheding", 131, 4, "使用加热组数设定", "组"));
        map.put("se_touqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_touqiejiangeshijiansheding", 135, 4, "投切间隔时间设定", "S"));
        map.put("se_kuaiqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_kuaiqiejiangeshijiansheding", 139, 4, "快切间隔时间设定", "S"));
        map.put("se_tingluyalisheding", ByteField.Init(new SettingField(), "se_tingluyalisheding", 143, 4, "停炉压力设定", "MPa"));
        map.put("se_shiyongyalisheding", ByteField.Init(new SettingField(), "se_shiyongyalisheding", 147, 4, "使用压力设定", "MPa"));
        map.put("se_qiluyalisheding", ByteField.Init(new SettingField(), "se_qiluyalisheding", 151, 4, "启炉压力设定", "MPa"));
        map.put("se_guolushuiweijidibaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijidibaojingsheding", 155, 4, "锅炉水位极低报警设定", "mm"));
        map.put("se_geishuibengshoudongpinlvsheding", ByteField.Init(new SettingField(), "se_geishuibengshoudongpinlvsheding", 159, 4, "给水泵手动频率设定", "Hz"));
        map.put("se_bushuimubiaosheding", ByteField.Init(new SettingField(), "se_bushuimubiaosheding", 163, 4, "补水目标设定", "mm"));
        map.put("se_guolushuiweijigaobaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijigaobaojingsheding", 167, 4, "锅炉水位极高报警设定", "mm"));
        map.put("se_qibengyeweisheding", ByteField.Init(new SettingField(), "se_qibengyeweisheding", 171, 4, "启泵液位设定", "mm"));
        map.put("se_tingbengyeweisheding", ByteField.Init(new SettingField(), "se_tingbengyeweisheding", 175, 4, "停泵液位设定", "mm"));


        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 199, 2, "1#给水泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 201, 2, "1#给水泵", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 203, 2, "2#给水泵",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 205, 2, "2#给水泵", DevicePointMap.coms_start_stop));
        map.put("de_baojingshuchuzhishi", ByteField.Init(new DeviceField(), "de_baojingshuchuzhishi", 207, 2, "报警输出指示", coms_open_close));


        map.put("ex_shuidianjiluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuidianjiluojicuobaojing", 233, 2, "水电极逻辑错报警", 0));
        map.put("ex_yalibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiguzhangbaojing", 233, 2, "压力变送器故障报警", 1));
        map.put("ex_shuiweibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_shuiweibiansongqiguzhangbaojing", 233, 2, "水位变送器故障报警", 2));
        map.put("ex_geishuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_geishuibengbianpinqiguzhang", 233, 2, "给水泵变频器故障", 3));
        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 233, 2, "漏电报警", 4));
        map.put("ex_qianyabaojing", ByteField.Init(new ExceptionField(), "ex_qianyabaojing", 233, 2, "欠压报警", 5));

        map.put("ex_shuiweiweidibaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweiweidibaojing_dianji", 233, 2, "水位危低报警（电极）", 8));
        map.put("ex_shuiweijidibaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_dianji", 233, 2, "水位极低报警（电极）", 9));
        map.put("ex_shuiweijigaobaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_dianji", 233, 2, "水位极高报警（电极）", 10));
        map.put("ex_shuiweijidibaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_shedingzhi", 233, 2, "水位极低报警（设定值）", 11));
        map.put("ex_shuiweijigaobaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_shedingzhi", 233, 2, "水位极高报警（设定值）", 12));
        map.put("ex_chaoyabaojing_yalikaiguan", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_yalikaiguan", 233, 2, "超压报警（压力开关）", 13));
        map.put("ex_chaoyabaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_shedingzhi", 233, 2, "超压报警（设定值）", 14));
        map.put("ex_ruanshuixiangqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_ruanshuixiangqueshuibaojing", 233, 2, "软水箱缺水报警", 15));


        map.put("oc_1#jiarezu", ByteField.Init(new OpenCloseField(), "oc_1#jiarezu", 237, 2, "1#加热组反馈", 1));
        map.put("oc_2#jiarezu", ByteField.Init(new OpenCloseField(), "oc_2#jiarezu", 237, 2, "2#加热组反馈", 1));
        map.put("oc_3#jiarezu", ByteField.Init(new OpenCloseField(), "oc_3#jiarezu", 237, 2, "3#加热组反馈", 1));
        map.put("oc_4#jiarezu", ByteField.Init(new OpenCloseField(), "oc_4#jiarezu", 237, 2, "4#加热组反馈", 1));
        map.put("oc_5#jiarezu", ByteField.Init(new OpenCloseField(), "oc_5#jiarezu", 237, 2, "5#加热组反馈", 1));
        map.put("oc_6#jiarezu", ByteField.Init(new OpenCloseField(), "oc_6#jiarezu", 237, 2, "6#加热组反馈", 1));
        map.put("oc_7#jiarezu", ByteField.Init(new OpenCloseField(), "oc_7#jiarezu", 237, 2, "7#加热组反馈", 1));
        map.put("oc_8#jiarezu", ByteField.Init(new OpenCloseField(), "oc_8#jiarezu", 237, 2, "8#加热组反馈", 1));
        map.put("oc_9#jiarezu", ByteField.Init(new OpenCloseField(), "oc_9#jiarezu", 237, 2, "9#加热组反馈", 1));
        map.put("oc_10#jiarezu", ByteField.Init(new OpenCloseField(), "oc_10#jiarezu", 237, 2, "10#加热组反馈", 1));
        map.put("oc_11#jiarezu", ByteField.Init(new OpenCloseField(), "oc_11#jiarezu", 237, 2, "11#加热组反馈", 1));
        map.put("oc_12#jiarezu", ByteField.Init(new OpenCloseField(), "oc_12#jiarezu", 237, 2, "12#加热组反馈", 1));
        map.put("oc_13#jiarezu", ByteField.Init(new OpenCloseField(), "oc_13#jiarezu", 237, 2, "13#加热组反馈", 1));
        map.put("oc_14#jiarezu", ByteField.Init(new OpenCloseField(), "oc_14#jiarezu", 237, 2, "14#加热组反馈", 1));
        map.put("oc_15#jiarezu", ByteField.Init(new OpenCloseField(), "oc_15#jiarezu", 237, 2, "15#加热组反馈", 1));
        map.put("oc_16#jiarezu", ByteField.Init(new OpenCloseField(), "oc_16#jiarezu", 237, 2, "16#加热组反馈", 1));
        map.put("oc_17#jiarezu", ByteField.Init(new OpenCloseField(), "oc_17#jiarezu", 239, 2, "17#加热组反馈", 1));
        map.put("oc_18#jiarezu", ByteField.Init(new OpenCloseField(), "oc_18#jiarezu", 239, 2, "18#加热组反馈", 1));
        map.put("oc_19#jiarezu", ByteField.Init(new OpenCloseField(), "oc_19#jiarezu", 239, 2, "19#加热组反馈", 1));
        map.put("oc_20#jiarezu", ByteField.Init(new OpenCloseField(), "oc_20#jiarezu", 239, 2, "20#加热组反馈", 1));
        map.put("oc_21#jiarezu", ByteField.Init(new OpenCloseField(), "oc_21#jiarezu", 239, 2, "21#加热组反馈", 1));
        map.put("oc_22#jiarezu", ByteField.Init(new OpenCloseField(), "oc_22#jiarezu", 239, 2, "22#加热组反馈", 1));
        map.put("oc_23#jiarezu", ByteField.Init(new OpenCloseField(), "oc_23#jiarezu", 239, 2, "23#加热组反馈", 1));
        map.put("oc_24#jiarezu", ByteField.Init(new OpenCloseField(), "oc_24#jiarezu", 239, 2, "24#加热组反馈", 1));
        map.put("oc_25#jiarezu", ByteField.Init(new OpenCloseField(), "oc_25#jiarezu", 239, 2, "25#加热组反馈", 1));
        map.put("oc_26#jiarezu", ByteField.Init(new OpenCloseField(), "oc_26#jiarezu", 239, 2, "26#加热组反馈", 1));
        map.put("oc_27#jiarezu", ByteField.Init(new OpenCloseField(), "oc_27#jiarezu", 239, 2, "27#加热组反馈", 1));
        map.put("oc_28#jiarezu", ByteField.Init(new OpenCloseField(), "oc_28#jiarezu", 239, 2, "28#加热组反馈", 1));
        map.put("oc_29#jiarezu", ByteField.Init(new OpenCloseField(), "oc_29#jiarezu", 239, 2, "29#加热组反馈", 1));
        map.put("oc_30#jiarezu", ByteField.Init(new OpenCloseField(), "oc_30#jiarezu", 239, 2, "30#加热组反馈", 1));
        map.put("oc_31#jiarezu", ByteField.Init(new OpenCloseField(), "oc_31#jiarezu", 239, 2, "31#加热组反馈", 1));
        map.put("oc_32#jiarezu", ByteField.Init(new OpenCloseField(), "oc_32#jiarezu", 239, 2, "32#加热组反馈", 1));

    }
}
