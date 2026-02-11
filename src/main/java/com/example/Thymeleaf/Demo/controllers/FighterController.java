package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Service.FighterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fighters")
public class FighterController {
    
    private final FighterService fighterService;
    
    public FighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }
    
    @GetMapping
    public String listFighters(Model model) {
        model.addAttribute("fighters", fighterService.getAllFighters());
        return "fighters";
    }
}