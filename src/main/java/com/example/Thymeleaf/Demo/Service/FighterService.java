package com.example.Thymeleaf.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;

@Service
public class FighterService {
    private List<Fighter> fighters;
    private static int nextId = 6;

    public FighterService() {
        fighters = new ArrayList<>();
        fighters.add(new Fighter(1, "Fighter1", 1010, 50.0, 5.0));
        fighters.add(new Fighter(2, "Fighter2", 1010, 50.0, 5.0));
        fighters.add(new Fighter(3, "Fighter3", 1010, 50.0, 5.0));
        fighters.add(new Fighter(4, "Fighter4", 1010, 50.0, 5.0));
        fighters.add(new Fighter(5, "Fighter5", 1010, 50.0, 5.0));
        
    }

    public List<Fighter> getAllFighters(){
        return fighters;
    }

    public void addFighter(Fighter fighter){
        fighter.setId(nextId ++);
        fighters.add(fighter);
    }

}
