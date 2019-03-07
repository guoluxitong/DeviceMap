package cn.com.sdcsoft.devices.map.zh_cn;

import cn.com.sdcsoft.devices.Device_CTL_RT_H1_RY;
import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.CountShowField;
import cn.com.sdcsoft.devices.meta.FixedValueField;

import java.util.HashMap;

import static cn.com.sdcsoft.devices.Device_CTL_RT_H1_RY.*;
import static cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap.CTL_NJRT_Common_ValueMaps.coms_ranshaoqi_status;


// Created by 赵龙 on 2018/12/21
//命令：1.01030010005c4436
//     2.0103006c0052042a
// 设置参数中参数P传过来的数据与控制器显示不一致  设置参数中燃烧方式传过来的数据不清楚具体代表那种方式
public class DevicePointMap_CTL_RT_H1_RYRS extends DevicePointMap {
    static final String Commands_Key_Parameters_Setting = "参数设置";
    static final String Commands_Key_System_Ctl = "系统控制";
    private static HashMap<Integer, String> coms_status = new HashMap<Integer, String>() {
        {
            put(0, "待命");
            put(1, "报警");
            put(2, "定时");
            put(3, "启1");
            put(4, "停1");
            put(5, "启2");
            put(6, "停2");
            put(7, "启3");
            put(8, "停3");
            put(9, "启4");
            put(10, "停4");
            put(11, "防冻");
        }
    };
    private static HashMap<Integer, String> coms_moshi = new HashMap<Integer, String>() {
        {
            put(0, "模式一");
            put(1, "模式二");
            put(2, "模式三");
        }
    };
    public DevicePointMap_CTL_RT_H1_RYRS() {
        commandsMap.put(Commands_Key_Parameters_Setting,null);
        commandsMap.put(Commands_Key_System_Ctl,null);
        /*计算属性（不显示）*/
        map.put(Device_CTL_RT_H1_RY.KEY_POINT_Add_SHUI_BENG, ByteField.Init(new CountField(), Device_CTL_RT_H1_RY.KEY_POINT_Add_SHUI_BENG,  "补水泵"));
        map.put(Device_CTL_RT_H1_RY.KEY_POINT_XUN_HUAN_BENG, ByteField.Init(new CountField(), Device_CTL_RT_H1_RY.KEY_POINT_XUN_HUAN_BENG,   "循环泵"));
        map.put(Device_CTL_RT_H1_RY.KEY_POINT_RAN_SHAO_QI, ByteField.Init(new CountField(), Device_CTL_RT_H1_RY.KEY_POINT_RAN_SHAO_QI,   "燃烧器"));


        map.put(KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), KEY_POINT_SYSTEM_STATUS, 3, 2, "控制器状态", coms_status));
        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "累计燃烧时间", "时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, "运行小时数", "时"));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "燃料类型", 0, DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "介质类型", 0, DevicePointMap.coms_media));

        map.put("oc_queshuidianji", ByteField.Init(new OpenCloseField(), "oc_queshuidianji", 5, 2, "缺水电极", 0, coms_open_close));
        map.put("oc_dishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_dishuiweidianji", 5, 2, "低水位电极", 1, coms_open_close));
        map.put("oc_gaoshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweidianji", 5, 2, "高水位电极", 2, coms_open_close));
        map.put("oc_gaoshuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojingdianji", 5, 2, "高水位报警电极", 3, coms_open_close));
        map.put("oc_dianjiedianyalibiaodizhen", ByteField.Init(new OpenCloseField(), "oc_dianjiedianyalibiaodizhen", 5, 2, "电接点压力表低针", 4, coms_open_close));
        map.put("oc_dianjiedianyalibiaogaozhen", ByteField.Init(new OpenCloseField(), "oc_dianjiedianyalibiaogaozhen", 5, 2, "电接点压力表高针", 5, coms_open_close));
        map.put("oc_xunhuanbengliansuoxinhao", ByteField.Init(new OpenCloseField(), "oc_xunhuanbengliansuoxinhao", 5, 2, "循环泵联锁信号", 8, coms_open_close));
        map.put("oc_chaoyabaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojingxinhao", 5, 2, "超压报警信号", 9, coms_open_close));
        map.put("oc_ranshaoqiguzhangxinhao", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiguzhangxinhao", 5, 2, "燃烧器故障信号", 10, coms_open_close));
        map.put("oc_ranqiyalidibaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_ranqiyalidibaojingxinhao", 5, 2, "燃气压力低报警信号", 11, coms_open_close));
        map.put("oc_ranqixieloubaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_ranqixieloubaojingxinhao", 5, 2, "燃气泄漏报警信号", 12, coms_open_close));

        map.put(KEY_POINT_RAN_SHAO_QI_KONGZHI, ByteField.Init(new DeviceField(), KEY_POINT_RAN_SHAO_QI_KONGZHI, 9, 2, "燃烧器启停控制",0,coms_open_close));
        //map.put(KEY_POINT_RAN_SHAO_QI_STATUS, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI_STATUS, "燃烧器状态"));
        map.put("oc_ranshaoqibilijianda", ByteField.Init(new OpenCloseField(), "oc_ranshaoqibilijianda", 9, 2, "燃烧器比例增加", 1, coms_open_close));
        map.put("oc_ranshaoqibilijianxiao", ByteField.Init(new OpenCloseField(), "oc_ranshaoqibilijianxiao", 9, 2, "燃烧器比例减小", 2, coms_open_close));


        map.put(KEY_POINT_Add_SHUI_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_1, 9, 2, "补水泵主控制", 3, coms_open_close));
        map.put(KEY_POINT_Add_SHUI_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_2, 9, 2, "补水泵备控制", 4, coms_open_close));
        map.put(KEY_POINT_XUN_HUAN_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_XUN_HUAN_BENG_1, 9, 2, "循环泵主控制", 5, coms_open_close));
        map.put(KEY_POINT_XUN_HUAN_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_XUN_HUAN_BENG_2, 9, 2, "循环泵备控制", 6, coms_open_close));

        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 13, 2, "出水温度", "℃"));
        map.put("mo_huishuiwendu", ByteField.Init(new MockField(), "mo_huishuiwendu", 15, 2, "回水温度", "℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 19, 2, "排烟温度", "℃"));



        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "极限低水位报警", 0));
        map.put("ex_chushuiwenduchuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiduanlu", 45, 2, "出水温度传感器断路", 1));
        map.put("ex_chushuiwenduchuanganqiduanlu1", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiduanlu", 45, 2, "出水温度传感器短路", 2));
        map.put("ex_huishuiwenduchuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_huishuiwenduchuanganqiduanlu", 45, 2, "回水温度传感器断路", 3));
        map.put("ex_chushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chushuiwendugaobaojing", 45, 2, "出水温度高报警", 4));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "排烟温度高报警", 5));
        map.put("ex_chaoyabaojing", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing", 45, 2, "超压报警", 6));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 45, 2, "燃烧器故障", 7));
        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 45, 2, "燃气压力低报警", 8));
        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 45, 2, "燃气泄漏报警", 9));
        map.put("ex_dianjiedianyalibiaoduanlu", ByteField.Init(new ExceptionField(), "ex_dianjiedianyalibiaoduanlu", 45, 2, "电接点压力表短路", 11));
        map.put("ex_shuiweidianjiluojicuo", ByteField.Init(new ExceptionField(), "ex_shuiweidianjiluojicuo", 45, 2, "水位电极逻辑错", 12));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "高水位报警", 13));
        map.put("ex_xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanbengguzhang", 45, 2, "循环泵故障", 14));

        map.put("de_bushuibengzhubei", ByteField.Init(new DeviceField(), "de_bushuibengzhubei", 49, 2, "补水泵", 0, CTL_NJRT_Common_ValueMaps.coms_master));
        map.put("de_bushuibengshoudongzidong", ByteField.Init(new DeviceField(), "de_bushuibengshoudongzidong", 49, 2, "补水泵", 1, CTL_NJRT_Common_ValueMaps.coms_atuo));
        map.put("de_xunhuanbengzhubei", ByteField.Init(new DeviceField(),"de_xunhuanbengzhubei", 49, 2, "循环泵", 2, CTL_NJRT_Common_ValueMaps.coms_master));
        map.put("de_xunhuanbengshoudongzidong", ByteField.Init(new DeviceField(), "de_xunhuanbengshoudongzidong", 49, 2, "循环泵", 3, CTL_NJRT_Common_ValueMaps.coms_atuo));


        map.put("se_moshiyishiduan1qidongshi", ByteField.Init(new SettingField(), "se_moshiyishiduan1qidongshi", 61, 2, "模式一时段1启动时", "时", Commands_Key_Parameters_Setting, "00b0", 0, 23));
        map.put("se_moshiyishiduan1qidongfen", ByteField.Init(new SettingField(), "se_moshiyishiduan1qidongfen", 63, 2, "模式一时段1启动分", "分", Commands_Key_Parameters_Setting, "00b1", 0, 59));
        map.put("se_moshiyishiduan1tingzhishi", ByteField.Init(new SettingField(), "se_moshiyishiduan1tingzhishi", 65, 2, "模式一时段1停止时", "时", Commands_Key_Parameters_Setting, "00b2", 0, 23));
        map.put("se_moshiyishiduan1tingzhifen", ByteField.Init(new SettingField(), "se_moshiyishiduan1tingzhifen", 67, 2, "模式一时段1停止分", "分", Commands_Key_Parameters_Setting, "00b3", 0, 59));
        map.put("se_moshiyishiduan1tingluwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan1tingluwendu", 69, 2, "模式一时段1停炉温度", "℃", Commands_Key_Parameters_Setting, "00b4", 10, 100));
        map.put("se_moshiyishiduan1shiyongwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan1shiyongwendu", 71, 2, "模式一时段1使用温度", "℃", Commands_Key_Parameters_Setting, "00b5", 7, 97));
        map.put("se_moshiyishiduan1mubiaowendu", ByteField.Init(new SettingField(), "se_moshiyishiduan1mubiaowendu", 73, 2, "模式一时段1目标温度", "℃", Commands_Key_Parameters_Setting, "00b6", 10, 100));
        map.put("se_moshiyishiduan1guanbengwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan1guanbengwendu", 75, 2, "模式一时段1关泵温度", "℃", Commands_Key_Parameters_Setting, "00b8", 10, 100));
        map.put("se_moshiyishiduan1kaibengwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan1kaibengwendu", 77, 2, "模式一时段1开泵温度", "℃", Commands_Key_Parameters_Setting, "00b9", 10, 100));
        map.put("se_moshiyishiduan1zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshiyishiduan1zhuanhuowendu", 79, 2, "模式一时段1转火温度", "℃", Commands_Key_Parameters_Setting, "00b7", 10, 100));
        map.put("se_moshiyishiduan2qidongshi", ByteField.Init(new SettingField(), "se_moshiyishiduan2qidongshi", 81, 2, "模式一时段2启动时", "时", Commands_Key_Parameters_Setting, "00ba", 0, 23));
        map.put("se_moshiyishiduan2qidongfen", ByteField.Init(new SettingField(), "se_moshiyishiduan2qidongfen", 83, 2, "模式一时段2启动分", "分", Commands_Key_Parameters_Setting, "00bb", 0, 59));
        map.put("se_moshiyishiduan2tingzhishi", ByteField.Init(new SettingField(), "se_moshiyishiduan2tingzhishi", 85, 2, "模式一时段2停止时", "时", Commands_Key_Parameters_Setting, "00bc", 0, 23));
        map.put("se_moshiyishiduan2tingzhifen", ByteField.Init(new SettingField(), "se_moshiyishiduan2tingzhifen", 87, 2, "模式一时段2停止分", "分", Commands_Key_Parameters_Setting, "00bd", 0, 59));
        map.put("se_moshiyishiduan2tingluwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan2tingluwendu", 89, 2, "模式一时段2停炉温度", "℃", Commands_Key_Parameters_Setting, "00be", 10, 100));
        map.put("se_moshiyishiduan2shiyongwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan2shiyongwendu", 91, 2, "模式一时段2使用温度", "℃", Commands_Key_Parameters_Setting, "00bf", 7, 97));
        map.put("se_moshiyishiduan2mubiaowendu", ByteField.Init(new SettingField(), "se_moshiyishiduan2mubiaowendu", 93, 2, "模式一时段2目标温度", "℃", Commands_Key_Parameters_Setting, "00c0", 10, 100));
        map.put("se_moshiyishiduan2guanbengwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan2guanbengwendu", 95, 2, "模式一时段2关泵温度", "℃", Commands_Key_Parameters_Setting, "00c2", 10, 100));
        map.put("se_moshiyishiduan2kaibengwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan2kaibengwendu", 97, 2, "模式一时段2开泵温度", "℃", Commands_Key_Parameters_Setting, "00c3", 10, 100));
        map.put("se_moshiyishiduan2zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshiyishiduan2zhuanhuowendu", 99, 2, "模式一时段2转火温度", "℃", Commands_Key_Parameters_Setting, "00c1", 10, 100));
        map.put("se_moshiyishiduan3qidongshi", ByteField.Init(new SettingField(), "se_moshiyishiduan3qidongshi", 101, 2, "模式一时段3启动时", "时", Commands_Key_Parameters_Setting, "00c4", 0, 23));
        map.put("se_moshiyishiduan3qidongfen", ByteField.Init(new SettingField(), "se_moshiyishiduan3qidongfen", 103, 2, "模式一时段3启动分", "分", Commands_Key_Parameters_Setting, "00c5", 0, 59));
        map.put("se_moshiyishiduan3tingzhishi", ByteField.Init(new SettingField(), "se_moshiyishiduan3tingzhishi", 105, 2, "模式一时段3停止时", "时", Commands_Key_Parameters_Setting, "00c6", 0, 23));
        map.put("se_moshiyishiduan3tingzhifen", ByteField.Init(new SettingField(), "se_moshiyishiduan3tingzhifen", 107, 2, "模式一时段3停止分", "分", Commands_Key_Parameters_Setting, "00c7", 0, 59));
        map.put("se_moshiyishiduan3tingluwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan3tingluwendu", 109, 2, "模式一时段3停炉温度", "℃", Commands_Key_Parameters_Setting, "00c8", 10, 100));
        map.put("se_moshiyishiduan3shiyongwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan3shiyongwendu", 111, 2, "模式一时段3使用温度", "℃", Commands_Key_Parameters_Setting, "00c9", 7, 97));
        map.put("se_moshiyishiduan3mubiaowendu", ByteField.Init(new SettingField(), "se_moshiyishiduan3mubiaowendu", 113, 2, "模式一时段3目标温度", "℃", Commands_Key_Parameters_Setting, "00ca", 10, 100));
        map.put("se_moshiyishiduan3guanbengwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan3guanbengwendu", 115, 2, "模式一时段3关泵温度", "℃", Commands_Key_Parameters_Setting, "00cc", 10, 100));
        map.put("se_moshiyishiduan3kaibengwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan3kaibengwendu", 117, 2, "模式一时段3开泵温度", "℃", Commands_Key_Parameters_Setting, "00cd", 10, 100));
        map.put("se_moshiyishiduan3zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshiyishiduan3zhuanhuowendu", 119, 2, "模式一时段3转火温度", "℃", Commands_Key_Parameters_Setting, "00cb", 10, 100));
        map.put("se_moshiyishiduan4qidongshi", ByteField.Init(new SettingField(), "se_moshiyishiduan4qidongshi", 121, 2, "模式一时段4启动时", "时", Commands_Key_Parameters_Setting, "00ce", 0, 23));
        map.put("se_moshiyishiduan4qidongfen", ByteField.Init(new SettingField(), "se_moshiyishiduan4qidongfen", 123, 2, "模式一时段4启动分", "分", Commands_Key_Parameters_Setting, "00cf", 0, 59));
        map.put("se_moshiyishiduan4tingzhishi", ByteField.Init(new SettingField(), "se_moshiyishiduan4tingzhishi", 125, 2, "模式一时段4停止时", "时", Commands_Key_Parameters_Setting, "00d0", 0, 23));
        map.put("se_moshiyishiduan4tingzhifen", ByteField.Init(new SettingField(), "se_moshiyishiduan4tingzhifen", 127, 2, "模式一时段4停止分", "分", Commands_Key_Parameters_Setting, "00d1", 0, 59));
        map.put("se_moshiyishiduan4tingluwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan4tingluwendu", 129, 2, "模式一时段4停炉温度", "℃", Commands_Key_Parameters_Setting, "00d2", 10, 100));
        map.put("se_moshiyishiduan4shiyongwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan4shiyongwendu", 131, 2, "模式一时段4使用温度", "℃", Commands_Key_Parameters_Setting, "00d3", 7, 97));
        map.put("se_moshiyishiduan4mubiaowendu", ByteField.Init(new SettingField(), "se_moshiyishiduan4mubiaowendu", 133, 2, "模式一时段4目标温度", "℃", Commands_Key_Parameters_Setting, "00d4", 10, 100));
        map.put("se_moshiyishiduan4guanbengwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan4guanbengwendu", 135, 2, "模式一时段4关泵温度", "℃", Commands_Key_Parameters_Setting, "00d6", 10, 100));
        map.put("se_moshiyishiduan4kaibengwendu", ByteField.Init(new SettingField(), "se_moshiyishiduan4kaibengwendu", 137, 2, "模式一时段4开泵温度", "℃", Commands_Key_Parameters_Setting, "00d7", 10, 100));
        map.put("se_moshiyishiduan4zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshiyishiduan4zhuanhuowendu", 139, 2, "模式一时段4转火温度", "℃", Commands_Key_Parameters_Setting, "00d5", 10, 100));
        map.put("se_moshieshiduan1qidongshi", ByteField.Init(new SettingField(), "se_moshieshiduan1qidongshi", 141, 2, "模式二时段1启动时", "时", Commands_Key_Parameters_Setting, "00d8", 0, 23));
        map.put("se_moshieshiduan1qidongfen", ByteField.Init(new SettingField(), "se_moshieshiduan1qidongfen", 143, 2, "模式二时段1启动分", "分", Commands_Key_Parameters_Setting, "00d9", 0, 59));
        map.put("se_moshieshiduan1tingzhishi", ByteField.Init(new SettingField(), "se_moshieshiduan1tingzhishi", 145, 2, "模式二时段1停止时", "时", Commands_Key_Parameters_Setting, "00da", 0, 23));
        map.put("se_moshieshiduan1tingzhifen", ByteField.Init(new SettingField(), "se_moshieshiduan1tingzhifen", 147, 2, "模式二时段1停止分", "分", Commands_Key_Parameters_Setting, "00db", 0, 59));
        map.put("se_moshieshiduan1tingluwendu", ByteField.Init(new SettingField(), "se_moshieshiduan1tingluwendu", 149, 2, "模式二时段1停炉温度", "℃", Commands_Key_Parameters_Setting, "00dc", 10, 100));
        map.put("se_moshieshiduan1shiyongwendu", ByteField.Init(new SettingField(), "se_moshieshiduan1shiyongwendu", 151, 2, "模式二时段1使用温度", "℃", Commands_Key_Parameters_Setting, "00dd", 7, 97));
        map.put("se_moshieshiduan1mubiaowendu", ByteField.Init(new SettingField(), "se_moshieshiduan1mubiaowendu", 153, 2, "模式二时段1目标温度", "℃", Commands_Key_Parameters_Setting, "00de", 10, 100));
        map.put("se_moshieshiduan1guanbengwendu", ByteField.Init(new SettingField(), "se_moshieshiduan1guanbengwendu", 155, 2, "模式二时段1关泵温度", "℃", Commands_Key_Parameters_Setting, "00e0", 10, 100));
        map.put("se_moshieshiduan1kaibengwendu", ByteField.Init(new SettingField(), "se_moshieshiduan1kaibengwendu", 157, 2, "模式二时段1开泵温度", "℃", Commands_Key_Parameters_Setting, "00e1", 10, 100));
        map.put("se_moshieshiduan1zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshieshiduan1zhuanhuowendu", 159, 2, "模式二时段1转火温度", "℃", Commands_Key_Parameters_Setting, "00df", 10, 100));
        map.put("se_moshieshiduan2qidongshi", ByteField.Init(new SettingField(), "se_moshieshiduan2qidongshi", 161, 2, "模式二时段2启动时", "时", Commands_Key_Parameters_Setting, "00e2", 0, 23));
        map.put("se_moshieshiduan2qidongfen", ByteField.Init(new SettingField(), "se_moshieshiduan2qidongfen", 163, 2, "模式二时段2启动分", "分", Commands_Key_Parameters_Setting, "00e3", 0, 59));
        map.put("se_moshieshiduan2tingzhishi", ByteField.Init(new SettingField(), "se_moshieshiduan2tingzhishi", 165, 2, "模式二时段2停止时", "时", Commands_Key_Parameters_Setting, "00e4", 0, 23));
        map.put("se_moshieshiduan2tingzhifen", ByteField.Init(new SettingField(), "se_moshieshiduan2tingzhifen", 167, 2, "模式二时段2停止分", "分", Commands_Key_Parameters_Setting, "00e5", 0, 59));
        map.put("se_moshieshiduan2tingluwendu", ByteField.Init(new SettingField(), "se_moshieshiduan2tingluwendu", 169, 2, "模式二时段2停炉温度", "℃", Commands_Key_Parameters_Setting, "00e6", 10, 100));
        map.put("se_moshieshiduan2shiyongwendu", ByteField.Init(new SettingField(), "se_moshieshiduan2shiyongwendu", 171, 2, "模式二时段2使用温度", "℃", Commands_Key_Parameters_Setting, "00e7", 7, 97));
        map.put("se_moshieshiduan2mubiaowendu", ByteField.Init(new SettingField(), "se_moshieshiduan2mubiaowendu", 173, 2, "模式二时段2目标温度", "℃", Commands_Key_Parameters_Setting, "00e8", 10, 100));
        map.put("se_moshieshiduan2guanbengwendu", ByteField.Init(new SettingField(), "se_moshieshiduan2guanbengwendu", 175, 2, "模式二时段2关泵温度", "℃", Commands_Key_Parameters_Setting, "00ea", 10, 100));
        map.put("se_moshieshiduan2kaibengwendu", ByteField.Init(new SettingField(), "se_moshieshiduan2kaibengwendu", 177, 2, "模式二时段2开泵温度", "℃", Commands_Key_Parameters_Setting, "00eb", 10, 100));
        map.put("se_moshieshiduan2zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshieshiduan2zhuanhuowendu", 179, 2, "模式二时段2转火温度", "℃", Commands_Key_Parameters_Setting, "00e9", 10, 100));
        map.put("se_moshieshiduan3qidongshi", ByteField.Init(new SettingField(), "se_moshieshiduan3qidongshi", 192, 2, "模式二时段3启动时", "时", Commands_Key_Parameters_Setting, "00ec", 0, 23));
        map.put("se_moshieshiduan3qidongfen", ByteField.Init(new SettingField(), "se_moshieshiduan3qidongfen", 194, 2, "模式二时段3启动分", "分", Commands_Key_Parameters_Setting, "00ed", 0, 59));
        map.put("se_moshieshiduan3tingzhishi", ByteField.Init(new SettingField(), "se_moshieshiduan3tingzhishi", 196, 2, "模式二时段3停止时", "时", Commands_Key_Parameters_Setting, "00ee", 0, 23));
        map.put("se_moshieshiduan3tingzhifen", ByteField.Init(new SettingField(), "se_moshieshiduan3tingzhifen", 198, 2, "模式二时段3停止分", "分", Commands_Key_Parameters_Setting, "00ef", 0, 59));
        map.put("se_moshieshiduan3tingluwendu", ByteField.Init(new SettingField(), "se_moshieshiduan3tingluwendu", 200, 2, "模式二时段3停炉温度", "℃", Commands_Key_Parameters_Setting, "00f0", 10, 100));
        map.put("se_moshieshiduan3shiyongwendu", ByteField.Init(new SettingField(), "se_moshieshiduan3shiyongwendu", 202, 2, "模式二时段3使用温度", "℃", Commands_Key_Parameters_Setting, "00f1", 7, 97));
        map.put("se_moshieshiduan3mubiaowendu", ByteField.Init(new SettingField(), "se_moshieshiduan3mubiaowendu", 204, 2, "模式二时段3目标温度", "℃", Commands_Key_Parameters_Setting, "00f2", 10, 100));
        map.put("se_moshieshiduan3guanbengwendu", ByteField.Init(new SettingField(), "se_moshieshiduan3guanbengwendu", 206, 2, "模式二时段3关泵温度", "℃", Commands_Key_Parameters_Setting, "00f4", 10, 100));
        map.put("se_moshieshiduan3kaibengwendu", ByteField.Init(new SettingField(), "se_moshieshiduan3kaibengwendu", 208, 2, "模式二时段3开泵温度", "℃", Commands_Key_Parameters_Setting, "00f5", 10, 100));
        map.put("se_moshieshiduan3zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshieshiduan3zhuanhuowendu", 210, 2, "模式二时段3转火温度", "℃", Commands_Key_Parameters_Setting, "00f3", 10, 100));
        map.put("se_moshieshiduan4qidongshi", ByteField.Init(new SettingField(), "se_moshieshiduan4qidongshi", 212, 2, "模式二时段4启动时", "时", Commands_Key_Parameters_Setting, "00f6", 0, 23));
        map.put("se_moshieshiduan4qidongfen", ByteField.Init(new SettingField(), "se_moshieshiduan4qidongfen", 214, 2, "模式二时段4启动分", "分", Commands_Key_Parameters_Setting, "00f7", 0, 59));
        map.put("se_moshieshiduan4tingzhishi", ByteField.Init(new SettingField(), "se_moshieshiduan4tingzhishi", 216, 2, "模式二时段4停止时", "时", Commands_Key_Parameters_Setting, "00f8", 0, 23));
        map.put("se_moshieshiduan4tingzhifen", ByteField.Init(new SettingField(), "se_moshieshiduan4tingzhifen", 218, 2, "模式二时段4停止分", "分", Commands_Key_Parameters_Setting, "00f9", 0, 59));
        map.put("se_moshieshiduan4tingluwendu", ByteField.Init(new SettingField(), "se_moshieshiduan4tingluwendu", 220, 2, "模式二时段4停炉温度", "℃", Commands_Key_Parameters_Setting, "00fa", 10, 100));
        map.put("se_moshieshiduan4shiyongwendu", ByteField.Init(new SettingField(), "se_moshieshiduan4shiyongwendu", 222, 2, "模式二时段4使用温度", "℃", Commands_Key_Parameters_Setting, "00fb", 7, 97));
        map.put("se_moshieshiduan4mubiaowendu", ByteField.Init(new SettingField(), "se_moshieshiduan4mubiaowendu", 224, 2, "模式二时段4目标温度", "℃", Commands_Key_Parameters_Setting, "00fc", 10, 100));
        map.put("se_moshieshiduan4guanbengwendu", ByteField.Init(new SettingField(), "se_moshieshiduan4guanbengwendu", 226, 2, "模式二时段4关泵温度", "℃", Commands_Key_Parameters_Setting, "00fe", 10, 100));
        map.put("se_moshieshiduan4kaibengwendu", ByteField.Init(new SettingField(), "se_moshieshiduan4kaibengwendu", 228, 2, "模式二时段4开泵温度", "℃", Commands_Key_Parameters_Setting, "00ff", 10, 100));
        map.put("se_moshieshiduan4zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshieshiduan4zhuanhuowendu", 230, 2, "模式二时段4转火温度", "℃", Commands_Key_Parameters_Setting, "00fd", 10, 100));
        map.put("se_moshisanshiduan1qidongshi", ByteField.Init(new SettingField(), "se_moshisanshiduan1qidongshi", 232, 2, "模式三时段1启动时", "时", Commands_Key_Parameters_Setting, "0100", 0, 23));
        map.put("se_moshisanshiduan1qidongfen", ByteField.Init(new SettingField(), "se_moshisanshiduan1qidongfen", 234, 2, "模式三时段1启动分", "分", Commands_Key_Parameters_Setting, "0101", 0, 59));
        map.put("se_moshisanshiduan1tingzhishi", ByteField.Init(new SettingField(), "se_moshisanshiduan1tingzhishi", 236, 2, "模式三时段1停止时", "时", Commands_Key_Parameters_Setting, "0102", 0, 23));
        map.put("se_moshisanshiduan1tingzhifen", ByteField.Init(new SettingField(), "se_moshisanshiduan1tingzhifen", 238, 2, "模式三时段1停止分", "分", Commands_Key_Parameters_Setting, "0103", 0, 59));
        map.put("se_moshisanshiduan1tingluwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan1tingluwendu", 240, 2, "模式三时段1停炉温度", "℃", Commands_Key_Parameters_Setting, "0104", 10, 100));
        map.put("se_moshisanshiduan1shiyongwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan1shiyongwendu", 242, 2, "模式三时段1使用温度", "℃", Commands_Key_Parameters_Setting, "0105", 7, 97));
        map.put("se_moshisanshiduan1mubiaowendu", ByteField.Init(new SettingField(), "se_moshisanshiduan1mubiaowendu", 244, 2, "模式三时段1目标温度", "℃", Commands_Key_Parameters_Setting, "0106", 10, 100));
        map.put("se_moshisanshiduan1guanbengwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan1guanbengwendu", 246, 2, "模式三时段1关泵温度", "℃", Commands_Key_Parameters_Setting, "0108", 10, 100));
        map.put("se_moshisanshiduan1kaibengwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan1kaibengwendu", 248, 2, "模式三时段1开泵温度", "℃", Commands_Key_Parameters_Setting, "0109", 10, 100));
        map.put("se_moshisanshiduan1zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshisanshiduan1zhuanhuowendu", 250, 2, "模式三时段1转火温度", "℃", Commands_Key_Parameters_Setting, "0107", 10, 100));
        map.put("se_moshisanshiduan2qidongshi", ByteField.Init(new SettingField(), "se_moshisanshiduan2qidongshi", 252, 2, "模式三时段2启动时", "时", Commands_Key_Parameters_Setting, "010a", 0, 23));
        map.put("se_moshisanshiduan2qidongfen", ByteField.Init(new SettingField(), "se_moshisanshiduan2qidongfen", 254, 2, "模式三时段2启动分", "分", Commands_Key_Parameters_Setting, "010b", 0, 59));
        map.put("se_moshisanshiduan2tingzhishi", ByteField.Init(new SettingField(), "se_moshisanshiduan2tingzhishi", 256, 2, "模式三时段2停止时", "时", Commands_Key_Parameters_Setting, "010c", 0, 23));
        map.put("se_moshisanshiduan2tingzhifen", ByteField.Init(new SettingField(), "se_moshisanshiduan2tingzhifen", 258, 2, "模式三时段2停止分", "分", Commands_Key_Parameters_Setting, "010d", 0, 59));
        map.put("se_moshisanshiduan2tingluwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan2tingluwendu", 260, 2, "模式三时段2停炉温度", "℃", Commands_Key_Parameters_Setting, "010e", 10, 100));
        map.put("se_moshisanshiduan2shiyongwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan2shiyongwendu", 262, 2, "模式三时段2使用温度", "℃", Commands_Key_Parameters_Setting, "010f", 7, 97));
        map.put("se_moshisanshiduan2mubiaowendu", ByteField.Init(new SettingField(), "se_moshisanshiduan2mubiaowendu", 264, 2, "模式三时段2目标温度", "℃", Commands_Key_Parameters_Setting, "0110", 10, 100));
        map.put("se_moshisanshiduan2guanbengwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan2guanbengwendu", 266, 2, "模式三时段2关泵温度", "℃", Commands_Key_Parameters_Setting, "0112", 10, 100));
        map.put("se_moshisanshiduan2kaibengwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan2kaibengwendu", 268, 2, "模式三时段2开泵温度", "℃", Commands_Key_Parameters_Setting, "0113", 10, 100));
        map.put("se_moshisanshiduan2zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshisanshiduan2zhuanhuowendu", 270, 2, "模式三时段2转火温度", "℃", Commands_Key_Parameters_Setting, "0111", 10, 100));
        map.put("se_moshisanshiduan3qidongshi", ByteField.Init(new SettingField(), "se_moshisanshiduan3qidongshi", 272, 2, "模式三时段3启动时", "时", Commands_Key_Parameters_Setting, "0114", 0, 23));
        map.put("se_moshisanshiduan3qidongfen", ByteField.Init(new SettingField(), "se_moshisanshiduan3qidongfen", 274, 2, "模式三时段3启动分", "分", Commands_Key_Parameters_Setting, "0115", 0, 59));
        map.put("se_moshisanshiduan3tingzhishi", ByteField.Init(new SettingField(), "se_moshisanshiduan3tingzhishi", 276, 2, "模式三时段3停止时", "时", Commands_Key_Parameters_Setting, "0116", 0, 23));
        map.put("se_moshisanshiduan3tingzhifen", ByteField.Init(new SettingField(), "se_moshisanshiduan3tingzhifen", 278, 2, "模式三时段3停止分", "分", Commands_Key_Parameters_Setting, "0117", 0, 59));
        map.put("se_moshisanshiduan3tingluwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan3tingluwendu", 280, 2, "模式三时段3停炉温度", "℃", Commands_Key_Parameters_Setting, "0118", 10, 100));
        map.put("se_moshisanshiduan3shiyongwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan3shiyongwendu", 282, 2, "模式三时段3使用温度", "℃", Commands_Key_Parameters_Setting, "0119", 7, 97));
        map.put("se_moshisanshiduan3mubiaowendu", ByteField.Init(new SettingField(), "se_moshisanshiduan3mubiaowendu", 284, 2, "模式三时段3目标温度", "℃", Commands_Key_Parameters_Setting, "011a", 10, 100));
        map.put("se_moshisanshiduan3guanbengwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan3guanbengwendu", 286, 2, "模式三时段3关泵温度", "℃", Commands_Key_Parameters_Setting, "011c", 10, 100));
        map.put("se_moshisanshiduan3kaibengwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan3kaibengwendu", 288, 2, "模式三时段3开泵温度", "℃", Commands_Key_Parameters_Setting, "011d", 10, 100));
        map.put("se_moshisanshiduan3zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshisanshiduan3zhuanhuowendu", 290, 2, "模式三时段3转火温度", "℃", Commands_Key_Parameters_Setting, "011b", 10, 100));
        map.put("se_moshisanshiduan4qidongshi", ByteField.Init(new SettingField(), "se_moshisanshiduan4qidongshi", 292, 2, "模式三时段4启动时", "时", Commands_Key_Parameters_Setting, "011e", 0, 23));
        map.put("se_moshisanshiduan4qidongfen", ByteField.Init(new SettingField(), "se_moshisanshiduan4qidongfen", 294, 2, "模式三时段4启动分", "分", Commands_Key_Parameters_Setting, "011f", 0, 59));
        map.put("se_moshisanshiduan4tingzhishi", ByteField.Init(new SettingField(), "se_moshisanshiduan4tingzhishi", 296, 2, "模式三时段4停止时", "时", Commands_Key_Parameters_Setting, "0120", 0, 23));
        map.put("se_moshisanshiduan4tingzhifen", ByteField.Init(new SettingField(), "se_moshisanshiduan4tingzhifen", 298, 2, "模式三时段4停止分", "分", Commands_Key_Parameters_Setting, "0121", 0, 59));
        map.put("se_moshisanshiduan4tingluwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan4tingluwendu", 300, 2, "模式三时段4停炉温度", "℃", Commands_Key_Parameters_Setting, "0122", 10, 100));
        map.put("se_moshisanshiduan4shiyongwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan4shiyongwendu", 302, 2, "模式三时段4使用温度", "℃", Commands_Key_Parameters_Setting, "0123", 7, 97));
        map.put("se_moshisanshiduan4mubiaowendu", ByteField.Init(new SettingField(), "se_moshisanshiduan4mubiaowendu", 304, 2, "模式三时段4目标温度", "℃", Commands_Key_Parameters_Setting, "0124", 10, 100));
        map.put("se_moshisanshiduan4guanbengwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan4guanbengwendu", 306, 2, "模式三时段4关泵温度", "℃", Commands_Key_Parameters_Setting, "0126", 10, 100));
        map.put("se_moshisanshiduan4kaibengwendu", ByteField.Init(new SettingField(), "se_moshisanshiduan4kaibengwendu", 308, 2, "模式三时段4开泵温度", "℃", Commands_Key_Parameters_Setting, "0127", 10, 100));
        map.put("se_moshisanshiduan4zhuanhuowendu", ByteField.Init(new SettingField(), "se_moshisanshiduan4zhuanhuowendu", 310, 2, "模式三时段4转火温度", "℃", Commands_Key_Parameters_Setting, "0125", 10, 100));
        map.put("se_zhouyigongzuomoshi", ByteField.Init(new BaseInfoField(), "se_zhouyigongzuomoshi", 312, 2, "周一工作模式", coms_moshi));
        map.put("se_zhouegongzuomoshi", ByteField.Init(new BaseInfoField(), "se_zhouegongzuomoshi", 314, 2, "周二工作模式", coms_moshi));
        map.put("se_zhousangongzuomoshi", ByteField.Init(new BaseInfoField(), "se_zhousangongzuomoshi", 316, 2, "周三工作模式", coms_moshi));
        map.put("se_zhousigongzuomoshi", ByteField.Init(new BaseInfoField(), "se_zhousigongzuomoshi", 318, 2, "周四工作模式", coms_moshi));
        map.put("se_zhouwugongzuomoshi", ByteField.Init(new BaseInfoField(), "se_zhouwugongzuomoshi", 320, 2, "周五工作模式", coms_moshi));
        map.put("se_zhouliugongzuomoshi", ByteField.Init(new BaseInfoField(), "se_zhouliugongzuomoshi", 322, 2, "周六工作模式", coms_moshi));
        map.put("se_zhourigongzuomoshi", ByteField.Init(new BaseInfoField(), "se_zhourigongzuomoshi", 324, 2, "周日工作模式", coms_moshi));
        map.put("se_chushuichaowenshezhizhi", ByteField.Init(new SettingField(), "se_chushuichaowenshezhizhi", 326, 2, "出水超温设置值", "℃", Commands_Key_Parameters_Setting, "012f", 10, 105));
        map.put("se_paiyanchaowenshezhizhi", ByteField.Init(new SettingField(), "se_paiyanchaowenshezhizhi", 328, 2, "排烟超温设置值", "℃", Commands_Key_Parameters_Setting, "0130", 10, 400));
        map.put("se_bushuibengmoshishezhizhi", ByteField.Init(new SettingField(), "se_bushuibengmoshishezhizhi", 330, 2, "补水泵模式设置值", "", Commands_Key_Parameters_Setting, "0131", 1, 2));
        map.put("se_xunhuanbengmoshishezhizhi", ByteField.Init(new SettingField(), "se_xunhuanbengmoshishezhizhi", 332, 2, "循环泵模式设置值", "", Commands_Key_Parameters_Setting, "0132", 1, 3));
        map.put("se_xunhuanbenghouyanshishezhizhi", ByteField.Init(new SettingField(), "se_xunhuanbenghouyanshishezhizhi", 334, 2, "循环泵后延时设置值", "min", Commands_Key_Parameters_Setting, "0133", 0, 30));
        map.put("se_ranshaofangshishezhizhi", ByteField.Init(new SettingField(), "se_ranshaofangshishezhizhi", 336, 2, "燃烧方式设置值"));
        map.put("se_xunhuanbengqianyanshishezhizhi", ByteField.Init(new SettingField(), "se_xunhuanbengqianyanshishezhizhi", 338, 2, "循环泵前延时设置值", "S", Commands_Key_Parameters_Setting, "0135", 0, 60));
        map.put("se_zhouqi", ByteField.Init(new SettingField(), "se_zhouqi", 340, 2, "周期", "", Commands_Key_Parameters_Setting, "0136", 1, 3600));
        map.put("se_P", ByteField.Init(new SettingField(), "se_P", 342, 2, "P", "", Commands_Key_Parameters_Setting, "0137", 1, 1000));
        map.put("se_I", ByteField.Init(new SettingField(), "se_I", 344, 2, "I", "", Commands_Key_Parameters_Setting, "0138", 1, 3600));
        map.put("se_D", ByteField.Init(new SettingField(), "se_D", 346, 2, "D", "", Commands_Key_Parameters_Setting, "0139", 0, 20));
        map.put("se_xingcheng", ByteField.Init(new SettingField(), "se_xingcheng", 348, 2, "行程", "", Commands_Key_Parameters_Setting, "013a", 10, 300));
        map.put("se_fangdongshangxianwendu", ByteField.Init(new SettingField(), "se_fangdongshangxianwendu", 352, 2, "防冻上限温度", "℃", Commands_Key_Parameters_Setting, "013c", 10, 30));
        map.put("se_fangdongxiaxianwendu", ByteField.Init(new SettingField(), "se_fangdongxiaxianwendu", 354, 2, "防冻下限温度", "℃", Commands_Key_Parameters_Setting, "013d", 7, 27));

        }
}
