package cn.com.sdcsoft.devices.map.en_us;

import java.util.HashMap;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap extends cn.com.sdcsoft.devices.map.DevicePointMap {
    public  DevicePointMap(){
        commandsMapKeys.add("System Control");
        commandsMapKeys.add("Parameter Setting");
    }
    static {
        coms_media = new HashMap() {{
            put(0, "Hot Water");
            put(1, "Steam");
            put(2, "Heat conduction Oil");
            put(3, "Hot Air");
            put(4, "Vacuum");
        }};
        coms_power = new HashMap() {{
            put(0, "Associated Gas");
            put(1, "Electric");
            put(2, "Coal");
            put(3, "Biomass");
            put(30, "余热");
        }};
    }
    public static HashMap<Integer, String> coms_level = new HashMap() {{
        put(0, "Water Shortage");
        put(1, "Low Alarm");
        put(2, "Low Position");
        put(3, "Normal");
        put(4, "High Position");
        put(5, "Super High");
        put(6, "Logic Error");
    }};
    public static HashMap<Integer, String> coms_open_close = new HashMap() {
        {
            put(0, "Close");
            put(1, "Open");
        }
    };
    public static HashMap<Integer, String> coms_start_stop = new HashMap() {{
        put(0, "Stop");
        put(1, "Start");
    }};

    public static class PLC_Common_ValueMaps {
        public static HashMap<Integer, String> coms_status = new HashMap() {
            {
                put(0, "Standby");
                put(1, "Working");
                put(2, "Alarm");
            }
        };
        public static HashMap<Integer, String> coms_atuo = new HashMap() {{
            put(0, "Automatic");
            put(1, "Manual");
        }};
        public static HashMap<Integer, String> coms_ranshaoqi_status = new HashMap() {{
            put(0, "Stop");
            put(1, "Working");
            put(2, "Big Fire");
        }};
    }

    public static class CTL_NJZJ_Common_ValueMaps {
        public static HashMap<Integer, String> coms_status = new HashMap() {
            {
                put(0, "Off ");
                put(1, "Standby");
                put(2, "Working");
                put(3, "Alarm");
            }
        };

        public static HashMap<Integer, String> coms_ranshaoqi_status = new HashMap() {{
            put(0, "Stop");
            put(1, "Small Fire");
            put(2, "Big Fire");
        }};


        public static HashMap<Integer, String> coms_yalistatus = new HashMap() {{
            put(0, "Atmospheric Pressure");
            put(1, "low Pressure");
            put(2, "Medium Voltage");
            put(3, "High Pressure");
            put(4, "Overpressure");
        }};
        public static HashMap<Integer, String> coms_device = new HashMap() {{
            put(0xC0, "Manual");
            put(0x3F, "Automatic");
            put(0x30, "prepare");
            put(0xCF, "Main");
            put(0x0F, "Opening");
            put(0xF0, "Stop");
        }};
    }

    public static class CTL_NJRT_Common_ValueMaps {
        public static HashMap<Integer, String> coms_status = new HashMap() {
            {
                put(0, "Standby");
                put(1, "Alarm");
                put(2, "Working");
                put(3, "Off");
            }
        };

        public static HashMap<Integer, String> coms_atuo = new HashMap() {{
            put(0, "Automatic");
            put(1, "Manual");
        }};
        public static HashMap<Integer, String> coms_master = new HashMap() {{
            put(0, "Main");
            put(1, "Prepare");
        }};
        public static HashMap<Integer, String> coms_ranshaoqi_status = new HashMap() {{
            put(0, "Small Fire");
            put(1, "Big Fire");
        }};
    }
}
