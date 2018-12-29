package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Command;
import cn.com.sdcsoft.devices.entity.FloatMapCommand;
import cn.com.sdcsoft.devices.entity.IntCommand;
import cn.com.sdcsoft.devices.entity.TimeCommand;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.*;

public class Device_PLC_DianReShui extends Device_PLC_Dian {

    public Device_PLC_DianReShui() {
        this.BYTE_ARRAY_LENGTH = 245;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();
        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS));
        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS));

        list.add(getUiItem(this.getMockFields(),"mo_qidongjiarezushu"));
        list.add(getUiItem(this.getMockFields(),"mo_chushuiwendu"));
        list.add(getUiItem(this.getMockFields(),"mo_huishuiwendu"));
        list.add(getUiItem(this.getBaseInfoFields(),"ba_shuiweizhuangtai"));

        return list;
    }

    @Override
    public Map<String,List<Command>> getCommands(){
        Map<String, List<Command>> commandsMap =new LinkedHashMap<String, List<Command>>(5);
        ArrayList<Command> list = new ArrayList<Command>(10);
        Command cmd = new IntCommand(this);
        cmd.setName("se_chaowenbaojingsheding");
        cmd.setMaxValue(90);
        cmd.setMinValue(30);
        cmd.setAddress("0502");

        list.add(cmd);
        commandsMap.put("参数设定",list);

        list = new ArrayList<Command>();
        cmd = new TimeCommand(this);
        cmd.setName("se_tingluwendusheding");
        cmd.setAddress("0580");
        list.add(cmd);
        commandsMap.put("启停时间",list);
        return commandsMap;
    }
}
