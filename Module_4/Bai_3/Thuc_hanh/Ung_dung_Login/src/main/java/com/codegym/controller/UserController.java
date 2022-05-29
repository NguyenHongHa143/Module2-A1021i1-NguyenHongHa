package com.codegym.controller;


import com.codegym.dao.UserDao;
import com.codegym.model.Login;
import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("")
    public ModelAndView home(){
        return new ModelAndView("user/home","login", new Login());
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute Login login){
        User user = UserDao.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("user/error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("user/user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}
