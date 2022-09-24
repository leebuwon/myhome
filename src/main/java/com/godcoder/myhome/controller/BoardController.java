package com.godcoder.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")       //경로 지정해주는 것  |  requestmapping 한번 찾아보기!
public class BoardController {

    @GetMapping("/list")
    public String list(){
        return "board/list";
    }

}
