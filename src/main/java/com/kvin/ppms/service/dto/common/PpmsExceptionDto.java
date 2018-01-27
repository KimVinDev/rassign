package com.kvin.ppms.service.dto.common;

public class PpmsExceptionDto {
    /**
     * 异常码
     */
    private String code;

    /**
     * 异常描述信息
     */
    private String message;

    /**
     * 异常原因
     */
    private Throwable cause;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }
}
