package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.TimeZone;

@Controller

public class TimeController {
    @GetMapping("/time_world")
    public ModelAndView time_World(@RequestParam(name = "city" , defaultValue = "Asia/Ho_Chi_Minh", required = false) String city){
        ModelAndView modelAndView = new ModelAndView("index");
        Date time = new Date();
        TimeZone local = TimeZone.getDefault();
        TimeZone locale = TimeZone.getTimeZone(city);
        long local_time_mili = time.getTime() + (locale.getRawOffset()-local.getRawOffset());
        time.setTime(local_time_mili);
        modelAndView.addObject("time",time);
        modelAndView.addObject("city",city);
        return modelAndView;
    }


}
