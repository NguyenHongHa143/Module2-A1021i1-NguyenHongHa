package com.codegym.controller;


import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class ProductController {
    ProductService productService = new ProductServiceImpl();
    @GetMapping("")
    public ModelAndView view(){
        return new ModelAndView("view","products",productService.getAll());
    }

    @GetMapping("/create")
    public ModelAndView formCreate(){
        return new ModelAndView("form","product",new Product());
    }

    @GetMapping("/update")
    public ModelAndView formUpdate(@RequestParam int id){
        Product product = productService.findById(id);
        return new ModelAndView("form","product",product);
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id){
        productService.delete(id);
        return "redirect:/";
    }


    @PostMapping("/create")
    public String create(Product product){
        productService.save(product);
        return "redirect:/";
    }

    @PostMapping("/search")
    public ModelAndView search(@RequestParam String name){
        List<Product> list = productService.search(name);
        return  new ModelAndView("view","products",list);
    }
}
