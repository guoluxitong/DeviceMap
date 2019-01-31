package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.HashMap;
import java.util.List;

public class Device_CTL_RT_T3_RYZQ_YLBSQ extends Device_CTL_RT_T3_RYZQ {
    public Device_CTL_RT_T3_RYZQ_YLBSQ() {
        BYTE_ARRAY_LENGTH = 89;
    }
    /**
     * 485点位读取指令
     *
     */
    /**
     * T2控制器 bytes数据传递方式为高位在前，低位在后的模式传输到服务器
     * 在java程序中也按照高位在前低位在后的模式处理
     */
    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        List<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();
        ;
        Integer i = (Integer) this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_LIFE).getValue();
        DeviceFieldForUI field = this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS);
        field.setValue(i / 24);
        list.add(field);
        field = this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS);
        field.setValue(i % 24);
        list.add(field);

        list.add(getUiItem(this.getMockFields(), "mo_lengningqiyanwen"));
        list.add(getUiItem(this.getMockFields(), "mo_jishuiwendu"));
        list.add(getUiItem(this.getMockFields(), "mo_shuiweixinhao"));
        list.add(getUiItem(this.getMockFields(), "mo_zhengqiyali"));
        list.add(getUiItem(this.getMockFields(), "mo_paiyanwendu"));
        list.add(getUiItem(this.getMockFields(), "mo_jienengqiyanwen"));
        return list;
    }


}
