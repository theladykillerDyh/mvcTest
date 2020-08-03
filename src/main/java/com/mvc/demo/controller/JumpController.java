package com.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jump")
public class JumpController {
    @GetMapping("/redirectJump")
    public String redirectJump() {
        return "redirect:https://www.sina.com.cn/";
    }

    @GetMapping("/index")
    public String indexJump() {
        return "redirect:/html/index.html";
    }

    @GetMapping("/show")
    @ResponseBody
    public String show() {
        return "ok";
    }
}
