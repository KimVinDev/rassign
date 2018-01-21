package com.kvin.ppms.common.kbn;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PPMS返回结果区分
 */
public enum ResultType {
    /**
     * 成功
     */
    SUCCESS(false, "0"),
    /**
     * 异常
     */
    ERROR(true, "-1"),;

    private final boolean isError;
    private final String value;

    ResultType(boolean aIsError, String aValue) {
        isError = aIsError;
        value = aValue;
    }

    public boolean isError() {
        return isError;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
