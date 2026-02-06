package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Service.FighterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FighterController {

    @GetMapping("/fighters")
    public String showFighters(Model model) {
        model.addAttribute("fighters", FighterService.getFighters());
        model.addAttribute("total", FighterService.getFighters().size());
        return "Fighters";
    }
}
