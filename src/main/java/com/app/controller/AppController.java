package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("app")
public class AppController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello"; //name of view page
    }
}
