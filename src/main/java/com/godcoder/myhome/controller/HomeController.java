package com.godcoder.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping     // 브라우저를 통해서 webserver에 들어오면 getmapping 을 호출함
    public String index() {
        return "index";
    }
}