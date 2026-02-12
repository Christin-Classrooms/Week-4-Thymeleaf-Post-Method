package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;

import org.springframework.ui.Model;
import jakarta.validation.Valid;

@Controller
public class CreateFighterController {

     private final FighterService fighterService;

    public CreateFighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }
    @GetMapping("/Register_Fighters")
    public String showFighterForm(Model model){
        model.addAttribute("fighter", new Fighter());
        return "RegisteredFighter";
    }

    @PostMapping("/Register_Fighters")
    public String createrFighter(@Valid @ModelAttribute("fighter") Fighter fighter, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "RegisteredFighter";
        }
        fighterService.add(fighter);
        

        return"redirect:/Fighters";
    }
    
}
