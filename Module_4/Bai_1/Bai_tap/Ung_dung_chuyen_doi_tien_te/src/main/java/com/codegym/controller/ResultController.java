package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
    @GetMapping("/")
    public String view(){
        return "index";
    }
    @PostMapping("/result")
    public ModelAndView result(@RequestParam  String rate , @RequestParam String USD){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        if (rate!="" || USD != ""){
            double VND = Double.parseDouble(rate) * Double.parseDouble(USD);
            modelAndView.addObject("VND",VND);
            modelAndView.addObject("rate",rate);
            modelAndView.addObject("USD",USD);
        }

       return modelAndView;
    }
}
