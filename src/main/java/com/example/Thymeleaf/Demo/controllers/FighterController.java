package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FighterController {

    private static List<Fighter> fighterPool = new ArrayList<>();

    public static List<Fighter> getFighterPool() {
        return fighterPool;
    }

    @GetMapping("/fighters")
public String listFighters(Model model) {
    model.addAttribute("fighters", fighterPool);
    return "fighters";
}
}