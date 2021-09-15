package com.ynmarry.chain.enums;

/**
 * 性别
 *
 * @author tangl
 * @version 2019-04
 */
public enum EnumGender {
    ALL(0, "所有"),
    MALE(1, "男"),
    FEMALE(2, "女");

    private Integer value;
    private String name;

    EnumGender(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumGender[] enumNoInsists = values();
        for (EnumGender item : enumNoInsists) {
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
