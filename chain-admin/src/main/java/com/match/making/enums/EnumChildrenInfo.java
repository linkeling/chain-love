package com.match.making.enums;

public enum EnumChildrenInfo {
    Children_1(1,"没有"),
    Children_2(2,"有，我们住一起"),
    Children_3(3,"有，偶在在一起"),
    Children_4(4,"有，不在身边");

    private  Integer value;
    private  String name;

    EnumChildrenInfo(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumChildrenInfo[] enumChildrenInfos = values();
        for (EnumChildrenInfo enumChildrenInfo:enumChildrenInfos) {
            if (enumChildrenInfo.getValue().equals(value)) {
                return enumChildrenInfo.getName();
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
