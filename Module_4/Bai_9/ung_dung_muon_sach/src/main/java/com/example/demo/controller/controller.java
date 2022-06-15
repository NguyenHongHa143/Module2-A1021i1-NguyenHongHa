package com.example.demo.controller;

import com.example.demo.exception.GiveBookBackException;
import com.example.demo.exception.RentBookException;
import com.example.demo.model.Book;
import com.example.demo.service.IService;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
@Aspect
public class controller {
    private Map<Integer, Book> bookMap=new HashMap<>();

    @Autowired
    private IService service;


    @GetMapping("/books")
    public ModelAndView viewAllBook() {
        return new ModelAndView("list","books",service.getAllBooks());
    }

    @GetMapping("/toRentBook/{id}")
    public ModelAndView viewRentBook(@PathVariable int id) {
        Book book =service.getBookById(id);
        Random rand = new Random();
        int random = rand.nextInt(99999- 10000) + 10000;
        if(book==null) {
            return new ModelAndView("error");
        }
        ModelAndView modelAndView= new ModelAndView("rentBook","book",book);
        modelAndView.addObject("random",random);
        return modelAndView;
    }

    @PostMapping("/rentBook/{random}")
    public ModelAndView rentBook(@ModelAttribute Book book, @PathVariable int random) throws RentBookException {
        if(service.rentBook(book)) {
            bookMap.put(random, book);
            System.out.println(random);
            return new ModelAndView("list","books",service. getAllBooks());
        }
        throw new RentBookException() ;
    }

    @AfterThrowing(pointcut = "execution(public * com.example.demo.controller.controller.rentBook()),")
    public void writeLog() {
        System.out.println("Hello");
    }

    @ExceptionHandler(RentBookException.class)
    public ModelAndView showInputNotAcceptable() {
        return new ModelAndView("error");
    }
    @GetMapping("/give_book_back")
    public ModelAndView viewGiveBookBack() {
        return new ModelAndView("GiveBookBack","random", new Integer("0"));
    }

    @PostMapping("/give_book_back")
    public ModelAndView giveBookBack(@RequestParam int random) throws GiveBookBackException {
        System.out.println(random);
        if(bookMap.containsKey(random)) {
            Book book= bookMap.get(random);
            service.giveBookBack(book);
            bookMap.remove(random);
            return new ModelAndView("list","books",service.getAllBooks());
        }
        throw new GiveBookBackException();
    }
    @ExceptionHandler(GiveBookBackException.class)
    public ModelAndView showErrorGiveBookBack() {
        return new ModelAndView("errorGiveBookBack");
    }

}
