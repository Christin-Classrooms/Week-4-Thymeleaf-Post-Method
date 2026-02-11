package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterService {

    private List<Fighter> fighters;   
    private static int id = 1;
    public FighterService() {
        fighters = new ArrayList<>();
        
    }

    public List<Fighter> getAllFighter() {
        return fighters;
    }

     public void addPlayer(Fighter fighter) {
        fighter.setId(id++);
        fighters.add(fighter);
    }

}
