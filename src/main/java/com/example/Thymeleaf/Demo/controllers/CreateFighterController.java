// Name: Fahad Arif (N01729165)
// Course: Web Application Development (CPAN-228)

package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;

import jakarta.validation.Valid;

@Controller
public class CreateFighterController {
    private final FighterService fighterService;

    public CreateFighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    // This is for showing the form
    @GetMapping("/fighters/create")
    public String showCreateFighterForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "CreateFighter";
    }

    // This handles the form submission and validation
    @PostMapping("/fighters/create")
    public String createFighter(
            @Valid @ModelAttribute("fighter") Fighter fighter,
            BindingResult bindingResult,
            Model model
    ) 
    {
        if (bindingResult.hasErrors()) {
            return "CreateFighter";
        }

        fighterService.addNewFighter(fighter);
        return "redirect:/fighters";
    }
}