package com.kvin.ppms.controller.common;

import com.kvin.ppms.exception.PpmsException;
import com.kvin.ppms.service.dto.common.PpmsResultDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/conn")
@RestController
public class LinkTestController {

    /**
     * 连接测试链接
     */
    @RequestMapping("/success")
    @GetMapping
    public PpmsResultDto test() {
        return new PpmsResultDto<>("TEST SUCCESS");
    }

    /**
     * 连接异常抛出测试链接
     */
    @RequestMapping("/error")
    @GetMapping
    public PpmsResultDto testError() {
        throw new PpmsException("CE000001");
    }

    /**
     * 连接异常抛出测试链接
     */
    @RequestMapping("/error2")
    @GetMapping
    public PpmsResultDto testError2() {
        throw new RuntimeException("runtime error message");
    }
}
