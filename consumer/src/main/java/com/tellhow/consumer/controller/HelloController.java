package com.tellhow.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class HelloController {

    private static final String SERVER_URL = "http://APP-SERVER";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("hello")
    public String hello () {
        return restTemplate.getForObject(SERVER_URL+"/hello",String.class);
    }
}
