package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FighterController {

    private final FighterService fighterService;

    public FighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @GetMapping("/fighters")
    public String fighters(Model model) {
        model.addAttribute("fighters", fighterService.getFighters());
        return "fighters";
    }

    
    @GetMapping("/fighters/create")
    public String showCreateForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "CreateFighter";
    }

    @PostMapping("/fighters/create")
    public String createFighter(
            @Valid @ModelAttribute("fighter") Fighter fighter,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "CreateFighter";
        }

        fighterService.addFighter(fighter);
        return "redirect:/fighters";
    }
}
