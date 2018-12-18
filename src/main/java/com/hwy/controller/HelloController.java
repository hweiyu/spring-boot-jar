package com.hwy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/12 11:29
 **/
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "helle index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello, welcome";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "hello2222, welcome";
    }
}
