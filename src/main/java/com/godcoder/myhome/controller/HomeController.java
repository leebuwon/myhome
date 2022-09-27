package com.godcoder.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping     // 원래 경로를 작성할 수 있음, 경로없다면 index 메서드가 호출됨
    public String index() {
        return "index";
    }
}