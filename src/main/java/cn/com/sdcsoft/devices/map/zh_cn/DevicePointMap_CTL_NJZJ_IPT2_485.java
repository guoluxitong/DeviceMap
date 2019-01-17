package cn.com.sdcsoft.devices.map.zh_cn;

import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJZJ.SettingField;

/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_NJZJ_IPT2_485 extends DevicePointMap_CTL_NJZJ_IP_458 {
    public DevicePointMap_CTL_NJZJ_IPT2_485(){
        map.put("se_jiarezushu", ByteField.Init(new SettingField(), "se_jiarezushu", 1114, 2, "加热组数","组",Commands_Key_Parameters_Setting,"0517",1,30));
    }


}
