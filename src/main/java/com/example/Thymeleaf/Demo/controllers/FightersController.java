/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// FightersController handles displaying registered fighters
@Controller
public class FightersController {

    // GET /fighters gets all fighters and passes them to the template
    @GetMapping("/fighters")
    public String getFighters(Model model) {
        List<Fighter> fighters = CreateFighterController.getFighterPool();

        model.addAttribute("fighters", fighters);
        model.addAttribute("total", fighters.size());
        
        return "fighters";
    }

}
