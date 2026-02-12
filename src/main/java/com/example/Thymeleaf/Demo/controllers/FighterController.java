package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Thymeleaf.Demo.Service.FighterService;

@Controller
public class FighterController {
    
    private final FighterService fservice;

    public FighterController(FighterService fservice){
        this.fservice = fservice;
    }

    @GetMapping("/fighters")
    public String showFighters(Model model){
        model.addAttribute("fighters", fservice.getAllFighters());
        return "Fighters";
    }

}
