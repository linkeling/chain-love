package com.match.making.enums;

public enum EnumVisitType {
    role_1(0,"普通客户"),
    role_2(1,"中级客户"),
    role_3(2,"高级客户");

    private  Integer value;
    private  String name;

    EnumVisitType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumVisitType[] enumVisitTypes = values();
        for (EnumVisitType enumVisitType:enumVisitTypes) {
            if (enumVisitType.getValue().equals(value)) {
                return enumVisitType.getName();
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
