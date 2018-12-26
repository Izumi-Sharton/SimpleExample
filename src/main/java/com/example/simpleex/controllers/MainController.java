package com.example.simpleex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String greet(Model model){ return "/greet"; }

    @GetMapping("/main")
    public String main(Model model){
        return "/main";
    }

}
