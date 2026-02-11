package com.example.Thymeleaf.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.Thymeleaf.Demo.Model.Fighter;

public class FighterService {

    private final List<Fighter> fighters = new ArrayList<>();
    private int nextId = 1;

    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }

    public List<Fighter> getAllFighters() {
        return fighters;
    }

    public int totalFighters() {
        return fighters.size();
    }
    
}
