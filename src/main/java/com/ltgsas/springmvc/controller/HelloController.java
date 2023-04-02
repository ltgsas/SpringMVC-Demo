package com.ltgsas.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ProjectName : smvc
 * ProductName : IntelliJ IDEA
 * Auther : Run
 * Create : 2023/4/2-16:19 周日
 * Description :
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
