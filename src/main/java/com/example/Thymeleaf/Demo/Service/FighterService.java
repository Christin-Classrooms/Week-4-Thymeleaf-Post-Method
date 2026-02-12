package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterService {

    private List<Fighter> fighters;
    private static int nextId = 6;

    public FighterService() {
        fighters = new ArrayList<>();
        fighters.add(new Fighter(1, "Jin Kazama", 1200, 85.0, 7.5));
        fighters.add(new Fighter(2, "Kazuya Mishima", 1300, 90.0, 6.0));
        fighters.add(new Fighter(3, "Paul Phoenix", 1100, 95.0, 5.5));
        fighters.add(new Fighter(4, "Law", 1250, 88.0, 8.0));
        fighters.add(new Fighter(5, "King", 1400, 92.0, 9.0));
    }

    public List<Fighter> getAllFighters() {
        return fighters;
    }

    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }
}

