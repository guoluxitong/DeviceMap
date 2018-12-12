package cn.com.sdcsoft.devices.entity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Element {
    public static final String Prefix_Stove = "a";
    public static final String Prefix_Beng = "b";
    public static final String Prefix_Fan = "c";

    public static final int Index_A_Power = 0;
    public static final int Index_A_Media = 1;
    public static final int Index_A_Style = 2;
    public static final int Index_A_Status = 3;

    public static final int Index_Beng_Count = 0;
    public static final int Index_Beng_Status = 1;

    public static final int Index_Fan_Count = 0;
    public static final int Index_Fan_Status = 1;

    protected int[] values = { -1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    private String title,prefix;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }



    public void ClearValues()
    {
        for(int i = 0; i < values.length; i++)
        {
            values[i] = -1;
        }
    }

    public void SetValues(int index,int... data)
    {
        for(int i = index,j = 0;j<data.length;i++,j++) {
            values[i] = data[j];
        }
    }
    public String getElementPrefixAndValuesString()
    {
        return getElementPrefixAndValuesString("-");
    }
    public String getElementPrefixAndValuesString(String spacerString)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        for(int i : values)
        {
            if(i > -1)
            {
                sb.append(spacerString);
                sb.append(i);
                continue;
            }
            break;
        }
        if(prefix.equals(Prefix_Stove)){
            sb.replace(6,7,"%s");
        }
        return sb.toString();
    }
}
