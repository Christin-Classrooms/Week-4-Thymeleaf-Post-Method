package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterService {

    private List<Fighter> fighters;
    private static int nextId = 5;
    public FighterService() {
        fighters = new ArrayList<>();
        fighters.add(new Fighter(1, "Jin Kazama", 1250, 50.00, 5.00));
        fighters.add(new Fighter(2, "Kazuya Mishima", 1350, 60.00, 4.00));
        fighters.add(new Fighter(3, "Heihachi Mishima", 1450, 40.00, 6.00));
        fighters.add(new Fighter(4, "Reina", 1050, 70.00, 5.00));
    }

    public List<Fighter> getFighters() {
        return fighters;
    }

    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }
}
