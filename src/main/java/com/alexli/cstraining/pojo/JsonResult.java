package com.alexli.cstraining.pojo;

public class JsonResult {
    private String code;
    private String message;
    private Object data;

    public JsonResult() {
    }

    public JsonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public JsonResult(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
