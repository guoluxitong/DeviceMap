package cn.com.sdcsoft.devices.meta.CTL_NJZJ;

/**
 * Created by jialiang on 2018/4/20.
 */

public class DeviceField extends cn.com.sdcsoft.devices.meta.DeviceField {
    protected StringBuilder sb = new StringBuilder();

    @Override
    public boolean haveValue(byte... bytes) {
//        if(this.getTitle().equals("炉排")){
//            System.out.println("引风机");
//        }
        //value = new BigInteger(bytes).intValue();
        value = (bytes[1] & 0xFF) | (bytes[0] & 0xFF) << 8;

        if (0x7FFF == value)
            return false;

        sb.setLength(0);

        int v = (bytes[0] & 0xFF) | 0x3F;
        if (0xC0 == (v & 0xC0)) {
            sb.append(valueMap.get(0xC0));
            sb.append('/');
        } else {
            sb.append(valueMap.get(0x3F));
            sb.append('/');
        }
        v = (bytes[0] & 0xFF) | 0xCF;
        if (0x30 == (v & 0x30)) {
            sb.append(valueMap.get(0x30));
            sb.append('/');
        } else {
            sb.append(valueMap.get(0xCF));
            sb.append('/');
        }
        v = (bytes[0] & 0xFF) | 0xF0;
        if (0x0F == (v & 0x0F)) {
            sb.append(valueMap.get(0x0F));
            value = (bytes[1] | 0x80) & 0xFF;
        } else {
            sb.append(valueMap.get(0xF0));
            value = bytes[1] & 0xFF;
        }
        return true;
    }

    @Override
    public String getValueString() {
        return sb.toString();
    }
}
