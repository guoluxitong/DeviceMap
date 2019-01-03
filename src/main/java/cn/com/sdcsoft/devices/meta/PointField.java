package cn.com.sdcsoft.devices.meta;

/**
 * 点位基类
 */
public abstract class PointField {
    private String name;
    private String unit;
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return null == unit ? "" : unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
