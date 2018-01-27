package com.kvin.ppms.handler.common;

import com.kvin.ppms.exception.PpmsException;
import com.kvin.ppms.service.dto.common.PpmsExceptionDto;
import com.kvin.ppms.service.dto.common.PpmsResultDto;
import com.kvin.ppms.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 */
@RestControllerAdvice
public class GlobalPpmsExceptionHandler {

    @Autowired
    MessageUtils messageUtils;

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
        PpmsExceptionDto exceptionDto = new PpmsExceptionDto();
        PpmsResultDto resultDto = new PpmsResultDto(exceptionDto);
        exceptionDto.setCode(e.getCode());
        exceptionDto.setMessage(messageUtils.getMsgByCode(e.getCode()));
        exceptionDto.setCause(e.getCause());
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
        PpmsExceptionDto exceptionDto = new PpmsExceptionDto();
        exceptionDto.setCode(messageUtils.getSysErrorCode());
        exceptionDto.setMessage(messageUtils.getSysErrorMessage());
        exceptionDto.setCause(e.getCause());
        PpmsResultDto<String> resultDto = new PpmsResultDto<>(exceptionDto);
        return resultDto;
    }
}
