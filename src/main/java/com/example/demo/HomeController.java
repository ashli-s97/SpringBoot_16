package com.example.demo;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.lang.model.element.NestingKind;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/2")
    public String page2(){
        return "page2";
    }

    @RequestMapping("/3")
    public String page3(){
        return "page3";
    }
}

