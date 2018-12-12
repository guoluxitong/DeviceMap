package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.List;

public class Device_CTL_NJZJ_IPT2_485 extends Device_CTL_NJZJ_IP_485 {
    /**
     * 485数据读取指令
     * 1:基本信息           010306000028455C
     * 2:前120个报警        0103077000784547
     * 3:后120个报警        010307E80078C4A8
     * 4:120个故障信息      010307000078449C
     * 5:前120个模拟量      0103010000784414
     * 6:前120个设置参数    0103050000784524
     * 7:后120个设置参数    01030000007845E8
     * 8:12个启停信息       01030580000C44EB
     * 9:80设备点位         0103080000504796
     * 10:其他
     */
    public Device_CTL_NJZJ_IPT2_485(){
        BYTE_ARRAY_LENGTH = 1749;
    }

}
