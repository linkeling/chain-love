package com.ynmarry.chain.enums;

public enum EnumHaveNoInfo {
    EDUCATION_1(1,"有"),
    EDUCATION_0(0,"无");

    private  Integer value;
    private  String name;

    EnumHaveNoInfo(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumHaveNoInfo[] enumHaveNoInfos = values();
        for (EnumHaveNoInfo enumHaveNoInfo:enumHaveNoInfos) {
            if (enumHaveNoInfo.getValue().equals(value)) {
                return enumHaveNoInfo.getName();
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
