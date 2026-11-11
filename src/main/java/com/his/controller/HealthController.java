package com.his.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 医疗系统连通性测试接口。
 * 访问：http://localhost:8080/api/medical/hello
 */
@RestController
@RequestMapping("/medical")
public class HealthController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello，医疗系统初始化成功！";
    }
}
