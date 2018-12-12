package cn.com.sdcsoft.devices.map.zh_cn;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.*;

import static cn.com.sdcsoft.devices.map.zh_cn.DevicePointMap.CTL_NJRT_Common_ValueMaps.*;

/**
 * Created by 田斌 on 2018/12/10 0010.
 */
public class DevicePointMap_CTL_NJRT_H1_RanYouZhengQi extends DevicePointMap {
    public static final String Key = "CTL_NJRT_H1_RanYouZhengQi";
    public  DevicePointMap_CTL_NJRT_H1_RanYouZhengQi(){
        /**
         * 计算属性（不显示）
         */
        map.put("_addshuibeng", ByteField.Init(new BaseInfoField(), "_addshuibeng", 0, 0, "给水泵", false));
        //BaseInfoField
        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "系统状态",CTL_NJRT_Common_ValueMaps.coms_status));

        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "累计燃烧时间"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 0, 0, "运行天数", "天"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 0, 0, "运行小时数", "时"));

        map.put(SdcSoftDevice.KEY_POINT_POWER,
                ByteField.Init(new cn.com.sdcsoft.devices.meta.CTL_NJRT.e3.PowerField(), SdcSoftDevice.KEY_POINT_POWER, 0, 0, "燃料类型", DevicePointMap.coms_power));

        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new cn.com.sdcsoft.devices.meta.CTL_NJRT.e3.MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 1, 0, "介质类型", DevicePointMap.coms_media));
        //DeviceField
        map.put("oc_jishuibengzhubei", ByteField.Init(new DeviceField(), "oc_jishuibengzhubei", 49, 2, "给水泵主备",0,coms_master));
        map.put("oc_jishuibengshouzi", ByteField.Init(new DeviceField(), "oc_jishuibengshouzi", 49, 2, "给水泵手自",1,
                coms_atuo));
        //OpenCloseField
        map.put("oc_1_addshuibeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_1_addshuibeng_start_stop", 7, 2,  "给水泵主控制",3,coms_open_close));
        map.put("oc_2_addshuibeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_2_addshuibeng_start_stop", 7, 2, "给水泵备控制", 4, coms_open_close));

        map.put("oc_jixiandishuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_jixiandishuiweibaojingdianji", 5, 2, "极限低水位报警电极",0,coms_open_close));
        map.put("oc_dishuiweibaojingdianji(6dianjiteyou)", ByteField.Init(new OpenCloseField(), "oc_dishuiweibaojingdianji(6dianjiteyou)", 5, 2, "低水位报警电极(6电极特有)",1,coms_open_close));
        map.put("oc_dishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_dishuiweidianji", 5, 2, "低水位电极",2,coms_open_close));
        map.put("oc_zhongshuiweidianji(6dianjiteyou)", ByteField.Init(new OpenCloseField(), "oc_zhongshuiweidianji(6dianjiteyou)", 5, 2, "中水位电极(6电极特有)",3,coms_open_close));
        map.put("oc_gaoshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweidianji", 5, 2, "高水位电极",4,coms_open_close));
        map.put("oc_gaoshuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojingdianji", 5, 2, "高水位报警电极",5,coms_open_close));
        map.put("oc_bianpinqiguzhangbaojing", ByteField.Init(new OpenCloseField(), "oc_bianpinqiguzhangbaojing", 5, 2, "变频器故障报警",6,coms_open_close));
        map.put("oc_fuhediaojiekongzhi(yalikongzhiqifangshi)", ByteField.Init(new OpenCloseField(), "oc_fuhediaojiekongzhi(yalikongzhiqifangshi)", 5, 2, "负荷调节控制(压力控制器方式)",7,coms_open_close));
        map.put("oc_qitingkongzhi(yalikongzhiqifangshi)", ByteField.Init(new OpenCloseField(), "oc_qitingkongzhi(yalikongzhiqifangshi)", 5, 2, "启停控制(压力控制器方式)",8,coms_open_close));
        map.put("oc_chaoyabaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojingxinhao", 5, 2, "超压报警信号",9,coms_open_close));
        map.put("oc_ranshaoqiguzhangxinhao", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiguzhangxinhao", 5, 2, "燃烧器故障信号",10,coms_open_close));
        map.put("oc_ranqiyaliyichangbaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_ranqiyaliyichangbaojingxinhao", 5, 2, "燃气压力异常报警信号",11,coms_open_close));
        map.put("oc_ranqixieloubaojingxinhao", ByteField.Init(new OpenCloseField(), "oc_ranqixieloubaojingxinhao", 5, 2, "燃气泄漏报警信号",12,coms_open_close));
        map.put("oc_ranshaoqiqitingkongzhi", ByteField.Init(new OpenCloseField(), "oc_ranshaoqiqitingkongzhi", 7, 2, "燃烧器启停控制",0,coms_open_close));
        map.put("oc_ranshaoqifuhediaojie/zengdadiaojie", ByteField.Init(new OpenCloseField(), "oc_ranshaoqifuhediaojie", 7, 2, "燃烧器负荷调节/增大调节",1,coms_open_close));
        map.put("oc_jianxiaodiaojie", ByteField.Init(new OpenCloseField(), "oc_jianxiaodiaojie", 7, 2, "减小调节",2,coms_open_close));
        map.put("oc_jishuibengkongzhi(zhu)", ByteField.Init(new OpenCloseField(), "oc_jishuibengkongzhi(zhu)", 7, 2, "给水泵控制(主)",3));
        map.put("oc_jishuibengkongzhi(bei)", ByteField.Init(new OpenCloseField(), "oc_jishuibengkongzhi(bei)", 7, 2, "给水泵控制(备)",4));
        map.put("oc_baojingzhuangtaishuchu", ByteField.Init(new OpenCloseField(), "oc_baojingzhuangtaishuchu", 7, 2, "报警状态输出",6));

        //ExceptionField
        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "极限低水位报警",0));
        map.put("ex_zhengqiyalibiansongqicut", ByteField.Init(new ExceptionField(), "ex_zhengqiyalibiansongqiduanlu", 45, 2, "蒸汽压力变送器断路",1));
        map.put("ex_zhengqiyalibiansongqishort", ByteField.Init(new ExceptionField(), "ex_zhengqiyalibiansongqiduanlu", 45, 2, "蒸汽压力变送器短路",2));
        map.put("ex_chaoyabaojing_biansongqi_", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_biansongqi_", 45, 2, "超压报警（变送器）",3));
        map.put("ex_paiyanwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwendugaobaojing", 45, 2, "排烟温度高报警",4));
        map.put("ex_chaoyabaojing(kongzhiqi)", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing(kongzhiqi)", 45, 2, "超压报警(控制器)",5));
        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 45, 2, "燃烧器故障",6));
        map.put("ex_ranqiyalidi", ByteField.Init(new ExceptionField(), "ex_ranqiyalidi", 45, 2, "燃气压力低",7));
        map.put("ex_ranqixieloubaojing", ByteField.Init(new ExceptionField(), "ex_ranqixieloubaojing", 45, 2, "燃气泄漏报警",8));
        map.put("ex_shuiweidianjiluojicuo", ByteField.Init(new ExceptionField(), "ex_shuiweidianjiluojicuo", 45, 2, "水位电极逻辑错",9));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "高水位报警",10));
        map.put("ex_paiyanwenduchuanganqicut", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqicut", 45, 2, "排烟温度传感器断路",11));
        map.put("ex_dishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_dishuiweibaojing", 45, 2, "低水位报警",12));
        map.put("ex_bianpinqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_bianpinqiguzhangbaojing", 45, 2, "变频器故障报警",13));
        map.put("ex_shuiweichuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiduanlu", 45, 2, "水位传感器断路",14));
        map.put("ex_shuiweichuanganqiduanlu", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiduanlu", 45, 2, "水位传感器短路",15));
        map.put("ex_jixiandishuiweibaojing4-20mA", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing4-20mA", 47, 2, "极限低水位报警4-20mA",0));
        map.put("ex_gaoshuiweibaojing4-20mA", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing4-20mA", 47, 2, "高水位报警4-20mA",1));

        //MockField

        map.put("mo_paiyanwendu", ByteField.Init(new MockField(), "mo_paiyanwendu", 19, 2, "排烟温度", "℃"));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 21, 2, "蒸汽压力","Mpa"));

        map.put("mo_4-20mAxinhaolianxujishui", ByteField.Init(new MockField(), "mo_4-20mAxinhaolianxujishui", 23, 2, "4-20mA信号连续给水"));
    }
}
