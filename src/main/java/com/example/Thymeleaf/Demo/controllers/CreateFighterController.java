package com.example.Thymeleaf.Demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Thymeleaf.Demo.Model.Fighter;

import jakarta.validation.Valid;

@Controller
public class CreateFighterController {

    private static final List<Fighter> fighterPool = new ArrayList<>();

    @GetMapping("/create-fighter")
    public String showForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "CreateFighter";
    }

    @PostMapping("/create-fighter")
    public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter, BindingResult result) {
        if (result.hasErrors()) {
            return "CreateFighter";
        }

        fighterPool.add(fighter);
        return "redirect:/fighters";
    }

    public static List<Fighter> getFighterPool() {
        return fighterPool;
    }
}