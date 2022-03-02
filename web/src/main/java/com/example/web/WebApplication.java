package com.example.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@SpringBootApplication
@RestController
public class WebApplication {

    private final Logger logger = LoggerFactory.getLogger(WebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        System.out.println(strings);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "aa") String aa){
        logger.error("logback for austin");
        return String.format("hello %s!", WebApplication.class);
    }





}
