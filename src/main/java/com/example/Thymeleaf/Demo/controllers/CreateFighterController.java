package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* i just tried to basically remake the fighters files by using the players file as a reference.
*/

@Controller
@RequestMapping("/fighters")
public class CreateFighterController {
    
    private final FighterService fighterService;
    
    public CreateFighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "CreateFighter";
    }
    
    @PostMapping("/register")
    public String createFighter(@Valid Fighter fighter, BindingResult result) {
        if (result.hasErrors()) {
            return "CreateFighter";
        }
        
        fighterService.addFighter(fighter);
        return "redirect:/fighters";
    }
}