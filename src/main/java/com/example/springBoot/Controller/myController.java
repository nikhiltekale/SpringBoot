package com.example.springBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    @GetMapping("/first")
    public String run(){
        return "this is first springBoot project in Intellij idea IDE";
    }
}
