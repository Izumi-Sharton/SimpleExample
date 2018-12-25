package com.example.simpleex.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    public String main(String name, Model model){
        model.addAttribute("name", name);
        return "/main";
    }
}
