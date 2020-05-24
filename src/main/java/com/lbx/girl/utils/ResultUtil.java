package com.lbx.girl.utils;

import com.lbx.girl.entity.Result;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/24 13:39
 * NOTE:
 */
public class ResultUtil {
    public static Result success(Object o) {
        Result<Object> result = new Result<>();
        result.setCode(200);
        result.setMsg("OK");
        result.setData(o);
        return result;
    }

    public static Result success() {
        Result<Object> result = new Result<>();
        result.setCode(200);
        result.setMsg("OK");
        return result;
    }

    public static Result error(String msg) {
        Result<Object> result = new Result<>();
        result.setCode(404);
        result.setMsg(msg);
        return result;
    }
}
