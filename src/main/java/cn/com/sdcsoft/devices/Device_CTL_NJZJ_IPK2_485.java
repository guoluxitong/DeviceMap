package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.*;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.*;

public class Device_CTL_NJZJ_IPK2_485 extends Device_CTL_NJZJ_IP_485 {

    /**
     * 485数据读取指令
     * 1:01030600000EC486
     * 2:010307700063054C
     * 3:010307D30004B484
     * 4:010307000045854D
     * 5:01030100004585C5
     * 6:0103050000470534
     * 7:01030580000C44EB
     * 8:0103080000198660
     * 9
     * 10
     */
    public Device_CTL_NJZJ_IPK2_485(){
        BYTE_ARRAY_LENGTH = 1749;
    }

    private List<Command> addCommand(List<Command> list, HashMap<String, DeviceFieldForUI> map,String pointName, Command cmd, String address, Object maxValue, Object minValue){
        if(map.containsKey(pointName))
        {
            Object value = map.get(pointName).getValue();
            if(null == list)
                list = new ArrayList<Command>(10);
            try{
                cmd.initCommand(pointName,
                        address,
                        maxValue,
                        minValue,
                        value);
                list.add(cmd);
            }catch (Exception ex){

            }
        }
        return list;
    }


    @Override
    public Map<String,List<Command>> getCommands() throws Exception {
        if (this.mediaVal == Media.ReShui) {

            Iterator<String> iterator = commandsMap.keySet().iterator();
            ;
            String key = iterator.next();

            List<Command> list  = addCommand(null,this.getBaseInfoFields(),
                    KEY_POINT_SYSTEM_STATUS,new SystemCommand(this),
                    "0602",2,1);

            if(null != list)
                commandsMap.put(key,list);

            list = addCommand(null,
                    this.getSettingFields(),
                    "se_baojingwendu",
                    new IntCommand(this),
                    "0501",130, 3);

            list = addCommand(list,this.getSettingFields(),
                    "se_tingluwendu",
                    new IntCommand(this),
                    "0502",130, 3);
            list = addCommand(list,this.getSettingFields(),
                    "se_mubiaowendu",
                    new IntCommand(this),
                    "0503",130, 3);
            list = addCommand(list,this.getSettingFields(),
                    "se_kaibengwendu",
                    new IntCommand(this),
                    "0507",130, 2);

            list = addCommand(list,this.getSettingFields(),
                    "se_guanbengwendu",
                    new IntCommand(this),
                    "0508",130, 0);

            key = iterator.next();
            if(this.powerVal== Power.Dian) {
                list = addCommand(list,this.getSettingFields(),
                        "se_jiarezushu",
                        new IntCommand(this),
                        "0517",130, 0);

                list = addCommand(list,this.getSettingFields(),
                        "se_touqieshijian_jiarezuyong_",
                        new IntCommand(this),
                        "0547",10, 1);

                list = addCommand(list,this.getSettingFields(),
                        "se_diaojieshijian_jiarezuyong_",
                        new IntCommand(this),
                        "0548",10, 1);
                if(null != list)
                    commandsMap.put(key,list);

                return commandsMap;
            }
            if(this.powerVal == Power.YouQi){
                list = addCommand(list,this.getSettingFields(),
                        "se_paiyanbaojingwendu",
                        new IntCommand(this),
                        "0500",300, 10);

                list = addCommand(list,this.getSettingFields(),
                        "se_qiluhuicha",
                        new IntCommand(this),
                        "0506",70, 1);
                if(null != list)
                    commandsMap.put(key,list);
                return commandsMap;
            }
            if(this.powerVal == Power.Mei){
                return commandsMap;
            }
        }
        return commandsMap;
    }

}
