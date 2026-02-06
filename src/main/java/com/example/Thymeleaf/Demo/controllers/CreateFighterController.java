package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class CreateFighterController {

    @GetMapping("/fighters/new")
    public String showCreateFighterForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "CreateFighter";
    }

    @PostMapping("/fighters/new")
    public String createFighter(
            @Valid @ModelAttribute("fighter") Fighter fighter,
            BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {
            return "CreateFighter";
        }

        FighterService.addFighter(fighter);
        return "redirect:/fighters";
    }
}
