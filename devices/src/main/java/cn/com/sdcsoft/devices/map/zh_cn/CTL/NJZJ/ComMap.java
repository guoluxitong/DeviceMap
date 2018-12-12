package cn.com.sdcsoft.devices.map.zh_cn.CTL.NJZJ;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJZJ_485.*;

public class ComMap extends DevicePointMap {

    public ComMap() {
        //基本信息 010306000028455C
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 7, 2, "系统状态", CTL_NJZJ_Common_ValueMaps.coms_status));

        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new RunDaysField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 0, 0, "运行天数", "天"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 0, 0, "运行小时数", "时"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new PowerField(), SdcSoftDevice.KEY_POINT_POWER, 3, 2, "燃料类型", coms_power));

        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 5, 2, "介质类型", coms_media));

        map.put("ba_guolushuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_guolushuiweizhuangtai", 25, 2, "锅炉液位状态", coms_level));

        map.put("ba_shuixiangshuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuixiangshuiweizhuangtai", 27, 2, "水箱液位状态", coms_level));

        map.put("ba_guoluyalizhuangtai", ByteField.Init(new BaseInfoField(), "ba_guoluyalizhuangtai", 29, 2, "锅炉压力状态", CTL_NJZJ_Common_ValueMaps.coms_yalistatus));

        map.put("ba_leijijiaretianshu", ByteField.Init(new BaseInfoField(), "ba_leijijiaretianshu", 51, 2, "累计加热", "天"));

        map.put("ba_leijijiarexiaoshi", ByteField.Init(new BaseInfoField(), "ba_leijijiarexiaoshi", 53, 2, "累计加热", "时"));

        map.put("ba_dahuoshijian", ByteField.Init(new BaseInfoField(), "ba_dahuoshijian", 55, 2, "大火工作时间", "时"));

        map.put("ba_xiaohuoshijian", ByteField.Init(new BaseInfoField(), "ba_xiaohuoshijian", 57, 2, "小火工作时间", "时"));

        map.put("ba_fangdongkaiguan", ByteField.Init(new BaseInfoField(), "ba_fangdongkaiguan", 61, 2, "防冻开关", DevicePointMap.coms_open_close));
        //
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 88, 2, "排烟温度高报警"));

        map.put("ex_lushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lushuiwendugaobaojing", 90, 2, "炉水温度高报警"));

        map.put("ex_chukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chukouwendugaobaojing", 92, 2, "出口温度高报警"));

        map.put("ex_chaoyabaojing", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing", 94, 2, "超压报警"));

        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 96, 2, "极限低水位报警"));

        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 98, 2, "低水位报警"));

        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 100, 2, "高水位报警"));

        map.put("ex_shuiweixinhaoluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuiweixinhaoluojicuobaojing", 102, 2, "水位信号逻辑错报警"));

        map.put("ex_lubiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lubiwendugaobaojing", 104, 2, "炉壁温度高报警"));

        map.put("ex_fuyazhengqiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwendugaobaojing", 106, 2, "负压蒸汽温度高报警"));

        map.put("ex_ranshaoqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhangbaojing", 108, 2, "燃烧器故障报警"));

        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 110, 2, "燃气泄漏报警"));

        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 112, 2, "燃气压力低报警"));

        map.put("ex_ranqiyaliyichangbaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichangbaojing", 114, 2, "燃气压力异常报警"));

        map.put("ex_ranqiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaligaobaojing", 116, 2, "燃气压力高报警"));

        map.put("ex_jishuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_jishuibianpinqiguzhangbaojing", 118, 2, "给水变频器故障报警"));

        map.put("ex_xunhuanbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbianpinqiguzhangbaojing", 120, 2, "循环变频器故障报警"));

        map.put("ex_yinfengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yinfengbianpinqiguzhangbaojing", 122, 2, "引风变频器故障报警"));

        map.put("ex_gufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_gufengbianpinqiguzhangbaojing", 124, 2, "鼓风变频器故障报警"));

        map.put("ex_ecigufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhangbaojing", 126, 2, "二次鼓风变频器故障报警"));

        map.put("ex_lupaibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_lupaibianpinqiguzhangbaojing", 128, 2, "炉排变频器故障报警"));

        map.put("ex_jishuibengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_jishuibengguzhangbaojing", 130, 2, "给水泵故障报警"));

        map.put("ex_xunhuanbengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengguzhangbaojing", 132, 2, "循环泵故障报警"));

        map.put("ex_chaodiyabaojing", ByteField.Init(new ExceptionField(), "ex_chaodiyabaojing", 134, 2, "超低压报警"));

        map.put("ex_qiandianyabaojing", ByteField.Init(new ExceptionField(), "ex_qiandianyabaojing", 136, 2, "欠电压报警"));

        map.put("ex_guodianyabaojing", ByteField.Init(new ExceptionField(), "ex_guodianyabaojing", 138, 2, "过电压报警"));

        map.put("ex_quexiangbaojing", ByteField.Init(new ExceptionField(), "ex_quexiangbaojing", 140, 2, "缺相报警"));

        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 142, 2, "漏电报警"));

        map.put("ex_biansongqiguoyabaohu", ByteField.Init(new ExceptionField(), "ex_biansongqiguoyabaohu", 144, 2, "变送器过压保护"));

        map.put("ex_guanjiancanshuyichang", ByteField.Init(new ExceptionField(), "ex_guanjiancanshuyichang", 146, 2, "关键参数异常"));

        map.put("ex_shedingcanshuyichang", ByteField.Init(new ExceptionField(), "ex_shedingcanshuyichang", 148, 2, "设定参数异常"));

        map.put("ex_shizhongguzhang", ByteField.Init(new ExceptionField(), "ex_shizhongguzhang", 150, 2, "时钟故障"));

        map.put("ex_cunchuqiguzhang", ByteField.Init(new ExceptionField(), "ex_cunchuqiguzhang", 152, 2, "存储器故障"));

        map.put("ex_waibuliansuobaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuobaojing", 154, 2, "外部连锁报警"));

        map.put("ex_queyoubaojing", ByteField.Init(new ExceptionField(), "ex_queyoubaojing", 156, 2, "缺油报警"));

        map.put("ex_diyouweibaojing", ByteField.Init(new ExceptionField(), "ex_diyouweibaojing", 158, 2, "低油位报警"));

        map.put("ex_bentipaiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_bentipaiyanwendugaobaojing", 160, 2, "本体排烟温度高报警"));

        map.put("ex_bianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhangbaojing", 162, 2, "变频器故障报警"));

        map.put("ex_meishuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_meishuiwendugaobaojing", 164, 2, "媒水温度高报警"));

        map.put("ex_1#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_1#guoluguzhang", 166, 2, "1#锅炉故障"));

        map.put("ex_2#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_2#guoluguzhang", 168, 2, "2#锅炉故障"));

        map.put("ex_3#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_3#guoluguzhang", 170, 2, "3#锅炉故障"));

        map.put("ex_4#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_4#guoluguzhang", 172, 2, "4#锅炉故障"));

        map.put("ex_5#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_5#guoluguzhang", 174, 2, "5#锅炉故障"));

        map.put("ex_6#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_6#guoluguzhang", 176, 2, "6#锅炉故障"));

        map.put("ex_7#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_7#guoluguzhang", 178, 2, "7#锅炉故障"));

        map.put("ex_8#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_8#guoluguzhang", 180, 2, "8#锅炉故障"));

        map.put("ex_bushuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bushuibianpinqiguzhangbaojing", 182, 2, "补水变频器故障报警"));

        map.put("ex_diliuliangbaojing", ByteField.Init(new ExceptionField(), "ex_diliuliangbaojing", 184, 2, "低流量报警"));

        map.put("ex_jinkouwendudibaojing", ByteField.Init(new ExceptionField(), "ex_jinkouwendudibaojing", 186, 2, "进口温度低报警"));

        map.put("ex_xunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanbengbianpinqiguzhang", 188, 2, "循环泵变频器故障"));

        map.put("ex_ecixunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengbianpinqiguzhang", 190, 2, "二次循环泵变频器故障"));

        map.put("ex_reshuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengbianpinqiguzhang", 192, 2, "热水泵变频器故障"));

        map.put("ex_buyoubengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengbianpinqiguzhang", 194, 2, "补油泵变频器故障"));

        map.put("ex_ecigufengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhang", 196, 2, "二次鼓风变频器故障"));

        map.put("ex_songliaojibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_songliaojibianpinqiguzhang", 198, 2, "送料机变频器故障"));

        map.put("ex_zhenkongbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengbianpinqiguzhang", 200, 2, "真空泵变频器故障"));

        map.put("ex_lengningbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengbianpinqiguzhang", 202, 2, "冷凝泵变频器故障"));

        map.put("ex_bushuibengguzhang", ByteField.Init(new ExceptionField(), "ex_bushuibengguzhang", 204, 2, "补水泵故障"));

        map.put("ex_buyoubengguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengguzhang", 206, 2, "补油泵故障"));

        map.put("ex_lengningbengguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengguzhang", 208, 2, "冷凝泵故障"));

        map.put("ex_reshuibengguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengguzhang", 210, 2, "热水泵故障"));

        map.put("ex_zhenkongbengguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengguzhang", 212, 2, "真空泵故障"));

        map.put("ex_ecixunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengguzhang", 214, 2, "二次循环泵故障"));

        map.put("ex_huilu1xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1xunhuanbengguzhang", 216, 2, "回路1循环泵故障"));

        map.put("ex_huilu2xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2xunhuanbengguzhang", 218, 2, "回路2循环泵故障"));

        map.put("ex_huilu3xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3xunhuanbengguzhang", 220, 2, "回路3循环泵故障"));

        map.put("ex_huilu4xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4xunhuanbengguzhang", 222, 2, "回路4循环泵故障"));

        map.put("ex_huilu5xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5xunhuanbengguzhang", 224, 2, "回路5循环泵故障"));

        map.put("ex_huilu1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu1wendugaobaojing", 226, 2, "回路1温度高报警"));

        map.put("ex_huilu2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu2wendugaobaojing", 228, 2, "回路2温度高报警"));

        map.put("ex_huilu3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu3wendugaobaojing", 230, 2, "回路3温度高报警"));

        map.put("ex_huilu4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu4wendugaobaojing", 232, 2, "回路4温度高报警"));

        map.put("ex_huilu5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu5wendugaobaojing", 234, 2, "回路5温度高报警"));

        map.put("ex_panguan1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan1wendugaobaojing", 236, 2, "盘管1温度高报警"));

        map.put("ex_panguan2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan2wendugaobaojing", 238, 2, "盘管2温度高报警"));

        map.put("ex_panguan3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan3wendugaobaojing", 240, 2, "盘管3温度高报警"));

        map.put("ex_panguan4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan4wendugaobaojing", 242, 2, "盘管4温度高报警"));

        map.put("ex_panguan5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan5wendugaobaojing", 244, 2, "盘管5温度高报警"));

        map.put("ex_panguan6wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan6wendugaobaojing", 246, 2, "盘管6温度高报警"));

        map.put("ex_panguan7wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan7wendugaobaojing", 248, 2, "盘管7温度高报警"));

        map.put("ex_panguan8wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan8wendugaobaojing", 250, 2, "盘管8温度高报警"));

        map.put("ex_panguan9wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan9wendugaobaojing", 252, 2, "盘管9温度高报警"));

        map.put("ex_panguan10wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan10wendugaobaojing", 254, 2, "盘管10温度高报警"));

        map.put("ex_shanzhengguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanchaoyabaojing", 256, 2, "闪蒸罐超压报警"));

        map.put("ex_lengningguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanchaoyabaojing", 258, 2, "冷凝罐超压报警"));

        map.put("ex_pengzhangguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanchaoyabaojing", 260, 2, "膨胀罐超压报警"));

        map.put("ex_shanzhengguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweigaobaojing", 262, 2, "闪蒸罐液位高报警"));

        map.put("ex_shanzhengguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweidibaojing", 264, 2, "闪蒸罐液位低报警"));

        map.put("ex_lengningguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweigaobaojing", 266, 2, "冷凝罐液位高报警"));

        map.put("ex_lengningguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweidibaojing", 268, 2, "冷凝罐液位低报警"));

        map.put("ex_pengzhangguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweigaobaojing", 270, 2, "膨胀罐液位高报警"));

        map.put("ex_pengzhangguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweidibaojing", 272, 2, "膨胀罐液位低报警"));

        map.put("ex_jinchukouyachadibaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachadibaojing", 274, 2, "进出口压差低报警"));

        map.put("ex_jinchukouyachagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachagaobaojing", 276, 2, "进出口压差高报警"));

        map.put("ex_zhenkongyalibuzubaojing,", ByteField.Init(new ExceptionField(), "ex_zhenkongyalibuzubaojing,", 278, 2, "真空压力不足报警,"));

        map.put("ex_jinchukouwenchadibaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouwenchadibaojing", 280, 2, "进出口温差低报警"));

        map.put("ex_jinchukouwenchagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouwenchagaobaojing", 282, 2, "进出口温差高报警"));

        map.put("ex_chukouyaligaobaojing_guoluhuohuilu_", ByteField.Init(new ExceptionField(), "ex_chukouyaligaobaojing_guoluhuohuilu_", 284, 2, "出口压力高报警（锅炉或回路）"));

        map.put("ex_chukouyalidibaojing_guoluhuohuilu_", ByteField.Init(new ExceptionField(), "ex_chukouyalidibaojing_guoluhuohuilu_", 286, 2, "出口压力低报警（锅炉或回路）"));

        map.put("ex_jinkouyaligaobaojing_guoluhuohuilu_", ByteField.Init(new ExceptionField(), "ex_jinkouyaligaobaojing_guoluhuohuilu_", 288, 2, "进口压力高报警（锅炉或回路）"));

        map.put("ex_jinkouyalidibaojing_guoluhuohuilu_", ByteField.Init(new ExceptionField(), "ex_jinkouyalidibaojing_guoluhuohuilu_", 290, 2, "进口压力低报警（锅炉或回路）"));

        map.put("ex_yinfengjiguzhangbaojing_dongzuofankuiyichang_", ByteField.Init(new ExceptionField(), "ex_yinfengjiguzhangbaojing_dongzuofankuiyichang_", 292, 2, "引风机故障报警（动作反馈异常）"));

        map.put("ex_cainuanchukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_cainuanchukouwendugaobaojing", 294, 2, "采暖出口温度高报警"));

        map.put("ex_reshuichukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_reshuichukouwendugaobaojing", 296, 2, "热水出口温度高报警"));

        map.put("ex_jinkouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_jinkouwendugaobaojing", 298, 2, "进口温度高报警"));

        map.put("ex_pengzhangguanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanwendugaobaojing", 300, 2, "膨胀罐温度高报警"));

        map.put("ex_guodianliubaojing", ByteField.Init(new ExceptionField(), "ex_guodianliubaojing", 302, 2, "过电流报警"));

        map.put("ex_jishuiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_jishuiyaligaobaojing", 304, 2, "给水压力高报警"));

        map.put("ex_jienengqichukouyanwengaobaojing", ByteField.Init(new ExceptionField(), "ex_jienengqichukouyanwengaobaojing", 306, 2, "节能器出口烟温高报警"));

        map.put("ex_lengningqichukouyanwengaobaojing", ByteField.Init(new ExceptionField(), "ex_lengningqichukouyanwengaobaojing", 308, 2, "冷凝器出口烟温高报警"));

        map.put("ex_chushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chushuiwendugaobaojing", 310, 2, "出水温度高报警"));

        map.put("ex_gaowenbaohuwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_gaowenbaohuwendugaobaojing", 312, 2, "高温保护温度高报警"));

        map.put("ex_youwengaobaojing", ByteField.Init(new ExceptionField(), "ex_youwengaobaojing", 314, 2, "油温高报警"));

        map.put("ex_wenchagaobaojing", ByteField.Init(new ExceptionField(), "ex_wenchagaobaojing", 316, 2, "温差高报警"));

        map.put("ex_shuibengguozaibaojing", ByteField.Init(new ExceptionField(), "ex_shuibengguozaibaojing", 318, 2, "水泵过载报警"));

        map.put("ex_jiarezuguozaibaojing", ByteField.Init(new ExceptionField(), "ex_jiarezuguozaibaojing", 320, 2, "加热组过载报警"));

        map.put("ex_churexunhuanbengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_churexunhuanbengguzhangbaojing", 322, 2, "储热循环泵故障报警"));

        map.put("ex_yandaodiefaguzhang", ByteField.Init(new ExceptionField(), "ex_yandaodiefaguzhang", 324, 2, "烟道蝶阀故障"));

        map.put("ex_nengliangshezhiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_nengliangshezhiwendugaobaojing", 326, 2, "能量设置温度高报警"));
        //
        map.put("ex_zhengqiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_zhengqiwendugaobaojing", 333, 2, "蒸汽温度高报警"));

        map.put("ex_shuixiangwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_shuixiangwendugaobaojing", 335, 2, "水箱温度高报警"));
        //
        map.put("ex_bentipaiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_bentipaiyanwenduchuanganqiguzhang", 578, 2, "本体排烟温度传感器故障"));

        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 580, 2, "排烟温度传感器故障"));

        map.put("ex_lushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lushuiwenduchuanganqiguzhang", 582, 2, "炉水温度传感器故障"));

        map.put("ex_chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouwenduchuanganqiguzhang", 584, 2, "出口温度传感器故障"));

        map.put("ex_jinkouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinkouwenduchuanganqiguzhang", 586, 2, "进口温度传感器故障"));

        map.put("ex_jienengqichukouwenduchuanganqiguzhang(shui_", ByteField.Init(new ExceptionField(), "ex_jienengqichukouwenduchuanganqiguzhang(shui_", 588, 2, "节能器出口温度传感器故障(水）"));

        map.put("ex_jienengqijinkouwenduchuanganqiguzhang(shui_", ByteField.Init(new ExceptionField(), "ex_jienengqijinkouwenduchuanganqiguzhang(shui_", 590, 2, "节能器进口温度传感器故障(水）"));

        map.put("ex_jishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiwenduchuanganqiguzhang", 592, 2, "给水温度传感器故障"));

        map.put("ex_lutangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangwenduchuanganqiguzhang", 594, 2, "炉膛温度传感器故障"));

        map.put("ex_lutangchukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouwenduchuanganqiguzhang", 596, 2, "炉膛出口温度传感器故障"));

        map.put("ex_lubiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lubiwenduchuanganqiguzhang", 598, 2, "炉壁温度传感器故障"));

        map.put("ex_ranliaowenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranliaowenduchuanganqiguzhang", 600, 2, "燃料温度传感器故障"));

        map.put("ex_refengwenduchuanganqiguzhang_kongyuqichukou_", ByteField.Init(new ExceptionField(), "ex_refengwenduchuanganqiguzhang_kongyuqichukou_", 602, 2, "热风温度传感器故障（空预器出口）"));

        map.put("ex_fuyazhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwenduchuanganqiguzhang", 604, 2, "负压蒸汽温度传感器故障"));

        map.put("ex_guorezhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiwenduchuanganqiguzhang", 606, 2, "过热蒸汽温度传感器故障"));

        map.put("ex_huilu1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1wenduchuanganqiguzhang", 608, 2, "回路1温度传感器故障"));

        map.put("ex_huilu2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2wenduchuanganqiguzhang", 610, 2, "回路2温度传感器故障"));

        map.put("ex_huilu3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3wenduchuanganqiguzhang", 612, 2, "回路3温度传感器故障"));

        map.put("ex_huilu4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4wenduchuanganqiguzhang", 614, 2, "回路4温度传感器故障"));

        map.put("ex_huilu5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5wenduchuanganqiguzhang", 616, 2, "回路5温度传感器故障"));

        map.put("ex_shiwaiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shiwaiwenduchuanganqiguzhang", 618, 2, "室外温度传感器故障"));

        map.put("ex_zhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiyalichuanganqiguzhang", 620, 2, "蒸汽压力传感器故障"));

        map.put("ex_jishuiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiyalichuanganqiguzhang", 622, 2, "给水压力传感器故障"));

        map.put("ex_chukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouyalichuanganqiguzhang", 624, 2, "出口压力传感器故障"));

        map.put("ex_jinkouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinkouyalichuanganqiguzhang", 626, 2, "进口压力传感器故障"));

        map.put("ex_lutangyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangyalichuanganqiguzhang", 628, 2, "炉膛压力传感器故障"));

        map.put("ex_lutangchukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouyalichuanganqiguzhang", 630, 2, "炉膛出口压力传感器故障"));

        map.put("ex_ranqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranqiyalichuanganqiguzhang", 632, 2, "燃气压力传感器故障"));

        map.put("ex_yicifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yicifengyachuanganqiguzhang", 634, 2, "一次风压传感器故障"));

        map.put("ex_ecifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecifengyachuanganqiguzhang", 636, 2, "二次风压传感器故障"));

        map.put("ex_ranliaoliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_ranliaoliangchuanganqiguzhang_shunshizhi_", 638, 2, "燃料量传感器故障（瞬时值）"));

        map.put("ex_zhengqiliuliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_zhengqiliuliangchuanganqiguzhang_shunshizhi_", 640, 2, "蒸汽流量传感器故障（瞬时值）"));

        map.put("ex_jishuiliuliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_jishuiliuliangchuanganqiguzhang_shunshizhi_", 642, 2, "给水流量传感器故障（瞬时值）"));

        map.put("ex_xunhuanliuliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_xunhuanliuliangchuanganqiguzhang_shunshizhi_", 644, 2, "循环流量传感器故障（瞬时值）"));

        map.put("ex_bushuiliuliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_bushuiliuliangchuanganqiguzhang_shunshizhi_", 646, 2, "补水流量传感器故障（瞬时值）"));

        map.put("ex_guoluyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guoluyeweichuanganqiguzhang", 648, 2, "锅炉液位传感器故障"));

        map.put("ex_shuixiangyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangyeweichuanganqiguzhang", 650, 2, "水箱液位传感器故障"));

        map.put("ex_paiyanyanghanliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanyanghanliangchuanganqiguzhang", 652, 2, "排烟氧含量传感器故障"));

        map.put("ex_lupaisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lupaisudufankuichuanganqiguzhang", 654, 2, "炉排速度反馈传感器故障"));

        map.put("ex_yinfengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengshuchufankuichuanganqiguzhang", 656, 2, "引风输出反馈传感器故障"));

        map.put("ex_gufengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengshuchufankuichuanganqiguzhang", 658, 2, "鼓风输出反馈传感器故障"));

        map.put("ex_jishuishuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuishuchufankuichuanganqiguzhang", 660, 2, "给水输出反馈传感器故障"));

        map.put("ex_meishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_meishuiwenduchuanganqiguzhang", 662, 2, "媒水温度传感器故障"));

        map.put("ex_shuixiangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangwenduchuanganqiguzhang", 664, 2, "水箱温度传感器故障"));

        map.put("ex_pengzhangguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweichuanganqiguzhang", 666, 2, "膨胀罐液位传感器故障"));

        map.put("ex_shanzhengguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweichuanganqiguzhang", 668, 2, "闪蒸罐液位传感器故障"));

        map.put("ex_lengningyeguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanyeweichuanganqiguzhang", 670, 2, "冷凝液罐液位传感器故障"));

        map.put("ex_chuguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanyeweichuanganqiguzhang", 672, 2, "储罐液位传感器故障"));

        map.put("ex_pengzhangguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanwenduchuanganqiguzhang", 674, 2, "膨胀罐温度传感器故障"));

        map.put("ex_shanzhengguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanwenduchuanganqiguzhang", 676, 2, "闪蒸罐温度传感器故障"));

        map.put("ex_lengningyeguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanwenduchuanganqiguzhang", 678, 2, "冷凝液罐温度传感器故障"));

        map.put("ex_chuguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanwenduchuanganqiguzhang", 680, 2, "储罐温度传感器故障"));

        map.put("ex_xitongyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_xitongyalichuanganqiguzhang", 682, 2, "系统压力传感器故障"));

        map.put("ex_guorezhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiyalichuanganqiguzhang", 684, 2, "过热蒸汽压力传感器故障"));

        map.put("ex_paiyanchuyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanchuyalichuanganqiguzhang", 686, 2, "排烟处压力传感器故障"));

        map.put("ex_fengshifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fengshifengyachuanganqiguzhang", 688, 2, "风室风压传感器故障"));

        map.put("ex_yinfengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengjidianliuchuanganqiguzhang", 690, 2, "引风机电流传感器故障"));

        map.put("ex_gufengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengjidianliuchuanganqiguzhang", 692, 2, "鼓风机电流传感器故障"));

        map.put("ex_jiliaojisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jiliaojisudufankuichuanganqiguzhang", 694, 2, "给料机速度反馈传感器故障"));

        map.put("ex_panguan1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan1wenduchuanganqiguzhang", 696, 2, "盘管1温度传感器故障"));

        map.put("ex_panguan2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan2wenduchuanganqiguzhang", 698, 2, "盘管2温度传感器故障"));

        map.put("ex_panguan3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan3wenduchuanganqiguzhang", 700, 2, "盘管3温度传感器故障"));

        map.put("ex_panguan4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan4wenduchuanganqiguzhang", 702, 2, "盘管4温度传感器故障"));

        map.put("ex_panguan5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan5wenduchuanganqiguzhang", 704, 2, "盘管5温度传感器故障"));

        map.put("ex_panguan6wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan6wenduchuanganqiguzhang", 706, 2, "盘管6温度传感器故障"));

        map.put("ex_panguan7wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan7wenduchuanganqiguzhang", 708, 2, "盘管7温度传感器故障"));

        map.put("ex_panguan8wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan8wenduchuanganqiguzhang", 710, 2, "盘管8温度传感器故障"));

        map.put("ex_panguan9wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan9wenduchuanganqiguzhang", 712, 2, "盘管9温度传感器故障"));

        map.put("ex_panguan10wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan10wenduchuanganqiguzhang", 714, 2, "盘管10温度传感器故障"));

        map.put("ex_cainuanchukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_cainuanchukouwenduchuanganqiguzhang", 716, 2, "采暖出口温度传感器故障"));

        map.put("ex_reshuichukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuichukouwenduchuanganqiguzhang", 718, 2, "热水出口温度传感器故障"));

        map.put("ex_jinchukouyachachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinchukouyachachuanganqiguzhang", 720, 2, "进出口压差传感器故障"));

        map.put("ex_1#chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_1#chukouwenduchuanganqiguzhang", 722, 2, "1#出口温度传感器故障"));

        map.put("ex_2#chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_2#chukouwenduchuanganqiguzhang", 724, 2, "2#出口温度传感器故障"));

        map.put("ex_jienengqichukouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqichukouyanwenchuanganqiguzhang", 726, 2, "节能器出口烟温传感器故障"));

        map.put("ex_jienengqijinkouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqijinkouyanwenchuanganqiguzhang", 728, 2, "节能器进口烟温传感器故障"));

        map.put("ex_lengningqichukouwendu_shui_chuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqichukouwendu_shui_chuanganqiguzhang", 730, 2, "冷凝器出口温度（水）传感器故障"));

        map.put("ex_lengningqijinkou_shui_chuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqijinkou_shui_chuanganqiguzhang", 732, 2, "冷凝器进口（水）传感器故障"));

        map.put("ex_lengningqichukouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqichukouyanwenchuanganqiguzhang", 734, 2, "冷凝器出口烟温传感器故障"));

        map.put("ex_lengningqijinkouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqijinkouyanwenchuanganqiguzhang", 736, 2, "冷凝器进口烟温传感器故障"));

        map.put("ex_cainuanjinkouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_cainuanjinkouwenduchuanganqiguzhang", 738, 2, "采暖进口温度传感器故障"));

        map.put("ex_reshuijinkouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuijinkouwenduchuanganqiguzhang", 740, 2, "热水进口温度传感器故障"));

        map.put("ex_kongzhixiangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_kongzhixiangwenduchuanganqiguzhang", 742, 2, "控制箱温度传感器故障"));

        map.put("ex_zhenkongyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongyalichuanganqiguzhang", 744, 2, "真空压力传感器故障"));

        map.put("ex_chushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiguzhang", 746, 2, "出水温度传感器故障"));

        map.put("ex_jinshuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinshuiwenduchuanganqiguzhang", 748, 2, "进水温度传感器故障"));

        map.put("ex_youwenjiancechuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_youwenjiancechuanganqiguzhang", 750, 2, "油温检测传感器故障"));

        map.put("ex_gaowenbaohuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gaowenbaohuchuanganqiguzhang", 752, 2, "高温保护传感器故障"));

        map.put("ex_chukouyouwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouyouwenchuanganqiguzhang", 754, 2, "出口油温传感器故障"));

        map.put("ex_jinkouyouwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinkouyouwenchuanganqiguzhang", 756, 2, "进口油温传感器故障"));

        map.put("ex_huanrewenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huanrewenduchuanganqiguzhang", 758, 2, "换热温度传感器故障"));

        map.put("ex_xitongwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_xitongwenduchuanganqiguzhang", 760, 2, "系统温度传感器故障"));

        map.put("ex_nengliangshezhiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_nengliangshezhiwenduchuanganqiguzhang", 762, 2, "能量设置温度传感器故障"));

        map.put("ex_zhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiwenduchuanganqiguzhang", 764, 2, "蒸汽温度传感器故障"));
        //
        map.put("mo_bentipaiyanwendu", ByteField.Init(new MockField(), "mo_bentipaiyanwendu", 823, 2, "本体排烟温度","℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 825, 2, "排烟温度","℃"));
        map.put("mo_lushuiwendu", ByteField.Init(new MockField(), "mo_lushuiwendu", 827, 2, "炉水温度","℃"));
        map.put("mo_chukouwendu", ByteField.Init(new MockField(), "mo_chukouwendu", 829, 2, "出口温度","℃"));
        map.put("mo_jinkouwendu", ByteField.Init(new MockField(), "mo_jinkouwendu", 831, 2, "进口温度","℃"));
        map.put("mo_jienengqichukouwendu(shui_", ByteField.Init(new MockField(), "mo_jienengqichukouwendu(shui_", 833, 2, "节能器出口温度(水）","℃"));
        map.put("mo_jienengqijinkouwendu(shui_", ByteField.Init(new MockField(), "mo_jienengqijinkouwendu(shui_", 835, 2, "节能器进口温度(水）","℃"));
        map.put("mo_jishuiwendu", ByteField.Init(new MockField(), "mo_jishuiwendu", 837, 2, "给水温度","℃"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 839, 2, "炉膛温度","℃"));
        map.put("mo_lutangchukouwendu", ByteField.Init(new MockField(), "mo_lutangchukouwendu", 841, 2, "炉膛出口温度","℃"));
        map.put("mo_lubiwendu", ByteField.Init(new MockField(), "mo_lubiwendu", 843, 2, "炉壁温度","℃"));
        map.put("mo_ranliaowendu", ByteField.Init(new MockField(), "mo_ranliaowendu", 845, 2, "燃料温度","℃"));
        map.put("mo_refengwendu_kongyuqichukou_", ByteField.Init(new MockField(), "mo_refengwendu_kongyuqichukou_", 847, 2, "热风温度（空预器出口）","℃"));
        map.put("mo_fuyazhengqiwendu", ByteField.Init(new MockField(), "mo_fuyazhengqiwendu", 849, 2, "负压蒸汽温度","℃"));
        map.put("mo_guorezhengqiwendu", ByteField.Init(new MockField(), "mo_guorezhengqiwendu", 851, 2, "过热蒸汽温度","℃"));
        map.put("mo_huilu1wendu", ByteField.Init(new MockField(), "mo_huilu1wendu", 853, 2, "回路1温度","℃"));
        map.put("mo_huilu2wendu", ByteField.Init(new MockField(), "mo_huilu2wendu", 855, 2, "回路2温度","℃"));
        map.put("mo_huilu3wendu", ByteField.Init(new MockField(), "mo_huilu3wendu", 857, 2, "回路3温度","℃"));
        map.put("mo_huilu4wendu", ByteField.Init(new MockField(), "mo_huilu4wendu", 859, 2, "回路4温度","℃"));
        map.put("mo_huilu5wendu", ByteField.Init(new MockField(), "mo_huilu5wendu", 861, 2, "回路5温度","℃"));
        map.put("mo_shiwaiwendu", ByteField.Init(new MockField(), "mo_shiwaiwendu", 863, 2, "室外温度","℃"));
        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 865, 2, "蒸汽压力","MPa",100));
        map.put("mo_jishuiyali", ByteField.Init(new MockField(), "mo_jishuiyali", 867, 2, "给水压力","MPa",100));
        map.put("mo_chukouyali", ByteField.Init(new MockField(), "mo_chukouyali", 869, 2, "出口压力","MPa",100));
        map.put("mo_jinkouyali", ByteField.Init(new MockField(), "mo_jinkouyali", 871, 2, "进口压力","MPa",100));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 873, 2, "炉膛压力","Pa"));
        map.put("mo_lutangchukouyali", ByteField.Init(new MockField(), "mo_lutangchukouyali", 875, 2, "炉膛出口压力","Pa"));
        map.put("mo_ranqiyali", ByteField.Init(new MockField(), "mo_ranqiyali", 877, 2, "燃气压力","KPa"));
        map.put("mo_yicifengya", ByteField.Init(new MockField(), "mo_yicifengya", 879, 2, "一次风压","KPa"));
        map.put("mo_ecifengya", ByteField.Init(new MockField(), "mo_ecifengya", 881, 2, "二次风压","KPa"));
        map.put("mo_ranliaoliang_shunshizhi_", ByteField.Init(new MockField(), "mo_ranliaoliang_shunshizhi_", 883, 2, "燃料量（瞬时值）"));
        map.put("mo_zhengqiliuliang_shunshizhi_", ByteField.Init(new MockField(), "mo_zhengqiliuliang_shunshizhi_", 885, 2, "蒸汽流量（瞬时值）"));
        map.put("mo_jishuiliuliang_shunshizhi_", ByteField.Init(new MockField(), "mo_jishuiliuliang_shunshizhi_", 887, 2, "给水流量（瞬时值）"));
        map.put("mo_xunhuanliuliang_shunshizhi_", ByteField.Init(new MockField(), "mo_xunhuanliuliang_shunshizhi_", 889, 2, "循环流量（瞬时值）"));
        map.put("mo_bushuiliuliang_shunshizhi_", ByteField.Init(new MockField(), "mo_bushuiliuliang_shunshizhi_", 891, 2, "补水流量（瞬时值）"));
        map.put("mo_guoluyewei", ByteField.Init(new MockField(), "mo_guoluyewei", 893, 2, "锅炉液位","mm"));
        map.put("mo_shuixiangyewei", ByteField.Init(new MockField(), "mo_shuixiangyewei", 895, 2, "水箱液位","mm"));
        map.put("mo_paiyanyanghanliang", ByteField.Init(new MockField(), "mo_paiyanyanghanliang", 897, 2, "排烟氧含量","%",10));
        map.put("mo_lupaisudufankui", ByteField.Init(new MockField(), "mo_lupaisudufankui", 899, 2, "炉排速度反馈","%"));
        map.put("mo_yinfengshuchufankui", ByteField.Init(new MockField(), "mo_yinfengshuchufankui", 901, 2, "引风输出反馈","%"));
        map.put("mo_gufengshuchufankui", ByteField.Init(new MockField(), "mo_gufengshuchufankui", 903, 2, "鼓风输出反馈","%"));
        map.put("mo_jishuishuchufankui", ByteField.Init(new MockField(), "mo_jishuishuchufankui", 905, 2, "给水输出反馈","%"));
        map.put("mo_meishuiwendu", ByteField.Init(new MockField(), "mo_meishuiwendu", 907, 2, "媒水温度","℃"));
        map.put("mo_shuixiangwendu", ByteField.Init(new MockField(), "mo_shuixiangwendu", 909, 2, "水箱温度","℃"));
        map.put("mo_pengzhangguanyewei", ByteField.Init(new MockField(), "mo_pengzhangguanyewei", 911, 2, "膨胀罐液位","mm"));
        map.put("mo_shanzhengguanyewei", ByteField.Init(new MockField(), "mo_shanzhengguanyewei", 913, 2, "闪蒸罐液位","mm"));
        map.put("mo_lengningyeguanyewei", ByteField.Init(new MockField(), "mo_lengningyeguanyewei", 915, 2, "冷凝液罐液位","mm"));
        map.put("mo_chuguanyewei", ByteField.Init(new MockField(), "mo_chuguanyewei", 917, 2, "储罐液位","mm"));
        map.put("mo_pengzhangguanwendu", ByteField.Init(new MockField(), "mo_pengzhangguanwendu", 919, 2, "膨胀罐温度","℃"));
        map.put("mo_shanzhengguanwendu", ByteField.Init(new MockField(), "mo_shanzhengguanwendu", 921, 2, "闪蒸罐温度","℃"));
        map.put("mo_lengningyeguanwendu", ByteField.Init(new MockField(), "mo_lengningyeguanwendu", 923, 2, "冷凝液罐温度","℃"));
        map.put("mo_chuguanwendu", ByteField.Init(new MockField(), "mo_chuguanwendu", 925, 2, "储罐温度","℃"));
        map.put("mo_xitongyali_yongyuchengyareshuiguolu_", ByteField.Init(new MockField(), "mo_xitongyali_yongyuchengyareshuiguolu_", 927, 2, "系统压力（用于承压热水锅炉）","MPa",100));
        map.put("mo_guorezhengqiyali", ByteField.Init(new MockField(), "mo_guorezhengqiyali", 929, 2, "过热蒸汽压力","MPa",100));
        map.put("mo_paiyanchuyali", ByteField.Init(new MockField(), "mo_paiyanchuyali", 931, 2, "排烟处压力","Pa"));
        map.put("mo_fengshifengya", ByteField.Init(new MockField(), "mo_fengshifengya", 933, 2, "风室风压","KPa"));
        map.put("mo_yinfengjidianliu", ByteField.Init(new MockField(), "mo_yinfengjidianliu", 935, 2, "引风机电流","A"));
        map.put("mo_gufengjidianliu", ByteField.Init(new MockField(), "mo_gufengjidianliu", 937, 2, "鼓风机电流","A"));
        map.put("mo_jiliaojisudufankui", ByteField.Init(new MockField(), "mo_jiliaojisudufankui", 939, 2, "给料机速度反馈","%"));
        map.put("mo_panguan1wendu", ByteField.Init(new MockField(), "mo_panguan1wendu", 941, 2, "盘管1温度","℃"));
        map.put("mo_panguan2wendu", ByteField.Init(new MockField(), "mo_panguan2wendu", 943, 2, "盘管2温度","℃"));
        map.put("mo_panguan3wendu", ByteField.Init(new MockField(), "mo_panguan3wendu", 945, 2, "盘管3温度","℃"));
        map.put("mo_panguan4wendu", ByteField.Init(new MockField(), "mo_panguan4wendu", 947, 2, "盘管4温度","℃"));
        map.put("mo_panguan5wendu", ByteField.Init(new MockField(), "mo_panguan5wendu", 949, 2, "盘管5温度","℃"));
        map.put("mo_panguan6wendu", ByteField.Init(new MockField(), "mo_panguan6wendu", 951, 2, "盘管6温度","℃"));
        map.put("mo_panguan7wendu", ByteField.Init(new MockField(), "mo_panguan7wendu", 953, 2, "盘管7温度","℃"));
        map.put("mo_panguan8wendu", ByteField.Init(new MockField(), "mo_panguan8wendu", 955, 2, "盘管8温度","℃"));
        map.put("mo_panguan9wendu", ByteField.Init(new MockField(), "mo_panguan9wendu", 957, 2, "盘管9温度","℃"));
        map.put("mo_panguan10wendu", ByteField.Init(new MockField(), "mo_panguan10wendu", 959, 2, "盘管10温度","℃"));
        map.put("mo_cainuanchukouwendu", ByteField.Init(new MockField(), "mo_cainuanchukouwendu", 961, 2, "采暖出口温度","℃"));
        map.put("mo_reshuichukouwendu", ByteField.Init(new MockField(), "mo_reshuichukouwendu", 963, 2, "热水出口温度","℃"));
        map.put("mo_jinchukouyacha", ByteField.Init(new MockField(), "mo_jinchukouyacha", 965, 2, "进出口压差","MPa",100));
        map.put("mo_1#chukouwendu", ByteField.Init(new MockField(), "mo_1#chukouwendu", 967, 2, "1#出口温度","℃"));
        map.put("mo_2#chukouwendu", ByteField.Init(new MockField(), "mo_2#chukouwendu", 969, 2, "2#出口温度","℃"));
        map.put("mo_jienengqichukouyanwen", ByteField.Init(new MockField(), "mo_jienengqichukouyanwen", 971, 2, "节能器出口烟温","℃"));
        map.put("mo_jienengqijinkouyanwen", ByteField.Init(new MockField(), "mo_jienengqijinkouyanwen", 973, 2, "节能器进口烟温","℃"));
        map.put("mo_lengningqichukouwendu_shui_", ByteField.Init(new MockField(), "mo_lengningqichukouwendu_shui_", 975, 2, "冷凝器出口温度（水）","℃"));
        map.put("mo_lengningqijinkouwendu_shui_", ByteField.Init(new MockField(), "mo_lengningqijinkouwendu_shui_", 977, 2, "冷凝器进口温度（水）","℃"));
        map.put("mo_lengningqichukouyanwen", ByteField.Init(new MockField(), "mo_lengningqichukouyanwen", 979, 2, "冷凝器出口烟温","℃"));
        map.put("mo_lengningqijinkouyanwen", ByteField.Init(new MockField(), "mo_lengningqijinkouyanwen", 981, 2, "冷凝器进口烟温","℃"));
        map.put("mo_cainuanjinkouwendu", ByteField.Init(new MockField(), "mo_cainuanjinkouwendu", 983, 2, "采暖进口温度","℃"));
        map.put("mo_reshuijinkouwendu", ByteField.Init(new MockField(), "mo_reshuijinkouwendu", 985, 2, "热水进口温度","℃"));
        map.put("mo_kongzhixiangwendu", ByteField.Init(new MockField(), "mo_kongzhixiangwendu", 987, 2, "控制箱温度","℃"));
        map.put("mo_zhenkongyali", ByteField.Init(new MockField(), "mo_zhenkongyali", 989, 2, "真空压力","KPa"));
        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 991, 2, "出水温度","℃"));
        map.put("mo_jinshuiwendu", ByteField.Init(new MockField(), "mo_jinshuiwendu", 993, 2, "进水温度","℃"));
        map.put("mo_youwenjiance", ByteField.Init(new MockField(), "mo_youwenjiance", 995, 2, "油温检测","℃"));
        map.put("mo_gaowenbaohu", ByteField.Init(new MockField(), "mo_gaowenbaohu", 997, 2, "高温保护","℃"));
        map.put("mo_chukouyouwen", ByteField.Init(new MockField(), "mo_chukouyouwen", 999, 2, "出口油温","℃"));
        map.put("mo_jinkouyouwen", ByteField.Init(new MockField(), "mo_jinkouyouwen", 1001, 2, "进口油温","℃"));
        map.put("mo_huanrewendu", ByteField.Init(new MockField(), "mo_huanrewendu", 1003, 2, "换热温度","℃"));
        map.put("mo_xitongwendu", ByteField.Init(new MockField(), "mo_xitongwendu", 1005, 2, "系统温度","℃"));
        map.put("mo_nengliangshezhiwendu", ByteField.Init(new MockField(), "mo_nengliangshezhiwendu", 1007, 2, "能量设置温度","℃"));
        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 1009, 2, "蒸汽温度","℃"));
        map.put("mo_shineiwendu", ByteField.Init(new MockField(), "mo_shineiwendu", 1011, 2, "室内温度","℃"));
        map.put("mo_1#dianliufankui", ByteField.Init(new MockField(), "mo_1#dianliufankui", 1013, 2, "1#电流反馈","A"));

        map.put("mo_2#dianliufankui", ByteField.Init(new MockField(), "mo_2#dianliufankui", 1015, 2, "2#电流反馈","A"));

        map.put("mo_3#dianliufankui", ByteField.Init(new MockField(), "mo_3#dianliufankui", 1017, 2, "3#电流反馈","A"));

        map.put("mo_4#dianliufankui", ByteField.Init(new MockField(), "mo_4#dianliufankui", 1019, 2, "4#电流反馈","A"));

        map.put("mo_5#dianliufankui", ByteField.Init(new MockField(), "mo_5#dianliufankui", 1021, 2, "5#电流反馈","A"));

        map.put("mo_jiezhiwendu", ByteField.Init(new MockField(), "mo_jiezhiwendu", 1023, 2, "介质温度","℃"));

        map.put("mo_xiyuwendu", ByteField.Init(new MockField(), "mo_xiyuwendu", 1025, 2, "洗浴温度","℃"));

        map.put("mo_huanjingwendu", ByteField.Init(new MockField(), "mo_huanjingwendu", 1027, 2, "环境温度","℃"));

        map.put("mo_jiezhiyali", ByteField.Init(new MockField(), "mo_jiezhiyali", 1029, 2, "介质压力","KPa"));

        //
        map.put("se_paiyanbaojingwendu", ByteField.Init(new SettingField(), "se_paiyanbaojingwendu", 1068, 2, "排烟报警温度","℃"));
        map.put("se_baojingwendu", ByteField.Init(new SettingField(), "se_baojingwendu", 1070, 2, "报警温度","℃"));
        map.put("se_tingluwendu", ByteField.Init(new SettingField(), "se_tingluwendu", 1072, 2, "停炉温度","℃"));
        map.put("se_mubiaowendu", ByteField.Init(new SettingField(), "se_mubiaowendu", 1074, 2, "目标温度","℃"));
        map.put("se_qiluwendu", ByteField.Init(new SettingField(), "se_qiluwendu", 1076, 2, "启炉温度","℃"));
        map.put("se_zhuanhuohuicha", ByteField.Init(new SettingField(), "se_zhuanhuohuicha", 1078, 2, "转火回差","℃"));
        map.put("se_qiluhuicha", ByteField.Init(new SettingField(), "se_qiluhuicha", 1080, 2, "启炉回差","℃"));
        map.put("se_kaibengwendu", ByteField.Init(new SettingField(), "se_kaibengwendu", 1082, 2, "开泵温度","℃"));
        map.put("se_guanbengwendu", ByteField.Init(new SettingField(), "se_guanbengwendu", 1084, 2, "关泵温度","℃"));
        map.put("se_baojingyali", ByteField.Init(new SettingField(), "se_baojingyali", 1086, 2, "报警压力","MPa",100));
        map.put("se_tingluyali", ByteField.Init(new SettingField(), "se_tingluyali", 1088, 2, "停炉压力","MPa",100));
        map.put("se_mubiaoyali", ByteField.Init(new SettingField(), "se_mubiaoyali", 1090, 2, "目标压力","MPa",100));
        map.put("se_qiluyali", ByteField.Init(new SettingField(), "se_qiluyali", 1092, 2, "启炉压力","MPa",100));
        map.put("se_zhuanhuohuicha_yali_", ByteField.Init(new SettingField(), "se_zhuanhuohuicha_yali_", 1094, 2, "转火回差（压力）","MPa",100));
        map.put("se_qiluhuicha_yali_", ByteField.Init(new SettingField(), "se_qiluhuicha_yali_", 1096, 2, "启炉回差（压力）","MPa",100));
        map.put("se_qianyanshi", ByteField.Init(new SettingField(), "se_qianyanshi", 1098, 2, "前延时","s"));
        map.put("se_houyanshi", ByteField.Init(new SettingField(), "se_houyanshi", 1100, 2, "后延时","s"));
        map.put("se_qianchuisao", ByteField.Init(new SettingField(), "se_qianchuisao", 1102, 2, "前吹扫","s"));
        map.put("se_houchuisao", ByteField.Init(new SettingField(), "se_houchuisao", 1104, 2, "后吹扫","s"));
        map.put("se_lubibaojingwendu", ByteField.Init(new SettingField(), "se_lubibaojingwendu", 1106, 2, "炉壁报警温度","℃"));
        map.put("se_lutangchukouwendu", ByteField.Init(new SettingField(), "se_lutangchukouwendu", 1108, 2, "炉膛出口温度","℃"));
        map.put("se_baohuwendu", ByteField.Init(new SettingField(), "se_baohuwendu", 1110, 2, "保护温度","℃"));
        map.put("se_bentipaiyanwendu", ByteField.Init(new SettingField(), "se_bentipaiyanwendu", 1112, 2, "本体排烟温度","℃"));
        map.put("se_jiarezushu", ByteField.Init(new SettingField(), "se_jiarezushu", 1114, 2, "加热组数","组"));
        map.put("se_jianceyalishijian", ByteField.Init(new SettingField(), "se_jianceyalishijian", 1116, 2, "检测压力时间","s"));
        map.put("se_houyanshi", ByteField.Init(new SettingField(), "se_houyanshi", 1118, 2, "后延时","m"));
        map.put("se_shedingwendu", ByteField.Init(new SettingField(), "se_shedingwendu", 1120, 2, "设定温度","℃"));
        map.put("se_mokuailutaishu", ByteField.Init(new SettingField(), "se_mokuailutaishu", 1122, 2, "模块炉台数","台"));
        map.put("se_gufenghouyanshi", ByteField.Init(new SettingField(), "se_gufenghouyanshi", 1124, 2, "鼓风后延时","s"));
        map.put("se_yinfenghouyanshi", ByteField.Init(new SettingField(), "se_yinfenghouyanshi", 1126, 2, "引风后延时","s"));
        map.put("se_shuixiangkaibengwendu", ByteField.Init(new SettingField(), "se_shuixiangkaibengwendu", 1128, 2, "水箱开泵温度","℃"));
        map.put("se_shuixiangguanbengwendu", ByteField.Init(new SettingField(), "se_shuixiangguanbengwendu", 1130, 2, "水箱关泵温度","℃"));
        map.put("se_lushuibaojingwendu", ByteField.Init(new SettingField(), "se_lushuibaojingwendu", 1132, 2, "炉水报警温度","℃"));
        map.put("se_buchangxishu", ByteField.Init(new SettingField(), "se_buchangxishu", 1134, 2, "补偿系数","%"));
        map.put("se_cankaowendu", ByteField.Init(new SettingField(), "se_cankaowendu", 1136, 2, "参考温度","℃"));
        map.put("se_tingluzuidazhi", ByteField.Init(new SettingField(), "se_tingluzuidazhi", 1138, 2, "停炉最大值","℃"));
        map.put("se_qiluzuixiaozhi", ByteField.Init(new SettingField(), "se_qiluzuixiaozhi", 1140, 2, "启炉最小值","℃"));
        map.put("se_cankaohuicha", ByteField.Init(new SettingField(), "se_cankaohuicha", 1142, 2, "参考回差","℃"));
        map.put("se_tingluwendu1", ByteField.Init(new SettingField(), "se_tingluwendu1", 1144, 2, "停炉温度1","℃"));
        map.put("se_qiluwendu1", ByteField.Init(new SettingField(), "se_qiluwendu1", 1146, 2, "启炉温度1","℃"));
        map.put("se_tingluwendu2", ByteField.Init(new SettingField(), "se_tingluwendu2", 1148, 2, "停炉温度2","℃"));
        map.put("se_qiluwendu2", ByteField.Init(new SettingField(), "se_qiluwendu2", 1150, 2, "启炉温度2","℃"));
        map.put("se_yusongliaoshijian", ByteField.Init(new SettingField(), "se_yusongliaoshijian", 1152, 2, "预送料时间","s"));
        map.put("se_dianhuoshijian", ByteField.Init(new SettingField(), "se_dianhuoshijian", 1154, 2, "点火时间","s"));
        map.put("se_songliaoqidongshijian", ByteField.Init(new SettingField(), "se_songliaoqidongshijian", 1156, 2, "送料启动时间","s"));
        map.put("se_songliaotingzhishijian", ByteField.Init(new SettingField(), "se_songliaotingzhishijian", 1158, 2, "送料停止时间","s"));
        map.put("se_dianhuojiange", ByteField.Init(new SettingField(), "se_dianhuojiange", 1160, 2, "点火间隔","min"));
        map.put("se_dianhuochenggongwendu", ByteField.Init(new SettingField(), "se_dianhuochenggongwendu", 1162, 2, "点火成功温度","℃"));
        map.put("se_lushuitingluwendu", ByteField.Init(new SettingField(), "se_lushuitingluwendu", 1164, 2, "炉水停炉温度","℃"));
        map.put("se_lushuiqiluwendu", ByteField.Init(new SettingField(), "se_lushuiqiluwendu", 1166, 2, "炉水启炉温度","℃"));
        map.put("se_meishuibaojingwendu", ByteField.Init(new SettingField(), "se_meishuibaojingwendu", 1168, 2, "媒水报警温度","℃"));
        map.put("se_meishuitingluwendu", ByteField.Init(new SettingField(), "se_meishuitingluwendu", 1170, 2, "媒水停炉温度","℃"));
        map.put("se_meishuiqiluwendu", ByteField.Init(new SettingField(), "se_meishuiqiluwendu", 1172, 2, "媒水启炉温度","℃"));
        map.put("se_kaibengyali_yongyudingyakongzhi_", ByteField.Init(new SettingField(), "se_kaibengyali_yongyudingyakongzhi_", 1174, 2, "开泵压力（用于定压控制）","MPa",100));
        map.put("se_guanbengyali_yongyudingyakongzhi_", ByteField.Init(new SettingField(), "se_guanbengyali_yongyudingyakongzhi_", 1176, 2, "关泵压力（用于定压控制）","MPa",100));
        map.put("se_panguanbaojingwendu", ByteField.Init(new SettingField(), "se_panguanbaojingwendu", 1178, 2, "盘管报警温度","℃"));
        map.put("se_huilu1baojingwendu", ByteField.Init(new SettingField(), "se_huilu1baojingwendu", 1180, 2, "回路1报警温度","℃"));
        map.put("se_huilu1kaibengwendu", ByteField.Init(new SettingField(), "se_huilu1kaibengwendu", 1182, 2, "回路1开泵温度","℃"));
        map.put("se_huilu1guanbengwendu", ByteField.Init(new SettingField(), "se_huilu1guanbengwendu", 1184, 2, "回路1关泵温度","℃"));
        map.put("se_huilu2baojingwendu", ByteField.Init(new SettingField(), "se_huilu2baojingwendu", 1186, 2, "回路2报警温度","℃"));
        map.put("se_huilu2kaibengwendu", ByteField.Init(new SettingField(), "se_huilu2kaibengwendu", 1188, 2, "回路2开泵温度","℃"));
        map.put("se_huilu2guanbengwendu", ByteField.Init(new SettingField(), "se_huilu2guanbengwendu", 1190, 2, "回路2关泵温度","℃"));
        map.put("se_huilu3baojingwendu", ByteField.Init(new SettingField(), "se_huilu3baojingwendu", 1192, 2, "回路3报警温度","℃"));
        map.put("se_huilu3kaibengwendu", ByteField.Init(new SettingField(), "se_huilu3kaibengwendu", 1194, 2, "回路3开泵温度","℃"));
        map.put("se_huilu3guanbengwendu", ByteField.Init(new SettingField(), "se_huilu3guanbengwendu", 1196, 2, "回路3关泵温度","℃"));
        map.put("se_huilu4baojingwendu", ByteField.Init(new SettingField(), "se_huilu4baojingwendu", 1198, 2, "回路4报警温度","℃"));
        map.put("se_huilu4kaibengwendu", ByteField.Init(new SettingField(), "se_huilu4kaibengwendu", 1200, 2, "回路4开泵温度","℃"));
        map.put("se_huilu4guanbengwendu", ByteField.Init(new SettingField(), "se_huilu4guanbengwendu", 1202, 2, "回路4关泵温度","℃"));
        map.put("se_huilu5baojingwendu", ByteField.Init(new SettingField(), "se_huilu5baojingwendu", 1204, 2, "回路5报警温度","℃"));
        map.put("se_huilu5kaibengwendu", ByteField.Init(new SettingField(), "se_huilu5kaibengwendu", 1206, 2, "回路5开泵温度","℃"));
        map.put("se_huilu5guanbengwendu", ByteField.Init(new SettingField(), "se_huilu5guanbengwendu", 1208, 2, "回路5关泵温度","℃"));
        map.put("se_touqieshijian_jiarezuyong_", ByteField.Init(new SettingField(), "se_touqieshijian_jiarezuyong_", 1210, 2, "投切时间（加热组用）","s"));
        map.put("se_diaojieshijian_jiarezuyong_", ByteField.Init(new SettingField(), "se_diaojieshijian_jiarezuyong_", 1212, 2, "调节时间（加热组用）","m"));
        map.put("se_chukouchaoyabaojing", ByteField.Init(new SettingField(), "se_chukouchaoyabaojing", 1214, 2, "出口超压报警","MPa",100));
        map.put("se_jinkouchaoyabaojing", ByteField.Init(new SettingField(), "se_jinkouchaoyabaojing", 1216, 2, "进口超压报警","MPa",100));
        map.put("se_cainuanbaojingwendu", ByteField.Init(new SettingField(), "se_cainuanbaojingwendu", 1218, 2, "采暖报警温度","℃"));
        map.put("se_cainuankaibengwendu", ByteField.Init(new SettingField(), "se_cainuankaibengwendu", 1220, 2, "采暖开泵温度","℃"));
        map.put("se_cainuanguanbengwendu", ByteField.Init(new SettingField(), "se_cainuanguanbengwendu", 1222, 2, "采暖关泵温度","℃"));
        map.put("se_reshuibaojingwendu", ByteField.Init(new SettingField(), "se_reshuibaojingwendu", 1224, 2, "热水报警温度","℃"));
        map.put("se_reshuikaibengwendu", ByteField.Init(new SettingField(), "se_reshuikaibengwendu", 1226, 2, "热水开泵温度","℃"));
        map.put("se_reshuiguanbengwendu", ByteField.Init(new SettingField(), "se_reshuiguanbengwendu", 1228, 2, "热水关泵温度","℃"));
        map.put("se_meishuimubiaowendu", ByteField.Init(new SettingField(), "se_meishuimubiaowendu", 1230, 2, "媒水目标温度","℃"));
        map.put("se_meishuiqiluhuicha", ByteField.Init(new SettingField(), "se_meishuiqiluhuicha", 1232, 2, "媒水启炉回差","℃"));
        map.put("se_chukoudiyabaojing", ByteField.Init(new SettingField(), "se_chukoudiyabaojing", 1234, 2, "出口低压报警","℃"));
        map.put("se_jinchukouyachagao", ByteField.Init(new SettingField(), "se_jinchukouyachagao", 1236, 2, "进出口压差高","℃"));
        map.put("se_jinchukouyachadi", ByteField.Init(new SettingField(), "se_jinchukouyachadi", 1238, 2, "进出口压差低","℃"));
        map.put("se_jinkoudiyabaojing", ByteField.Init(new SettingField(), "se_jinkoudiyabaojing", 1240, 2, "进口低压报警","℃"));
        map.put("se_jinkouchaowenbaojing", ByteField.Init(new SettingField(), "se_jinkouchaowenbaojing", 1242, 2, "进口超温报警","℃"));
        map.put("se_jinkoudiwenbaojing", ByteField.Init(new SettingField(), "se_jinkoudiwenbaojing", 1244, 2, "进口低温报警","℃"));
        map.put("se_chukoudiwenbaojing", ByteField.Init(new SettingField(), "se_chukoudiwenbaojing", 1246, 2, "出口低温报警","℃"));
        map.put("se_pengzhangguanchaowen", ByteField.Init(new SettingField(), "se_pengzhangguanchaowen", 1248, 2, "膨胀罐超温","℃"));
        map.put("se_mubiaoyewei", ByteField.Init(new SettingField(), "se_mubiaoyewei", 1250, 2, "目标液位","mm"));
        map.put("se_kaibengyewei", ByteField.Init(new SettingField(), "se_kaibengyewei", 1252, 2, "开泵液位","mm"));
        map.put("se_guanbengyewei", ByteField.Init(new SettingField(), "se_guanbengyewei", 1254, 2, "关泵液位","mm"));
        map.put("se_kongbengmubiao", ByteField.Init(new SettingField(), "se_kongbengmubiao", 1256, 2, "控泵目标","℃"));
        map.put("se_lengningqianyanshi", ByteField.Init(new SettingField(), "se_lengningqianyanshi", 1258, 2, "冷凝前延时","s"));
        map.put("se_lengninghouyanshi", ByteField.Init(new SettingField(), "se_lengninghouyanshi", 1260, 2, "冷凝后延时","s"));
        map.put("se_xieyashangxian", ByteField.Init(new SettingField(), "se_xieyashangxian", 1262, 2, "泄压上限","MPa",100));
        map.put("se_xieyaxiaxian", ByteField.Init(new SettingField(), "se_xieyaxiaxian", 1264, 2, "泄压下限","MPa",100));
        map.put("se_jishuibaojingyali", ByteField.Init(new SettingField(), "se_jishuibaojingyali", 1266, 2, "给水报警压力","MPa",100));
        map.put("se_zhenkongbaojingyali", ByteField.Init(new SettingField(), "se_zhenkongbaojingyali", 1268, 2, "真空报警压力","KPa"));
        map.put("se_zhenkongyalishangxian", ByteField.Init(new SettingField(), "se_zhenkongyalishangxian", 1270, 2, "真空压力上限","KPa"));
        map.put("se_zhenkongyalixiaxian", ByteField.Init(new SettingField(), "se_zhenkongyalixiaxian", 1272, 2, "真空压力下限","KPa"));
        map.put("se_jinchukoumubiaoyacha", ByteField.Init(new SettingField(), "se_jinchukoumubiaoyacha", 1274, 2, "进出口目标压差","MPa",100));
        map.put("se_jienengqichuyanchaowen", ByteField.Init(new SettingField(), "se_jienengqichuyanchaowen", 1276, 2, "节能器出烟超温","℃"));
        map.put("se_lengningqichuyanchaowen", ByteField.Init(new SettingField(), "se_lengningqichuyanchaowen", 1278, 2, "冷凝器出烟超温","℃"));
        map.put("se_jinshuitingluwendu", ByteField.Init(new SettingField(), "se_jinshuitingluwendu", 1280, 2, "进水停炉温度","℃"));
        map.put("se_youwenbaohuwendu", ByteField.Init(new SettingField(), "se_youwenbaohuwendu", 1282, 2, "油温保护温度","℃"));
        map.put("se_youwenshangxianwendu", ByteField.Init(new SettingField(), "se_youwenshangxianwendu", 1284, 2, "油温上限温度","℃"));
        map.put("se_youwenzhongxianwendu", ByteField.Init(new SettingField(), "se_youwenzhongxianwendu", 1286, 2, "油温中限温度","℃"));
        map.put("se_gaowenbaohuwendu", ByteField.Init(new SettingField(), "se_gaowenbaohuwendu", 1288, 2, "高温保护温度","℃"));
        map.put("se_wenchabaohuwendu", ByteField.Init(new SettingField(), "se_wenchabaohuwendu", 1290, 2, "温差保护温度","℃"));
        map.put("se_jinkoutingluwendu", ByteField.Init(new SettingField(), "se_jinkoutingluwendu", 1292, 2, "进口停炉温度","℃"));
        map.put("se_jinkoumubiaowendu", ByteField.Init(new SettingField(), "se_jinkoumubiaowendu", 1294, 2, "进口目标温度","℃"));
        map.put("se_jinkouqiluhuicha", ByteField.Init(new SettingField(), "se_jinkouqiluhuicha", 1296, 2, "进口启炉回差","℃"));
        map.put("se_youwenxiaxianwendu", ByteField.Init(new SettingField(), "se_youwenxiaxianwendu", 1298, 2, "油温下限温度","℃"));
        map.put("se_huanrekaibengwendu", ByteField.Init(new SettingField(), "se_huanrekaibengwendu", 1300, 2, "换热开泵温度","℃"));
        map.put("se_huanreguanbengwendu", ByteField.Init(new SettingField(), "se_huanreguanbengwendu", 1302, 2, "换热关泵温度","℃"));
        map.put("se_xitongkaibengwendu", ByteField.Init(new SettingField(), "se_xitongkaibengwendu", 1304, 2, "系统开泵温度","℃"));
        map.put("se_xitongguanbengwendu", ByteField.Init(new SettingField(), "se_xitongguanbengwendu", 1306, 2, "系统关泵温度","℃"));
        //
        map.put("se_zhengqihuicha", ByteField.Init(new SettingField(), "se_zhengqihuicha", 1313, 2, "蒸汽回差","℃"));
        map.put("se_dibaojingyewei", ByteField.Init(new SettingField(), "se_dibaojingyewei", 1315, 2, "低报警液位","mm"));
        map.put("se_gaobaojingyewei", ByteField.Init(new SettingField(), "se_gaobaojingyewei", 1317, 2, "高报警液位","mm"));
        map.put("se_cainuantingluwendu", ByteField.Init(new SettingField(), "se_cainuantingluwendu", 1319, 2, "采暖停炉温度","mm"));
        map.put("se_cainuanqiluwendu", ByteField.Init(new SettingField(), "se_cainuanqiluwendu", 1321, 2, "采暖启炉温度","mm"));
        //
        map.put("st_qidongshijian1_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian1_shifen_", 1558, 2, "启动时间1（时 分）"));
        map.put("st_tingzhishijian1_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian1_shifen_", 1560, 2, "停止时间1（时 分）"));
        map.put("st_qidongshijian2_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian2_shifen_", 1562, 2, "启动时间2（时 分）"));
        map.put("st_tingzhishijian2_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian2_shifen_", 1564, 2, "停止时间2（时 分）"));
        map.put("st_qidongshijian3_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian3_shifen_", 1566, 2, "启动时间3（时 分）"));
        map.put("st_tingzhishijian3_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian3_shifen_", 1568, 2, "停止时间3（时 分）"));
        map.put("st_qidongshijian4_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian4_shifen_", 1570, 2, "启动时间4（时 分）"));
        map.put("st_tingzhishijian4_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian4_shifen_", 1572, 2, "停止时间4（时 分）"));
        map.put("st_qidongshijian5_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian5_shifen_", 1574, 2, "启动时间5（时 分）"));
        map.put("st_tingzhishijian5_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian5_shifen_", 1576, 2, "停止时间5（时 分）"));
        map.put("st_qidongshijian6_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian6_shifen_", 1578, 2, "启动时间6（时 分）"));
        map.put("st_tingzhishijian6_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian6_shifen_", 1580, 2, "停止时间6（时 分）"));
        //
        map.put("de_ranshaoqi", ByteField.Init(new DeviceField(), "de_ranshaoqi", 1587, 2,  "燃烧器",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_jiarezu", ByteField.Init(new DeviceField(), "de_jiarezu", 1589, 2,  "加热组",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_bushui_beng", ByteField.Init(new DeviceField(), "de_bushui_beng", 1591, 2,  "补水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_jishui_beng", ByteField.Init(new DeviceField(), "de_jishui_beng", 1593, 2,  "给水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_buyou_beng", ByteField.Init(new DeviceField(), "de_buyou_beng", 1595, 2,  "补油泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_xunhuan_beng", ByteField.Init(new DeviceField(), "de_xunhuan_beng", 1597, 2,  "循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_lengning_beng", ByteField.Init(new DeviceField(), "de_lengning_beng", 1599, 2,  "冷凝泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_reshui_beng", ByteField.Init(new DeviceField(), "de_reshui_beng", 1601, 2,  "热水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_zhenkong_beng", ByteField.Init(new DeviceField(), "de_zhenkong_beng", 1603, 2,  "真空泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_ecixunhuan_beng", ByteField.Init(new DeviceField(), "de_ecixunhuan_beng", 1605, 2,  "二次循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_yinfengji_fan", ByteField.Init(new DeviceField(), "de_yinfengji_fan", 1607, 2,  "引风机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_gufengji_fan", ByteField.Init(new DeviceField(), "de_gufengji_fan", 1609, 2,  "鼓风机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_lupai_fan", ByteField.Init(new DeviceField(), "de_lupai_fan", 1611, 2,  "炉排",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_chuzhaji_fan", ByteField.Init(new DeviceField(), "de_chuzhaji_fan", 1613, 2,  "出渣机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_ecigufengji_fan", ByteField.Init(new DeviceField(), "de_ecigufengji_fan", 1615, 2,  "二次鼓风机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_dianhuoqi", ByteField.Init(new DeviceField(), "de_dianhuoqi", 1617, 2,  "点火器",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_shangmeiji_fan", ByteField.Init(new DeviceField(), "de_shangmeiji_fan", 1619, 2,  "上煤机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_songliaoji", ByteField.Init(new DeviceField(), "de_songliaoji", 1621, 2,  "送料机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_jiayao_beng", ByteField.Init(new DeviceField(), "de_jiayao_beng", 1623, 2,  "加药泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_paiwufa", ByteField.Init(new DeviceField(), "de_paiwufa", 1625, 2,  "排污阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu1xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu1xunhuan_beng", 1627, 2,  "回路1循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu2xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu2xunhuan_beng", 1629, 2,  "回路2循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu3xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu3xunhuan_beng", 1631, 2,  "回路3循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu4xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu4xunhuan_beng", 1633, 2,  "回路4循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu5xunhuan_beng", ByteField.Init(new DeviceField(), "de_huilu5xunhuan_beng", 1635, 2,  "回路5循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_cainuanxunhuan_beng", ByteField.Init(new DeviceField(), "de_cainuanxunhuan_beng", 1637, 2,  "采暖循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_reshuixunhuan_beng", ByteField.Init(new DeviceField(), "de_reshuixunhuan_beng", 1639, 2,  "热水循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_paiqifa", ByteField.Init(new DeviceField(), "de_paiqifa", 1641, 2,  "排汽阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_xieyafa", ByteField.Init(new DeviceField(), "de_xieyafa", 1643, 2,  "泄压阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_zhenkongfa", ByteField.Init(new DeviceField(), "de_zhenkongfa", 1645, 2,  "真空阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_pangtongfa", ByteField.Init(new DeviceField(), "de_pangtongfa", 1647, 2,  "旁通阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_churexunhuan_beng", ByteField.Init(new DeviceField(), "de_churexunhuan_beng", 1649, 2,  "储热循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huanrexunhuan_beng", ByteField.Init(new DeviceField(), "de_huanrexunhuan_beng", 1651, 2,  "换热循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_xitongxunhuan_beng", ByteField.Init(new DeviceField(), "de_xitongxunhuan_beng", 1653, 2,  "系统循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_churebushui_beng", ByteField.Init(new DeviceField(), "de_churebushui_beng", 1655, 2,  "储热补水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_yandaodiefa", ByteField.Init(new DeviceField(), "de_yandaodiefa", 1657, 2,  "烟道蝶阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huishui_beng", ByteField.Init(new DeviceField(), "de_huishui_beng", 1659, 2,  "回水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_santongfa", ByteField.Init(new DeviceField(), "de_santongfa", 1661, 2,  "三通阀",CTL_NJZJ_Common_ValueMaps.coms_device));
    }
}
