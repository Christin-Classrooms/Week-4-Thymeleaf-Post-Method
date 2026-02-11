package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FighterController {

    @GetMapping("/fighters")
    public String listFighters(Model model) {
        // This adds the list of fighters from the CreateFighterController to the model
        model.addAttribute("fighters", CreateFighterController.fighterPool);
        
        // This tells Spring to look for a file named fighters.html
        return "fighters";
    }
}