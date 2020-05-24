package com.lbx.girl.exception;

import com.lbx.girl.enums.ResultEnums;
import org.aspectj.apache.bcel.classfile.Code;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/24 14:25
 * NOTE:
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnums resultEnums) {
        super(resultEnums.getMsg());
        this.code = resultEnums.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
