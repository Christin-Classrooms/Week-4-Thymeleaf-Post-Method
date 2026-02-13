package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;

import jakarta.validation.Valid;

// HANDLES FIGHTER REGISTRATION FORM AND SUBMISSION
@Controller
public class CreateFighterController {

    private final FighterService fighterService;

    public CreateFighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    // SHOW THE EMPTY FIGHTER REGISTRATION FORM
    @GetMapping("/create-fighter")
    public String showCreateFighterForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "CreateFighter";
    }

    // PROCESS THE FORM SUBMISSION
    @PostMapping("/create-fighter")
    public String createFighter(@Valid Fighter fighter, BindingResult result) {
        // IF VALIDATION FAILS, RE-SHOW THE FORM WITH ERRORS
        if (result.hasErrors()) {
            return "CreateFighter";
        }
        // ADD FIGHTER TO THE POOL AND REDIRECT
        fighterService.addFighter(fighter);
        return "redirect:/fighters";
    }
}
