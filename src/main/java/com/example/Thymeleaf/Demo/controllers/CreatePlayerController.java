package com.example.Thymeleaf.Demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Thymeleaf.Demo.Model.Player;
import com.example.Thymeleaf.Demo.Service.PlayerService;

import jakarta.validation.Valid;

@Controller
public class CreatePlayerController {
    private final PlayerService playerService;

    public CreatePlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/create-player")
    public String showCreatePlayerForm(Model model ){

        model.addAttribute("player",   new Player());
        return "CreatePlayer";

    }


    @PostMapping("/create-player")
    public String createPlayer(@Valid Player player, BindingResult result){

        if(result.hasErrors()){
            return "CreatePlayer";
        }

        playerService.addPlayer(player);
        return "redirect:/players";
    }








}
