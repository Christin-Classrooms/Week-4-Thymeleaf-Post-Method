package com.example.Thymeleaf.Demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FighterController {

    private final CreateFighterController createFighterController;

    public FighterController(CreateFighterController createFighterController) {
        this.createFighterController = createFighterController;
    }

    @GetMapping("/fighters")
    public String showFighters(Model model) {
        model.addAttribute("fighters", createFighterController.getFighterList());
        return "fighters";
    }
}
