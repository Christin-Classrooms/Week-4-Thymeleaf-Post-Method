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

    private List<Fighter> fighterPool = new ArrayList<>();

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "createFighter";
    }

    @PostMapping("/create")
    public String createFighter(
            @Valid @ModelAttribute("fighter") Fighter fighter,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "createFighter";
        }

        fighter.setId(fighterPool.size() + 1);

        fighterPool.add(fighter);
        return "redirect:/fighters/list";
    }

    @GetMapping("/list")
    public String listFighters(Model model) {
        model.addAttribute("fighters", fighterPool);
        return "fighterList";
    }
}
