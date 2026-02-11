package com.example.Thymeleaf.Demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;

import jakarta.validation.Valid;

@Controller
public class CreateFighterController {
    
    @Autowired
    private FighterService fighterService;
    
    @GetMapping("/createFighter")
    public String showCreateForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "createFighter";
    }
    
    @PostMapping("/createFighter")
    public String createFighter(@Valid Fighter fighter, 
                              BindingResult result, 
                              RedirectAttributes redirectAttributes) {
        
        if (result.hasErrors()) {
            // Return to form with validation errors
            return "createFighter";
        }
        
        // Add to fighter pool
        fighterService.addFighter(fighter);
        redirectAttributes.addFlashAttribute("message", 
            "Fighter " + fighter.getName() + " created successfully!");
        
        return "redirect:/fighters";
    }
}

