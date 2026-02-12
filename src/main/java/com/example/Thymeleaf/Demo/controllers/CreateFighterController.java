package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;

import jakarta.validation.Valid;

@Controller
public class CreateFighterController {

    private final FighterService fighterService;

    public CreateFighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @GetMapping("/fighters/create")
    public String showForm(@ModelAttribute("fighter") Fighter fighter) {
        return "createFighter";
    }

    @PostMapping("/fighters/create")
    public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "createFighter";
        }

        fighterService.addFighter(fighter);
        return "redirect:/fighters";
    }
}
