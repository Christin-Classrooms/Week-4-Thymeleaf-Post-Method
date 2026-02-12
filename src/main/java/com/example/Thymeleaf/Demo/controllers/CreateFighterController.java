package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateFighterController {

    private final FighterService fighterService;
    
    public CreateFighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }
    
    @GetMapping("/create-fighter")
    public String showCreateFighterForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "create-fighter";
    }
    
    @PostMapping("/create-fighter")
    public String createFighter(@Valid Fighter fighter, BindingResult result) {
        
        if (fighter.getHealth() != null) {
            if (fighter.getHealth() <= 1000 || fighter.getHealth() >= 1500) {
                result.rejectValue("health", "error.health", 
                    "Health must be more than 1000 and less than 1500");
            }
        }
        
        if (fighter.getDamage() != null) {
            if (fighter.getDamage() >= 100) {
                result.rejectValue("damage", "error.damage", 
                    "Damage must be less than 100");
            }
        }
        
        if (fighter.getResistance() != null) {
            if (fighter.getResistance() < 0 || fighter.getResistance() > 10) {
                result.rejectValue("resistance", "error.resistance", 
                    "Resistance must be between 0 and 10");
            }
        }
        
        if (result.hasErrors()) {
            return "create-fighter";
        }
        
        fighterService.addFighter(fighter);
        return "redirect:/fighters";
    }

}
