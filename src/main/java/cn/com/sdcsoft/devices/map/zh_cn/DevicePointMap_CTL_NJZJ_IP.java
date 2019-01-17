package cn.com.sdcsoft.devices.map.zh_cn;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJZJ.*;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_NJZJ_IP extends DevicePointMap {
    public static final String Key = "CTL_NJZJ_IP";

    public DevicePointMap_CTL_NJZJ_IP() {
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 20, 1, "系统状态", CTL_NJZJ_Common_ValueMaps.coms_status));

        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new RunDaysField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 21, 2, "运行天数", "天"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 23, 1, "运行小时数", "时"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_POWER, 24, 1, "燃料类型", DevicePointMap.coms_power));

        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_MEDIA, 25, 1, "介质类型", DevicePointMap.coms_media));

        map.put("ba_guolushuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_guolushuiweizhuangtai", 26, 1, "锅炉液位状态", DevicePointMap.coms_level));

        map.put("ba_shuixiangshuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuixiangshuiweizhuangtai", 27, 1, "水箱液位状态", DevicePointMap.coms_level));

        map.put("ba_guoluyalizhuangtai", ByteField.Init(new BaseInfoField(), "ba_guoluyalizhuangtai", 28, 1, "锅炉压力状态", CTL_NJZJ_Common_ValueMaps.coms_yalistatus));
        map.put("ba_moshibianhao", ByteField.Init(new BaseInfoField(), "ba_moshibianhao", 29, 1, "模式编号"));
        map.put("ba_fangdongkaiguan", ByteField.Init(new BaseInfoField(), "ba_fangdongkaiguan", 30, 1, "防冻开关", DevicePointMap.coms_open_close));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 32, 1, "排烟温度高报警"));
        map.put("ex_lushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lushuiwendugaobaojing", 33, 1, "炉水温度高报警"));

        map.put("ex_chukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chukouwendugaobaojing", 34, 1, "出口温度高报警"));

        map.put("ex_chaoyabaojing", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing", 35, 1, "超压报警"));

        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 36, 1, "极限低水位报警"));

        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 37, 1, "低水位报警"));

        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 38, 1, "高水位报警"));

        map.put("ex_shuiweixinhaoluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuiweixinhaoluojicuobaojing", 39, 1, "水位信号逻辑错报警"));

        map.put("ex_lubiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lubiwendugaobaojing", 40, 1, "炉壁温度高报警"));

        map.put("ex_fuyazhengqiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwendugaobaojing", 41, 1, "负压蒸汽温度高报警"));

        map.put("ex_ranshaoqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhangbaojing", 42, 1, "燃烧器故障报警"));

        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 43, 1, "燃气泄漏报警"));

        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 44, 1, "燃气压力低报警"));

        map.put("ex_ranqiyaliyichangbaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichangbaojing", 45, 1, "燃气压力异常报警"));

        map.put("ex_ranqiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaligaobaojing", 46, 1, "燃气压力高报警"));

        map.put("ex_jishuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_jishuibianpinqiguzhangbaojing", 47, 1, "给水变频器故障报警"));

        map.put("ex_xunhuanbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbianpinqiguzhangbaojing", 48, 1, "循环变频器故障报警"));

        map.put("ex_yinfengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yinfengbianpinqiguzhangbaojing", 49, 1, "引风变频器故障报警"));

        map.put("ex_gufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_gufengbianpinqiguzhangbaojing", 50, 1, "鼓风变频器故障报警"));

        map.put("ex_ecigufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhangbaojing", 51, 1, "二次鼓风变频器故障报警"));

        map.put("ex_lupaibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_lupaibianpinqiguzhangbaojing", 52, 1, "炉排变频器故障报警"));

        map.put("ex_addshuibengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_addshuibengguzhangbaojing", 53, 1, "给水泵故障报警"));

        map.put("ex_xunhuanbengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengguzhangbaojing", 54, 1, "循环泵故障报警"));

        map.put("ex_qianyabaojing", ByteField.Init(new ExceptionField(), "ex_qianyabaojing", 55, 1, "欠压报警"));

        map.put("ex_didianyabaojing", ByteField.Init(new ExceptionField(), "ex_didianyabaojing", 56, 1, "低电压报警"));

        map.put("ex_gaodianyabaojing", ByteField.Init(new ExceptionField(), "ex_gaodianyabaojing", 57, 1, "高电压报警"));

        map.put("ex_quexiangbaojing", ByteField.Init(new ExceptionField(), "ex_quexiangbaojing", 58, 1, "缺相报警"));

        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 59, 1, "漏电报警"));

        map.put("ex_biansongqiguoyabaohu", ByteField.Init(new ExceptionField(), "ex_biansongqiguoyabaohu", 60, 1, "变送器过压保护"));

        map.put("ex_guanjiancanshuyichang", ByteField.Init(new ExceptionField(), "ex_guanjiancanshuyichang", 61, 1, "关键参数异常"));

        map.put("ex_shedingcanshuyichang", ByteField.Init(new ExceptionField(), "ex_shedingcanshuyichang", 62, 1, "设定参数异常"));

        map.put("ex_shizhongguzhang", ByteField.Init(new ExceptionField(), "ex_shizhongguzhang", 63, 1, "时钟故障"));

        map.put("ex_cunchuqiguzhang", ByteField.Init(new ExceptionField(), "ex_cunchuqiguzhang", 64, 1, "存储器故障"));

        map.put("ex_waibuliansuobaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuobaojing", 65, 1, "外部连锁报警"));

        map.put("ex_queyoubaojing", ByteField.Init(new ExceptionField(), "ex_queyoubaojing", 66, 1, "缺油报警"));

        map.put("ex_diyouweibaojing", ByteField.Init(new ExceptionField(), "ex_diyouweibaojing", 67, 1, "低油位报警"));

        map.put("ex_bentipaiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_bentipaiyanwendugaobaojing", 68, 1, "本体排烟温度高报警"));

        map.put("ex_bianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhangbaojing", 69, 1, "变频器故障报警"));

        map.put("ex_meishuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_meishuiwendugaobaojing", 70, 1, "媒水温度高报警"));

        map.put("ex_1haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_1haoguoluguzhang", 71, 1, "1号锅炉故障"));

        map.put("ex_2haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_2haoguoluguzhang", 72, 1, "2号锅炉故障"));

        map.put("ex_3haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_3haoguoluguzhang", 73, 1, "3号锅炉故障"));

        map.put("ex_4haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_4haoguoluguzhang", 74, 1, "4号锅炉故障"));

        map.put("ex_5haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_5haoguoluguzhang", 75, 1, "5号锅炉故障"));

        map.put("ex_6haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_6haoguoluguzhang", 76, 1, "6号锅炉故障"));

        map.put("ex_7haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_7haoguoluguzhang", 77, 1, "7号锅炉故障"));

        map.put("ex_8haoguoluguzhang", ByteField.Init(new ExceptionField(), "ex_8haoguoluguzhang", 78, 1, "8号锅炉故障"));

        map.put("ex_bushuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bushuibianpinqiguzhangbaojing", 79, 1, "补水变频器故障报警"));

        map.put("ex_shuiliukaiguanbaohubaojing", ByteField.Init(new ExceptionField(), "ex_shuiliukaiguanbaohubaojing", 80, 1, "水流开关保护报警"));

        map.put("ex_rukouwendudibaojing", ByteField.Init(new ExceptionField(), "ex_rukouwendudibaojing", 81, 1, "入口温度低报警"));

        map.put("ex_xunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanbengbianpinqiguzhang", 82, 1, "循环泵变频器故障"));

        map.put("ex_ecixunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengbianpinqiguzhang", 83, 1, "二次循环泵变频器故障"));

        map.put("ex_reshuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengbianpinqiguzhang", 84, 1, "热水泵变频器故障"));

        map.put("ex_buyoubengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengbianpinqiguzhang", 85, 1, "补油泵变频器故障"));

        map.put("ex_ecigufengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhang", 86, 1, "二次鼓风变频器故障"));

        map.put("ex_songliaojibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_songliaojibianpinqiguzhang", 87, 1, "送料机变频器故障"));

        map.put("ex_zhenkongbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengbianpinqiguzhang", 88, 1, "真空泵变频器故障"));

        map.put("ex_lengningbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengbianpinqiguzhang", 89, 1, "冷凝泵变频器故障"));

        map.put("ex_addshuibengguzhang", ByteField.Init(new ExceptionField(), "ex_addshuibengguzhang", 90, 1, "补水泵故障"));

        map.put("ex_buyoubengguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengguzhang", 91, 1, "补油泵故障"));

        map.put("ex_lengningbengguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengguzhang", 92, 1, "冷凝泵故障"));

        map.put("ex_reshuibengguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengguzhang", 93, 1, "热水泵故障"));

        map.put("ex_zhenkongbengguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengguzhang", 94, 1, "真空泵故障"));

        map.put("ex_ecixunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengguzhang", 95, 1, "二次循环泵故障"));

        map.put("ex_huilu1xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1xunhuanbengguzhang", 96, 1, "回路1循环泵故障"));

        map.put("ex_huilu2xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2xunhuanbengguzhang", 97, 1, "回路2循环泵故障"));

        map.put("ex_huilu3xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3xunhuanbengguzhang", 98, 1, "回路3循环泵故障"));

        map.put("ex_huilu4xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4xunhuanbengguzhang", 99, 1, "回路4循环泵故障"));

        map.put("ex_huilu5xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5xunhuanbengguzhang", 100, 1, "回路5循环泵故障"));

        map.put("ex_huilu1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu1wendugaobaojing", 101, 1, "回路1温度高报警"));

        map.put("ex_huilu2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu2wendugaobaojing", 102, 1, "回路2温度高报警"));

        map.put("ex_huilu3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu3wendugaobaojing", 103, 1, "回路3温度高报警"));

        map.put("ex_huilu4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu4wendugaobaojing", 104, 1, "回路4温度高报警"));

        map.put("ex_huilu5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu5wendugaobaojing", 105, 1, "回路5温度高报警"));

        map.put("ex_panguan1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan1wendugaobaojing", 106, 1, "盘管1温度高报警"));

        map.put("ex_panguan2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan2wendugaobaojing", 107, 1, "盘管2温度高报警"));

        map.put("ex_panguan3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan3wendugaobaojing", 108, 1, "盘管3温度高报警"));

        map.put("ex_panguan4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan4wendugaobaojing", 109, 1, "盘管4温度高报警"));

        map.put("ex_panguan5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan5wendugaobaojing", 110, 1, "盘管5温度高报警"));

        map.put("ex_panguan6wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan6wendugaobaojing", 111, 1, "盘管6温度高报警"));

        map.put("ex_panguan7wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan7wendugaobaojing", 112, 1, "盘管7温度高报警"));

        map.put("ex_panguan8wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan8wendugaobaojing", 113, 1, "盘管8温度高报警"));

        map.put("ex_panguan9wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan9wendugaobaojing", 114, 1, "盘管9温度高报警"));

        map.put("ex_panguan10wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan10wendugaobaojing", 115, 1, "盘管10温度高报警"));

        map.put("ex_shanzhengguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanchaoyabaojing", 116, 1, "闪蒸罐超压报警"));

        map.put("ex_lengningguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanchaoyabaojing", 117, 1, "冷凝罐超压报警"));

        map.put("ex_pengzhangguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanchaoyabaojing", 118, 1, "膨胀罐超压报警"));

        map.put("ex_shanzhengguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweigaobaojing", 119, 1, "闪蒸罐液位高报警"));

        map.put("ex_shanzhengguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweidibaojing", 120, 1, "闪蒸罐液位低报警"));

        map.put("ex_lengningguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweigaobaojing", 121, 1, "冷凝罐液位高报警"));

        map.put("ex_lengningguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweidibaojing", 122, 1, "冷凝罐液位低报警"));

        map.put("ex_pengzhangguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweigaobaojing", 123, 1, "膨胀罐液位高报警"));

        map.put("ex_pengzhangguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweidibaojing", 124, 1, "膨胀罐液位低报警"));

        map.put("ex_jinchukouyachadibaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachadibaojing", 125, 1, "进出口压差低报警"));

        map.put("ex_jinchukouyachagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachagaobaojing", 126, 1, "进出口压差高报警"));

        map.put("ex_zhenkongyalibuzubaojing", ByteField.Init(new ExceptionField(), "ex_zhenkongyalibuzubaojing", 127, 1, "真空压力不足报警"));

        map.put("ex_jinchukouwenchadibaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouwenchadibaojing", 128, 1, "进出口温差低报警"));

        map.put("ex_jinchukouwenchagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouwenchagaobaojing", 129, 1, "进出口温差高报警"));

        map.put("ex_guoluhuohuiluchukouyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuiluchukouyaligaobaojing", 130, 1, "出口压力高报警（锅炉或回路）"));

        map.put("ex_guoluhuohuiluchukouyalidibaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuiluchukouyalidibaojing", 131, 1, "出口压力低报警（锅炉或回路）"));

        map.put("ex_guoluhuohuilurukouyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuilurukouyaligaobaojing", 132, 1, "入口压力高报警（锅炉或回路）"));

        map.put("ex_guoluhuohuilurukouyalidibaojing", ByteField.Init(new ExceptionField(), "ex_guoluhuohuilurukouyalidibaojing", 133, 1, "入口压力低报警（锅炉或回路）"));

        map.put("ex_dongzuofankuiyichangyinfengjiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_dongzuofankuiyichangyinfengjiguzhangbaojing", 134, 1, "引风机故障报警（动作反馈异常）"));

        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 182, 1, "排烟温度传感器故障"));

        map.put("ex_lushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lushuiwenduchuanganqiguzhang", 183, 1, "炉水温度传感器故障"));

        map.put("ex_chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouwenduchuanganqiguzhang", 184, 1, "出口温度传感器故障"));

        map.put("ex_rukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_rukouwenduchuanganqiguzhang", 185, 1, "入口温度传感器故障"));

        map.put("ex_jienengqichukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqichukouwenduchuanganqiguzhang", 186, 1, "节能器出口温度传感器故障"));

        map.put("ex_jienengqirukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqirukouwenduchuanganqiguzhang", 187, 1, "节能器入口温度传感器故障"));

        map.put("ex_jishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiwenduchuanganqiguzhang", 188, 1, "给水温度传感器故障"));

        map.put("ex_lutangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangwenduchuanganqiguzhang", 189, 1, "炉膛温度传感器故障"));

        map.put("ex_lutangchukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouwenduchuanganqiguzhang", 190, 1, "炉膛出口温度传感器故障"));

        map.put("ex_lubiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lubiwenduchuanganqiguzhang", 191, 1, "炉壁温度传感器故障"));

        map.put("ex_ranliaowenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranliaowenduchuanganqiguzhang", 192, 1, "燃料温度传感器故障"));

        map.put("ex_refengwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_refengwenduchuanganqiguzhang", 193, 1, "热风温度传感器故障"));

        map.put("ex_fuyazhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwenduchuanganqiguzhang", 194, 1, "负压蒸汽温度传感器故障"));

        map.put("ex_guorezhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiwenduchuanganqiguzhang", 195, 1, "过热蒸汽温度传感器故障"));

        map.put("ex_huilu1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1wenduchuanganqiguzhang", 196, 1, "回路1温度传感器故障"));

        map.put("ex_huilu2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2wenduchuanganqiguzhang", 197, 1, "回路2温度传感器故障"));

        map.put("ex_huilu3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3wenduchuanganqiguzhang", 198, 1, "回路3温度传感器故障"));

        map.put("ex_huilu4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4wenduchuanganqiguzhang", 199, 1, "回路4温度传感器故障"));

        map.put("ex_huilu5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5wenduchuanganqiguzhang", 200, 1, "回路5温度传感器故障"));

        map.put("ex_shiwaiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shiwaiwenduchuanganqiguzhang", 201, 1, "室外温度传感器故障"));

        map.put("ex_zhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiyalichuanganqiguzhang", 202, 1, "蒸汽压力变送器故障"));

        map.put("ex_jishuiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiyalichuanganqiguzhang", 203, 1, "给水压力传感器故障"));

        map.put("ex_chukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouyalichuanganqiguzhang", 204, 1, "出口压力传感器故障"));

        map.put("ex_rukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_rukouyalichuanganqiguzhang", 205, 1, "入口压力传感器故障"));

        map.put("ex_lutangyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangyalichuanganqiguzhang", 206, 1, "炉膛压力传感器故障"));

        map.put("ex_lutangchukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouyalichuanganqiguzhang", 207, 1, "炉膛出口压力传感器故障"));

        map.put("ex_ranqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranqiyalichuanganqiguzhang", 208, 1, "燃气压力传感器故障"));

        map.put("ex_yicifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yicifengyachuanganqiguzhang", 209, 1, "一次风压传感器故障"));

        map.put("ex_ecifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecifengyachuanganqiguzhang", 210, 1, "二次风压传感器故障"));

        map.put("ex_ranliaoliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranliaoliangchuanganqiguzhang", 211, 1, "燃料量传感器故障"));

        map.put("ex_zhengqiliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiliuliangchuanganqiguzhang", 212, 1, "蒸汽流量传感器故障"));

        map.put("ex_jishuiliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiliuliangchuanganqiguzhang", 213, 1, "给水流量传感器故障"));

        map.put("ex_xunhuanliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanliuliangchuanganqiguzhang", 214, 1, "循环流量传感器故障"));

        map.put("ex_bushuiliuliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_bushuiliuliangchuanganqiguzhang", 215, 1, "补水流量传感器故障"));

        map.put("ex_guoluyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guoluyeweichuanganqiguzhang", 216, 1, "锅炉液位传感器故障"));

        map.put("ex_shuixiangyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangyeweichuanganqiguzhang", 217, 1, "水箱液位传感器故障"));

        map.put("ex_paiyanyanghanliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanyanghanliangchuanganqiguzhang", 218, 1, "排烟氧含量传感器故障"));

        map.put("ex_lupaisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lupaisudufankuichuanganqiguzhang", 219, 1, "炉排速度反馈传感器故障"));

        map.put("ex_yinfengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengshuchufankuichuanganqiguzhang", 220, 1, "引风输出反馈传感器故障"));

        map.put("ex_gufengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengshuchufankuichuanganqiguzhang", 221, 1, "鼓风输出反馈传感器故障"));

        map.put("ex_jishuishuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuishuchufankuichuanganqiguzhang", 222, 1, "给水输出反馈传感器故障"));

        map.put("ex_meishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_meishuiwenduchuanganqiguzhang", 223, 1, "媒水温度传感器故障"));

        map.put("ex_shuixiangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangwenduchuanganqiguzhang", 224, 1, "水箱温度传感器故障"));

        map.put("ex_pengzhangguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweichuanganqiguzhang", 225, 1, "膨胀罐液位传感器故障"));

        map.put("ex_shanzhengguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweichuanganqiguzhang", 226, 1, "闪蒸罐液位传感器故障"));

        map.put("ex_lengningyeguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanyeweichuanganqiguzhang", 227, 1, "冷凝液罐液位传感器故障"));

        map.put("ex_chuguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanyeweichuanganqiguzhang", 228, 1, "储罐液位传感器故障"));

        map.put("ex_pengzhangguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanwenduchuanganqiguzhang", 229, 1, "膨胀罐温度传感器故障"));

        map.put("ex_shanzhengguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanwenduchuanganqiguzhang", 230, 1, "闪蒸罐温度传感器故障"));

        map.put("ex_lengningyeguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanwenduchuanganqiguzhang", 231, 1, "冷凝液罐温度传感器故障"));

        map.put("ex_chuguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanwenduchuanganqiguzhang", 232, 1, "储罐温度传感器故障"));

        map.put("ex_guoluyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guoluyalichuanganqiguzhang", 233, 1, "锅炉压力传感器故障"));

        map.put("ex_guorezhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiyalichuanganqiguzhang", 234, 1, "过热蒸汽压力传感器故障"));

        map.put("ex_paiyanchuyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanchuyalichuanganqiguzhang", 235, 1, "排烟处压力传感器故障"));

        map.put("ex_fengshifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fengshifengyachuanganqiguzhang", 236, 1, "风室风压传感器故障"));

        map.put("ex_yinfengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengjidianliuchuanganqiguzhang", 237, 1, "引风机电流传感器故障"));

        map.put("ex_gufengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengjidianliuchuanganqiguzhang", 238, 1, "鼓风机电流传感器故障"));

        map.put("ex_jiliaojisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jiliaojisudufankuichuanganqiguzhang", 239, 1, "给料机速度反馈传感器故障"));

        map.put("ex_panguan1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan1wenduchuanganqiguzhang", 240, 1, "盘管1温度传感器故障"));

        map.put("ex_panguan2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan2wenduchuanganqiguzhang", 241, 1, "盘管2温度传感器故障"));

        map.put("ex_panguan3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan3wenduchuanganqiguzhang", 242, 1, "盘管3温度传感器故障"));

        map.put("ex_panguan4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan4wenduchuanganqiguzhang", 243, 1, "盘管4温度传感器故障"));

        map.put("ex_panguan5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan5wenduchuanganqiguzhang", 244, 1, "盘管5温度传感器故障"));

        map.put("ex_panguan6wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan6wenduchuanganqiguzhang", 245, 1, "盘管6温度传感器故障"));

        map.put("ex_panguan7wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan7wenduchuanganqiguzhang", 246, 1, "盘管7温度传感器故障"));

        map.put("ex_panguan8wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan8wenduchuanganqiguzhang", 247, 1, "盘管8温度传感器故障"));

        map.put("ex_panguan9wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan9wenduchuanganqiguzhang", 248, 1, "盘管9温度传感器故障"));

        map.put("ex_panguan10wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan10wenduchuanganqiguzhang", 249, 1, "盘管10温度传感器故障"));

        map.put("mo_bentipaiyanwendu", ByteField.Init(new MockField(), "mo_bentipaiyanwendu", 277, 2, "本体排烟温度", "℃"));

        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 279, 2, "排烟温度", "℃"));

        map.put("mo_lushuiwendu", ByteField.Init(new MockField(), "mo_lushuiwendu", 281, 2, "炉水温度", "℃"));

        map.put("mo_chukouwendu", ByteField.Init(new MockField(), "mo_chukouwendu", 283, 2, "出口温度", "℃"));

        map.put("mo_rukouwendu", ByteField.Init(new MockField(), "mo_rukouwendu", 285, 2, "入口温度", "℃"));

        map.put("mo_jienengqichukouwendu", ByteField.Init(new MockField(), "mo_jienengqichukouwendu", 287, 2, "节能器出口温度", "℃"));

        map.put("mo_jienengqirukouwendu", ByteField.Init(new MockField(), "mo_jienengqirukouwendu", 289, 2, "节能器入口温度", "℃"));

        map.put("mo_jishuiwendu", ByteField.Init(new MockField(), "mo_jishuiwendu", 291, 2, "给水温度", "℃"));

        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 293, 2, "炉膛温度", "℃"));

        map.put("mo_lutangchukouwendu", ByteField.Init(new MockField(), "mo_lutangchukouwendu", 295, 2, "炉膛出口温度", "℃"));

        map.put("mo_lubiwendu", ByteField.Init(new MockField(), "mo_lubiwendu", 297, 2, "炉壁温度", "℃"));

        map.put("mo_ranliaowendu", ByteField.Init(new MockField(), "mo_ranliaowendu", 299, 2, "燃料温度", "℃"));

        map.put("mo_refengwendu", ByteField.Init(new MockField(), "mo_refengwendu", 301, 2, "热风温度", "℃"));

        map.put("mo_fuyazhengqiwendu", ByteField.Init(new MockField(), "mo_fuyazhengqiwendu", 303, 2, "负压蒸汽温度", "℃"));

        map.put("mo_guorezhengqiwendu", ByteField.Init(new MockField(), "mo_guorezhengqiwendu", 305, 2, "过热蒸汽温度", "℃"));

        map.put("mo_huilu1wendu", ByteField.Init(new MockField(), "mo_huilu1wendu", 307, 2, "回路1温度", "℃"));

        map.put("mo_huilu2wendu", ByteField.Init(new MockField(), "mo_huilu2wendu", 309, 2, "回路2温度", "℃"));

        map.put("mo_huilu3wendu", ByteField.Init(new MockField(), "mo_huilu3wendu", 311, 2, "回路3温度", "℃"));

        map.put("mo_huilu4wendu", ByteField.Init(new MockField(), "mo_huilu4wendu", 313, 2, "回路4温度", "℃"));

        map.put("mo_huilu5wendu", ByteField.Init(new MockField(), "mo_huilu5wendu", 315, 2, "回路5温度", "℃"));

        map.put("mo_shiwaiwendu", ByteField.Init(new MockField(), "mo_shiwaiwendu", 317, 2, "室外温度", "℃"));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 319, 2, "蒸汽压力", "MPa", 100));

        map.put("mo_jishuiyali", ByteField.Init(new MockField(), "mo_jishuiyali", 321, 2, "给水压力", "MPa", 100));

        map.put("mo_chukouyali", ByteField.Init(new MockField(), "mo_chukouyali", 323, 2, "出口压力", "MPa", 100));

        map.put("mo_rukouyali", ByteField.Init(new MockField(), "mo_rukouyali", 325, 2, "入口压力", "MPa", 100));

        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 327, 2, "炉膛压力", "Pa"));

        map.put("mo_lutangchukouyali", ByteField.Init(new MockField(), "mo_lutangchukouyali", 329, 2, "炉膛出口压力", "Pa"));

        map.put("mo_ranqiyali", ByteField.Init(new MockField(), "mo_ranqiyali", 331, 2, "燃气压力", "KPa"));

        map.put("mo_yicifengya", ByteField.Init(new MockField(), "mo_yicifengya", 333, 2, "一次风压", "KPa"));

        map.put("mo_ecifengya", ByteField.Init(new MockField(), "mo_ecifengya", 335, 2, "二次风压", "KPa"));

        map.put("mo_ranliaoliang", ByteField.Init(new MockField(), "mo_ranliaoliang", 337, 2, "燃料量"));

        map.put("mo_zhengqiliuliang", ByteField.Init(new MockField(), "mo_zhengqiliuliang", 339, 2, "蒸汽流量"));

        map.put("mo_jishuiliuliang", ByteField.Init(new MockField(), "mo_jishuiliuliang", 341, 2, "给水流量"));

        map.put("mo_xunhuanliuliang", ByteField.Init(new MockField(), "mo_xunhuanliuliang", 343, 2, "循环流量"));

        map.put("mo_bushuiliuliang", ByteField.Init(new MockField(), "mo_bushuiliuliang", 345, 2, "补水流量"));

        map.put("mo_guoluyewei", ByteField.Init(new MockField(), "mo_guoluyewei", 347, 2, "锅炉液位", "mm"));

        map.put("mo_shuixiangyewei", ByteField.Init(new MockField(), "mo_shuixiangyewei", 349, 2, "水箱液位", "mm"));

        map.put("mo_paiyanyanghanliang", ByteField.Init(new MockField(), "mo_paiyanyanghanliang", 351, 2, "排烟氧含量", "%", 10));

        map.put("mo_lupaisudufankui", ByteField.Init(new MockField(), "mo_lupaisudufankui", 353, 2, "炉排速度反馈", "%"));

        map.put("mo_yinfengshuchufankui", ByteField.Init(new MockField(), "mo_yinfengshuchufankui", 355, 2, "引风输出反馈", "%"));

        map.put("mo_gufengshuchufankui", ByteField.Init(new MockField(), "mo_gufengshuchufankui", 357, 2, "鼓风输出反馈", "%"));

        map.put("mo_jishuishuchufankui", ByteField.Init(new MockField(), "mo_jishuishuchufankui", 359, 2, "给水输出反馈", "%"));

        map.put("mo_meishuiwendu", ByteField.Init(new MockField(), "mo_meishuiwendu", 361, 2, "媒水温度", "℃"));

        map.put("mo_shuixiangwendu", ByteField.Init(new MockField(), "mo_shuixiangwendu", 363, 2, "水箱温度", "℃"));

        map.put("mo_pengzhangguanyewei", ByteField.Init(new MockField(), "mo_pengzhangguanyewei", 365, 2, "膨胀罐液位", "mm"));

        map.put("mo_shanzhengguanyewei", ByteField.Init(new MockField(), "mo_shanzhengguanyewei", 367, 2, "闪蒸罐液位", "mm"));

        map.put("mo_lengningyeguanyewei", ByteField.Init(new MockField(), "mo_lengningyeguanyewei", 369, 2, "冷凝液罐液位", "mm"));

        map.put("mo_chuguanyewei", ByteField.Init(new MockField(), "mo_chuguanyewei", 371, 2, "储罐液位", "mm"));

        map.put("mo_pengzhangguanwendu", ByteField.Init(new MockField(), "mo_pengzhangguanwendu", 373, 2, "膨胀罐温度", "℃"));

        map.put("mo_shanzhengguanwendu", ByteField.Init(new MockField(), "mo_shanzhengguanwendu", 375, 2, "闪蒸罐温度", "℃"));

        map.put("mo_lengningyeguanwendu", ByteField.Init(new MockField(), "mo_lengningyeguanwendu", 377, 2, "冷凝液罐温度", "℃"));

        map.put("mo_chuguanwendu", ByteField.Init(new MockField(), "mo_chuguanwendu", 379, 2, "储罐温度", "℃"));

        map.put("mo_guoluyali", ByteField.Init(new MockField(), "mo_guoluyali", 381, 2, "锅炉压力", "MPa", 100));

        map.put("mo_guorezhengqiyali", ByteField.Init(new MockField(), "mo_guorezhengqiyali", 383, 2, "过热蒸汽压力", "MPa", 100));

        map.put("mo_paiyanchuyali", ByteField.Init(new MockField(), "mo_paiyanchuyali", 385, 2, "排烟处压力", "Pa"));

        map.put("mo_fengshifengya", ByteField.Init(new MockField(), "mo_fengshifengya", 387, 2, "风室风压", "KPa"));

        map.put("mo_yinfengjidianliu", ByteField.Init(new MockField(), "mo_yinfengjidianliu", 389, 2, "引风机电流", "A"));

        map.put("mo_gufengjidianliu", ByteField.Init(new MockField(), "mo_gufengjidianliu", 391, 2, "鼓风机电流", "A"));

        map.put("mo_jiliaojisudufankui", ByteField.Init(new MockField(), "mo_jiliaojisudufankui", 393, 2, "给料机速度反馈", "%"));

        map.put("mo_panguan1wendu", ByteField.Init(new MockField(), "mo_panguan1wendu", 395, 2, "盘管1温度", "℃"));

        map.put("mo_panguan2wendu", ByteField.Init(new MockField(), "mo_panguan2wendu", 397, 2, "盘管2温度", "℃"));

        map.put("mo_panguan3wendu", ByteField.Init(new MockField(), "mo_panguan3wendu", 399, 2, "盘管3温度", "℃"));

        map.put("mo_panguan4wendu", ByteField.Init(new MockField(), "mo_panguan4wendu", 401, 2, "盘管4温度", "℃"));

        map.put("mo_panguan5wendu", ByteField.Init(new MockField(), "mo_panguan5wendu", 403, 2, "盘管5温度", "℃"));

        map.put("mo_panguan6wendu", ByteField.Init(new MockField(), "mo_panguan6wendu", 405, 2, "盘管6温度", "℃"));

        map.put("mo_panguan7wendu", ByteField.Init(new MockField(), "mo_panguan7wendu", 407, 2, "盘管7温度", "℃"));

        map.put("mo_panguan8wendu", ByteField.Init(new MockField(), "mo_panguan8wendu", 409, 2, "盘管8温度", "℃"));

        map.put("mo_panguan9wendu", ByteField.Init(new MockField(), "mo_panguan9wendu", 411, 2, "盘管9温度", "℃"));

        map.put("mo_panguan10wendu", ByteField.Init(new MockField(), "mo_panguan10wendu", 413, 2, "盘管10温度", "℃"));

        map.put("se_paiyanwendu", ByteField.Init(new SettingField(), "se_paiyanwendu", 465, 2, "排烟温度", "℃"));

        map.put("se_baojingwendu", ByteField.Init(new SettingField(), "se_baojingwendu", 467, 2, "报警温度", "℃"));

        map.put("se_tingluwendu", ByteField.Init(new SettingField(), "se_tingluwendu", 469, 2, "停炉温度", "℃"));

        map.put("se_mubiaowendu", ByteField.Init(new SettingField(), "se_mubiaowendu", 471, 2, "目标温度", "℃"));

        map.put("se_qiluwendu", ByteField.Init(new SettingField(), "se_qiluwendu", 473, 2, "启炉温度", "℃"));

        map.put("se_zhuanhuohuichawendu", ByteField.Init(new SettingField(), "se_zhuanhuohuichawendu", 475, 2, "转火回差温度", "℃"));

        map.put("se_qiluhuichawendu", ByteField.Init(new SettingField(), "se_qiluhuichawendu", 477, 2, "启炉回差温度", "℃"));

        map.put("se_kaibengwendu", ByteField.Init(new SettingField(), "se_kaibengwendu", 479, 2, "开泵温度", "℃"));

        map.put("se_guanbengwendu", ByteField.Init(new SettingField(), "se_guanbengwendu", 481, 2, "关泵温度", "℃"));

        map.put("se_baojingyali", ByteField.Init(new SettingField(), "se_baojingyali", 483, 2, "报警压力", "MPa", 100));

        map.put("se_tingluyali", ByteField.Init(new SettingField(), "se_tingluyali", 485, 2, "停炉压力", "MPa", 100));

        map.put("se_mubiaoyali", ByteField.Init(new SettingField(), "se_mubiaoyali", 487, 2, "目标压力", "MPa", 100));

        map.put("se_qiluyali", ByteField.Init(new SettingField(), "se_qiluyali", 489, 2, "启炉压力", "MPa", 100));

        map.put("se_zhuanhuohuichayali", ByteField.Init(new SettingField(), "se_zhuanhuohuichayali", 491, 2, "转火回差压力", "MPa", 100));

        map.put("se_qiluhuichayali", ByteField.Init(new SettingField(), "se_qiluhuichayali", 493, 2, "启炉回差压力", "MPa", 100));

        map.put("se_qianyanshi", ByteField.Init(new SettingField(), "se_qianyanshi", 495, 2, "前延时", "S"));

        map.put("se_houyanshimiao", ByteField.Init(new SettingField(), "se_houyanshimiao", 497, 2, "后延时秒", "S"));

        map.put("se_qianchuisao", ByteField.Init(new SettingField(), "se_qianchuisao", 499, 2, "前吹扫", "S"));

        map.put("se_houchuisao", ByteField.Init(new SettingField(), "se_houchuisao", 501, 2, "后吹扫", "S"));

        map.put("se_lubibaojingwendu", ByteField.Init(new SettingField(), "se_lubibaojingwendu", 503, 2, "炉壁报警温度", "℃"));

        map.put("se_lutangchukoubaojingwendu", ByteField.Init(new SettingField(), "se_lutangchukoubaojingwendu", 505, 2, "炉膛出口报警温度", "℃"));

        map.put("se_baohuwendu", ByteField.Init(new SettingField(), "se_baohuwendu", 507, 2, "保护温度", "℃"));

        map.put("se_bentipaiyanwendubaojingzhi", ByteField.Init(new SettingField(), "se_bentipaiyanwendubaojingzhi", 509, 2, "本体排烟温度报警值", "℃"));

        map.put("se_jiarezushu", ByteField.Init(new SettingField(), "se_jiarezushu", 511, 2, "加热组数"));

        map.put("se_jianceyalishijian", ByteField.Init(new SettingField(), "se_jianceyalishijian", 513, 2, "检测压力时间"));

        map.put("se_houyanshifen", ByteField.Init(new SettingField(), "se_houyanshifen", 515, 2, "后延时分", "m"));

        map.put("se_shedingwendu", ByteField.Init(new SettingField(), "se_shedingwendu", 517, 2, "设定温度", "℃"));

        map.put("se_mokuailutaishu", ByteField.Init(new SettingField(), "se_mokuailutaishu", 519, 2, "模块炉台数"));

        map.put("se_gufenghouyanshi", ByteField.Init(new SettingField(), "se_gufenghouyanshi", 521, 2, "鼓风后延时", "S"));

        map.put("se_yinfenghouyanshi", ByteField.Init(new SettingField(), "se_yinfenghouyanshi", 523, 2, "引风后延时", "S"));

        map.put("se_shuixiangkaibengwendu", ByteField.Init(new SettingField(), "se_shuixiangkaibengwendu", 525, 2, "水箱开泵温度", "℃"));

        map.put("se_shuixiangguanbengwendu", ByteField.Init(new SettingField(), "se_shuixiangguanbengwendu", 527, 2, "水箱关泵温度", "℃"));

        map.put("se_lushuibaojingwendu", ByteField.Init(new SettingField(), "se_lushuibaojingwendu", 529, 2, "炉水报警温度", "℃"));

        map.put("se_buchangxishu", ByteField.Init(new SettingField(), "se_buchangxishu", 531, 2, "补偿系数"));

        map.put("se_cankaowendu", ByteField.Init(new SettingField(), "se_cankaowendu", 533, 2, "参考温度", "℃"));

        map.put("se_tingluzuidazhi", ByteField.Init(new SettingField(), "se_tingluzuidazhi", 535, 2, "停炉最大值", "℃"));

        map.put("se_qiluzuixiaozhi", ByteField.Init(new SettingField(), "se_qiluzuixiaozhi", 537, 2, "启炉最小值", "℃"));

        map.put("se_cankaohuicha", ByteField.Init(new SettingField(), "se_cankaohuicha", 539, 2, "参考回差", "℃"));

        map.put("se_tingluwendu1", ByteField.Init(new SettingField(), "se_tingluwendu1", 541, 2, "停炉温度1", "℃"));

        map.put("se_qiluwendu1", ByteField.Init(new SettingField(), "se_qiluwendu1", 543, 2, "启炉温度1", "℃"));

        map.put("se_tingluwendu2", ByteField.Init(new SettingField(), "se_tingluwendu2", 545, 2, "停炉温度2", "℃"));

        map.put("se_qiluwendu2", ByteField.Init(new SettingField(), "se_qiluwendu2", 547, 2, "启炉温度2", "℃"));

        map.put("se_yusongliaoshijian", ByteField.Init(new SettingField(), "se_yusongliaoshijian", 549, 2, "预送料时间", "S"));

        map.put("se_dianhuoshijian", ByteField.Init(new SettingField(), "se_dianhuoshijian", 551, 2, "点火时间", "S"));

        map.put("se_songliaoqidongshijian", ByteField.Init(new SettingField(), "se_songliaoqidongshijian", 553, 2, "送料启动时间", "S"));

        map.put("se_songliaotingzhishijian", ByteField.Init(new SettingField(), "se_songliaotingzhishijian", 555, 2, "送料停止时间", "S"));

        map.put("se_dianhuojiange", ByteField.Init(new SettingField(), "se_dianhuojiange", 557, 2, "点火间隔", "m"));

        map.put("se_dianhuochenggongwendu", ByteField.Init(new SettingField(), "se_dianhuochenggongwendu", 559, 2, "点火成功温度", "℃"));

        map.put("se_lushuitingluwendu", ByteField.Init(new SettingField(), "se_lushuitingluwendu", 561, 2, "炉水停炉温度", "℃"));

        map.put("se_lushuiqiluwendu", ByteField.Init(new SettingField(), "se_lushuiqiluwendu", 563, 2, "炉水启炉温度", "℃"));

        map.put("se_meishuibaojingwendu", ByteField.Init(new SettingField(), "se_meishuibaojingwendu", 565, 2, "媒水报警温度", "℃"));

        map.put("se_meishuitingluwendu", ByteField.Init(new SettingField(), "se_meishuitingluwendu", 567, 2, "媒水停炉温度", "℃"));

        map.put("se_meishuiqiluwendu", ByteField.Init(new SettingField(), "se_meishuiqiluwendu", 569, 2, "媒水启炉温度", "℃"));

        map.put("se_kaibengyali", ByteField.Init(new SettingField(), "se_kaibengyali", 571, 2, "开泵压力", "MPa", 100));

        map.put("se_guanbengyali", ByteField.Init(new SettingField(), "se_guanbengyali", 573, 2, "关泵压力", "MPa", 100));

        map.put("se_panguanbaojingwendu", ByteField.Init(new SettingField(), "se_panguanbaojingwendu", 575, 2, "盘管报警温度", "℃"));

        map.put("se_huilu1baojingwendu", ByteField.Init(new SettingField(), "se_huilu1baojingwendu", 577, 2, "回路1报警温度", "℃"));

        map.put("se_huilu1kaibengwendu", ByteField.Init(new SettingField(), "se_huilu1kaibengwendu", 579, 2, "回路1开泵温度", "℃"));

        map.put("se_huilu1guanbengwendu", ByteField.Init(new SettingField(), "se_huilu1guanbengwendu", 581, 2, "回路1关泵温度", "℃"));

        map.put("se_huilu2baojingwendu", ByteField.Init(new SettingField(), "se_huilu2baojingwendu", 583, 2, "回路2报警温度", "℃"));

        map.put("se_huilu2kaibengwendu", ByteField.Init(new SettingField(), "se_huilu2kaibengwendu", 585, 2, "回路2开泵温度", "℃"));

        map.put("se_huilu2guanbengwendu", ByteField.Init(new SettingField(), "se_huilu2guanbengwendu", 587, 2, "回路2关泵温度", "℃"));

        map.put("se_huilu3baojingwendu", ByteField.Init(new SettingField(), "se_huilu3baojingwendu", 589, 2, "回路3报警温度", "℃"));

        map.put("se_huilu3kaibengwendu", ByteField.Init(new SettingField(), "se_huilu3kaibengwendu", 591, 2, "回路3开泵温度", "℃"));

        map.put("se_huilu3guanbengwendu", ByteField.Init(new SettingField(), "se_huilu3guanbengwendu", 593, 2, "回路3关泵温度", "℃"));

        map.put("se_huilu4baojingwendu", ByteField.Init(new SettingField(), "se_huilu4baojingwendu", 595, 2, "回路4报警温度", "℃"));

        map.put("se_huilu4kaibengwendu", ByteField.Init(new SettingField(), "se_huilu4kaibengwendu", 597, 2, "回路4开泵温度", "℃"));

        map.put("se_huilu4guanbengwendu", ByteField.Init(new SettingField(), "se_huilu4guanbengwendu", 599, 2, "回路4关泵温度", "℃"));

        map.put("se_huilu5baojingwendu", ByteField.Init(new SettingField(), "se_huilu5baojingwendu", 601, 2, "回路5报警温度", "℃"));

        map.put("se_huilu5kaibengwendu", ByteField.Init(new SettingField(), "se_huilu5kaibengwendu", 603, 2, "回路5开泵温度", "℃"));

        map.put("se_huilu5guanbengwendu", ByteField.Init(new SettingField(), "se_huilu5guanbengwendu", 605, 2, "回路5关泵温度", "℃"));

        map.put("st_qidongshijian1", ByteField.Init(new StartStopField(), "st_qidongshijian1", 607, 2, "启动时间1"));

        map.put("st_tingzhishijian1", ByteField.Init(new StartStopField(), "st_tingzhishijian1", 609, 2, "停止时间1"));

        map.put("st_qidongshijian2", ByteField.Init(new StartStopField(), "st_qidongshijian2", 611, 2, "启动时间2"));

        map.put("st_tingzhishijian2", ByteField.Init(new StartStopField(), "st_tingzhishijian2", 613, 2, "停止时间2"));

        map.put("st_qidongshijian3", ByteField.Init(new StartStopField(), "st_qidongshijian3", 615, 2, "启动时间3"));

        map.put("st_tingzhishijian3", ByteField.Init(new StartStopField(), "st_tingzhishijian3", 617, 2, "停止时间3"));

        map.put("st_qidongshijian4", ByteField.Init(new StartStopField(), "st_qidongshijian4", 619, 2, "启动时间4"));

        map.put("st_tingzhishijian4", ByteField.Init(new StartStopField(), "st_tingzhishijian4", 621, 2, "停止时间4"));

        map.put("st_qidongshijian5", ByteField.Init(new StartStopField(), "st_qidongshijian5", 623, 2, "启动时间5"));

        map.put("st_tingzhishijian5", ByteField.Init(new StartStopField(), "st_tingzhishijian5", 625, 2, "停止时间5"));

        map.put("st_qidongshijian6", ByteField.Init(new StartStopField(), "st_qidongshijian6", 627, 2, "启动时间6"));

        map.put("st_tingzhishijian6", ByteField.Init(new StartStopField(), "st_tingzhishijian6", 629, 2, "停止时间6"));

        map.put("de_ranshaoqi", ByteField.Init(new RanShaoQiField(), "de_ranshaoqi", 681, 2, "燃烧器", CTL_NJZJ_Common_ValueMaps.coms_ranshaoqi_status));

        map.put("de_jiarezu", ByteField.Init(new DeviceField(), "de_jiarezu", 683, 2, "加热组", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_bushui_beng", ByteField.Init(new DeviceField(), "de_bushui_beng", 685, 2, "补水泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_jishui_beng", ByteField.Init(new DeviceField(), "de_jishui_beng", 687, 2, "给水泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_buyou_beng", ByteField.Init(new DeviceField(), "de_buyou_beng", 689, 2, "补油泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_xunhuan_beng", ByteField.Init(new DeviceField(), "de_xunhuan_beng", 691, 2, "循环泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_lengning_beng", ByteField.Init(new DeviceField(), "de_lengning_beng", 693, 2, "冷凝泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_reshui_beng", ByteField.Init(new DeviceField(), "de_reshui_beng", 695, 2, "热水泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_zhenkong_beng", ByteField.Init(new DeviceField(), "de_zhenkong_beng", 697, 2, "真空泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_ecixunhuan_beng", ByteField.Init(new DeviceField(), "de_ecixunhuan_beng", 699, 2, "二次循环泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_yinfengji_fan", ByteField.Init(new DeviceField(), "de_yinfengji_fan", 701, 2, "引风机", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_gufengji_fan", ByteField.Init(new DeviceField(), "de_gufengji_fan", 703, 2, "鼓风机", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_lupai_fan", ByteField.Init(new DeviceField(), "de_lupai_fan", 705, 2, "炉排", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_chuzhaji_fan", ByteField.Init(new DeviceField(), "de_chuzhaji_fan", 707, 2, "出渣机", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_ecigufengji_fan", ByteField.Init(new DeviceField(), "de_ecigufengji_fan", 709, 2, "二次鼓风机", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_dianhuoqi", ByteField.Init(new DeviceField(), "de_dianhuoqi", 711, 2, "点火器", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_shangmeiji", ByteField.Init(new DeviceField(), "de_shangmeiji", 713, 2, "上煤机", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_songliaoji", ByteField.Init(new DeviceField(), "de_songliaoji", 715, 2, "送料机", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_jiayao_beng", ByteField.Init(new DeviceField(), "de_jiayao_beng", 717, 2, "加药泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_paiwufa", ByteField.Init(new DeviceField(), "de_paiwufa", 719, 2, "排污阀", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu1xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu1xunhuan_beng", 721, 2, "回路1循环泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu2xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu2xunhuan_beng", 723, 2, "回路2循环泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu3xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu3xunhuan_beng", 725, 2, "回路3循环泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu4xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu4xunhuan_beng", 727, 2, "回路4循环泵", CTL_NJZJ_Common_ValueMaps.coms_device));

        map.put("de_huilu5xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu5xunhuan_beng", 729, 2, "回路5循环泵", CTL_NJZJ_Common_ValueMaps.coms_device));
        /*
        //扩展报警
        map.put("ex_cainuanchukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_cainuanchukouwendugaobaojing", 135, 1, "采暖出口温度高报警"));

        map.put("ex_reshuichukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_reshuichukouwendugaobaojing", 136, 1, "热水出口温度高报警"));

        map.put("ex_jinkouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_jinkouwendugaobaojing", 137, 1, "进口温度高报警"));

        map.put("ex_pengzhangguanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanwendugaobaojing", 138, 1, "膨胀罐温度高报警"));

        map.put("ex_guodianliubaojing", ByteField.Init(new ExceptionField(), "ex_guodianliubaojing", 139, 1, "过电流报警"));

        map.put("ex_jishuiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_jishuiyaligaobaojing", 140, 1, "给水压力高报警"));

        map.put("ex_jienengqichukouyanwengaobaojing", ByteField.Init(new ExceptionField(), "ex_jienengqichukouyanwengaobaojing", 141, 1, "节能器出口烟温高报警"));

        map.put("ex_lengningqichukouyanwengaobaojing", ByteField.Init(new ExceptionField(), "ex_lengningqichukouyanwengaobaojing", 142, 1, "冷凝器出口烟温高报警"));

        map.put("ex_chushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chushuiwendugaobaojing", 143, 1, "出水温度高报警"));

        map.put("ex_gaowenbaohuwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_gaowenbaohuwendugaobaojing", 144, 1, "高温保护温度高报警"));

        map.put("ex_youwengaobaojing", ByteField.Init(new ExceptionField(), "ex_youwengaobaojing", 145, 1, "油温高报警"));

        map.put("ex_wenchagaobaojing", ByteField.Init(new ExceptionField(), "ex_wenchagaobaojing", 146, 1, "温差高报警"));

        map.put("ex_shuibengguozaibaojing", ByteField.Init(new ExceptionField(), "ex_shuibengguozaibaojing", 147, 1, "水泵过载报警"));

        map.put("ex_jiarezuguozaibaojing", ByteField.Init(new ExceptionField(), "ex_jiarezuguozaibaojing", 148, 1, "加热组过载报警"));

        map.put("ex_churexunhuanbengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_churexunhuanbengguzhangbaojing", 149, 1, "储热循环泵故障报警"));

        map.put("ex_yandaodiefaguzhang", ByteField.Init(new ExceptionField(), "ex_yandaodiefaguzhang", 150, 1, "烟道蝶阀故障"));

        map.put("ex_nengliangshezhiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_nengliangshezhiwendugaobaojing", 151, 1, "能量设置温度高报警"));

        map.put("ex_zhengqiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_zhengqiwendugaobaojing", 152, 1, "蒸汽温度高报警"));

        map.put("ex_shuixiangwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_shuixiangwendugaobaojing", 153, 1, "水箱温度高报警"));

        map.put("ex_4#guodianliubaojing", ByteField.Init(new ExceptionField(), "ex_4#guodianliubaojing", 154, 1, "4#过电流报警"));

        map.put("ex_5#guodianliubaojing", ByteField.Init(new ExceptionField(), "ex_5#guodianliubaojing", 155, 1, "5#过电流报警"));

        map.put("ex_6#guodianliubaojing", ByteField.Init(new ExceptionField(), "ex_6#guodianliubaojing", 156, 1, "6#过电流报警"));

        map.put("ex_7#guodianliubaojing", ByteField.Init(new ExceptionField(), "ex_7#guodianliubaojing", 157, 1, "7#过电流报警"));

        map.put("ex_8#guodianliubaojing", ByteField.Init(new ExceptionField(), "ex_8#guodianliubaojing", 158, 1, "8#过电流报警"));

        map.put("ex_gufengjiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_gufengjiguzhangbaojing", 159, 1, "鼓风机故障报警"));

        map.put("ex_jiezhigaowenbaojing", ByteField.Init(new ExceptionField(), "ex_jiezhigaowenbaojing", 160, 1, "介质高温报警"));

        map.put("ex_jiezhidiwenbaojing", ByteField.Init(new ExceptionField(), "ex_jiezhidiwenbaojing", 161, 1, "介质低温报警"));
        //扩展故障
        map.put("ex_cainuanchukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_cainuanchukouwenduchuanganqiguzhang", 250, 1, "采暖出口温度传感器故障"));

        map.put("ex_reshuichukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuichukouwenduchuanganqiguzhang", 251, 1, "热水出口温度传感器故障"));

        map.put("ex_jinchukouyachachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinchukouyachachuanganqiguzhang", 252, 1, "进出口压差传感器故障"));

        map.put("ex_1#chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_1#chukouwenduchuanganqiguzhang", 253, 1, "1#出口温度传感器故障出口温度传感器故障"));

        map.put("ex_2#chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_2#chukouwenduchuanganqiguzhang", 254, 1, "2#出口温度传感器故障"));

        map.put("ex_jienengqichukouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqichukouyanwenchuanganqiguzhang", 255, 1, "节能器出口烟温传感器故障"));

        map.put("ex_jienengqijinkouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqijinkouyanwenchuanganqiguzhang", 256, 1, "节能器进口烟温传感器故障"));

        map.put("ex_lengningqichukouwendu_shui_chuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqichukouwendu_shui_chuanganqiguzhang", 257, 1, "冷凝器出口温度（水）传感器故障"));

        map.put("ex_lengningqijinkou_shui_chuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqijinkou_shui_chuanganqiguzhang", 258, 1, "冷凝器进口（水）传感器故障"));

        map.put("ex_lengningqichukouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqichukouyanwenchuanganqiguzhang", 259, 1, "冷凝器出口烟温传感器故障"));

        map.put("ex_lengningqijinkouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqijinkouyanwenchuanganqiguzhang", 260, 1, "冷凝器进口烟温传感器故障"));

        map.put("ex_cainuanjinkouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_cainuanjinkouwenduchuanganqiguzhang", 261, 1, "采暖进口温度传感器故障"));

        map.put("ex_reshuijinkouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuijinkouwenduchuanganqiguzhang", 262, 1, "热水进口温度传感器故障"));

        map.put("ex_kongzhixiangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_kongzhixiangwenduchuanganqiguzhang", 263, 1, "控制箱温度传感器故障"));

        map.put("ex_zhenkongyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongyalichuanganqiguzhang", 264, 1, "真空压力传感器故障"));

        map.put("ex_chushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiguzhang", 265, 1, "出水温度传感器故障"));

        map.put("ex_jinshuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinshuiwenduchuanganqiguzhang", 266, 1, "进水温度传感器故障"));

        map.put("ex_youwenjiancechuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_youwenjiancechuanganqiguzhang", 267, 1, "油温检测传感器故障"));

        map.put("ex_gaowenbaohuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gaowenbaohuchuanganqiguzhang", 268, 1, "高温保护传感器故障"));

        map.put("ex_chukouyouwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouyouwenchuanganqiguzhang", 269, 1, "出口油温传感器故障"));

        map.put("ex_jinkouyouwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinkouyouwenchuanganqiguzhang", 270, 1, "进口油温传感器故障"));

        map.put("ex_huanrewenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huanrewenduchuanganqiguzhang", 271, 1, "换热温度传感器故障"));

        map.put("ex_xitongwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_xitongwenduchuanganqiguzhang", 272, 1, "系统温度传感器故障"));

        map.put("ex_nengliangshezhiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_nengliangshezhiwenduchuanganqiguzhang", 273, 1, "能量设置温度传感器故障"));

        map.put("ex_zhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiwenduchuanganqiguzhang", 274, 1, "蒸汽温度传感器故障"));

        map.put("ex_shineiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shineiwenduchuanganqiguzhang", 275, 1, "室内温度传感器故障"));

        map.put("ex_1#dianliufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_1#dianliufankuichuanganqiguzhang", 276, 1, "1#电流反馈传感器故障"));

        map.put("ex_2#dianliufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_2#dianliufankuichuanganqiguzhang", 982, 1, "2#电流反馈传感器故障"));

        map.put("ex_3#dianliufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_3#dianliufankuichuanganqiguzhang", 984, 1, "3#电流反馈传感器故障"));

        map.put("ex_4#dianliufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_4#dianliufankuichuanganqiguzhang", 986, 1, "4#电流反馈传感器故障"));

        map.put("ex_5#dianliufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_5#dianliufankuichuanganqiguzhang", 988, 1, "5#电流反馈传感器故障"));

        map.put("ex_jiezhiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jiezhiwenduchuanganqiguzhang", 990, 1, "介质温度传感器故障"));

        map.put("ex_xiyuwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_xiyuwenduchuanganqiguzhang", 992, 1, "洗浴温度传感器故障"));

        map.put("ex_huanjingwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huanjingwenduchuanganqiguzhang", 994, 1, "环境温度传感器故障"));

        map.put("ex_jiezhiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jiezhiyalichuanganqiguzhang", 996, 1, "介质压力传感器故障"));
        //扩展模拟量
        map.put("mo_cainuanchukouwendu", ByteField.Init(new MockField(), "mo_cainuanchukouwendu", 415, 2, "采暖出口温度"));

        map.put("mo_reshuichukouwendu", ByteField.Init(new MockField(), "mo_reshuichukouwendu", 417, 2, "热水出口温度"));

        map.put("mo_jinchukouyacha", ByteField.Init(new MockField(), "mo_jinchukouyacha", 419, 2, "进出口压差"));

        map.put("mo_1#chukouwendu", ByteField.Init(new MockField(), "mo_1#chukouwendu", 421, 2, "1#出口温度"));

        map.put("mo_2#chukouwendu", ByteField.Init(new MockField(), "mo_2#chukouwendu", 423, 2, "2#出口温度"));

        map.put("mo_jienengqichukouyanwen", ByteField.Init(new MockField(), "mo_jienengqichukouyanwen", 425, 2, "节能器出口烟温"));

        map.put("mo_jienengqijinkouyanwen", ByteField.Init(new MockField(), "mo_jienengqijinkouyanwen", 427, 2, "节能器进口烟温"));

        map.put("mo_lengningqichukouwendu_shui_", ByteField.Init(new MockField(), "mo_lengningqichukouwendu_shui_", 429, 2, "冷凝器出口温度（水）"));

        map.put("mo_lengningqijinkouwendu_shui_", ByteField.Init(new MockField(), "mo_lengningqijinkouwendu_shui_", 431, 2, "冷凝器进口温度（水）"));

        map.put("mo_lengningqichukouyanwen", ByteField.Init(new MockField(), "mo_lengningqichukouyanwen", 433, 2, "冷凝器出口烟温"));

        map.put("mo_lengningqijinkouyanwen", ByteField.Init(new MockField(), "mo_lengningqijinkouyanwen", 435, 2, "冷凝器进口烟温"));

        map.put("mo_cainuanjinkouwendu", ByteField.Init(new MockField(), "mo_cainuanjinkouwendu", 437, 2, "采暖进口温度"));

        map.put("mo_reshuijinkouwendu", ByteField.Init(new MockField(), "mo_reshuijinkouwendu", 439, 2, "热水进口温度"));

        map.put("mo_kongzhixiangwendu", ByteField.Init(new MockField(), "mo_kongzhixiangwendu", 441, 2, "控制箱温度"));

        map.put("mo_zhenkongyali", ByteField.Init(new MockField(), "mo_zhenkongyali", 443, 2, "真空压力"));

        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 445, 2, "出水温度"));

        map.put("mo_jinshuiwendu", ByteField.Init(new MockField(), "mo_jinshuiwendu", 447, 2, "进水温度"));

        map.put("mo_youwenjiance", ByteField.Init(new MockField(), "mo_youwenjiance", 449, 2, "油温检测"));

        map.put("mo_gaowenbaohu", ByteField.Init(new MockField(), "mo_gaowenbaohu", 451, 2, "高温保护"));

        map.put("mo_chukouyouwen", ByteField.Init(new MockField(), "mo_chukouyouwen", 453, 2, "出口油温"));

        map.put("mo_jinkouyouwen", ByteField.Init(new MockField(), "mo_jinkouyouwen", 455, 2, "进口油温"));

        map.put("mo_huanrewendu", ByteField.Init(new MockField(), "mo_huanrewendu", 457, 2, "换热温度"));

        map.put("mo_xitongwendu", ByteField.Init(new MockField(), "mo_xitongwendu", 459, 2, "系统温度"));

        map.put("mo_nengliangshezhiwendu", ByteField.Init(new MockField(), "mo_nengliangshezhiwendu", 461, 2, "能量设置温度"));

        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 463, 2, "蒸汽温度"));

        map.put("mo_shineiwendu", ByteField.Init(new MockField(), "mo_shineiwendu", 1046, 2, "室内温度"));

        map.put("mo_1#dianliufankui", ByteField.Init(new MockField(), "mo_1#dianliufankui", 1048, 2, "1#电流反馈"));

        map.put("mo_2#dianliufankui", ByteField.Init(new MockField(), "mo_2#dianliufankui", 1050, 2, "2#电流反馈"));

        map.put("mo_3#dianliufankui", ByteField.Init(new MockField(), "mo_3#dianliufankui", 1052, 2, "3#电流反馈"));

        map.put("mo_4#dianliufankui", ByteField.Init(new MockField(), "mo_4#dianliufankui", 1054, 2, "4#电流反馈"));

        map.put("mo_5#dianliufankui", ByteField.Init(new MockField(), "mo_5#dianliufankui", 1056, 2, "5#电流反馈"));

        map.put("mo_jiezhiwendu", ByteField.Init(new MockField(), "mo_jiezhiwendu", 1058, 2, "介质温度"));

        map.put("mo_xiyuwendu", ByteField.Init(new MockField(), "mo_xiyuwendu", 1060, 2, "洗浴温度"));

        map.put("mo_huanjingwendu", ByteField.Init(new MockField(), "mo_huanjingwendu", 1062, 2, "环境温度"));

        map.put("mo_jiezhiyali", ByteField.Init(new MockField(), "mo_jiezhiyali", 1064, 2, "介质压力"));
        //扩展设置
        map.put("se_touqieshijian_jiarezuyong_", ByteField.Init(new SettingField(), "se_touqieshijian_jiarezuyong_", 631, 2, "投切时间（加热组用）","s"));

        map.put("se_diaojieshijian_jiarezuyong_", ByteField.Init(new SettingField(), "se_diaojieshijian_jiarezuyong_", 633, 2, "调节时间（加热组用）","m"));

        map.put("se_chukouchaoyabaojing", ByteField.Init(new SettingField(), "se_chukouchaoyabaojing", 635, 2, "出口超压报警","MPa",100));

        map.put("se_jinkouchaoyabaojing", ByteField.Init(new SettingField(), "se_jinkouchaoyabaojing", 637, 2, "进口超压报警","MPa",100));

        map.put("se_cainuanbaojingwendu", ByteField.Init(new SettingField(), "se_cainuanbaojingwendu", 639, 2, "采暖报警温度","℃"));

        map.put("se_cainuankaibengwendu", ByteField.Init(new SettingField(), "se_cainuankaibengwendu", 641, 2, "采暖开泵温度","℃"));

        map.put("se_cainuanguanbengwendu", ByteField.Init(new SettingField(), "se_cainuanguanbengwendu", 643, 2, "采暖关泵温度","℃"));

        map.put("se_reshuibaojingwendu", ByteField.Init(new SettingField(), "se_reshuibaojingwendu", 645, 2, "热水报警温度","℃"));

        map.put("se_reshuikaibengwendu", ByteField.Init(new SettingField(), "se_reshuikaibengwendu", 647, 2, "热水开泵温度","℃"));

        map.put("se_reshuiguanbengwendu", ByteField.Init(new SettingField(), "se_reshuiguanbengwendu", 649, 2, "热水关泵温度","℃",100));

        map.put("se_meishuimubiaowendu", ByteField.Init(new SettingField(), "se_meishuimubiaowendu", 651, 2, "媒水目标温度","℃",100));

        map.put("se_meishuiqiluhuicha", ByteField.Init(new SettingField(), "se_meishuiqiluhuicha", 653, 2, "媒水启炉回差","℃",100));

        map.put("se_chukoudiyabaojing", ByteField.Init(new SettingField(), "se_chukoudiyabaojing", 655, 2, "出口低压报警","℃",100));

        map.put("se_jinchukouyachagao", ByteField.Init(new SettingField(), "se_jinchukouyachagao", 657, 2, "进出口压差高","℃",100));

        map.put("se_jinchukouyachadi", ByteField.Init(new SettingField(), "se_jinchukouyachadi", 659, 2, "进出口压差低","℃",100));

        map.put("se_jinkoudiyabaojing", ByteField.Init(new SettingField(), "se_jinkoudiyabaojing", 661, 2, "进口低压报警","℃"));

        map.put("se_jinkouchaowenbaojing", ByteField.Init(new SettingField(), "se_jinkouchaowenbaojing", 663, 2, "进口超温报警","℃"));

        map.put("se_jinkoudiwenbaojing", ByteField.Init(new SettingField(), "se_jinkoudiwenbaojing", 665, 2, "进口低温报警","℃"));

        map.put("se_chukoudiwenbaojing", ByteField.Init(new SettingField(), "se_chukoudiwenbaojing", 667, 2, "出口低温报警","℃"));

        map.put("se_pengzhangguanchaowen", ByteField.Init(new SettingField(), "se_pengzhangguanchaowen", 669, 2, "膨胀罐超温","℃"));

        map.put("se_mubiaoyewei", ByteField.Init(new SettingField(), "se_mubiaoyewei", 671, 2, "目标液位","mm"));

        map.put("se_kaibengyewei", ByteField.Init(new SettingField(), "se_kaibengyewei", 673, 2, "开泵液位","mm"));

        map.put("se_guanbengyewei", ByteField.Init(new SettingField(), "se_guanbengyewei", 675, 2, "关泵液位","mm"));

        map.put("se_kongbengmubiao", ByteField.Init(new SettingField(), "se_kongbengmubiao", 677, 2, "控泵目标","℃"));

        map.put("se_lengningqianyanshi", ByteField.Init(new SettingField(), "se_lengningqianyanshi", 679, 2, "冷凝前延时","s"));
        map.put("se_lengninghouyanshi", ByteField.Init(new SettingField(), "se_lengninghouyanshi", 1178, 2, "冷凝后延时","℃"));

        map.put("se_xieyashangxian", ByteField.Init(new SettingField(), "se_xieyashangxian", 1180, 2, "泄压上限","mm"));

        map.put("se_xieyaxiaxian", ByteField.Init(new SettingField(), "se_xieyaxiaxian", 1182, 2, "泄压下限","mm"));

        map.put("se_jishuibaojingyali", ByteField.Init(new SettingField(), "se_jishuibaojingyali", 1184, 2, "给水报警压力","mm"));

        map.put("se_zhenkongbaojingyali", ByteField.Init(new SettingField(), "se_zhenkongbaojingyali", 1186, 2, "真空报警压力","mm"));

        map.put("se_zhenkongyalishangxian", ByteField.Init(new SettingField(), "se_zhenkongyalishangxian", 1188, 2, "真空压力上限"));

        map.put("se_zhenkongyalixiaxian", ByteField.Init(new SettingField(), "se_zhenkongyalixiaxian", 1190, 2, "真空压力下限"));

        map.put("se_jinchukoumubiaoyacha", ByteField.Init(new SettingField(), "se_jinchukoumubiaoyacha", 1192, 2, "进出口目标压差"));

        map.put("se_jienengqichuyanchaowen", ByteField.Init(new SettingField(), "se_jienengqichuyanchaowen", 1194, 2, "节能器出烟超温"));

        map.put("se_lengningqichuyanchaowen", ByteField.Init(new SettingField(), "se_lengningqichuyanchaowen", 1196, 2, "冷凝器出烟超温"));

        map.put("se_jinshuitingluwendu", ByteField.Init(new SettingField(), "se_jinshuitingluwendu", 1198, 2, "进水停炉温度"));

        map.put("se_youwenbaohuwendu", ByteField.Init(new SettingField(), "se_youwenbaohuwendu", 1200, 2, "油温保护温度"));

        map.put("se_youwenshangxianwendu", ByteField.Init(new SettingField(), "se_youwenshangxianwendu", 1202, 2, "油温上限温度"));

        map.put("se_youwenzhongxianwendu", ByteField.Init(new SettingField(), "se_youwenzhongxianwendu", 1204, 2, "油温中限温度"));

        map.put("se_gaowenbaohuwendu", ByteField.Init(new SettingField(), "se_gaowenbaohuwendu", 1206, 2, "高温保护温度"));

        map.put("se_wenchabaohuwendu", ByteField.Init(new SettingField(), "se_wenchabaohuwendu", 1208, 2, "温差保护温度"));

        map.put("se_jinkoutingluwendu", ByteField.Init(new SettingField(), "se_jinkoutingluwendu", 1210, 2, "进口停炉温度"));

        map.put("se_jinkoumubiaowendu", ByteField.Init(new SettingField(), "se_jinkoumubiaowendu", 1212, 2, "进口目标温度"));

        map.put("se_jinkouqiluhuicha", ByteField.Init(new SettingField(), "se_jinkouqiluhuicha", 1214, 2, "进口启炉回差"));

        map.put("se_youwenxiaxianwendu", ByteField.Init(new SettingField(), "se_youwenxiaxianwendu", 1216, 2, "油温下限温度"));

        map.put("se_huanrekaibengwendu", ByteField.Init(new SettingField(), "se_huanrekaibengwendu", 1218, 2, "换热开泵温度"));

        map.put("se_huanreguanbengwendu", ByteField.Init(new SettingField(), "se_huanreguanbengwendu", 1220, 2, "换热关泵温度"));

        map.put("se_xitongkaibengwendu", ByteField.Init(new SettingField(), "se_xitongkaibengwendu", 1222, 2, "系统开泵温度"));

        map.put("se_xitongguanbengwendu", ByteField.Init(new SettingField(), "se_xitongguanbengwendu", 1224, 2, "系统关泵温度"));

        map.put("se_yandaodiefaxingcheng", ByteField.Init(new SettingField(), "se_yandaodiefaxingcheng", 1226, 2, "烟道蝶阀行程"));

        map.put("se_yandaodiefayanshi", ByteField.Init(new SettingField(), "se_yandaodiefayanshi", 1228, 2, "烟道蝶阀延时"));

        map.put("se_wenchashangxianwendu", ByteField.Init(new SettingField(), "se_wenchashangxianwendu", 1230, 2, "温差上限温度"));

        map.put("se_wenchaxiaxianwendu", ByteField.Init(new SettingField(), "se_wenchaxiaxianwendu", 1232, 2, "温差下限温度"));

        map.put("se_chushuitingluwendu", ByteField.Init(new SettingField(), "se_chushuitingluwendu", 1234, 2, "出水停炉温度"));

        map.put("se_zhengqibaojing", ByteField.Init(new SettingField(), "se_zhengqibaojing", 1236, 2, "蒸汽报警"));

        map.put("se_zhengqitinglu", ByteField.Init(new SettingField(), "se_zhengqitinglu", 1238, 2, "蒸汽停炉"));

        map.put("se_zhengqimubiao", ByteField.Init(new SettingField(), "se_zhengqimubiao", 1240, 2, "蒸汽目标"));

        map.put("se_zhengqihuicha", ByteField.Init(new SettingField(), "se_zhengqihuicha", 1242, 2, "蒸汽回差"));

        map.put("se_dibaojingyewei", ByteField.Init(new SettingField(), "se_dibaojingyewei", 1244, 2, "低报警液位"));

        map.put("se_gaobaojingyewei", ByteField.Init(new SettingField(), "se_gaobaojingyewei", 1246, 2, "高报警液位"));

        map.put("se_cainuantingluwendu", ByteField.Init(new SettingField(), "se_cainuantingluwendu", 1248, 2, "采暖停炉温度"));

        map.put("se_cainuanqiluwendu", ByteField.Init(new SettingField(), "se_cainuanqiluwendu", 1250, 2, "采暖启炉温度"));

        map.put("se_1#baojingdianliu", ByteField.Init(new SettingField(), "se_1#baojingdianliu", 1252, 2, "1#报警电流"));

        map.put("se_2#baojingdianliu", ByteField.Init(new SettingField(), "se_2#baojingdianliu", 1254, 2, "2#报警电流"));

        map.put("se_3#baojingdianliu", ByteField.Init(new SettingField(), "se_3#baojingdianliu", 1256, 2, "3#报警电流"));

        map.put("se_4#baojingdianliu", ByteField.Init(new SettingField(), "se_4#baojingdianliu", 1258, 2, "4#报警电流"));

        map.put("se_5#baojingdianliu", ByteField.Init(new SettingField(), "se_5#baojingdianliu", 1260, 2, "5#报警电流"));

        map.put("se_jiezhichaowenbaojing", ByteField.Init(new SettingField(), "se_jiezhichaowenbaojing", 1262, 2, "介质超温报警"));

        map.put("se_jiezhichaowenhuifu", ByteField.Init(new SettingField(), "se_jiezhichaowenhuifu", 1264, 2, "介质超温恢复"));

        map.put("se_jiezhidiwenbaojing", ByteField.Init(new SettingField(), "se_jiezhidiwenbaojing", 1266, 2, "介质低温报警"));

        map.put("se_jiezhidiwenhuifu", ByteField.Init(new SettingField(), "se_jiezhidiwenhuifu", 1268, 2, "介质低温恢复"));

        map.put("se_xunhuanguanxingshijian", ByteField.Init(new SettingField(), "se_xunhuanguanxingshijian", 1270, 2, "循环惯性时间"));

        map.put("se_xiyubaojingwendu", ByteField.Init(new SettingField(), "se_xiyubaojingwendu", 1272, 2, "洗浴报警温度"));

        map.put("se_xiyukaibengwendu", ByteField.Init(new SettingField(), "se_xiyukaibengwendu", 1274, 2, "洗浴开泵温度"));

        map.put("se_xiyuguanbengwendu", ByteField.Init(new SettingField(), "se_xiyuguanbengwendu", 1276, 2, "洗浴关泵温度"));

        map.put("se_jiezhichaoyabaojing", ByteField.Init(new SettingField(), "se_jiezhichaoyabaojing", 1278, 2, "介质超压报警"));

        map.put("se_jiezhichaoyahuifu", ByteField.Init(new SettingField(), "se_jiezhichaoyahuifu", 1280, 2, "介质超压恢复"));
        //控制设备
        map.put("de_cainuanxunhuanbeng", ByteField.Init(new DeviceField(), "de_cainuanxunhuanbeng", 731, 2,  "采暖循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_reshuixunhuanbeng", ByteField.Init(new DeviceField(), "de_reshuixunhuanbeng", 733, 2,  "热水循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_paiqifa", ByteField.Init(new DeviceField(), "de_paiqifa", 735, 2,  "排汽阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_xieyafa", ByteField.Init(new DeviceField(), "de_xieyafa", 737, 2,  "泄压阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_zhenkongfa", ByteField.Init(new DeviceField(), "de_zhenkongfa", 739, 2,  "真空阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_pangtongfa", ByteField.Init(new DeviceField(), "de_pangtongfa", 741, 2,  "旁通阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_churexunhuanbeng", ByteField.Init(new DeviceField(), "de_churexunhuanbeng", 743, 2,  "储热循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huanrexunhuanbeng", ByteField.Init(new DeviceField(), "de_huanrexunhuanbeng", 745, 2,  "换热循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_xitongxunhuanbeng", ByteField.Init(new DeviceField(), "de_xitongxunhuanbeng", 747, 2,  "系统循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_churebushuibeng", ByteField.Init(new DeviceField(), "de_churebushuibeng", 749, 2,  "储热补水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_yandaodiefa", ByteField.Init(new DeviceField(), "de_yandaodiefa", 751, 2,  "烟道蝶阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huishuibeng", ByteField.Init(new DeviceField(), "de_huishuibeng", 753, 2,  "回水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_santongfa", ByteField.Init(new DeviceField(), "de_santongfa", 755, 2,  "三通阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_xiyuxunhuanbeng", ByteField.Init(new DeviceField(), "de_xiyuxunhuanbeng", 757, 2,  "洗浴循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_reshuidiaojiefa", ByteField.Init(new DeviceField(), "de_reshuidiaojiefa", 759, 2,  "热水调节阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        */
    }
}
