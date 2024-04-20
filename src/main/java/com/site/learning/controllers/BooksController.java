package com.site.learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {
    @GetMapping("/books")
    public String showBooks(){
        return "books";
    }
}
