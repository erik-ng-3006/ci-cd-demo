package com.example.ci_cd_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
class DemoController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, CI/CD!";
    }
}