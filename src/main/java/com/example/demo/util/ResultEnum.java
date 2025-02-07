package com.example.demo.util;

public enum ResultEnum {

    ERROR(0, "ERROR"),
    SUCCESS(200, "SUCCESS"),
    UNAUTHORIZED(401, "UNAUTHORIZED"),
    AUTHERROR(403, "AUTHERROR");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
