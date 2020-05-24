package com.lbx.girl.utils;

import com.lbx.girl.entity.Result;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/24 13:39
 * NOTE:
 */
public class ResultUtil {
    public static Result success(Object o,String msg,Integer code) {
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(o);
        return result;
    }

    public static Result success(String msg,Integer code) {
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(String msg,Integer code) {
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
