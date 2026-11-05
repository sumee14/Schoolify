package com.pvm.school.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/pvmschool") 
public class TestController {
    @GetMapping("/testMessage")
    public String testMessage(){
        return "<h1>hello, world !</h1>";
    }
}
