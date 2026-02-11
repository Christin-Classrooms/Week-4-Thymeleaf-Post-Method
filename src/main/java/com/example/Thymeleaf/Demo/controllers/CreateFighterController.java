package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Data.FighterPool;
import com.example.Thymeleaf.Demo.Model.Fighter;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class CreateFighterController {

    @GetMapping("/fighters/create")
    public String showCreateForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "create-fighter";
    }

    @PostMapping("/fighters/create")
    public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter,
                                BindingResult result,
                                RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            return "create-fighter";
        }

        FighterPool.fighters.add(fighter);

        redirectAttributes.addFlashAttribute("successMessage",
                "Fighter registered successfully!");
        return "redirect:/fighters";
    }

}
