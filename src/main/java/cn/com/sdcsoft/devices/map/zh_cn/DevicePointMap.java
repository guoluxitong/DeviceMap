package cn.com.sdcsoft.devices.map.zh_cn;

import java.util.HashMap;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap extends cn.com.sdcsoft.devices.map.DevicePointMap{

    public  DevicePointMap(){
    }
    static {
        coms_media = new HashMap<Integer, String>() {{
            put(0, "热水");
            put(1, "蒸汽");
            put(2, "导热油");
            put(3, "热风");
            put(4, "真空");
        }};
        coms_power = new HashMap<Integer, String>() {{
            put(0, "油气");
            put(1, "电");
            put(2, "煤");
            put(3, "生物质");
            put(30, "余热");
        }};
    }

    public static HashMap<Integer, String> coms_level = new HashMap<Integer, String>() {{
        put(0, "缺水");
        put(1, "低报警");
        put(2, "低位");
        put(3, "正常");
        put(4, "高位");
        put(5, "超高位");
        put(6, "逻辑错");
    }};
    public static HashMap<Integer, String> coms_open_close = new HashMap<Integer, String>() {
        {
            put(0, "关");
            put(1, "开");
        }
    };
    public static HashMap<Integer, String> coms_start_stop = new HashMap<Integer, String>() {{
        put(0, "停");
        put(1, "启");
    }};

    public static class PLC_Common_ValueMaps {
        public static HashMap<Integer, String> coms_status = new HashMap<Integer, String>() {
            {
                put(0, "待命");
                put(1, "运行");
                put(2, "报警");
            }
        };
        public static HashMap<Integer, String> coms_atuo = new HashMap<Integer, String>() {{
            put(0, "自");
            put(1, "手");
        }};
        public static HashMap<Integer, String> coms_ranshaoqi_status = new HashMap<Integer, String>() {{
            put(0, "停");
            put(1, "运行");
            put(2, "大火");
        }};
    }

    public static class CTL_NJZJ_Common_ValueMaps {
        public static HashMap<Integer, String> coms_status = new HashMap<Integer, String>() {
            {
                put(0, "关机");
                put(1, "待机");
                put(2, "运行");
                put(3, "报警");
            }
        };

        public static HashMap<Integer, String> coms_ranshaoqi_status = new HashMap<Integer, String>() {{
            put(0, "停");
            put(1, "小火");
            put(2, "大火");
        }};


        public static HashMap<Integer, String> coms_yalistatus = new HashMap<Integer, String>() {{
            put(0, "常压");
            put(1, "低压");
            put(2, "中压");
            put(3, "高压");
            put(4, "超压");
        }};
        public static HashMap<Integer, String> coms_device = new HashMap<Integer, String>() {{
            put(0xC0, "手");
            put(0x3F, "自");
            put(0x30, "备");
            put(0xCF, "主");
            put(0x0F, "启");
            put(0xF0, "停");
        }};
    }

    public static class CTL_NJRT_Common_ValueMaps {
        public static HashMap<Integer, String> coms_status = new HashMap<Integer, String>() {
            {
                put(0, "待机");
                put(1, "报警");
                put(2, "运行");
                put(3, "关机");
            }
        };

        public static HashMap<Integer, String> coms_atuo = new HashMap<Integer, String>() {{
            put(0, "自");
            put(1, "手");
        }};
        public static HashMap<Integer, String> coms_master = new HashMap<Integer, String>() {{
            put(0, "主");
            put(1, "备");
        }};
        public static HashMap<Integer, String> coms_ranshaoqi_status = new HashMap<Integer, String>() {{
            put(0, "小火");
            put(1, "大火");
        }};
    }
}
