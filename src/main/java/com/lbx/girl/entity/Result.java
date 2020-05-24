package com.lbx.girl.entity;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/24 13:33
 * NOTE:       最外层包装类
 */
public class Result<T> {
    /*返回码 */
    private Integer code;
    /*返回信息*/
    private String msg;
    /*内容*/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
