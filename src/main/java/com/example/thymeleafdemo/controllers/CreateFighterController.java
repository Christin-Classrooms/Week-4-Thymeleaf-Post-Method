package com.example.thymeleafdemo.controllers;

import com.example.thymeleafdemo.model.Fighter;
import com.example.thymeleafdemo.repository.FighterRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateFighterController {

    @Autowired
    private FighterRepository fighterRepository;

    // Show the fighter registration form
    @GetMapping("/create-fighter")
    public String showCreateFighterForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "create-fighter"; // Thymeleaf template file: create-fighter.html
    }

    // Handle form submission
    @PostMapping("/create-fighter")
    public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter,
                                BindingResult bindingResult,
                                Model model) {

        // Check for validation errors
        if (bindingResult.hasErrors()) {
            return "create-fighter"; // return form with errors
        }

        // Add fighter to the repository
        fighterRepository.addFighter(fighter);

        // Redirect to list of fighters after successful submission
        return "redirect:/fighters";
    }
}
