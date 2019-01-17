package cn.com.sdcsoft.devices.entity;

import cn.com.sdcsoft.devices.SdcSoftDevice;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/**
 * 浮点映射型点位
 * 如将1.5 映射为 10，一个该类型点位站2个字节
 */

public class FloatMapCommand extends IntCommand implements Serializable {
    public FloatMapCommand(){
        valueType = Command.FLOAT_VALUE;
        this.script = "reslut = integerToHexString(valueString.toInteger()*100);";
    }

    @Override
    public void handleValue(Object... values) {
        Integer i = (Integer)values[0];
        try {
            this.value = evalScriptText(valueString).toString();
            valueString = i.toString();
        }catch (Exception ex){

        }
    }

    public String encoding() {
        return null;
    }

    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
