package com.example.Thymeleaf.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;

// FIGHTER SERVICE - MANAGES THE IN-MEMORY FIGHTER POOL
@Service
public class FighterService {

    private List<Fighter> fighters;
    private static int nextId = 4;

    // SEED SOME DEFAULT FIGHTERS
    public FighterService() {
        fighters = new ArrayList<>();
        fighters.add(new Fighter(1, "Jasmine Plazma", 1000, 99.0, 8.0));
        fighters.add(new Fighter(2, "Nourricane", 1200, 80.0, 7.0));
        fighters.add(new Fighter(3, "Sleepy Claw", 1000, 50.0, 2.5));
        fighters.add(new Fighter(3, "Crankenstein", 1500, 100.0, 10.0));
    }

    // RETURN ALL FIGHTERS
    public List<Fighter> getAllFighters() {
        return fighters;
    }

    // ADD A NEW FIGHTER TO THE POOL
    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }
}
