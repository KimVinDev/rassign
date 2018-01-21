package com.kvin.ppms.service.dto.common;

import com.kvin.ppms.exception.PpmsException;

public class PpmsExceptionDto {
    /**
     * 异常码
     */
    private String code;

    /**
     * 异常描述信息
     */
    private String message;

    public PpmsExceptionDto(PpmsException e) {
        code = e.getCode();
        message = e.getMessage();
    }

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
}
