package com.example.ci_cd_demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/helloworld")
    public String hello() {
        return "Hello, World!";
    }
}

