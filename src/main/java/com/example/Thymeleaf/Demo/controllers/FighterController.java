package com.example.Thymeleaf.Demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FighterController {

    // Show all fighters in table
    @GetMapping("/fighters/list")
    public String listFighters(Model model) {
        model.addAttribute("fighters", CreateFighterController.getFighterPool());
        return "fighters"; // HTML template
    }
}