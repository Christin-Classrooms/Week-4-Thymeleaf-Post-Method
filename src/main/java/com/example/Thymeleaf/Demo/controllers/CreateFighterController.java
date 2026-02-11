package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CreateFighterController {
    
    // Store fighters in a list (similar to Player example)
    private List<Fighter> fighterPool = new ArrayList<>();
    private static int nextId = 1;
    
    // GET: Show fighter registration form
    @GetMapping("/fighter/create")
    public String showCreateForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "CreateFighter";
    }
    
    // POST: Process form submission with validation
    @PostMapping("/fighter/create")
    public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter, 
                              BindingResult bindingResult, 
                              Model model) {
        
        if (bindingResult.hasErrors()) {
            // Return to form with error messages
            return "CreateFighter";
        }
        
        // Add ID and save fighter
        fighter.setId(nextId++);
        fighterPool.add(fighter);
        
        // Redirect to fighter list page
        return "redirect:/fighter/list";
    }
    
    // GET: Show all fighters
    @GetMapping("/fighter/list")
    public String listFighters(Model model) {
        model.addAttribute("fighters", fighterPool);
        return "FighterList";
    }
}
