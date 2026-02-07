package com.example.thymeleafdemo.controllers;

import com.example.thymeleafdemo.model.Player;
import com.example.thymeleafdemo.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlayersController {

    private final PlayerService playerService;

    public PlayersController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public String getPlayers(Model model){
        List<Player> players = playerService.getAllPlayers();

        model.addAttribute("players", players);
        model.addAttribute("total", players.size());
        return "players"; // Thymeleaf template file: players.html
    }
}
