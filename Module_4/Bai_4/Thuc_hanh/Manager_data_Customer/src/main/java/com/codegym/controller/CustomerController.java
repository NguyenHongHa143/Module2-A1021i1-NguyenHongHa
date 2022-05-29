package com.codegym.controller;


import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("")
    public ModelAndView index(){

        return new ModelAndView("index","customers", customerService.findAll());
    }

    @GetMapping("create")
    public ModelAndView formCreate(){
        return new ModelAndView("create","customer",new Customer());
    }

    @GetMapping("edit")
    public ModelAndView formEdit(@RequestParam int id){
        return new ModelAndView("edit","customer",customerService.findById(id));
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id){
        customerService.remove(id);
        return "redirect:/customer";
    }

    @GetMapping("view")
    public ModelAndView view(@RequestParam int id){
        return new ModelAndView("view","customer",customerService.findById(id));
    }

    @PostMapping("save")
    public String save(Customer customer){
        customerService.save(customer);
        return "redirect:/customer";
    }

    @PostMapping("update")
    public String update(Customer customer){
        customerService.update(customer.getId(),customer);
        return "redirect:/customer";
    }

}
