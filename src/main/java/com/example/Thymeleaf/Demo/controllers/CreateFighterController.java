package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterPool;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateFighterController {

    @GetMapping("/fighters")
    public String showFighters(Model model) {
    model.addAttribute("fighters", FighterPool.fighters);
    return "fighters";
    }

    @GetMapping("/createfighter")
    public String showCreateFighterForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "createfighter";
    }

    @PostMapping("/createfighter")
    public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "createfighter";
        }

        FighterPool.fighters.add(fighter);

        return "redirect:/fighters";
    }
}
