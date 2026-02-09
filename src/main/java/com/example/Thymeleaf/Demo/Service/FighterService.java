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

    fighters.add(new Fighter(1, "Fighter1", 1200, 50.0, 5.0));
    fighters.add(new Fighter(2, "Fighter2", 1300, 60.5, 7.5));
    fighters.add(new Fighter(3, "Fighter3", 1100, 45.0, 3.0));
    fighters.add(new Fighter(4, "Fighter4", 1400, 80.0, 9.0));
    fighters.add(new Fighter(5, "Fighter5", 1250, 55.0, 6.0));
    }

    public List<Fighter> getAllFighters() {
        return fighters;
    }

     public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }

}
