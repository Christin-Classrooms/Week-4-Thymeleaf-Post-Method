package com.example.Thymeleaf.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;

@Service
public class FighterService {
    private final List<Fighter> fighters;
    private static int nextId = 10;

    public FighterService() {
        fighters = new ArrayList<>();
        fighters.add(new Fighter(1, "Dragunov", 1499, 99, 5.5));
        fighters.add(new Fighter(2, "Nina", 1244, 48, 3.6));
        fighters.add(new Fighter(3, "Heihachi", 1478, 52, 5.4));
        fighters.add(new Fighter(4, "Hwoarang", 1499, 35, 4.5));
        fighters.add(new Fighter(5, "Kazuya", 1345, 78, 6.7));
        fighters.add(new Fighter(6, "Yoshimitsu", 1333, 66, 8.9));
        fighters.add(new Fighter(7, "Jun", 1200, 34, 7.6));
        fighters.add(new Fighter(8, "King", 1111, 70, 8.7));
        fighters.add(new Fighter(9, "Clive", 1455, 89, 5.1));

    }

    public List<Fighter> getAllFighters(){
        return fighters;
    }

    public void addFighter(Fighter fighter){
        fighter.setId(nextId ++);
        fighters.add(fighter);
    }

}