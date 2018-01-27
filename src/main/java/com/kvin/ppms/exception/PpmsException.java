package com.kvin.ppms.exception;

/**
 * PPMS项目通用异常
 */
public class PpmsException extends RuntimeException {

    /**
     * 异常码
     */
    private String code;

    /**
     * 生成系统未知异常
     */
    public PpmsException() {
        super();
    }

    /**
     * 生成系统未知异常
     */
    public PpmsException(Exception e) {
        super(e);
    }

    /**
     * 生成系统未知异常
     */
    public PpmsException(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
