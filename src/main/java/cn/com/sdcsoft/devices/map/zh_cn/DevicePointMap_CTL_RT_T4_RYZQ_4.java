package cn.com.sdcsoft.devices.map.zh_cn;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.CountShowField;
import cn.com.sdcsoft.devices.meta.FixedValueField;

import static cn.com.sdcsoft.devices.Device_CTL_RT_T4.*;
import static cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap.CTL_NJRT_Common_ValueMaps.*;
// CTL_RT_T4_RYZQ_4
// CTL_NJRT_X6_RanYouReShui
// 长度 57
//01030010001ac5c4
public class DevicePointMap_CTL_RT_T4_RYZQ_4 extends DevicePointMap_CTL_RT_T4_RYZQ {
    public static final String Key = "CTL_RT_T4_RYZQ_4";
//
    public DevicePointMap_CTL_RT_T4_RYZQ_4() {
        map.put(KEY_POINT_Add_SHUI_BENG, ByteField.Init(new CountField(), KEY_POINT_Add_SHUI_BENG,  "给水泵"));
        map.put(KEY_POINT_RAN_SHAO_QI, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI, "燃烧器"));

        map.put(KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), KEY_POINT_SYSTEM_STATUS, 3, 2, "控制器状态", coms_status));
        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "运行时间","时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, "运行小时数", "时"));
        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, 0, 0, "燃料类型", coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, 1, 0, "介质类型", coms_media));

        map.put("de_jishuibeng_zhu/bei_", ByteField.Init(new DeviceField(), "de_jishuibeng_zhu/bei_", 49, 2, "给水泵",0, coms_master));
        map.put("de_jishuibeng_shoudong/zidong_", ByteField.Init(new DeviceField(), "de_jishuibeng_shoudong/zidong_", 49, 2, "给水泵",1, coms_atuo));

        map.put("ex_zhengqiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiyalibiansongqiguzhang", 45, 2, "蒸汽压力变送器故障",0));
        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 45, 2, "排烟温度传感器故障",1));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "排烟温度高报警",2));
        map.put("ex_shuiweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiguzhang", 45, 2, "水位传感器故障",3));
        map.put("ex_chaoyabaojing", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing", 45, 2, "超压报警",4));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "高水位报警",5));
        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "极限低水位报警",6));
        map.put("ex_bianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhang", 45, 2, "变频器故障",7));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 45, 2, "燃烧器故障",8));
        map.put("ex_qingranshaoqifuwei", ByteField.Init(new ExceptionField(), "ex_qingranshaoqifuwei", 45, 2, "请燃烧器复位",9));
        map.put("ex_xitongguzhang", ByteField.Init(new ExceptionField(), "ex_xitongguzhang", 45, 2, "系统故障",10));
        map.put("ex_cunchuqiguzhang", ByteField.Init(new ExceptionField(), "ex_cunchuqiguzhang", 45, 2, "存储器故障",11));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 13, 2, "蒸汽压力","Mpa"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 15, 2, "排烟温度","℃"));
        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 17, 2, "蒸汽温度","℃"));
        map.put("mo_qibaoshuiwei", ByteField.Init(new MockField(), "mo_qibaoshuiwei", 19, 2, "汽包水位","mm"));

        map.put("oc_jixiandishuiweidianji_changbiduankaibaojing_", ByteField.Init(new OpenCloseField(), "oc_jixiandishuiweidianji_changbiduankaibaojing_", 5, 2, "极限低水位电极（常闭 断开报警）",0,coms_open_close));
        map.put("oc_gaoshuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojingdianji", 5, 2, "高水位报警电极",1,coms_open_close));
        map.put("oc_bianpinqiguzhangfanhuixinhao", ByteField.Init(new OpenCloseField(), "oc_bianpinqiguzhangfanhuixinhao", 5, 2, "变频器故障返回信号",2,coms_open_close));
        map.put("oc_chaoyabaojing", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojing", 5, 2, "超压报警",9,coms_open_close));
        map.put("oc_ranshaoqiguzhang", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiguzhang", 5, 2, "燃烧器故障",10,coms_open_close));
        map.put(KEY_POINT_RAN_SHAO_QI_KONGZHI, ByteField.Init(new OpenCloseField(), KEY_POINT_RAN_SHAO_QI_KONGZHI, 9, 2, "燃烧器启停控制",0,coms_open_close));
        map.put("oc_bidiaozeng", ByteField.Init(new OpenCloseField(), "oc_bidiaozeng", 9, 2, "比调增",1,coms_open_close));
        map.put("oc_bidiaojian", ByteField.Init(new OpenCloseField(), "oc_bidiaojian", 9, 2, "比调减",2,coms_open_close));
        map.put(KEY_POINT_Add_SHUI_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_1, 9, 2, "给水泵控制（主泵)",3,coms_open_close));
        map.put(KEY_POINT_Add_SHUI_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_2, 9, 2, "给水泵控制（备泵）",4,coms_open_close));
        map.put("oc_baojingshuchu", ByteField.Init(new OpenCloseField(), "oc_baojingshuchu", 9, 2, "报警输出",6,coms_open_close));
    }
}
