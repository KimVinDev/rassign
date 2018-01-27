package com.kvin.ppms.service.dto.common;

import com.kvin.ppms.common.kbn.ResultType;

/**
 * PPMS通用返回值
 *
 * @param <T>
 */
public class PpmsResultDto<T> {
    /**
     * 结果
     */
    private ResultType resultType;

    /**
     * 异常信息
     */
    private PpmsExceptionDto ppmsExceptionDto;

    /**
     * 数据
     */
    private T data;

    /**
     * 生成一般成功结果
     * <pre>
     *     resultType:ResultType.SUCCESS
     *     ppmsException;null
     * </pre>
     *
     * @param data 数据
     */
    public PpmsResultDto(T data) {
        resultType = ResultType.SUCCESS;
        this.data = data;
    }

    /**
     * 生成一般异常结果
     * <pre>
     *     resultType:ResultType.ERROR
     *     data;null
     * </pre>
     *
     * @param ppmsExceptionDto 异常信息
     */
    public PpmsResultDto(PpmsExceptionDto ppmsExceptionDto) {
        resultType = ResultType.ERROR;
        this.ppmsExceptionDto = ppmsExceptionDto;
    }

    /**
     * 生成指定结果
     *
     * @param resultType       结果
     * @param data             数据
     * @param ppmsExceptionDto 异常信息
     */
    public PpmsResultDto(ResultType resultType, PpmsExceptionDto ppmsExceptionDto, T data) {
        this.resultType = resultType;
        this.data = data;
        this.ppmsExceptionDto = ppmsExceptionDto;
    }

    public ResultType getResultType() {
        return resultType;
    }

    public void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

    public PpmsExceptionDto getPpmsExceptionDto() {
        return ppmsExceptionDto;
    }

    public void setPpmsExceptionDto(PpmsExceptionDto ppmsExceptionDto) {
        this.ppmsExceptionDto = ppmsExceptionDto;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
