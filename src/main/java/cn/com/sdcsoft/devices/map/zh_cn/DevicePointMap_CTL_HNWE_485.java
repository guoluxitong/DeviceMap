package cn.com.sdcsoft.devices.map.zh_cn;

import cn.com.sdcsoft.devices.Device_CTL_HNWE;
import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_HNWE.*;
import cn.com.sdcsoft.devices.meta.CountField;
import cn.com.sdcsoft.devices.meta.CountShowField;
import cn.com.sdcsoft.devices.meta.FixedValueField;

import java.util.HashMap;

import static cn.com.sdcsoft.devices.SdcSoftDevice.KEY_POINT_SYSTEM_STATUS;

//命令：1.0104000000053009
//      2.0103020000030473
//      3 .0104030000093048
//      4.010305000002c4c7
public class DevicePointMap_CTL_HNWE_485 extends DevicePointMap {
    static final String Commands_Key_Parameters_Setting = "参数设置";
    static final String Commands_Key_System_Ctl = "系统控制";
   public DevicePointMap_CTL_HNWE_485(){

       commandsMap.put(Commands_Key_Parameters_Setting,null);
       commandsMap.put(Commands_Key_System_Ctl,null);

       HashMap<Integer, String> coms_status = new HashMap() {
           {
               put(0, "待机");
               put(1, "Test mode 测试模式");
               put(2, "DHW/CH init");
               put(3, "DHW/CH 模式");
               put(4, "DHW/CH cool 模式");
               put(5, "DHW/CH防冻模式");
               put(6, "DHW初始化");
               put(7, "DHW模式");
               put(8, "DHW cool 模式");
               put(9, "CH init");
               put(10, "CH 模式");
               put(11, "CH cool");
               put(12, "防冻模式");
           }
       };

       HashMap<Integer, String> coms_error = new HashMap() {
           {
               put(0, "Esys控制器");
               put(1, "显示板");
           }
       };

       HashMap<Integer, String> coms_biaozhi = new HashMap() {
           {
               put(0, "阻塞");
               put(1, "锁定");
           }
       };
       HashMap<Integer, String> coms_xuqiu = new HashMap() {
           {
               put(0, "检测到CH或测试的加热需求");
               put(1, "没有CH或测试的加热需求");
           }
       };
       HashMap<Integer, String> coms_ExceptionField = new HashMap() {
           {
               put(1, "点火失败");
               put(2, "假火焰信号");
               put(3, "温度超上限");
               put(4, "APS错误");
               put(5, "没有收到风机的的转速信号");
               put(6, "APS错误");
               put(7, "TTB（排放保护）激活");
               put(8, "火检电路错误");
               put(9, "阀门驱动电路错误");
               put(12, "内部控制错误");
               put(13, "远程复位错误");
               put(15, "漂移测试错误");
               put(16, "供水传感器的固定错误");
               put(17, "回水传感器的固定错误");
               put(18, "传感器损坏测试");
               put(21, "内部控制错误");
               put(25, "内部控制错误");
               put(30, "CH传感器短路");
               put(31, "CH传感器开路");
               put(32, "DHW传感器短路");
               put(33, "DHW传感器开路");
               put(34, "供电过低");
               put(37, "水压过低");
               put(43, "CH回水传感器短路");
               put(44, "CH回水传感器开路");
               put(45, "TTB传感器短路");
               put(46, "TTB传感器开路");
               put(47, "水压传感器未接或损坏");
               put(76, "外部限制断开");
               put(77, "虹吸管输入错误");
               put(80, "供水-回水传感器接反");
               put(81, "漂移测试警告");
               put(82, "热交换器传感器短路");
               put(83, "热交换器传感器开路");
               put(84, "热交换器上限");
               put(87, "超温错误");
               put(89, "不正确的参数设置");
               put(90, "DSP和Maxsys的固件不匹配");
               put(91, "级联传感器短路");
               put(92, "级联传感器开路");
               put(93, "室外温度传感器短路");
               put(94, "DSP内部错误");
               put(95, "级联CH供水传感器错误");
               put(96, "室外温度传感器开路");
               put(97, "级联结构不匹配");
               put(98, "DSP之间的通讯错误");
               put(99, "DSP与Msxsys之间的通讯错误");
           }
       };
       map.put(SdcSoftDevice.KEY_POINT_POWER, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_POWER, "燃料类型", 0, DevicePointMap.coms_power));
       map.put(SdcSoftDevice.KEY_POINT_MEDIA, ByteField.Init(new FixedValueField(), SdcSoftDevice.KEY_POINT_MEDIA, "介质类型", 0, DevicePointMap.coms_media));

       map.put(KEY_POINT_SYSTEM_STATUS, ByteField.Init(new BaseInfoField(), KEY_POINT_SYSTEM_STATUS, 9, 2, "工作状态",coms_status));

       map.put("mo_cuowuyuan", ByteField.Init(new BaseInfoField(), "mo_cuowuyuan", 7, 2, "错误源",coms_error));

       map.put("oc_CHmoshi1", ByteField.Init(new OpenCloseField(), "oc_CHmoshi1", 3, 1, "CH模式",0,coms_open_close));
       map.put("oc_DHWmoshi1", ByteField.Init(new OpenCloseField(), "oc_DHWmoshi1", 3, 1, "DHW模式",1,coms_open_close));
       map.put("oc_ceshimoshi1", ByteField.Init(new OpenCloseField(), "oc_ceshimoshi1", 3, 1, "测试模式",2,coms_open_close));
       map.put("oc_huoyan1", ByteField.Init(new OpenCloseField(), "oc_huoyan1", 3, 1, "火焰",3,coms_open_close));
       map.put("oc_cuowu", ByteField.Init(new OpenCloseField(), "oc_cuowu", 4, 1, "错误",0,coms_open_close));
       map.put("oc_fa1", ByteField.Init(new OpenCloseField(), "oc_fa1", 4, 1, "阀1",1,coms_open_close));
       map.put("oc_fa2", ByteField.Init(new OpenCloseField(), "oc_fa2", 4, 1, "阀2",2,coms_open_close));
       map.put("oc_APS", ByteField.Init(new OpenCloseField(), "oc_APS", 4, 1, "APS",3,coms_open_close));
       map.put("oc_fengji", ByteField.Init(new OpenCloseField(), "oc_fengji", 4, 1, "风机",4,coms_open_close));
       map.put("oc_shuibeng", ByteField.Init(new OpenCloseField(), "oc_shuibeng", 4, 1, "水泵",5,coms_open_close));
       map.put("oc_suoding", ByteField.Init(new OpenCloseField(), "oc_suoding", 5, 1, "错误标志",1,coms_biaozhi));
//
       map.put("oc_OEMcuowuhao", ByteField.Init(new ExceptionField(), "oc_OEMcuowuhao", 6, 1, "报警",coms_ExceptionField));
//
       map.put("mo_jiarexuqiu", ByteField.Init(new DemandField(), "mo_jiarexuqiu", 19, 1, "加热需求",coms_xuqiu));

       map.put("mo_shedingzhi", ByteField.Init(new SettingField(), "mo_shedingzhi", 22, 2, "设定值","",Commands_Key_Parameters_Setting, "0515", 10, 95));
       map.put("mo_CHgongshuiwendu", ByteField.Init(new MockField(), "mo_CHgongshuiwendu", 29, 2, "CH供水温度","℃",10));
       map.put("mo_CHhuishuiwendu", ByteField.Init(new MockField(), "mo_CHhuishuiwendu", 31, 2, "CH回水温度","℃"));
       map.put("de_yanwen", ByteField.Init(new MockField(), "de_yanwen", 35, 2, "烟温","℃"));
       map.put("de_yanwenchuanganqi", ByteField.Init(new DeviceField(), "de_yanwenchuanganqi", 35, 2, "烟温传感器",coms_open_close));
       map.put("mo_OTCwendu", ByteField.Init(new MockField(), "mo_OTCwendu", 37, 2, "OTC温度","℃"));
       map.put("mo_huoyandianliu", ByteField.Init(new MockField(), "mo_huoyandianliu", 41, 2, "火焰电流","uA"));
       map.put("mo_diaojieshuiping", ByteField.Init(new MockField(), "mo_diaojieshuiping", 43, 2, "调节水平"));
       map.put("mo_jisuanhoudeshedingzhi", ByteField.Init(new MockField(), "mo_jisuanhoudeshedingzhi", 45, 2, "计算后的设定值"));
       map.put("mo_CHzuidashedingzhi", ByteField.Init(new SettingField(), "mo_CHzuidashedingzhi", 52, 2, "CH最大设定值","",Commands_Key_Parameters_Setting, "1281", 20, 95));

       map.put("oc_ceshimoshi", ByteField.Init(new OpenCloseField(), "oc_ceshimoshi", 12, 1, "测试模式",coms_open_close));
       map.put("oc_CHmoshi", ByteField.Init(new OpenCloseField(), "oc_CHmoshi", 12, 1, "CH模式",2,coms_open_close));
       map.put("oc_fangdongmoshi", ByteField.Init(new OpenCloseField(), "oc_fangdongmoshi", 12, 1, "防冻模式",3,coms_open_close));
       map.put("oc_huoyan", ByteField.Init(new OpenCloseField(), "oc_huoyan", 12, 1, "火焰",4,coms_open_close));
       map.put("oc_CHbeng", ByteField.Init(new OpenCloseField(), "oc_CHbeng", 12, 1, "CH泵",5,coms_open_close));
       map.put("oc_jilianbeng", ByteField.Init(new OpenCloseField(), "oc_jilianbeng", 12, 1, "级联泵",7,coms_open_close));

   }
}
