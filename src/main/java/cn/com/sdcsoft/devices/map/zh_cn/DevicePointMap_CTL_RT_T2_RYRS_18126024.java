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
//01030010002F05D3
public class DevicePointMap_CTL_RT_T2_RYRS_18126024 extends DevicePointMap_CTL_RT_T2{
    public static final String Key = "CTL_RT_T2_RYRS_18126024";
    static final String Commands_Key_Parameters_Setting = "参数设置";
    static final String Commands_Key_System_Ctl = "系统控制";

private static HashMap<Integer, String> coms_status = new HashMap<Integer, String>() {
    {
        put(0, "待命");
        put(1, "报警");
        put(2, "运行");
    }
};
    private static HashMap<Integer, String> coms_guolu = new HashMap<Integer, String>() {
        {
            put(0, "常压");
            put(1, "承压");
        }
    };
    private static HashMap<Integer, String> coms_ranshaoqi = new HashMap<Integer, String>() {
        {
            put(0, "内置比调");
            put(1, "两段火力");
        }
    };
    private static  HashMap<Integer, String> coms_bushuibeng = new HashMap<Integer, String>() {
        {
            put(0, "4电极");
            put(1, "电接点压力表");
        }
    };
    private static HashMap<Integer, String> coms_xunhuanbeng = new HashMap<Integer, String>() {
        {
            put(0, "出水温度");
            put(1, "回水温度");
            put(2, "燃烧器");
        }
    };
    public DevicePointMap_CTL_RT_T2_RYRS_18126024() {
        commandsMap.put(Commands_Key_Parameters_Setting,null);
        commandsMap.put(Commands_Key_System_Ctl,null);

        map.put(KEY_POINT_RAN_SHAO_QI, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI,  "燃烧器"));
        map.put(KEY_POINT_Add_SHUI_BENG, ByteField.Init(new CountField(), KEY_POINT_Add_SHUI_BENG,  "补水泵"));
        map.put(KEY_POINT_LENG_NING_BENG, ByteField.Init(new CountField(), KEY_POINT_LENG_NING_BENG, "循环泵"));

        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new SystemStatusField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "系统状态", coms_status, Commands_Key_System_Ctl, "00a0", 1, 2));
        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "运行时间","时"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, "运行小时数", "时"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "燃料类型", 0, DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "介质类型", 0, DevicePointMap.coms_media));

        map.put("oc_queshuidianji", ByteField.Init(new OpenCloseField(), "oc_queshuidianji", 5, 2, "缺水电极",0,coms_open_close));
        map.put("oc_dishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_dishuiweidianji", 5, 2, "低水位电极",1,coms_open_close));
        map.put("oc_gaoshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweidianji", 5, 2, "高水位电极",2,coms_open_close));
        map.put("oc_gaoshuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojingdianji", 5, 2, "高水位报警电极",3,coms_open_close));
        map.put("oc_dianjiedianyalibiaodizhen", ByteField.Init(new OpenCloseField(), "oc_dianjiedianyalibiaodizhen", 5, 2, "电接点压力表低针",4,coms_open_close));
        map.put("oc_dianjiedianyalibiaogaozhen", ByteField.Init(new OpenCloseField(), "oc_dianjiedianyalibiaogaozhen", 5, 2, "电接点压力表高针",5,coms_open_close));

        map.put("oc_chaoyabaojing", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojing", 5, 2, "超压报警",9,coms_open_close));
        map.put("oc_ranshaoqiguzhang", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiguzhang", 5, 2, "燃烧器故障",10,coms_open_close));
        map.put("oc_ranqixieloubaojing", ByteField.Init(new OpenCloseField(), "oc_ranqixieloubaojing", 5, 2, "燃气泄漏报警",11,coms_open_close));
        map.put("oc_ranqiyalidibaojing", ByteField.Init(new OpenCloseField(), "oc_ranqiyalidibaojing", 5, 2, "燃气压力低报警",12,coms_open_close));
        map.put(KEY_POINT_RAN_SHAO_QI_KONGZHI, ByteField.Init(new OpenCloseField(), KEY_POINT_RAN_SHAO_QI_KONGZHI, 9, 2, "燃烧器启停控制",0,coms_open_close, Commands_Key_System_Ctl, "00a0", 5, 8));
        map.put(KEY_POINT_RAN_SHAO_QI_STATUS, ByteField.Init(new OpenCloseField(), KEY_POINT_RAN_SHAO_QI_STATUS, 0, 0, "燃烧器调节",coms_ranshaoqi_status));

        map.put("oc_ranshaoqifuhediaojie/zengdadiaojie", ByteField.Init(new OpenCloseField(), "oc_ranshaoqifuhediaojie/zengdadiaojie", 9, 2, "燃烧器负荷增大调节",1));
        map.put("oc_jianxiaodiaojie", ByteField.Init(new OpenCloseField(), "oc_jianxiaodiaojie", 9, 2, "减小调节",2));
        map.put(KEY_POINT_Add_SHUI_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_1, 9, 2, "补水泵控制（主）",3,coms_open_close, Commands_Key_System_Ctl, "00a0", 100, 101));
        map.put(KEY_POINT_Add_SHUI_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_2, 9, 2, "补水泵控制（备）",4));
        map.put(KEY_POINT_LENG_NING_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_LENG_NING_BENG_1, 9, 2, "循环泵控制（主）",5,coms_open_close, Commands_Key_System_Ctl, "00a0", 106, 107));
        map.put(KEY_POINT_LENG_NING_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_LENG_NING_BENG_2, 9, 2, "循环泵控制（备）",6));

        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 13, 2, "出水温度","℃"));
        map.put("mo_huishuiwendu", ByteField.Init(new MockField(), "mo_huishuiwendu", 15, 2, "回水温度","℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 21, 2, "排烟温度","℃"));

        map.put("de_jishuibeng_zhu/bei_", ByteField.Init(new DeviceField(), "de_jishuibeng_zhu/bei_", 49, 2, "补水泵",0, coms_master, Commands_Key_System_Ctl, "00a0", 104, 105));
        map.put("de_jishuibeng_shoudong/zidong_", ByteField.Init(new DeviceField(), "de_jishuibeng_shoudong/zidong_", 49, 2, "补水泵",1, coms_atuo, Commands_Key_System_Ctl, "00a0", 102, 103));
        map.put("de_xunhuanbeng_zhu/bei_", ByteField.Init(new DeviceField(), "de_xunhuanbeng_zhu/bei_", 49, 2, "循环泵",2, coms_atuo, Commands_Key_System_Ctl, "00a0", 110, 111));
        map.put("de_xunhuanbeng_zidong/shoudong_", ByteField.Init(new DeviceField(), "de_xunhuanbeng_zidong/shoudong_", 49, 2, "循环泵",3, coms_atuo, Commands_Key_System_Ctl, "00a0", 108, 109));

        map.put("ex_chushuiwenduchuanganqiduanlu1", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiduanlu1", 45, 2, "出水温度传感器断路",0));
        map.put("ex_chushuiwenduchuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiduanlu", 45, 2, "出水温度传感器短路",1));
        map.put("ex_chushuiwendugaobaojing_", ByteField.Init(new ExceptionField(), "ex_chushuiwendugaobaojing_", 45, 2, "出水温度高报警",2));
        map.put("ex_huishuiwenduchuanganqiduanlu1", ByteField.Init(new ExceptionField(), "ex_huishuiwenduchuanganqiduanlu1", 45, 2, "回水温度传感器断路",3));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "排烟温度高报警",4));
        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "极限低水位报警",5));
        map.put("ex_shuiweidianjiluojicuo", ByteField.Init(new ExceptionField(), "ex_shuiweidianjiluojicuo", 45, 2, "水位电极逻辑错",6));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "高水位报警",7));
        map.put("ex_dianjiedianyalibiaoduanlu", ByteField.Init(new ExceptionField(), "ex_dianjiedianyalibiaoduanlu", 45, 2, "电接点压力表短路",8));
        map.put("ex_chaoyabaojing_kongzhiqi_", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_kongzhiqi_", 45, 2, "超压报警（控制器）",9));
        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 45, 2, "燃气压力低报警",10));
        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 47, 2, "燃气泄漏报警",11));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 47, 2, "燃烧器故障",12));

        map.put("se_paiyanchaowen", ByteField.Init(new SettingField(), "se_paiyanchaowen", 67, 2, "排烟超温","℃", Commands_Key_Parameters_Setting, "0120", 100, 400));
        map.put("se_lushuichaowen", ByteField.Init(new SettingField(), "se_lushuichaowen", 69, 2, "炉水超温","℃", Commands_Key_Parameters_Setting, "0121", 10, 105));
        map.put("se_kaibengwendu", ByteField.Init(new SettingField(), "se_kaibengwendu", 71, 2, "开泵温度","℃", Commands_Key_Parameters_Setting, "0122", 10, 100));
        map.put("se_guanbengwendu", ByteField.Init(new SettingField(), "se_guanbengwendu", 73, 2, "关泵温度","℃", Commands_Key_Parameters_Setting, "0123", 10, 100));
        map.put("se_xunhuanbenghouyanshi", ByteField.Init(new SettingField(), "se_xunhuanbenghouyanshi", 75, 2, "循环泵后延时","分钟", Commands_Key_Parameters_Setting, "0124", 0, 30));
        map.put("se_ranshaozhouqi", ByteField.Init(new SettingField(), "se_ranshaozhouqi", 77, 2, "燃烧  周期","", Commands_Key_Parameters_Setting, "0125", 1, 3600));
        map.put("se_ranshaoP", ByteField.Init(new SettingField(), "se_ranshaoP", 79, 2, "燃烧  P","", Commands_Key_Parameters_Setting, "0126", 1, 1000));
        map.put("se_ranshaoI", ByteField.Init(new SettingField(), "se_ranshaoI", 81, 2, "燃烧  I","", Commands_Key_Parameters_Setting, "0127", 1, 3600));
        map.put("se_ranshaoD", ByteField.Init(new SettingField(), "se_ranshaoD", 83, 2, "燃烧  D","", Commands_Key_Parameters_Setting, "0128", 0, 20));
        map.put("se_xingcheng", ByteField.Init(new SettingField(), "se_xingcheng", 85, 2, "行程","", Commands_Key_Parameters_Setting, "0129", 10, 300));
        map.put("o_guoluleixing", ByteField.Init(new BaseInfoField(), "o_guoluleixing", 87, 2, "锅炉类型",coms_guolu));
        map.put("o_ranshaoqigongzuofangshi", ByteField.Init(new BaseInfoField(), "o_ranshaoqigongzuofangshi", 89, 2, "燃烧器工作方式",coms_ranshaoqi));
        map.put("o_bushuibengkongzhifangshi", ByteField.Init(new BaseInfoField(), "o_bushuibengkongzhifangshi", 91, 2, "补水泵控制方式",coms_bushuibeng));
        map.put("o_xunhuanbengkongzhifangshi", ByteField.Init(new BaseInfoField(), "o_xunhuanbengkongzhifangshi", 93, 2, "循环泵控制方式",coms_xunhuanbeng));

    }
}
