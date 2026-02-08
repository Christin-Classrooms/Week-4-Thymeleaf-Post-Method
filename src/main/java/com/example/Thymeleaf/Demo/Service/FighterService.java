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
        fighters.add(new Fighter(1, "Fighter1", 1000,10.10,5.5));
        fighters.add(new Fighter(2, "Fighter2", 1000,10.10,5.5));
        fighters.add(new Fighter(3, "Fighter3", 1000,10.10,5.5));
        fighters.add(new Fighter(4, "Fighter4", 1000,10.10,5.5));
        fighters.add(new Fighter(5, "Fighter5", 1000,10.10,5.5));

    }

    public List<Fighter> getAllFighters() {

        return fighters;
    }


    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }
}
