package com.example.demo.util;

public class Result<T> {

    private Integer code;
    private String msg;
    private T data;

    public Result() {

    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public Result setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Result setCode(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Result setMsg(ResultEnum resultEnum) {
        this.msg = resultEnum.getMsg();
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" + "code=" + code + ", msg='" + msg + '\'' + ", data=" + data + '}';
    }

}
