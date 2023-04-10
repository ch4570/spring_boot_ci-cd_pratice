package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "자유 대한민국을 수호하는 애국보수 만세";
    }
}
