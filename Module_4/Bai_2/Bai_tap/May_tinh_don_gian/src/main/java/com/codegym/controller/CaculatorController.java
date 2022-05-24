package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {

    @GetMapping("")
    public String view(){
        return "index";
    }

    @PostMapping("/caculator")
    public ModelAndView caculator(@RequestParam double number1, @RequestParam double number2, @RequestParam String caculation){
        String result = null;
        switch (caculation){
            case "+":
                result = String.valueOf((number1 + number2));
                break;
            case "-":
                result = String.valueOf((number1 - number2));
                break;
            case "X":
                result = String.valueOf((number1 * number2));
                break;
            case "/":
                if (number2 == 0){
                    result = "error denominator = 0";
                }else {
                    result = String.valueOf((number1 / number2));
                }
                break;
        }
        return new ModelAndView("index","result",result);
    }
}
