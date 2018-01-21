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
     * <pre>
     *     配置文件中获取异常码与异常信息
     * </pre>
     */
    public PpmsException() {
        super(PpmsException.getMsgByCode(PpmsException.getSysErrorCode()));
        code = PpmsException.getSysErrorCode();
    }

    /**
     * 生成系统未知异常
     * <pre>
     *     配置文件中获取异常码与异常信息
     * </pre>
     */
    public PpmsException(Exception e) {
        super(e);
        code = PpmsException.getSysErrorCode();
    }

    /**
     * 生成通用异常
     * <pre>
     *     配置文件中获取异常信息
     * </pre>
     *
     * @param aCode 异常码
     */
    public PpmsException(String aCode) {
        super(PpmsException.getMsgByCode(aCode));
        code = aCode;
    }

    /**
     * 生成通用异常
     *
     * @param aCode 异常码
     * @param aMsg  异常信息
     */
    public PpmsException(String aCode, String aMsg) {
        super(aMsg);
        code = aCode;
    }

    /**
     * 获取系统未知异常码
     *
     * @return 未知异常码
     */
    private static String getSysErrorCode() {
        //TODO 配置文件中获取未知异常用异常码
        return "-1";
    }

    /**
     * 通过异常码 获取异常描述信息
     *
     * @param aCode 异常码
     * @return 未知异常描述信息
     */
    private static String getMsgByCode(String aCode) {
        //TODO 配置文件中获取与异常码匹配的异常描述信息
        String msg = "异常信息描述";
        return msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
