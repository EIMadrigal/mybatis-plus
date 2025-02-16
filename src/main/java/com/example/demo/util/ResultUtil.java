package com.example.demo.util;

public class ResultUtil {

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(ResultEnum.SUCCESS).setMsg(ResultEnum.SUCCESS).setData(data);
        return result;
    }

    public static <T> Result<T> defineSuccess(Integer code, String msg, T data) {
        Result<T> result = new Result<>();
        return result.setCode(code).setMsg(msg).setData(data);
    }

    public static <T> Result<T> error() {
        Result result = new Result();
        result.setCode(ResultEnum.ERROR).setMsg(ResultEnum.ERROR);
        return result;
    }

    public static <T> Result<T> defineError(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code).setMsg(msg);
        return result;
    }
}
