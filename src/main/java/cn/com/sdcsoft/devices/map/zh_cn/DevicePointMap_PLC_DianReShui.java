package cn.com.sdcsoft.devices.map.zh_cn;

import cn.com.sdcsoft.devices.Device_PLC;
import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.FixedValueField;
import cn.com.sdcsoft.devices.meta.PLC.*;

import static cn.com.sdcsoft.devices.Device_PLC.*;

/**
 * 01030000007705EC
 * 初始化数据
 */
public class DevicePointMap_PLC_DianReShui extends DevicePointMap {

    private static final String Commands_Key_Parameters_Setting = "参数设置";
    private static final String Commands_Key_System_Ctl = "系统控制";
    public DevicePointMap_PLC_DianReShui() {
        commandsMap.put(Commands_Key_Parameters_Setting,null);
        commandsMap.put(Commands_Key_System_Ctl,null);
        /**
         * 计算属性（不显示）
         */
        map.put(Device_PLC.KEY_POINT_Add_SHUI_BENG, ByteField.Init(new CountField(), Device_PLC.KEY_POINT_Add_SHUI_BENG,  "补水泵"));
        map.put(Device_PLC.KEY_POINT_XUN_HUAN_BENG, ByteField.Init(new CountField(), Device_PLC.KEY_POINT_XUN_HUAN_BENG,   "循环泵"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 9, 2, "运行小时数", "时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 11, 2, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 13, 2, "系统状态", PLC_Common_ValueMaps.coms_status));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "燃料", 1,DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "介质", 0,DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "水位状态", DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "燃烧器状态", PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 35, 4, "出水温度", "℃"));
        map.put("mo_huishuiwendu", ByteField.Init(new MockField(), "mo_huishuiwendu", 39, 4, "回水温度", "℃"));
        map.put("mo_chushuiyali", ByteField.Init(new MockField(), "mo_chushuiyali", 43, 4, "出水压力", "Mpa"));
        map.put("mo_huishuiyali", ByteField.Init(new MockField(), "mo_huishuiyali", 47, 4, "回水压力", "Mpa"));
        map.put("mo_qidongjiarezushu", ByteField.Init(new MockField(), "mo_qidongjiarezushu", 79, 4, "启动加热组数", "组"));
        map.put("mo_qidongjiarezushubaifenbi", ByteField.Init(new MockField(), "mo_qidongjiarezushubaifenbi", 83, 4, "启动加热组数百分比", "%"));

        map.put("se_chaowenbaojingsheding", ByteField.Init(new SettingField(), "se_chaowenbaojingsheding", 127, 4, "超温报警设定", "℃", Commands_Key_Parameters_Setting,"003E",10,200));
        map.put("se_shiyongjiarezushusheding", ByteField.Init(new SettingField(), "se_shiyongjiarezushusheding", 131, 4, "使用加热组数设定", "组"));
        map.put("se_touqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_touqiejiangeshijiansheding", 135, 4, "投切间隔时间设定", "S"));
        map.put("se_kuaiqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_kuaiqiejiangeshijiansheding", 139, 4, "快切间隔时间设定", "S"));
        map.put("se_tingluwendusheding", ByteField.Init(new SettingField(), "se_tingluwendusheding", 143, 4, "停炉温度设定", "℃"));
        map.put("se_shiyongwendusheding", ByteField.Init(new SettingField(), "se_shiyongwendusheding", 147, 4, "使用温度设定", "℃"));
        map.put("se_qiluwendusheding", ByteField.Init(new SettingField(), "se_qiluwendusheding", 151, 4, "启炉温度设定", "℃"));
        map.put("se_yalidibaojingsheding", ByteField.Init(new SettingField(), "se_yalidibaojingsheding", 155, 4, "压力低报警设定", "Mpa"));
        map.put("se_yaligaobaojingsheding", ByteField.Init(new SettingField(), "se_yaligaobaojingsheding", 159, 4, "压力高报警设定", "Mpa"));
        map.put("se_qibengyalisheding", ByteField.Init(new SettingField(), "se_qibengyalisheding", 163, 4, "启泵压力设定", "Mpa"));
        map.put("se_tingbengyalisheding", ByteField.Init(new SettingField(), "se_tingbengyalisheding", 167, 4, "停泵压力设定", "Mpa"));
        map.put("se_xunhuanbengshangxianwendusheding", ByteField.Init(new SettingField(), "se_xunhuanbengshangxianwendusheding", 171, 4, "循环泵上限温度设定", "℃"));
        map.put("se_xunhuanbengxiaxianwendusheding", ByteField.Init(new SettingField(), "se_xunhuanbengxiaxianwendusheding", 175, 4, "循环泵下限温度设定", "℃"));


        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 199, 2, "1#补水泵", PLC_Common_ValueMaps.coms_atuo));
        map.put(KEY_POINT_Add_SHUI_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_1, 201, 2, "1#补水泵", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 203, 2, "2#补水泵", PLC_Common_ValueMaps.coms_atuo));
        map.put(KEY_POINT_Add_SHUI_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_2, 205, 2, "2#补水泵", DevicePointMap.coms_start_stop));
        map.put("de_baojingshuchuzhishi", ByteField.Init(new DeviceField(), "de_baojingshuchuzhishi", 207, 2, "报警输出指示", coms_open_close));
        map.put("de_1_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_1_xunhuanbeng_auto", 209, 2, "1#循环泵", PLC_Common_ValueMaps.coms_atuo));
        map.put(KEY_POINT_XUN_HUAN_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_XUN_HUAN_BENG_1, 211, 2, "1#循环泵", DevicePointMap.coms_start_stop));
        map.put("de_2_xunhuanbeng_auto", ByteField.Init(new DeviceField(), "de_2_xunhuanbeng_auto", 213, 2, "2#循环泵", PLC_Common_ValueMaps.coms_atuo));
        map.put(KEY_POINT_XUN_HUAN_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_XUN_HUAN_BENG_2, 215, 2, "2#循环泵", DevicePointMap.coms_start_stop));

        map.put("ex_shuiweijidibaojing（dianji）", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing（dianji）", 233, 2, "水位极低报警（电极）", 8));
        map.put("ex_xitongchaoyabaojing（shedingzhi）", ByteField.Init(new ExceptionField(), "ex_xitongchaoyabaojing（shedingzhi）", 233, 2, "系统超压报警（设定值）", 9));
        map.put("ex_xitongyalidibaojing（shedingzhi）", ByteField.Init(new ExceptionField(), "ex_xitongyalidibaojing（shedingzhi）", 233, 2, "系统压力低报警（设定值）", 10));
        map.put("ex_xitongchaoyabaojing（dianjiedianyalibiao）", ByteField.Init(new ExceptionField(), "ex_xitongchaoyabaojing（dianjiedianyalibiao）", 233, 2, "系统超压报警（电接点压力表）", 11));
        map.put("ex_xitongyalidibaojing（dianjiedianyalibiao）", ByteField.Init(new ExceptionField(), "ex_xitongyalidibaojing（dianjiedianyalibiao）", 233, 2, "系统压力低报警（电接点压力表）", 12));
        map.put("ex_chushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiguzhang", 233, 2, "出水温度传感器故障", 13));
        map.put("ex_huishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiwenduchuanganqiguzhang）", 233, 2, "回水温度传感器故障", 14));
        map.put("ex_chushuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiyalibiansongqiguzhang", 233, 2, "出水压力变送器故障", 15));
        map.put("ex_huishuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiyalibiansongqiguzhang", 233, 2, "回水压力变送器故障", 0));
        map.put("ex_lubichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_lubichaowenbaojing", 233, 2, "炉壁超温报警", 1));
        map.put("ex_waibuliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuoduankaibaojing", 233, 2, "外部连锁断开报警", 2));
        map.put("ex_xunhuanbengliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengliansuoduankaibaojing", 233, 2, "循环泵连锁断开报警", 3));
        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 233, 2, "漏电报警", 4));
        map.put("ex_qianyabaojing", ByteField.Init(new ExceptionField(), "ex_qianyabaojing", 233, 2, "欠压报警", 5));
        map.put("ex_chushuichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_chushuichaowenbaojing", 233, 2, "出水超温报警", 6));
        map.put("ex_wendushedingcuowubaojing", ByteField.Init(new ExceptionField(), "ex_wendushedingcuowubaojing", 233, 2, "温度设定错误报警", 7));
        map.put("ex_Axiangguoliubaojing", ByteField.Init(new ExceptionField(), "ex_Axiangguoliubaojing", 235, 2, "A相过流报警", 8));
        map.put("ex_Bxiangguoliubaojing", ByteField.Init(new ExceptionField(), "ex_Bxiangguoliubaojing", 235, 2, "B相过流报警", 9));
        map.put("ex_Cxiangguoliubaojing", ByteField.Init(new ExceptionField(), "ex_Cxiangguoliubaojing", 235, 2, "C相过流报警", 10));


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

