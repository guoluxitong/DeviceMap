package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.CountShowField;
import cn.com.sdcsoft.devices.meta.FixedValueField;

import java.util.HashMap;

import static cn.com.sdcsoft.devices.Device_CTL_RT_T2.*;
import static cn.com.sdcsoft.devices.map.en_us.DevicePointMap.CTL_NJRT_Common_ValueMaps.*;
import static cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap.CTL_NJRT_Common_ValueMaps.coms_ranshaoqi_status;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_RT_T2_RYZQ_YLKZQ extends DevicePointMap_CTL_NJRT_T2 {
    public static final String Key = "CTL_RT_T2_RYZQ_YLKZQ";
    static final String Commands_Key_Parameters_Setting = "参数设置";
    static final String Commands_Key_System_Ctl = "系统控制";

    public DevicePointMap_CTL_RT_T2_RYZQ_YLKZQ() {
        commandsMap.put(Commands_Key_Parameters_Setting,null);
        commandsMap.put(Commands_Key_System_Ctl,null);
        HashMap<Integer, String> coms_status = new HashMap() {
            {
                put(0, "await orders");
                put(1, "Alarm status");
                put(2, "operation");
            }
        };
        map.put(KEY_POINT_RAN_SHAO_QI, ByteField.Init(new CountField(), KEY_POINT_RAN_SHAO_QI,  "Burner"));
        map.put(KEY_POINT_Add_SHUI_BENG, ByteField.Init(new CountField(), KEY_POINT_Add_SHUI_BENG,  "Water Feeding Pump"));
        map.put(KEY_POINT_LENG_NING_BENG, ByteField.Init(new CountField(), KEY_POINT_LENG_NING_BENG,  "Condensation Pump"));

        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "System State", coms_status));
        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "Running Time"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, "Running Days", "Day"));
        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(KEY_BASE, new CountShowField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, "Running Hours", "Hour"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "Fuel Type", 0, DevicePointMap.coms_power));
        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "Medium Type", 1, DevicePointMap.coms_media));

        map.put("oc_queshuidianji", ByteField.Init(new OpenCloseField(), "oc_queshuidianji", 5, 2, "Lack of water electrode",0,coms_open_close));
        map.put("oc_dishuiweibaojingdianji_6dianjiteyou_", ByteField.Init(new OpenCloseField(), "oc_dishuiweibaojingdianji_6dianjiteyou_", 5, 2, "Low water alarm electrode (6 electrodes are unique)",1,coms_open_close));
        map.put("oc_dishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_dishuiweidianji", 5, 2, "Low water electrode",2,coms_open_close));
        map.put("oc_zhongshuiweidianji_6dianjiteyou_", ByteField.Init(new OpenCloseField(), "oc_zhongshuiweidianji_6dianjiteyou_", 5, 2, "Medium water level electrode (unique to 6 electrodes)",3,coms_open_close));
        map.put("oc_gaoshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweidianji", 5, 2, "High water electrode",4,coms_open_close));
        map.put("oc_gaoshuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojingdianji", 5, 2, "High water alarm electrode",5,coms_open_close));
        map.put("oc_bianpinqiguzhangbaojing", ByteField.Init(new OpenCloseField(), "oc_bianpinqiguzhangbaojing", 5, 2, "Frequency converter fault alarm",6,coms_open_close));
        map.put("oc_fuhetiaojie", ByteField.Init(new OpenCloseField(), "oc_fuhetiaojie", 5, 2, "load regulation",7,coms_open_close));
        map.put("oc_qitingkongzhi", ByteField.Init(new OpenCloseField(), "oc_qitingkongzhi", 5, 2, "Start-stop control",8,coms_open_close));
        map.put("oc_chaoyabaojing", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojing", 5, 2, "The overpressure alarm",9,coms_open_close));
        map.put("oc_ranshaoqiguzhang", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiguzhang", 5, 2, "Burner failure",10,coms_open_close));
        map.put("oc_ranqixieloubaojing", ByteField.Init(new OpenCloseField(), "oc_ranqixieloubaojing", 5, 2, "Gas leakage alarm",11,coms_open_close));
        map.put("oc_ranqiyalidibaojing", ByteField.Init(new OpenCloseField(), "oc_ranqiyalidibaojing", 5, 2, "Low gas pressure alarm",12,coms_open_close));
        map.put("oc_ranqiyaligaobaojing", ByteField.Init(new OpenCloseField(), "oc_ranqiyaligaobaojing", 5, 2, "High gas pressure alarm",13,coms_open_close));

        map.put(KEY_POINT_RAN_SHAO_QI_KONGZHI, ByteField.Init(new OpenCloseField(), KEY_POINT_RAN_SHAO_QI_KONGZHI, 9, 2, "Burner on-off Control", 0, coms_start_stop));
        map.put(KEY_POINT_RAN_SHAO_QI_STATUS, ByteField.Init(new OpenCloseField(), KEY_POINT_RAN_SHAO_QI_STATUS, 9, 2, "Burner Load Adjustment", 1, coms_start_stop));
        map.put(KEY_POINT_Add_SHUI_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_1, 9, 2, "Water Feeding Pump(On Duty)Control", 3, coms_start_stop));
        map.put(KEY_POINT_Add_SHUI_BENG_2, ByteField.Init(new DeviceField(), KEY_POINT_Add_SHUI_BENG_2, 9, 2, "Water Feeding Pump(Back-up)Control", 4, coms_start_stop));
        map.put(KEY_POINT_LENG_NING_BENG_1, ByteField.Init(new DeviceField(), KEY_POINT_LENG_NING_BENG_1, 9, 2, "Condensing Circulating Pump Control", 5, coms_start_stop));
        map.put("oc_baojingshuchu", ByteField.Init(new OpenCloseField(), "oc_baojingshuchu", 9, 2, "Alarm Signaling Operation", 6, coms_start_stop));

        map.put("oc_jishuibengzhubei", ByteField.Init(new OpenCloseField(), "oc_jishuibengzhubei", 49, 2, "Water Feeding Pump On Duty/Back-up", 0, coms_master));
        map.put("oc_jishuibengshouzi", ByteField.Init(new OpenCloseField(), "oc_jishuibengshouzi", 49, 2, "Water Feeding Pump Manual/Automatic", 1, coms_atuo));
        map.put("oc_jienengxunhuanbengshouzi", ByteField.Init(new OpenCloseField(), "oc_jienengxunhuanbengshouzi", 49, 2, "Energy-saving Circulating Pump Manual/Automatic", 3, coms_master));

        map.put("ex_shuiweichuanganqiduanlu1", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiduanlu1", 45, 2, "Water Level Transmitter Open Circuit", 3));
        map.put("ex_shuiweichuanganqishort", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqishort", 45, 2, "Water Level Transmitter Short Circuit", 4));
        map.put("ex_jixiandishuiweibaojingdianliu", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojingdianliu", 45, 2, "Extreme Low Water Level Alarm(Electric Current)", 5));
        map.put("ex_gaoshuiweibaojingdianliu", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojingdianliu", 45, 2, "High Water Level Alarm( Electric Current)", 6));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "High Discharged Flue Gas Temperature Alarm", 7));
        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "Extreme Low Water Level Alarm", 8));
        map.put("ex_shuiweidianjiluojicuo", ByteField.Init(new ExceptionField(), "ex_shuiweidianjiluojicuo", 45, 2, "Water-level Electrode Logic Error", 9));
        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 45, 2, "Low Water Level Alarm", 10));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "High Water Level Alarm", 11));
        map.put("ex_bianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhang", 45, 2, "Frequency Converter Failure", 12));
        map.put("ex_chaoyabaojingkongzhiqi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojingkongzhiqi", 45, 2, "Overpressure Alarm( Controller)", 13));
        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 45, 2, "Low Gas Pressure Alarm", 14));
        map.put("ex_ranqiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaligaobaojing", 45, 2, "High Gas Pressure Alarm", 15));
        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 47, 2, "Gas Leakage Alarm", 0));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 47, 2, "Burner Failure", 1));
        map.put("ex_jixiandishuiweibaojing2", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing2", 47, 2, "Extreme Low Water Level Alarm 2",4));

        map.put("mo_lengningqiyanwen", ByteField.Init(new MockField(), "mo_lengningqiyanwen", 13, 2, "Condenser Flue Gas Temperature", "℃"));
        map.put("mo_jishuiwendu", ByteField.Init(new MockField(), "mo_jishuiwendu", 15, 2, "Feeding Water Temperature", "℃"));
        map.put("mo_shuiweixinhao", ByteField.Init(new MockField(), "mo_shuiweixinhao", 19, 2, "Water Level", "%"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 21, 2, "Discharged Flue Gas Temperature", "℃"));
        map.put("mo_jienengqiyanwen", ByteField.Init(new MockField(), "mo_jienengqiyanwen", 23, 2, "Economizer Flue Gas Temperature", "℃"));

        map.put("se_paiyanchaowen", ByteField.Init(new SettingField(), "se_paiyanchaowen", 107, 2, "Smoke overtemperature","℃"));
        map.put("se_chaoyabaojing", ByteField.Init(new SettingField(), "se_chaoyabaojing", 109, 2, "The overpressure alarm","Mpa",100));
        map.put("se_tingluyali", ByteField.Init(new SettingField(), "se_tingluyali", 111, 2, "The furnace pressure","Mpa",100));
        map.put("se_qiluyali", ByteField.Init(new SettingField(), "se_qiluyali", 115, 2, "And the furnace pressure","Mpa",100));
        map.put("se_zuanhuoyali", ByteField.Init(new SettingField(), "se_zuanhuoyali", 113, 2, "Turn the fire pressure","Mpa",100));
        map.put("se_shuchushangxian", ByteField.Init(new SettingField(), "se_shuchushangxian", 117, 2, "Upper limit of output","%"));
        map.put("se_shuchuxiaxian", ByteField.Init(new SettingField(), "se_shuchuxiaxian", 119, 2, "The output threshold","%"));
        map.put("se_ranshaozhouqi", ByteField.Init(new SettingField(), "se_ranshaozhouqi", 121, 2, "The combustion cycle",""));
        map.put("se_ranshaoP", ByteField.Init(new SettingField(), "se_ranshaoP", 123, 2, "burn  P"));
        map.put("se_ranshaoI", ByteField.Init(new SettingField(), "se_ranshaoI", 125, 2, "burn  I"));
        map.put("se_ranshaoD", ByteField.Init(new SettingField(), "se_ranshaoD", 127, 2, "burn  D"));
        map.put("se_xingcheng", ByteField.Init(new SettingField(), "se_xingcheng", 129, 2, "journey"));
        map.put("se_gaobaojing", ByteField.Init(new SettingField(), "se_gaobaojing", 131, 2, "High alarm"));
        map.put("se_gaoshuiwei", ByteField.Init(new SettingField(), "se_gaoshuiwei", 133, 2, "high water level","%"));
        map.put("se_dishuiwei", ByteField.Init(new SettingField(), "se_dishuiwei", 135, 2, " low water","%"));
        map.put("se_mubiaoshuiwei", ByteField.Init(new SettingField(), "se_mubiaoshuiwei", 137, 2, "Water level of the target","%"));
        map.put("se_queshuishuiwei", ByteField.Init(new SettingField(), "se_queshuishuiwei", 139, 2, "Lack of water level","%"));
        map.put("se_shuiweizhouqi", ByteField.Init(new SettingField(), "se_shuiweizhouqi", 141, 2, "Water cycle",""));
        map.put("se_shuiweip", ByteField.Init(new SettingField(), "se_shuiweip", 143, 2, "water level  p"));
        map.put("se_shuiweiI", ByteField.Init(new SettingField(), "se_shuiweiI", 145, 2, "water level  I"));
        map.put("se_shuiweiD", ByteField.Init(new SettingField(), "se_shuiweiD", 147, 2, "water level  D"));
        map.put("se_chongxiyanshi", ByteField.Init(new SettingField(), "se_chongxiyanshi", 157, 2, "Flushing time delay","S"));
        map.put("se_zhuanhuohuicha", ByteField.Init(new SettingField(), "se_zhuanhuohuicha", 159, 2, "Go back to the fire","Mpa",100));

    }
}
