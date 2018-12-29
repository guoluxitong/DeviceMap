package cn.com.sdcsoft.devices.meta.CTL_NJZJ_485;

import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.TimeCommand;

import java.math.BigInteger;

/**
 * Created by jialiang on 2018/4/20.
 */

public class StartStopField extends cn.com.sdcsoft.devices.meta.StartStopField {

    @Override
    public boolean haveValue(byte... bytes) {
        value = new BigInteger(bytes).intValue();
        return 0x7FFF != value;
    }

    @Override
    public String getValueString() {
        return String.format("%02d:%02d",value / 60,value % 60);
    }

    @Override
    public Command getCommand()  {
        TimeCommand cmd = new TimeCommand();
        cmd.setAddress(this.address);
        cmd.setMaxValue(this.maxValue);
        cmd.setMinValue(this.minValue);
        cmd.initValue(value / 60,value % 60);
        cmd.setTitle(this.getTitle());
        return cmd;
    }
}
