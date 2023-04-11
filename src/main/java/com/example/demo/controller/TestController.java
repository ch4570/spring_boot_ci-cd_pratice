package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
public class TestController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return name + "이 요청을 하였습니다.";
    }

    @GetMapping("hello/2/{no}")
    public String hello2(@PathVariable("no") Long no) {
        return "입력하신 번호는 " + no + " 입니다."
    }


}
