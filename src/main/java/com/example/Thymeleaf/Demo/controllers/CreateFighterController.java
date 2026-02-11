package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateFighterController {

    @GetMapping("/create")
public String showForm(Model model) {
    model.addAttribute("fighter", new Fighter());
    return "createFighter";
}

@PostMapping("/create")
public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter, 
                            BindingResult result) {
    if (result.hasErrors()) {
        return "createFighter";
    }
    FighterController.getFighterPool().add(fighter);
    return "redirect:/fighters";
}
}