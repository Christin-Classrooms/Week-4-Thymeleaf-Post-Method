package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterService {

    private List<Fighter> fighters;
    private static int nextId = 1;

    public FighterService() {
        fighters = new ArrayList<>();
        fighters.add(new Fighter(nextId++, "Ryu", 1200, 50.0, 5.0));
        fighters.add(new Fighter(nextId++, "Ken", 1100, 60.0, 4.0));
    }

    public List<Fighter> getAllFighters() {
        return fighters;
    }

    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }
}