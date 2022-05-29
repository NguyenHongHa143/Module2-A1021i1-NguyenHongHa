package com.codegym.controller;


import com.codegym.model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Setting_Controller {
    Setting setting = new Setting();
    @GetMapping("")
    public String view(){
        return "index";
    }

    @GetMapping("config")
    public ModelAndView setting_Mail(){
        return new ModelAndView("config","setting",setting);
    }

    @PostMapping("save")
    public ModelAndView save(@ModelAttribute Setting setting){
        return new ModelAndView("index","setting",setting);
    }
}
