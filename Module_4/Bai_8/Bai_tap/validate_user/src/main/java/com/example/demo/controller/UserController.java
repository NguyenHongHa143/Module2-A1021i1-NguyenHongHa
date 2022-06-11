package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("")
    public ModelAndView form(){
        return new ModelAndView("index","user",new User());
    }

    @PostMapping("create")
    public ModelAndView create(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        new User().validate(user.getPhoneNumber(),bindingResult);
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("index");
        }
        else {
            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("message","Thêm mới thành công");
            return modelAndView;
        }
    }

}
