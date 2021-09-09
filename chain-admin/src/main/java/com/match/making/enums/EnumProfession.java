package com.match.making.enums;

public enum EnumProfession {
    profession_1(1,"销售"),
    profession_2(2,"客户代表"),
    profession_3(3,"计算机/互联网"),
    profession_4(4,"通讯/电子"),
    profession_5(5,"生产/制造"),
    profession_6(6,"物流/仓储"),
    profession_7(7,"商贸/采购"),
    profession_8(8,"人事/行政"),
    profession_9(9,"高级管理"),
    profession_10(10,"广告/市场"),
    profession_11(11,"传媒/艺术"),
    profession_12(12,"生物/制药"),
    profession_13(13,"医疗/护理"),
    profession_14(14,"金融/银行/保险"),
    profession_15(15,"建筑/房地产"),
    profession_16(16,"咨询/顾问"),
    profession_17(17,"法律"),
    profession_18(18,"财会/审计"),
    profession_19(19,"教育/科研"),
    profession_20(20,"服务业"),
    profession_21(21,"交通运输"),
    profession_22(22,"政府机构"),
    profession_23(23,"军人/警察"),
    profession_24(24,"农林牧渔"),
    profession_25(25,"自由职业"),
    profession_26(26,"在校学生"),
    profession_27(27,"待业"),
    profession_28(28,"其它行业");


    private Integer value;
    private String name;

    EnumProfession(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(Integer value) {
        EnumProfession[] enumProfessions = values();
        for (EnumProfession item : enumProfessions) {
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
