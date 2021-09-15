package com.ynmarry.chain.enums;

public enum EnumPersonStatus {
    ON_JOB(1, "在职"),
    LEAVE_JOB(2,"离职");

    private Integer value;
    private String name;

    EnumPersonStatus(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumPersonStatus[] enumPersonStatuses = values();
        for (EnumPersonStatus item : enumPersonStatuses) {
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
