package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/About")
    public String getAboutPage(Model model){

        model.addAttribute("message", "Welcome to the about page");
        return "About";
    }
}
