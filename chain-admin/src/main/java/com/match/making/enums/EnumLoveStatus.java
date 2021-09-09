package com.match.making.enums;

public enum EnumLoveStatus {
    status_0(0,"空挡"),
    status_1(1,"恋爱"),
    status_2(2,"已婚");

    private Integer value;
    private String name;

    EnumLoveStatus(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumLoveStatus[] enumLoveStatuses = values();
        for (EnumLoveStatus item : enumLoveStatuses) {
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
