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
@RequestMapping("/fighters")
public class CreateFighterController {

    // Static list shared across all requests
    private static List<Fighter> fighterPool = new ArrayList<>();

    // Show the fighter registration form
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "createFighter"; // HTML template
    }

    // Handle form submission
    @PostMapping("/create")
    public String createFighter(
            @Valid @ModelAttribute("fighter") Fighter fighter,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "createFighter"; 
        }

        fighterPool.add(fighter); 
        return "redirect:/fighters/list"; 
    }

    // Getter for the static list
    public static List<Fighter> getFighterPool() {
        return fighterPool;
    }
}
