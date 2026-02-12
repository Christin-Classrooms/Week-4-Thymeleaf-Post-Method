package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Service.FighterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FightersController {

    private final FighterService fighterService;

    public FightersController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @GetMapping("/fighters")
    public String fighters(Model model) {
        var fighters = fighterService.getAllFighters();
        model.addAttribute("fighters", fighters);
        model.addAttribute("total", fighters.size());
        return "Fighters";
    }
}
