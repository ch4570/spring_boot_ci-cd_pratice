package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
public class TestController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return name.concat(" 이 요청을 시도 하였습니다.");
    }
}
