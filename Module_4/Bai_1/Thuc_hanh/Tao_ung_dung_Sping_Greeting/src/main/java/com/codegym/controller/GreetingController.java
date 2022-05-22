package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/")
    public ModelAndView hello(){
        return new ModelAndView("index","message","Xin chao Viet Nam");
    }
}
