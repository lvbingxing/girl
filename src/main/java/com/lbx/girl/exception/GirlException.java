package com.lbx.girl.exception;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/24 14:25
 * NOTE:
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
