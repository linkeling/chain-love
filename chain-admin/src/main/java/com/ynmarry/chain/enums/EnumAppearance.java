package com.ynmarry.chain.enums;

public enum EnumAppearance {
    Appearance_0(0,"无"),
    Appearance_1(1,"普通"),
    Appearance_2(2,"中颜"),
    Appearance_3(3,"高颜");

    private  Integer value;
    private  String name;

    EnumAppearance(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumAppearance[] enumAppearances = values();
        for (EnumAppearance enumAppearance:enumAppearances) {
            if (enumAppearance.getValue().equals(value)) {
                return enumAppearance.getName();
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
