package com.example.Thymeleaf.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;

@Service
public class FighterService {

    private final List<Fighter> fighters;
    private static int nextId = 4;

    public FighterService() {
        fighters = new ArrayList<>();
    }

    public List<Fighter> getAllFighters() {
        return fighters;
    }

    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }
}
