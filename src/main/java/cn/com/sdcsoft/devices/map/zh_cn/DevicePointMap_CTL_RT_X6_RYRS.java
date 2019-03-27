package cn.com.sdcsoft.devices.map.zh_cn;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.CountShowField;
import cn.com.sdcsoft.devices.meta.FixedValueField;

import static cn.com.sdcsoft.devices.Device_CTL_RT_X6_RY.*;

// Created by 赵龙 on 2018/12/21
//命令：1.01030010001ac5c4
//
public class DevicePointMap_CTL_RT_X6_RYRS extends DevicePointMap {
   public static final String Key = "CTL_RT_X6_RYRS";
   public DevicePointMap_CTL_RT_X6_RYRS(){
       map.put(KEY_POINT_Add_SHUI_BENG, ByteField.Init(new CountField(), KEY_POINT_Add_SHUI_BENG,  "给水泵"));
       map.put(KEY_POINT_RAN_SHAO_QI, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI,  "燃烧器"));
       map.put(KEY_POINT_XUN_HUAN_BENG, ByteField.Init(new CountField(), KEY_POINT_XUN_HUAN_BENG, "循环泵"));

       map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "控制器状态", CTL_NJRT_Common_ValueMaps.coms_status));
       map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "运行时间","时"));
       map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, "运行天数", "天"));
       map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, "运行小时数", "时"));
       map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "燃料类型", 0, DevicePointMap.coms_power));
       map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "介质类型", 0, DevicePointMap.coms_media));

       map.put("de_bushuibeng_shoudong/zidong_", ByteField.Init(new DeviceField(), "de_bushuibeng_shoudong/zidong_", 49, 2, "补水泵",1, CTL_NJRT_Common_ValueMaps.coms_atuo));
       map.put("de_xunhuanbeng_zidong/shoudong_", ByteField.Init(new DeviceField(), "de_xunhuanbeng_zidong/shoudong_", 49, 2, "循环泵",3, CTL_NJRT_Common_ValueMaps.coms_atuo));
       map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 13, 2, "出水温度","℃"));
       map.put("mo_huishuiwendu", ByteField.Init(new MockField(), "mo_huishuiwendu", 15, 2, "回水温度","℃"));
       map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 17, 2, "排烟温度","℃"));

       map.put("ex_jixiandishuiweibao", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibao", 45, 2, "极限低水位报",0));
       map.put("ex_lubichaowen_changbiduankaibaojing_", ByteField.Init(new ExceptionField(), "ex_lubichaowen_changbiduankaibaojing_", 45, 2, "炉壁超温（常闭 断开报警）",1));
       map.put("ex_ranshaoqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhangbaojing", 45, 2, "燃烧器故障报警",2));
       map.put("ex_chushuiwenduchuanganqibaojing", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqibaojing", 45, 2, "出水温度传感器报警",3));
       map.put("ex_huishuiwenduchuanganqibaojing", ByteField.Init(new ExceptionField(), "ex_huishuiwenduchuanganqibaojing", 45, 2, "回水温度传感器报警",4));
       map.put("ex_paiyanwenduchuanganqibaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqibaojing", 45, 2, "排烟温度传感器报警",5));
       map.put("ex_chushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chushuiwendugaobaojing", 45, 2, "出水温度高报警",6));
       map.put("ex_shuiweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiguzhang", 45, 2, "水位传感器故障",7));
       map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "排烟温度高报警",8));
       map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "高水位报警",9));

       map.put("oc_jixiandishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_jixiandishuiweidianji", 5, 2, "极限低水位电极",0));
       map.put("oc_dishuiwei", ByteField.Init(new OpenCloseField(), "oc_dishuiwei", 5, 2, "低水位",1));
       map.put("oc_gaoshuiwei", ByteField.Init(new OpenCloseField(), "oc_gaoshuiwei", 5, 2, "高水位",2));
       map.put("oc_gaoshuiweibaojing", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojing", 5, 2, "高水位报警",3));
       map.put("oc_lubichaowen_changbiduankaibaojing_", ByteField.Init(new OpenCloseField(), "oc_lubichaowen_changbiduankaibaojing_", 5, 2, "炉壁超温（常闭 断开报警）",4));
       map.put("oc_NC", ByteField.Init(new OpenCloseField(), "oc_NC", 5, 2, "NC",5));
       map.put("oc_NC1", ByteField.Init(new OpenCloseField(), "oc_NC", 5, 2, "NC",6));
       map.put("oc_ranshaoqiguzhang", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiguzhang", 5, 2, "燃烧器故障",7));
       map.put("oc_NC2", ByteField.Init(new OpenCloseField(), "oc_NC", 5, 2, "NC",8));
       map.put("oc_NC3", ByteField.Init(new OpenCloseField(), "oc_NC", 5, 2, "NC",9));
       map.put("oc_NC4", ByteField.Init(new OpenCloseField(), "oc_NC", 5, 2, "NC",10));
       map.put(KEY_POINT_RAN_SHAO_QI_KONGZHI, ByteField.Init(new OpenCloseField(), KEY_POINT_RAN_SHAO_QI_KONGZHI, 9, 2, "燃烧器启停控制",0));
       map.put(KEY_POINT_RAN_SHAO_QI_STATUS, ByteField.Init(new OpenCloseField(), KEY_POINT_RAN_SHAO_QI_STATUS, 9, 2, "燃烧器负荷调节",1));
       map.put(KEY_POINT_Add_SHUI_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_1, 9, 2, "补水泵输出",2,coms_open_close));
       map.put(KEY_POINT_XUN_HUAN_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_XUN_HUAN_BENG_1, 9, 2, "循环泵输出",3,coms_open_close));
       map.put("oc_NC5", ByteField.Init(new OpenCloseField(), "oc_NC", 9, 2, "NC",4));
       map.put("oc_baojingzhuangtaishuchu", ByteField.Init(new OpenCloseField(), "oc_baojingzhuangtaishuchu", 9, 2, "报警状态输出",5));
       map.put("oc_NC6", ByteField.Init(new OpenCloseField(), "oc_NC", 9, 2, "NC",6));
   }
}
