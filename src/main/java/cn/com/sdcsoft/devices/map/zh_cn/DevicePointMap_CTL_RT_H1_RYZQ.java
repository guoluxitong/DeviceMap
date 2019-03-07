package cn.com.sdcsoft.devices.map.zh_cn;


import cn.com.sdcsoft.devices.Device_CTL_RT_H1_RY;
import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.CountShowField;
import cn.com.sdcsoft.devices.meta.FixedValueField;

import static cn.com.sdcsoft.devices.Device_CTL_RT_H1_RY.*;
import static cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap.CTL_NJRT_Common_ValueMaps.*;

/**
 * Created by 田斌 on 2018/12/10 0010.
 */
//命令：01030010004985f9
public class DevicePointMap_CTL_RT_H1_RYZQ extends DevicePointMap {
    static final String Commands_Key_Parameters_Setting = "参数设置";
    static final String Commands_Key_System_Ctl = "系统控制";
    public DevicePointMap_CTL_RT_H1_RYZQ(){

        commandsMap.put(Commands_Key_Parameters_Setting,null);
        commandsMap.put(Commands_Key_System_Ctl,null);
        /**
         * 计算属性（不显示）
         */
        map.put(KEY_POINT_Add_SHUI_BENG, ByteField.Init(new CountField(), KEY_POINT_Add_SHUI_BENG,  "给水泵"));
        map.put(KEY_POINT_RAN_SHAO_QI, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI,  "燃烧器"));



        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "控制器状态", CTL_NJRT_Common_ValueMaps.coms_status));
        //运行天数与运行小时数需要进行运算
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, "运行天数", "天"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, "运行小时数", "时"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "燃料类型", 0, DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "介质类型", 1, DevicePointMap.coms_media));

        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "累计燃烧时间","时"));

        map.put("de_jishuibengzhubei", ByteField.Init(new DeviceField(), "de_jishuibengzhubei", 49, 2, "给水泵",0,CTL_NJRT_Common_ValueMaps.coms_master));
        map.put("de_jishuibengshouzi", ByteField.Init(new DeviceField(), "de_jishuibengshouzi", 49, 2, "给水泵",1,CTL_NJRT_Common_ValueMaps.coms_atuo));
        map.put(KEY_POINT_Add_SHUI_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_1, 9, 2,  "给水泵主控制",3,coms_open_close));
        map.put(KEY_POINT_Add_SHUI_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_2, 9, 2, "给水泵备控制", 4, coms_open_close));

        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "极限低水位报警",0));
        map.put("ex_zhengqiyalibiansongqiduanlu", ByteField.Init(new ExceptionField(), "ex_zhengqiyalibiansongqiduanlu", 45, 2, "蒸汽压力变送器断路",1));
        map.put("ex_zhengqiyalibiansongqiduanlu1", ByteField.Init(new ExceptionField(), "ex_zhengqiyalibiansongqiduanlu", 45, 2, "蒸汽压力变送器短路",2));
        map.put("ex_chaoyabaojing_biansongqi_", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_biansongqi_", 45, 2, "超压报警（变送器）",3));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "排烟温度高报警",4));
        map.put("ex_chaoyabaojing_kongzhiqi_", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_kongzhiqi_", 45, 2, "超压报警（控制器）",5));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 45, 2, "燃烧器故障",6));
        map.put("ex_ranqiyalidi", ByteField.Init(new ExceptionField(), "ex_ranqiyalidi", 45, 2, "燃气压力低",7));
        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 45, 2, "燃气泄漏报警",8));
        map.put("ex_shuiweidianjiluojicuo", ByteField.Init(new ExceptionField(), "ex_shuiweidianjiluojicuo", 45, 2, "水位电极逻辑错",9));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "高水位报警",10));
        map.put("ex_paiyanwenduchuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiduanlu", 45, 2, "排烟温度传感器断路",11));
        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 45, 2, "低水位报警",12));
        map.put("ex_bianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhangbaojing", 45, 2, "变频器故障报警",13));
        map.put("ex_shuiweichuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiduanlu", 45, 2, "水位传感器断路",14));
        map.put("ex_shuiweichuanganqiduanlu1", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiduanlu", 45, 2, "水位传感器短路",15));
        map.put("ex_jixiandishuiweibaojing4-20mA", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing4-20mA", 47, 2, "极限低水位报警4-20mA",1));
        map.put("ex_gaoshuiweibaojing4-20mA", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing4-20mA", 47, 2, "高水位报警4-20mA",2));

        map.put("oc_jixiandishuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_jixiandishuiweibaojingdianji", 5, 2, "极限低水位报警电极",0,coms_open_close));
        map.put("oc_dishuiweibaojingdianji_6dianjiteyou_", ByteField.Init(new OpenCloseField(), "oc_dishuiweibaojingdianji_6dianjiteyou_", 5, 2, "低水位报警电极（6 电极特有）",1,coms_open_close));
        map.put("oc_dishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_dishuiweidianji", 5, 2, "低水位电极",2,coms_open_close));
        map.put("oc_zhongshuiweidianji_6dianjiteyou_", ByteField.Init(new OpenCloseField(), "oc_zhongshuiweidianji_6dianjiteyou_", 5, 2, "中水位电极（6 电极特有）",3,coms_open_close));
        map.put("oc_gaoshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweidianji", 5, 2, "高水位电极",4,coms_open_close));
        map.put("oc_gaoshuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojingdianji", 5, 2, "高水位报警电极",5,coms_open_close));
        map.put("oc_bianpinqiguzhangbaojing", ByteField.Init(new OpenCloseField(), "oc_bianpinqiguzhangbaojing", 5, 2, "变频器故障报警",6,coms_open_close));
        map.put("oc_fuhediaojiekongzhi_yalikongzhiqifangshi_", ByteField.Init(new OpenCloseField(), "oc_fuhediaojiekongzhi_yalikongzhiqifangshi_", 5, 2, "负荷调节控制（压力控制器方式）",7,coms_open_close));
        map.put("oc_qitingkongzhi_yalikongzhiqifangshi_", ByteField.Init(new OpenCloseField(), "oc_qitingkongzhi_yalikongzhiqifangshi_", 5, 2, "启停控制（压力控制器方式）",8,coms_open_close));
        map.put("oc_chaoyabaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojingxinhao", 5, 2, "超压报警信号",9,coms_open_close));
        map.put("oc_ranshaoqiguzhangxinhao", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiguzhangxinhao", 5, 2, "燃烧器故障信号",10,coms_open_close));
        map.put("oc_ranqiyaliyichangbaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_ranqiyaliyichangbaojingxinhao", 5, 2, "燃气压力异常报警信号",11,coms_open_close));
        map.put("oc_ranqixieloubaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_ranqixieloubaojingxinhao", 5, 2, "燃气泄漏报警信号",12,coms_open_close));

        map.put(KEY_POINT_RAN_SHAO_QI_KONGZHI, ByteField.Init(new DeviceField(), KEY_POINT_RAN_SHAO_QI_KONGZHI, 9, 2, "燃烧器启停控制",0,coms_open_close));
        //map.put(KEY_POINT_RAN_SHAO_QI_STATUS, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI_STATUS, "燃烧器状态"));
      /*  map.put("oc_ranshaoqibilijianda", ByteField.Init(new OpenCloseField(), "oc_ranshaoqibilijianda", 9, 2, "燃烧器比例增加", 1, coms_open_close));
        map.put("oc_ranshaoqibilijianxiao", ByteField.Init(new OpenCloseField(), "oc_ranshaoqibilijianxiao", 9, 2, "燃烧器比例减小", 2, coms_open_close));*/
        //燃烧器调节需要将两个点位合成一个进行运算
        map.put("oc_ranshaoqifuhediaojie/zengdadiaojie", ByteField.Init(new OpenCloseField(), "oc_ranshaoqifuhediaojie/zengdadiaojie", 9, 2, "燃烧器负荷调节/增大调节",1,coms_open_close));
        map.put("oc_jianxiaodiaojie", ByteField.Init(new OpenCloseField(), "oc_jianxiaodiaojie", 9, 2, "减小调节",2,coms_open_close));
        map.put("oc_baojingzhuangtaishuchu", ByteField.Init(new OpenCloseField(), "oc_baojingzhuangtaishuchu", 9, 2, "报警状态输出",6));

        map.put("se_paiyanchaowen", ByteField.Init(new SettingField(), "se_paiyanchaowen", 81, 2, "排烟超温","℃", Commands_Key_Parameters_Setting, "00b0", 100, 400));
        map.put("se_yalishezhi", ByteField.Init(new SettingField(), "se_yalishezhi", 83, 2, "压力设置"));
        map.put("se_chaoyabaojing", ByteField.Init(new SettingField(), "se_chaoyabaojing", 85, 2, "超压报警","Mpa",100));
        map.put("se_shangxianyali", ByteField.Init(new SettingField(), "se_shangxianyali", 87, 2, "上限压力","Mpa",100));
        map.put("se_xiaxianyali", ByteField.Init(new SettingField(), "se_xiaxianyali", 89, 2, "下线压力","Mpa",100));
        map.put("se_dianjishezhi", ByteField.Init(new SettingField(), "se_dianjishezhi", 91, 2, "电极设置","", Commands_Key_Parameters_Setting, "00b5", 1, 3));
        map.put("se_ranshaoshezhi", ByteField.Init(new SettingField(), "se_ranshaoshezhi", 93, 2, "燃烧设置"));
        map.put("se_shuchushangxian", ByteField.Init(new SettingField(), "se_shuchushangxian", 95, 2, "输出上限","%", Commands_Key_Parameters_Setting, "00b7", 0, 100));
        map.put("se_shuchuxiaxian", ByteField.Init(new SettingField(), "se_shuchuxiaxian", 97, 2, "输出下限","%", Commands_Key_Parameters_Setting, "00b8", 0, 100));
        map.put("se_mubiaoyali", ByteField.Init(new SettingField(), "se_mubiaoyali", 99, 2, "目标压力","Mpa",100));
        map.put("se_zhouqi", ByteField.Init(new SettingField(), "se_zhouqi", 101, 2, "周期","", Commands_Key_Parameters_Setting, "00ba", 1, 3600));
        map.put("se_Pshezhizhi", ByteField.Init(new SettingField(), "se_Pshezhizhi", 103, 2, "P设置值","", Commands_Key_Parameters_Setting, "00bb", 1, 1000));
        map.put("se_Ishezhizhi", ByteField.Init(new SettingField(), "se_Ishezhizhi", 105, 2, "I设置值","", Commands_Key_Parameters_Setting, "00bc", 1, 3600));
        map.put("se_Dshezhizhi", ByteField.Init(new SettingField(), "se_Dshezhizhi", 107, 2, "D设置值","", Commands_Key_Parameters_Setting, "00bd", 0, 20));
        map.put("se_xingcheng", ByteField.Init(new SettingField(), "se_xingcheng", 109, 2, "行程","", Commands_Key_Parameters_Setting, "00be", 10, 300));
        map.put("se_zhuanhuoyali", ByteField.Init(new SettingField(), "se_zhuanhuoyali", 111, 2, "转火压力","Mpa",100));
        map.put("se_zhouqi2", ByteField.Init(new SettingField(), "se_zhouqi", 113, 2, "水位周期","", Commands_Key_Parameters_Setting, "00c0", 1, 3600));
        map.put("se_Pshezhizhi2", ByteField.Init(new SettingField(), "se_Pshezhizhi", 115, 2, "水位P设置值","", Commands_Key_Parameters_Setting, "00c1", 1, 1000));
        map.put("se_Ishezhizhi2", ByteField.Init(new SettingField(), "se_Ishezhizhi", 117, 2, "水位I设置值","", Commands_Key_Parameters_Setting, "00c2", 1, 3600));
        map.put("se_Dshezhizhi2", ByteField.Init(new SettingField(), "se_Dshezhizhi", 119, 2, "水位D设置值","", Commands_Key_Parameters_Setting, "00c3", 0, 20));
        map.put("se_queshuishuiwei", ByteField.Init(new SettingField(), "se_queshuishuiwei", 121, 2, "缺水水位","%", Commands_Key_Parameters_Setting, "00c4", 0, 100));
        map.put("se_dishuiwei", ByteField.Init(new SettingField(), "se_dishuiwei", 123, 2, "低水位","%", Commands_Key_Parameters_Setting, "00c5", 0, 100));
        map.put("se_gaoshuiwei", ByteField.Init(new SettingField(), "se_gaoshuiwei", 125, 2, "高水位","%", Commands_Key_Parameters_Setting, "00c6", 0, 100));
        map.put("se_gaobaojingshuiwei", ByteField.Init(new SettingField(), "se_gaobaojingshuiwei", 127, 2, "高报警水位","%", Commands_Key_Parameters_Setting, "00c7", 0, 100));
        map.put("se_mubiaoshuiwei", ByteField.Init(new SettingField(), "se_mubiaoshuiwei", 129, 2, "目标水位","%", Commands_Key_Parameters_Setting, "00c8", 0, 100));

        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 19, 2, "排烟温度", "℃"));
        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 21, 2, "蒸汽压力","Mpa",100));
        map.put("mo_4-20mAxinhaolianxujishui", ByteField.Init(new MockField(), "mo_4-20mAxinhaolianxujishui", 23, 2, "4-20mA信号连续给水"));

    }
}
