package org.java.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class oneController {
    @GetMapping("init")
    public String init(){

        return "你好。。。123";
    }
}
