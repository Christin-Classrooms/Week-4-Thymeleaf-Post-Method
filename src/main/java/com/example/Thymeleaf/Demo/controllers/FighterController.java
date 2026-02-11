package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Data.FighterPool;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FighterController {

    @GetMapping("/fighters")
    public String showFighters(Model model) {
        model.addAttribute("fighters", FighterPool.fighters);
        return "fighters";
    }
}
