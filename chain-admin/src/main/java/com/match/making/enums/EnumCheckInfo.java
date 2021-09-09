package com.match.making.enums;

public enum EnumCheckInfo {
    EDUCATION_1(1,"已核实"),
    EDUCATION_0(0,"未核实");

    private  Integer value;
    private  String name;

    EnumCheckInfo(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumCheckInfo[] enumCheckInfos = values();
        for (EnumCheckInfo enumCheckInfo:enumCheckInfos) {
            if (enumCheckInfo.getValue().equals(value)) {
                return enumCheckInfo.getName();
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
