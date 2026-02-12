package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FighterController {

    public static List<Fighter> fighterPool = new ArrayList<>();

    @GetMapping("/fighters")
    public String showFighters(Model model) {
        model.addAttribute("fighters", fighterPool);
        model.addAttribute("total", fighterPool.size()); // total number of fighters
        return "Fighters";
    }
}
