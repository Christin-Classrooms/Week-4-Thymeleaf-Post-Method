package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CreateFighterController {

    // This list acts as the "fighter pool" mentioned in your lab 
    public static List<Fighter> fighterPool = new ArrayList<>();

    // 1. Method to show the registration form
    @GetMapping("/create-fighter")
    public String showForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "createFighter";
    }

    // 2. POST method to process the registration and handle validation [cite: 18, 21]
    @PostMapping("/create-fighter")
    public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter, 
                                BindingResult result) {
        
        // Check if there are validation errors (like health being too low) [cite: 22, 32]
        if (result.hasErrors()) {
            return "createFighter"; // Returns the user to the form to fix errors [cite: 32]
        }
        
        // If valid, add to the list and redirect [cite: 23, 24]
        fighterPool.add(fighter);
        return "redirect:/fighters";
    }
}