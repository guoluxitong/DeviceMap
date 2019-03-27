package cn.com.sdcsoft.devices.map.zh_cn;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.CountShowField;
import cn.com.sdcsoft.devices.meta.FixedValueField;

import java.util.HashMap;

import static cn.com.sdcsoft.devices.Device_CTL_RT_T2.*;
import static cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap.CTL_NJRT_Common_ValueMaps.*;

public class DevicePointMap_CTL_RT_T2_RYZQ_YLBSQ_180839008 extends DevicePointMap_CTL_RT_T2_RYZQ {
    public static final String Key = "CTL_RT_T2_RYZQ_YLBSQ_180839008";
//01030010003445d8
    public DevicePointMap_CTL_RT_T2_RYZQ_YLBSQ_180839008() {

        HashMap<Integer, String> coms_status = new HashMap() {
            {
                put(0, "待命");
                put(1, "报警");
                put(2, "运行");

            }
        };
        map.put(KEY_POINT_RAN_SHAO_QI, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI,  "燃烧器"));
        map.put(KEY_POINT_Add_SHUI_BENG, ByteField.Init(new CountField(), KEY_POINT_Add_SHUI_BENG,  "给水泵"));
        map.put(KEY_POINT_LENG_NING_BENG, ByteField.Init(new CountField(), KEY_POINT_LENG_NING_BENG, "冷凝泵"));

        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "系统状态", coms_status));
        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "运行时间","时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, "运行小时数", "时"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "燃料类型", 0, DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "介质类型", 1, DevicePointMap.coms_media));

        map.put("oc_queshuidianji", ByteField.Init(new OpenCloseField(), "oc_queshuidianji", 5, 2, "缺水电极",0,coms_open_close));
        map.put("oc_dishuiweibaojingdianji_6dianjiteyou_", ByteField.Init(new OpenCloseField(), "oc_dishuiweibaojingdianji_6dianjiteyou_", 5, 2, "低水位报警电极（6电极特有）",1,coms_open_close));
        map.put("oc_dishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_dishuiweidianji", 5, 2, "低水位电极",2,coms_open_close));
        map.put("oc_zhongshuiweidianji_6dianjiteyou_", ByteField.Init(new OpenCloseField(), "oc_zhongshuiweidianji_6dianjiteyou_", 5, 2, "中水位电极（6 电极特有）",3,coms_open_close));
        map.put("oc_gaoshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweidianji", 5, 2, "高水位电极",4,coms_open_close));
        map.put("oc_gaoshuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojingdianji", 5, 2, "高水位报警电极",5,coms_open_close));
        map.put("oc_bianpinqiguzhangbaojing", ByteField.Init(new OpenCloseField(), "oc_bianpinqiguzhangbaojing", 5, 2, "变频器故障报警",6,coms_open_close));

        map.put("oc_chaoyabaojing", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojing", 5, 2, "超压报警",9,coms_open_close));
        map.put("oc_ranshaoqiguzhang", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiguzhang", 5, 2, "燃烧器故障",10,coms_open_close));
        map.put("oc_ranqixieloubaojing", ByteField.Init(new OpenCloseField(), "oc_ranqixieloubaojing", 5, 2, "燃气泄漏报警",11,coms_open_close));
        map.put("oc_ranqiyalidibaojing", ByteField.Init(new OpenCloseField(), "oc_ranqiyalidibaojing", 5, 2, "燃气压力低报警",12,coms_open_close));
        map.put("oc_ranqiyaligaobaojing", ByteField.Init(new OpenCloseField(), "oc_ranqiyaligaobaojing", 5, 2, "燃气压力高报警",13,coms_open_close));
        map.put(KEY_POINT_RAN_SHAO_QI_KONGZHI, ByteField.Init(new OpenCloseField(), KEY_POINT_RAN_SHAO_QI_KONGZHI, 9, 2, "燃烧器启停控制",0,coms_open_close));
        map.put(KEY_POINT_RAN_SHAO_QI_STATUS, ByteField.Init(new OpenCloseField(), KEY_POINT_RAN_SHAO_QI_STATUS, 0, 0, "燃烧器调节",coms_ranshaoqi_status));

        map.put("oc_ranshaoqifuhediaojie/zengdadiaojie", ByteField.Init(new OpenCloseField(), "oc_ranshaoqifuhediaojie/zengdadiaojie", 9, 2, "燃烧器负荷增大调节",1));
        map.put("oc_jianxiaodiaojie", ByteField.Init(new OpenCloseField(), "oc_jianxiaodiaojie", 9, 2, "减小调节",2));
        map.put(KEY_POINT_Add_SHUI_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_1, 9, 2, "给水泵控制（主）",3,coms_open_close));
        map.put(KEY_POINT_Add_SHUI_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_2, 9, 2, "给水泵控制（备）",4,coms_open_close));
        map.put(KEY_POINT_LENG_NING_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_LENG_NING_BENG_1, 9, 2, "冷凝循环泵控制",5,coms_open_close));
        map.put("oc_baojingzhuangtaishuchu", ByteField.Init(new OpenCloseField(), "oc_baojingzhuangtaishuchu", 9, 2, "报警状态输出",6,coms_open_close));

        map.put("mo_lengningqiyanwen", ByteField.Init(new MockField(), "mo_lengningqiyanwen", 13, 2, "冷凝器烟温","℃"));
        map.put("mo_jishuiwendu", ByteField.Init(new MockField(), "mo_jishuiwendu", 15, 2, "给水温度","℃"));
        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 17, 2, "蒸汽压力","Mpa",100));
        map.put("mo_shuiweixinhao", ByteField.Init(new MockField(), "mo_shuiweixinhao", 19, 2, "水位信号","%"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 21, 2, "排烟温度","℃"));
        map.put("mo_jienengqiyanwen", ByteField.Init(new MockField(), "mo_jienengqiyanwen", 23, 2, "节能器烟温","℃"));

        map.put("de_jishuibeng_zhu/bei_", ByteField.Init(new DeviceField(), "de_jishuibeng_zhu/bei_", 49, 2, "给水泵",0, coms_master));
        map.put("de_jishuibeng_shoudong/zidong_", ByteField.Init(new DeviceField(), "de_jishuibeng_shoudong/zidong_", 49, 2, "给水泵",1, coms_atuo));
        map.put("de_lengningxunhuanbeng_zidong/shoudong_", ByteField.Init(new DeviceField(), "de_lengningxunhuanbeng_zidong/shoudong_", 49, 2, "冷凝循环泵",3, coms_atuo));

        map.put("ex_yalibiansongqiduanlu1", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiduanlu1", 45, 2, "压力变送器断路",0));
        map.put("ex_yalibiansongqiduanlu", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiduanlu", 45, 2, "压力变送器短路",1));
        map.put("ex_chaoyabaojing_biansongqi_", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_biansongqi_", 45, 2, "超压报警（变送器）",2));
        map.put("ex_shuiweichuanganqiduanlu1", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiduanlu1", 45, 2, "水位传感器断路",3));
        map.put("ex_shuiweichuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiduanlu", 45, 2, "水位传感器短路",4));
        map.put("ex_jixiandishuiweibaojing_dianliu_", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing_dianliu_", 45, 2, "极限低水位报警（电流）",5));
        map.put("ex_gaoshuiweibaojing_dianliu_", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing_dianliu_", 45, 2, "高水位报警（电流）",6));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "排烟温度高报警",7));
        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "极限低水位报警",8));
        map.put("ex_shuiweidianjiluojicuo", ByteField.Init(new ExceptionField(), "ex_shuiweidianjiluojicuo", 45, 2, "水位电极逻辑错",9));
        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 45, 2, "低水位报警",10));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "高水位报警",11));
        map.put("ex_bianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhang", 45, 2, "变频器故障",12));
        map.put("ex_chaoyabaojing_kongzhiqi_", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_kongzhiqi_", 45, 2, "超压报警（控制器）",13));
        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 45, 2, "燃气压力低报警",14));
        map.put("ex_ranqiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaligaobaojing", 45, 2, "燃气压力高报警",15));
        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 47, 2, "燃气泄漏报警",0));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 47, 2, "燃烧器故障",1));


    }
}
