package com.match.making.enums;

/**
 * @describe  合同审核状态枚举
 */
public enum EnumAuditStatus {
    EDUCATION_1(0,"待审核"),
    EDUCATION_2(1,"通过"),
    EDUCATION_3(2,"驳回");

    private  Integer value;
    private  String name;

    EnumAuditStatus(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumAuditStatus[] enumEducations = values();
        for (EnumAuditStatus enumAuditStatus:enumEducations) {
            if (enumAuditStatus.getValue().equals(value)) {
                return enumAuditStatus.getName();
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

