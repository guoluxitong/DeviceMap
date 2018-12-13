package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJZJ_485.*;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_NJZJ_IPK2_4850 extends DevicePointMap {
    public static final String Key = "CTL_NJZJ_IPK2_485";

    public DevicePointMap_CTL_NJZJ_IPK2_4850() {
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 7, 2, "Running State", CTL_NJZJ_Common_ValueMaps.coms_status));

        map.put("ba_yunxingtianshu", ByteField.Init(new RunDaysField(), "ba_yunxingtianshu", 0, 0, "Running Days", "天"));

        map.put("ba_yunxingxiaoshishu", ByteField.Init(new BaseInfoField(), "ba_yunxingxiaoshishu", 0, 0, "Running Hours", "时"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new PowerField(), SdcSoftDevice.KEY_POINT_POWER, 3, 2, "Fuel Type", coms_power));

        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 5, 2, "Medium Type", coms_media));

        map.put("ba_guolushuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_guolushuiweizhuangtai", 25, 2, "Boiler Water Level State", coms_level));

        map.put("ba_shuixiangshuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuixiangshuiweizhuangtai", 27, 2, "Water Tank Water Level State", coms_level));

        map.put("ba_guoluyalizhuangtai", ByteField.Init(new BaseInfoField(), "ba_guoluyalizhuangtai", 29, 30, "Boiler Pressure State", CTL_NJZJ_Common_ValueMaps.coms_yalistatus));
        map.put("ba_moshibianhao", ByteField.Init(new BaseInfoField(), "ba_moshibianhao", 0, 0, "模式编号"));
        map.put("ba_fangdongkaiguan", ByteField.Init(new BaseInfoField(), "ba_fangdongkaiguan", 0, 0, "Antifreeze Switch", DevicePointMap.coms_open_close));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 36, 2, "High Discharged Flue Gas Temperature Alarm"));
        map.put("ex_lushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lushuiwendugaobaojing", 38, 2, "High Boiler Water Temperature Alarm"));

        map.put("ex_chukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chukouwendugaobaojing", 40, 2, "High Outlet Temperature Alarm"));

        map.put("ex_chaoyabaojing", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing", 42, 2, "Overpressure Alarm"));

        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 44, 2, "Extreme Low Water Level Alarm"));

        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 46, 2, "Low Water Level Alarm"));

        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 48, 2, "Water Level Alarm"));

        map.put("ex_shuiweixinhaoluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuiweixinhaoluojicuobaojing", 50, 2, "Water Level Signal Logic Error Alarm"));

        map.put("ex_lubiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lubiwendugaobaojing", 52, 2, "High Furnace Wall Temperature Alarm"));

        map.put("ex_fuyazhengqiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwendugaobaojing", 54, 2, "High Negative Pressure Steam Temperature Alarm"));

        map.put("ex_ranshaoqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhangbaojing", 56, 2, "Burner Failure Alarm"));

        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 58, 2, "Gas Leakage Alarm"));

        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 60, 2, "Low Gas Pressure Alarm"));

        map.put("ex_ranqiyaliyichangbaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichangbaojing", 62, 2, "Gas Pressure Abnormity Alarm"));

        map.put("ex_ranqiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaligaobaojing", 64, 2, "High Gas Pressure Alarm"));

        map.put("ex_jishuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_jishuibianpinqiguzhangbaojing", 66, 2, "Water Feeding Frequency Converter Failure Alarm"));

        map.put("ex_xunhuanbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbianpinqiguzhangbaojing", 68, 2, "Circulating Frequency Converter Failure Alarm"));

        map.put("ex_yinfengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yinfengbianpinqiguzhangbaojing", 70, 2, "ID Fan Frequency Converter Failure Alarm"));

        map.put("ex_gufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_gufengbianpinqiguzhangbaojing", 72, 2, "FD Fan Frequency Converter Failure Alarm"));

        map.put("ex_ecigufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhangbaojing", 74, 2, "Secondary FD Fan Frequency Converter Failure Alarm"));

        map.put("ex_lupaibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_lupaibianpinqiguzhangbaojing", 76, 2, "Chain Grate Frequency Converter Failure Alarm"));

        map.put("ex_addshuibengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_addshuibengguzhangbaojing", 78, 2, "Water Feeding Pump Failure Alarm"));

        map.put("ex_xunhuanbengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengguzhangbaojing", 80, 2, "Circulating Pump Failure Alarm"));

        map.put("ex_chaodiyabaojing", ByteField.Init(new ExceptionField(), "ex_chaodiyabaojing", 82, 2, "Ultralow Pressure Alarm"));

        map.put("ex_qiandianyabaojing", ByteField.Init(new ExceptionField(), "ex_qiandianyabaojing", 84, 2, "Undervoltage Alarm"));

        map.put("ex_guodianyabaojing", ByteField.Init(new ExceptionField(), "ex_guodianyabaojing", 86, 2, "overvoltage Alarm"));

        map.put("ex_quexiangbaojing", ByteField.Init(new ExceptionField(), "ex_quexiangbaojing", 88, 2, "Phase Shortage Alarm"));

        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 90, 2, "Electric Leakage Alarm"));

        map.put("ex_biansongqiguoyabaohu", ByteField.Init(new ExceptionField(), "ex_biansongqiguoyabaohu", 92, 2, "Transmitter Overvoltage Protection"));

        map.put("ex_guanjiancanshuyichang", ByteField.Init(new ExceptionField(), "ex_guanjiancanshuyichang", 94, 2, "Main Paremeter Abnormity"));

        map.put("ex_shedingcanshuyichang", ByteField.Init(new ExceptionField(), "ex_shedingcanshuyichang", 96, 2, "Setting Paremeter Abnormity"));

        map.put("ex_shizhongguzhang", ByteField.Init(new ExceptionField(), "ex_shizhongguzhang", 98, 2, "Clock Failure"));

        map.put("ex_cunchuqiguzhang", ByteField.Init(new ExceptionField(), "ex_cunchuqiguzhang", 100, 2, "Memorizer Failure"));

        map.put("ex_waibuliansuobaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuobaojing", 102, 2, "External Interlock Alarm"));

        map.put("ex_queyoubaojing", ByteField.Init(new ExceptionField(), "ex_queyoubaojing", 104, 2, "Oil Shortage Alarm"));

        map.put("ex_diyouweibaojing", ByteField.Init(new ExceptionField(), "ex_diyouweibaojing", 106, 2, "Low Oil Level Alarm"));

        map.put("ex_bentipaiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_bentipaiyanwendugaobaojing", 108, 2, "High Boiler Proper Discharged Flue Gas Temperature Alarm"));

        map.put("ex_bianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhangbaojing", 110, 2, "Frequency Converter Failure Alarm"));

        map.put("ex_meishuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_meishuiwendugaobaojing", 112, 2, "High Medium Water Temperature Alarm"));

        map.put("ex_1haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_1haoguoluguzhang", 114, 2, "Boiler Failure"));

        map.put("ex_2haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_2haoguoluguzhang", 116, 2, "Boiler Failure"));

        map.put("ex_3haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_3haoguoluguzhang", 118, 2, "Boiler Failure"));

        map.put("ex_4haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_4haoguoluguzhang", 120, 2, "Boiler Failure"));

        map.put("ex_5haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_5haoguoluguzhang", 122, 2, "Boiler Failure"));

        map.put("ex_6haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_6haoguoluguzhang", 124, 2, "Boiler Failure"));

        map.put("ex_7haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_7haoguoluguzhang", 126, 2, "Boiler Failure"));

        map.put("ex_8haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_8haoguoluguzhang", 128, 2, "Boiler Failure"));

        map.put("ex_bushuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bushuibianpinqiguzhangbaojing", 130, 2, "Make-up Pump Frequecy Converter Failure Alarm"));

        map.put("ex_diliuliangbaojing", ByteField.Init(new ExceptionField(), "ex_diliuliangbaojing", 132, 2, "Low Flow Rate Alarm"));

        map.put("ex_rukouwendudibaojing", ByteField.Init(new ExceptionField(), "ex_rukouwendudibaojing", 134, 2, "Low Inlet Water Temperature Alarm"));

        map.put("ex_xunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanbengbianpinqiguzhang", 136, 2, "Circulating Pump Frequecy Converter Failure"));

        map.put("ex_ecixunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengbianpinqiguzhang", 138, 2, "Secondary Circulating Pump Failure"));

        map.put("ex_reshuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengbianpinqiguzhang", 140, 2, "Hot Water Pump Frequency Converter Failure"));

        map.put("ex_buyoubengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengbianpinqiguzhang", 142, 2, "Make-up Oil Pump Frequency Converter Failure"));

        map.put("ex_ecigufengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhang", 144, 2, "Secondary FD Fan Frequency Converter Failure"));

        map.put("ex_songliaojibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_songliaojibianpinqiguzhang", 146, 2, "Fuel Feeder Frequency Converter Failure"));

        map.put("ex_zhenkongbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengbianpinqiguzhang", 148, 2, "Vacuum Pump Frequency Converter Failure"));

        map.put("ex_lengningbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengbianpinqiguzhang", 150, 2, "Condensing Pump Frequency Converter Failure"));

        map.put("ex_addshuibengguzhang", ByteField.Init(new ExceptionField(), "ex_addshuibengguzhang", 152, 2, "Make-up Water Pump Failure"));

        map.put("ex_buyoubengguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengguzhang", 154, 2, "Make-up Oil Pump Failure"));

        map.put("ex_lengningbengguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengguzhang", 156, 2, "Condensing Pump Failure"));

        map.put("ex_reshuibengguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengguzhang", 158, 2, "Hot Water Pump Failure"));

        map.put("ex_zhenkongbengguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengguzhang", 160, 2, "Vacuum Pump Failure"));

        map.put("ex_ecixunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengguzhang", 162, 2, "Secondary Circulating Pump FailureLoop 1 Circulating Pump Failure"));

        map.put("ex_huilu1xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1xunhuanbengguzhang", 164, 2, "Loop 1 Circulating Pump Failure"));

        map.put("ex_huilu2xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2xunhuanbengguzhang", 166, 2, "Loop 2 Circulating Pump Failure"));

        map.put("ex_huilu3xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3xunhuanbengguzhang", 168, 2, "Loop 3 Circulating Pump Failure"));

        map.put("ex_huilu4xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4xunhuanbengguzhang", 170, 2, "Loop 4 Circulating Pump Failure"));

        map.put("ex_huilu5xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5xunhuanbengguzhang", 172, 2, "Loop 5Loop 1 High Temperature Alarm Circulating Pump Failure"));

        map.put("ex_huilu1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu1wendugaobaojing", 174, 2, "Loop 1 High Temperature Alarm"));

        map.put("ex_huilu2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu2wendugaobaojing", 176, 2, "Loop 2 High Temperature Alarm"));

        map.put("ex_huilu3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu3wendugaobaojing", 178, 2, "Loop 3 High Temperature Alarm"));

        map.put("ex_huilu4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu4wendugaobaojing", 180, 2, "Loop 4 High Temperature Alarm"));

        map.put("ex_huilu5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu5wendugaobaojing", 182, 2, "Loop 5 High Temperature Alarm"));

        map.put("ex_panguan1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan1wendugaobaojing", 184, 2, "Coil 1 High Temperature Alarm"));

        map.put("ex_panguan2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan2wendugaobaojing", 186, 2, "Coil 2 High Temperature Alarm"));

        map.put("ex_panguan3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan3wendugaobaojing", 188, 2, "Coil 3 High Temperature Alarm"));

        map.put("ex_panguan4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan4wendugaobaojing", 190, 2, "Coil 4 High Temperature Alarm"));

        map.put("ex_panguan5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan5wendugaobaojing", 192, 2, "Coil 5 High Temperature Alarm"));

        map.put("ex_panguan6wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan6wendugaobaojing", 194, 2, "Coil 6 High Temperature Alarm"));

        map.put("ex_panguan7wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan7wendugaobaojing", 196, 2, "Coil 7 High Temperature Alarm"));

        map.put("ex_panguan8wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan8wendugaobaojing", 198, 2, "Coil 8 High Temperature Alarm"));

        map.put("ex_panguan9wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan9wendugaobaojing", 200, 2, "Coil 9 High Temperature Alarm"));

        map.put("ex_panguan10wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan10wendugaobaojing", 202, 2, "Coil 10 High Temperature Alarm"));

        map.put("ex_shanzhengguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanchaoyabaojing", 204, 2, "Flash Tank Overpressure Alarm"));

        map.put("ex_lengningguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanchaoyabaojing", 206, 2, "Condensing Tank Overpressure Alarm"));

        map.put("ex_pengzhangguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanchaoyabaojing", 208, 2, "Expansion Tank Overpressure Alarm"));

        map.put("ex_shanzhengguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweigaobaojing", 210, 2, "High Flash Tank Water Level Alarm"));

        map.put("ex_shanzhengguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweidibaojing", 212, 2, "Low Flash Tank Water Level Alarm"));

        map.put("ex_lengningguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweigaobaojing", 214, 2, "High Condensing Tank Water Level Alarm"));

        map.put("ex_lengningguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweidibaojing", 216, 2, "Low Condensing Tank Water Level Alarm"));

        map.put("ex_pengzhangguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweigaobaojing", 218, 2, "High Expansion Tank Water Level Alarm"));

        map.put("ex_pengzhangguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweidibaojing", 220, 2, "Low Expansion Tank Water Level Alarm"));

        map.put("ex_jinchukouyachadibaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachadibaojing", 222, 2, "Low Inlet and Outlet Differential Pressure Alarm"));

        map.put("ex_jinchukouyachagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachagaobaojing", 224, 2, "High Inlet and Outlet Differential Tmeperature Alarm"));

        map.put("ex_jinchukouwenchagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouwenchagaobaojing", 230, 2, "High Inlet and Outlet Differential Tmeperature Alarm"));

        map.put("ex_guoluhuohuiluchukouyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuiluchukouyaligaobaojing", 232, 2, "High Outlet Pressure Alarm( boiler or loop)"));

        map.put("ex_guoluhuohuiluchukouyalidibaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuiluchukouyalidibaojing", 239, 2, "Low Outlet Pressure Alarm( boiler or loop)"));

        map.put("ex_guoluhuohuilurukouyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuilurukouyaligaobaojing", 241, 2, "High Inlet Pressure Alarm(Boiler or Loop)"));

        map.put("ex_guoluhuohuilurukouyalidibaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuilurukouyalidibaojing", 243, 2, "Low Inlet Pressure Alarm (Boiler or Loop)"));

        map.put("ex_dongzuofankuiyichangyinfengjiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_dongzuofankuiyichangyinfengjiguzhangbaojing", 245, 2, "ID Fan Failure Alarm( Action Feedback Abnormity)"));

        map.put("ex_bentipaiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_bentipaiyanwenduchuanganqiguzhang", 252, 2, "Boiler Proper Discharged Flue Gas Temperature Transmitter Failure"));

        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 254, 2, "Discharged Flue Gas Temperature Transmitter Failure"));

        map.put("ex_lushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lushuiwenduchuanganqiguzhang", 256, 2, "Boiler Water Temperature Transmitter Failure"));

        map.put("ex_chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouwenduchuanganqiguzhang", 258, 2, "Outlet Temperature Transmitter Failure"));

        map.put("ex_rukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_rukouwenduchuanganqiguzhang", 260, 2, "Inlet Temperature Transmitter Failure"));

        map.put("ex_jienengqichukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqichukouwenduchuanganqiguzhang", 262, 2, "Economizer Outlet Temperature Transmitter Failure( water)"));

        map.put("ex_jienengqirukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqirukouwenduchuanganqiguzhang", 264, 2, "Economizer Inlet Temperature Transmitter Failure( Water)"));

        map.put("ex_jishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiwenduchuanganqiguzhang", 266, 2, "Feeding Water Temperature Transmitter Failure"));

        map.put("ex_lutangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangwenduchuanganqiguzhang", 268, 2, "Furnace Temperature Transmitter Failure"));

        map.put("ex_lutangchukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouwenduchuanganqiguzhang", 270, 2, "Furnace Outlet Temperature Transmitter Failure"));

        map.put("ex_lubiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lubiwenduchuanganqiguzhang", 272, 2, "Furnace Wall Temperature Transmitter Failure"));

        map.put("ex_ranliaowenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranliaowenduchuanganqiguzhang", 274, 2, "Fuel Temperature Transmitter Failure"));

        map.put("ex_refengwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_refengwenduchuanganqiguzhang", 276, 2, "Hot Air Temperature Transmitter Failure( Air Pre-heater Outlet)"));

        map.put("ex_fuyazhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwenduchuanganqiguzhang", 278, 2, "Negative Pressure Steam Temperature Transmitter Failure"));

        map.put("ex_guorezhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiwenduchuanganqiguzhang", 280, 2, "Super-heated Steam Temperature Transmitter Failure"));

        map.put("ex_huilu1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1wenduchuanganqiguzhang", 282, 2, "Loop 1:Temperature Transmitter Failure"));

        map.put("ex_huilu2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2wenduchuanganqiguzhang", 284, 2, "Loop 2:Temperature Transmitter Failure"));

        map.put("ex_huilu3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3wenduchuanganqiguzhang", 286, 2, "Loop 3:Temperature Transmitter Failure"));

        map.put("ex_huilu4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4wenduchuanganqiguzhang", 288, 2, "Loop 4:Temperature Transmitter Failure"));

        map.put("ex_huilu5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5wenduchuanganqiguzhang", 290, 2, "Loop 5:Temperature Transmitter Failure"));

        map.put("ex_shiwaiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shiwaiwenduchuanganqiguzhang", 292, 2, "Outdoor Temperature Transmitter Failure"));

        map.put("ex_zhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiyalichuanganqiguzhang", 294, 2, "Steam Pressure Transmitter Failure"));

        map.put("ex_jishuiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiyalichuanganqiguzhang", 296, 2, "Feeding Water Pressure Transmitter Failure"));

        map.put("ex_chukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouyalichuanganqiguzhang", 298, 2, "Outlet Pressure Transmitter Failure"));

        map.put("ex_rukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_rukouyalichuanganqiguzhang", 300, 2, "Inlet Pressure Transmitter Failure"));

        map.put("ex_lutangyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangyalichuanganqiguzhang", 302, 2, "Furnace Pressure Transmitter Failure"));

        map.put("ex_lutangchukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouyalichuanganqiguzhang", 304, 2, "Furnace Outlet Pressure Transmitter Failure"));

        map.put("ex_ranqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranqiyalichuanganqiguzhang", 306, 2, "Gas Pressure Transmitter Failure"));

        map.put("ex_yicifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yicifengyachuanganqiguzhang", 308, 2, "Primary Air Pressure Transmitter Failure"));

        map.put("ex_ecifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecifengyachuanganqiguzhang", 310, 2, "Secondary Air Pressure Transmitter Failure"));

        map.put("ex_ranliaoliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranliaoliangchuanganqiguzhang", 312, 2, "Fuel Quantity Transmitter Failure(instantaneous value)"));

        map.put("ex_zhengqiliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiliuliangchuanganqiguzhang", 314, 2, "Steam Flow Rate Transmitter Failure (instantaneous value)"));

        map.put("ex_jishuiliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiliuliangchuanganqiguzhang", 316, 2, "Feeding Water Flow Rate Transmitter Failure(instantaneous value)"));

        map.put("ex_xunhuanliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanliuliangchuanganqiguzhang", 318, 2, "Circulating Flow Rate Transmitter Failture(instantaneous value)"));

        map.put("ex_bushuiliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_bushuiliuliangchuanganqiguzhang", 320, 2, "Make-up Water Flow Rate Transmitter Failure (instantaneous value)"));

        map.put("ex_guoluyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guoluyeweichuanganqiguzhang", 322, 2, "Boiler Water Level Transmitter Failure"));

        map.put("ex_shuixiangyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangyeweichuanganqiguzhang", 324, 2, "Water Tank Water Level Transmitter Failure"));

        map.put("ex_paiyanyanghanliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanyanghanliangchuanganqiguzhang", 326, 2, "Discharged Flue Gas Oxygen Content Transmitter Failure "));

        map.put("ex_lupaisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lupaisudufankuichuanganqiguzhang", 328, 2, "Chain Grate Speed Feedback Transmitter Failure"));

        map.put("ex_yinfengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengshuchufankuichuanganqiguzhang", 330, 2, "Induced Air Output Feedback Transmitter Failure"));

        map.put("ex_gufengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengshuchufankuichuanganqiguzhang", 332, 2, "FD Air Feedback Transmitter Failure"));

        map.put("ex_jishuishuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuishuchufankuichuanganqiguzhang", 334, 2, "Water Feeding Pump Output Feedback Transmitter Failure"));

        map.put("ex_meishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_meishuiwenduchuanganqiguzhang", 336, 2, "Medium Water Temperature Transmitter Failure "));

        map.put("ex_shuixiangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangwenduchuanganqiguzhang", 338, 2, "Water Tank Temperature Transmitter Failure"));

        map.put("ex_pengzhangguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweichuanganqiguzhang", 340, 2, "Expansion Tank Water Level Transmitter Failure"));

        map.put("ex_shanzhengguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweichuanganqiguzhang", 342, 2, "Flash Tank Water Level Transmitter Failure"));

        map.put("ex_lengningyeguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanyeweichuanganqiguzhang", 344, 2, "Condensing Tank  Water Level Transmitter Failure"));

        map.put("ex_chuguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanyeweichuanganqiguzhang", 346, 2, "Storage Tank Water Level Transmitter Failure"));

        map.put("ex_pengzhangguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanwenduchuanganqiguzhang", 348, 2, "Expansion Tank Temperature Transmitter Failure"));

        map.put("ex_shanzhengguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanwenduchuanganqiguzhang", 350, 2, "Flash Tank Temperature Transmitter Failure"));

        map.put("ex_lengningyeguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanwenduchuanganqiguzhang", 350, 2, "Condensing Tank Temperature Transmitter Failure"));

        map.put("ex_chuguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanwenduchuanganqiguzhang", 354, 2, "Storage Tank Temperature Transmitter Failure"));

        map.put("ex_guoluyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guoluyalichuanganqiguzhang", 356, 2, "System Pressure Transmitter Failure"));

        map.put("ex_guorezhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiyalichuanganqiguzhang", 358, 2, "Super-heated Steam Pressure Transmitter Failure"));

        map.put("ex_paiyanchuyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanchuyalichuanganqiguzhang", 360, 2, "Flue Gas Discharged Place Pressure Pressure Transmitter Failure"));

        map.put("ex_fengshifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fengshifengyachuanganqiguzhang", 362, 2, "Air Compartment Air Pressure Transmitter Failure"));

        map.put("ex_yinfengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengjidianliuchuanganqiguzhang", 364, 2, "ID Fan Electric Current Transmitter Failure"));

        map.put("ex_gufengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengjidianliuchuanganqiguzhang", 366, 2, "FD Fan Electric Current Transmitter Failure"));

        map.put("ex_jiliaojisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jiliaojisudufankuichuanganqiguzhang", 368, 2, "Fuel Feeder Speed Feedback Transmitter Failure"));

        map.put("ex_panguan1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan1wenduchuanganqiguzhang", 370, 2, "Coil 1 Temperature Transmitter Failure"));

        map.put("ex_panguan2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan2wenduchuanganqiguzhang", 372, 2, "Coil 2 Temperature Transmitter Failure"));

        map.put("ex_panguan3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan3wenduchuanganqiguzhang", 374, 2, "Coil 3 Temperature Transmitter Failure"));

        map.put("ex_panguan4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan4wenduchuanganqiguzhang", 376, 2, "Coil 4 Temperature Transmitter Failure"));

        map.put("ex_panguan5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan5wenduchuanganqiguzhang", 378, 2, "Coil 5 Temperature Transmitter Failure"));

        map.put("ex_panguan6wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan6wenduchuanganqiguzhang", 380, 2, "Coil 6 Temperature Transmitter Failure"));

        map.put("ex_panguan7wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan7wenduchuanganqiguzhang", 382, 2, "Coil 7 Temperature Transmitter Failure"));

        map.put("ex_panguan8wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan8wenduchuanganqiguzhang", 384, 2, "Coil 8 Temperature Transmitter Failure"));

        map.put("ex_panguan9wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan9wenduchuanganqiguzhang", 386, 2, "Coil 9 Temperature Transmitter Failure"));

        map.put("ex_panguan10wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan10wenduchuanganqiguzhang", 388, 2, "Coil 10 Temperature Transmitter Failure"));

        map.put("mo_bentipaiyanwendu", ByteField.Init(new MockField(), "mo_bentipaiyanwendu", 277, 395, "Boiler Proper Discharged Flue Gas Temperature", "℃"));

        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 397, 2, "Discharged Flue Gas Temperature", "℃"));

        map.put("mo_lushuiwendu", ByteField.Init(new MockField(), "mo_lushuiwendu", 399, 2, "Boiler Water Temperature", "℃"));

        map.put("mo_chukouwendu", ByteField.Init(new MockField(), "mo_chukouwendu", 401, 2, "Outlet Temperature", "℃"));

        map.put("mo_rukouwendu", ByteField.Init(new MockField(), "mo_rukouwendu", 403, 2, "Inlet Temperature", "℃"));

        map.put("mo_jienengqichukouwendu", ByteField.Init(new MockField(), "mo_jienengqichukouwendu", 405, 2, "Economizer Outlet Temperature (Water)", "℃"));

        map.put("mo_jienengqirukouwendu", ByteField.Init(new MockField(), "mo_jienengqirukouwendu", 407, 2, "Economizer Inlet Temperature (Water)", "℃"));

        map.put("mo_jishuiwendu", ByteField.Init(new MockField(), "mo_jishuiwendu", 409, 2, "Feeding Water Temperature", "℃"));

        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 411, 2, "Furnace Temperature", "℃"));

        map.put("mo_lutangchukouwendu", ByteField.Init(new MockField(), "mo_lutangchukouwendu", 413, 2, "Furnace Outlet Temperature", "℃"));

        map.put("mo_lubiwendu", ByteField.Init(new MockField(), "mo_lubiwendu", 415, 2, "Furnace Wall Temperature", "℃"));

        map.put("mo_ranliaowendu", ByteField.Init(new MockField(), "mo_ranliaowendu", 417, 2, "Fuel Temperature", "℃"));

        map.put("mo_refengwendu", ByteField.Init(new MockField(), "mo_refengwendu", 419, 2, "Hot Air Temperature e( Air Pre-heater Outlet)", "℃"));

        map.put("mo_fuyazhengqiwendu", ByteField.Init(new MockField(), "mo_fuyazhengqiwendu", 421, 2, "Negative Pressure  Steam Temperature", "℃"));

        map.put("mo_guorezhengqiwendu", ByteField.Init(new MockField(), "mo_guorezhengqiwendu", 423, 2, "Super-heated Steam Temperature", "℃"));

        map.put("mo_huilu1wendu", ByteField.Init(new MockField(), "mo_huilu1wendu", 425, 2, "Loop 1:Temperature", "℃"));

        map.put("mo_huilu2wendu", ByteField.Init(new MockField(), "mo_huilu2wendu", 427, 2, "Loop 2:Temperature", "℃"));

        map.put("mo_huilu3wendu", ByteField.Init(new MockField(), "mo_huilu3wendu", 429, 2, "Loop 3:Temperature", "℃"));

        map.put("mo_huilu4wendu", ByteField.Init(new MockField(), "mo_huilu4wendu", 431, 2, "Loop 4:Temperature", "℃"));

        map.put("mo_huilu5wendu", ByteField.Init(new MockField(), "mo_huilu5wendu", 433, 2, "Loop 5:Temperature", "℃"));

        map.put("mo_shiwaiwendu", ByteField.Init(new MockField(), "mo_shiwaiwendu", 435, 2, "Outdoor Temperature", "℃"));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 437, 2, "Steam Pressure", "MPa", 100));

        map.put("mo_jishuiyali", ByteField.Init(new MockField(), "mo_jishuiyali", 439, 2, "Feeding Water Pressure", "MPa", 100));

        map.put("mo_chukouyali", ByteField.Init(new MockField(), "mo_chukouyali", 441, 2, "Outlet Pressure", "MPa", 100));

        map.put("mo_rukouyali", ByteField.Init(new MockField(), "mo_rukouyali", 443, 2, "Inlet Pressure", "MPa", 100));

        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 445, 2, "Furnace Pressure", "Pa"));

        map.put("mo_lutangchukouyali", ByteField.Init(new MockField(), "mo_lutangchukouyali", 447, 2, "Furnace Outlet Pressure", "Pa"));

        map.put("mo_ranqiyali", ByteField.Init(new MockField(), "mo_ranqiyali", 449, 2, "Gas Pressure", "KPa"));

        map.put("mo_yicifengya", ByteField.Init(new MockField(), "mo_yicifengya", 451, 2, "Primary Air Pressure", "KPa"));

        map.put("mo_ecifengya", ByteField.Init(new MockField(), "mo_ecifengya", 453, 2, "Secondary Air Pressure", "KPa"));

        map.put("mo_ranliaoliang", ByteField.Init(new MockField(), "mo_ranliaoliang", 455, 2, "Fuel Quantity(instantaneous value)"));

        map.put("mo_zhengqiliuliang", ByteField.Init(new MockField(), "mo_zhengqiliuliang", 457, 2, "Steam Flow Rate (instantaneous value)"));

        map.put("mo_jishuiliuliang", ByteField.Init(new MockField(), "mo_jishuiliuliang", 459, 2, "Feeding Water Flow Rate (instantaneous value)"));

        map.put("mo_xunhuanliuliang", ByteField.Init(new MockField(), "mo_xunhuanliuliang", 461, 2, "Circulating Flow Rate (instantaneous value)"));

        map.put("mo_bushuiliuliang", ByteField.Init(new MockField(), "mo_bushuiliuliang", 463, 2, "Make-up Water Flow Rate (instantaneous value)"));

        map.put("mo_guoluyewei", ByteField.Init(new MockField(), "mo_guoluyewei", 465, 2, "Boiler Water Level", "mm"));

        map.put("mo_shuixiangyewei", ByteField.Init(new MockField(), "mo_shuixiangyewei", 467, 2, "Water Tank Water Level", "mm"));

        map.put("mo_paiyanyanghanliang", ByteField.Init(new MockField(), "mo_paiyanyanghanliang", 469, 2, "Discharged Flue Gas Oxygen Content", "%", 10));

        map.put("mo_lupaisudufankui", ByteField.Init(new MockField(), "mo_lupaisudufankui", 471, 2, "Chain Grate Speed Feedback", "%"));

        map.put("mo_yinfengshuchufankui", ByteField.Init(new MockField(), "mo_yinfengshuchufankui", 473, 2, "Induced Air Output Feedback", "%"));

        map.put("mo_gufengshuchufankui", ByteField.Init(new MockField(), "mo_gufengshuchufankui", 475, 2, "FD Air Feedback", "%"));

        map.put("mo_jishuishuchufankui", ByteField.Init(new MockField(), "mo_jishuishuchufankui", 477, 2, "Water Feeding Pump Output Feedback", "%"));

        map.put("mo_meishuiwendu", ByteField.Init(new MockField(), "mo_meishuiwendu", 479, 2, "Medium Water Temperature", "℃"));

        map.put("mo_shuixiangwendu", ByteField.Init(new MockField(), "mo_shuixiangwendu", 481, 2, "Water Tank Temperature", "℃"));

        map.put("mo_pengzhangguanyewei", ByteField.Init(new MockField(), "mo_pengzhangguanyewei", 483, 2, "Expansion Tank Water Level", "mm"));

        map.put("mo_shanzhengguanyewei", ByteField.Init(new MockField(), "mo_shanzhengguanyewei", 485, 2, "Flash Tank Water Level", "mm"));

        map.put("mo_lengningyeguanyewei", ByteField.Init(new MockField(), "mo_lengningyeguanyewei", 487, 2, "Condensing Tank  Water Level", "mm"));

        map.put("mo_chuguanyewei", ByteField.Init(new MockField(), "mo_chuguanyewei", 489, 2, "Storage Tank Water Level", "mm"));

        map.put("mo_pengzhangguanwendu", ByteField.Init(new MockField(), "mo_pengzhangguanwendu", 491, 2, "Expansion Tank Temperature", "℃"));

        map.put("mo_shanzhengguanwendu", ByteField.Init(new MockField(), "mo_shanzhengguanwendu", 493, 2, "Flash Tank Temperature", "℃"));

        map.put("mo_lengningyeguanwendu", ByteField.Init(new MockField(), "mo_lengningyeguanwendu", 495, 2, "Condensing Tank Temperature", "℃"));

        map.put("mo_chuguanwendu", ByteField.Init(new MockField(), "mo_chuguanwendu", 497, 2, "Storage Tank Temperature", "℃"));

        map.put("mo_guoluyali", ByteField.Init(new MockField(), "mo_guoluyali", 499, 2, "System Pressure (for Pressure-bearing hot water boiler)", "MPa", 100));

        map.put("mo_guorezhengqiyali", ByteField.Init(new MockField(), "mo_guorezhengqiyali", 501, 2, "Super-heated Steam Pressure", "MPa", 100));

        map.put("mo_paiyanchuyali", ByteField.Init(new MockField(), "mo_paiyanchuyali", 503, 2, "Flue Gas Discharged Place Pressure", "Pa"));

        map.put("mo_fengshifengya", ByteField.Init(new MockField(), "mo_fengshifengya", 505, 2, "Air Compartment Air Pressure", "KPa"));

        map.put("mo_yinfengjidianliu", ByteField.Init(new MockField(), "mo_yinfengjidianliu", 507, 2, "ID Fan Electric Current", "A"));

        map.put("mo_gufengjidianliu", ByteField.Init(new MockField(), "mo_gufengjidianliu", 509, 2, "FD Fan Electric Current", "A"));

        map.put("mo_jiliaojisudufankui", ByteField.Init(new MockField(), "mo_jiliaojisudufankui", 511, 2, "Fuel Feeder Speed Feedback", "%"));

        map.put("mo_panguan1wendu", ByteField.Init(new MockField(), "mo_panguan1wendu", 513, 2, "Coil 1 Temperature", "℃"));

        map.put("mo_panguan2wendu", ByteField.Init(new MockField(), "mo_panguan2wendu", 515, 2, "Coil 2 Temperature", "℃"));

        map.put("mo_panguan3wendu", ByteField.Init(new MockField(), "mo_panguan3wendu", 517, 2, "Coil 3 Temperature", "℃"));

        map.put("mo_panguan4wendu", ByteField.Init(new MockField(), "mo_panguan4wendu", 519, 2, "Coil 4 Temperature", "℃"));

        map.put("mo_panguan5wendu", ByteField.Init(new MockField(), "mo_panguan5wendu", 521, 2, "Coil 5 Temperature", "℃"));

        map.put("mo_panguan6wendu", ByteField.Init(new MockField(), "mo_panguan6wendu", 523, 2, "Coil 6 Temperature", "℃"));

        map.put("mo_panguan7wendu", ByteField.Init(new MockField(), "mo_panguan7wendu", 525, 2, "Coil 7 Temperature", "℃"));

        map.put("mo_panguan8wendu", ByteField.Init(new MockField(), "mo_panguan8wendu", 527, 2, "Coil 8 Temperature", "℃"));

        map.put("mo_panguan9wendu", ByteField.Init(new MockField(), "mo_panguan9wendu", 529, 2, "Coil 9 Temperature", "℃"));

        map.put("mo_panguan10wendu", ByteField.Init(new MockField(), "mo_panguan10wendu", 531, 2, "Coil 10 Temperature度", "℃"));

        map.put("se_paiyanwendu", ByteField.Init(new SettingField(), "se_paiyanwendu", 538, 2, "Boiler Proper Flus Gas Discharged Temperature", "℃"));

        map.put("se_baojingwendu", ByteField.Init(new SettingField(), "se_baojingwendu", 540, 2, "Alarm Temperature", "℃"));

        map.put("se_tingluwendu", ByteField.Init(new SettingField(), "se_tingluwendu", 542, 2, "Boiler Shutdown Temperature", "℃"));

        map.put("se_mubiaowendu", ByteField.Init(new SettingField(), "se_mubiaowendu", 544, 2, "Target Temperature", "℃"));

        map.put("se_qiluwendu", ByteField.Init(new SettingField(), "se_qiluwendu", 546, 2, "Boiler Start Temperature", "℃"));

        map.put("se_zhuanhuohuichawendu", ByteField.Init(new SettingField(), "se_zhuanhuohuichawendu", 548, 2, "Fire Regulating Backlash", "℃"));

        map.put("se_qiluhuichawendu", ByteField.Init(new SettingField(), "se_qiluhuichawendu", 550, 2, "Boiler Start Backlash", "℃"));

        map.put("se_kaibengwendu", ByteField.Init(new SettingField(), "se_kaibengwendu", 552, 2, "Pump On Temperature", "℃"));

        map.put("se_guanbengwendu", ByteField.Init(new SettingField(), "se_guanbengwendu", 554, 2, "Pump Off Temperature", "℃"));

        map.put("se_baojingyali", ByteField.Init(new SettingField(), "se_baojingyali", 556, 2, "Alarm Pressure", "MPa", 100));

        map.put("se_tingluyali", ByteField.Init(new SettingField(), "se_tingluyali", 558, 2, "Boiler Shutdown Pressure", "MPa", 100));

        map.put("se_mubiaoyali", ByteField.Init(new SettingField(), "se_mubiaoyali", 560, 2, "Target Pressure", "MPa", 100));

        map.put("se_qiluyali", ByteField.Init(new SettingField(), "se_qiluyali", 562, 2, "Boiler Start Pressure", "MPa", 100));

        map.put("se_zhuanhuohuichayali", ByteField.Init(new SettingField(), "se_zhuanhuohuichayali", 564, 2, "Fire Regulating Backlash( Pressure)", "MPa", 100));

        map.put("se_qiluhuichayali", ByteField.Init(new SettingField(), "se_qiluhuichayali", 566, 2, "Boiler Start Backlash( Pressure)", "MPa", 100));

        map.put("se_qianyanshi", ByteField.Init(new SettingField(), "se_qianyanshi", 568, 2, "Pre-delay", "S"));

        map.put("se_houyanshimiao", ByteField.Init(new SettingField(), "se_houyanshimiao", 570, 2, "Post-delay", "S"));

        map.put("se_qianchuisao", ByteField.Init(new SettingField(), "se_qianchuisao", 572, 2, "Front Blowing", "S"));

        map.put("se_houchuisao", ByteField.Init(new SettingField(), "se_houchuisao", 574, 2, "Rear Blowing", "S"));

        map.put("se_lubibaojingwendu", ByteField.Init(new SettingField(), "se_lubibaojingwendu", 576, 2, "Furnace Wall Alarm Temperature", "℃"));

        map.put("se_lutangchukoubaojingwendu", ByteField.Init(new SettingField(), "se_lutangchukoubaojingwendu", 578, 2, "Furnace Outlet Temperature", "℃"));

        map.put("se_baohuwendu", ByteField.Init(new SettingField(), "se_baohuwendu", 580, 2, "Protection Temperature", "℃"));

        map.put("se_bentipaiyanwendubaojingzhi", ByteField.Init(new SettingField(), "se_bentipaiyanwendubaojingzhi", 582, 2, "Boiler Proper Flus Gas Discharged Temperature", "℃"));

        map.put("se_jiarezushu", ByteField.Init(new SettingField(), "se_jiarezushu", 584, 2, "Heating Blocks Qty"));

        map.put("se_jianceyalishijian", ByteField.Init(new SettingField(), "se_jianceyalishijian", 586, 2, "Pressure Detection Time"));

        map.put("se_houyanshifen", ByteField.Init(new SettingField(), "se_houyanshifen", 588, 2, "Post-delay", "m"));

        map.put("se_shedingwendu", ByteField.Init(new SettingField(), "se_shedingwendu", 560, 2, "Setting Temperature", "℃"));

        map.put("se_mokuailutaishu", ByteField.Init(new SettingField(), "se_mokuailutaishu", 592, 2, "模块炉台数"));

        map.put("se_gufenghouyanshi", ByteField.Init(new SettingField(), "se_gufenghouyanshi", 594, 2, "FD Fan Post-delay", "S"));

        map.put("se_yinfenghouyanshi", ByteField.Init(new SettingField(), "se_yinfenghouyanshi", 596, 2, "ID Fan Post-delay", "S"));

        map.put("se_shuixiangkaibengwendu", ByteField.Init(new SettingField(), "se_shuixiangkaibengwendu", 598, 2, "Water Tank Pump On Temperature", "℃"));

        map.put("se_shuixiangguanbengwendu", ByteField.Init(new SettingField(), "se_shuixiangguanbengwendu", 600, 2, "Water Tank Pump-off Temperature", "℃"));

        map.put("se_lushuibaojingwendu", ByteField.Init(new SettingField(), "se_lushuibaojingwendu", 602, 2, "Water Alarm Temperature", "℃"));

        map.put("se_buchangxishu", ByteField.Init(new SettingField(), "se_buchangxishu", 604, 2, "Compensation Factor"));

        map.put("se_cankaowendu", ByteField.Init(new SettingField(), "se_cankaowendu", 606, 2, "Reference Temperature", "℃"));

        map.put("se_tingluzuidazhi", ByteField.Init(new SettingField(), "se_tingluzuidazhi", 608, 2, "Boiler Shutdown Maxi Temperature", "℃"));

        map.put("se_qiluzuixiaozhi", ByteField.Init(new SettingField(), "se_qiluzuixiaozhi", 610, 2, "Boiler Start Mini Temperature", "℃"));

        map.put("se_cankaohuicha", ByteField.Init(new SettingField(), "se_cankaohuicha", 612, 2, "Reference Backlash", "℃"));

        map.put("se_tingluwendu1", ByteField.Init(new SettingField(), "se_tingluwendu1", 614, 2, "Boiler Shutdown Temperature 1", "℃"));

        map.put("se_qiluwendu1", ByteField.Init(new SettingField(), "se_qiluwendu1", 616, 2, "Boiler Start Temperature 1", "℃"));

        map.put("se_tingluwendu2", ByteField.Init(new SettingField(), "se_tingluwendu2", 618, 2, "Boiler Shutdown Temperature 2", "℃"));

        map.put("se_qiluwendu2", ByteField.Init(new SettingField(), "se_qiluwendu2", 620, 2, "Boiler Start Temperature 2", "℃"));

        map.put("se_yusongliaoshijian", ByteField.Init(new SettingField(), "se_yusongliaoshijian", 622, 2, "Pre-fuel-feeding Time", "S"));

        map.put("se_dianhuoshijian", ByteField.Init(new SettingField(), "se_dianhuoshijian", 624, 2, "Ignition Duration", "S"));

        map.put("se_songliaoqidongshijian", ByteField.Init(new SettingField(), "se_songliaoqidongshijian", 626, 2, "Fuel Feeding Start Time", "S"));

        map.put("se_songliaotingzhishijian", ByteField.Init(new SettingField(), "se_songliaotingzhishijian", 628, 2, "Fuel Feeding Stop Time", "S"));

        map.put("se_dianhuojiange", ByteField.Init(new SettingField(), "se_dianhuojiange", 630, 2, "Ignition Interval", "m"));

        map.put("se_dianhuochenggongwendu", ByteField.Init(new SettingField(), "se_dianhuochenggongwendu", 632, 2, "Successful Ignition Temperature", "℃"));

        map.put("se_lushuitingluwendu", ByteField.Init(new SettingField(), "se_lushuitingluwendu", 634, 2, "Boiler Water Temperature When Boiler Shutdown", "℃"));

        map.put("se_lushuiqiluwendu", ByteField.Init(new SettingField(), "se_lushuiqiluwendu", 636, 2, "Boiler Water When Boiler Start", "℃"));

        map.put("se_meishuibaojingwendu", ByteField.Init(new SettingField(), "se_meishuibaojingwendu", 638, 2, "Medium Water Alarm Temperature", "℃"));

        map.put("se_meishuitingluwendu", ByteField.Init(new SettingField(), "se_meishuitingluwendu", 640, 2, "Medium Water Temperature when Boiler Shutdown", "℃"));

        map.put("se_meishuiqiluwendu", ByteField.Init(new SettingField(), "se_meishuiqiluwendu", 642, 2, "Medium Water Temperature When Boiler Start", "℃"));

        map.put("se_kaibengyali", ByteField.Init(new SettingField(), "se_kaibengyali", 644, 2, "Pump On Pressure( Used for Fixed-pressure control)", "MPa", 100));

        map.put("se_guanbengyali", ByteField.Init(new SettingField(), "se_guanbengyali", 646, 2, "Pump-off Pressure ( Used for fixed-pressure control)", "MPa", 100));

        map.put("se_panguanbaojingwendu", ByteField.Init(new SettingField(), "se_panguanbaojingwendu", 648, 2, "Coil Alarm Temperature", "℃"));

        map.put("se_huilu1baojingwendu", ByteField.Init(new SettingField(), "se_huilu1baojingwendu", 650, 2, "Loop 1 Alarm Temperature", "℃"));

        map.put("se_huilu1kaibengwendu", ByteField.Init(new SettingField(), "se_huilu1kaibengwendu", 652, 2, "Loop 1 Pump-on Temperature", "℃"));

        map.put("se_huilu1guanbengwendu", ByteField.Init(new SettingField(), "se_huilu1guanbengwendu", 654, 2, "Loop 2 Pump-off Temperature", "℃"));

        map.put("se_huilu2baojingwendu", ByteField.Init(new SettingField(), "se_huilu2baojingwendu", 656, 2, "Loop 2 Alarm Temperature", "℃"));

        map.put("se_huilu2kaibengwendu", ByteField.Init(new SettingField(), "se_huilu2kaibengwendu", 658, 2, "Loop 2 Pump-on Temperature", "℃"));

        map.put("se_huilu2guanbengwendu", ByteField.Init(new SettingField(), "se_huilu2guanbengwendu", 660, 2, "Loop 2 Pump-off Temperature", "℃"));

        map.put("se_huilu3baojingwendu", ByteField.Init(new SettingField(), "se_huilu3baojingwendu", 662, 2, "Loop 3 Alarm Temperature", "℃"));

        map.put("se_huilu3kaibengwendu", ByteField.Init(new SettingField(), "se_huilu3kaibengwendu", 664, 2, "Loop 3 Pump-on Temperature", "℃"));

        map.put("se_huilu3guanbengwendu", ByteField.Init(new SettingField(), "se_huilu3guanbengwendu", 666, 2, "Loop 3 Pump-off Temperature", "℃"));

        map.put("se_huilu4baojingwendu", ByteField.Init(new SettingField(), "se_huilu4baojingwendu", 668, 2, "Loop 4 Alarm Temperature", "℃"));

        map.put("se_huilu4kaibengwendu", ByteField.Init(new SettingField(), "se_huilu4kaibengwendu", 670, 2, "Loop 4 Pump-on Temperature", "℃"));

        map.put("se_huilu4guanbengwendu", ByteField.Init(new SettingField(), "se_huilu4guanbengwendu", 672, 2, "Loop 4 Pump-off Temperature", "℃"));

        map.put("se_huilu5baojingwendu", ByteField.Init(new SettingField(), "se_huilu5baojingwendu", 674, 2, "Loop 5 Alarm Temperature", "℃"));

        map.put("se_huilu5kaibengwendu", ByteField.Init(new SettingField(), "se_huilu5kaibengwendu", 676, 2, "Loop 5 Pump-on Temperature", "℃"));

        map.put("se_huilu5guanbengwendu", ByteField.Init(new SettingField(), "se_huilu5guanbengwendu", 678, 2, "Loop 5 Pump-off Temperature", "℃"));

        map.put("st_qidongshijian1", ByteField.Init(new StartStopField(), "st_qidongshijian1", 685, 2, "Start Time 1"));

        map.put("st_tingzhishijian1", ByteField.Init(new StartStopField(), "st_tingzhishijian1", 687, 2, "Stop Time 1"));

        map.put("st_qidongshijian2", ByteField.Init(new StartStopField(), "st_qidongshijian2", 689, 2, "Start Time 2"));

        map.put("st_tingzhishijian2", ByteField.Init(new StartStopField(), "st_tingzhishijian2", 691, 2, "Stop Time 2"));

        map.put("st_qidongshijian3", ByteField.Init(new StartStopField(), "st_qidongshijian3", 693, 2, "Start Time 3"));

        map.put("st_tingzhishijian3", ByteField.Init(new StartStopField(), "st_tingzhishijian3", 695, 2, "Stop Time 3"));

        map.put("st_qidongshijian4", ByteField.Init(new StartStopField(), "st_qidongshijian4", 697, 2, "Start Time 4"));

        map.put("st_tingzhishijian4", ByteField.Init(new StartStopField(), "st_tingzhishijian4", 699, 2, "Stop Time 4"));

        map.put("st_qidongshijian5", ByteField.Init(new StartStopField(), "st_qidongshijian5", 701, 2, "Start Time 5"));

        map.put("st_tingzhishijian5", ByteField.Init(new StartStopField(), "st_tingzhishijian5", 703, 2, "Stop Time 5"));

        map.put("st_qidongshijian6", ByteField.Init(new StartStopField(), "st_qidongshijian6", 705, 2, "Start Time 6"));

        map.put("st_tingzhishijian6", ByteField.Init(new StartStopField(), "st_tingzhishijian6", 707, 2, "Stop Time 6"));

        map.put("de_ranshaoqi", ByteField.Init(new RanShaoQiField(), "de_ranshaoqi", 714, 2, "Burner", CTL_NJZJ_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("de_jiarezu", ByteField.Init(new DeviceField(), "de_jiarezu", 716, 2, "Heating Blocks", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_bushui_beng", ByteField.Init(new DeviceField(), "de_bushui_beng", 718, 2, "Make-up Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_jishui_beng", ByteField.Init(new DeviceField(), "de_jishui_beng", 720, 2, "Water Feeding Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_buyou_beng", ByteField.Init(new DeviceField(), "de_buyou_beng", 722, 2, "Make-up Oil Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_xunhuan_beng", ByteField.Init(new DeviceField(), "de_xunhuan_beng", 724, 2, "Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_lengning_beng", ByteField.Init(new DeviceField(), "de_lengning_beng", 726, 2, "Condensening Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_reshui_beng", ByteField.Init(new DeviceField(), "de_reshui_beng", 728, 2, "Hot Water Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_zhenkong_beng", ByteField.Init(new DeviceField(), "de_zhenkong_beng", 730, 2, "Vocuum Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_ecixunhuan_beng", ByteField.Init(new DeviceField(), "de_ecixunhuan_beng", 732, 2, "Secondary Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_yinfengji_fan", ByteField.Init(new DeviceField(), "de_yinfengji_fan", 734, 2, "ID Fan", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_gufengji_fan", ByteField.Init(new DeviceField(), "de_gufengji_fan", 736, 2, "FD Fan", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_lupai", ByteField.Init(new DeviceField(), "de_lupai", 738, 2, "Chain Grate", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_chuzhaji", ByteField.Init(new DeviceField(), "de_chuzhaji", 740, 2, "Slag Remover", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_ecigufengji_fan", ByteField.Init(new DeviceField(), "de_ecigufengji_fan", 742, 2, "Secondary FD Fan", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_dianhuoqi", ByteField.Init(new DeviceField(), "de_dianhuoqi", 744, 2, "Igniter", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_shangmeiji", ByteField.Init(new DeviceField(), "de_shangmeiji", 746, 2, "Coal Conveyor", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_songliaoji", ByteField.Init(new DeviceField(), "de_songliaoji", 748, 2, "Fuel Feeder", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_jiayao_beng", ByteField.Init(new DeviceField(), "de_jiayao_beng", 750, 2, "Dosing Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_paiwufa", ByteField.Init(new DeviceField(), "de_paiwufa", 752, 2, "Blowdown Valve", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu1xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu1xunhuan_beng", 754, 2, "Loop 1 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu2xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu2xunhuan_beng", 756, 2, "Loop 2 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu3xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu3xunhuan_beng", 758, 2, "Loop 3 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu4xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu4xunhuan_beng", 760, 2, "Loop 4 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu5xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu5xunhuan_beng", 762, 2, "Loop 5 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

    }
}
