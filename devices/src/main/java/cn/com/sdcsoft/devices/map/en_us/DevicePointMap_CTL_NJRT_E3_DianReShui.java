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

public class DevicePointMap_CTL_NJRT_E3_DianReShui extends DevicePointMap {
    public static final String Key = "CTL_NJRT_E3_DianReShui";


    public DevicePointMap_CTL_NJRT_E3_DianReShui() {
        /**
         * 计算属性（不显示）
         */
        map.put("_jiarezu", ByteField.Init(new BaseInfoField(), "_jiarezu", 0, 0, "Heating Block ", false));
        map.put("_addshuibeng", ByteField.Init(new BaseInfoField(), "_addshuibeng", 0, 0, "Water Feeding Pump", false));

        map.put(SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_SYSTEM_STATUS, 3, 2, "System State", CTL_NJRT_Common_ValueMaps.coms_status));

        map.put(SdcSoftDevice.KEY_POINT_RUN_LIFE, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_LIFE, 21, 2, "Running Time"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_DAYS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_DAYS, 0, 0, "Running Days", "Day"));

        map.put(SdcSoftDevice.KEY_POINT_RUN_HOURS, ByteField.Init(new BaseInfoField(), SdcSoftDevice.KEY_POINT_RUN_HOURS, 0, 0, "Running Hours", "Hour"));

        map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new cn.com.sdcsoft.devices.meta.CTL_NJRT.e3.PowerField(), SdcSoftDevice.KEY_POINT_POWER, 1, 0, "Fuel Type", DevicePointMap.coms_power));

        map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new cn.com.sdcsoft.devices.meta.CTL_NJRT.e3.MediaField(), SdcSoftDevice.KEY_POINT_MEDIA, 0, 0, "Medium Type", DevicePointMap.coms_media));


        map.put("oc_jixiandishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_jixiandishuiweidianji", 4, 2, "极限低水位电极", 0, coms_open_close));
        map.put("oc_dishuiweidianji", ByteField.Init(new OpenCloseField(), "oc_dishuiweidianji", 4, 2, "低水位电极", 1, coms_open_close));
        map.put("oc_gaoshuiweidianji", ByteField.Init(new OpenCloseField(), "oc_gaoshuiweidianji", 4, 2, "高水位电极", 2, coms_open_close));
        map.put("oc_lubichaowenkaiguan", ByteField.Init(new OpenCloseField(), "oc_lubichaowenkaiguan", 4, 2, "炉壁超温开关", 6, coms_open_close));
        map.put("oc_chaoyabaojing", ByteField.Init(new OpenCloseField(), "oc_chaoyabaojing", 5, 2, "超压报警", 1, coms_open_close));
        map.put("oc_baojingshuchu", ByteField.Init(new OpenCloseField(), "oc_baojingshuchu", 6, 2, "报警输出", 0, coms_open_close));
        map.put("oc_bushuibengkongzhi", ByteField.Init(new OpenCloseField(), "oc_bushuibengkongzhi", 6, 2, "补水泵控制", 1, coms_open_close));
        map.put("oc_xunhuanbengkongzhi", ByteField.Init(new OpenCloseField(), "oc_xunhuanbengkongzhi", 6, 2, "循环泵控制", 2, coms_open_close));
        map.put("oc_jiarezu1kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu1kongzhi", 6, 2, "加热组1控制", 3, coms_open_close));
        map.put("oc_jiarezu2kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu2kongzhi", 6, 2, "加热组2控制", 4, coms_open_close));
        map.put("oc_jiarezu3kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu3kongzhi", 6, 2, "加热组3控制", 5, coms_open_close));
        map.put("oc_jiarezu4kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu4kongzhi", 6, 2, "加热组4控制", 6, coms_open_close));
        map.put("oc_jiarezu5kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu5kongzhi", 6, 2, "加热组5控制", 7, coms_open_close));
        map.put("oc_jiarezu6kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu6kongzhi", 6, 2, "加热组6控制", 0, coms_open_close));
        map.put("oc_jiarezu7kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu7kongzhi", 6, 2, "加热组7控制", 1, coms_open_close));
        map.put("oc_jiarezu8kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu8kongzhi", 6, 2, "加热组8控制", 2, coms_open_close));
        map.put("oc_jiarezu9kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu9kongzhi", 6, 2, "加热组9控制", 3, coms_open_close));
        map.put("oc_jiarezu10kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu10kongzhi", 6, 2, "加热组10控制", 4, coms_open_close));
        map.put("oc_jiarezu11kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu11kongzhi", 6, 2, "加热组11控制", 5, coms_open_close));
        map.put("oc_jiarezu12kongzhi", ByteField.Init(new OpenCloseField(), "oc_jiarezu12kongzhi", 6, 2, "加热组12控制", 6, coms_open_close));
        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 8, 2, "出水温度", "℃"));
        map.put("mo_huishuiwendu", ByteField.Init(new MockField(), "mo_huishuiwendu", 9, 2, "回水温度", "℃"));


        map.put("ex_chushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiguzhang", 24, 2, "出水温度传感器故障", 0));
        map.put("ex_chushuiwendugaobaojing", ByteField.Init(new ExceptionField(), "ex_chushuiwendugaobaojing", 24, 2, "出水温度高报警", 1));
        map.put("ex_huishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiwenduchuanganqiguzhang", 24, 2, "回水温度传感器故障", 2));
        map.put("ex_jixiandishuiweibaojing", ByteField.Init(new ExceptionField(), "ex_jixiandishuiweibaojing", 24, 2, "极限低水位报警", 3));
        map.put("ex_shuiweichuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shuiweichuanganqiguzhang", 24, 2, "水位传感器故障", 4));
        map.put("ex_chaoyabaojing", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing", 24, 2, "超压报警", 5));
        map.put("ex_lubichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_lubichaowenbaojing", 24, 2, "炉壁超温报警", 6));
        map.put("ex_xitongguzhang", ByteField.Init(new ExceptionField(), "ex_xitongguzhang", 24, 2, "系统故障", 7));

    }
}
