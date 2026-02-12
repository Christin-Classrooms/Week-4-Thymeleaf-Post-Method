package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FighterController {

    @GetMapping("/fighters")
    public String listFighters(Model model) {
        model.addAttribute("fighters", CreateFighterController.getFighterPool());
        return "Fighters";
    }
}