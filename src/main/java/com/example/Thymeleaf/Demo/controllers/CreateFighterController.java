package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class CreateFighterController {

    @Autowired
    private FighterService fighterService;

    @GetMapping("/createfighter")
    public String showForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "CreateFighter";
    }

    @PostMapping("/createfighter")
    public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter,
                                BindingResult result) {

        if (result.hasErrors()) {
            return "CreateFighter";
        }

        fighterService.addFighter(fighter);
        return "redirect:/fighters";
    }
}