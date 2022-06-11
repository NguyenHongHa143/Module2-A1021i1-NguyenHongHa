package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.Impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller

public class BlogController {
    @Autowired
    private BlogServiceImpl blogService;

    @GetMapping("")
    public ModelAndView findAllPage(@PageableDefault(value = 2) Pageable pageable){
//        Page<Blog> blogs = blogService.findAllPage(pageable);
        Page<Blog> blogs = blogService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("blogs",blogs);
        return modelAndView;
    }
    @GetMapping("create")
    public ModelAndView formCreate(){
        return new ModelAndView("form","blog",new Blog());
    }

    @GetMapping("single")
    public ModelAndView singleBlog(@RequestParam Long id){
        Optional<Blog> blog = blogService.findById(id);
//        Page<Blog> blogs = blogService.findAll();
//        blogs.remove(blogService.findById(id).get());
        if (blog.isPresent()){
            ModelAndView modelAndView = new ModelAndView("single");
            modelAndView.addObject("blog",blog.get());
//            modelAndView.addObject("blogs",blogs);
            return modelAndView;
        }
        else {
            return new ModelAndView("index");
        }
    }


    @PostMapping("save")
    public String save(Blog blog){
        blog.setCreateAdd(new Date());
        blogService.save(blog);
        return "redirect:";
    }

    @GetMapping("delete")
    public String delete(@RequestParam Long id){
        blogService.delete(id);
        return "redirect:";
    }
}
