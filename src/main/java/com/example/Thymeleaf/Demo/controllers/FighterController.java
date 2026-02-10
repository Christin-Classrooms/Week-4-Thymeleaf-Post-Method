package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FighterController {
    private final FighterService fighterService;

    public FighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @GetMapping("/roster")
    public String showFighterPool(Model model) {
        model.addAttribute("fighters", fighterService.getFighterPool());
        return "roster";
    }

    @GetMapping("/fighter-creation")
    public String creationForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "CreateFighter";
    }

    @PostMapping("/fighter-creation")
    public String createFighter(@Valid Fighter fighter, BindingResult creation) {
        if (creation.hasErrors()) {
            return "CreateFighter";
        }

        fighterService.addFighter(fighter);
        return "redirect:/roster";
    }
}
