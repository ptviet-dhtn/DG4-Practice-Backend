package com.example.tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepage {
    @GetMapping("/home")
    public String homeController(){
        return "Home";
    }
}
