package com.lbx.girl.enums;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/24 18:35
 * NOTE:
 */
public enum ResultEnums {
    ERROR_UNKNOWN(-1,"未知错误"),
    SUCCESS(0,"OK"),
    PRIMARY_SCHOOL(-100,"你是小学生吧？"),
    MIDDLE_SCHOOL(-200,"你是中学生吧？")
    ;

    private Integer code;
    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
