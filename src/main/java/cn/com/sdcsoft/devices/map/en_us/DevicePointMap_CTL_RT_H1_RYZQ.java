package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.map.en_us.DevicePointMap;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.CountShowField;
import cn.com.sdcsoft.devices.meta.FixedValueField;

import static cn.com.sdcsoft.devices.Device_CTL_RT_H1_RY.*;

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
        map.put(KEY_POINT_Add_SHUI_BENG, ByteField.Init(new CountField(), KEY_POINT_Add_SHUI_BENG,  "feed pump"));
        map.put(KEY_POINT_RAN_SHAO_QI, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI,  "burner"));



        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "Controller state", CTL_NJRT_Common_ValueMaps.coms_status));
        //运行天数与运行小时数需要进行运算
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, "Run the number of days", "days"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, "Running hours", "hour"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "Fuel type", 0, DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "Media Type", 1, DevicePointMap.coms_media));

        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "Cumulative combustion time","hour"));

        map.put("de_jishuibengzhubei", ByteField.Init(new DeviceField(), "de_jishuibengzhubei", 49, 2, "feed pump",0,CTL_NJRT_Common_ValueMaps.coms_master));
        map.put("de_jishuibengshouzi", ByteField.Init(new DeviceField(), "de_jishuibengshouzi", 49, 2, "feed pump",1,CTL_NJRT_Common_ValueMaps.coms_atuo));
        map.put(KEY_POINT_Add_SHUI_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_1, 9, 2,  "Main control of feed pump",3,coms_open_close));
        map.put(KEY_POINT_Add_SHUI_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_2, 9, 2, "Supply pump control", 4, coms_open_close));

        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "Extreme low water alarm",0));
        map.put("ex_zhengqiyalibiansongqiduanlu", ByteField.Init(new ExceptionField(), "ex_zhengqiyalibiansongqiduanlu", 45, 2, "Break of steam pressure transmitter",1));
        map.put("ex_zhengqiyalibiansongqiduanlu1", ByteField.Init(new ExceptionField(), "ex_zhengqiyalibiansongqiduanlu", 45, 2, "Short circuit of steam pressure transmitter",2));
        map.put("ex_chaoyabaojing_biansongqi_", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_biansongqi_", 45, 2, "Overpressure alarm (transmitter)",3));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "Smoke temperature alarm high",4));
        map.put("ex_chaoyabaojing_kongzhiqi_", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_kongzhiqi_", 45, 2, "Overpressure alarm (controller)",5));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 45, 2, "Burner failure",6));
        map.put("ex_ranqiyalidi", ByteField.Init(new ExceptionField(), "ex_ranqiyalidi", 45, 2, "Low gas pressure",7));
        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 45, 2, "gas leakage alarm",8));
        map.put("ex_shuiweidianjiluojicuo", ByteField.Init(new ExceptionField(), "ex_shuiweidianjiluojicuo", 45, 2, "Water level electrode logic error",9));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "High water level alarm",10));
        map.put("ex_paiyanwenduchuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiduanlu", 45, 2, "Smoke exhaust temperature sensor is disconnected",11));
        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 45, 2, "low water alarm",12));
        map.put("ex_bianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhangbaojing", 45, 2, "Frequency converter fault alarm",13));
        map.put("ex_shuiweichuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiduanlu", 45, 2, "Break of water level sensor",14));
        map.put("ex_shuiweichuanganqiduanlu1", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiduanlu", 45, 2, "Water level sensor short circuit",15));
        map.put("ex_jixiandishuiweibaojing4-20mA", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing4-20mA", 47, 2, "Limit low water alarm 4-20mA",1));
        map.put("ex_gaoshuiweibaojing4-20mA", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing4-20mA", 47, 2, "High water alarm 4-20mA",2));

        map.put("oc_jixiandishuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_jixiandishuiweibaojingdianji", 5, 2, "Extreme low water alarm electrode",0,coms_open_close));
        map.put("oc_dishuiweibaojingdianji_6dianjiteyou_", ByteField.Init(new OpenCloseField(), "oc_dishuiweibaojingdianji_6dianjiteyou_", 5, 2, "Low water alarm electrode (6 electrodes are unique)",1,coms_open_close));
        map.put("oc_dishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_dishuiweidianji", 5, 2, "Low water electrode",2,coms_open_close));
        map.put("oc_zhongshuiweidianji_6dianjiteyou_", ByteField.Init(new OpenCloseField(), "oc_zhongshuiweidianji_6dianjiteyou_", 5, 2, "Medium water level electrode (unique to 6 electrodes)",3,coms_open_close));
        map.put("oc_gaoshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweidianji", 5, 2, "High water electrode",4,coms_open_close));
        map.put("oc_gaoshuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojingdianji", 5, 2, "High water alarm electrode",5,coms_open_close));
        map.put("oc_bianpinqiguzhangbaojing", ByteField.Init(new OpenCloseField(), "oc_bianpinqiguzhangbaojing", 5, 2, "Frequency converter fault alarm",6,coms_open_close));
        map.put("oc_fuhediaojiekongzhi_yalikongzhiqifangshi_", ByteField.Init(new OpenCloseField(), "oc_fuhediaojiekongzhi_yalikongzhiqifangshi_", 5, 2, "Load regulation control (pressure controller mode)",7,coms_open_close));
        map.put("oc_qitingkongzhi_yalikongzhiqifangshi_", ByteField.Init(new OpenCloseField(), "oc_qitingkongzhi_yalikongzhiqifangshi_", 5, 2, "Start stop control (pressure controller mode)",8,coms_open_close));
        map.put("oc_chaoyabaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojingxinhao", 5, 2, "Overvoltage alarm signal",9,coms_open_close));
        map.put("oc_ranshaoqiguzhangxinhao", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiguzhangxinhao", 5, 2, "Burner failure signal",10,coms_open_close));
        map.put("oc_ranqiyaliyichangbaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_ranqiyaliyichangbaojingxinhao", 5, 2, "Gas pressure abnormal alarm signal",11,coms_open_close));
        map.put("oc_ranqixieloubaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_ranqixieloubaojingxinhao", 5, 2, "Gas leakage alarm signal",12,coms_open_close));

        map.put(KEY_POINT_RAN_SHAO_QI_KONGZHI, ByteField.Init(new DeviceField(), KEY_POINT_RAN_SHAO_QI_KONGZHI, 9, 2, "Burner start - stop control",0,coms_open_close));
        //map.put(KEY_POINT_RAN_SHAO_QI_STATUS, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI_STATUS, "燃烧器状态"));
      /*  map.put("oc_ranshaoqibilijianda", ByteField.Init(new OpenCloseField(), "oc_ranshaoqibilijianda", 9, 2, "燃烧器比例增加", 1, coms_open_close));
        map.put("oc_ranshaoqibilijianxiao", ByteField.Init(new OpenCloseField(), "oc_ranshaoqibilijianxiao", 9, 2, "燃烧器比例减小", 2, coms_open_close));*/
        //燃烧器调节需要将两个点位合成一个进行运算
        map.put("oc_ranshaoqifuhediaojie/zengdadiaojie", ByteField.Init(new OpenCloseField(), "oc_ranshaoqifuhediaojie/zengdadiaojie", 9, 2, "Burner load increase adjustment",1,coms_open_close));
        map.put("oc_jianxiaodiaojie", ByteField.Init(new OpenCloseField(), "oc_jianxiaodiaojie", 9, 2, "Reduce the adjustment",2,coms_open_close));
        map.put("oc_baojingzhuangtaishuchu", ByteField.Init(new OpenCloseField(), "oc_baojingzhuangtaishuchu", 9, 2, "Alarm state output",6));

        map.put("se_paiyanchaowen", ByteField.Init(new SettingField(), "se_paiyanchaowen", 81, 2, "Smoke overtemperature","℃"));
        map.put("se_yalishezhi", ByteField.Init(new SettingField(), "se_yalishezhi", 83, 2, "Pressure Setting"));
        map.put("se_chaoyabaojing", ByteField.Init(new SettingField(), "se_chaoyabaojing", 85, 2, "The overpressure alarm","Mpa",100));
        map.put("se_shangxianyali", ByteField.Init(new SettingField(), "se_shangxianyali", 87, 2, "Maximum pressure","Mpa",100));
        map.put("se_xiaxianyali", ByteField.Init(new SettingField(), "se_xiaxianyali", 89, 2, "Offline pressure","Mpa",100));
        map.put("se_dianjishezhi", ByteField.Init(new SettingField(), "se_dianjishezhi", 91, 2, "Electrode set"));
        map.put("se_ranshaoshezhi", ByteField.Init(new SettingField(), "se_ranshaoshezhi", 93, 2, "Burning set"));
        map.put("se_shuchushangxian", ByteField.Init(new SettingField(), "se_shuchushangxian", 95, 2, "Upper limit of output","%"));
        map.put("se_shuchuxiaxian", ByteField.Init(new SettingField(), "se_shuchuxiaxian", 97, 2, "The output threshold","%"));
        map.put("se_mubiaoyali", ByteField.Init(new SettingField(), "se_mubiaoyali", 99, 2, "The target pressure","Mpa",100));
        map.put("se_zhouqi", ByteField.Init(new SettingField(), "se_zhouqi", 101, 2, "Period"));
        map.put("se_Pshezhizhi", ByteField.Init(new SettingField(), "se_Pshezhizhi", 103, 2, "The setting of the P"));
        map.put("se_Ishezhizhi", ByteField.Init(new SettingField(), "se_Ishezhizhi", 105, 2, "The setting of the I"));
        map.put("se_Dshezhizhi", ByteField.Init(new SettingField(), "se_Dshezhizhi", 107, 2, "The setting of the D"));
        map.put("se_xingcheng", ByteField.Init(new SettingField(), "se_xingcheng", 109, 2, "Stroke"));
        map.put("se_zhuanhuoyali", ByteField.Init(new SettingField(), "se_zhuanhuoyali", 111, 2, "Turn the fire pressure","Mpa",100));
        map.put("se_zhouqi2", ByteField.Init(new SettingField(), "se_zhouqi", 113, 2, "Water cycle"));
        map.put("se_Pshezhizhi2", ByteField.Init(new SettingField(), "se_Pshezhizhi", 115, 2, "Water level P set value"));
        map.put("se_Ishezhizhi2", ByteField.Init(new SettingField(), "se_Ishezhizhi", 117, 2, "Water level I setting value"));
        map.put("se_Dshezhizhi2", ByteField.Init(new SettingField(), "se_Dshezhizhi", 119, 2, "Water level D setting value"));
        map.put("se_queshuishuiwei", ByteField.Init(new SettingField(), "se_queshuishuiwei", 121, 2, "Lack of water level","%"));
        map.put("se_dishuiwei", ByteField.Init(new SettingField(), "se_dishuiwei", 123, 2, "low water","%"));
        map.put("se_gaoshuiwei", ByteField.Init(new SettingField(), "se_gaoshuiwei", 125, 2, "high water level","%"));
        map.put("se_gaobaojingshuiwei", ByteField.Init(new SettingField(), "se_gaobaojingshuiwei", 127, 2, "High alarm water level","%"));
        map.put("se_mubiaoshuiwei", ByteField.Init(new SettingField(), "se_mubiaoshuiwei", 129, 2, "the target level","%"));

        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 19, 2, "exhaust gas temperature", "℃"));
        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 21, 2, "steam pressure","Mpa",100));
        map.put("mo_4-20mAxinhaolianxujishui", ByteField.Init(new MockField(), "mo_4-20mAxinhaolianxujishui", 23, 2, "4-20mA signal for continuous water supply","%"));

    }
}
