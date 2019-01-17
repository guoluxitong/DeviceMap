package cn.com.sdcsoft.devices.map.en_us;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.FixedValueField;
import cn.com.sdcsoft.devices.meta.PLC.*;

public class DevicePointMap_PLC_DianZhengQi extends DevicePointMap {
    public static final String Key = "PLC_DianZhengQi";

    public DevicePointMap_PLC_DianZhengQi() {

        /**
         * 计算属性（不显示）
         */
        map.put("_addshuibeng", ByteField.Init(new CountField(), "_addshuibeng","Make-up Pump"));

        map.put(KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), KEY_POINT_RUN_HOURS, 9, 2, "Running Hours", "时"));
        map.put(KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), KEY_POINT_RUN_DAYS, 11, 2, "Running Days", "天"));
        map.put(KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), KEY_POINT_SYSTEM_STATUS, 13, 2, "System State",PLC_Common_ValueMaps.coms_status));
        map.put(KEY_POINT_POWER, ByteField.Init(new FixedValueField(), KEY_POINT_POWER, "Fuel",1,DevicePointMap.coms_power));
        map.put(KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), KEY_POINT_MEDIA, "Medium",1,DevicePointMap.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "Water Level State",DevicePointMap.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "Burner State",PLC_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 35, 4, "Steam Pressure", "MPa"));
        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 39, 4, "Steam Temperature", "℃"));
        map.put("mo_guolushuiwei", ByteField.Init(new MockField(), "mo_guolushuiwei", 43, 4, "Boiler Water Level", "mm"));
        map.put("mo_zhengqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhengqishunshiliuliang", 47, 4, "Steam Instantaneous Flow Rate", "T/H"));
        map.put("mo_bushuishunshiliuliang", ByteField.Init(new MockField(), "mo_bushuishunshiliuliang", 51, 4, "Make-up Water Instantaneous Flow Rate", "T/H"));
        map.put("mo_zhengqileijiliuliang", ByteField.Init(new MockField(), "mo_zhengqileijiliuliang", 55, 4, "Steam  Integrated Flow Rate", "T"));
        map.put("mo_bushuileijiliuliang", ByteField.Init(new MockField(), "mo_bushuileijiliuliang", 59, 4, "Make-up Water Integrated Flow Rate", "T"));
        map.put("mo_jinshuiwendu", ByteField.Init(new MockField(), "mo_jinshuiwendu", 63, 4, "Inlet Water Temperature", "℃"));
        map.put("mo_jinshuiyali", ByteField.Init(new MockField(), "mo_jinshuiyali", 67, 4, "Inlet Water Pressure", "MPa"));
        map.put("mo_addshuibengpinlvfankui", ByteField.Init(new MockField(), "mo_addshuibengpinlvfankui", 71, 4, "Make-up Pump Frequency Feedback ", "Hz"));
        map.put("mo_ruanshuixiangyewei", ByteField.Init(new MockField(), "mo_ruanshuixiangyewei", 75, 4, "Soft Water Tank Water Level", "%"));
        map.put("mo_qidongjiarezushu", ByteField.Init(new MockField(), "mo_qidongjiarezushu", 79, 4, "Heating Blocks Starting Quantity", "组"));
        map.put("mo_qidongjiarezushubaifenbi", ByteField.Init(new MockField(), "mo_qidongjiarezushubaifenbi", 83, 4, "Heating Blocks Starting Percentage", "%"));

        map.put("se_chaoyabaojingsheding", ByteField.Init(new SettingField(), "se_chaoyabaojingsheding", 127, 4, "Over-pressure Alarm Setting", "MPa"));
        map.put("se_shiyongjiarezushusheding", ByteField.Init(new SettingField(), "se_shiyongjiarezushusheding", 131, 4, "Qty of Heating Blocks in Service Setting", "组"));
        map.put("se_touqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_touqiejiangeshijiansheding", 135, 4, "Switching Interval Setting ", "S"));
        map.put("se_kuaiqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_kuaiqiejiangeshijiansheding", 139, 4, "Quick Switching Interval Setting", "S"));
        map.put("se_tingluyalisheding", ByteField.Init(new SettingField(), "se_tingluyalisheding", 143, 4, "Boiler Shutdown Pressure Setting", "MPa"));
        map.put("se_shiyongyalisheding", ByteField.Init(new SettingField(), "se_shiyongyalisheding", 147, 4, "Operation Pressure Setting", "MPa"));
        map.put("se_qiluyalisheding", ByteField.Init(new SettingField(), "se_qiluyalisheding", 151, 4, "Boiler Starting Temperature Setting", "MPa"));
        map.put("se_guolushuiweijidibaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijidibaojingsheding", 155, 4, "Extreme Low Boiler Water Level Alarm Setting", "mm"));
        map.put("se_geishuibengshoudongpinlvsheding", ByteField.Init(new SettingField(), "se_geishuibengshoudongpinlvsheding", 159, 4, "Manual Water Feeding Pump Frequency Setting", "Hz"));
        map.put("se_bushuimubiaosheding", ByteField.Init(new SettingField(), "se_bushuimubiaosheding", 163, 4, "Make-up water Setting", "mm"));
        map.put("se_guolushuiweijigaobaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijigaobaojingsheding", 167, 4, "Extreme High Boiler Water Level Alarm Setting", "mm"));
        map.put("se_qibengyeweisheding", ByteField.Init(new SettingField(), "se_qibengyeweisheding", 171, 4, "Water Pump-on Water Level Setting", "mm"));
        map.put("se_tingbengyeweisheding", ByteField.Init(new SettingField(), "se_tingbengyeweisheding", 175, 4, "Water Pump-off Water Level Setting", "mm"));


        map.put("de_1_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_1_addshuibeng_auto", 199, 2, "Make-up Pump Manual/Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_1_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_1_addshuibeng_start_stop", 201, 2, "Make-up Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_2_addshuibeng_auto", ByteField.Init(new DeviceField(), "de_2_addshuibeng_auto", 203, 2, "Make-up Pump Manual/ Automatic",PLC_Common_ValueMaps.coms_atuo));
        map.put("de_2_addshuibeng_start_stop", ByteField.Init(new DeviceField(), "de_2_addshuibeng_start_stop", 205, 2, "Make-up Pump On/Off", DevicePointMap.coms_start_stop));
        map.put("de_baojingshuchuzhishi", ByteField.Init(new DeviceField(), "de_baojingshuchuzhishi", 207, 2, "Alarm Output Indication", coms_open_close));


        map.put("ex_shuidianjiluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuidianjiluojicuobaojing", 233, 2, "Water Electrode Logic Error Alarm", 0));
        map.put("ex_yalibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiguzhangbaojing", 233, 2, "Pressure Transmitter Failure Alarm", 1));
        map.put("ex_shuiweibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_shuiweibiansongqiguzhangbaojing", 233, 2, "Water Level Transmitter Failure Alarm", 2));
        map.put("ex_geishuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_geishuibengbianpinqiguzhang", 233, 2, "Water Feeding Pump Frequency Converter Failure", 3));
        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 233, 2, "Electric Leakage Alarm", 4));
        map.put("ex_qianyabaojing", ByteField.Init(new ExceptionField(), "ex_qianyabaojing", 233, 2, "Undervoltage Alarm", 5));

        map.put("ex_shuiweiweidibaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweiweidibaojing_dianji", 233, 2, "Dangerous Low Water Level Alarm( Electrode)", 8));
        map.put("ex_shuiweijidibaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_dianji", 233, 2, "Extreme Low Water Level Alarm( Electrode)", 9));
        map.put("ex_shuiweijigaobaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_dianji", 233, 2, "Extreme High Water Level Alarm( Electrode)", 10));
        map.put("ex_shuiweijidibaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_shedingzhi", 233, 2, "Extreme Low Water Level Alarm( Setting Value)", 11));
        map.put("ex_shuiweijigaobaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_shedingzhi", 233, 2, "Extreme High Water Level Alarm( Setting Value)", 12));
        map.put("ex_chaoyabaojing_yalikaiguan", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_yalikaiguan", 233, 2, "Over-pressure Alarm ( Pressure Switch)", 13));
        map.put("ex_chaoyabaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_shedingzhi", 233, 2, "Over-pressure Alarm ( Setting Value)", 14));
        map.put("ex_ruanshuixiangqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_ruanshuixiangqueshuibaojing", 233, 2, "Soft Water Tank Water Shortage Alarm", 15));


        map.put("oc_1#jiarezu", ByteField.Init(new OpenCloseField(), "oc_1#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_2#jiarezu", ByteField.Init(new OpenCloseField(), "oc_2#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_3#jiarezu", ByteField.Init(new OpenCloseField(), "oc_3#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_4#jiarezu", ByteField.Init(new OpenCloseField(), "oc_4#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_5#jiarezu", ByteField.Init(new OpenCloseField(), "oc_5#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_6#jiarezu", ByteField.Init(new OpenCloseField(), "oc_6#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_7#jiarezu", ByteField.Init(new OpenCloseField(), "oc_7#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_8#jiarezu", ByteField.Init(new OpenCloseField(), "oc_8#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_9#jiarezu", ByteField.Init(new OpenCloseField(), "oc_9#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_10#jiarezu", ByteField.Init(new OpenCloseField(), "oc_10#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_11#jiarezu", ByteField.Init(new OpenCloseField(), "oc_11#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_12#jiarezu", ByteField.Init(new OpenCloseField(), "oc_12#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_13#jiarezu", ByteField.Init(new OpenCloseField(), "oc_13#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_14#jiarezu", ByteField.Init(new OpenCloseField(), "oc_14#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_15#jiarezu", ByteField.Init(new OpenCloseField(), "oc_15#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_16#jiarezu", ByteField.Init(new OpenCloseField(), "oc_16#jiarezu", 237, 2, "Heating Block Feedback", 1));
        map.put("oc_17#jiarezu", ByteField.Init(new OpenCloseField(), "oc_17#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_18#jiarezu", ByteField.Init(new OpenCloseField(), "oc_18#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_19#jiarezu", ByteField.Init(new OpenCloseField(), "oc_19#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_20#jiarezu", ByteField.Init(new OpenCloseField(), "oc_20#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_21#jiarezu", ByteField.Init(new OpenCloseField(), "oc_21#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_22#jiarezu", ByteField.Init(new OpenCloseField(), "oc_22#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_23#jiarezu", ByteField.Init(new OpenCloseField(), "oc_23#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_24#jiarezu", ByteField.Init(new OpenCloseField(), "oc_24#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_25#jiarezu", ByteField.Init(new OpenCloseField(), "oc_25#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_26#jiarezu", ByteField.Init(new OpenCloseField(), "oc_26#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_27#jiarezu", ByteField.Init(new OpenCloseField(), "oc_27#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_28#jiarezu", ByteField.Init(new OpenCloseField(), "oc_28#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_29#jiarezu", ByteField.Init(new OpenCloseField(), "oc_29#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_30#jiarezu", ByteField.Init(new OpenCloseField(), "oc_30#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_31#jiarezu", ByteField.Init(new OpenCloseField(), "oc_31#jiarezu", 239, 2, "Heating Block Feedback", 1));
        map.put("oc_32#jiarezu", ByteField.Init(new OpenCloseField(), "oc_32#jiarezu", 239, 2, "Heating Block Feedback", 1));

    }
}
