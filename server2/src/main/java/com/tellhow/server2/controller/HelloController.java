package com.tellhow.server2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public String hello () {
        log.info("访问的是：8002");
        return "Hello, 我是8002";
    }
}
