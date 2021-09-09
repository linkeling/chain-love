package com.match.making.enums;

public enum EnumRoleInfo {
    role_1(1,"超级管理员"),
    role_2(2,"地州加盟商"),
    role_3(3,"员工");

    private  Integer value;
    private  String name;

    EnumRoleInfo(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumRoleInfo[] enumRoleInfos = values();
        for (EnumRoleInfo enumRoleInfo:enumRoleInfos) {
            if (enumRoleInfo.getValue().equals(value)) {
                return enumRoleInfo.getName();
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
