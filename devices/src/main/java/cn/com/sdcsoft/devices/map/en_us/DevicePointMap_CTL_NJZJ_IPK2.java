package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJZJ.*;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_NJZJ_IPK2 extends DevicePointMap {
    public static final String Key = "CTL_NJZJ_IPK2";

    public DevicePointMap_CTL_NJZJ_IPK2() {
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 20, 1, "Running State", CTL_NJZJ_Common_ValueMaps.coms_status));

        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new RunDaysField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 21, 2, "Running Days", "Day"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 23, 1, "Running Hours", "Hour"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new PowerField(), SdcSoftDevice.KEY_POINT_POWER, 24, 1, "Fuel Type", coms_power));

        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 25, 1, " Medium Type", coms_media));

        map.put("ba_guolushuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_guolushuiweizhuangtai", 26, 1, "Boiler Water Level State", coms_level));

        map.put("ba_shuixiangshuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuixiangshuiweizhuangtai", 27, 1, "Water Tank Water Level State", coms_level));

        map.put("ba_guoluyalizhuangtai", ByteField.Init(new BaseInfoField(), "ba_guoluyalizhuangtai", 28, 1, " Boiler Pressure State", CTL_NJZJ_Common_ValueMaps.coms_yalistatus));
        map.put("ba_moshibianhao", ByteField.Init(new BaseInfoField(), "ba_moshibianhao", 29, 1, " Pattern Code"));
        map.put("ba_fangdongkaiguan", ByteField.Init(new BaseInfoField(), "ba_fangdongkaiguan", 30, 1, " Antifreeze Switch", coms_open_close));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 32, 1, "High Discharged Flue Gas Temperature Alarm"));
        map.put("ex_lushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lushuiwendugaobaojing", 33, 1, "High Boiler Water Temperature Alarm"));

        map.put("ex_chukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chukouwendugaobaojing", 34, 1, "High Outlet Temperature Alarm"));

        map.put("ex_chaoyabaojing", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing", 35, 1, "Overpressure Alarm"));

        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 36, 1, "Extreme Low Water Level Alarm"));

        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 37, 1, " Low Water Level Alarm"));

        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 38, 1, " Low Water Level Alarm"));

        map.put("ex_shuiweixinhaoluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuiweixinhaoluojicuobaojing", 39, 1, "Water Level Signal Logic Error Alarm"));

        map.put("ex_lubiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lubiwendugaobaojing", 40, 1, "High Furnace Wall Temperature Alarm"));

        map.put("ex_fuyazhengqiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwendugaobaojing", 41, 1, "High Negative Pressure Steam Temperature Alarm"));

        map.put("ex_ranshaoqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhangbaojing", 42, 1, "Burner Failure Alarm"));

        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 43, 1, " Gas Leakage Alarm"));

        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 44, 1, "Low Gas Pressure Alarm"));

        map.put("ex_ranqiyaliyichangbaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichangbaojing", 45, 1, " Gas Pressure Abnormity Alarm"));

        map.put("ex_ranqiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaligaobaojing", 46, 1, "High Gas Pressure Alarm"));

        map.put("ex_jishuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_jishuibianpinqiguzhangbaojing", 47, 1, " Water Feeding Frequency Converter Failure Alarm"));

        map.put("ex_xunhuanbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbianpinqiguzhangbaojing", 48, 1, "Circulating Frequency Converter Failure Alarm"));

        map.put("ex_yinfengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yinfengbianpinqiguzhangbaojing", 49, 1, "ID Fan Frequency Converter Failure Alarm"));

        map.put("ex_gufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_gufengbianpinqiguzhangbaojing", 50, 1, "FD Fan Frequency Converter Failure Alarm"));

        map.put("ex_ecigufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhangbaojing", 51, 1, "Secondary FD Fan Frequency Converter Failure Alarm"));

        map.put("ex_lupaibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_lupaibianpinqiguzhangbaojing", 52, 1, "Chain Grate Frequency Converter Failure Alarm"));

        map.put("ex_addshuibengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_addshuibengguzhangbaojing", 53, 1, " Water Feeding Pump Failure Alarm"));

        map.put("ex_xunhuanbengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengguzhangbaojing", 54, 1, " Water Feeding Pump Failure Alarm"));

        map.put("ex_qianyabaojing", ByteField.Init(new ExceptionField(), "ex_qianyabaojing", 55, 1, "Ultralow Pressure Alarm"));

        map.put("ex_didianyabaojing", ByteField.Init(new ExceptionField(), "ex_didianyabaojing", 56, 1, "Undervoltage Alarm"));

        map.put("ex_gaodianyabaojing", ByteField.Init(new ExceptionField(), "ex_gaodianyabaojing", 57, 1, " overvoltage Alarm"));

        map.put("ex_quexiangbaojing", ByteField.Init(new ExceptionField(), "ex_quexiangbaojing", 58, 1, "Phase Shortage Alarm"));

        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 59, 1, " Electric Leakage Alarm"));

        map.put("ex_biansongqiguoyabaohu", ByteField.Init(new ExceptionField(), "ex_biansongqiguoyabaohu", 60, 1, "Transmitter Overvoltage Protection"));

        map.put("ex_guanjiancanshuyichang", ByteField.Init(new ExceptionField(), "ex_guanjiancanshuyichang", 61, 1, " Main Paremeter Abnormity"));

        map.put("ex_shedingcanshuyichang", ByteField.Init(new ExceptionField(), "ex_shedingcanshuyichang", 62, 1, " Setting Paremeter Abnormity"));

        map.put("ex_shizhongguzhang", ByteField.Init(new ExceptionField(), "ex_shizhongguzhang", 63, 1, " Clock Failure"));

        map.put("ex_cunchuqiguzhang", ByteField.Init(new ExceptionField(), "ex_cunchuqiguzhang", 64, 1, "Memorizer Failure"));

        map.put("ex_waibuliansuobaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuobaojing", 65, 1, "External Interlock Alarm"));

        map.put("ex_queyoubaojing", ByteField.Init(new ExceptionField(), "ex_queyoubaojing", 66, 1, "External Interlock Alarm"));

        map.put("ex_diyouweibaojing", ByteField.Init(new ExceptionField(), "ex_diyouweibaojing", 67, 1, " Low Oil Level Alarm"));

        map.put("ex_bentipaiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_bentipaiyanwendugaobaojing", 68, 1, "High Boiler Proper Discharged Flue Gas Temperature Alarm"));

        map.put("ex_bianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhangbaojing", 69, 1, "Frequency Converter Failure Alarm"));

        map.put("ex_meishuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_meishuiwendugaobaojing", 70, 1, "High Medium Water Temperature Alarm"));

        map.put("ex_1haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_1haoguoluguzhang", 71, 1, "1# Boiler Failure"));

        map.put("ex_2haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_2haoguoluguzhang", 72, 1, "2#Boiler Failure"));

        map.put("ex_3haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_3haoguoluguzhang", 73, 1, "3#Boiler Failure"));

        map.put("ex_4haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_4haoguoluguzhang", 74, 1, "4#Boiler Failure"));

        map.put("ex_5haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_5haoguoluguzhang", 75, 1, "5#Boiler Failure"));

        map.put("ex_6haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_6haoguoluguzhang", 76, 1, "6#Boiler Failure"));

        map.put("ex_7haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_7haoguoluguzhang", 77, 1, "7#Boiler Failure"));

        map.put("ex_8haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_8haoguoluguzhang", 78, 1, "8号Boiler Failure"));

        map.put("ex_bushuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bushuibianpinqiguzhangbaojing", 79, 1, "Make-up Pump Frequecy Converter Failure Alarm"));

        map.put("ex_shuiliukaiguanbaohubaojing", ByteField.Init(new ExceptionField(), "ex_shuiliukaiguanbaohubaojing", 80, 1, "Low Flow Rate Alarm"));

        map.put("ex_rukouwendudibaojing", ByteField.Init(new ExceptionField(), "ex_rukouwendudibaojing", 81, 1, "Low Inlet Water Temperature Alarm  "));

        map.put("ex_xunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanbengbianpinqiguzhang", 82, 1, "Circulating Pump Frequecy Converter Failure"));

        map.put("ex_ecixunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengbianpinqiguzhang", 83, 1, "Secondary Circulating Pump Frequency Converter Failure"));

        map.put("ex_reshuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengbianpinqiguzhang", 84, 1, "Hot Water Pump Frequency Converter Failure"));

        map.put("ex_buyoubengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengbianpinqiguzhang", 85, 1, "Make-up Oil Pump Frequency Converter Failure"));

        map.put("ex_ecigufengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhang", 86, 1, "Secondary FD Fan Frequency Converter Failure   "));

        map.put("ex_songliaojibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_songliaojibianpinqiguzhang", 87, 1, " Fuel Feeder Frequency Converter Failure"));

        map.put("ex_zhenkongbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengbianpinqiguzhang", 88, 1, " Vacuum Pump Frequency Converter Failure "));

        map.put("ex_lengningbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengbianpinqiguzhang", 89, 1, "Condensing Pump Frequency Converter Failure"));

        map.put("ex_addshuibengguzhang", ByteField.Init(new ExceptionField(), "ex_addshuibengguzhang", 90, 1, "Make-up Water Pump Failure"));

        map.put("ex_buyoubengguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengguzhang", 91, 1, "Make-up Oil Pump Failure"));

        map.put("ex_lengningbengguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengguzhang", 92, 1, "Condensing Pump Failure"));

        map.put("ex_reshuibengguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengguzhang", 93, 1, " Hot Water Pump Failure"));

        map.put("ex_zhenkongbengguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengguzhang", 94, 1, "Vacuum Pump Failure"));

        map.put("ex_ecixunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengguzhang", 95, 1, "Secondary Circulating Pump Failure"));

        map.put("ex_huilu1xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1xunhuanbengguzhang", 96, 1, " Loop 1 Circulating Pump Failure"));

        map.put("ex_huilu2xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2xunhuanbengguzhang", 97, 1, "Loop 2 Circulating Pump Failure"));

        map.put("ex_huilu3xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3xunhuanbengguzhang", 98, 1, "Loop 3 Circulating Pump Failure"));

        map.put("ex_huilu4xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4xunhuanbengguzhang", 99, 1, "Loop 4 Circulating Pump Failure"));

        map.put("ex_huilu5xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5xunhuanbengguzhang", 100, 1, "Loop 5 Circulating Pump Failure"));

        map.put("ex_huilu1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu1wendugaobaojing", 101, 1, "Loop 1 High Temperature Alarm"));

        map.put("ex_huilu2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu2wendugaobaojing", 102, 1, "Loop 2 High Temperature Alarm"));

        map.put("ex_huilu3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu3wendugaobaojing", 103, 1, "Loop 3 High Temperature Alarm"));

        map.put("ex_huilu4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu4wendugaobaojing", 104, 1, "Loop 4 High Temperature Alarm"));

        map.put("ex_huilu5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu5wendugaobaojing", 105, 1, "Loop 5 High Temperature Alarm"));

        map.put("ex_panguan1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan1wendugaobaojing", 106, 1, "Coil 1 High Temperature Alarm"));

        map.put("ex_panguan2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan2wendugaobaojing", 107, 1, "Coil 2 High Temperature Alarm"));

        map.put("ex_panguan3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan3wendugaobaojing", 108, 1, "Coil 3 High Temperature Alarm"));

        map.put("ex_panguan4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan4wendugaobaojing", 109, 1, "Coil 4 High Temperature Alarm"));

        map.put("ex_panguan5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan5wendugaobaojing", 110, 1, "Coil 5 High Temperature Alarm"));

        map.put("ex_panguan6wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan6wendugaobaojing", 111, 1, "Coil 6 High Temperature Alarm"));

        map.put("ex_panguan7wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan7wendugaobaojing", 112, 1, "Coil 7 High Temperature Alarm"));

        map.put("ex_panguan8wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan8wendugaobaojing", 113, 1, "Coil 8 High Temperature Alarm"));

        map.put("ex_panguan9wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan9wendugaobaojing", 114, 1, "Coil 9 High Temperature Alarm"));

        map.put("ex_panguan10wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan10wendugaobaojing", 115, 1, "Coil 10 High Temperature Alarm"));

        map.put("ex_shanzhengguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanchaoyabaojing", 116, 1, "Flash Tank Overpressure Alarm"));

        map.put("ex_lengningguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanchaoyabaojing", 117, 1, "Condensing Tank Overpressure Alarm"));

        map.put("ex_pengzhangguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanchaoyabaojing", 118, 1, "Expansion Tank Overpressure Alarm"));

        map.put("ex_shanzhengguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweigaobaojing", 119, 1, "High Flash Tank Water Level Alarm"));

        map.put("ex_shanzhengguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweidibaojing", 120, 1, "Low Flash Tank Water Level Alarm"));

        map.put("ex_lengningguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweigaobaojing", 121, 1, "High Condensing Tank Water Level Alarm"));

        map.put("ex_lengningguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweidibaojing", 122, 1, " Low Condensing Tank Water Level Alarm"));

        map.put("ex_pengzhangguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweigaobaojing", 123, 1, "High Expansion Tank Water Level Alarm"));

        map.put("ex_pengzhangguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweidibaojing", 124, 1, "Low Expansion Tank Water Level Alarm"));

        map.put("ex_jinchukouyachadibaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachadibaojing", 125, 1, "Low Inlet and Outlet Differential Pressure Alarm"));

        map.put("ex_jinchukouyachagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachagaobaojing", 126, 1, " High Inlet and Outlet Differential Pressure Alarm"));

        map.put("ex_zhenkongyalibuzubaojing", ByteField.Init(new ExceptionField(), "ex_zhenkongyalibuzubaojing", 127, 1, "Vacuum Pressure Shortage Alarm"));

        map.put("ex_jinchukouwenchadibaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouwenchadibaojing", 128, 1, " Low Inlet and Outlet Differential Tmeperature Alarm"));

        map.put("ex_jinchukouwenchagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouwenchagaobaojing", 129, 1, "High Inlet and Outlet Differential Tmeperature Alarm"));

        map.put("ex_guoluhuohuiluchukouyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuiluchukouyaligaobaojing", 130, 1, "High Outlet Pressure Alarm( boiler or loop)"));

        map.put("ex_guoluhuohuiluchukouyalidibaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuiluchukouyalidibaojing", 131, 1, "Low Outlet Pressue Alarm ( Boiler or Loop)"));

        map.put("ex_guoluhuohuilurukouyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuilurukouyaligaobaojing", 132, 1, "High Inlet Pressure Alarm(Boiler or Loop)"));

        map.put("ex_guoluhuohuilurukouyalidibaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuilurukouyalidibaojing", 133, 1, "Low Inlet Pressure Alarm (Boiler or Loop)"));

        map.put("ex_dongzuofankuiyichangyinfengjiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_dongzuofankuiyichangyinfengjiguzhangbaojing", 134, 1, "ID Fan Failure Alarm( Action Feedback Abnormity)"));

        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 182, 1, "Discharged Flue Gas Temperature Transmitter Failure "));

        map.put("ex_lushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lushuiwenduchuanganqiguzhang", 183, 1, "Boiler Water Temperature Transmitter Failure"));

        map.put("ex_chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouwenduchuanganqiguzhang", 184, 1, "Outlet Temperature Transmitter Failure"));

        map.put("ex_rukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_rukouwenduchuanganqiguzhang", 185, 1, "Inlet Temperature Transmitter Failure"));

        map.put("ex_jienengqichukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqichukouwenduchuanganqiguzhang", 186, 1, "Economizer Outlet Temperature Transmitter Failure( water)"));

        map.put("ex_jienengqirukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqirukouwenduchuanganqiguzhang", 187, 1, "Economizer Inlet Temperature Transmitter Failure( Water)"));

        map.put("ex_jishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiwenduchuanganqiguzhang", 188, 1, "Feeding Water Temperature Transmitter Failure"));

        map.put("ex_lutangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangwenduchuanganqiguzhang", 189, 1, "Furnace Temperature Transmitter Failure"));

        map.put("ex_lutangchukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouwenduchuanganqiguzhang", 190, 1, "Furnace Outlet Temperature Transmitter Failure"));

        map.put("ex_lubiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lubiwenduchuanganqiguzhang", 191, 1, "Furnace Wall Temperature Transmitter Failure"));

        map.put("ex_ranliaowenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranliaowenduchuanganqiguzhang", 192, 1, "Fuel Temperature Transmitter Failure"));

        map.put("ex_refengwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_refengwenduchuanganqiguzhang", 193, 1, "Hot Air Temperature Transmitter Failure( Air Pre-heater Outlet)"));

        map.put("ex_fuyazhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwenduchuanganqiguzhang", 194, 1, " Negative Pressure Steam Temperature Transmitter Failure"));

        map.put("ex_guorezhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiwenduchuanganqiguzhang", 195, 1, "Super-heated Steam Temperature Transmitter Failure"));

        map.put("ex_huilu1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1wenduchuanganqiguzhang", 196, 1, " Loop 1:Temperature Transmitter Failure"));

        map.put("ex_huilu2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2wenduchuanganqiguzhang", 197, 1, " Loop 2:Temperature Transmitter Failure"));

        map.put("ex_huilu3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3wenduchuanganqiguzhang", 198, 1, " Loop 3:Temperature Transmitter Failure"));

        map.put("ex_huilu4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4wenduchuanganqiguzhang", 199, 1, " Loop 4:Temperature Transmitter Failure"));

        map.put("ex_huilu5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5wenduchuanganqiguzhang", 200, 1, " Loop 5:Temperature Transmitter Failure"));

        map.put("ex_shiwaiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shiwaiwenduchuanganqiguzhang", 201, 1, "Outdoor Temperature Transmitter Failure"));

        map.put("ex_zhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiyalichuanganqiguzhang", 202, 1, " Steam Pressure Transmitter Failure"));

        map.put("ex_jishuiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiyalichuanganqiguzhang", 203, 1, "Feeding Water Pressure Transmitter Failure"));

        map.put("ex_chukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouyalichuanganqiguzhang", 204, 1, "Outlet Pressure Transmitter Failure"));

        map.put("ex_rukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_rukouyalichuanganqiguzhang", 205, 1, "Inlet Pressure Transmitter Failure"));

        map.put("ex_lutangyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangyalichuanganqiguzhang", 206, 1, "Furnace Pressure Transmitter Failure"));

        map.put("ex_lutangchukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouyalichuanganqiguzhang", 207, 1, "Furnace Outlet Pressure Transmitter Failure"));

        map.put("ex_ranqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranqiyalichuanganqiguzhang", 208, 1, " Gas Pressure Transmitter Failure"));

        map.put("ex_yicifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yicifengyachuanganqiguzhang", 209, 1, "Primary Air Pressure Transmitter Failure"));

        map.put("ex_ecifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecifengyachuanganqiguzhang", 210, 1, "Secondary Air Pressure Transmitter Failure"));

        map.put("ex_ranliaoliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranliaoliangchuanganqiguzhang", 211, 1, "Fuel Quantity Transmitter Failure(instantaneous value)"));

        map.put("ex_zhengqiliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiliuliangchuanganqiguzhang", 212, 1, "Steam Flow Rate Transmitter Failure (instantaneous value)"));

        map.put("ex_jishuiliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiliuliangchuanganqiguzhang", 213, 1, "Feeding Water Flow Rate Transmitter Failure(instantaneous value)"));

        map.put("ex_xunhuanliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanliuliangchuanganqiguzhang", 214, 1, "Circulating Flow Rate Transmitter Failture(instantaneous value)"));

        map.put("ex_bushuiliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_bushuiliuliangchuanganqiguzhang", 215, 1, "Make-up Water Flow Rate Transmitter Failure (instantaneous value)"));

        map.put("ex_guoluyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guoluyeweichuanganqiguzhang", 216, 1, "Boiler Water Level Transmitter Failure "));

        map.put("ex_shuixiangyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangyeweichuanganqiguzhang", 217, 1, "Water Tank Water Level Transmitter Failure "));

        map.put("ex_paiyanyanghanliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanyanghanliangchuanganqiguzhang", 218, 1, "Discharged Flue Gas Oxygen Content Transmitter Failure "));

        map.put("ex_lupaisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lupaisudufankuichuanganqiguzhang", 219, 1, "Chain Grate Speed Feedback Transmitter Failure "));

        map.put("ex_yinfengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengshuchufankuichuanganqiguzhang", 220, 1, " Induced Air Output Feedback Transmitter Failure "));

        map.put("ex_gufengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengshuchufankuichuanganqiguzhang", 221, 1, "FD Air Feedback Transmitter Failure"));

        map.put("ex_jishuishuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuishuchufankuichuanganqiguzhang", 222, 1, "Water Feeding Pump Output Feedback Transmitter Failure "));

        map.put("ex_meishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_meishuiwenduchuanganqiguzhang", 223, 1, " Medium Water Temperature Transmitter Failure"));

        map.put("ex_shuixiangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangwenduchuanganqiguzhang", 224, 1, "Water Tank Temperature Transmitter Failure "));

        map.put("ex_pengzhangguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweichuanganqiguzhang", 225, 1, "Expansion Tank Water Level Transmitter Failure "));

        map.put("ex_shanzhengguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweichuanganqiguzhang", 226, 1, "Flash Tank Water Level Transmitter Failure "));

        map.put("ex_lengningyeguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanyeweichuanganqiguzhang", 227, 1, " Condensing Tank  Water Level Transmitter Failure "));

        map.put("ex_chuguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanyeweichuanganqiguzhang", 228, 1, "Storage Tank Water Level Transmitter Failure"));

        map.put("ex_pengzhangguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanwenduchuanganqiguzhang", 229, 1, "Expansion Tank Temperature Transmitter Failure "));

        map.put("ex_shanzhengguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanwenduchuanganqiguzhang", 230, 1, "Flash Tank Temperature Transmitter Failure "));

        map.put("ex_lengningyeguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanwenduchuanganqiguzhang", 231, 1, " Condensing Tank Temperature Transmitter Failure"));

        map.put("ex_chuguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanwenduchuanganqiguzhang", 232, 1, "Storage Tank Temperature Transmitter Failure "));

        map.put("ex_guoluyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guoluyalichuanganqiguzhang", 233, 1, "System Pressure Transmitter Failure"));

        map.put("ex_guorezhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiyalichuanganqiguzhang", 234, 1, "System Pressure Transmitter Failure"));

        map.put("ex_paiyanchuyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanchuyalichuanganqiguzhang", 235, 1, " Flue Gas Discharged Place Pressure Pressure Transmitter Failure "));

        map.put("ex_fengshifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fengshifengyachuanganqiguzhang", 236, 1, " Air Compartment Air Pressure Transmitter Failure "));

        map.put("ex_yinfengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengjidianliuchuanganqiguzhang", 237, 1, "ID Fan Electric Current Transmitter Failure "));

        map.put("ex_gufengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengjidianliuchuanganqiguzhang", 238, 1, " FD Fan Electric Current Transmitter Failure "));

        map.put("ex_jiliaojisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jiliaojisudufankuichuanganqiguzhang", 239, 1, "Fuel Feeder Speed Feedback Transmitter Failure "));

        map.put("ex_panguan1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan1wenduchuanganqiguzhang", 240, 1, " Coil 1 Temperature Transmitter Failure "));

        map.put("ex_panguan2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan2wenduchuanganqiguzhang", 241, 1, " Coil 2 Temperature Transmitter Failure "));

        map.put("ex_panguan3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan3wenduchuanganqiguzhang", 242, 1, " Coil 3 Temperature Transmitter Failure "));

        map.put("ex_panguan4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan4wenduchuanganqiguzhang", 243, 1, " Coil 4 Temperature Transmitter Failure "));

        map.put("ex_panguan5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan5wenduchuanganqiguzhang", 244, 1, " Coil 5 Temperature Transmitter Failure "));

        map.put("ex_panguan6wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan6wenduchuanganqiguzhang", 245, 1, " Coil 6 Temperature Transmitter Failure "));

        map.put("ex_panguan7wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan7wenduchuanganqiguzhang", 246, 1, " Coil 7 Temperature Transmitter Failure "));

        map.put("ex_panguan8wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan8wenduchuanganqiguzhang", 247, 1, " Coil 8 Temperature Transmitter Failure "));

        map.put("ex_panguan9wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan9wenduchuanganqiguzhang", 248, 1, " Coil 9 Temperature Transmitter Failure "));

        map.put("ex_panguan10wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan10wenduchuanganqiguzhang", 249, 1, " Coil 10 Temperature Transmitter Failure "));

        map.put("mo_bentipaiyanwendu", ByteField.Init(new MockField(), "mo_bentipaiyanwendu", 277, 2, "Boiler Proper Discharged Flue Gas Temperature", "℃"));

        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 279, 2, " Discharged Flue Gas Temperature", "℃"));

        map.put("mo_lushuiwendu", ByteField.Init(new MockField(), "mo_lushuiwendu", 281, 2, "Boiler Water Temperature", "℃"));

        map.put("mo_chukouwendu", ByteField.Init(new MockField(), "mo_chukouwendu", 283, 2, "Outlet Temperature", "℃"));

        map.put("mo_rukouwendu", ByteField.Init(new MockField(), "mo_rukouwendu", 285, 2, "Inlet Temperature ", "℃"));

        map.put("mo_jienengqichukouwendu", ByteField.Init(new MockField(), "mo_jienengqichukouwendu", 287, 2, "Economizer Outlet Temperature (Water)", "℃"));

        map.put("mo_jienengqirukouwendu", ByteField.Init(new MockField(), "mo_jienengqirukouwendu", 289, 2, "Economizer Inlet Temperature (Water)", "℃"));

        map.put("mo_jishuiwendu", ByteField.Init(new MockField(), "mo_jishuiwendu", 291, 2, " Feeding Water Temperature", "℃"));

        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 293, 2, " Furnace Temperature", "℃"));

        map.put("mo_lutangchukouwendu", ByteField.Init(new MockField(), "mo_lutangchukouwendu", 295, 2, " Furnace Outlet Temperature", "℃"));

        map.put("mo_lubiwendu", ByteField.Init(new MockField(), "mo_lubiwendu", 297, 2, "Furnace Wall Temperature ", "℃"));

        map.put("mo_ranliaowendu", ByteField.Init(new MockField(), "mo_ranliaowendu", 299, 2, "Fuel Temperature", "℃"));

        map.put("mo_refengwendu", ByteField.Init(new MockField(), "mo_refengwendu", 301, 2, "Hot Air Temperature e( Air Pre-heater Outlet)", "℃"));

        map.put("mo_fuyazhengqiwendu", ByteField.Init(new MockField(), "mo_fuyazhengqiwendu", 303, 2, " Negative Pressure  Steam Temperature", "℃"));

        map.put("mo_guorezhengqiwendu", ByteField.Init(new MockField(), "mo_guorezhengqiwendu", 305, 2, "Super-heated Steam Temperature", "℃"));

        map.put("mo_huilu1wendu", ByteField.Init(new MockField(), "mo_huilu1wendu", 307, 2, " Loop 1:Temperature", "℃"));

        map.put("mo_huilu2wendu", ByteField.Init(new MockField(), "mo_huilu2wendu", 309, 2, " Loop 2:Temperature", "℃"));

        map.put("mo_huilu3wendu", ByteField.Init(new MockField(), "mo_huilu3wendu", 311, 2, " Loop 3:Temperature", "℃"));

        map.put("mo_huilu4wendu", ByteField.Init(new MockField(), "mo_huilu4wendu", 313, 2, " Loop 4:Temperature", "℃"));

        map.put("mo_huilu5wendu", ByteField.Init(new MockField(), "mo_huilu5wendu", 315, 2, " Loop 5:Temperature", "℃"));

        map.put("mo_shiwaiwendu", ByteField.Init(new MockField(), "mo_shiwaiwendu", 317, 2, "Outdoor Temperature", "℃"));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 319, 2, "Steam Pressure ", "MPa", 100));

        map.put("mo_jishuiyali", ByteField.Init(new MockField(), "mo_jishuiyali", 321, 2, "Feeding Water Pressure", "MPa", 100));

        map.put("mo_chukouyali", ByteField.Init(new MockField(), "mo_chukouyali", 323, 2, "Outlet Pressure ", "MPa", 100));

        map.put("mo_rukouyali", ByteField.Init(new MockField(), "mo_rukouyali", 325, 2, "Inlet Pressure ", "MPa", 100));

        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 327, 2, "Furnace Pressure", "Pa"));

        map.put("mo_lutangchukouyali", ByteField.Init(new MockField(), "mo_lutangchukouyali", 329, 2, "Furnace Outlet Pressure", "Pa"));

        map.put("mo_ranqiyali", ByteField.Init(new MockField(), "mo_ranqiyali", 331, 2, "Gas Pressure", "KPa"));

        map.put("mo_yicifengya", ByteField.Init(new MockField(), "mo_yicifengya", 333, 2, " Primary Air Pressure", "KPa"));

        map.put("mo_ecifengya", ByteField.Init(new MockField(), "mo_ecifengya", 335, 2, "Secondary Air Pressure", "KPa"));

        map.put("mo_ranliaoliang", ByteField.Init(new MockField(), "mo_ranliaoliang", 337, 2, "Fuel Quantity(instantaneous value)"));

        map.put("mo_zhengqiliuliang", ByteField.Init(new MockField(), "mo_zhengqiliuliang", 339, 2, " Steam Flow Rate (instantaneous value)"));

        map.put("mo_jishuiliuliang", ByteField.Init(new MockField(), "mo_jishuiliuliang", 341, 2, "Feeding Water Flow Rate (instantaneous value)"));

        map.put("mo_xunhuanliuliang", ByteField.Init(new MockField(), "mo_xunhuanliuliang", 343, 2, "Circulating Flow Rate (instantaneous value)"));

        map.put("mo_bushuiliuliang", ByteField.Init(new MockField(), "mo_bushuiliuliang", 345, 2, "Make-up Water Flow Rate (instantaneous value)"));

        map.put("mo_guoluyewei", ByteField.Init(new MockField(), "mo_guoluyewei", 347, 2, "Boiler Water Level ", "mm"));

        map.put("mo_shuixiangyewei", ByteField.Init(new MockField(), "mo_shuixiangyewei", 349, 2, "Water Tank Water Level", "mm"));

        map.put("mo_paiyanyanghanliang", ByteField.Init(new MockField(), "mo_paiyanyanghanliang", 351, 2, "Discharged Flue Gas Oxygen Content", "%", 10));

        map.put("mo_lupaisudufankui", ByteField.Init(new MockField(), "mo_lupaisudufankui", 353, 2, "Chain Grate Speed Feedback", "%"));

        map.put("mo_yinfengshuchufankui", ByteField.Init(new MockField(), "mo_yinfengshuchufankui", 355, 2, "Induced Air Output Feedback", "%"));

        map.put("mo_gufengshuchufankui", ByteField.Init(new MockField(), "mo_gufengshuchufankui", 357, 2, "FD Air Feedback", "%"));

        map.put("mo_jishuishuchufankui", ByteField.Init(new MockField(), "mo_jishuishuchufankui", 359, 2, "Water Feeding Pump Output Feedback", "%"));

        map.put("mo_meishuiwendu", ByteField.Init(new MockField(), "mo_meishuiwendu", 361, 2, " Medium Water Temperature", "℃"));

        map.put("mo_shuixiangwendu", ByteField.Init(new MockField(), "mo_shuixiangwendu", 363, 2, " Water Tank Temperature", "℃"));

        map.put("mo_pengzhangguanyewei", ByteField.Init(new MockField(), "mo_pengzhangguanyewei", 365, 2, " Expansion Tank Water Level", "mm"));

        map.put("mo_shanzhengguanyewei", ByteField.Init(new MockField(), "mo_shanzhengguanyewei", 367, 2, "Flash Tank Water Level", "mm"));

        map.put("mo_lengningyeguanyewei", ByteField.Init(new MockField(), "mo_lengningyeguanyewei", 369, 2, "Condensing Tank  Water Level", "mm"));

        map.put("mo_chuguanyewei", ByteField.Init(new MockField(), "mo_chuguanyewei", 371, 2, " Storage Tank Water Level", "mm"));

        map.put("mo_pengzhangguanwendu", ByteField.Init(new MockField(), "mo_pengzhangguanwendu", 373, 2, " Expansion Tank Temperature ", "℃"));

        map.put("mo_shanzhengguanwendu", ByteField.Init(new MockField(), "mo_shanzhengguanwendu", 375, 2, "Flash Tank Temperature", "℃"));

        map.put("mo_lengningyeguanwendu", ByteField.Init(new MockField(), "mo_lengningyeguanwendu", 377, 2, " Condensing Tank Temperature ", "℃"));

        map.put("mo_chuguanwendu", ByteField.Init(new MockField(), "mo_chuguanwendu", 379, 2, "Storage Tank Temperature ", "℃"));

        map.put("mo_guoluyali", ByteField.Init(new MockField(), "mo_guoluyali", 381, 2, "Storage Tank Temperature ", "MPa", 100));

        map.put("mo_guorezhengqiyali", ByteField.Init(new MockField(), "mo_guorezhengqiyali", 383, 2, " Super-heated Steam Pressure", "MPa", 100));

        map.put("mo_paiyanchuyali", ByteField.Init(new MockField(), "mo_paiyanchuyali", 385, 2, "Flue Gas Discharged Place Pressure", "Pa"));

        map.put("mo_fengshifengya", ByteField.Init(new MockField(), "mo_fengshifengya", 387, 2, " Air Compartment Air Pressure  ", "KPa"));

        map.put("mo_yinfengjidianliu", ByteField.Init(new MockField(), "mo_yinfengjidianliu", 389, 2, " ID Fan Electric Current", "A"));

        map.put("mo_gufengjidianliu", ByteField.Init(new MockField(), "mo_gufengjidianliu", 391, 2, "FD Fan Electric Current", "A"));

        map.put("mo_jiliaojisudufankui", ByteField.Init(new MockField(), "mo_jiliaojisudufankui", 393, 2, " Fuel Feeder Speed Feedback", "%"));

        map.put("mo_panguan1wendu", ByteField.Init(new MockField(), "mo_panguan1wendu", 395, 2, "Coil 1 Temperature", "℃"));

        map.put("mo_panguan2wendu", ByteField.Init(new MockField(), "mo_panguan2wendu", 397, 2, "Coil 2 Temperature", "℃"));

        map.put("mo_panguan3wendu", ByteField.Init(new MockField(), "mo_panguan3wendu", 399, 2, "Coil 3 Temperature", "℃"));

        map.put("mo_panguan4wendu", ByteField.Init(new MockField(), "mo_panguan4wendu", 401, 2, "Coil 4 Temperature", "℃"));

        map.put("mo_panguan5wendu", ByteField.Init(new MockField(), "mo_panguan5wendu", 403, 2, "Coil 5 Temperature", "℃"));

        map.put("mo_panguan6wendu", ByteField.Init(new MockField(), "mo_panguan6wendu", 405, 2, "Coil 6 Temperature", "℃"));

        map.put("mo_panguan7wendu", ByteField.Init(new MockField(), "mo_panguan7wendu", 407, 2, "Coil 7 Temperature", "℃"));

        map.put("mo_panguan8wendu", ByteField.Init(new MockField(), "mo_panguan8wendu", 409, 2, "Coil 8 Temperature", "℃"));

        map.put("mo_panguan9wendu", ByteField.Init(new MockField(), "mo_panguan9wendu", 411, 2, "Coil 9 Temperature", "℃"));

        map.put("mo_panguan10wendu", ByteField.Init(new MockField(), "mo_panguan10wendu", 413, 2, "Coil 10 Temperature", "℃"));

        map.put("se_paiyanwendu", ByteField.Init(new SettingField(), "se_paiyanwendu", 465, 2, "Discharged Flue Gas Alarm Temperature", "℃"));

        map.put("se_baojingwendu", ByteField.Init(new SettingField(), "se_baojingwendu", 467, 2, "Alarm Temperature", "℃"));

        map.put("se_tingluwendu", ByteField.Init(new SettingField(), "se_tingluwendu", 469, 2, "Boiler Shutdown Temperature", "℃"));

        map.put("se_mubiaowendu", ByteField.Init(new SettingField(), "se_mubiaowendu", 471, 2, "Boiler Shutdown Temperature", "℃"));

        map.put("se_qiluwendu", ByteField.Init(new SettingField(), "se_qiluwendu", 473, 2, "Boiler Start Temperature", "℃"));

        map.put("se_zhuanhuohuichawendu", ByteField.Init(new SettingField(), "se_zhuanhuohuichawendu", 475, 2, " Fire Regulating Backlash", "℃"));

        map.put("se_qiluhuichawendu", ByteField.Init(new SettingField(), "se_qiluhuichawendu", 477, 2, "Boiler Start Backlash", "℃"));

        map.put("se_kaibengwendu", ByteField.Init(new SettingField(), "se_kaibengwendu", 479, 2, "Pump On Temperature", "℃"));

        map.put("se_guanbengwendu", ByteField.Init(new SettingField(), "se_guanbengwendu", 481, 2, "Pump Off Temperature", "℃"));

        map.put("se_baojingyali", ByteField.Init(new SettingField(), "se_baojingyali", 483, 2, "Alarm Pressure", "MPa", 100));

        map.put("se_tingluyali", ByteField.Init(new SettingField(), "se_tingluyali", 485, 2, " Boiler Shutdown Pressure", "MPa", 100));

        map.put("se_mubiaoyali", ByteField.Init(new SettingField(), "se_mubiaoyali", 487, 2, "Target Pressure", "MPa", 100));

        map.put("se_qiluyali", ByteField.Init(new SettingField(), "se_qiluyali", 489, 2, " Boiler Start Pressure", "MPa", 100));

        map.put("se_zhuanhuohuichayali", ByteField.Init(new SettingField(), "se_zhuanhuohuichayali", 491, 2, "Fire Regulating Backlash( Pressure)", "MPa", 100));

        map.put("se_qiluhuichayali", ByteField.Init(new SettingField(), "se_qiluhuichayali", 493, 2, "Boiler Start Backlash( Pressure)", "MPa", 100));

        map.put("se_qianyanshi", ByteField.Init(new SettingField(), "se_qianyanshi", 495, 2, "Pre-delay", "S"));

        map.put("se_houyanshimiao", ByteField.Init(new SettingField(), "se_houyanshimiao", 497, 2, "Post-delay", "S"));

        map.put("se_qianchuisao", ByteField.Init(new SettingField(), "se_qianchuisao", 499, 2, " Front Blowing", "S"));

        map.put("se_houchuisao", ByteField.Init(new SettingField(), "se_houchuisao", 501, 2, "Rear Blowing", "S"));

        map.put("se_lubibaojingwendu", ByteField.Init(new SettingField(), "se_lubibaojingwendu", 503, 2, "Furnace Wall Alarm Temperature", "℃"));

        map.put("se_lutangchukoubaojingwendu", ByteField.Init(new SettingField(), "se_lutangchukoubaojingwendu", 505, 2, "Furnace Outlet Temperature", "℃"));

        map.put("se_baohuwendu", ByteField.Init(new SettingField(), "se_baohuwendu", 507, 2, "Protection Temperature", "℃"));

        map.put("se_bentipaiyanwendubaojingzhi", ByteField.Init(new SettingField(), "se_bentipaiyanwendubaojingzhi", 509, 2, "Boiler Proper Flus Gas Discharged Temperature", "℃"));

        map.put("se_jiarezushu", ByteField.Init(new SettingField(), "se_jiarezushu", 511, 2, "Heating Blocks Qty"));

        map.put("se_jianceyalishijian", ByteField.Init(new SettingField(), "se_jianceyalishijian", 513, 2, "Pressure Detection Time"));

        map.put("se_houyanshifen", ByteField.Init(new SettingField(), "se_houyanshifen", 515, 2, "Post-delay", "m"));

        map.put("se_shedingwendu", ByteField.Init(new SettingField(), "se_shedingwendu", 517, 2, " Setting Temperature", "℃"));

        map.put("se_mokuailutaishu", ByteField.Init(new SettingField(), "se_mokuailutaishu", 519, 2, "Modular stage number"));

        map.put("se_gufenghouyanshi", ByteField.Init(new SettingField(), "se_gufenghouyanshi", 521, 2, "FD Fan Post-delay", "S"));

        map.put("se_yinfenghouyanshi", ByteField.Init(new SettingField(), "se_yinfenghouyanshi", 523, 2, " ID Fan Post-delay", "S"));

        map.put("se_shuixiangkaibengwendu", ByteField.Init(new SettingField(), "se_shuixiangkaibengwendu", 525, 2, "Water Tank Pump On Temperature", "℃"));

        map.put("se_shuixiangguanbengwendu", ByteField.Init(new SettingField(), "se_shuixiangguanbengwendu", 527, 2, "Water Tank Pump-off Temperature", "℃"));

        map.put("se_lushuibaojingwendu", ByteField.Init(new SettingField(), "se_lushuibaojingwendu", 529, 2, "Water Alarm Temperature", "℃"));

        map.put("se_buchangxishu", ByteField.Init(new SettingField(), "se_buchangxishu", 531, 2, "Compensation Factor"));

        map.put("se_cankaowendu", ByteField.Init(new SettingField(), "se_cankaowendu", 533, 2, "Reference Temperature", "℃"));

        map.put("se_tingluzuidazhi", ByteField.Init(new SettingField(), "se_tingluzuidazhi", 535, 2, " Boiler Shutdown Maxi Temperature", "℃"));

        map.put("se_qiluzuixiaozhi", ByteField.Init(new SettingField(), "se_qiluzuixiaozhi", 537, 2, "Boiler Start Mini Temperature", "℃"));

        map.put("se_cankaohuicha", ByteField.Init(new SettingField(), "se_cankaohuicha", 539, 2, "Reference Backlash", "℃"));

        map.put("se_tingluwendu1", ByteField.Init(new SettingField(), "se_tingluwendu1", 541, 2, "Boiler Shutdown Temperature 1", "℃"));

        map.put("se_qiluwendu1", ByteField.Init(new SettingField(), "se_qiluwendu1", 543, 2, "Boiler Start Temperature ", "℃"));

        map.put("se_tingluwendu2", ByteField.Init(new SettingField(), "se_tingluwendu2", 545, 2, "Boiler Shutdown Temperature 2", "℃"));

        map.put("se_qiluwendu2", ByteField.Init(new SettingField(), "se_qiluwendu2", 547, 2, "Boiler Start Temperature 2", "℃"));

        map.put("se_yusongliaoshijian", ByteField.Init(new SettingField(), "se_yusongliaoshijian", 549, 2, "Pre-fuel-feeding Time", "S"));

        map.put("se_dianhuoshijian", ByteField.Init(new SettingField(), "se_dianhuoshijian", 551, 2, " Ignition Duration", "S"));

        map.put("se_songliaoqidongshijian", ByteField.Init(new SettingField(), "se_songliaoqidongshijian", 553, 2, "Fuel Feeding Start Time", "S"));

        map.put("se_songliaotingzhishijian", ByteField.Init(new SettingField(), "se_songliaotingzhishijian", 555, 2, "Fuel Feeding Stop Time", "S"));

        map.put("se_dianhuojiange", ByteField.Init(new SettingField(), "se_dianhuojiange", 557, 2, "Ignition Interval", "m"));

        map.put("se_dianhuochenggongwendu", ByteField.Init(new SettingField(), "se_dianhuochenggongwendu", 559, 2, "Successful Ignition Temperature", "℃"));

        map.put("se_lushuitingluwendu", ByteField.Init(new SettingField(), "se_lushuitingluwendu", 561, 2, "Boiler Water Temperature When Boiler Shutdown", "℃"));

        map.put("se_lushuiqiluwendu", ByteField.Init(new SettingField(), "se_lushuiqiluwendu", 563, 2, "Boiler Water When Boiler Start", "℃"));

        map.put("se_meishuibaojingwendu", ByteField.Init(new SettingField(), "se_meishuibaojingwendu", 565, 2, "Medium Water Alarm Temperature", "℃"));

        map.put("se_meishuitingluwendu", ByteField.Init(new SettingField(), "se_meishuitingluwendu", 567, 2, "Medium Water Temperature when Boiler Shutdown", "℃"));

        map.put("se_meishuiqiluwendu", ByteField.Init(new SettingField(), "se_meishuiqiluwendu", 569, 2, "Medium Water Temperature When Boiler Start", "℃"));

        map.put("se_kaibengyali", ByteField.Init(new SettingField(), "se_kaibengyali", 571, 2, "Pump On Pressure( Used for Fixed-pressure control)", "MPa", 100));

        map.put("se_guanbengyali", ByteField.Init(new SettingField(), "se_guanbengyali", 573, 2, "Pump-off Pressure ( Used for fixed-pressure control)", "MPa", 100));

        map.put("se_panguanbaojingwendu", ByteField.Init(new SettingField(), "se_panguanbaojingwendu", 575, 2, " Coil Alarm Temperature", "℃"));

        map.put("se_huilu1baojingwendu", ByteField.Init(new SettingField(), "se_huilu1baojingwendu", 577, 2, " Loop 1 Alarm Temperature", "℃"));

        map.put("se_huilu1kaibengwendu", ByteField.Init(new SettingField(), "se_huilu1kaibengwendu", 579, 2, " Loop 1 Pump-on Temperature", "℃"));

        map.put("se_huilu1guanbengwendu", ByteField.Init(new SettingField(), "se_huilu1guanbengwendu", 581, 2, "Loop 1 Pump-off Temperature", "℃"));

        map.put("se_huilu2baojingwendu", ByteField.Init(new SettingField(), "se_huilu2baojingwendu", 583, 2, "Loop 2 Alarm Temperature", "℃"));

        map.put("se_huilu2kaibengwendu", ByteField.Init(new SettingField(), "se_huilu2kaibengwendu", 585, 2, "Loop 2 Pump-on Temperature", "℃"));

        map.put("se_huilu2guanbengwendu", ByteField.Init(new SettingField(), "se_huilu2guanbengwendu", 587, 2, "Loop 2 Pump-off Temperature", "℃"));

        map.put("se_huilu3baojingwendu", ByteField.Init(new SettingField(), "se_huilu3baojingwendu", 589, 2, "Loop 3 Alarm Temperature", "℃"));

        map.put("se_huilu3kaibengwendu", ByteField.Init(new SettingField(), "se_huilu3kaibengwendu", 591, 2, "Loop 3 Pump-on Temperature", "℃"));

        map.put("se_huilu3guanbengwendu", ByteField.Init(new SettingField(), "se_huilu3guanbengwendu", 593, 2, "Loop 3 Pump-off Temperature", "℃"));

        map.put("se_huilu4baojingwendu", ByteField.Init(new SettingField(), "se_huilu4baojingwendu", 595, 2, "Loop 4 Alarm Temperature", "℃"));

        map.put("se_huilu4kaibengwendu", ByteField.Init(new SettingField(), "se_huilu4kaibengwendu", 597, 2, "Loop 4 Pump-on Temperature", "℃"));

        map.put("se_huilu4guanbengwendu", ByteField.Init(new SettingField(), "se_huilu4guanbengwendu", 599, 2, "Loop 4 Pump-off Temperature", "℃"));

        map.put("se_huilu5baojingwendu", ByteField.Init(new SettingField(), "se_huilu5baojingwendu", 601, 2, "Loop 5 Alarm Temperature", "℃"));

        map.put("se_huilu5kaibengwendu", ByteField.Init(new SettingField(), "se_huilu5kaibengwendu", 603, 2, "Loop 5 Pump-on Temperature", "℃"));

        map.put("se_huilu5guanbengwendu", ByteField.Init(new SettingField(), "se_huilu5guanbengwendu", 605, 2, "Loop 5 Pump-off Temperature", "℃"));

        map.put("st_qidongshijian1", ByteField.Init(new StartStopField(), "st_qidongshijian1", 607, 2, "Start Time 1"));

        map.put("st_tingzhishijian1", ByteField.Init(new StartStopField(), "st_tingzhishijian1", 609, 2, "Stop Time 1"));

        map.put("st_qidongshijian2", ByteField.Init(new StartStopField(), "st_qidongshijian2", 611, 2, "Start Time 2"));

        map.put("st_tingzhishijian2", ByteField.Init(new StartStopField(), "st_tingzhishijian2", 613, 2, "Stop Time 2"));

        map.put("st_qidongshijian3", ByteField.Init(new StartStopField(), "st_qidongshijian3", 615, 2, "Start Time 3"));

        map.put("st_tingzhishijian3", ByteField.Init(new StartStopField(), "st_tingzhishijian3", 617, 2, "Stop Time 3"));

        map.put("st_qidongshijian4", ByteField.Init(new StartStopField(), "st_qidongshijian4", 619, 2, "Start Time 4"));

        map.put("st_tingzhishijian4", ByteField.Init(new StartStopField(), "st_tingzhishijian4", 621, 2, "Stop Time 4"));

        map.put("st_qidongshijian5", ByteField.Init(new StartStopField(), "st_qidongshijian5", 623, 2, "Start Time 5"));

        map.put("st_tingzhishijian5", ByteField.Init(new StartStopField(), "st_tingzhishijian5", 625, 2, "Stop Time 5"));

        map.put("st_qidongshijian6", ByteField.Init(new StartStopField(), "st_qidongshijian6", 627, 2, "Start Time 6"));

        map.put("st_tingzhishijian6", ByteField.Init(new StartStopField(), "st_tingzhishijian6", 629, 2, "Stop Time 6"));

        map.put("de_ranshaoqi", ByteField.Init(new RanShaoQiField(), "de_ranshaoqi", 681, 2, "Burner", CTL_NJZJ_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("de_jiarezu", ByteField.Init(new DeviceField(), "de_jiarezu", 683, 2, "Heating Blocks", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_bushui_beng", ByteField.Init(new DeviceField(), "de_bushui_beng", 685, 2, "Heating Blocks", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_jishui_beng", ByteField.Init(new DeviceField(), "de_jishui_beng", 687, 2, " Water Feeding Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_buyou_beng", ByteField.Init(new DeviceField(), "de_buyou_beng", 689, 2, "Make-up Oil Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_xunhuan_beng", ByteField.Init(new DeviceField(), "de_xunhuan_beng", 691, 2, "Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_lengning_beng", ByteField.Init(new DeviceField(), "de_lengning_beng", 693, 2, "Condensening Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_reshui_beng", ByteField.Init(new DeviceField(), "de_reshui_beng", 695, 2, " Hot Water Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_zhenkong_beng", ByteField.Init(new DeviceField(), "de_zhenkong_beng", 697, 2, "Vocuum Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_ecixunhuan_beng", ByteField.Init(new DeviceField(), "de_ecixunhuan_beng", 699, 2, "Secondary Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_yinfengji_fan", ByteField.Init(new DeviceField(), "de_yinfengji_fan", 701, 2, " ID Fan", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_gufengji_fan", ByteField.Init(new DeviceField(), "de_gufengji_fan", 703, 2, " ID Fan", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_lupai_fan", ByteField.Init(new DeviceField(), "de_lupai_fan", 705, 2, " Chain Grate", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_chuzhaji_fan", ByteField.Init(new DeviceField(), "de_chuzhaji_fan", 707, 2, "Slag Remover", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_ecigufengji_fan", ByteField.Init(new DeviceField(), "de_ecigufengji_fan", 709, 2, "Secondary FD Fan", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_dianhuoqi", ByteField.Init(new DeviceField(), "de_dianhuoqi", 711, 2, " Igniter", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_shangmeiji", ByteField.Init(new DeviceField(), "de_shangmeiji", 713, 2, " Coal Conveyor", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_songliaoji", ByteField.Init(new DeviceField(), "de_songliaoji", 715, 2, "Fuel Feeder", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_jiayao_beng", ByteField.Init(new DeviceField(), "de_jiayao_beng", 717, 2, "Dosing Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_paiwufa", ByteField.Init(new DeviceField(), "de_paiwufa", 719, 2, "Blowdown Valve", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu1xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu1xunhuan_beng", 721, 2, "Loop 1 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu2xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu2xunhuan_beng", 723, 2, "Loop 2 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu3xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu3xunhuan_beng", 725, 2, "Loop 3 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu4xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu4xunhuan_beng", 727, 2, "Loop 4 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu5xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu5xunhuan_beng", 729, 2, "Loop 5 Circulating Pump", CTL_NJZJ_Common_ValueMaps.coms_device));
    }
}
