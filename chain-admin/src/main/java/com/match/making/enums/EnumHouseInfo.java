package com.match.making.enums;

public enum EnumHouseInfo {
    house_1(1, "没有"),
    house_2(2, "父母名下"),
    house_3(3, "自己名下");

    private Integer value;
    private String name;

    EnumHouseInfo(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumHouseInfo[] enumHouseInfos = values();
        for (EnumHouseInfo item : enumHouseInfos) {
            if (item.getValue().equals(value)) {
                return item.getName();
            }
        }
        return null;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}
