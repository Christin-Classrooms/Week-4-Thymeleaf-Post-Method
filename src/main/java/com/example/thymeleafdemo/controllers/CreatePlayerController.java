package com.example.thymeleafdemo.controllers;

import com.example.thymeleafdemo.model.Player;
import com.example.thymeleafdemo.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreatePlayerController {

    private final PlayerService playerService;

    // Constructor injection for PlayerService
    public CreatePlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    // Show the create player form
    @GetMapping("/create-player")
    public String showCreatePlayerForm(Model model) {
        model.addAttribute("player", new Player());
        return "create-player";  // Thymeleaf template: create-player.html
    }

    // Handle form submission
    @PostMapping("/create-player")
    public String createPlayer(@Valid Player player, BindingResult result) {
        if (result.hasErrors()) {
            // Return the form with validation errors
            return "create-player";
        }

        // Add the player to the service/repository
        playerService.addPlayer(player);

        // Redirect to players list after successful submission
        return "redirect:/players";
    }
}
