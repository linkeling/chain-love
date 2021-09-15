package com.ynmarry.chain.enums;

/**
 * Created by lkl19 on 2020/1/14.
 */
public enum EnumEducation {
    EDUCATION_1(1,"博士"),
    EDUCATION_2(2,"硕士"),
    EDUCATION_3(3,"本科"),
    EDUCATION_4(4,"大专"),
    EDUCATION_5(5,"中专、高中"),
    EDUCATION_6(6,"初中及以下"),
    EDUCATION_7(7,"文盲或半文盲");

    private  Integer value;
    private  String name;

    EnumEducation(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumEducation[] enumEducations = values();
        for (EnumEducation enumEducation:enumEducations) {
            if (enumEducation.getValue().equals(value)) {
                return enumEducation.getName();
            }
        }
        return null;
    }

    public static Integer getValue(String name) {
        EnumEducation[] enumEducations = values();
        for (EnumEducation enumEducation:enumEducations) {
            if (enumEducation.getValue().equals(name)) {
                return enumEducation.getValue();
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
