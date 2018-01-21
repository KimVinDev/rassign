package com.kvin.ppms.handler.common;

import com.kvin.ppms.exception.PpmsException;
import com.kvin.ppms.service.dto.common.PpmsResultDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 */
@RestControllerAdvice
public class GlobalPpmsExceptionHandler {

    /**
     * 项目异常处理
     *
     * @param req
     * @param e
     * @return 通用包结果
     * @throws Exception
     */
    @ExceptionHandler(value = PpmsException.class)
    public PpmsResultDto<String> ppmsErrorHandler(HttpServletRequest req, PpmsException e) throws Exception {
        PpmsResultDto<String> resultDto = new PpmsResultDto<>(e);
        return resultDto;
    }

    /**
     * 未知异常处理
     *
     * @param req
     * @param e
     * @return 通用包结果
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public PpmsResultDto<String> unknownErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        PpmsException ppmsException = new PpmsException(e);
        PpmsResultDto<String> resultDto = new PpmsResultDto<>(ppmsException);
        return resultDto;
    }
}
