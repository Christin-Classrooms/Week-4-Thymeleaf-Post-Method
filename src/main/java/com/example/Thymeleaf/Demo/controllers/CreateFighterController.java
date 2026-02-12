package com.example.Thymeleaf.Demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.Service.FighterService;

import jakarta.validation.Valid;



@Controller
public class CreateFighterController {

    private final FighterService fservice;

    public CreateFighterController(FighterService fservice){
        this.fservice = fservice;

    }

  @GetMapping("/create-fighter")
  public String showFighterForm(Model model){
    model.addAttribute("fighter", new Fighter());  
    return "CreateFighter";
  }

  @PostMapping("/create-fighter")
  public String submitFighter(@Valid @ModelAttribute("fighter") Fighter fighter, BindingResult result){

    if(result.hasErrors()) {
      return "CreateFighter";
    }
    
    fservice.addFighter(fighter);
    return "redirect:/fighters";
  }
  


}
