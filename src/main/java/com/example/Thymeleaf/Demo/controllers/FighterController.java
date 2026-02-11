package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Thymeleaf.Demo.Service.FighterService;

@Controller
public class FighterController {
    
    private final FighterService fighterService;
    
    public FighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }
    
    @GetMapping("/fighters")
    public String showFighters(Model model) {
        model.addAttribute("fighters", fighterService.getAllFighters());
        return "fighters"; // Create this HTML file
    }
}