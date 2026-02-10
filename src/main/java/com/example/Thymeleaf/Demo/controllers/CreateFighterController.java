package com.example.Thymeleaf.Demo.Controller;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CreateFighterController {

    private List<Fighter> fighterList = new ArrayList<>();

    @GetMapping("/createfighter")
    public String showForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "createfighter";
    }

    @PostMapping("/createfighter")
    public String createFighter(@Valid @ModelAttribute("fighter") Fighter fighter,
                                BindingResult result,
                                Model model) {

        if (result.hasErrors()) {
            return "createfighter";
        }

        fighterList.add(fighter);
        model.addAttribute("fighters", fighterList);

        return "redirect:/fighters";
    }

    public List<Fighter> getFighterList() {
        return fighterList;
    }
}
