package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailController {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Matcher matcher;
    private static Pattern pattern;

    public EmailController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping("")
    public String view(){
        return "index";
    }


    @PostMapping("/validate")
    public ModelAndView validateEmail(@RequestParam String email){
        ModelAndView modelAndView = new ModelAndView("index");
        boolean check = Pattern.compile(EMAIL_REGEX).matcher(email).matches();
        modelAndView.addObject("message",check?"Success":"Email is invalid");
        modelAndView.addObject("check",check);
        return modelAndView;
    }
}
