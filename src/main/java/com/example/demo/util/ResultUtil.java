package com.example.demo.util;

public class ResultUtil {

    public static <T> Result<T> success(T data) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS).setMsg(ResultEnum.SUCCESS).setData(data);
        return result;
    }

    public static <T> Result<T> error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code).setMsg(msg);
        return result;
    }

}
