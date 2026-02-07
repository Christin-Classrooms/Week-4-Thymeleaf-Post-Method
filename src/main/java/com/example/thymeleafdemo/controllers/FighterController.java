package com.example.thymeleafdemo.controllers;

import com.example.thymeleafdemo.model.Fighter;
import com.example.thymeleafdemo.repository.FighterRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FighterController {

    private final FighterRepository fighterRepository;

    public FighterController(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }

    @GetMapping("/fighters")
    public String getFighters(Model model) {
        List<Fighter> fighters = fighterRepository.getAllFighters();
        model.addAttribute("fighters", fighters);

        // Compute total fighters
        model.addAttribute("total", fighters.size());

        return "fighters";  // template name must match fighters.html (lowercase)
    }
}
