package com.car.util;

//对象方式 Response 对象
public class RObject<T> {
    private Integer code;
    private String mag;
    private T data;

    public RObject(Integer code, String msg, T data) {
        this.code = code;
        this.mag = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
