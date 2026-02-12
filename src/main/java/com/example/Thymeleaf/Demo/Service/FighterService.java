package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterService {

    private List<Fighter> fighters;
    private static int nextId = 3;

    public FighterService() {
        fighters = new ArrayList<>();

        fighters.add(new Fighter(1, "Thor", 1200, 90, 5.5));
        fighters.add(new Fighter(2, "Hulk", 1400, 95, 8.0));
    }

    public List<Fighter> getAllFighters() {
        return fighters;
    }

    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }
}
