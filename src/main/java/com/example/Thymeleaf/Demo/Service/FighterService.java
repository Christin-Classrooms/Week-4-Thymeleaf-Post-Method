package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterService {

    private static final List<Fighter> fighters = new ArrayList<>();
    private static int nextId = 1;

    public FighterService() {
        // Initialize with some sample fighters
        fighters.add(new Fighter(nextId++, "Kazuya", 1200, 85, 7.5));
        fighters.add(new Fighter(nextId++, "Jin", 1150, 75, 6.0));
        fighters.add(new Fighter(nextId++, "Hwoarang", 1100, 90, 5.5));
    }

    public List<Fighter> getAllFighters() {
        return new ArrayList<>(fighters);
    }

    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }

}
