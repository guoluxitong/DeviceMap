package cn.com.sdcsoft.devices.map.en_us;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.BaseInfoField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.ExceptionField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.MockField;
import cn.com.sdcsoft.devices.meta.CTL_NJRT.OpenCloseField;

/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_NJRT_E3_DianZhengQi extends DevicePointMap {
    public static final String Key = "CTL_NJRT_E3_DianZhengQi";


    public DevicePointMap_CTL_NJRT_E3_DianZhengQi() {
        /**
         * 计算属性（不显示）
         */
        map.put("_jiarezu", ByteField.Init(new BaseInfoField(), "_jiarezu", 0, 0, "加热组", false));
        map.put("_addshuibeng", ByteField.Init(new BaseInfoField(), "_addshuibeng", 0, 0, "给水泵", false));


        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "系统状态", CTL_NJRT_Common_ValueMaps.coms_status));

        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 53, 2, "累计燃烧时间"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 0, 0, "运行天数", "天"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 0, 0, "运行小时数", "时"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new cn.com.sdcsoft.devices.meta.CTL_NJRT.e3.PowerField(), SdcSoftDevice.KEY_POINT_POWER, 1, 0, "燃料类型", DevicePointMap.coms_power));

        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new cn.com.sdcsoft.devices.meta.CTL_NJRT.e3.MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 1, 0, "介质类型", DevicePointMap.coms_media));


        map.put("oc_jixianshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_jixianshuiweidianji", 5, 2, "极限水位电极", 0, DevicePointMap.coms_open_close));
        map.put("oc_dishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_dishuiweidianji", 5, 2, "低水位电极", 1, coms_open_close));
        map.put("oc_gaoshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweidianji", 5, 2, "高水位电极", 2, coms_open_close));
        map.put("oc_gaoshuiweibaojingdianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweibaojingdianji", 5, 2, "高水位报警电极", 3, coms_open_close));
        map.put("oc_chaoyabaojing(kongzhiqi)", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojing(kongzhiqi)", 5, 2, "超压报警（控制器）", 9, coms_open_close));



        map.put("oc_1_addshuibeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_1_addshuibeng_start_stop", 9, 2, "给水泵主控制 ", 0, coms_open_close));
        map.put("oc_2_addshuibeng_start_stop", ByteField.Init(new OpenCloseField(), "oc_2_addshuibeng_start_stop", 9, 2, "给水泵备控制", 1, coms_open_close));
        map.put("oc_baojingshuchu ", ByteField.Init(new OpenCloseField(), "oc_baojingshuchu ", 9, 2, "报警输出", 2, coms_open_close));
        map.put("oc_jiarezu1kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu1kongzhi", 9, 2, "加热组1控制", 4, coms_open_close));
        map.put("oc_jiarezu2kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu2kongzhi", 9, 2, "加热组2控制", 5, coms_open_close));
        map.put("oc_jiarezu3kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu3kongzhi", 9, 2, "加热组3控制", 6, coms_open_close));
        map.put("oc_jiarezu4kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu4kongzhi", 9, 2, "加热组4控制", 7, coms_open_close));
        map.put("oc_jiarezu5kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu5kongzhi", 9, 2, "加热组5控制", 8, coms_open_close));
        map.put("oc_jiarezu6kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu6kongzhi", 9, 2, "加热组6控制", 9, coms_open_close));
        map.put("oc_jiarezu7kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu7kongzhi", 9, 2, "加热组7控制", 10, coms_open_close));
        map.put("oc_jiarezu8kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu8kongzhi", 9, 2, "加热组8控制", 11, coms_open_close));
        map.put("oc_jiarezu9kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu9kongzhi", 9, 2, "加热组9控制", 12, coms_open_close));
        map.put("oc_jiarezu10kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu10kongzhi", 9, 2, "加热组10控制", 13, coms_open_close));
        map.put("oc_jiarezu11kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu11kongzhi", 9, 2, "加热组11控制", 14, coms_open_close));
        map.put("oc_jiarezu12kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu12kongzhi", 9, 2, "加热组12控制", 15, coms_open_close));

        map.put("ex_zhengqichuanganqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_zhengqichuanganqiguzhangbaojing", 45, 2, "蒸汽传感器故障报警", 0));
        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 45, 2, "极限低水位报警", 1));
        map.put("ex_gaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_gaoshuiweibaojing", 45, 2, "高水位报警", 2));
        map.put("ex_shuiweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiguzhang", 45, 2, "水位传感器故障", 3));
        map.put("ex_chaoyabaojing", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing", 45, 2, "超压报警", 4));
        map.put("ex_xitongguzhang", ByteField.Init(new ExceptionField(), "ex_xitongguzhang", 45, 2, "系统故障", 5));


        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 13, 4, "蒸汽压力", "P"));

    }
}
