package com.example.Thymeleaf.Demo.controllers;


import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;


@Controller
@RequestMapping("/fighters")
public class CreateFighterController {

    private final FighterService fighterService;

    public CreateFighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @GetMapping("/create")
    public String showForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "createFighter";
    }

    @PostMapping("/create")
    public String createFighter(
            @Valid @ModelAttribute("fighter") Fighter fighter,
            BindingResult result) {

        if (result.hasErrors()) {
            return "createFighter";
        }

        fighterService.addFighter(fighter);
        return "redirect:/fighters/list";
    }
}
