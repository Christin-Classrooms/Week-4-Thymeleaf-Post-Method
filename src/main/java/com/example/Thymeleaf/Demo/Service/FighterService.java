package com.example.Thymeleaf.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;

@Service
public class FighterService {

    private List<Fighter> fighters;
    private static int nextId = 1;

    public FighterService() {
        fighters = new ArrayList<>();
        fighters.add(new Fighter(nextId++, "God-King Darius", 100, 85.5, 5.0));
        fighters.add(new Fighter(nextId++, "Draven Draven", 900, 95.0, 2.0));
    }

    public List<Fighter> getAllFighters() {
        return fighters;
    }

    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }
}