package com.lmk.azuredevops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/get")
    public String getStr(){
        return "我是一个字符串";
    }

}
