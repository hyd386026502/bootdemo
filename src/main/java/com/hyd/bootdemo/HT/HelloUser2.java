package com.hyd.bootdemo.HT;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUser2 {
    @RequestMapping("/a")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
