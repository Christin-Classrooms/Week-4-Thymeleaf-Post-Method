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
public class CreateFighterController {

    private final List<Fighter> fighterPool = new ArrayList<>();
    private int nextId = 1;

    @GetMapping("/fighters/new")
    public String showCreateForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "create-fighter";
    }

    @PostMapping("/fighters")
    public String createFighter(
            @Valid @ModelAttribute("fighter") Fighter fighter,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "create-fighter";
        }

        fighter.setId(nextId++);
        fighterPool.add(fighter);

        model.addAttribute("fighters", fighterPool);
        return "fighters";
    }
}
