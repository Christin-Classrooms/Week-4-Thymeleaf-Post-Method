package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.data.FighterRepository;
import com.example.thymeleafdemo.model.Fighter;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/fighters/create")
public class CreateFighterController {

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "create-fighter";
    }

    @PostMapping
    public String createFighter(
            @Valid @ModelAttribute("fighter") Fighter fighter,
            BindingResult result
    ) {

        if (result.hasErrors()) {
            return "create-fighter";
        }

        FighterRepository.addFighter(fighter);
        return "redirect:/fighters";
    }
}
