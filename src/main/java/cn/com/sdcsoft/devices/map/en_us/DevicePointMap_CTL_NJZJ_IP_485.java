package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJZJ_485.*;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_NJZJ_IP_485 extends DevicePointMap{

    public DevicePointMap_CTL_NJZJ_IP_485() {
        //基本信息 010306000028455C
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 7, 2, "系统状态", CTL_NJZJ_Common_ValueMaps.coms_status));

        map.put("ba_yunxingtianshu", ByteField.Init(new RunDaysField(), "ba_yunxingtianshu", 0, 0, "运行天数", "天"));

        map.put("ba_yunxingxiaoshishu", ByteField.Init(new BaseInfoField(), "ba_yunxingxiaoshishu", 0, 0, "运行小时数", "时"));

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
        //前120个报警0103077000784547
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 68, 2, "排烟温度高报警"));

        map.put("ex_lushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lushuiwendugaobaojing", 70, 2, "炉水温度高报警"));

        map.put("ex_chukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chukouwendugaobaojing", 72, 2, "出口温度高报警"));

        map.put("ex_chaoyabaojing", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing", 74, 2, "超压报警"));

        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 76, 2, "极限低水位报警"));

        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 78, 2, "低水位报警"));

        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 80, 2, "高水位报警"));

        map.put("ex_shuiweixinhaoluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuiweixinhaoluojicuobaojing", 82, 2, "水位信号逻辑错报警"));

        map.put("ex_lubiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_lubiwendugaobaojing", 84, 2, "炉壁温度高报警"));

        map.put("ex_fuyazhengqiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwendugaobaojing", 86, 2, "负压蒸汽温度高报警"));

        map.put("ex_ranshaoqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhangbaojing", 88, 2, "燃烧器故障报警"));

        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 90, 2, "燃气泄漏报警"));

        map.put("ex_ranqiyalidibaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyalidibaojing", 92, 2, "燃气压力低报警"));

        map.put("ex_ranqiyaliyichangbaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichangbaojing", 94, 2, "燃气压力异常报警"));

        map.put("ex_ranqiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_ranqiyaligaobaojing", 96, 2, "燃气压力高报警"));

        map.put("ex_jishuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_jishuibianpinqiguzhangbaojing", 98, 2, "给水变频器故障报警"));

        map.put("ex_xunhuanbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbianpinqiguzhangbaojing", 100, 2, "循环变频器故障报警"));

        map.put("ex_yinfengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yinfengbianpinqiguzhangbaojing", 102, 2, "引风变频器故障报警"));

        map.put("ex_gufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_gufengbianpinqiguzhangbaojing", 104, 2, "鼓风变频器故障报警"));

        map.put("ex_ecigufengbianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhangbaojing", 106, 2, "二次鼓风变频器故障报警"));

        map.put("ex_lupaibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_lupaibianpinqiguzhangbaojing", 108, 2, "炉排变频器故障报警"));

        map.put("ex_jishuibengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_jishuibengguzhangbaojing", 110, 2, "给水泵故障报警"));

        map.put("ex_xunhuanbengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengguzhangbaojing", 112, 2, "循环泵故障报警"));

        map.put("ex_chaodiyabaojing", ByteField.Init(new ExceptionField(), "ex_chaodiyabaojing", 114, 2, "超低压报警"));

        map.put("ex_qiandianyabaojing", ByteField.Init(new ExceptionField(), "ex_qiandianyabaojing", 116, 2, "欠电压报警"));

        map.put("ex_guodianyabaojing", ByteField.Init(new ExceptionField(), "ex_guodianyabaojing", 118, 2, "过电压报警"));

        map.put("ex_quexiangbaojing", ByteField.Init(new ExceptionField(), "ex_quexiangbaojing", 120, 2, "缺相报警"));

        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 122, 2, "漏电报警"));

        map.put("ex_biansongqiguoyabaohu", ByteField.Init(new ExceptionField(), "ex_biansongqiguoyabaohu", 124, 2, "变送器过压保护"));

        map.put("ex_guanjiancanshuyichang", ByteField.Init(new ExceptionField(), "ex_guanjiancanshuyichang", 126, 2, "关键参数异常"));

        map.put("ex_shedingcanshuyichang", ByteField.Init(new ExceptionField(), "ex_shedingcanshuyichang", 128, 2, "设定参数异常"));

        map.put("ex_shizhongguzhang", ByteField.Init(new ExceptionField(), "ex_shizhongguzhang", 130, 2, "时钟故障"));

        map.put("ex_cunchuqiguzhang", ByteField.Init(new ExceptionField(), "ex_cunchuqiguzhang", 132, 2, "存储器故障"));

        map.put("ex_waibuliansuobaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuobaojing", 134, 2, "外部连锁报警"));

        map.put("ex_queyoubaojing", ByteField.Init(new ExceptionField(), "ex_queyoubaojing", 136, 2, "缺油报警"));

        map.put("ex_diyouweibaojing", ByteField.Init(new ExceptionField(), "ex_diyouweibaojing", 138, 2, "低油位报警"));

        map.put("ex_bentipaiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_bentipaiyanwendugaobaojing", 140, 2, "本体排烟温度高报警"));

        map.put("ex_bianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhangbaojing", 142, 2, "变频器故障报警"));

        map.put("ex_meishuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_meishuiwendugaobaojing", 144, 2, "媒水温度高报警"));

        map.put("ex_1#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_1#guoluguzhang", 146, 2, "1#锅炉故障"));

        map.put("ex_2#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_2#guoluguzhang", 148, 2, "2#锅炉故障"));

        map.put("ex_3#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_3#guoluguzhang", 150, 2, "3#锅炉故障"));

        map.put("ex_4#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_4#guoluguzhang", 152, 2, "4#锅炉故障"));

        map.put("ex_5#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_5#guoluguzhang", 154, 2, "5#锅炉故障"));

        map.put("ex_6#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_6#guoluguzhang", 156, 2, "6#锅炉故障"));

        map.put("ex_7#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_7#guoluguzhang", 158, 2, "7#锅炉故障"));

        map.put("ex_8#guoluguzhang", ByteField.Init(new ExceptionField(), "ex_8#guoluguzhang", 160, 2, "8#锅炉故障"));

        map.put("ex_bushuibianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bushuibianpinqiguzhangbaojing", 162, 2, "补水变频器故障报警"));

        map.put("ex_diliuliangbaojing", ByteField.Init(new ExceptionField(), "ex_diliuliangbaojing", 164, 2, "低流量报警"));

        map.put("ex_jinkouwendudibaojing", ByteField.Init(new ExceptionField(), "ex_jinkouwendudibaojing", 166, 2, "进口温度低报警"));

        map.put("ex_xunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanbengbianpinqiguzhang", 168, 2, "循环泵变频器故障"));

        map.put("ex_ecixunhuanbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengbianpinqiguzhang", 170, 2, "二次循环泵变频器故障"));

        map.put("ex_reshuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengbianpinqiguzhang", 172, 2, "热水泵变频器故障"));

        map.put("ex_buyoubengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengbianpinqiguzhang", 174, 2, "补油泵变频器故障"));

        map.put("ex_ecigufengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecigufengbianpinqiguzhang", 176, 2, "二次鼓风变频器故障"));

        map.put("ex_songliaojibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_songliaojibianpinqiguzhang", 178, 2, "送料机变频器故障"));

        map.put("ex_zhenkongbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengbianpinqiguzhang", 180, 2, "真空泵变频器故障"));

        map.put("ex_lengningbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengbianpinqiguzhang", 182, 2, "冷凝泵变频器故障"));

        map.put("ex_bushuibengguzhang", ByteField.Init(new ExceptionField(), "ex_bushuibengguzhang", 184, 2, "补水泵故障"));

        map.put("ex_buyoubengguzhang", ByteField.Init(new ExceptionField(), "ex_buyoubengguzhang", 186, 2, "补油泵故障"));

        map.put("ex_lengningbengguzhang", ByteField.Init(new ExceptionField(), "ex_lengningbengguzhang", 188, 2, "冷凝泵故障"));

        map.put("ex_reshuibengguzhang", ByteField.Init(new ExceptionField(), "ex_reshuibengguzhang", 190, 2, "热水泵故障"));

        map.put("ex_zhenkongbengguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongbengguzhang", 192, 2, "真空泵故障"));

        map.put("ex_ecixunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_ecixunhuanbengguzhang", 194, 2, "二次循环泵故障"));

        map.put("ex_huilu1xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1xunhuanbengguzhang", 196, 2, "回路1循环泵故障"));

        map.put("ex_huilu2xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2xunhuanbengguzhang", 198, 2, "回路2循环泵故障"));

        map.put("ex_huilu3xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3xunhuanbengguzhang", 200, 2, "回路3循环泵故障"));

        map.put("ex_huilu4xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4xunhuanbengguzhang", 202, 2, "回路4循环泵故障"));

        map.put("ex_huilu5xunhuanbengguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5xunhuanbengguzhang", 204, 2, "回路5循环泵故障"));

        map.put("ex_huilu1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu1wendugaobaojing", 206, 2, "回路1温度高报警"));

        map.put("ex_huilu2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu2wendugaobaojing", 208, 2, "回路2温度高报警"));

        map.put("ex_huilu3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu3wendugaobaojing", 210, 2, "回路3温度高报警"));

        map.put("ex_huilu4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu4wendugaobaojing", 212, 2, "回路4温度高报警"));

        map.put("ex_huilu5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_huilu5wendugaobaojing", 214, 2, "回路5温度高报警"));

        map.put("ex_panguan1wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan1wendugaobaojing", 216, 2, "盘管1温度高报警"));

        map.put("ex_panguan2wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan2wendugaobaojing", 218, 2, "盘管2温度高报警"));

        map.put("ex_panguan3wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan3wendugaobaojing", 220, 2, "盘管3温度高报警"));

        map.put("ex_panguan4wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan4wendugaobaojing", 222, 2, "盘管4温度高报警"));

        map.put("ex_panguan5wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan5wendugaobaojing", 224, 2, "盘管5温度高报警"));

        map.put("ex_panguan6wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan6wendugaobaojing", 226, 2, "盘管6温度高报警"));

        map.put("ex_panguan7wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan7wendugaobaojing", 228, 2, "盘管7温度高报警"));

        map.put("ex_panguan8wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan8wendugaobaojing", 230, 2, "盘管8温度高报警"));

        map.put("ex_panguan9wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan9wendugaobaojing", 232, 2, "盘管9温度高报警"));

        map.put("ex_panguan10wendugaobaojing", ByteField.Init(new ExceptionField(), "ex_panguan10wendugaobaojing", 234, 2, "盘管10温度高报警"));

        map.put("ex_shanzhengguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanchaoyabaojing", 236, 2, "闪蒸罐超压报警"));

        map.put("ex_lengningguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanchaoyabaojing", 238, 2, "冷凝罐超压报警"));

        map.put("ex_pengzhangguanchaoyabaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanchaoyabaojing", 240, 2, "膨胀罐超压报警"));

        map.put("ex_shanzhengguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweigaobaojing", 242, 2, "闪蒸罐液位高报警"));

        map.put("ex_shanzhengguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweidibaojing", 244, 2, "闪蒸罐液位低报警"));

        map.put("ex_lengningguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweigaobaojing", 246, 2, "冷凝罐液位高报警"));

        map.put("ex_lengningguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_lengningguanyeweidibaojing", 248, 2, "冷凝罐液位低报警"));

        map.put("ex_pengzhangguanyeweigaobaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweigaobaojing", 250, 2, "膨胀罐液位高报警"));

        map.put("ex_pengzhangguanyeweidibaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweidibaojing", 252, 2, "膨胀罐液位低报警"));

        map.put("ex_jinchukouyachadibaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachadibaojing", 254, 2, "进出口压差低报警"));

        map.put("ex_jinchukouyachagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouyachagaobaojing", 256, 2, "进出口压差高报警"));

        map.put("ex_zhenkongyalibuzubaojing,", ByteField.Init(new ExceptionField(), "ex_zhenkongyalibuzubaojing,", 258, 2, "真空压力不足报警,"));

        map.put("ex_jinchukouwenchadibaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouwenchadibaojing", 260, 2, "进出口温差低报警"));

        map.put("ex_jinchukouwenchagaobaojing", ByteField.Init(new ExceptionField(), "ex_jinchukouwenchagaobaojing", 262, 2, "进出口温差高报警"));

        map.put("ex_chukouyaligaobaojing_guoluhuohuilu_", ByteField.Init(new ExceptionField(), "ex_chukouyaligaobaojing_guoluhuohuilu_", 264, 2, "出口压力高报警（锅炉或回路）"));

        map.put("ex_chukouyalidibaojing_guoluhuohuilu_", ByteField.Init(new ExceptionField(), "ex_chukouyalidibaojing_guoluhuohuilu_", 266, 2, "出口压力低报警（锅炉或回路）"));

        map.put("ex_jinkouyaligaobaojing_guoluhuohuilu_", ByteField.Init(new ExceptionField(), "ex_jinkouyaligaobaojing_guoluhuohuilu_", 268, 2, "进口压力高报警（锅炉或回路）"));

        map.put("ex_jinkouyalidibaojing_guoluhuohuilu_", ByteField.Init(new ExceptionField(), "ex_jinkouyalidibaojing_guoluhuohuilu_", 270, 2, "进口压力低报警（锅炉或回路）"));

        map.put("ex_yinfengjiguzhangbaojing_dongzuofankuiyichang_", ByteField.Init(new ExceptionField(), "ex_yinfengjiguzhangbaojing_dongzuofankuiyichang_", 272, 2, "引风机故障报警（动作反馈异常）"));

        map.put("ex_cainuanchukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_cainuanchukouwendugaobaojing", 274, 2, "采暖出口温度高报警"));

        map.put("ex_reshuichukouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_reshuichukouwendugaobaojing", 276, 2, "热水出口温度高报警"));

        map.put("ex_jinkouwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_jinkouwendugaobaojing", 278, 2, "进口温度高报警"));

        map.put("ex_pengzhangguanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_pengzhangguanwendugaobaojing", 280, 2, "膨胀罐温度高报警"));

        map.put("ex_guodianliubaojing", ByteField.Init(new ExceptionField(), "ex_guodianliubaojing", 282, 2, "过电流报警"));

        map.put("ex_jishuiyaligaobaojing", ByteField.Init(new ExceptionField(), "ex_jishuiyaligaobaojing", 284, 2, "给水压力高报警"));

        map.put("ex_jienengqichukouyanwengaobaojing", ByteField.Init(new ExceptionField(), "ex_jienengqichukouyanwengaobaojing", 286, 2, "节能器出口烟温高报警"));

        map.put("ex_lengningqichukouyanwengaobaojing", ByteField.Init(new ExceptionField(), "ex_lengningqichukouyanwengaobaojing", 288, 2, "冷凝器出口烟温高报警"));

        map.put("ex_chushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chushuiwendugaobaojing", 290, 2, "出水温度高报警"));

        map.put("ex_gaowenbaohuwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_gaowenbaohuwendugaobaojing", 292, 2, "高温保护温度高报警"));

        map.put("ex_youwengaobaojing", ByteField.Init(new ExceptionField(), "ex_youwengaobaojing", 294, 2, "油温高报警"));

        map.put("ex_wenchagaobaojing", ByteField.Init(new ExceptionField(), "ex_wenchagaobaojing", 296, 2, "温差高报警"));

        map.put("ex_shuibengguozaibaojing", ByteField.Init(new ExceptionField(), "ex_shuibengguozaibaojing", 298, 2, "水泵过载报警"));

        map.put("ex_jiarezuguozaibaojing", ByteField.Init(new ExceptionField(), "ex_jiarezuguozaibaojing", 300, 2, "加热组过载报警"));

        map.put("ex_churexunhuanbengguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_churexunhuanbengguzhangbaojing", 302, 2, "储热循环泵故障报警"));

        map.put("ex_yandaodiefaguzhang", ByteField.Init(new ExceptionField(), "ex_yandaodiefaguzhang", 304, 2, "烟道蝶阀故障"));

        map.put("ex_nengliangshezhiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_nengliangshezhiwendugaobaojing", 306, 2, "能量设置温度高报警"));

        //后120个报警010307E800124487

        map.put("ex_zhengqiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_zhengqiwendugaobaojing", 313, 2, "蒸汽温度高报警"));

        map.put("ex_shuixiangwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_shuixiangwendugaobaojing", 315, 2, "水箱温度高报警"));

        //120个故障信息010307000078449C
        map.put("ex_bentipaiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_bentipaiyanwenduchuanganqiguzhang", 558, 2, "本体排烟温度传感器故障"));

        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 560, 2, "排烟温度传感器故障"));

        map.put("ex_lushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lushuiwenduchuanganqiguzhang", 562, 2, "炉水温度传感器故障"));

        map.put("ex_chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouwenduchuanganqiguzhang", 564, 2, "出口温度传感器故障"));

        map.put("ex_jinkouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinkouwenduchuanganqiguzhang", 566, 2, "进口温度传感器故障"));

        map.put("ex_jienengqichukouwenduchuanganqiguzhang(shui_", ByteField.Init(new ExceptionField(), "ex_jienengqichukouwenduchuanganqiguzhang(shui_", 568, 2, "节能器出口温度传感器故障(水）"));

        map.put("ex_jienengqijinkouwenduchuanganqiguzhang(shui_", ByteField.Init(new ExceptionField(), "ex_jienengqijinkouwenduchuanganqiguzhang(shui_", 570, 2, "节能器进口温度传感器故障(水）"));

        map.put("ex_jishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiwenduchuanganqiguzhang", 572, 2, "给水温度传感器故障"));

        map.put("ex_lutangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangwenduchuanganqiguzhang", 574, 2, "炉膛温度传感器故障"));

        map.put("ex_lutangchukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouwenduchuanganqiguzhang", 576, 2, "炉膛出口温度传感器故障"));

        map.put("ex_lubiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lubiwenduchuanganqiguzhang", 578, 2, "炉壁温度传感器故障"));

        map.put("ex_ranliaowenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranliaowenduchuanganqiguzhang", 580, 2, "燃料温度传感器故障"));

        map.put("ex_refengwenduchuanganqiguzhang_kongyuqichukou_", ByteField.Init(new ExceptionField(), "ex_refengwenduchuanganqiguzhang_kongyuqichukou_", 582, 2, "热风温度传感器故障（空预器出口）"));

        map.put("ex_fuyazhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fuyazhengqiwenduchuanganqiguzhang", 584, 2, "负压蒸汽温度传感器故障"));

        map.put("ex_guorezhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiwenduchuanganqiguzhang", 586, 2, "过热蒸汽温度传感器故障"));

        map.put("ex_huilu1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu1wenduchuanganqiguzhang", 588, 2, "回路1温度传感器故障"));

        map.put("ex_huilu2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu2wenduchuanganqiguzhang", 590, 2, "回路2温度传感器故障"));

        map.put("ex_huilu3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu3wenduchuanganqiguzhang", 592, 2, "回路3温度传感器故障"));

        map.put("ex_huilu4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu4wenduchuanganqiguzhang", 594, 2, "回路4温度传感器故障"));

        map.put("ex_huilu5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huilu5wenduchuanganqiguzhang", 596, 2, "回路5温度传感器故障"));

        map.put("ex_shiwaiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shiwaiwenduchuanganqiguzhang", 598, 2, "室外温度传感器故障"));

        map.put("ex_zhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiyalichuanganqiguzhang", 600, 2, "蒸汽压力传感器故障"));

        map.put("ex_jishuiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuiyalichuanganqiguzhang", 602, 2, "给水压力传感器故障"));

        map.put("ex_chukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouyalichuanganqiguzhang", 604, 2, "出口压力传感器故障"));

        map.put("ex_jinkouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinkouyalichuanganqiguzhang", 606, 2, "进口压力传感器故障"));

        map.put("ex_lutangyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangyalichuanganqiguzhang", 608, 2, "炉膛压力传感器故障"));

        map.put("ex_lutangchukouyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lutangchukouyalichuanganqiguzhang", 610, 2, "炉膛出口压力传感器故障"));

        map.put("ex_ranqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranqiyalichuanganqiguzhang", 612, 2, "燃气压力传感器故障"));

        map.put("ex_yicifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yicifengyachuanganqiguzhang", 614, 2, "一次风压传感器故障"));

        map.put("ex_ecifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_ecifengyachuanganqiguzhang", 616, 2, "二次风压传感器故障"));

        map.put("ex_ranliaoliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_ranliaoliangchuanganqiguzhang_shunshizhi_", 618, 2, "燃料量传感器故障（瞬时值）"));

        map.put("ex_zhengqiliuliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_zhengqiliuliangchuanganqiguzhang_shunshizhi_", 620, 2, "蒸汽流量传感器故障（瞬时值）"));

        map.put("ex_jishuiliuliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_jishuiliuliangchuanganqiguzhang_shunshizhi_", 622, 2, "给水流量传感器故障（瞬时值）"));

        map.put("ex_xunhuanliuliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_xunhuanliuliangchuanganqiguzhang_shunshizhi_", 624, 2, "循环流量传感器故障（瞬时值）"));

        map.put("ex_bushuiliuliangchuanganqiguzhang_shunshizhi_", ByteField.Init(new ExceptionField(), "ex_bushuiliuliangchuanganqiguzhang_shunshizhi_", 626, 2, "补水流量传感器故障（瞬时值）"));

        map.put("ex_guoluyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guoluyeweichuanganqiguzhang", 628, 2, "锅炉液位传感器故障"));

        map.put("ex_shuixiangyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangyeweichuanganqiguzhang", 630, 2, "水箱液位传感器故障"));

        map.put("ex_paiyanyanghanliangchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanyanghanliangchuanganqiguzhang", 632, 2, "排烟氧含量传感器故障"));

        map.put("ex_lupaisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lupaisudufankuichuanganqiguzhang", 634, 2, "炉排速度反馈传感器故障"));

        map.put("ex_yinfengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengshuchufankuichuanganqiguzhang", 636, 2, "引风输出反馈传感器故障"));

        map.put("ex_gufengshuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengshuchufankuichuanganqiguzhang", 638, 2, "鼓风输出反馈传感器故障"));

        map.put("ex_jishuishuchufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuishuchufankuichuanganqiguzhang", 640, 2, "给水输出反馈传感器故障"));

        map.put("ex_meishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_meishuiwenduchuanganqiguzhang", 642, 2, "媒水温度传感器故障"));

        map.put("ex_shuixiangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuixiangwenduchuanganqiguzhang", 644, 2, "水箱温度传感器故障"));

        map.put("ex_pengzhangguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanyeweichuanganqiguzhang", 646, 2, "膨胀罐液位传感器故障"));

        map.put("ex_shanzhengguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanyeweichuanganqiguzhang", 648, 2, "闪蒸罐液位传感器故障"));

        map.put("ex_lengningyeguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanyeweichuanganqiguzhang", 650, 2, "冷凝液罐液位传感器故障"));

        map.put("ex_chuguanyeweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanyeweichuanganqiguzhang", 652, 2, "储罐液位传感器故障"));

        map.put("ex_pengzhangguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_pengzhangguanwenduchuanganqiguzhang", 654, 2, "膨胀罐温度传感器故障"));

        map.put("ex_shanzhengguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shanzhengguanwenduchuanganqiguzhang", 656, 2, "闪蒸罐温度传感器故障"));

        map.put("ex_lengningyeguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningyeguanwenduchuanganqiguzhang", 658, 2, "冷凝液罐温度传感器故障"));

        map.put("ex_chuguanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuguanwenduchuanganqiguzhang", 660, 2, "储罐温度传感器故障"));

        map.put("ex_xitongyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_xitongyalichuanganqiguzhang", 662, 2, "系统压力传感器故障"));

        map.put("ex_guorezhengqiyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_guorezhengqiyalichuanganqiguzhang", 664, 2, "过热蒸汽压力传感器故障"));

        map.put("ex_paiyanchuyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanchuyalichuanganqiguzhang", 666, 2, "排烟处压力传感器故障"));

        map.put("ex_fengshifengyachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_fengshifengyachuanganqiguzhang", 668, 2, "风室风压传感器故障"));

        map.put("ex_yinfengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_yinfengjidianliuchuanganqiguzhang", 670, 2, "引风机电流传感器故障"));

        map.put("ex_gufengjidianliuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gufengjidianliuchuanganqiguzhang", 672, 2, "鼓风机电流传感器故障"));

        map.put("ex_jiliaojisudufankuichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jiliaojisudufankuichuanganqiguzhang", 674, 2, "给料机速度反馈传感器故障"));

        map.put("ex_panguan1wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan1wenduchuanganqiguzhang", 676, 2, "盘管1温度传感器故障"));

        map.put("ex_panguan2wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan2wenduchuanganqiguzhang", 678, 2, "盘管2温度传感器故障"));

        map.put("ex_panguan3wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan3wenduchuanganqiguzhang", 680, 2, "盘管3温度传感器故障"));

        map.put("ex_panguan4wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan4wenduchuanganqiguzhang", 682, 2, "盘管4温度传感器故障"));

        map.put("ex_panguan5wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan5wenduchuanganqiguzhang", 684, 2, "盘管5温度传感器故障"));

        map.put("ex_panguan6wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan6wenduchuanganqiguzhang", 686, 2, "盘管6温度传感器故障"));

        map.put("ex_panguan7wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan7wenduchuanganqiguzhang", 688, 2, "盘管7温度传感器故障"));

        map.put("ex_panguan8wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan8wenduchuanganqiguzhang", 690, 2, "盘管8温度传感器故障"));

        map.put("ex_panguan9wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan9wenduchuanganqiguzhang", 692, 2, "盘管9温度传感器故障"));

        map.put("ex_panguan10wenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_panguan10wenduchuanganqiguzhang", 694, 2, "盘管10温度传感器故障"));

        map.put("ex_cainuanchukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_cainuanchukouwenduchuanganqiguzhang", 696, 2, "采暖出口温度传感器故障"));

        map.put("ex_reshuichukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuichukouwenduchuanganqiguzhang", 698, 2, "热水出口温度传感器故障"));

        map.put("ex_jinchukouyachachuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinchukouyachachuanganqiguzhang", 700, 2, "进出口压差传感器故障"));

        map.put("ex_1#chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_1#chukouwenduchuanganqiguzhang", 702, 2, "1#出口温度传感器故障"));

        map.put("ex_2#chukouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_2#chukouwenduchuanganqiguzhang", 704, 2, "2#出口温度传感器故障"));

        map.put("ex_jienengqichukouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqichukouyanwenchuanganqiguzhang", 706, 2, "节能器出口烟温传感器故障"));

        map.put("ex_jienengqijinkouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jienengqijinkouyanwenchuanganqiguzhang", 708, 2, "节能器进口烟温传感器故障"));

        map.put("ex_lengningqichukouwendu_shui_chuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqichukouwendu_shui_chuanganqiguzhang", 710, 2, "冷凝器出口温度（水）传感器故障"));

        map.put("ex_lengningqijinkou_shui_chuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqijinkou_shui_chuanganqiguzhang", 712, 2, "冷凝器进口（水）传感器故障"));

        map.put("ex_lengningqichukouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqichukouyanwenchuanganqiguzhang", 714, 2, "冷凝器出口烟温传感器故障"));

        map.put("ex_lengningqijinkouyanwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_lengningqijinkouyanwenchuanganqiguzhang", 716, 2, "冷凝器进口烟温传感器故障"));

        map.put("ex_cainuanjinkouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_cainuanjinkouwenduchuanganqiguzhang", 718, 2, "采暖进口温度传感器故障"));

        map.put("ex_reshuijinkouwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_reshuijinkouwenduchuanganqiguzhang", 720, 2, "热水进口温度传感器故障"));

        map.put("ex_kongzhixiangwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_kongzhixiangwenduchuanganqiguzhang", 722, 2, "控制箱温度传感器故障"));

        map.put("ex_zhenkongyalichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhenkongyalichuanganqiguzhang", 724, 2, "真空压力传感器故障"));

        map.put("ex_chushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiguzhang", 726, 2, "出水温度传感器故障"));

        map.put("ex_jinshuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinshuiwenduchuanganqiguzhang", 728, 2, "进水温度传感器故障"));

        map.put("ex_youwenjiancechuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_youwenjiancechuanganqiguzhang", 730, 2, "油温检测传感器故障"));

        map.put("ex_gaowenbaohuchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_gaowenbaohuchuanganqiguzhang", 732, 2, "高温保护传感器故障"));

        map.put("ex_chukouyouwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chukouyouwenchuanganqiguzhang", 734, 2, "出口油温传感器故障"));

        map.put("ex_jinkouyouwenchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_jinkouyouwenchuanganqiguzhang", 736, 2, "进口油温传感器故障"));

        map.put("ex_huanrewenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huanrewenduchuanganqiguzhang", 738, 2, "换热温度传感器故障"));

        map.put("ex_xitongwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_xitongwenduchuanganqiguzhang", 740, 2, "系统温度传感器故障"));

        map.put("ex_nengliangshezhiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_nengliangshezhiwenduchuanganqiguzhang", 742, 2, "能量设置温度传感器故障"));

        map.put("ex_zhengqiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhengqiwenduchuanganqiguzhang", 744, 2, "蒸汽温度传感器故障"));

        //前120个模拟量0103010000784414
        map.put("mo_bentipaiyanwendu", ByteField.Init(new MockField(), "mo_bentipaiyanwendu", 803, 2, "本体排烟温度","℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 804, 2, "排烟温度","℃"));
        map.put("mo_lushuiwendu", ByteField.Init(new MockField(), "mo_lushuiwendu", 805, 2, "炉水温度","℃"));
        map.put("mo_chukouwendu", ByteField.Init(new MockField(), "mo_chukouwendu", 806, 2, "出口温度","℃"));
        map.put("mo_jinkouwendu", ByteField.Init(new MockField(), "mo_jinkouwendu", 807, 2, "进口温度","℃"));
        map.put("mo_jienengqichukouwendu(shui_", ByteField.Init(new MockField(), "mo_jienengqichukouwendu(shui_", 808, 2, "节能器出口温度(水）","℃"));
        map.put("mo_jienengqijinkouwendu(shui_", ByteField.Init(new MockField(), "mo_jienengqijinkouwendu(shui_", 809, 2, "节能器进口温度(水）","℃"));
        map.put("mo_jishuiwendu", ByteField.Init(new MockField(), "mo_jishuiwendu", 810, 2, "给水温度","℃"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 811, 2, "炉膛温度","℃"));
        map.put("mo_lutangchukouwendu", ByteField.Init(new MockField(), "mo_lutangchukouwendu", 812, 2, "炉膛出口温度","℃"));
        map.put("mo_lubiwendu", ByteField.Init(new MockField(), "mo_lubiwendu", 813, 2, "炉壁温度","℃"));
        map.put("mo_ranliaowendu", ByteField.Init(new MockField(), "mo_ranliaowendu", 814, 2, "燃料温度","℃"));
        map.put("mo_refengwendu_kongyuqichukou_", ByteField.Init(new MockField(), "mo_refengwendu_kongyuqichukou_", 815, 2, "热风温度（空预器出口）","℃"));
        map.put("mo_fuyazhengqiwendu", ByteField.Init(new MockField(), "mo_fuyazhengqiwendu", 816, 2, "负压蒸汽温度","℃"));
        map.put("mo_guorezhengqiwendu", ByteField.Init(new MockField(), "mo_guorezhengqiwendu", 817, 2, "过热蒸汽温度","℃"));
        map.put("mo_huilu1wendu", ByteField.Init(new MockField(), "mo_huilu1wendu", 818, 2, "回路1温度","℃"));
        map.put("mo_huilu2wendu", ByteField.Init(new MockField(), "mo_huilu2wendu", 819, 2, "回路2温度","℃"));
        map.put("mo_huilu3wendu", ByteField.Init(new MockField(), "mo_huilu3wendu", 820, 2, "回路3温度","℃"));
        map.put("mo_huilu4wendu", ByteField.Init(new MockField(), "mo_huilu4wendu", 821, 2, "回路4温度","℃"));
        map.put("mo_huilu5wendu", ByteField.Init(new MockField(), "mo_huilu5wendu", 822, 2, "回路5温度","℃"));
        map.put("mo_shiwaiwendu", ByteField.Init(new MockField(), "mo_shiwaiwendu", 823, 2, "室外温度","℃"));
        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 824, 2, "蒸汽压力","MPa",100));
        map.put("mo_jishuiyali", ByteField.Init(new MockField(), "mo_jishuiyali", 825, 2, "给水压力","MPa",100));
        map.put("mo_chukouyali", ByteField.Init(new MockField(), "mo_chukouyali", 826, 2, "出口压力","MPa",100));
        map.put("mo_jinkouyali", ByteField.Init(new MockField(), "mo_jinkouyali", 827, 2, "进口压力","MPa",100));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 828, 2, "炉膛压力","Pa"));
        map.put("mo_lutangchukouyali", ByteField.Init(new MockField(), "mo_lutangchukouyali", 829, 2, "炉膛出口压力","Pa"));
        map.put("mo_ranqiyali", ByteField.Init(new MockField(), "mo_ranqiyali", 830, 2, "燃气压力","KPa"));
        map.put("mo_yicifengya", ByteField.Init(new MockField(), "mo_yicifengya", 831, 2, "一次风压","KPa"));
        map.put("mo_ecifengya", ByteField.Init(new MockField(), "mo_ecifengya", 832, 2, "二次风压","KPa"));
        map.put("mo_ranliaoliang_shunshizhi_", ByteField.Init(new MockField(), "mo_ranliaoliang_shunshizhi_", 833, 2, "燃料量（瞬时值）"));
        map.put("mo_zhengqiliuliang_shunshizhi_", ByteField.Init(new MockField(), "mo_zhengqiliuliang_shunshizhi_", 834, 2, "蒸汽流量（瞬时值）"));
        map.put("mo_jishuiliuliang_shunshizhi_", ByteField.Init(new MockField(), "mo_jishuiliuliang_shunshizhi_", 835, 2, "给水流量（瞬时值）"));
        map.put("mo_xunhuanliuliang_shunshizhi_", ByteField.Init(new MockField(), "mo_xunhuanliuliang_shunshizhi_", 836, 2, "循环流量（瞬时值）"));
        map.put("mo_bushuiliuliang_shunshizhi_", ByteField.Init(new MockField(), "mo_bushuiliuliang_shunshizhi_", 837, 2, "补水流量（瞬时值）"));
        map.put("mo_guoluyewei", ByteField.Init(new MockField(), "mo_guoluyewei", 838, 2, "锅炉液位","mm"));
        map.put("mo_shuixiangyewei", ByteField.Init(new MockField(), "mo_shuixiangyewei", 839, 2, "水箱液位","mm"));
        map.put("mo_paiyanyanghanliang", ByteField.Init(new MockField(), "mo_paiyanyanghanliang", 840, 2, "排烟氧含量","%",10));
        map.put("mo_lupaisudufankui", ByteField.Init(new MockField(), "mo_lupaisudufankui", 841, 2, "炉排速度反馈","%"));
        map.put("mo_yinfengshuchufankui", ByteField.Init(new MockField(), "mo_yinfengshuchufankui", 842, 2, "引风输出反馈","%"));
        map.put("mo_gufengshuchufankui", ByteField.Init(new MockField(), "mo_gufengshuchufankui", 843, 2, "鼓风输出反馈","%"));
        map.put("mo_jishuishuchufankui", ByteField.Init(new MockField(), "mo_jishuishuchufankui", 844, 2, "给水输出反馈","%"));
        map.put("mo_meishuiwendu", ByteField.Init(new MockField(), "mo_meishuiwendu", 845, 2, "媒水温度","℃"));
        map.put("mo_shuixiangwendu", ByteField.Init(new MockField(), "mo_shuixiangwendu", 846, 2, "水箱温度","℃"));
        map.put("mo_pengzhangguanyewei", ByteField.Init(new MockField(), "mo_pengzhangguanyewei", 847, 2, "膨胀罐液位","mm"));
        map.put("mo_shanzhengguanyewei", ByteField.Init(new MockField(), "mo_shanzhengguanyewei", 848, 2, "闪蒸罐液位","mm"));
        map.put("mo_lengningyeguanyewei", ByteField.Init(new MockField(), "mo_lengningyeguanyewei", 849, 2, "冷凝液罐液位","mm"));
        map.put("mo_chuguanyewei", ByteField.Init(new MockField(), "mo_chuguanyewei", 850, 2, "储罐液位","mm"));
        map.put("mo_pengzhangguanwendu", ByteField.Init(new MockField(), "mo_pengzhangguanwendu", 851, 2, "膨胀罐温度","℃"));
        map.put("mo_shanzhengguanwendu", ByteField.Init(new MockField(), "mo_shanzhengguanwendu", 852, 2, "闪蒸罐温度","℃"));
        map.put("mo_lengningyeguanwendu", ByteField.Init(new MockField(), "mo_lengningyeguanwendu", 853, 2, "冷凝液罐温度","℃"));
        map.put("mo_chuguanwendu", ByteField.Init(new MockField(), "mo_chuguanwendu", 854, 2, "储罐温度","℃"));
        map.put("mo_xitongyali_yongyuchengyareshuiguolu_", ByteField.Init(new MockField(), "mo_xitongyali_yongyuchengyareshuiguolu_", 855, 2, "系统压力（用于承压热水锅炉）","MPa",100));
        map.put("mo_guorezhengqiyali", ByteField.Init(new MockField(), "mo_guorezhengqiyali", 856, 2, "过热蒸汽压力","MPa",100));
        map.put("mo_paiyanchuyali", ByteField.Init(new MockField(), "mo_paiyanchuyali", 857, 2, "排烟处压力","Pa"));
        map.put("mo_fengshifengya", ByteField.Init(new MockField(), "mo_fengshifengya", 858, 2, "风室风压","KPa"));
        map.put("mo_yinfengjidianliu", ByteField.Init(new MockField(), "mo_yinfengjidianliu", 859, 2, "引风机电流","A"));
        map.put("mo_gufengjidianliu", ByteField.Init(new MockField(), "mo_gufengjidianliu", 860, 2, "鼓风机电流","A"));
        map.put("mo_jiliaojisudufankui", ByteField.Init(new MockField(), "mo_jiliaojisudufankui", 861, 2, "给料机速度反馈","%"));
        map.put("mo_panguan1wendu", ByteField.Init(new MockField(), "mo_panguan1wendu", 862, 2, "盘管1温度","℃"));
        map.put("mo_panguan2wendu", ByteField.Init(new MockField(), "mo_panguan2wendu", 863, 2, "盘管2温度","℃"));
        map.put("mo_panguan3wendu", ByteField.Init(new MockField(), "mo_panguan3wendu", 864, 2, "盘管3温度","℃"));
        map.put("mo_panguan4wendu", ByteField.Init(new MockField(), "mo_panguan4wendu", 865, 2, "盘管4温度","℃"));
        map.put("mo_panguan5wendu", ByteField.Init(new MockField(), "mo_panguan5wendu", 866, 2, "盘管5温度","℃"));
        map.put("mo_panguan6wendu", ByteField.Init(new MockField(), "mo_panguan6wendu", 867, 2, "盘管6温度","℃"));
        map.put("mo_panguan7wendu", ByteField.Init(new MockField(), "mo_panguan7wendu", 868, 2, "盘管7温度","℃"));
        map.put("mo_panguan8wendu", ByteField.Init(new MockField(), "mo_panguan8wendu", 869, 2, "盘管8温度","℃"));
        map.put("mo_panguan9wendu", ByteField.Init(new MockField(), "mo_panguan9wendu", 870, 2, "盘管9温度","℃"));
        map.put("mo_panguan10wendu", ByteField.Init(new MockField(), "mo_panguan10wendu", 871, 2, "盘管10温度","℃"));
        map.put("mo_cainuanchukouwendu", ByteField.Init(new MockField(), "mo_cainuanchukouwendu", 872, 2, "采暖出口温度","℃"));
        map.put("mo_reshuichukouwendu", ByteField.Init(new MockField(), "mo_reshuichukouwendu", 873, 2, "热水出口温度","℃"));
        map.put("mo_jinchukouyacha", ByteField.Init(new MockField(), "mo_jinchukouyacha", 874, 2, "进出口压差","MPa",100));
        map.put("mo_1#chukouwendu", ByteField.Init(new MockField(), "mo_1#chukouwendu", 875, 2, "1#出口温度","℃"));
        map.put("mo_2#chukouwendu", ByteField.Init(new MockField(), "mo_2#chukouwendu", 876, 2, "2#出口温度","℃"));
        map.put("mo_jienengqichukouyanwen", ByteField.Init(new MockField(), "mo_jienengqichukouyanwen", 877, 2, "节能器出口烟温","℃"));
        map.put("mo_jienengqijinkouyanwen", ByteField.Init(new MockField(), "mo_jienengqijinkouyanwen", 878, 2, "节能器进口烟温","℃"));
        map.put("mo_lengningqichukouwendu_shui_", ByteField.Init(new MockField(), "mo_lengningqichukouwendu_shui_", 879, 2, "冷凝器出口温度（水）","℃"));
        map.put("mo_lengningqijinkouwendu_shui_", ByteField.Init(new MockField(), "mo_lengningqijinkouwendu_shui_", 880, 2, "冷凝器进口温度（水）","℃"));
        map.put("mo_lengningqichukouyanwen", ByteField.Init(new MockField(), "mo_lengningqichukouyanwen", 881, 2, "冷凝器出口烟温","℃"));
        map.put("mo_lengningqijinkouyanwen", ByteField.Init(new MockField(), "mo_lengningqijinkouyanwen", 882, 2, "冷凝器进口烟温","℃"));
        map.put("mo_cainuanjinkouwendu", ByteField.Init(new MockField(), "mo_cainuanjinkouwendu", 883, 2, "采暖进口温度","℃"));
        map.put("mo_reshuijinkouwendu", ByteField.Init(new MockField(), "mo_reshuijinkouwendu", 884, 2, "热水进口温度","℃"));
        map.put("mo_kongzhixiangwendu", ByteField.Init(new MockField(), "mo_kongzhixiangwendu", 885, 2, "控制箱温度","℃"));
        map.put("mo_zhenkongyali", ByteField.Init(new MockField(), "mo_zhenkongyali", 886, 2, "真空压力","KPa"));
        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 887, 2, "出水温度","℃"));
        map.put("mo_jinshuiwendu", ByteField.Init(new MockField(), "mo_jinshuiwendu", 888, 2, "进水温度","℃"));
        map.put("mo_youwenjiance", ByteField.Init(new MockField(), "mo_youwenjiance", 889, 2, "油温检测","℃"));
        map.put("mo_gaowenbaohu", ByteField.Init(new MockField(), "mo_gaowenbaohu", 890, 2, "高温保护","℃"));
        map.put("mo_chukouyouwen", ByteField.Init(new MockField(), "mo_chukouyouwen", 891, 2, "出口油温","℃"));
        map.put("mo_jinkouyouwen", ByteField.Init(new MockField(), "mo_jinkouyouwen", 892, 2, "进口油温","℃"));
        map.put("mo_huanrewendu", ByteField.Init(new MockField(), "mo_huanrewendu", 893, 2, "换热温度","℃"));
        map.put("mo_xitongwendu", ByteField.Init(new MockField(), "mo_xitongwendu", 894, 2, "系统温度","℃"));
        map.put("mo_nengliangshezhiwendu", ByteField.Init(new MockField(), "mo_nengliangshezhiwendu", 895, 2, "能量设置温度","℃"));
        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 896, 2, "蒸汽温度","℃"));
        map.put("mo_shineiwendu", ByteField.Init(new MockField(), "mo_shineiwendu", 897, 2, "室内温度","℃"));
        //前120个设置参数0103050000784524
        map.put("se_paiyanbaojingwendu", ByteField.Init(new SettingField(), "se_paiyanbaojingwendu", 929, 2, "排烟报警温度","℃"));
        map.put("se_baojingwendu", ByteField.Init(new SettingField(), "se_baojingwendu", 931, 2, "报警温度","℃"));
        map.put("se_tingluwendu", ByteField.Init(new SettingField(), "se_tingluwendu", 933, 2, "停炉温度","℃"));
        map.put("se_mubiaowendu", ByteField.Init(new SettingField(), "se_mubiaowendu", 935, 2, "目标温度","℃"));
        map.put("se_qiluwendu", ByteField.Init(new SettingField(), "se_qiluwendu", 937, 2, "启炉温度","℃"));
        map.put("se_zhuanhuohuicha", ByteField.Init(new SettingField(), "se_zhuanhuohuicha", 939, 2, "转火回差","℃"));
        map.put("se_qiluhuicha", ByteField.Init(new SettingField(), "se_qiluhuicha", 941, 2, "启炉回差","℃"));
        map.put("se_kaibengwendu", ByteField.Init(new SettingField(), "se_kaibengwendu", 943, 2, "开泵温度","℃"));
        map.put("se_guanbengwendu", ByteField.Init(new SettingField(), "se_guanbengwendu", 945, 2, "关泵温度","℃"));
        map.put("se_baojingyali", ByteField.Init(new SettingField(), "se_baojingyali", 947, 2, "报警压力","MPa",100));
        map.put("se_tingluyali", ByteField.Init(new SettingField(), "se_tingluyali", 949, 2, "停炉压力","MPa",100));
        map.put("se_mubiaoyali", ByteField.Init(new SettingField(), "se_mubiaoyali", 951, 2, "目标压力","MPa",100));
        map.put("se_qiluyali", ByteField.Init(new SettingField(), "se_qiluyali", 953, 2, "启炉压力","MPa",100));
        map.put("se_zhuanhuohuicha_yali_", ByteField.Init(new SettingField(), "se_zhuanhuohuicha_yali_", 955, 2, "转火回差（压力）","MPa",100));
        map.put("se_qiluhuicha_yali_", ByteField.Init(new SettingField(), "se_qiluhuicha_yali_", 957, 2, "启炉回差（压力）","MPa",100));
        map.put("se_qianyanshi", ByteField.Init(new SettingField(), "se_qianyanshi", 959, 2, "前延时","s"));
        map.put("se_houyanshi", ByteField.Init(new SettingField(), "se_houyanshi", 961, 2, "后延时","s"));
        map.put("se_qianchuisao", ByteField.Init(new SettingField(), "se_qianchuisao", 963, 2, "前吹扫","s"));
        map.put("se_houchuisao", ByteField.Init(new SettingField(), "se_houchuisao", 965, 2, "后吹扫","s"));
        map.put("se_lubibaojingwendu", ByteField.Init(new SettingField(), "se_lubibaojingwendu", 967, 2, "炉壁报警温度","℃"));
        map.put("se_lutangchukouwendu", ByteField.Init(new SettingField(), "se_lutangchukouwendu", 969, 2, "炉膛出口温度","℃"));
        map.put("se_baohuwendu", ByteField.Init(new SettingField(), "se_baohuwendu", 971, 2, "保护温度","℃"));
        map.put("se_bentipaiyanwendu", ByteField.Init(new SettingField(), "se_bentipaiyanwendu", 973, 2, "本体排烟温度","℃"));
        map.put("se_jiarezushu", ByteField.Init(new SettingField(), "se_jiarezushu", 975, 2, "加热组数","组"));
        map.put("se_jianceyalishijian", ByteField.Init(new SettingField(), "se_jianceyalishijian", 977, 2, "检测压力时间","s"));
        map.put("se_houyanshi", ByteField.Init(new SettingField(), "se_houyanshi", 979, 2, "后延时","m"));
        map.put("se_shedingwendu", ByteField.Init(new SettingField(), "se_shedingwendu", 981, 2, "设定温度","℃"));
        map.put("se_mokuailutaishu", ByteField.Init(new SettingField(), "se_mokuailutaishu", 983, 2, "模块炉台数","台"));
        map.put("se_gufenghouyanshi", ByteField.Init(new SettingField(), "se_gufenghouyanshi", 985, 2, "鼓风后延时","s"));
        map.put("se_yinfenghouyanshi", ByteField.Init(new SettingField(), "se_yinfenghouyanshi", 987, 2, "引风后延时","s"));
        map.put("se_shuixiangkaibengwendu", ByteField.Init(new SettingField(), "se_shuixiangkaibengwendu", 989, 2, "水箱开泵温度","℃"));
        map.put("se_shuixiangguanbengwendu", ByteField.Init(new SettingField(), "se_shuixiangguanbengwendu", 991, 2, "水箱关泵温度","℃"));
        map.put("se_lushuibaojingwendu", ByteField.Init(new SettingField(), "se_lushuibaojingwendu", 993, 2, "炉水报警温度","℃"));
        map.put("se_buchangxishu", ByteField.Init(new SettingField(), "se_buchangxishu", 995, 2, "补偿系数","%"));
        map.put("se_cankaowendu", ByteField.Init(new SettingField(), "se_cankaowendu", 997, 2, "参考温度","℃"));
        map.put("se_tingluzuidazhi", ByteField.Init(new SettingField(), "se_tingluzuidazhi", 999, 2, "停炉最大值","℃"));
        map.put("se_qiluzuixiaozhi", ByteField.Init(new SettingField(), "se_qiluzuixiaozhi", 1001, 2, "启炉最小值","℃"));
        map.put("se_cankaohuicha", ByteField.Init(new SettingField(), "se_cankaohuicha", 1003, 2, "参考回差","℃"));
        map.put("se_tingluwendu1", ByteField.Init(new SettingField(), "se_tingluwendu1", 1005, 2, "停炉温度1","℃"));
        map.put("se_qiluwendu1", ByteField.Init(new SettingField(), "se_qiluwendu1", 1007, 2, "启炉温度1","℃"));
        map.put("se_tingluwendu2", ByteField.Init(new SettingField(), "se_tingluwendu2", 1009, 2, "停炉温度2","℃"));
        map.put("se_qiluwendu2", ByteField.Init(new SettingField(), "se_qiluwendu2", 1011, 2, "启炉温度2","℃"));
        map.put("se_yusongliaoshijian", ByteField.Init(new SettingField(), "se_yusongliaoshijian", 1013, 2, "预送料时间","s"));
        map.put("se_dianhuoshijian", ByteField.Init(new SettingField(), "se_dianhuoshijian", 1015, 2, "点火时间","s"));
        map.put("se_songliaoqidongshijian", ByteField.Init(new SettingField(), "se_songliaoqidongshijian", 1017, 2, "送料启动时间","s"));
        map.put("se_songliaotingzhishijian", ByteField.Init(new SettingField(), "se_songliaotingzhishijian", 1019, 2, "送料停止时间","s"));
        map.put("se_dianhuojiange", ByteField.Init(new SettingField(), "se_dianhuojiange", 1021, 2, "点火间隔","min"));
        map.put("se_dianhuochenggongwendu", ByteField.Init(new SettingField(), "se_dianhuochenggongwendu", 1023, 2, "点火成功温度","℃"));
        map.put("se_lushuitingluwendu", ByteField.Init(new SettingField(), "se_lushuitingluwendu", 1025, 2, "炉水停炉温度","℃"));
        map.put("se_lushuiqiluwendu", ByteField.Init(new SettingField(), "se_lushuiqiluwendu", 1027, 2, "炉水启炉温度","℃"));
        map.put("se_meishuibaojingwendu", ByteField.Init(new SettingField(), "se_meishuibaojingwendu", 1029, 2, "媒水报警温度","℃"));
        map.put("se_meishuitingluwendu", ByteField.Init(new SettingField(), "se_meishuitingluwendu", 1031, 2, "媒水停炉温度","℃"));
        map.put("se_meishuiqiluwendu", ByteField.Init(new SettingField(), "se_meishuiqiluwendu", 1033, 2, "媒水启炉温度","℃"));
        map.put("se_kaibengyali_yongyudingyakongzhi_", ByteField.Init(new SettingField(), "se_kaibengyali_yongyudingyakongzhi_", 1035, 2, "开泵压力（用于定压控制）","MPa",100));
        map.put("se_guanbengyali_yongyudingyakongzhi_", ByteField.Init(new SettingField(), "se_guanbengyali_yongyudingyakongzhi_", 1037, 2, "关泵压力（用于定压控制）","MPa",100));
        map.put("se_panguanbaojingwendu", ByteField.Init(new SettingField(), "se_panguanbaojingwendu", 1039, 2, "盘管报警温度","℃"));
        map.put("se_huilu1baojingwendu", ByteField.Init(new SettingField(), "se_huilu1baojingwendu", 1041, 2, "回路1报警温度","℃"));
        map.put("se_huilu1kaibengwendu", ByteField.Init(new SettingField(), "se_huilu1kaibengwendu", 1043, 2, "回路1开泵温度","℃"));
        map.put("se_huilu1guanbengwendu", ByteField.Init(new SettingField(), "se_huilu1guanbengwendu", 1045, 2, "回路1关泵温度","℃"));
        map.put("se_huilu2baojingwendu", ByteField.Init(new SettingField(), "se_huilu2baojingwendu", 1047, 2, "回路2报警温度","℃"));
        map.put("se_huilu2kaibengwendu", ByteField.Init(new SettingField(), "se_huilu2kaibengwendu", 1049, 2, "回路2开泵温度","℃"));
        map.put("se_huilu2guanbengwendu", ByteField.Init(new SettingField(), "se_huilu2guanbengwendu", 1051, 2, "回路2关泵温度","℃"));
        map.put("se_huilu3baojingwendu", ByteField.Init(new SettingField(), "se_huilu3baojingwendu", 1053, 2, "回路3报警温度","℃"));
        map.put("se_huilu3kaibengwendu", ByteField.Init(new SettingField(), "se_huilu3kaibengwendu", 1055, 2, "回路3开泵温度","℃"));
        map.put("se_huilu3guanbengwendu", ByteField.Init(new SettingField(), "se_huilu3guanbengwendu", 1057, 2, "回路3关泵温度","℃"));
        map.put("se_huilu4baojingwendu", ByteField.Init(new SettingField(), "se_huilu4baojingwendu", 1059, 2, "回路4报警温度","℃"));
        map.put("se_huilu4kaibengwendu", ByteField.Init(new SettingField(), "se_huilu4kaibengwendu", 1061, 2, "回路4开泵温度","℃"));
        map.put("se_huilu4guanbengwendu", ByteField.Init(new SettingField(), "se_huilu4guanbengwendu", 1063, 2, "回路4关泵温度","℃"));
        map.put("se_huilu5baojingwendu", ByteField.Init(new SettingField(), "se_huilu5baojingwendu", 1065, 2, "回路5报警温度","℃"));
        map.put("se_huilu5kaibengwendu", ByteField.Init(new SettingField(), "se_huilu5kaibengwendu", 1067, 2, "回路5开泵温度","℃"));
        map.put("se_huilu5guanbengwendu", ByteField.Init(new SettingField(), "se_huilu5guanbengwendu", 1069, 2, "回路5关泵温度","℃"));
        map.put("se_touqieshijian_jiarezuyong_", ByteField.Init(new SettingField(), "se_touqieshijian_jiarezuyong_", 1071, 2, "投切时间（加热组用）","s"));
        map.put("se_diaojieshijian_jiarezuyong_", ByteField.Init(new SettingField(), "se_diaojieshijian_jiarezuyong_", 1073, 2, "调节时间（加热组用）","m"));
        map.put("se_chukouchaoyabaojing", ByteField.Init(new SettingField(), "se_chukouchaoyabaojing", 1075, 2, "出口超压报警","MPa",100));
        map.put("se_jinkouchaoyabaojing", ByteField.Init(new SettingField(), "se_jinkouchaoyabaojing", 1077, 2, "进口超压报警","MPa",100));
        map.put("se_cainuanbaojingwendu", ByteField.Init(new SettingField(), "se_cainuanbaojingwendu", 1079, 2, "采暖报警温度","℃"));
        map.put("se_cainuankaibengwendu", ByteField.Init(new SettingField(), "se_cainuankaibengwendu", 1081, 2, "采暖开泵温度","℃"));
        map.put("se_cainuanguanbengwendu", ByteField.Init(new SettingField(), "se_cainuanguanbengwendu", 1083, 2, "采暖关泵温度","℃"));
        map.put("se_reshuibaojingwendu", ByteField.Init(new SettingField(), "se_reshuibaojingwendu", 1085, 2, "热水报警温度","℃"));
        map.put("se_reshuikaibengwendu", ByteField.Init(new SettingField(), "se_reshuikaibengwendu", 1087, 2, "热水开泵温度","℃"));
        map.put("se_reshuiguanbengwendu", ByteField.Init(new SettingField(), "se_reshuiguanbengwendu", 1089, 2, "热水关泵温度","℃"));
        map.put("se_meishuimubiaowendu", ByteField.Init(new SettingField(), "se_meishuimubiaowendu", 1091, 2, "媒水目标温度","℃"));
        map.put("se_meishuiqiluhuicha", ByteField.Init(new SettingField(), "se_meishuiqiluhuicha", 1093, 2, "媒水启炉回差","℃"));
        map.put("se_chukoudiyabaojing", ByteField.Init(new SettingField(), "se_chukoudiyabaojing", 1095, 2, "出口低压报警","℃"));
        map.put("se_jinchukouyachagao", ByteField.Init(new SettingField(), "se_jinchukouyachagao", 1097, 2, "进出口压差高","℃"));
        map.put("se_jinchukouyachadi", ByteField.Init(new SettingField(), "se_jinchukouyachadi", 1099, 2, "进出口压差低","℃"));
        map.put("se_jinkoudiyabaojing", ByteField.Init(new SettingField(), "se_jinkoudiyabaojing", 1101, 2, "进口低压报警","℃"));
        map.put("se_jinkouchaowenbaojing", ByteField.Init(new SettingField(), "se_jinkouchaowenbaojing", 1103, 2, "进口超温报警","℃"));
        map.put("se_jinkoudiwenbaojing", ByteField.Init(new SettingField(), "se_jinkoudiwenbaojing", 1105, 2, "进口低温报警","℃"));
        map.put("se_chukoudiwenbaojing", ByteField.Init(new SettingField(), "se_chukoudiwenbaojing", 1107, 2, "出口低温报警","℃"));
        map.put("se_pengzhangguanchaowen", ByteField.Init(new SettingField(), "se_pengzhangguanchaowen", 1109, 2, "膨胀罐超温","℃"));
        map.put("se_mubiaoyewei", ByteField.Init(new SettingField(), "se_mubiaoyewei", 1111, 2, "目标液位","mm"));
        map.put("se_kaibengyewei", ByteField.Init(new SettingField(), "se_kaibengyewei", 1113, 2, "开泵液位","mm"));
        map.put("se_guanbengyewei", ByteField.Init(new SettingField(), "se_guanbengyewei", 1115, 2, "关泵液位","mm"));
        map.put("se_kongbengmubiao", ByteField.Init(new SettingField(), "se_kongbengmubiao", 1117, 2, "控泵目标","℃"));
        map.put("se_lengningqianyanshi", ByteField.Init(new SettingField(), "se_lengningqianyanshi", 1119, 2, "冷凝前延时","s"));
        map.put("se_lengninghouyanshi", ByteField.Init(new SettingField(), "se_lengninghouyanshi", 1121, 2, "冷凝后延时","s"));
        map.put("se_xieyashangxian", ByteField.Init(new SettingField(), "se_xieyashangxian", 1123, 2, "泄压上限","MPa",100));
        map.put("se_xieyaxiaxian", ByteField.Init(new SettingField(), "se_xieyaxiaxian", 1125, 2, "泄压下限","MPa",100));
        map.put("se_jishuibaojingyali", ByteField.Init(new SettingField(), "se_jishuibaojingyali", 1127, 2, "给水报警压力","MPa",100));
        map.put("se_zhenkongbaojingyali", ByteField.Init(new SettingField(), "se_zhenkongbaojingyali", 1129, 2, "真空报警压力","KPa"));
        map.put("se_zhenkongyalishangxian", ByteField.Init(new SettingField(), "se_zhenkongyalishangxian", 1131, 2, "真空压力上限","KPa"));
        map.put("se_zhenkongyalixiaxian", ByteField.Init(new SettingField(), "se_zhenkongyalixiaxian", 1133, 2, "真空压力下限","KPa"));
        map.put("se_jinchukoumubiaoyacha", ByteField.Init(new SettingField(), "se_jinchukoumubiaoyacha", 1135, 2, "进出口目标压差","MPa",100));
        map.put("se_jienengqichuyanchaowen", ByteField.Init(new SettingField(), "se_jienengqichuyanchaowen", 1137, 2, "节能器出烟超温","℃"));
        map.put("se_lengningqichuyanchaowen", ByteField.Init(new SettingField(), "se_lengningqichuyanchaowen", 1139, 2, "冷凝器出烟超温","℃"));
        map.put("se_jinshuitingluwendu", ByteField.Init(new SettingField(), "se_jinshuitingluwendu", 1141, 2, "进水停炉温度","℃"));
        map.put("se_youwenbaohuwendu", ByteField.Init(new SettingField(), "se_youwenbaohuwendu", 1143, 2, "油温保护温度","℃"));
        map.put("se_youwenshangxianwendu", ByteField.Init(new SettingField(), "se_youwenshangxianwendu", 1145, 2, "油温上限温度","℃"));
        map.put("se_youwenzhongxianwendu", ByteField.Init(new SettingField(), "se_youwenzhongxianwendu", 1147, 2, "油温中限温度","℃"));
        map.put("se_gaowenbaohuwendu", ByteField.Init(new SettingField(), "se_gaowenbaohuwendu", 1149, 2, "高温保护温度","℃"));
        map.put("se_wenchabaohuwendu", ByteField.Init(new SettingField(), "se_wenchabaohuwendu", 1151, 2, "温差保护温度","℃"));
        map.put("se_jinkoutingluwendu", ByteField.Init(new SettingField(), "se_jinkoutingluwendu", 1153, 2, "进口停炉温度","℃"));
        map.put("se_jinkoumubiaowendu", ByteField.Init(new SettingField(), "se_jinkoumubiaowendu", 1155, 2, "进口目标温度","℃"));
        map.put("se_jinkouqiluhuicha", ByteField.Init(new SettingField(), "se_jinkouqiluhuicha", 1157, 2, "进口启炉回差","℃"));
        map.put("se_youwenxiaxianwendu", ByteField.Init(new SettingField(), "se_youwenxiaxianwendu", 1159, 2, "油温下限温度","℃"));
        map.put("se_huanrekaibengwendu", ByteField.Init(new SettingField(), "se_huanrekaibengwendu", 1161, 2, "换热开泵温度","℃"));
        map.put("se_huanreguanbengwendu", ByteField.Init(new SettingField(), "se_huanreguanbengwendu", 1163, 2, "换热关泵温度","℃"));
        map.put("se_xitongkaibengwendu", ByteField.Init(new SettingField(), "se_xitongkaibengwendu", 1165, 2, "系统开泵温度","℃"));
        map.put("se_xitongguanbengwendu", ByteField.Init(new SettingField(), "se_xitongguanbengwendu", 1167, 2, "系统关泵温度","℃"));

        //后120个设置参数01030000007845E8
        map.put("se_zhengqihuicha", ByteField.Init(new SettingField(), "se_zhengqihuicha", 1174, 2, "蒸汽回差","℃"));
        map.put("se_dibaojingyewei", ByteField.Init(new SettingField(), "se_dibaojingyewei", 1176, 2, "低报警液位","mm"));
        map.put("se_gaobaojingyewei", ByteField.Init(new SettingField(), "se_gaobaojingyewei", 1178, 2, "高报警液位","mm"));
        map.put("se_cainuantingluwendu", ByteField.Init(new SettingField(), "se_cainuantingluwendu", 1180, 2, "采暖停炉温度","mm"));
        map.put("se_cainuanqiluwendu", ByteField.Init(new SettingField(), "se_cainuanqiluwendu", 1182, 2, "采暖启炉温度","mm"));
        //12个启停信息01030580000C44EB
        map.put("st_qidongshijian1_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian1_shifen_", 1419, 2, "启动时间1（时 分）"));
        map.put("st_tingzhishijian1_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian1_shifen_", 1421, 2, "停止时间1（时 分）"));
        map.put("st_qidongshijian2_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian2_shifen_", 1423, 2, "启动时间2（时 分）"));
        map.put("st_tingzhishijian2_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian2_shifen_", 1425, 2, "停止时间2（时 分）"));
        map.put("st_qidongshijian3_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian3_shifen_", 1427, 2, "启动时间3（时 分）"));
        map.put("st_tingzhishijian3_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian3_shifen_", 1429, 2, "停止时间3（时 分）"));
        map.put("st_qidongshijian4_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian4_shifen_", 1431, 2, "启动时间4（时 分）"));
        map.put("st_tingzhishijian4_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian4_shifen_", 1433, 2, "停止时间4（时 分）"));
        map.put("st_qidongshijian5_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian5_shifen_", 1435, 2, "启动时间5（时 分）"));
        map.put("st_tingzhishijian5_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian5_shifen_", 1437, 2, "停止时间5（时 分）"));
        map.put("st_qidongshijian6_shifen_", ByteField.Init(new StartStopField(), "st_qidongshijian6_shifen_", 1439, 2, "启动时间6（时 分）"));
        map.put("st_tingzhishijian6_shifen_", ByteField.Init(new StartStopField(), "st_tingzhishijian6_shifen_", 1441, 2, "停止时间6（时 分）"));
        //80设备点位0103080000504796
        map.put("de_ranshaoqi", ByteField.Init(new DeviceField(), "de_ranshaoqi", 1448, 2,  "燃烧器",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_jiarezu", ByteField.Init(new DeviceField(), "de_jiarezu", 1450, 2,  "加热组",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_bushuibeng", ByteField.Init(new DeviceField(), "de_bushuibeng", 1452, 2,  "补水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_jishuibeng", ByteField.Init(new DeviceField(), "de_jishuibeng", 1454, 2,  "给水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_buyoubeng", ByteField.Init(new DeviceField(), "de_buyoubeng", 1456, 2,  "补油泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_xunhuanbeng", ByteField.Init(new DeviceField(), "de_xunhuanbeng", 1458, 2,  "循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_lengningbeng", ByteField.Init(new DeviceField(), "de_lengningbeng", 1460, 2,  "冷凝泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_reshuibeng", ByteField.Init(new DeviceField(), "de_reshuibeng", 1462, 2,  "热水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_zhenkongbeng", ByteField.Init(new DeviceField(), "de_zhenkongbeng", 1464, 2,  "真空泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_ecixunhuanbeng", ByteField.Init(new DeviceField(), "de_ecixunhuanbeng", 1466, 2,  "二次循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_yinfengji", ByteField.Init(new DeviceField(), "de_yinfengji", 1468, 2,  "引风机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_gufengji", ByteField.Init(new DeviceField(), "de_gufengji", 1470, 2,  "鼓风机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_lupai", ByteField.Init(new DeviceField(), "de_lupai", 1472, 2,  "炉排",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_chuzhaji", ByteField.Init(new DeviceField(), "de_chuzhaji", 1474, 2,  "出渣机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_ecigufengji", ByteField.Init(new DeviceField(), "de_ecigufengji", 1476, 2,  "二次鼓风机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_dianhuoqi", ByteField.Init(new DeviceField(), "de_dianhuoqi", 1478, 2,  "点火器",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_shangmeiji", ByteField.Init(new DeviceField(), "de_shangmeiji", 1480, 2,  "上煤机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_songliaoji", ByteField.Init(new DeviceField(), "de_songliaoji", 1482, 2,  "送料机",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_jiayaobeng", ByteField.Init(new DeviceField(), "de_jiayaobeng", 1484, 2,  "加药泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_paiwufa", ByteField.Init(new DeviceField(), "de_paiwufa", 1486, 2,  "排污阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu1xunhuanbeng", ByteField.Init(new DeviceField(), "de_huilu1xunhuanbeng", 1488, 2,  "回路1循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu2xunhuanbeng", ByteField.Init(new DeviceField(), "de_huilu2xunhuanbeng", 1490, 2,  "回路2循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu3xunhuanbeng", ByteField.Init(new DeviceField(), "de_huilu3xunhuanbeng", 1492, 2,  "回路3循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu4xunhuanbeng", ByteField.Init(new DeviceField(), "de_huilu4xunhuanbeng", 1494, 2,  "回路4循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huilu5xunhuanbeng", ByteField.Init(new DeviceField(), "de_huilu5xunhuanbeng", 1496, 2,  "回路5循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_cainuanxunhuanbeng", ByteField.Init(new DeviceField(), "de_cainuanxunhuanbeng", 1498, 2,  "采暖循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_reshuixunhuanbeng", ByteField.Init(new DeviceField(), "de_reshuixunhuanbeng", 1500, 2,  "热水循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_paiqifa", ByteField.Init(new DeviceField(), "de_paiqifa", 1502, 2,  "排汽阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_xieyafa", ByteField.Init(new DeviceField(), "de_xieyafa", 1504, 2,  "泄压阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_zhenkongfa", ByteField.Init(new DeviceField(), "de_zhenkongfa", 1506, 2,  "真空阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_pangtongfa", ByteField.Init(new DeviceField(), "de_pangtongfa", 1508, 2,  "旁通阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_churexunhuanbeng", ByteField.Init(new DeviceField(), "de_churexunhuanbeng", 1510, 2,  "储热循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huanrexunhuanbeng", ByteField.Init(new DeviceField(), "de_huanrexunhuanbeng", 1512, 2,  "换热循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_xitongxunhuanbeng", ByteField.Init(new DeviceField(), "de_xitongxunhuanbeng", 1514, 2,  "系统循环泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_churebushuibeng", ByteField.Init(new DeviceField(), "de_churebushuibeng", 1516, 2,  "储热补水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_yandaodiefa", ByteField.Init(new DeviceField(), "de_yandaodiefa", 1518, 2,  "烟道蝶阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_huishuibeng", ByteField.Init(new DeviceField(), "de_huishuibeng", 1520, 2,  "回水泵",CTL_NJZJ_Common_ValueMaps.coms_device));
        map.put("de_santongfa", ByteField.Init(new DeviceField(), "de_santongfa", 1522, 2,  "三通阀",CTL_NJZJ_Common_ValueMaps.coms_device));
        //其他
    }
}
