package com.lbx.girl.handle;

import com.lbx.girl.entity.Result;
import com.lbx.girl.exception.GirlException;
import com.lbx.girl.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/24 14:42
 * NOTE:
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result girlHandle(Exception e) {
        return e instanceof GirlException ? ResultUtil.error(e.getMessage()) : ResultUtil.error("未知异常");
    }
}
