package cn.com.sdcsoft.devices.meta.CTL_NJRT;

public class OpenCloseField extends cn.com.sdcsoft.devices.meta.OpenCloseField {
    @Override
    public boolean haveValue(byte... bytes) {
        value = (bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF;
//        if(this.getTitle().equals("给水泵")){
//            System.out.println();
//        }
        int i = 1 << bit;
        if ((i & value) == i) {
            value = 1;
        } else {
            value = 0;
        }
        return true;
    }
}
