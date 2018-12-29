package cn.com.sdcsoft.devices.entity;

import cn.com.sdcsoft.devices.SdcSoftDevice;

import java.io.Serializable;


public class OpenCloseCommand extends IntCommand implements Serializable {
    public OpenCloseCommand(SdcSoftDevice device) {
        super(device);
        this.valueType = OPEN_CLOSE_VALUE;
        maxValue = 1;
        minValue = 0;
        valueIsSet  = true;
    }

    @Override
    public void handleValue(Object... values) {
        Integer i = (Integer)values[0];
        if(i>0){
            super.handleValue(i);
        }else {
            super.handleValue(0);
        }
    }
}
