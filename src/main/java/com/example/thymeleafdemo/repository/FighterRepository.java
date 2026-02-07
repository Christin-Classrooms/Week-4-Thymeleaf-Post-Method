package com.example.thymeleafdemo.repository;

import com.example.thymeleafdemo.model.Fighter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FighterRepository {

    private List<Fighter> fighters = new ArrayList<>();
    private int nextId = 1;

    // Add fighter to list
    public Fighter addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
        return fighter;
    }

    // Get all fighters
    public List<Fighter> getAllFighters() {
        return fighters;
    }

    // Optional: clear all fighters (for testing)
    public void clear() {
        fighters.clear();
        nextId = 1;
    }
}
