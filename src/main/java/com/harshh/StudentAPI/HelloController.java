package com.harshh.StudentAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Harsha ! Springboot Application is wroking....!";
    }
}
