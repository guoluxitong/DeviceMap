package cn.com.sdcsoft.devices.meta.CTL_NJZJ_485;

import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.IntCommand;
import cn.com.sdcsoft.devices.entity.SystemCommand;

/**
 * Created by jialiang on 2018/4/19.
 */

public class SystemStatusField extends BaseInfoField {

    @Override
    public Command getCommand() {
        SystemCommand cmd = new SystemCommand();
        cmd.setAddress(this.address);
        cmd.setMaxValue(this.maxValue);
        cmd.setMinValue(this.minValue);
        cmd.initValue(value);
        cmd.setTitle(this.getTitle());
        return cmd;
    }
}
