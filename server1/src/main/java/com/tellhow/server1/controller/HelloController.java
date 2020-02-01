package com.tellhow.server1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public String hello () {
        log.info("访问的是：8001");
        return "Hello, 我是8001";
    }
}
