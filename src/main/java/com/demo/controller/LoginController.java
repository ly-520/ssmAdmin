package com.demo.controller;/**
 * @author ljt
 * @Title: LoginController
 * @ProjectName ssmAdmin
 * @Description:
 * @Version:
 * @date 2020/1/4 14:33
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("==========================>");
        return "test";
    }
}
