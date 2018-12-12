package cn.com.sdcsoft.devices.meta.CTL_NJZJ_485;

/**
 * Created by jialiang on 2018/4/20.
 */

public class DeviceField extends cn.com.sdcsoft.devices.meta.DeviceField {
    protected StringBuilder sb = new StringBuilder();

    @Override
    public boolean haveValue(byte... bytes) {
        value = bytes[1] & 0xFF | (bytes[0] & 0xFF) << 8;
//        if("循环泵"== this.getTitle()){
//            System.out.println("");
//        }
        if (0x7FFF == value)
            return false;
        value = 0;

        sb.setLength(0);
        if (null != valueMap) {
            int v = (bytes[0] &0xFF) | 0x3F;
            if (0xC0 == (v & 0xC0)) {
                sb.append(valueMap.get(0xC0));
                sb.append('/');
            } else {
                sb.append(valueMap.get(0x3F));
                sb.append('/');
            }
            v = (bytes[0] &0xFF) | 0xCF;
            if (0x30 == (v & 0x30)) {
                sb.append(valueMap.get(0x30));
                sb.append('/');
            } else {
                sb.append(valueMap.get(0xCF));
                sb.append('/');
            }
            v = (bytes[0] &0xFF) | 0xF0;
            if (0x0F == (v & 0x0F)) {
                sb.append(valueMap.get(0x0F));
                value = (bytes[1] | 0x80) & 0xFF;//最高位补1，表示设备为运行状态
            } else {
                sb.append(valueMap.get(0xF0));
                value = bytes[1] & 0xFF;
            }
        }
        return true;
    }

    @Override
    public String getValueString() {
        return sb.toString();
    }
}
