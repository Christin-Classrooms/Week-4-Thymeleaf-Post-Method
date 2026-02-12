/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

// CreateFighterController handles fighter registration GET and POST requests
@Controller
public class CreateFighterController {
    
    // Static list used to store fighters during the application session 
    private static List<Fighter> fighterPool = new ArrayList<>();

    // GET /create-fighter displays the fighter registration form and binds an empty Fighter
    @GetMapping("/create-fighter")
    public String showCreateFighterForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "createFighter";
    }

    // POST /create-fighter validates and saves a new fighter, redisplays form on errors
    @PostMapping("/create-fighter")
    public String createFighter(@Valid Fighter fighter, BindingResult result) {
        // Check if there are any errors
        if (result.hasErrors()) {
            return "createFighter";
        }

        // Validation passed -> add fighter to the pool
        fighter.setId(fighterPool.size() + 1); 
        fighterPool.add(fighter);

        // Redirect to /fighters to display the list of all fighters        
        return "redirect:/fighters";
    }

    // Returns the list of all registered fighters for other controllers
    public static List<Fighter> getFighterPool() {
        return fighterPool;
    }

}
