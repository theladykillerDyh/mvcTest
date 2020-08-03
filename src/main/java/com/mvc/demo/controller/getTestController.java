package com.mvc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/getTest")
public class getTestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(getTestController.class);

    @ResponseBody
    @GetMapping("person")
    public String getPerson(String name, Integer sex, Integer age) {
        LOGGER.error("name:{},sex:{},age:{}", name, sex, age);
        return "ok";
    }

    @ResponseBody
    @GetMapping("/show")
    public String show() {
        return "ok";
    }
}
