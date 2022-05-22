package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    private static Map<String,String> dictionary = new HashMap<>();
    static {
        dictionary.put("Hello","Xin chào");
        dictionary.put("Goodbye","Tạm biệt");
        dictionary.put("Book","Sách");
        dictionary.put("English","Tiếng Anh");

    }
    @GetMapping("/")
    public String view(){
        return "index";
    }

    @GetMapping("/result")
    public ModelAndView dictionary(@RequestParam String english){
        ModelAndView modelAndView = new ModelAndView();
        if (dictionary.containsKey(english)){
            modelAndView.addObject("vietNames",dictionary.get(english));
        }else {
            modelAndView.addObject("vietNames","Not Found");
        }

        modelAndView.setViewName("index");
        return modelAndView;
    }
}
