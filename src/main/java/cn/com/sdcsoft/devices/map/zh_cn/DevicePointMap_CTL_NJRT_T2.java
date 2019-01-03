package cn.com.sdcsoft.devices.map.zh_cn;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.CountShowField;
import cn.com.sdcsoft.devices.meta.FixedValueField;

import static cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap.CTL_NJRT_Common_ValueMaps.*;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_NJRT_T2 extends DevicePointMap {
    public static final String Key = "CTL_NJRT_T2";


    public DevicePointMap_CTL_NJRT_T2() {

        map.put("_ranshaoqi", ByteField.Init(new CountField(), "_ranshaoqi",  "燃烧器"));
        map.put("_addshuibeng", ByteField.Init(new CountField(), "_addshuibeng",  "给水泵"));
        map.put("_lengningbeng", ByteField.Init(new CountField(), "_lengningbeng", "冷凝泵"));

        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "系统状态", coms_status));
        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "运行时间"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(KEY_BASE,new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(KEY_BASE,new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, "运行小时数", "时"));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_POWER, 87, 2, "燃料类型", coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_MEDIA, 89, 2, "介质类型", coms_media));

        map.put("oc_ranshaoqiqitingkongzhi", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiqitingkongzhi", 9, 2, "燃烧器启停控制", 0, coms_start_stop));
        map.put("oc_ranshaoqifuhetiaojie", ByteField.Init(new OpenCloseField(), "oc_ranshaoqifuhetiaojie", 9, 2, "燃烧器负荷调节", 1, coms_start_stop));
        map.put("oc_1_addshuibeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_1_addshuibeng_start_stop", 9, 2, "给水泵（主）控制", 3, coms_start_stop));
        map.put("oc_2_addshuibeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_2_addshuibeng_start_stop", 9, 2, "给水泵（备）控制", 4, coms_start_stop));
        map.put("oc_1_lengningxunhuanbeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_1_lengningxunhuanbeng_start_stop", 9, 2, "冷凝循环泵控制", 5, coms_start_stop));
        map.put("oc_baojingshuchu", ByteField.Init(new OpenCloseField(), "oc_baojingshuchu", 9, 2, "报警输出", 6, coms_start_stop));

        map.put("oc_jishuibengzhubei", ByteField.Init(new OpenCloseField(), "oc_jishuibengzhubei", 49, 2, "给水泵主备", 0, coms_master));
        map.put("oc_jishuibengshouzi", ByteField.Init(new OpenCloseField(), "oc_jishuibengshouzi", 49, 2, "给水泵手自", 1, coms_atuo));
        map.put("oc_jienengxunhuanbengshouzi", ByteField.Init(new OpenCloseField(), "oc_jienengxunhuanbengshouzi", 49, 2, "节能循环泵手自", 3, coms_master));

        map.put("ex_shuiweichuanganqicut", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqicut", 45, 2, "水位传感器断路", 3));
        map.put("ex_shuiweichuanganqishort", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqishort", 45, 2, "水位传感器短路", 4));
        map.put("ex_jixiandishuiweibaojingdianliu", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojingdianliu", 45, 2, "极限低水位报警（电流）", 5));
        map.put("ex_gaoshuiweibaojingdianliu", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojingdianliu", 45, 2, "高水位报警（电流）", 6));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "排烟温度高报警", 7));
        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "极限低水位报警", 8));
        map.put("ex_shuiweidianjiluojicuo", ByteField.Init(new ExceptionField(), "ex_shuiweidianjiluojicuo", 45, 2, "水位电极逻辑错", 9));
        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 45, 2, "低水位报警", 10));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "高水位报警", 11));
        map.put("ex_bianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhang", 45, 2, "变频器故障", 12));
        map.put("ex_chaoyabaojingkongzhiqi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojingkongzhiqi", 45, 2, "超压报警（控制器）", 13));
        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 45, 2, "燃气压力低报警", 14));
        map.put("ex_ranqiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaligaobaojing", 45, 2, "燃气压力高报警", 15));
        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 47, 2, "燃气泄漏报警", 0));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 47, 2, "燃烧器故障", 1));

        map.put("mo_lengningqiyanwen", ByteField.Init(new MockField(), "mo_lengningqiyanwen", 13, 2, "冷凝器烟温", "℃"));
        map.put("mo_jishuiwendu", ByteField.Init(new MockField(), "mo_jishuiwendu", 15, 2, "给水温度", "℃"));
        map.put("mo_shuiweixinhao", ByteField.Init(new MockField(), "mo_shuiweixinhao", 19, 2, "水位", "%"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 21, 2, "排烟温度", "℃"));
        map.put("mo_jienengqiyanwen", ByteField.Init(new MockField(), "mo_jienengqiyanwen", 23, 2, "节能器烟温", "℃"));
    }
}
